package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.services.PaymentServiceAdapter;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/aop/configuration.xml");
//        PaymentServiceAdapter serviceAdapter = applicationContext.getBean("paymentService",PaymentServiceAdapter.class);
//        serviceAdapter.makePayment();
        
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        PaymentServiceAdapter bean = applicationContext.getBean("paymentService",PaymentServiceAdapter.class);
        bean.makePayment();
        
    }
}
