package com.jooq.jooq.service;

import java.util.ArrayList;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jooq.jooq.model.Tables;
import com.jooq.jooq.model.tables.pojos.CustomerMaster;
import com.jooq.jooq.model.tables.pojos.FieldTabMaster;
import com.jooq.jooq.model.tables.records.CustomerMasterRecord;
import com.jooq.jooq.reponse.model.CountryMasterResponseModel;
import com.jooq.jooq.reponse.model.FieldMasterResponseModel;
import com.jooq.jooq.reponse.model.TabForm;
import com.jooq.jooq.reponse.model.TabFormValidator;

@Service
public class CustomerService {
	@Autowired
	DSLContext dslContext;

	@Autowired
	Configuration configuration;
	
	
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
	
	public List<FieldTabMaster> getTabField() {
		return dslContext.selectFrom(Tables.FIELD_TAB_MASTER).fetchInto(FieldTabMaster.class);
	}

	public List<Object[]> getFiledMasters() {
		List<Object[]> result =  DSL.using(configuration)
				   .select(Tables.FIELD_MASTER.SNO,Tables.FIELD_MASTER.FORM_FIELD_ID,Tables.FIELD_MASTER.FORM_FIELD_LABLE, Tables.FIELD_MASTER.TAB_ID)
				   .from(Tables.FIELD_MASTER)
				   .orderBy(Tables.FIELD_TAB_MASTER.TAB_ID.desc())
				   .seek(1)
				   .fetchInto(Object[].class);
				
		return result;
	}
	
	public List<FieldMasterResponseModel> getFiledMasterByType(String type) {
	List<FieldMasterResponseModel> result = new ArrayList<FieldMasterResponseModel>();
	result = dslContext
			.select(Tables.FIELD_TAB_MASTER.TAB_ID,Tables.FIELD_TAB_MASTER.TAB_LABLE)
			.from(Tables.FIELD_TAB_MASTER).join(Tables.FIELD_MASTER)
			.on(Tables.FIELD_MASTER.TAB_ID.eq(Tables.FIELD_TAB_MASTER.TAB_ID))
			.where(Tables.FIELD_MASTER.RPMV.eq("Y")).groupBy(Tables.FIELD_MASTER.TAB_ID)
			.fetchInto(FieldMasterResponseModel.class);	
	for (FieldMasterResponseModel tabResult : result) {
		 List<TabForm> forms= new ArrayList<TabForm>();
		 forms = dslContext.select(Tables.FIELD_MASTER.FORM_FIELD_LABLE,Tables.FIELD_MASTER.FORM_FIELD_ID,
				 Tables.FIELD_MASTER.FIELD_VALUE, Tables.FIELD_MASTER.FIELD_TYPE, 
					Tables.FIELD_TAB_MASTER.TAB_ID, Tables.FIELD_TAB_MASTER.TAB_LABLE,Tables.FIELD_MASTER.SNO)
					.from(Tables.FIELD_MASTER).join(Tables.FIELD_TAB_MASTER)
					.on(Tables.FIELD_MASTER.TAB_ID.eq(Tables.FIELD_TAB_MASTER.TAB_ID))
					.where(Tables.FIELD_TAB_MASTER.TAB_ID.eq(Integer.valueOf(tabResult.getTadId()))
					.and(Tables.FIELD_MASTER.RPMV.eq("Y"))).groupBy(Tables.FIELD_MASTER.TAB_ID,Tables.FIELD_MASTER.FORM_FIELD_LABLE)
					.fetchInto(TabForm.class);
		 
		 tabResult.setForms(forms);
	}
	
	for (FieldMasterResponseModel tabResult : result) {//loop 1
		for(TabForm tabForm : tabResult.getForms()) {//loop 2
		List<TabFormValidator> validators= new ArrayList<TabFormValidator>();
		 validators = dslContext.select(Tables.FIELD_VALIDATION_MASTER.VALIDATION_TYPE,Tables.FIELD_VALIDATION_MASTER.VALIDATION_FORMAT,Tables.FIELD_VALIDATION_MASTER.VALIDATION_MSG)
					.from(Tables.FIELD_MASTER).join(Tables.FIELD_VALIDATION_MASTER)
					.on(Tables.FIELD_MASTER.SNO.eq(Tables.FIELD_VALIDATION_MASTER.FIELD_ID))
					.where(Tables.FIELD_MASTER.TAB_ID.eq(Integer.valueOf(tabResult.getTadId()))
					.and(Tables.FIELD_MASTER.SNO.eq(Integer.valueOf(tabForm.getsNo()))))
					.groupBy(Tables.FIELD_MASTER.SNO,Tables.FIELD_VALIDATION_MASTER.FIELD_ID)
					.fetchInto(TabFormValidator.class);
		 tabForm.setValidations(validators);
		}
	}
	
		return result;
	}
	
	public List<CountryMasterResponseModel> getCountryMaster() {
		List<CountryMasterResponseModel> result = new ArrayList<CountryMasterResponseModel>();
		result = dslContext.select(Tables.COUNTRY_MASTER.NAME, Tables.COUNTRY_MASTER.ID)
				.from(Tables.COUNTRY_MASTER).fetchInto(CountryMasterResponseModel.class);
		return result;
	}
	
	
}