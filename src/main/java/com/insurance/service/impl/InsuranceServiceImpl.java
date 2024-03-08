package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.InsuranceRepository;
import com.insurance.service.InsuranceService;
@Service
public class InsuranceServiceImpl implements InsuranceService {
	
	@Autowired
	private InsuranceRepository insuranceRepository;
	

	@Override
	public Policy savePolicy(Policy policy) {
		Policy policy2=insuranceRepository.save(policy);
		return policy2;
	}

}
