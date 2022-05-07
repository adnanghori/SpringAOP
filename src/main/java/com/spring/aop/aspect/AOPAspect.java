package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component(value = "aspect")
public class AOPAspect {
	@Before("execution(* com.spring.aop.services.PaymentServiceAdapter.makePayment())")
	public void beforeSevice() {
		System.out.println("Starterd");
	}
}
