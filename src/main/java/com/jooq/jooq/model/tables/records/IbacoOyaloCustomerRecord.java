/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.IbacoOyaloCustomer;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IbacoOyaloCustomerRecord extends UpdatableRecordImpl<IbacoOyaloCustomerRecord> implements Record8<String, String, String, String, LocalDateTime, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CUSTOMER_CODE</code>.
     */
    public IbacoOyaloCustomerRecord setCustomerCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.RETAIL_CODE</code>.
     */
    public IbacoOyaloCustomerRecord setRetailCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.RETAIL_CODE</code>.
     */
    public String getRetailCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.SECURITY_VENDOR</code>.
     */
    public IbacoOyaloCustomerRecord setSecurityVendor(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.SECURITY_VENDOR</code>.
     */
    public String getSecurityVendor() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.RSP_CODE</code>.
     */
    public IbacoOyaloCustomerRecord setRspCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.RSP_CODE</code>.
     */
    public String getRspCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CREATED_ON</code>.
     */
    public IbacoOyaloCustomerRecord setCreatedOn(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CREATED_BY</code>.
     */
    public IbacoOyaloCustomerRecord setCreatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CHANGED_ON</code>.
     */
    public IbacoOyaloCustomerRecord setChangedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CHANGED_ON</code>.
     */
    public LocalDateTime getChangedOn() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CHANGED_BY</code>.
     */
    public IbacoOyaloCustomerRecord setChangedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_oyalo_customer.CHANGED_BY</code>.
     */
    public String getChangedBy() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.CUSTOMER_CODE;
    }

    @Override
    public Field<String> field2() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.RETAIL_CODE;
    }

    @Override
    public Field<String> field3() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.SECURITY_VENDOR;
    }

    @Override
    public Field<String> field4() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.RSP_CODE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.CREATED_ON;
    }

    @Override
    public Field<String> field6() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.CHANGED_ON;
    }

    @Override
    public Field<String> field8() {
        return IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER.CHANGED_BY;
    }

    @Override
    public String component1() {
        return getCustomerCode();
    }

    @Override
    public String component2() {
        return getRetailCode();
    }

    @Override
    public String component3() {
        return getSecurityVendor();
    }

    @Override
    public String component4() {
        return getRspCode();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedOn();
    }

    @Override
    public String component6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getChangedOn();
    }

    @Override
    public String component8() {
        return getChangedBy();
    }

    @Override
    public String value1() {
        return getCustomerCode();
    }

    @Override
    public String value2() {
        return getRetailCode();
    }

    @Override
    public String value3() {
        return getSecurityVendor();
    }

    @Override
    public String value4() {
        return getRspCode();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedOn();
    }

    @Override
    public String value6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getChangedOn();
    }

    @Override
    public String value8() {
        return getChangedBy();
    }

    @Override
    public IbacoOyaloCustomerRecord value1(String value) {
        setCustomerCode(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord value2(String value) {
        setRetailCode(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord value3(String value) {
        setSecurityVendor(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord value4(String value) {
        setRspCode(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord value5(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord value7(LocalDateTime value) {
        setChangedOn(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord value8(String value) {
        setChangedBy(value);
        return this;
    }

    @Override
    public IbacoOyaloCustomerRecord values(String value1, String value2, String value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IbacoOyaloCustomerRecord
     */
    public IbacoOyaloCustomerRecord() {
        super(IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER);
    }

    /**
     * Create a detached, initialised IbacoOyaloCustomerRecord
     */
    public IbacoOyaloCustomerRecord(String customerCode, String retailCode, String securityVendor, String rspCode, LocalDateTime createdOn, String createdBy, LocalDateTime changedOn, String changedBy) {
        super(IbacoOyaloCustomer.IBACO_OYALO_CUSTOMER);

        setCustomerCode(customerCode);
        setRetailCode(retailCode);
        setSecurityVendor(securityVendor);
        setRspCode(rspCode);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
        setChangedOn(changedOn);
        setChangedBy(changedBy);
    }
}