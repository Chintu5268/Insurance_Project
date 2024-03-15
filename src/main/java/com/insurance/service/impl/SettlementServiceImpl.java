package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Settlement;
import com.insurance.repository.SettlementRespository;
import com.insurance.service.SettlementService;

@Service

public class SettlementServiceImpl implements SettlementService {

	@Autowired
	private SettlementRespository settlementrespository;

	@Override
	public Settlement saveSettlement(Settlement settlement) {
		Settlement settlement1 = settlementrespository.save(settlement);

		return settlement1;
	}

	@Override
	public Settlement updateSettlement(Settlement settlement) {
		Settlement settlement2 = settlementrespository.save(settlement);

		return settlement2;
	}
	@Override
	public void deleteSettlement(Integer id) {
		settlementrespository.deleteById(id);
		
	}

	
	@Override
	public Settlement getSettlement(Integer id) {
		return settlementrespository.findById(id).get();
	}

	
}
