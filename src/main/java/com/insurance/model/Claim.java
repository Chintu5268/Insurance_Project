package com.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "claim")
public class Claim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String claimNumber;
	private String claimType;
	private String claimDiscription;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public String getClaimDiscription() {
		return claimDiscription;
	}

	public void setClaimDiscription(String claimDiscription) {
		this.claimDiscription = claimDiscription;
	}

}
