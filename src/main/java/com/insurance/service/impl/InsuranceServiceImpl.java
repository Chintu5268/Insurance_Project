package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.exception.PolicyNotFoundException;
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


	@Override
	public Policy updatePolicy(Policy policy) {
		Policy policy3=insuranceRepository.save(policy);
		return policy3;
	}


	@Override
	public Policy getPolicy(Integer id) {
		Policy policy4=insuranceRepository.findById(id);
		if (policy4==null) {
			throw new PolicyNotFoundException("Given Id is not present into database");
			
		}
		return policy4;
	}


	@Override
	public void deletePolicy(Integer id) {
		insuranceRepository.deleteById(id);
		
	}


	

}
