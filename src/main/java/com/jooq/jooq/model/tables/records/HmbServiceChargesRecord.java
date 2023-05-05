/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.HmbServiceCharges;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HmbServiceChargesRecord extends UpdatableRecordImpl<HmbServiceChargesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.COMP_CODE</code>.
     */
    public HmbServiceChargesRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.BILL_NUM</code>.
     */
    public HmbServiceChargesRecord setBillNum(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.BILL_NUM</code>.
     */
    public String getBillNum() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.WERKS</code>.
     */
    public HmbServiceChargesRecord setWerks(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.WERKS</code>.
     */
    public String getWerks() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.PARVW</code>.
     */
    public HmbServiceChargesRecord setParvw(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.PARVW</code>.
     */
    public String getParvw() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.SOCIETY</code>.
     */
    public HmbServiceChargesRecord setSociety(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.SOCIETY</code>.
     */
    public String getSociety() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.C_NAME</code>.
     */
    public HmbServiceChargesRecord setCName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.C_NAME</code>.
     */
    public String getCName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.GESTYP</code>.
     */
    public HmbServiceChargesRecord setGestyp(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.GESTYP</code>.
     */
    public String getGestyp() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.LIFNR</code>.
     */
    public HmbServiceChargesRecord setLifnr(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.LIFNR</code>.
     */
    public String getLifnr() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.C_START_DATE</code>.
     */
    public HmbServiceChargesRecord setCStartDate(LocalDate value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.C_START_DATE</code>.
     */
    public LocalDate getCStartDate() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.C_END_DATE</code>.
     */
    public HmbServiceChargesRecord setCEndDate(LocalDate value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.C_END_DATE</code>.
     */
    public LocalDate getCEndDate() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.AVG_QTY</code>.
     */
    public HmbServiceChargesRecord setAvgQty(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.AVG_QTY</code>.
     */
    public String getAvgQty() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.PAYEE</code>.
     */
    public HmbServiceChargesRecord setPayee(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.PAYEE</code>.
     */
    public String getPayee() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.NO_OF_DAYS</code>.
     */
    public HmbServiceChargesRecord setNoOfDays(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.NO_OF_DAYS</code>.
     */
    public String getNoOfDays() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.ACT_NO_OF_DAYS</code>.
     */
    public HmbServiceChargesRecord setActNoOfDays(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.ACT_NO_OF_DAYS</code>.
     */
    public String getActNoOfDays() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.INC_AMT_INCHARGE</code>.
     */
    public HmbServiceChargesRecord setIncAmtIncharge(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.INC_AMT_INCHARGE</code>.
     */
    public BigDecimal getIncAmtIncharge() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.SAMPLE_MILK_AMT</code>.
     */
    public HmbServiceChargesRecord setSampleMilkAmt(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.SAMPLE_MILK_AMT</code>.
     */
    public BigDecimal getSampleMilkAmt() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.SMS_AMT</code>.
     */
    public HmbServiceChargesRecord setSmsAmt(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.SMS_AMT</code>.
     */
    public BigDecimal getSmsAmt() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.CENTER_RENT</code>.
     */
    public HmbServiceChargesRecord setCenterRent(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.CENTER_RENT</code>.
     */
    public BigDecimal getCenterRent() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.CENTER_EB</code>.
     */
    public HmbServiceChargesRecord setCenterEb(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.CENTER_EB</code>.
     */
    public BigDecimal getCenterEb() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.QTY_COMM</code>.
     */
    public HmbServiceChargesRecord setQtyComm(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.QTY_COMM</code>.
     */
    public BigDecimal getQtyComm() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.QTY_ASSU</code>.
     */
    public HmbServiceChargesRecord setQtyAssu(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.QTY_ASSU</code>.
     */
    public BigDecimal getQtyAssu() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TS_TALLY</code>.
     */
    public HmbServiceChargesRecord setTsTally(BigDecimal value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TS_TALLY</code>.
     */
    public BigDecimal getTsTally() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TEST_SAMPLE</code>.
     */
    public HmbServiceChargesRecord setTestSample(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TEST_SAMPLE</code>.
     */
    public BigDecimal getTestSample() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TEST_COMM</code>.
     */
    public HmbServiceChargesRecord setTestComm(BigDecimal value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TEST_COMM</code>.
     */
    public BigDecimal getTestComm() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.ADLT_COMM</code>.
     */
    public HmbServiceChargesRecord setAdltComm(BigDecimal value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.ADLT_COMM</code>.
     */
    public BigDecimal getAdltComm() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.SPIL_COMM</code>.
     */
    public HmbServiceChargesRecord setSpilComm(BigDecimal value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.SPIL_COMM</code>.
     */
    public BigDecimal getSpilComm() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TS_COMM</code>.
     */
    public HmbServiceChargesRecord setTsComm(BigDecimal value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TS_COMM</code>.
     */
    public BigDecimal getTsComm() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.INC_AMT</code>.
     */
    public HmbServiceChargesRecord setIncAmt(BigDecimal value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.INC_AMT</code>.
     */
    public BigDecimal getIncAmt() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.ARREAR_AMT</code>.
     */
    public HmbServiceChargesRecord setArrearAmt(BigDecimal value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.ARREAR_AMT</code>.
     */
    public BigDecimal getArrearAmt() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.LOAN_INCENTIVE1</code>.
     */
    public HmbServiceChargesRecord setLoanIncentive1(BigDecimal value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.LOAN_INCENTIVE1</code>.
     */
    public BigDecimal getLoanIncentive1() {
        return (BigDecimal) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.FEED_AMT</code>.
     */
    public HmbServiceChargesRecord setFeedAmt(BigDecimal value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.FEED_AMT</code>.
     */
    public BigDecimal getFeedAmt() {
        return (BigDecimal) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.FIELD_INCENTIVE</code>.
     */
    public HmbServiceChargesRecord setFieldIncentive(BigDecimal value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.FIELD_INCENTIVE</code>.
     */
    public BigDecimal getFieldIncentive() {
        return (BigDecimal) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TDS_ARREAR</code>.
     */
    public HmbServiceChargesRecord setTdsArrear(BigDecimal value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TDS_ARREAR</code>.
     */
    public BigDecimal getTdsArrear() {
        return (BigDecimal) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TDS_INCENTIVE</code>.
     */
    public HmbServiceChargesRecord setTdsIncentive(BigDecimal value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TDS_INCENTIVE</code>.
     */
    public BigDecimal getTdsIncentive() {
        return (BigDecimal) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TDS_DED</code>.
     */
    public HmbServiceChargesRecord setTdsDed(BigDecimal value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TDS_DED</code>.
     */
    public BigDecimal getTdsDed() {
        return (BigDecimal) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TOTAL_TDS</code>.
     */
    public HmbServiceChargesRecord setTotalTds(BigDecimal value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TOTAL_TDS</code>.
     */
    public BigDecimal getTotalTds() {
        return (BigDecimal) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TOTAL</code>.
     */
    public HmbServiceChargesRecord setTotal(BigDecimal value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TOTAL</code>.
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.DEDUCTIONS</code>.
     */
    public HmbServiceChargesRecord setDeductions(BigDecimal value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.DEDUCTIONS</code>.
     */
    public BigDecimal getDeductions() {
        return (BigDecimal) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.ACT_DED</code>.
     */
    public HmbServiceChargesRecord setActDed(BigDecimal value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.ACT_DED</code>.
     */
    public BigDecimal getActDed() {
        return (BigDecimal) get(38);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.NET_AMT</code>.
     */
    public HmbServiceChargesRecord setNetAmt(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.NET_AMT</code>.
     */
    public String getNetAmt() {
        return (String) get(39);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.UOM_KG</code>.
     */
    public HmbServiceChargesRecord setUomKg(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.UOM_KG</code>.
     */
    public String getUomKg() {
        return (String) get(40);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.LOCAL_CURR</code>.
     */
    public HmbServiceChargesRecord setLocalCurr(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.LOCAL_CURR</code>.
     */
    public String getLocalCurr() {
        return (String) get(41);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.POST_DAT</code>.
     */
    public HmbServiceChargesRecord setPostDat(LocalDate value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.POST_DAT</code>.
     */
    public LocalDate getPostDat() {
        return (LocalDate) get(42);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.POST_BY</code>.
     */
    public HmbServiceChargesRecord setPostBy(String value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.POST_BY</code>.
     */
    public String getPostBy() {
        return (String) get(43);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.DOCNO</code>.
     */
    public HmbServiceChargesRecord setDocno(String value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.DOCNO</code>.
     */
    public String getDocno() {
        return (String) get(44);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.DOCNO_NON_TDS</code>.
     */
    public HmbServiceChargesRecord setDocnoNonTds(String value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.DOCNO_NON_TDS</code>.
     */
    public String getDocnoNonTds() {
        return (String) get(45);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TRANSFER_DAT</code>.
     */
    public HmbServiceChargesRecord setTransferDat(LocalDate value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TRANSFER_DAT</code>.
     */
    public LocalDate getTransferDat() {
        return (LocalDate) get(46);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TRANSFER_BY</code>.
     */
    public HmbServiceChargesRecord setTransferBy(String value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TRANSFER_BY</code>.
     */
    public String getTransferBy() {
        return (String) get(47);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.WHT_TYPE</code>.
     */
    public HmbServiceChargesRecord setWhtType(String value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.WHT_TYPE</code>.
     */
    public String getWhtType() {
        return (String) get(48);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.WHT_CODE</code>.
     */
    public HmbServiceChargesRecord setWhtCode(String value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.WHT_CODE</code>.
     */
    public String getWhtCode() {
        return (String) get(49);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.TDS_PERC</code>.
     */
    public HmbServiceChargesRecord setTdsPerc(String value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.TDS_PERC</code>.
     */
    public String getTdsPerc() {
        return (String) get(50);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.STATUS</code>.
     */
    public HmbServiceChargesRecord setStatus(String value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(51);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.CREATED_BY</code>.
     */
    public HmbServiceChargesRecord setCreatedBy(Integer value) {
        set(52, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(52);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.CREATED_ON</code>.
     */
    public HmbServiceChargesRecord setCreatedOn(LocalDateTime value) {
        set(53, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(53);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.LAST_CHANGED_BY</code>.
     */
    public HmbServiceChargesRecord setLastChangedBy(Integer value) {
        set(54, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(54);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_charges.LAST_CHANGED_ON</code>.
     */
    public HmbServiceChargesRecord setLastChangedOn(LocalDateTime value) {
        set(55, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_charges.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(55);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record10<String, String, String, String, String, String, String, String, LocalDate, LocalDate> key() {
        return (Record10) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HmbServiceChargesRecord
     */
    public HmbServiceChargesRecord() {
        super(HmbServiceCharges.HMB_SERVICE_CHARGES);
    }

    /**
     * Create a detached, initialised HmbServiceChargesRecord
     */
    public HmbServiceChargesRecord(String compCode, String billNum, String werks, String parvw, String society, String cName, String gestyp, String lifnr, LocalDate cStartDate, LocalDate cEndDate, String avgQty, String payee, String noOfDays, String actNoOfDays, BigDecimal incAmtIncharge, BigDecimal sampleMilkAmt, BigDecimal smsAmt, BigDecimal centerRent, BigDecimal centerEb, BigDecimal qtyComm, BigDecimal qtyAssu, BigDecimal tsTally, BigDecimal testSample, BigDecimal testComm, BigDecimal adltComm, BigDecimal spilComm, BigDecimal tsComm, BigDecimal incAmt, BigDecimal arrearAmt, BigDecimal loanIncentive1, BigDecimal feedAmt, BigDecimal fieldIncentive, BigDecimal tdsArrear, BigDecimal tdsIncentive, BigDecimal tdsDed, BigDecimal totalTds, BigDecimal total, BigDecimal deductions, BigDecimal actDed, String netAmt, String uomKg, String localCurr, LocalDate postDat, String postBy, String docno, String docnoNonTds, LocalDate transferDat, String transferBy, String whtType, String whtCode, String tdsPerc, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(HmbServiceCharges.HMB_SERVICE_CHARGES);

        setCompCode(compCode);
        setBillNum(billNum);
        setWerks(werks);
        setParvw(parvw);
        setSociety(society);
        setCName(cName);
        setGestyp(gestyp);
        setLifnr(lifnr);
        setCStartDate(cStartDate);
        setCEndDate(cEndDate);
        setAvgQty(avgQty);
        setPayee(payee);
        setNoOfDays(noOfDays);
        setActNoOfDays(actNoOfDays);
        setIncAmtIncharge(incAmtIncharge);
        setSampleMilkAmt(sampleMilkAmt);
        setSmsAmt(smsAmt);
        setCenterRent(centerRent);
        setCenterEb(centerEb);
        setQtyComm(qtyComm);
        setQtyAssu(qtyAssu);
        setTsTally(tsTally);
        setTestSample(testSample);
        setTestComm(testComm);
        setAdltComm(adltComm);
        setSpilComm(spilComm);
        setTsComm(tsComm);
        setIncAmt(incAmt);
        setArrearAmt(arrearAmt);
        setLoanIncentive1(loanIncentive1);
        setFeedAmt(feedAmt);
        setFieldIncentive(fieldIncentive);
        setTdsArrear(tdsArrear);
        setTdsIncentive(tdsIncentive);
        setTdsDed(tdsDed);
        setTotalTds(totalTds);
        setTotal(total);
        setDeductions(deductions);
        setActDed(actDed);
        setNetAmt(netAmt);
        setUomKg(uomKg);
        setLocalCurr(localCurr);
        setPostDat(postDat);
        setPostBy(postBy);
        setDocno(docno);
        setDocnoNonTds(docnoNonTds);
        setTransferDat(transferDat);
        setTransferBy(transferBy);
        setWhtType(whtType);
        setWhtCode(whtCode);
        setTdsPerc(tdsPerc);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
