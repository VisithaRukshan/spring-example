package com.visitha.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.visitha.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public HibernateCustomerRepositoryImpl() {
		System.out.println("in the hibernatecustomerrepositoryimpl");
	}

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {
		System.out.println("in the hibernatecustomerrepositoryimpl list");
		System.out.println(dbUsername);

		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("kamal");
		customer.setLastname("Perera");

		customers.add(customer);

		return customers;
	}

}
