/**
 * 
 */
package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Customer;
import com.main.repository.CustomerRepository;

/**
 * 
 */
@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepositor; 

	public Customer addCustomer(Customer customer) {
		return customerRepositor.save(customer);
	}
}
