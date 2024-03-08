package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	/*
	 * Design Restful web service to add,update,get and delete operation for policy
	 * details
	 */
	@PostMapping("/savePolicy")
	public Policy savePolicy(@RequestBody Policy policy) {
		Policy policy2 = insuranceService.savePolicy(policy);
		return policy2;
	}

	@PostMapping("/updatePolicy")
	public Policy updatePolicy(@RequestBody Policy policy) {
		Policy policy3 = insuranceService.updatePolicy(policy);
		return policy3;
	}
	
	@GetMapping("/getPolicy/{id}")
	public Policy getPolicy(@PathVariable("id") Integer id) {
		Policy policyy=insuranceService.getPolicy(id);
		return policyy;
	}
	
	@DeleteMapping("deletePolicy/{id}")
	public void deletePolicy(@PathVariable("id") Integer id) {
		insuranceService.deletePolicy(id);
		
	}
	
}
