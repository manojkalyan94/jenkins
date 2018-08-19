package com.payment.resource.payment.service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.resource.payment.dao.Paymentimpl;
import com.payment.resource.payment.dto.PaymentResponse;
import com.payment.resource.payment.model.Payment;
@Service

public class PaymentService 
{

	@Autowired
	private DataSource datasource;
	@Autowired
	Paymentimpl paymentdao;
	@SuppressWarnings("unchecked")
	public PaymentResponse paynow(Payment payment) {
		PaymentResponse response = null;
		String message=null;
		try{
			payment.setPaymentdate(new Date());
			paymentdao.save(payment);
			message= "payment successfull with amount "+payment.getAmount();
			System.out.println("datasource ==="+datasource);
			response= new PaymentResponse();
			response.setStatus("Success");
			response.setMessage(message);
			response.setTxndate(new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
		}catch(Exception e) 
		{
			e.getMessage();
		}
		
		
	
		return response;
	}
	
	@SuppressWarnings("unchecked")
	public PaymentResponse getTransactions()
	{
		 List findAll = paymentdao.findAll();
		 PaymentResponse response = new PaymentResponse();
		 response.setMessage("Success");
		 response.setPayments(findAll);
		 return response;
	}
}
