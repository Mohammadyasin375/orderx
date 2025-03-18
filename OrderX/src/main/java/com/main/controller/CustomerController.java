/**
 * 
 */
package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Customer;
import com.main.service.CustomerService;

/**
 * 
 */
@RestController()
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add")
	public Customer postCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
}
