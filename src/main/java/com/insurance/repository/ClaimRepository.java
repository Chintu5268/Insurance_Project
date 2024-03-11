package com.insurance.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Claim;

@Repository
public interface ClaimRepository extends CrudRepository<Claim,Serializable> {

	
	

	void deleteById(int id);

}
