package emy.web.service;

import java.util.List;

import emy.entity.Customer;

public interface CustomerService {

	List<Customer> getCustomers();

	boolean save(Customer customer);

	Customer getCustomer(int id);

	void delete(int id);
	
}
