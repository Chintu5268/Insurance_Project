package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.TransferDetails;
import com.insurance.repository.TransferDetailsRepository;
import com.insurance.service.TransferDetailsService;

@Service
public class TransferDetailsServiceImpl implements TransferDetailsService {

	@Autowired
	TransferDetailsRepository transferDetailsRepository;

	@Override
	public TransferDetails saveTransferDetailsService(TransferDetails transferdetails) {
		TransferDetails transferDetails2 = transferDetailsRepository.save(transferdetails);
		return transferDetails2;
	}

	@Override
	public TransferDetails updateTransferDetailsService(TransferDetails transferdetails) {
		TransferDetails transferDetails3 = transferDetailsRepository.save(transferdetails);
		return transferDetails3;
	}

	@Override
	public TransferDetails getTransferDetailsService(Integer id) {
		TransferDetails transferDetails4 = transferDetailsRepository.findById(id);
		return transferDetails4;
	}

	@Override
	public void deleteTransferDetailsService(Integer id) {
		transferDetailsRepository.deleteById(id);
		
	}

	

}
