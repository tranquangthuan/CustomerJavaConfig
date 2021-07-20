package com.training.springcore.repository;

import java.util.List;

import com.training.springcore.entity.CustomerEntity;
import com.training.springcore.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();

	public CustomerEntity findById(long id);
}
