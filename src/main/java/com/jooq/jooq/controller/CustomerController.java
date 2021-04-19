package com.jooq.jooq.controller;

import com.jooq.jooq.message.ResponseMessage;
import com.jooq.jooq.model.tables.pojos.Customer;
import com.jooq.jooq.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getCustomer() {
        return customerService.getCustomers();
    }

    @PostMapping("/customer")
    public ResponseEntity<ResponseMessage> createCustomer(@RequestBody Customer customer) {

        customerService.addCustomer(customer);

        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Customer details added"));
    }
}
