package com.insurance.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.insurance.model.Student;
import com.insurance.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SpringBatchConfig {

@Autowired
	private StudentRepository studentRepository;
	@Bean
	public FlatFileItemReader<Student> reader(){
		FlatFileItemReader<Student> reader=new FlatFileItemReader<Student>();
		reader.setResource(new FileSystemResource("src/main/resources/student.csv"));
		reader.setName("csv-reader");
		reader.setLinesToSkip(1);
		reader.setLineMapper(lineMapper());
		return reader;
		
	}

	private LineMapper<Student> lineMapper() {
		// TODO Auto-generated method stub
		DefaultLineMapper<Student> lineMapper=new DefaultLineMapper<>();
		DelimitedLineTokenizer delimitedLineTokenizer= new DelimitedLineTokenizer();
		delimitedLineTokenizer.setDelimiter(",");
		delimitedLineTokenizer.setNames("id","height","weight");
		delimitedLineTokenizer.setStrict(false);
		BeanWrapperFieldSetMapper<Student> studentFiedSetMapper=new BeanWrapperFieldSetMapper<>();
		studentFiedSetMapper.setTargetType(Student.class);
		lineMapper.setLineTokenizer(delimitedLineTokenizer);
		lineMapper.setFieldSetMapper(studentFiedSetMapper);
		return lineMapper;

	}
	@Bean
	public StudentProcessor processor() {
		return new StudentProcessor();
	}
	
	public RepositoryItemWriter<Student> writer(){
		RepositoryItemWriter<Student> writer=new RepositoryItemWriter<Student>();
		writer.setRepository(studentRepository);
		writer.setMethodName("save");
		return writer;
	}
	
	@Bean
	public Step step1(JobRepository jobRepository,PlatformTransactionManager platformTransactionManager) {
		return new StepBuilder("step1", jobRepository)
				.<Student,Student>chunk(10,platformTransactionManager)
				.reader(reader())
				.processor(processor())
				.writer(writer())
				.build();
	}
	@Bean
	public Job job(JobRepository jobRepository,PlatformTransactionManager platformTransactionManager) {
		
		return new JobBuilder("importCSV",jobRepository)
				.flow(step1(jobRepository,platformTransactionManager))
				.end().build();
	}
}
