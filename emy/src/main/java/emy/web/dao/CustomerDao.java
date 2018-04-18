package emy.web.dao;

import java.util.List;

import emy.entity.Customer;

public interface CustomerDao {

	List<Customer>  getCustomers();

	boolean save(Customer customer);

	Customer getCustomer(int id);

	void delete(int id);
	
}
