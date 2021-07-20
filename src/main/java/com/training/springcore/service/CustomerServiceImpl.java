package com.training.springcore.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.training.springcore.entity.CustomerEntity;
import com.training.springcore.model.Customer;
import com.training.springcore.repository.CustomerRepository;
import com.training.springcore.utils.BeanUtils;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier(value = "customerExtraRepositoryImpl")
	private CustomerRepository customerRepository;

	@Autowired
	private BeanUtils beanUtils;

	@Autowired
	private ModelMapper modelMapper;

	public CustomerServiceImpl() {
		super();
		System.out.println("CustomerServiceImpl");
	}

	// @Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("DI By constructor 1 arg");
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("DI By Setter");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		beanUtils.display();
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(long id) {
		CustomerEntity customerEntity = customerRepository.findById(id);
		Customer customer = modelMapper.map(customerEntity, Customer.class);
		return customer;
	}

}
