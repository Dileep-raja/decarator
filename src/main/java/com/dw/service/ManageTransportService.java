package com.dw.service;

import java.util.UUID;

import com.dw.dto.Receipt;
import com.dw.dto.ServiceRequest;

public class ManageTransportService implements CargoService {
	public Receipt estimate(ServiceRequest sRequest) {
		Receipt receipt = null;

		receipt = new Receipt();
		receipt.setReceiptNo(UUID.randomUUID().toString());
		receipt.setEstimatedAmount(sRequest.getParts() * 100.23);

		return receipt;
	}
}
