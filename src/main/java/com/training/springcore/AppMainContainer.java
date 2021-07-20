package com.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.springcore.model.Customer;
import com.training.springcore.service.CustomerService;

public class AppMainContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CustomerJavaConfig");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CustomerService customerService = applicationContext.getBean("customerServiceImpl", CustomerService.class);

		Customer customer = customerService.findById(1);
		System.out.println(customer);

		((AnnotationConfigApplicationContext) applicationContext).close();
	}

}
