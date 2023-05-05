/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.LogisticArrear;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.jooq.Record3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogisticArrearRecord extends UpdatableRecordImpl<LogisticArrearRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.COMP_CODE</code>.
     */
    public LogisticArrearRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.DOC_ID</code>.
     */
    public LogisticArrearRecord setDocId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.DOC_ID</code>.
     */
    public String getDocId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.PLANT</code>.
     */
    public LogisticArrearRecord setPlant(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.PLANT</code>.
     */
    public String getPlant() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.POST_DAT</code>.
     */
    public LogisticArrearRecord setPostDat(LocalDate value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.POST_DAT</code>.
     */
    public LocalDate getPostDat() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.ARREAR_CODE</code>.
     */
    public LogisticArrearRecord setArrearCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.ARREAR_CODE</code>.
     */
    public String getArrearCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.ARREAR_DAT</code>.
     */
    public LogisticArrearRecord setArrearDat(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.ARREAR_DAT</code>.
     */
    public LocalDate getArrearDat() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.ARREAR_SHIFT</code>.
     */
    public LogisticArrearRecord setArrearShift(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.ARREAR_SHIFT</code>.
     */
    public String getArrearShift() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.ROUTE_NO</code>.
     */
    public LogisticArrearRecord setRouteNo(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.ROUTE_NO</code>.
     */
    public String getRouteNo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.TRANSPORTER</code>.
     */
    public LogisticArrearRecord setTransporter(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.TRANSPORTER</code>.
     */
    public String getTransporter() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.T_NAME</code>.
     */
    public LogisticArrearRecord setTName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.T_NAME</code>.
     */
    public String getTName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.TRUCK_NO</code>.
     */
    public LogisticArrearRecord setTruckNo(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.TRUCK_NO</code>.
     */
    public String getTruckNo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.STATUS</code>.
     */
    public LogisticArrearRecord setStatus(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.TDATE</code>.
     */
    public LogisticArrearRecord setTdate(LocalDate value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.TDATE</code>.
     */
    public LocalDate getTdate() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.SAKNR</code>.
     */
    public LogisticArrearRecord setSaknr(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.SAKNR</code>.
     */
    public String getSaknr() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.BUKRS</code>.
     */
    public LogisticArrearRecord setBukrs(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.BUKRS</code>.
     */
    public String getBukrs() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.KOSTL</code>.
     */
    public LogisticArrearRecord setKostl(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.KOSTL</code>.
     */
    public String getKostl() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.QTY</code>.
     */
    public LogisticArrearRecord setQty(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.QTY</code>.
     */
    public BigDecimal getQty() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.UOM</code>.
     */
    public LogisticArrearRecord setUom(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.UOM</code>.
     */
    public String getUom() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.AMT</code>.
     */
    public LogisticArrearRecord setAmt(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.AMT</code>.
     */
    public BigDecimal getAmt() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.RATE</code>.
     */
    public LogisticArrearRecord setRate(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.RATE</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.LOCAL_CURR</code>.
     */
    public LogisticArrearRecord setLocalCurr(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.LOCAL_CURR</code>.
     */
    public String getLocalCurr() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.REMARKS</code>.
     */
    public LogisticArrearRecord setRemarks(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.CREATED_BY</code>.
     */
    public LogisticArrearRecord setCreatedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.APPROVER</code>.
     */
    public LogisticArrearRecord setApprover(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.APPROVER</code>.
     */
    public String getApprover() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.APPROVAL_DATE</code>.
     */
    public LogisticArrearRecord setApprovalDate(LocalDate value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.APPROVAL_DATE</code>.
     */
    public LocalDate getApprovalDate() {
        return (LocalDate) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.DOCNO</code>.
     */
    public LogisticArrearRecord setDocno(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.DOCNO</code>.
     */
    public String getDocno() {
        return (String) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.PAID</code>.
     */
    public LogisticArrearRecord setPaid(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.PAID</code>.
     */
    public String getPaid() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_arrear.BILL_NUM</code>.
     */
    public LogisticArrearRecord setBillNum(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_arrear.BILL_NUM</code>.
     */
    public String getBillNum() {
        return (String) get(27);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LogisticArrearRecord
     */
    public LogisticArrearRecord() {
        super(LogisticArrear.LOGISTIC_ARREAR);
    }

    /**
     * Create a detached, initialised LogisticArrearRecord
     */
    public LogisticArrearRecord(String compCode, String docId, String plant, LocalDate postDat, String arrearCode, LocalDate arrearDat, String arrearShift, String routeNo, String transporter, String tName, String truckNo, String status, LocalDate tdate, String saknr, String bukrs, String kostl, BigDecimal qty, String uom, BigDecimal amt, BigDecimal rate, String localCurr, String remarks, String createdBy, String approver, LocalDate approvalDate, String docno, String paid, String billNum) {
        super(LogisticArrear.LOGISTIC_ARREAR);

        setCompCode(compCode);
        setDocId(docId);
        setPlant(plant);
        setPostDat(postDat);
        setArrearCode(arrearCode);
        setArrearDat(arrearDat);
        setArrearShift(arrearShift);
        setRouteNo(routeNo);
        setTransporter(transporter);
        setTName(tName);
        setTruckNo(truckNo);
        setStatus(status);
        setTdate(tdate);
        setSaknr(saknr);
        setBukrs(bukrs);
        setKostl(kostl);
        setQty(qty);
        setUom(uom);
        setAmt(amt);
        setRate(rate);
        setLocalCurr(localCurr);
        setRemarks(remarks);
        setCreatedBy(createdBy);
        setApprover(approver);
        setApprovalDate(approvalDate);
        setDocno(docno);
        setPaid(paid);
        setBillNum(billNum);
    }
}