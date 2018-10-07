package com.dw.dto;

public class ServiceRequest {
	protected String who;
	protected String from;
	protected String to;
	protected String serviceType;
	protected int parts;
	protected int insurance;

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public int getParts() {
		return parts;
	}

	public void setParts(int parts) {
		this.parts = parts;
	}

	public int getInsurance() {
		return insurance;
	}

	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}

}
