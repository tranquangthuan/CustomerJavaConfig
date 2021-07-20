package com.training.springcore.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.springcore.entity.CustomerEntity;
import com.training.springcore.model.Customer;

@Repository
public class CustomerExtraRepositoryImpl implements CustomerRepository {

	public CustomerExtraRepositoryImpl() {
		super();
		System.out.println("CustomerExtraRepositoryImpl");
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = Arrays.asList(new Customer(1, "A"), new Customer(2, "B"));
		return customers;
	}

	@Override
	public CustomerEntity findById(long id) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity = new CustomerEntity(100, "A100", "abc123");
		return customerEntity;
	}

}
