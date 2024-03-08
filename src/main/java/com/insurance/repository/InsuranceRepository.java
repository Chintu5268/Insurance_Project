package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Policy;
@Repository
public interface InsuranceRepository extends CrudRepository<Policy,Serializable> {

	public Policy findById(Integer id);
	
	
}
