package com.jooq.jooq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jooq.jooq.message.ResponseMessage;
import com.jooq.jooq.model.tables.pojos.CustomerMaster;
import com.jooq.jooq.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/getcustomer")
	public List<CustomerMaster> getCustomer() {
		return customerService.getCustomers();
	}

	@PostMapping("/saveCustomer")
	public ResponseEntity<ResponseMessage> createCustomer(@ModelAttribute CustomerMaster customer) {

		customerService.addCustomer(customer);

		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Customer details added"));
	}
	
	/*
	@PostMapping(value = "/saveCustomer",consumes = "application/json")
	public ResponseEntity<ResponseMessage> createCustomer(@RequestBody CustomerMaster customer) {
		customerService.addCustomer(customer);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Customer details added"));
	}*/
}