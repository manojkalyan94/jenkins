package com.payment.resource.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.resource.payment.dto.PaymentResponse;
import com.payment.resource.payment.model.Payment;
import com.payment.resource.payment.service.PaymentService;

@RestController
@RequestMapping("/paymentResource")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@PostMapping(value="/payNow")
	public PaymentResponse payInstant(@RequestBody Payment pay) {
		
		return service.paynow(pay);
	}
	
	@GetMapping("/gettransactions")
	public PaymentResponse getTransactions() {
	return	service.getTransactions();
	}
	
	
}
