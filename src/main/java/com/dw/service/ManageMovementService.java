package com.dw.service;

import java.util.Calendar;

import com.dw.dto.Receipt;
import com.dw.dto.ServiceRequest;

public class ManageMovementService implements CargoService {
	public Receipt estimate(ServiceRequest sRequest) {
		Receipt receipt = null;

		receipt = new Receipt();
		receipt.setReceiptNo(Calendar.getInstance().getTimeInMillis() + "-MS");
		receipt.setEstimatedAmount(sRequest.getParts() * 1000.34f);
		return receipt;
	}
}
