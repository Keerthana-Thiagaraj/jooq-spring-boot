/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.GrnIndentDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Record5;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GrnIndentDetailsRecord extends UpdatableRecordImpl<GrnIndentDetailsRecord> implements Record22<String, LocalDate, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, String, String, String, String, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.COMP_CODE</code>.
     */
    public GrnIndentDetailsRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.INDENT_REQ_DATE</code>.
     */
    public GrnIndentDetailsRecord setIndentReqDate(LocalDate value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.INDENT_REQ_DATE</code>.
     */
    public LocalDate getIndentReqDate() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.RSM_CODE</code>.
     */
    public GrnIndentDetailsRecord setRsmCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.RSM_CODE</code>.
     */
    public String getRsmCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.MODEL</code>.
     */
    public GrnIndentDetailsRecord setModel(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.MODEL</code>.
     */
    public String getModel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.CFA_CODE</code>.
     */
    public GrnIndentDetailsRecord setCfaCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.CFA_CODE</code>.
     */
    public String getCfaCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.CFA_NAME</code>.
     */
    public GrnIndentDetailsRecord setCfaName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.CFA_NAME</code>.
     */
    public String getCfaName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.QTY</code>.
     */
    public GrnIndentDetailsRecord setQty(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.QTY</code>.
     */
    public String getQty() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.STATUS</code>.
     */
    public GrnIndentDetailsRecord setStatus(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.CREATED_BY</code>.
     */
    public GrnIndentDetailsRecord setCreatedBy(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.CREATED_ON</code>.
     */
    public GrnIndentDetailsRecord setCreatedOn(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.UPDATED_BY</code>.
     */
    public GrnIndentDetailsRecord setUpdatedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.UPDATED_ON</code>.
     */
    public GrnIndentDetailsRecord setUpdatedOn(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.UPDATED_ON</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.PR_NO</code>.
     */
    public GrnIndentDetailsRecord setPrNo(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.PR_NO</code>.
     */
    public String getPrNo() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.PR_CREATED_ON</code>.
     */
    public GrnIndentDetailsRecord setPrCreatedOn(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.PR_CREATED_ON</code>.
     */
    public LocalDateTime getPrCreatedOn() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.PR_CREATED_BY</code>.
     */
    public GrnIndentDetailsRecord setPrCreatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.PR_CREATED_BY</code>.
     */
    public String getPrCreatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.STORAGE_LOCATION</code>.
     */
    public GrnIndentDetailsRecord setStorageLocation(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.STORAGE_LOCATION</code>.
     */
    public String getStorageLocation() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.DIVISION</code>.
     */
    public GrnIndentDetailsRecord setDivision(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.DIVISION</code>.
     */
    public String getDivision() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.AVAILABLE_QTY</code>.
     */
    public GrnIndentDetailsRecord setAvailableQty(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.AVAILABLE_QTY</code>.
     */
    public String getAvailableQty() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.PO_NO</code>.
     */
    public GrnIndentDetailsRecord setPoNo(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.PO_NO</code>.
     */
    public String getPoNo() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.RECEIVING_LOCATION</code>.
     */
    public GrnIndentDetailsRecord setReceivingLocation(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.RECEIVING_LOCATION</code>.
     */
    public String getReceivingLocation() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.INVOICE_NO</code>.
     */
    public GrnIndentDetailsRecord setInvoiceNo(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.INVOICE_NO</code>.
     */
    public String getInvoiceNo() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_indent_details.INVOICE_DATE</code>.
     */
    public GrnIndentDetailsRecord setInvoiceDate(LocalDate value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_indent_details.INVOICE_DATE</code>.
     */
    public LocalDate getInvoiceDate() {
        return (LocalDate) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<String, LocalDate, String, String, String> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, LocalDate, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, String, String, String, String, LocalDate> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, LocalDate, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, String, String, String, String, LocalDate> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.COMP_CODE;
    }

    @Override
    public Field<LocalDate> field2() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.INDENT_REQ_DATE;
    }

    @Override
    public Field<String> field3() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.RSM_CODE;
    }

    @Override
    public Field<String> field4() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.MODEL;
    }

    @Override
    public Field<String> field5() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.CFA_CODE;
    }

    @Override
    public Field<String> field6() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.CFA_NAME;
    }

    @Override
    public Field<String> field7() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.QTY;
    }

    @Override
    public Field<String> field8() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.STATUS;
    }

    @Override
    public Field<String> field9() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.CREATED_ON;
    }

    @Override
    public Field<String> field11() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.UPDATED_ON;
    }

    @Override
    public Field<String> field13() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.PR_NO;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.PR_CREATED_ON;
    }

    @Override
    public Field<String> field15() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.PR_CREATED_BY;
    }

    @Override
    public Field<String> field16() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.STORAGE_LOCATION;
    }

    @Override
    public Field<String> field17() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.DIVISION;
    }

    @Override
    public Field<String> field18() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.AVAILABLE_QTY;
    }

    @Override
    public Field<String> field19() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.PO_NO;
    }

    @Override
    public Field<String> field20() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.RECEIVING_LOCATION;
    }

    @Override
    public Field<String> field21() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.INVOICE_NO;
    }

    @Override
    public Field<LocalDate> field22() {
        return GrnIndentDetails.GRN_INDENT_DETAILS.INVOICE_DATE;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public LocalDate component2() {
        return getIndentReqDate();
    }

    @Override
    public String component3() {
        return getRsmCode();
    }

    @Override
    public String component4() {
        return getModel();
    }

    @Override
    public String component5() {
        return getCfaCode();
    }

    @Override
    public String component6() {
        return getCfaName();
    }

    @Override
    public String component7() {
        return getQty();
    }

    @Override
    public String component8() {
        return getStatus();
    }

    @Override
    public String component9() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component10() {
        return getCreatedOn();
    }

    @Override
    public String component11() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime component12() {
        return getUpdatedOn();
    }

    @Override
    public String component13() {
        return getPrNo();
    }

    @Override
    public LocalDateTime component14() {
        return getPrCreatedOn();
    }

    @Override
    public String component15() {
        return getPrCreatedBy();
    }

    @Override
    public String component16() {
        return getStorageLocation();
    }

    @Override
    public String component17() {
        return getDivision();
    }

    @Override
    public String component18() {
        return getAvailableQty();
    }

    @Override
    public String component19() {
        return getPoNo();
    }

    @Override
    public String component20() {
        return getReceivingLocation();
    }

    @Override
    public String component21() {
        return getInvoiceNo();
    }

    @Override
    public LocalDate component22() {
        return getInvoiceDate();
    }

    @Override
    public String value1() {
        return getCompCode();
    }

    @Override
    public LocalDate value2() {
        return getIndentReqDate();
    }

    @Override
    public String value3() {
        return getRsmCode();
    }

    @Override
    public String value4() {
        return getModel();
    }

    @Override
    public String value5() {
        return getCfaCode();
    }

    @Override
    public String value6() {
        return getCfaName();
    }

    @Override
    public String value7() {
        return getQty();
    }

    @Override
    public String value8() {
        return getStatus();
    }

    @Override
    public String value9() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value10() {
        return getCreatedOn();
    }

    @Override
    public String value11() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime value12() {
        return getUpdatedOn();
    }

    @Override
    public String value13() {
        return getPrNo();
    }

    @Override
    public LocalDateTime value14() {
        return getPrCreatedOn();
    }

    @Override
    public String value15() {
        return getPrCreatedBy();
    }

    @Override
    public String value16() {
        return getStorageLocation();
    }

    @Override
    public String value17() {
        return getDivision();
    }

    @Override
    public String value18() {
        return getAvailableQty();
    }

    @Override
    public String value19() {
        return getPoNo();
    }

    @Override
    public String value20() {
        return getReceivingLocation();
    }

    @Override
    public String value21() {
        return getInvoiceNo();
    }

    @Override
    public LocalDate value22() {
        return getInvoiceDate();
    }

    @Override
    public GrnIndentDetailsRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value2(LocalDate value) {
        setIndentReqDate(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value3(String value) {
        setRsmCode(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value4(String value) {
        setModel(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value5(String value) {
        setCfaCode(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value6(String value) {
        setCfaName(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value7(String value) {
        setQty(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value8(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value9(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value10(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value11(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value12(LocalDateTime value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value13(String value) {
        setPrNo(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value14(LocalDateTime value) {
        setPrCreatedOn(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value15(String value) {
        setPrCreatedBy(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value16(String value) {
        setStorageLocation(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value17(String value) {
        setDivision(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value18(String value) {
        setAvailableQty(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value19(String value) {
        setPoNo(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value20(String value) {
        setReceivingLocation(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value21(String value) {
        setInvoiceNo(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord value22(LocalDate value) {
        setInvoiceDate(value);
        return this;
    }

    @Override
    public GrnIndentDetailsRecord values(String value1, LocalDate value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, LocalDateTime value10, String value11, LocalDateTime value12, String value13, LocalDateTime value14, String value15, String value16, String value17, String value18, String value19, String value20, String value21, LocalDate value22) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GrnIndentDetailsRecord
     */
    public GrnIndentDetailsRecord() {
        super(GrnIndentDetails.GRN_INDENT_DETAILS);
    }

    /**
     * Create a detached, initialised GrnIndentDetailsRecord
     */
    public GrnIndentDetailsRecord(String compCode, LocalDate indentReqDate, String rsmCode, String model, String cfaCode, String cfaName, String qty, String status, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn, String prNo, LocalDateTime prCreatedOn, String prCreatedBy, String storageLocation, String division, String availableQty, String poNo, String receivingLocation, String invoiceNo, LocalDate invoiceDate) {
        super(GrnIndentDetails.GRN_INDENT_DETAILS);

        setCompCode(compCode);
        setIndentReqDate(indentReqDate);
        setRsmCode(rsmCode);
        setModel(model);
        setCfaCode(cfaCode);
        setCfaName(cfaName);
        setQty(qty);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setUpdatedBy(updatedBy);
        setUpdatedOn(updatedOn);
        setPrNo(prNo);
        setPrCreatedOn(prCreatedOn);
        setPrCreatedBy(prCreatedBy);
        setStorageLocation(storageLocation);
        setDivision(division);
        setAvailableQty(availableQty);
        setPoNo(poNo);
        setReceivingLocation(receivingLocation);
        setInvoiceNo(invoiceNo);
        setInvoiceDate(invoiceDate);
    }
}
