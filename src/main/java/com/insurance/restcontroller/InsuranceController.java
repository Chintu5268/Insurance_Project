package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.service.InsuranceService;

@RestController
public class InsuranceController {

	@GetMapping("/getInsurance")
	public String getMessage() {
		return "Hello Sandesh";
	}

	@Autowired
	private InsuranceService insuranceService;

	@PostMapping("/savePolicy")
	public Policy savePolicy(@RequestBody Policy policy) {
		Policy policy2 = insuranceService.savePolicy(policy);
		return policy2;
	}
}
