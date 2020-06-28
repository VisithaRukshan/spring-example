package com.visitha.repository;

import java.util.ArrayList;
import java.util.List;

import com.visitha.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("kamal");
		customer.setLastname("Perera");
		
		customers.add(customer);
		
		return customers;
	}
	
	
}
