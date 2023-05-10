package com.jooq.jooq.service;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jooq.jooq.model.Tables;
import com.jooq.jooq.model.tables.pojos.CustomerMaster;
import com.jooq.jooq.model.tables.pojos.FieldMaster;
import com.jooq.jooq.model.tables.pojos.FieldTabMaster;
import com.jooq.jooq.model.tables.records.CustomerMasterRecord;

@Service
public class CustomerService {
	@Autowired
	DSLContext dslContext;

	public List<CustomerMaster> getCustomers() {
	  	//Result<Record> result = dslContext.fetch("SELECT * FROM customer_master WHERE CUSTOMER_CODE='"+1000008+"'");
	  return
		  dslContext.selectFrom(Tables.CUSTOMER_MASTER).where(Tables.CUSTOMER_MASTER.
		  CUSTOMER_CODE.eq("1000008")) .fetchInto(CustomerMaster.class);
		 
	}

	public void addCustomer(CustomerMaster customer) {
		
		// When you produce results
		/*int rows = dslContext.connectionResult(c -> {
		    try (Statement s = c.createStatement()) {
		        return s.executeUpdate("INSERT INTO author (id, first_name, last_name) VALUES (3, 'William', 'Shakespeare')");
		    }
		});*/
		
		//dslContext.batchStore(customer);
		//dslContext.insertInto(Tables.CUSTOMER_MASTER, Tables.CUSTOMER_MASTER.COMP_CODE, Tables.CUSTOMER_MASTER.CUSTOMER_CODE, Tables.CUSTOMER_MASTER.CUSTOMER_ACC_GRP_CODE, Tables.CUSTOMER_MASTER.CUSTOMER_GRP_CODE, Tables.CUSTOMER_MASTER.NAME)
		//		.values(customer.getCompCode(), customer.getCustomerCode(),customer.getCustomerAccGrpCode(),customer.getCustomerGrpCode(),customer.getName()).execute();
		CustomerMasterRecord customerMaster = dslContext.newRecord(Tables.CUSTOMER_MASTER, customer);
		customerMaster.store();
		dslContext.executeInsert(customerMaster);
		//dslContext.executeUpdate(customerMaster);
	}
	
	public void deleteCustomer(CustomerMaster cus) {
		CustomerMasterRecord customerMaster1 = dslContext.newRecord(Tables.CUSTOMER_MASTER, cus);
		customerMaster1.delete();
		dslContext.executeDelete(customerMaster1);
	}
	
	public List<FieldMaster> getFiledMasters() {
		return dslContext.selectFrom(Tables.FIELD_MASTER).fetchInto(FieldMaster.class);
	}


	public List<FieldTabMaster> getTabField() {
		return dslContext.selectFrom(Tables.FIELD_TAB_MASTER).fetchInto(FieldTabMaster.class);
	}
	
}