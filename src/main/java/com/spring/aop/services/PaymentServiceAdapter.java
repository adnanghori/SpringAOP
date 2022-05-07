package com.spring.aop.services;

import org.springframework.stereotype.Component;

@Component(value = "paymentService")
public class PaymentServiceAdapter implements PaymentService {

	public void makePayment() {
		// TODO Auto-generated method stub
		
		// Functionality
		
		System.out.println("Amount Debited");
		
		// Functionality
		
		System.out.println("Amount Credited");
	}

}
