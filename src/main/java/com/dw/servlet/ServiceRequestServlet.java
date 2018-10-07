package com.dw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dw.dto.Receipt;
import com.dw.dto.ServiceRequest;
import com.dw.service.CargoService;
import com.dw.util.CargoServiceFactory;

@WebServlet(urlPatterns={"/service-request"})
public class ServiceRequestServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Receipt receipt = null;
		ServiceRequest sRequest = null;
		CargoService cargoService = null;

		sRequest = new ServiceRequest();
		sRequest.setWho(req.getParameter("who"));
		sRequest.setFrom(req.getParameter("from"));
		sRequest.setTo(req.getParameter("to"));
		sRequest.setParts(Integer.parseInt(req.getParameter("parts")));
		sRequest.setServiceType(req.getParameter("serviceType"));
		if (req.getParameter("insurance") != null && req.getParameter("insurance").trim().length() > 0) {
			sRequest.setInsurance(Integer.parseInt(req.getParameter("insurance")));
		}

		cargoService = CargoServiceFactory.getCargoService(sRequest.getServiceType(), sRequest.getInsurance());
		receipt = cargoService.estimate(sRequest);
		req.setAttribute("estimate", receipt);
		req.getRequestDispatcher("/estimate.jsp").forward(req, resp);
	}
}
