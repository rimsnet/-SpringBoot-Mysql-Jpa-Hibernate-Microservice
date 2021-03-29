package com.rimsnet.springboot.jpa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimsnet.springboot.jpa.entities.Payment;
import com.rimsnet.springboot.jpa.repo.PaymentRepository;
import com.rimsnet.springboot.jpa.service.PaymentSercive;

@Service
public class PaymentService implements PaymentSercive {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	@Override
	public void savePayment(Payment payment) {
		paymentRepository.save(payment);
	}

}
