package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Claim;
import com.insurance.repository.ClaimRepository;
import com.insurance.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public Claim addClaim(Claim claim) {
		return claimRepository.save(claim);

	}

	@Override
	public Claim getClaimById(int id) {
		return claimRepository.findById(id).get();
	}



	@Override
	public void deleteClaim(Integer id) {
		claimRepository.deleteById(id);

	}

	@Override
	public Claim updateClaim(Claim updateClaim) {
		return claimRepository.save(updateClaim);

	}

}
