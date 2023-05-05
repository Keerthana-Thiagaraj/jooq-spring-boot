/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.GrnCustomerUtrDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GrnCustomerUtrDetailsRecord extends UpdatableRecordImpl<GrnCustomerUtrDetailsRecord> implements Record11<Integer, String, String, String, String, String, String, LocalDate, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.SNO</code>.
     */
    public GrnCustomerUtrDetailsRecord setSno(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.SNO</code>.
     */
    public Integer getSno() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.CFA_CODE</code>.
     */
    public GrnCustomerUtrDetailsRecord setCfaCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.CFA_CODE</code>.
     */
    public String getCfaCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.CUSTOMER_CODE</code>.
     */
    public GrnCustomerUtrDetailsRecord setCustomerCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.MODEL</code>.
     */
    public GrnCustomerUtrDetailsRecord setModel(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.MODEL</code>.
     */
    public String getModel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.QTY</code>.
     */
    public GrnCustomerUtrDetailsRecord setQty(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.QTY</code>.
     */
    public String getQty() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.UTR_NO</code>.
     */
    public GrnCustomerUtrDetailsRecord setUtrNo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.UTR_NO</code>.
     */
    public String getUtrNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.DEPOSITE_AMOUNT</code>.
     */
    public GrnCustomerUtrDetailsRecord setDepositeAmount(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.DEPOSITE_AMOUNT</code>.
     */
    public String getDepositeAmount() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.PAYMENT_DATE</code>.
     */
    public GrnCustomerUtrDetailsRecord setPaymentDate(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.PAYMENT_DATE</code>.
     */
    public LocalDate getPaymentDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.STATUS</code>.
     */
    public GrnCustomerUtrDetailsRecord setStatus(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.CREATED_BY</code>.
     */
    public GrnCustomerUtrDetailsRecord setCreatedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_utr_details.CREATED_ON</code>.
     */
    public GrnCustomerUtrDetailsRecord setCreatedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_utr_details.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, String, String, String, LocalDate, String, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, String, String, String, String, LocalDate, String, String, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.SNO;
    }

    @Override
    public Field<String> field2() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.CFA_CODE;
    }

    @Override
    public Field<String> field3() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.CUSTOMER_CODE;
    }

    @Override
    public Field<String> field4() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.MODEL;
    }

    @Override
    public Field<String> field5() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.QTY;
    }

    @Override
    public Field<String> field6() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.UTR_NO;
    }

    @Override
    public Field<String> field7() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.DEPOSITE_AMOUNT;
    }

    @Override
    public Field<LocalDate> field8() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.PAYMENT_DATE;
    }

    @Override
    public Field<String> field9() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.STATUS;
    }

    @Override
    public Field<String> field10() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS.CREATED_ON;
    }

    @Override
    public Integer component1() {
        return getSno();
    }

    @Override
    public String component2() {
        return getCfaCode();
    }

    @Override
    public String component3() {
        return getCustomerCode();
    }

    @Override
    public String component4() {
        return getModel();
    }

    @Override
    public String component5() {
        return getQty();
    }

    @Override
    public String component6() {
        return getUtrNo();
    }

    @Override
    public String component7() {
        return getDepositeAmount();
    }

    @Override
    public LocalDate component8() {
        return getPaymentDate();
    }

    @Override
    public String component9() {
        return getStatus();
    }

    @Override
    public String component10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component11() {
        return getCreatedOn();
    }

    @Override
    public Integer value1() {
        return getSno();
    }

    @Override
    public String value2() {
        return getCfaCode();
    }

    @Override
    public String value3() {
        return getCustomerCode();
    }

    @Override
    public String value4() {
        return getModel();
    }

    @Override
    public String value5() {
        return getQty();
    }

    @Override
    public String value6() {
        return getUtrNo();
    }

    @Override
    public String value7() {
        return getDepositeAmount();
    }

    @Override
    public LocalDate value8() {
        return getPaymentDate();
    }

    @Override
    public String value9() {
        return getStatus();
    }

    @Override
    public String value10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value11() {
        return getCreatedOn();
    }

    @Override
    public GrnCustomerUtrDetailsRecord value1(Integer value) {
        setSno(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value2(String value) {
        setCfaCode(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value3(String value) {
        setCustomerCode(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value4(String value) {
        setModel(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value5(String value) {
        setQty(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value6(String value) {
        setUtrNo(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value7(String value) {
        setDepositeAmount(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value8(LocalDate value) {
        setPaymentDate(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value9(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value10(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord value11(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public GrnCustomerUtrDetailsRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, LocalDate value8, String value9, String value10, LocalDateTime value11) {
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
     * Create a detached GrnCustomerUtrDetailsRecord
     */
    public GrnCustomerUtrDetailsRecord() {
        super(GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS);
    }

    /**
     * Create a detached, initialised GrnCustomerUtrDetailsRecord
     */
    public GrnCustomerUtrDetailsRecord(Integer sno, String cfaCode, String customerCode, String model, String qty, String utrNo, String depositeAmount, LocalDate paymentDate, String status, String createdBy, LocalDateTime createdOn) {
        super(GrnCustomerUtrDetails.GRN_CUSTOMER_UTR_DETAILS);

        setSno(sno);
        setCfaCode(cfaCode);
        setCustomerCode(customerCode);
        setModel(model);
        setQty(qty);
        setUtrNo(utrNo);
        setDepositeAmount(depositeAmount);
        setPaymentDate(paymentDate);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
    }
}