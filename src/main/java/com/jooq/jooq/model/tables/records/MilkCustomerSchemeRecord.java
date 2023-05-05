/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.MilkCustomerScheme;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MilkCustomerSchemeRecord extends UpdatableRecordImpl<MilkCustomerSchemeRecord> implements Record13<String, String, String, String, String, LocalDate, LocalDate, String, String, String, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.CUSTOMER_CODE</code>.
     */
    public MilkCustomerSchemeRecord setCustomerCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.HDC_NAME</code>.
     */
    public MilkCustomerSchemeRecord setHdcName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.HDC_NAME</code>.
     */
    public String getHdcName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1</code>.
     */
    public MilkCustomerSchemeRecord setSlab1(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1</code>.
     */
    public String getSlab1() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2</code>.
     */
    public MilkCustomerSchemeRecord setSlab2(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2</code>.
     */
    public String getSlab2() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3</code>.
     */
    public MilkCustomerSchemeRecord setSlab3(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3</code>.
     */
    public String getSlab3() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_FROM_DATE</code>.
     */
    public MilkCustomerSchemeRecord setValidFromDate(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_FROM_DATE</code>.
     */
    public LocalDate getValidFromDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_TO</code>.
     */
    public MilkCustomerSchemeRecord setValidTo(LocalDate value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_TO</code>.
     */
    public LocalDate getValidTo() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1_COIN</code>.
     */
    public MilkCustomerSchemeRecord setSlab1Coin(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1_COIN</code>.
     */
    public String getSlab1Coin() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2_COIN</code>.
     */
    public MilkCustomerSchemeRecord setSlab2Coin(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2_COIN</code>.
     */
    public String getSlab2Coin() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3_COIN</code>.
     */
    public MilkCustomerSchemeRecord setSlab3Coin(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3_COIN</code>.
     */
    public String getSlab3Coin() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_BY</code>.
     */
    public MilkCustomerSchemeRecord setUploadedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_BY</code>.
     */
    public String getUploadedBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_ON</code>.
     */
    public MilkCustomerSchemeRecord setUploadedOn(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_ON</code>.
     */
    public LocalDateTime getUploadedOn() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.STATUS</code>.
     */
    public MilkCustomerSchemeRecord setStatus(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, LocalDate, LocalDate, String, String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, String, String, String, LocalDate, LocalDate, String, String, String, String, LocalDateTime, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.CUSTOMER_CODE;
    }

    @Override
    public Field<String> field2() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.HDC_NAME;
    }

    @Override
    public Field<String> field3() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.SLAB1;
    }

    @Override
    public Field<String> field4() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.SLAB2;
    }

    @Override
    public Field<String> field5() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.SLAB3;
    }

    @Override
    public Field<LocalDate> field6() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.VALID_FROM_DATE;
    }

    @Override
    public Field<LocalDate> field7() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.VALID_TO;
    }

    @Override
    public Field<String> field8() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.SLAB1_COIN;
    }

    @Override
    public Field<String> field9() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.SLAB2_COIN;
    }

    @Override
    public Field<String> field10() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.SLAB3_COIN;
    }

    @Override
    public Field<String> field11() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.UPLOADED_BY;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.UPLOADED_ON;
    }

    @Override
    public Field<String> field13() {
        return MilkCustomerScheme.MILK_CUSTOMER_SCHEME.STATUS;
    }

    @Override
    public String component1() {
        return getCustomerCode();
    }

    @Override
    public String component2() {
        return getHdcName();
    }

    @Override
    public String component3() {
        return getSlab1();
    }

    @Override
    public String component4() {
        return getSlab2();
    }

    @Override
    public String component5() {
        return getSlab3();
    }

    @Override
    public LocalDate component6() {
        return getValidFromDate();
    }

    @Override
    public LocalDate component7() {
        return getValidTo();
    }

    @Override
    public String component8() {
        return getSlab1Coin();
    }

    @Override
    public String component9() {
        return getSlab2Coin();
    }

    @Override
    public String component10() {
        return getSlab3Coin();
    }

    @Override
    public String component11() {
        return getUploadedBy();
    }

    @Override
    public LocalDateTime component12() {
        return getUploadedOn();
    }

    @Override
    public String component13() {
        return getStatus();
    }

    @Override
    public String value1() {
        return getCustomerCode();
    }

    @Override
    public String value2() {
        return getHdcName();
    }

    @Override
    public String value3() {
        return getSlab1();
    }

    @Override
    public String value4() {
        return getSlab2();
    }

    @Override
    public String value5() {
        return getSlab3();
    }

    @Override
    public LocalDate value6() {
        return getValidFromDate();
    }

    @Override
    public LocalDate value7() {
        return getValidTo();
    }

    @Override
    public String value8() {
        return getSlab1Coin();
    }

    @Override
    public String value9() {
        return getSlab2Coin();
    }

    @Override
    public String value10() {
        return getSlab3Coin();
    }

    @Override
    public String value11() {
        return getUploadedBy();
    }

    @Override
    public LocalDateTime value12() {
        return getUploadedOn();
    }

    @Override
    public String value13() {
        return getStatus();
    }

    @Override
    public MilkCustomerSchemeRecord value1(String value) {
        setCustomerCode(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value2(String value) {
        setHdcName(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value3(String value) {
        setSlab1(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value4(String value) {
        setSlab2(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value5(String value) {
        setSlab3(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value6(LocalDate value) {
        setValidFromDate(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value7(LocalDate value) {
        setValidTo(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value8(String value) {
        setSlab1Coin(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value9(String value) {
        setSlab2Coin(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value10(String value) {
        setSlab3Coin(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value11(String value) {
        setUploadedBy(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value12(LocalDateTime value) {
        setUploadedOn(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord value13(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public MilkCustomerSchemeRecord values(String value1, String value2, String value3, String value4, String value5, LocalDate value6, LocalDate value7, String value8, String value9, String value10, String value11, LocalDateTime value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilkCustomerSchemeRecord
     */
    public MilkCustomerSchemeRecord() {
        super(MilkCustomerScheme.MILK_CUSTOMER_SCHEME);
    }

    /**
     * Create a detached, initialised MilkCustomerSchemeRecord
     */
    public MilkCustomerSchemeRecord(String customerCode, String hdcName, String slab1, String slab2, String slab3, LocalDate validFromDate, LocalDate validTo, String slab1Coin, String slab2Coin, String slab3Coin, String uploadedBy, LocalDateTime uploadedOn, String status) {
        super(MilkCustomerScheme.MILK_CUSTOMER_SCHEME);

        setCustomerCode(customerCode);
        setHdcName(hdcName);
        setSlab1(slab1);
        setSlab2(slab2);
        setSlab3(slab3);
        setValidFromDate(validFromDate);
        setValidTo(validTo);
        setSlab1Coin(slab1Coin);
        setSlab2Coin(slab2Coin);
        setSlab3Coin(slab3Coin);
        setUploadedBy(uploadedBy);
        setUploadedOn(uploadedOn);
        setStatus(status);
    }
}