package com.visitha.service;

import java.util.List;

import com.visitha.model.Customer;
import com.visitha.repository.CustomerRepository;
import com.visitha.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
