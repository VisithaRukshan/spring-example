package com.visitha.repository;

import java.util.List;

import com.visitha.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}