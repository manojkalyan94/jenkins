package com.payment.resource.payment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.resource.payment.model.Payment;
@Repository
public interface Paymentimpl extends JpaRepository<Payment,Integer> {

}
