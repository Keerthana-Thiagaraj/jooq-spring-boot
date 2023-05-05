/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CustomerBankDetails;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Record3;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerBankDetailsRecord extends UpdatableRecordImpl<CustomerBankDetailsRecord> implements Record15<String, String, String, String, String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.COMP_CODE</code>.
     */
    public CustomerBankDetailsRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.CUSTOMER_CODE</code>.
     */
    public CustomerBankDetailsRecord setCustomerCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.ACCOUNT_NO</code>.
     */
    public CustomerBankDetailsRecord setAccountNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.ACCOUNT_NO</code>.
     */
    public String getAccountNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.BANK_NAME</code>.
     */
    public CustomerBankDetailsRecord setBankName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.BANK_NAME</code>.
     */
    public String getBankName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.BRANCH_NAME</code>.
     */
    public CustomerBankDetailsRecord setBranchName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.BRANCH_NAME</code>.
     */
    public String getBranchName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.IFSC_CODE</code>.
     */
    public CustomerBankDetailsRecord setIfscCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.IFSC_CODE</code>.
     */
    public String getIfscCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.BANK_CITY</code>.
     */
    public CustomerBankDetailsRecord setBankCity(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.BANK_CITY</code>.
     */
    public String getBankCity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.BANK_COUNTRY</code>.
     */
    public CustomerBankDetailsRecord setBankCountry(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.BANK_COUNTRY</code>.
     */
    public String getBankCountry() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.IBAN_CODE</code>.
     */
    public CustomerBankDetailsRecord setIbanCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.IBAN_CODE</code>.
     */
    public String getIbanCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.SWIFT_CODE</code>.
     */
    public CustomerBankDetailsRecord setSwiftCode(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.SWIFT_CODE</code>.
     */
    public String getSwiftCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.STATUS</code>.
     */
    public CustomerBankDetailsRecord setStatus(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.CREATED_BY</code>.
     */
    public CustomerBankDetailsRecord setCreatedBy(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.CREATED_ON</code>.
     */
    public CustomerBankDetailsRecord setCreatedOn(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.LAST_CHANGED_BY</code>.
     */
    public CustomerBankDetailsRecord setLastChangedBy(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bank_details.LAST_CHANGED_ON</code>.
     */
    public CustomerBankDetailsRecord setLastChangedOn(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bank_details.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<String, String, String, String, String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.CUSTOMER_CODE;
    }

    @Override
    public Field<String> field3() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.ACCOUNT_NO;
    }

    @Override
    public Field<String> field4() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.BANK_NAME;
    }

    @Override
    public Field<String> field5() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.BRANCH_NAME;
    }

    @Override
    public Field<String> field6() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.IFSC_CODE;
    }

    @Override
    public Field<String> field7() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.BANK_CITY;
    }

    @Override
    public Field<String> field8() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.BANK_COUNTRY;
    }

    @Override
    public Field<String> field9() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.IBAN_CODE;
    }

    @Override
    public Field<String> field10() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.SWIFT_CODE;
    }

    @Override
    public Field<String> field11() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.STATUS;
    }

    @Override
    public Field<Integer> field12() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.CREATED_ON;
    }

    @Override
    public Field<Integer> field14() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return CustomerBankDetails.CUSTOMER_BANK_DETAILS.LAST_CHANGED_ON;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public String component2() {
        return getCustomerCode();
    }

    @Override
    public String component3() {
        return getAccountNo();
    }

    @Override
    public String component4() {
        return getBankName();
    }

    @Override
    public String component5() {
        return getBranchName();
    }

    @Override
    public String component6() {
        return getIfscCode();
    }

    @Override
    public String component7() {
        return getBankCity();
    }

    @Override
    public String component8() {
        return getBankCountry();
    }

    @Override
    public String component9() {
        return getIbanCode();
    }

    @Override
    public String component10() {
        return getSwiftCode();
    }

    @Override
    public String component11() {
        return getStatus();
    }

    @Override
    public Integer component12() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component13() {
        return getCreatedOn();
    }

    @Override
    public Integer component14() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component15() {
        return getLastChangedOn();
    }

    @Override
    public String value1() {
        return getCompCode();
    }

    @Override
    public String value2() {
        return getCustomerCode();
    }

    @Override
    public String value3() {
        return getAccountNo();
    }

    @Override
    public String value4() {
        return getBankName();
    }

    @Override
    public String value5() {
        return getBranchName();
    }

    @Override
    public String value6() {
        return getIfscCode();
    }

    @Override
    public String value7() {
        return getBankCity();
    }

    @Override
    public String value8() {
        return getBankCountry();
    }

    @Override
    public String value9() {
        return getIbanCode();
    }

    @Override
    public String value10() {
        return getSwiftCode();
    }

    @Override
    public String value11() {
        return getStatus();
    }

    @Override
    public Integer value12() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value13() {
        return getCreatedOn();
    }

    @Override
    public Integer value14() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value15() {
        return getLastChangedOn();
    }

    @Override
    public CustomerBankDetailsRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value2(String value) {
        setCustomerCode(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value3(String value) {
        setAccountNo(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value4(String value) {
        setBankName(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value5(String value) {
        setBranchName(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value6(String value) {
        setIfscCode(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value7(String value) {
        setBankCity(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value8(String value) {
        setBankCountry(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value9(String value) {
        setIbanCode(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value10(String value) {
        setSwiftCode(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value11(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value12(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value13(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value14(Integer value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord value15(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public CustomerBankDetailsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Integer value12, LocalDateTime value13, Integer value14, LocalDateTime value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerBankDetailsRecord
     */
    public CustomerBankDetailsRecord() {
        super(CustomerBankDetails.CUSTOMER_BANK_DETAILS);
    }

    /**
     * Create a detached, initialised CustomerBankDetailsRecord
     */
    public CustomerBankDetailsRecord(String compCode, String customerCode, String accountNo, String bankName, String branchName, String ifscCode, String bankCity, String bankCountry, String ibanCode, String swiftCode, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(CustomerBankDetails.CUSTOMER_BANK_DETAILS);

        setCompCode(compCode);
        setCustomerCode(customerCode);
        setAccountNo(accountNo);
        setBankName(bankName);
        setBranchName(branchName);
        setIfscCode(ifscCode);
        setBankCity(bankCity);
        setBankCountry(bankCountry);
        setIbanCode(ibanCode);
        setSwiftCode(swiftCode);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
