/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.HmbServiceDeduction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HmbServiceDeductionRecord extends UpdatableRecordImpl<HmbServiceDeductionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.COMP_CODE</code>.
     */
    public HmbServiceDeductionRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDOCNO</code>.
     */
    public HmbServiceDeductionRecord setZdocno(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDOCNO</code>.
     */
    public String getZdocno() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDOCITEM</code>.
     */
    public HmbServiceDeductionRecord setZdocitem(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDOCITEM</code>.
     */
    public Integer getZdocitem() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDEDTYPE</code>.
     */
    public HmbServiceDeductionRecord setZdedtype(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDEDTYPE</code>.
     */
    public String getZdedtype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZLOANTYPE</code>.
     */
    public HmbServiceDeductionRecord setZloantype(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZLOANTYPE</code>.
     */
    public String getZloantype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZEDATE</code>.
     */
    public HmbServiceDeductionRecord setZedate(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZEDATE</code>.
     */
    public LocalDate getZedate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZSEQUENCE</code>.
     */
    public HmbServiceDeductionRecord setZsequence(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZSEQUENCE</code>.
     */
    public Integer getZsequence() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZVENDOR</code>.
     */
    public HmbServiceDeductionRecord setZvendor(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZVENDOR</code>.
     */
    public String getZvendor() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.BUKRS</code>.
     */
    public HmbServiceDeductionRecord setBukrs(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.BUKRS</code>.
     */
    public String getBukrs() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZCUSTOMER</code>.
     */
    public HmbServiceDeductionRecord setZcustomer(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZCUSTOMER</code>.
     */
    public String getZcustomer() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.WERKS</code>.
     */
    public HmbServiceDeductionRecord setWerks(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.WERKS</code>.
     */
    public String getWerks() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZSDATE</code>.
     */
    public HmbServiceDeductionRecord setZsdate(LocalDate value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZSDATE</code>.
     */
    public LocalDate getZsdate() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZCC_HMB</code>.
     */
    public HmbServiceDeductionRecord setZccHmb(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZCC_HMB</code>.
     */
    public String getZccHmb() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZBILLCYCLE</code>.
     */
    public HmbServiceDeductionRecord setZbillcycle(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZBILLCYCLE</code>.
     */
    public Integer getZbillcycle() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZAMOUNT</code>.
     */
    public HmbServiceDeductionRecord setZamount(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZAMOUNT</code>.
     */
    public BigDecimal getZamount() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZEMIAMT</code>.
     */
    public HmbServiceDeductionRecord setZemiamt(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZEMIAMT</code>.
     */
    public BigDecimal getZemiamt() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.P_AMT</code>.
     */
    public HmbServiceDeductionRecord setPAmt(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.P_AMT</code>.
     */
    public BigDecimal getPAmt() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDEDAMT</code>.
     */
    public HmbServiceDeductionRecord setZdedamt(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDEDAMT</code>.
     */
    public BigDecimal getZdedamt() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.S_AMT</code>.
     */
    public HmbServiceDeductionRecord setSAmt(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.S_AMT</code>.
     */
    public BigDecimal getSAmt() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZBALANCE</code>.
     */
    public HmbServiceDeductionRecord setZbalance(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZBALANCE</code>.
     */
    public BigDecimal getZbalance() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZLOANAC</code>.
     */
    public HmbServiceDeductionRecord setZloanac(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZLOANAC</code>.
     */
    public String getZloanac() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZBANKEY</code>.
     */
    public HmbServiceDeductionRecord setZbankey(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZBANKEY</code>.
     */
    public String getZbankey() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.SAKNR</code>.
     */
    public HmbServiceDeductionRecord setSaknr(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.SAKNR</code>.
     */
    public String getSaknr() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDEDDOC</code>.
     */
    public HmbServiceDeductionRecord setZdeddoc(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDEDDOC</code>.
     */
    public String getZdeddoc() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZPRSTA</code>.
     */
    public HmbServiceDeductionRecord setZprsta(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZPRSTA</code>.
     */
    public String getZprsta() {
        return (String) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZAPPSTA</code>.
     */
    public HmbServiceDeductionRecord setZappsta(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZAPPSTA</code>.
     */
    public String getZappsta() {
        return (String) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZAPPRBY</code>.
     */
    public HmbServiceDeductionRecord setZapprby(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZAPPRBY</code>.
     */
    public String getZapprby() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZAPPDATE</code>.
     */
    public HmbServiceDeductionRecord setZappdate(LocalDate value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZAPPDATE</code>.
     */
    public LocalDate getZappdate() {
        return (LocalDate) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZREJBY</code>.
     */
    public HmbServiceDeductionRecord setZrejby(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZREJBY</code>.
     */
    public String getZrejby() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZREJDATE</code>.
     */
    public HmbServiceDeductionRecord setZrejdate(LocalDate value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZREJDATE</code>.
     */
    public LocalDate getZrejdate() {
        return (LocalDate) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDELFG</code>.
     */
    public HmbServiceDeductionRecord setZdelfg(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDELFG</code>.
     */
    public String getZdelfg() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDELBY</code>.
     */
    public HmbServiceDeductionRecord setZdelby(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDELBY</code>.
     */
    public String getZdelby() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZDELDATE</code>.
     */
    public HmbServiceDeductionRecord setZdeldate(LocalDate value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZDELDATE</code>.
     */
    public LocalDate getZdeldate() {
        return (LocalDate) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZREMARK1</code>.
     */
    public HmbServiceDeductionRecord setZremark1(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZREMARK1</code>.
     */
    public String getZremark1() {
        return (String) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZREMARK2</code>.
     */
    public HmbServiceDeductionRecord setZremark2(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZREMARK2</code>.
     */
    public String getZremark2() {
        return (String) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ZWERKS</code>.
     */
    public HmbServiceDeductionRecord setZwerks(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ZWERKS</code>.
     */
    public String getZwerks() {
        return (String) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.ROUTE_NO</code>.
     */
    public HmbServiceDeductionRecord setRouteNo(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.ROUTE_NO</code>.
     */
    public String getRouteNo() {
        return (String) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.TRUCK_NO</code>.
     */
    public HmbServiceDeductionRecord setTruckNo(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.TRUCK_NO</code>.
     */
    public String getTruckNo() {
        return (String) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.PAID</code>.
     */
    public HmbServiceDeductionRecord setPaid(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.PAID</code>.
     */
    public String getPaid() {
        return (String) get(38);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.BILL_NUM</code>.
     */
    public HmbServiceDeductionRecord setBillNum(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.BILL_NUM</code>.
     */
    public String getBillNum() {
        return (String) get(39);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.QUANTITY</code>.
     */
    public HmbServiceDeductionRecord setQuantity(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.QUANTITY</code>.
     */
    public String getQuantity() {
        return (String) get(40);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.UOM</code>.
     */
    public HmbServiceDeductionRecord setUom(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.UOM</code>.
     */
    public String getUom() {
        return (String) get(41);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.STATUS</code>.
     */
    public HmbServiceDeductionRecord setStatus(String value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(42);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.CREATED_BY</code>.
     */
    public HmbServiceDeductionRecord setCreatedBy(Integer value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(43);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.CREATED_ON</code>.
     */
    public HmbServiceDeductionRecord setCreatedOn(LocalDateTime value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(44);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.LAST_CHANGED_BY</code>.
     */
    public HmbServiceDeductionRecord setLastChangedBy(Integer value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(45);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_deduction.LAST_CHANGED_ON</code>.
     */
    public HmbServiceDeductionRecord setLastChangedOn(LocalDateTime value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_deduction.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(46);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HmbServiceDeductionRecord
     */
    public HmbServiceDeductionRecord() {
        super(HmbServiceDeduction.HMB_SERVICE_DEDUCTION);
    }

    /**
     * Create a detached, initialised HmbServiceDeductionRecord
     */
    public HmbServiceDeductionRecord(String compCode, String zdocno, Integer zdocitem, String zdedtype, String zloantype, LocalDate zedate, Integer zsequence, String zvendor, String bukrs, String zcustomer, String werks, LocalDate zsdate, String zccHmb, Integer zbillcycle, BigDecimal zamount, BigDecimal zemiamt, BigDecimal pAmt, BigDecimal zdedamt, BigDecimal sAmt, BigDecimal zbalance, String zloanac, String zbankey, String saknr, String zdeddoc, String zprsta, String zappsta, String zapprby, LocalDate zappdate, String zrejby, LocalDate zrejdate, String zdelfg, String zdelby, LocalDate zdeldate, String zremark1, String zremark2, String zwerks, String routeNo, String truckNo, String paid, String billNum, String quantity, String uom, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(HmbServiceDeduction.HMB_SERVICE_DEDUCTION);

        setCompCode(compCode);
        setZdocno(zdocno);
        setZdocitem(zdocitem);
        setZdedtype(zdedtype);
        setZloantype(zloantype);
        setZedate(zedate);
        setZsequence(zsequence);
        setZvendor(zvendor);
        setBukrs(bukrs);
        setZcustomer(zcustomer);
        setWerks(werks);
        setZsdate(zsdate);
        setZccHmb(zccHmb);
        setZbillcycle(zbillcycle);
        setZamount(zamount);
        setZemiamt(zemiamt);
        setPAmt(pAmt);
        setZdedamt(zdedamt);
        setSAmt(sAmt);
        setZbalance(zbalance);
        setZloanac(zloanac);
        setZbankey(zbankey);
        setSaknr(saknr);
        setZdeddoc(zdeddoc);
        setZprsta(zprsta);
        setZappsta(zappsta);
        setZapprby(zapprby);
        setZappdate(zappdate);
        setZrejby(zrejby);
        setZrejdate(zrejdate);
        setZdelfg(zdelfg);
        setZdelby(zdelby);
        setZdeldate(zdeldate);
        setZremark1(zremark1);
        setZremark2(zremark2);
        setZwerks(zwerks);
        setRouteNo(routeNo);
        setTruckNo(truckNo);
        setPaid(paid);
        setBillNum(billNum);
        setQuantity(quantity);
        setUom(uom);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}