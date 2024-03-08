package com.insurance.service;

import com.insurance.model.Policy;

public interface InsuranceService {
	
	public Policy savePolicy(Policy policy);
	
	public Policy updatePolicy(Policy policy);
	
	public Policy getPolicy(Integer id);
	
	public void deletePolicy(Integer id);

}
