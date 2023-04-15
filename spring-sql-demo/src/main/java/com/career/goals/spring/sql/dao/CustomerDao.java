package com.career.goals.spring.sql.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.career.goals.spring.sql.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{

	List<Customer> findAllById(Integer custId);

	
}
