package com.career.goals.spring.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.career.goals.spring.sql.dao.CustomerDao;
import com.career.goals.spring.sql.model.Customer;

@RestController
public class customerController {

	@Autowired
	CustomerDao customerDao;

	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody Customer cust) {
		customerDao.save(cust);
		return "customer saved successfully in database";
	}

	@GetMapping("/getCustomer")
	public List<Customer> getCustomer() {

		return (List<Customer>) customerDao.findAll();

	}

}
