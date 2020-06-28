package com.visitha.service;

import java.util.List;

import com.visitha.model.Customer;
import com.visitha.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	/*
	 * public CustomerServiceImpl(CustomerRepository customerRepository) {
	 * 
	 * this.customerRepository = customerRepository; }
	 */

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
