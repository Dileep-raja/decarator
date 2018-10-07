package com.dw.service;

import com.dw.dto.Receipt;
import com.dw.dto.ServiceRequest;

public interface CargoService {
	Receipt estimate(ServiceRequest sRequest);
}
