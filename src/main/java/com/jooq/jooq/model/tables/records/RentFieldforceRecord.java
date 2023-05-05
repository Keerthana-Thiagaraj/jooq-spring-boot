/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.RentFieldforce;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record2;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RentFieldforceRecord extends UpdatableRecordImpl<RentFieldforceRecord> implements Record11<String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.COMP_CODE</code>.
     */
    public RentFieldforceRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.VENDOR_CODE</code>.
     */
    public RentFieldforceRecord setVendorCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.VENDOR_NAME</code>.
     */
    public RentFieldforceRecord setVendorName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.VENDOR_NAME</code>.
     */
    public String getVendorName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.CUSTOMER_CODE</code>.
     */
    public RentFieldforceRecord setCustomerCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.CUSTOMER_NAME</code>.
     */
    public RentFieldforceRecord setCustomerName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_FIELD_NAME</code>.
     */
    public RentFieldforceRecord setLeaseFieldName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_FIELD_NAME</code>.
     */
    public String getLeaseFieldName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_FIELD_MOBILE</code>.
     */
    public RentFieldforceRecord setLeaseFieldMobile(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_FIELD_MOBILE</code>.
     */
    public String getLeaseFieldMobile() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_FIELD_MAIL</code>.
     */
    public RentFieldforceRecord setLeaseFieldMail(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_FIELD_MAIL</code>.
     */
    public String getLeaseFieldMail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_HEAD_NAME</code>.
     */
    public RentFieldforceRecord setLeaseHeadName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_HEAD_NAME</code>.
     */
    public String getLeaseHeadName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_HEAD_MOBILE</code>.
     */
    public RentFieldforceRecord setLeaseHeadMobile(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_HEAD_MOBILE</code>.
     */
    public String getLeaseHeadMobile() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_HEAD_MAIL</code>.
     */
    public RentFieldforceRecord setLeaseHeadMail(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_fieldforce.LEASE_HEAD_MAIL</code>.
     */
    public String getLeaseHeadMail() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RentFieldforce.RENT_FIELDFORCE.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return RentFieldforce.RENT_FIELDFORCE.VENDOR_CODE;
    }

    @Override
    public Field<String> field3() {
        return RentFieldforce.RENT_FIELDFORCE.VENDOR_NAME;
    }

    @Override
    public Field<String> field4() {
        return RentFieldforce.RENT_FIELDFORCE.CUSTOMER_CODE;
    }

    @Override
    public Field<String> field5() {
        return RentFieldforce.RENT_FIELDFORCE.CUSTOMER_NAME;
    }

    @Override
    public Field<String> field6() {
        return RentFieldforce.RENT_FIELDFORCE.LEASE_FIELD_NAME;
    }

    @Override
    public Field<String> field7() {
        return RentFieldforce.RENT_FIELDFORCE.LEASE_FIELD_MOBILE;
    }

    @Override
    public Field<String> field8() {
        return RentFieldforce.RENT_FIELDFORCE.LEASE_FIELD_MAIL;
    }

    @Override
    public Field<String> field9() {
        return RentFieldforce.RENT_FIELDFORCE.LEASE_HEAD_NAME;
    }

    @Override
    public Field<String> field10() {
        return RentFieldforce.RENT_FIELDFORCE.LEASE_HEAD_MOBILE;
    }

    @Override
    public Field<String> field11() {
        return RentFieldforce.RENT_FIELDFORCE.LEASE_HEAD_MAIL;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public String component2() {
        return getVendorCode();
    }

    @Override
    public String component3() {
        return getVendorName();
    }

    @Override
    public String component4() {
        return getCustomerCode();
    }

    @Override
    public String component5() {
        return getCustomerName();
    }

    @Override
    public String component6() {
        return getLeaseFieldName();
    }

    @Override
    public String component7() {
        return getLeaseFieldMobile();
    }

    @Override
    public String component8() {
        return getLeaseFieldMail();
    }

    @Override
    public String component9() {
        return getLeaseHeadName();
    }

    @Override
    public String component10() {
        return getLeaseHeadMobile();
    }

    @Override
    public String component11() {
        return getLeaseHeadMail();
    }

    @Override
    public String value1() {
        return getCompCode();
    }

    @Override
    public String value2() {
        return getVendorCode();
    }

    @Override
    public String value3() {
        return getVendorName();
    }

    @Override
    public String value4() {
        return getCustomerCode();
    }

    @Override
    public String value5() {
        return getCustomerName();
    }

    @Override
    public String value6() {
        return getLeaseFieldName();
    }

    @Override
    public String value7() {
        return getLeaseFieldMobile();
    }

    @Override
    public String value8() {
        return getLeaseFieldMail();
    }

    @Override
    public String value9() {
        return getLeaseHeadName();
    }

    @Override
    public String value10() {
        return getLeaseHeadMobile();
    }

    @Override
    public String value11() {
        return getLeaseHeadMail();
    }

    @Override
    public RentFieldforceRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value2(String value) {
        setVendorCode(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value3(String value) {
        setVendorName(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value4(String value) {
        setCustomerCode(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value5(String value) {
        setCustomerName(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value6(String value) {
        setLeaseFieldName(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value7(String value) {
        setLeaseFieldMobile(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value8(String value) {
        setLeaseFieldMail(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value9(String value) {
        setLeaseHeadName(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value10(String value) {
        setLeaseHeadMobile(value);
        return this;
    }

    @Override
    public RentFieldforceRecord value11(String value) {
        setLeaseHeadMail(value);
        return this;
    }

    @Override
    public RentFieldforceRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RentFieldforceRecord
     */
    public RentFieldforceRecord() {
        super(RentFieldforce.RENT_FIELDFORCE);
    }

    /**
     * Create a detached, initialised RentFieldforceRecord
     */
    public RentFieldforceRecord(String compCode, String vendorCode, String vendorName, String customerCode, String customerName, String leaseFieldName, String leaseFieldMobile, String leaseFieldMail, String leaseHeadName, String leaseHeadMobile, String leaseHeadMail) {
        super(RentFieldforce.RENT_FIELDFORCE);

        setCompCode(compCode);
        setVendorCode(vendorCode);
        setVendorName(vendorName);
        setCustomerCode(customerCode);
        setCustomerName(customerName);
        setLeaseFieldName(leaseFieldName);
        setLeaseFieldMobile(leaseFieldMobile);
        setLeaseFieldMail(leaseFieldMail);
        setLeaseHeadName(leaseHeadName);
        setLeaseHeadMobile(leaseHeadMobile);
        setLeaseHeadMail(leaseHeadMail);
    }
}