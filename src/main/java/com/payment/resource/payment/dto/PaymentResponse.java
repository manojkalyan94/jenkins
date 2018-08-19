package com.payment.resource.payment.dto;

import java.util.List;

import javax.annotation.Resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.payment.resource.payment.model.Payment;
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class PaymentResponse {

	
	private String status;
	private String message;
	private String txndate;
	private List<Payment> payments;
	
	
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTxndate() {
		return txndate;
	}
	public void setTxndate(String txndate) {
		this.txndate = txndate;
		
		
		
	}
	
}
