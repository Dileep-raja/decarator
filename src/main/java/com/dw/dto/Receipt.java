package com.dw.dto;

public class Receipt {
	protected String receiptNo;
	protected double estimatedAmount;
	protected double insuranceCharges;

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public double getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(double estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public double getInsuranceCharges() {
		return insuranceCharges;
	}

	public void setInsuranceCharges(double insuranceCharges) {
		this.insuranceCharges = insuranceCharges;
	}

}
