package com.dw.util;

import com.dw.decorator.CargoInsuranceService;
import com.dw.service.CargoService;
import com.dw.service.ManageMovementService;
import com.dw.service.ManageTransportService;

public class CargoServiceFactory {
	public static CargoService getCargoService(String serviceType, int insurance) {
		CargoService cargoService = null;

		if (serviceType.equals("transport")) {
			cargoService = new ManageTransportService();
		} else if (serviceType.equals("movement")) {
			cargoService = new ManageMovementService();
		}
		if (insurance > 0) {
			cargoService = new CargoInsuranceService(cargoService);
		}

		return cargoService;
	}
}
