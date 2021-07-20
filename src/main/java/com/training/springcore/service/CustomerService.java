package com.training.springcore.service;

import java.util.List;

import com.training.springcore.model.Customer;

public interface CustomerService {
	public List<Customer> findAll();
	
	
	public Customer findById(long id);
}
