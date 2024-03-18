package com.insurance.config;

import org.springframework.batch.item.ItemProcessor;

import com.insurance.model.Student;

public class StudentProcessor implements ItemProcessor<Student, Student> {

	@Override
	public Student process(Student item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
