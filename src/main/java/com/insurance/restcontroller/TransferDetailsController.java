package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.model.TransferDetails;
import com.insurance.service.TransferDetailsService;

@RestController
public class TransferDetailsController {

	@Autowired
	private TransferDetailsService transferDetailsService;

	@PostMapping("/saveTransferDetailsService")
	public TransferDetails saveTransferDetailsService(@RequestBody TransferDetails transferdetails) {
		TransferDetails transferDetails2 = transferDetailsService.saveTransferDetailsService(transferdetails);
		return transferdetails;

	}

	@PostMapping("/updateTransferDetailsService")
	public TransferDetails updateTransferDetailsService(@RequestBody TransferDetails transferdetails) {
		TransferDetails transferDetails3 = transferDetailsService.updateTransferDetailsService(transferdetails);
		return transferDetails3;
	}

	@GetMapping("/getTransferDetailsService/{id}")
	public TransferDetails getTransferDetails(@PathVariable("id") Integer id) {
		TransferDetails transferDetails4 = transferDetailsService.getTransferDetailsService(id);
		return transferDetails4;
	}

	@DeleteMapping("deleteTransferDetailsService/{id}")

	public void deleteTransferDetailsService(@PathVariable("id") Integer id) {
		

		

	}

}
