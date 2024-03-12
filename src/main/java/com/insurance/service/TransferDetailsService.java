package com.insurance.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.insurance.model.TransferDetails;

public interface TransferDetailsService {

	public TransferDetails saveTransferDetailsService(TransferDetails transferdetails);

	public TransferDetails updateTransferDetailsService(TransferDetails transferdetails);

	public TransferDetails getTransferDetailsService(Integer id);

	public void deleteTransferDetailsService(Integer id);

}
