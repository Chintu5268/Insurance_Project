package com.insurance.service;

import com.insurance.model.Settlement;

public interface SettlementService {

  public Settlement saveSettlement(Settlement settlement);
  public Settlement updateSettlement(Settlement settlement);
  public Settlement getSettlement(Integer id);
  public void deleteSettlement(Integer id);
}
