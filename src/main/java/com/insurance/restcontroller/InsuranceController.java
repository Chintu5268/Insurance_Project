package com.insurance.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.model.Policy;
import com.insurance.service.ClaimService;
import com.insurance.service.InsuranceService;

@RestController
public class InsuranceController {

	@GetMapping("/getInsurance")
	public String getMessage() {
		return "Hello Sandesh";
	}
	
// =============start====================================================
	@Autowired(required = true)
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
//	
	
	
	//-======================================================================
	 @Autowired
	private ClaimService claimService;
	

	
	  @PostMapping("/addClaim")
	    public ResponseEntity<Claim> addClaim(@RequestBody Claim claim) {
	        Claim addedClaim = claimService.addClaim(claim);
	        return ResponseEntity.status(HttpStatus.CREATED).body(addedClaim);
	    }

	  @GetMapping("/getClaim/{id}")
	    public Claim getClaimById(@PathVariable("id") Integer id) {
	        Claim  claim = claimService.getClaimById(id);
			return  claim;

	       
	    }
	  
	    @PutMapping("/updateClaim")
	    public Claim updateClaim( @RequestBody  Claim updateClaim) {
	        Claim updated = claimService.updateClaim( updateClaim);      
	        return updated;
	    }
	    
	    @DeleteMapping("/deleteClaim/{id}")
	    public void deleteClaim(@PathVariable("id") Integer id) {
	    		claimService.deleteClaim(id);
	    	
	    }
	
}
