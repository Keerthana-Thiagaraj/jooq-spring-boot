package com.jooq.jooq.service;

import com.jooq.jooq.model.Tables;
import com.jooq.jooq.model.tables.pojos.Customer;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    DSLContext dslContext;

    public List<Customer> getCustomers() {
        return dslContext.selectFrom(Tables.CUSTOMER).fetchInto(Customer.class);
    }

    public void addCustomer(Customer customer) {
        dslContext.insertInto(Tables.CUSTOMER, Tables.CUSTOMER.NAME, Tables.CUSTOMER.AGE).values(customer.getName(), customer.getAge()).execute();
    }
}
