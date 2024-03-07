package com.insurance.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {
	
@GetMapping("/getInsurance")
	public String getMessage() {
		return "Hello Welcome";
	}
}
