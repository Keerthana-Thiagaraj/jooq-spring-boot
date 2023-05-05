/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.ArReport;

import java.math.BigDecimal;
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
public class ArReportRecord extends UpdatableRecordImpl<ArReportRecord> implements Record22<String, String, String, String, Integer, String, LocalDate, LocalDate, BigDecimal, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String, BigDecimal, BigDecimal, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.COMP_CODE</code>.
     */
    public ArReportRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.CUSTOMER_CODE</code>.
     */
    public ArReportRecord setCustomerCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.DOC_NO</code>.
     */
    public ArReportRecord setDocNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.DOC_NO</code>.
     */
    public String getDocNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.ITEM_NO</code>.
     */
    public ArReportRecord setItemNo(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.ITEM_NO</code>.
     */
    public String getItemNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.FI_YEAR</code>.
     */
    public ArReportRecord setFiYear(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.FI_YEAR</code>.
     */
    public Integer getFiYear() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.DOC_TYPE</code>.
     */
    public ArReportRecord setDocType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.DOC_TYPE</code>.
     */
    public String getDocType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.DOC_DATE</code>.
     */
    public ArReportRecord setDocDate(LocalDate value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.DOC_DATE</code>.
     */
    public LocalDate getDocDate() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.POSTING_DATE</code>.
     */
    public ArReportRecord setPostingDate(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.POSTING_DATE</code>.
     */
    public LocalDate getPostingDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.AMOUNT</code>.
     */
    public ArReportRecord setAmount(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.AMOUNT</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.DB_CR_IND</code>.
     */
    public ArReportRecord setDbCrInd(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.DB_CR_IND</code>.
     */
    public String getDbCrInd() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.DB_CR_IND_DESC</code>.
     */
    public ArReportRecord setDbCrIndDesc(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.DB_CR_IND_DESC</code>.
     */
    public String getDbCrIndDesc() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.STATUS</code>.
     */
    public ArReportRecord setStatus(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.CREATED_BY</code>.
     */
    public ArReportRecord setCreatedBy(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.CREATED_ON</code>.
     */
    public ArReportRecord setCreatedOn(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.LAST_CHANGED_BY</code>.
     */
    public ArReportRecord setLastChangedBy(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.LAST_CHANGED_ON</code>.
     */
    public ArReportRecord setLastChangedOn(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.ITEM_TEXT</code>.
     */
    public ArReportRecord setItemText(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.ITEM_TEXT</code>.
     */
    public String getItemText() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.ITEM_TYPE</code>.
     */
    public ArReportRecord setItemType(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.ITEM_TYPE</code>.
     */
    public String getItemType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.TDS_AMOUNT</code>.
     */
    public ArReportRecord setTdsAmount(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.TDS_AMOUNT</code>.
     */
    public BigDecimal getTdsAmount() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.NET_AMOUNT</code>.
     */
    public ArReportRecord setNetAmount(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.NET_AMOUNT</code>.
     */
    public BigDecimal getNetAmount() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.SP_GL_IND</code>.
     */
    public ArReportRecord setSpGlInd(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.SP_GL_IND</code>.
     */
    public String getSpGlInd() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ar_report.REF_DOC_NO</code>.
     */
    public ArReportRecord setRefDocNo(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ar_report.REF_DOC_NO</code>.
     */
    public String getRefDocNo() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<String, String, String, Integer, String> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, Integer, String, LocalDate, LocalDate, BigDecimal, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String, BigDecimal, BigDecimal, String, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, String, Integer, String, LocalDate, LocalDate, BigDecimal, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String, BigDecimal, BigDecimal, String, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ArReport.AR_REPORT.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return ArReport.AR_REPORT.CUSTOMER_CODE;
    }

    @Override
    public Field<String> field3() {
        return ArReport.AR_REPORT.DOC_NO;
    }

    @Override
    public Field<String> field4() {
        return ArReport.AR_REPORT.ITEM_NO;
    }

    @Override
    public Field<Integer> field5() {
        return ArReport.AR_REPORT.FI_YEAR;
    }

    @Override
    public Field<String> field6() {
        return ArReport.AR_REPORT.DOC_TYPE;
    }

    @Override
    public Field<LocalDate> field7() {
        return ArReport.AR_REPORT.DOC_DATE;
    }

    @Override
    public Field<LocalDate> field8() {
        return ArReport.AR_REPORT.POSTING_DATE;
    }

    @Override
    public Field<BigDecimal> field9() {
        return ArReport.AR_REPORT.AMOUNT;
    }

    @Override
    public Field<String> field10() {
        return ArReport.AR_REPORT.DB_CR_IND;
    }

    @Override
    public Field<String> field11() {
        return ArReport.AR_REPORT.DB_CR_IND_DESC;
    }

    @Override
    public Field<String> field12() {
        return ArReport.AR_REPORT.STATUS;
    }

    @Override
    public Field<Integer> field13() {
        return ArReport.AR_REPORT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return ArReport.AR_REPORT.CREATED_ON;
    }

    @Override
    public Field<Integer> field15() {
        return ArReport.AR_REPORT.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return ArReport.AR_REPORT.LAST_CHANGED_ON;
    }

    @Override
    public Field<String> field17() {
        return ArReport.AR_REPORT.ITEM_TEXT;
    }

    @Override
    public Field<String> field18() {
        return ArReport.AR_REPORT.ITEM_TYPE;
    }

    @Override
    public Field<BigDecimal> field19() {
        return ArReport.AR_REPORT.TDS_AMOUNT;
    }

    @Override
    public Field<BigDecimal> field20() {
        return ArReport.AR_REPORT.NET_AMOUNT;
    }

    @Override
    public Field<String> field21() {
        return ArReport.AR_REPORT.SP_GL_IND;
    }

    @Override
    public Field<String> field22() {
        return ArReport.AR_REPORT.REF_DOC_NO;
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
        return getDocNo();
    }

    @Override
    public String component4() {
        return getItemNo();
    }

    @Override
    public Integer component5() {
        return getFiYear();
    }

    @Override
    public String component6() {
        return getDocType();
    }

    @Override
    public LocalDate component7() {
        return getDocDate();
    }

    @Override
    public LocalDate component8() {
        return getPostingDate();
    }

    @Override
    public BigDecimal component9() {
        return getAmount();
    }

    @Override
    public String component10() {
        return getDbCrInd();
    }

    @Override
    public String component11() {
        return getDbCrIndDesc();
    }

    @Override
    public String component12() {
        return getStatus();
    }

    @Override
    public Integer component13() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatedOn();
    }

    @Override
    public Integer component15() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component16() {
        return getLastChangedOn();
    }

    @Override
    public String component17() {
        return getItemText();
    }

    @Override
    public String component18() {
        return getItemType();
    }

    @Override
    public BigDecimal component19() {
        return getTdsAmount();
    }

    @Override
    public BigDecimal component20() {
        return getNetAmount();
    }

    @Override
    public String component21() {
        return getSpGlInd();
    }

    @Override
    public String component22() {
        return getRefDocNo();
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
        return getDocNo();
    }

    @Override
    public String value4() {
        return getItemNo();
    }

    @Override
    public Integer value5() {
        return getFiYear();
    }

    @Override
    public String value6() {
        return getDocType();
    }

    @Override
    public LocalDate value7() {
        return getDocDate();
    }

    @Override
    public LocalDate value8() {
        return getPostingDate();
    }

    @Override
    public BigDecimal value9() {
        return getAmount();
    }

    @Override
    public String value10() {
        return getDbCrInd();
    }

    @Override
    public String value11() {
        return getDbCrIndDesc();
    }

    @Override
    public String value12() {
        return getStatus();
    }

    @Override
    public Integer value13() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatedOn();
    }

    @Override
    public Integer value15() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value16() {
        return getLastChangedOn();
    }

    @Override
    public String value17() {
        return getItemText();
    }

    @Override
    public String value18() {
        return getItemType();
    }

    @Override
    public BigDecimal value19() {
        return getTdsAmount();
    }

    @Override
    public BigDecimal value20() {
        return getNetAmount();
    }

    @Override
    public String value21() {
        return getSpGlInd();
    }

    @Override
    public String value22() {
        return getRefDocNo();
    }

    @Override
    public ArReportRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public ArReportRecord value2(String value) {
        setCustomerCode(value);
        return this;
    }

    @Override
    public ArReportRecord value3(String value) {
        setDocNo(value);
        return this;
    }

    @Override
    public ArReportRecord value4(String value) {
        setItemNo(value);
        return this;
    }

    @Override
    public ArReportRecord value5(Integer value) {
        setFiYear(value);
        return this;
    }

    @Override
    public ArReportRecord value6(String value) {
        setDocType(value);
        return this;
    }

    @Override
    public ArReportRecord value7(LocalDate value) {
        setDocDate(value);
        return this;
    }

    @Override
    public ArReportRecord value8(LocalDate value) {
        setPostingDate(value);
        return this;
    }

    @Override
    public ArReportRecord value9(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public ArReportRecord value10(String value) {
        setDbCrInd(value);
        return this;
    }

    @Override
    public ArReportRecord value11(String value) {
        setDbCrIndDesc(value);
        return this;
    }

    @Override
    public ArReportRecord value12(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public ArReportRecord value13(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ArReportRecord value14(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ArReportRecord value15(Integer value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public ArReportRecord value16(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public ArReportRecord value17(String value) {
        setItemText(value);
        return this;
    }

    @Override
    public ArReportRecord value18(String value) {
        setItemType(value);
        return this;
    }

    @Override
    public ArReportRecord value19(BigDecimal value) {
        setTdsAmount(value);
        return this;
    }

    @Override
    public ArReportRecord value20(BigDecimal value) {
        setNetAmount(value);
        return this;
    }

    @Override
    public ArReportRecord value21(String value) {
        setSpGlInd(value);
        return this;
    }

    @Override
    public ArReportRecord value22(String value) {
        setRefDocNo(value);
        return this;
    }

    @Override
    public ArReportRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, LocalDate value7, LocalDate value8, BigDecimal value9, String value10, String value11, String value12, Integer value13, LocalDateTime value14, Integer value15, LocalDateTime value16, String value17, String value18, BigDecimal value19, BigDecimal value20, String value21, String value22) {
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
     * Create a detached ArReportRecord
     */
    public ArReportRecord() {
        super(ArReport.AR_REPORT);
    }

    /**
     * Create a detached, initialised ArReportRecord
     */
    public ArReportRecord(String compCode, String customerCode, String docNo, String itemNo, Integer fiYear, String docType, LocalDate docDate, LocalDate postingDate, BigDecimal amount, String dbCrInd, String dbCrIndDesc, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn, String itemText, String itemType, BigDecimal tdsAmount, BigDecimal netAmount, String spGlInd, String refDocNo) {
        super(ArReport.AR_REPORT);

        setCompCode(compCode);
        setCustomerCode(customerCode);
        setDocNo(docNo);
        setItemNo(itemNo);
        setFiYear(fiYear);
        setDocType(docType);
        setDocDate(docDate);
        setPostingDate(postingDate);
        setAmount(amount);
        setDbCrInd(dbCrInd);
        setDbCrIndDesc(dbCrIndDesc);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setItemText(itemText);
        setItemType(itemType);
        setTdsAmount(tdsAmount);
        setNetAmount(netAmount);
        setSpGlInd(spGlInd);
        setRefDocNo(refDocNo);
    }
}