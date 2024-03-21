package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.User;
import com.insurance.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	private User user;

	public String sendMail() {
		user.setEmailAddress("mansh7744@gmail.com");
		try {
			userService.sendMail(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "premiun details has been sent successfully";
	}
}
