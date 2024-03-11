package com.insurance.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.insurance.model.Claim;

public interface ClaimService {



	public Claim getClaimById(int id);

	public Claim addClaim(Claim claim);

	public Claim updateClaim( Claim updateClaim);

	void deleteClaim(Integer id);

}
