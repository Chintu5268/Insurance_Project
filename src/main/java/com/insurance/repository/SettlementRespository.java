package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Settlement;

@Repository
public interface SettlementRespository extends CrudRepository< Settlement,Serializable>{
	
	public Settlement findById(int id);

}
