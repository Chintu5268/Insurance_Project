package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.insurance.model.User;

@Service
public class UserService {

	private JavaMailSender javaMailSender;

	@Autowired
	public UserService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

//design a method to send premium details via mail

	public void sendMail(User user) {

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(user.getEmailAddress());
		simpleMailMessage.setSubject("Premium deatails");
		simpleMailMessage.setText("you have received mail from Insurance details regarding premium information");
		javaMailSender.send(simpleMailMessage);
	}

}
