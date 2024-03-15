package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Settlement;
import com.insurance.service.SettlementService;

@RestController
public class SettlementController {
	@Autowired
	private SettlementService settlementservice;
    @PostMapping("/saveSettlement")
	public Settlement saveSettlement(@RequestBody Settlement settlement) {
		Settlement settlement5 = settlementservice.saveSettlement(settlement);
		return settlement5;
	}
   @PutMapping("/updateSettlement")
	public Settlement updateSettlement(@RequestBody Settlement settlement) {
		Settlement settlement6 = settlementservice.updateSettlement(settlement);
		return settlement6;
	}
   
  
   
   @GetMapping("/getSettlement/{id}")
	public Settlement getSettlement(@PathVariable("id") Integer id) {
    Settlement settlement7=settlementservice.getSettlement(id);
			return settlement7;
	}
   @DeleteMapping("/deleteSettlement/{id}")
	public void deleteSettlement(@PathVariable("id")   Integer id) {
	   settlementservice.deleteSettlement(id);
  
  }
}