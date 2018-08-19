package com.payment.resource.payment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="pay")
public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4110666479437244585L;
	/**
	 * 
	 */

	@Id
	@Column
	private int id;
	@Column
	private String transactionId;
	@Column
	private String vendor;
	@Column
	private Date paymentdate;
	@Column
	private double amount;
	
	
	
	public Payment(int id, String transactionId, String vendor, Date paymentdate, double amount) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.vendor = vendor;
		this.paymentdate = paymentdate;
		this.amount = amount;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Date getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
