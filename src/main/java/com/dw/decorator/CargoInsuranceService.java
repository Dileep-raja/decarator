package com.dw.decorator;

import com.dw.dto.Receipt;
import com.dw.dto.ServiceRequest;
import com.dw.service.CargoService;

public class CargoInsuranceService implements CargoService {
	protected CargoService cargoService;

	public CargoInsuranceService(CargoService cargoService) {
		this.cargoService = cargoService;
	}

	public Receipt estimate(ServiceRequest sRequest) {
		Receipt receipt = null;

		receipt = cargoService.estimate(sRequest);
		receipt.setInsuranceCharges((receipt.getEstimatedAmount() * 0.25) + receipt.getEstimatedAmount());
		return receipt;
	}

}
