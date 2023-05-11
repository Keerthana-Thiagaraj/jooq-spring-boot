package com.jooq.jooq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jooq.jooq.message.ResponseMessage;
import com.jooq.jooq.model.tables.daos.CustomerMasterDao;
import com.jooq.jooq.model.tables.pojos.CustomerMaster;
import com.jooq.jooq.model.tables.pojos.FieldMaster;
import com.jooq.jooq.model.tables.pojos.FieldTabMaster;
import com.jooq.jooq.service.CustomerService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	CustomerMasterDao customerDao;
	
	@GetMapping("/getcustomer")
	public List<CustomerMaster> getCustomer() {
		return customerService.getCustomers();
	}

	@PostMapping("/saveCustomer")
	public ResponseEntity<ResponseMessage> createCustomer(@ModelAttribute CustomerMaster customer) {
		customerService.addCustomer(customer);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Customer details added"));
	}
	
	@PostMapping(value = "/deletecustomer", consumes = "application/json")
	public ResponseEntity<ResponseMessage> delete(@RequestBody CustomerMaster cus) {
		customerService.deleteCustomer(cus);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Customer details deleted"));

	}
	
	@GetMapping(value = "/getFiledMaster")
	public List<Object[]> getfiled(){
		return customerService.getFiledMasters();
	}

	@GetMapping(value = "/getTabMaster")
	public List<FieldTabMaster> getTabFiels(){
		return customerService.getTabField();
	}
	
	
}