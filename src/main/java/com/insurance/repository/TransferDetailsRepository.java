package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.TransferDetails;

@Repository
public interface TransferDetailsRepository extends CrudRepository<TransferDetails, Serializable> {
	public TransferDetails findById(Integer id);
}
