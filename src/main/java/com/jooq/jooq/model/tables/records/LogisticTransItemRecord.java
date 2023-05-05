/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.LogisticTransItem;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Record5;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogisticTransItemRecord extends UpdatableRecordImpl<LogisticTransItemRecord> implements Record18<String, String, String, String, LocalDate, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.COMP_CODE</code>.
     */
    public LogisticTransItemRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TRANSPORTER</code>.
     */
    public LogisticTransItemRecord setTransporter(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TRANSPORTER</code>.
     */
    public String getTransporter() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.WERKS</code>.
     */
    public LogisticTransItemRecord setWerks(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.WERKS</code>.
     */
    public String getWerks() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_NO</code>.
     */
    public LogisticTransItemRecord setRouteNo(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_NO</code>.
     */
    public String getRouteNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.CRDAT</code>.
     */
    public LogisticTransItemRecord setCrdat(LocalDate value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.CRDAT</code>.
     */
    public LocalDate getCrdat() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.NAME</code>.
     */
    public LogisticTransItemRecord setName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.NAME</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.EBELN</code>.
     */
    public LogisticTransItemRecord setEbeln(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.EBELN</code>.
     */
    public String getEbeln() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TRUCK_NO</code>.
     */
    public LogisticTransItemRecord setTruckNo(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TRUCK_NO</code>.
     */
    public String getTruckNo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TRANS_TYPE</code>.
     */
    public LogisticTransItemRecord setTransType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TRANS_TYPE</code>.
     */
    public String getTransType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.ERFMG</code>.
     */
    public LogisticTransItemRecord setErfmg(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.ERFMG</code>.
     */
    public BigDecimal getErfmg() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.SO_DIS</code>.
     */
    public LogisticTransItemRecord setSoDis(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.SO_DIS</code>.
     */
    public BigDecimal getSoDis() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.FIXED_KM_RATE</code>.
     */
    public LogisticTransItemRecord setFixedKmRate(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.FIXED_KM_RATE</code>.
     */
    public BigDecimal getFixedKmRate() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.KM_RATE</code>.
     */
    public LogisticTransItemRecord setKmRate(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.KM_RATE</code>.
     */
    public BigDecimal getKmRate() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.LTR_RATE</code>.
     */
    public LogisticTransItemRecord setLtrRate(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.LTR_RATE</code>.
     */
    public BigDecimal getLtrRate() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_KM</code>.
     */
    public LogisticTransItemRecord setTotalKm(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_KM</code>.
     */
    public BigDecimal getTotalKm() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_LTR</code>.
     */
    public LogisticTransItemRecord setTotalLtr(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL_LTR</code>.
     */
    public BigDecimal getTotalLtr() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL</code>.
     */
    public LogisticTransItemRecord setTotal(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.TOTAL</code>.
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_DESCR</code>.
     */
    public LogisticTransItemRecord setRouteDescr(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.logistic_trans_item.ROUTE_DESCR</code>.
     */
    public String getRouteDescr() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<String, String, String, String, LocalDate> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, LocalDate, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, String, LocalDate, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.TRANSPORTER;
    }

    @Override
    public Field<String> field3() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.WERKS;
    }

    @Override
    public Field<String> field4() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.ROUTE_NO;
    }

    @Override
    public Field<LocalDate> field5() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.CRDAT;
    }

    @Override
    public Field<String> field6() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.NAME;
    }

    @Override
    public Field<String> field7() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.EBELN;
    }

    @Override
    public Field<String> field8() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.TRUCK_NO;
    }

    @Override
    public Field<String> field9() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.TRANS_TYPE;
    }

    @Override
    public Field<BigDecimal> field10() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.ERFMG;
    }

    @Override
    public Field<BigDecimal> field11() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.SO_DIS;
    }

    @Override
    public Field<BigDecimal> field12() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.FIXED_KM_RATE;
    }

    @Override
    public Field<BigDecimal> field13() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.KM_RATE;
    }

    @Override
    public Field<BigDecimal> field14() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.LTR_RATE;
    }

    @Override
    public Field<BigDecimal> field15() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.TOTAL_KM;
    }

    @Override
    public Field<BigDecimal> field16() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.TOTAL_LTR;
    }

    @Override
    public Field<BigDecimal> field17() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.TOTAL;
    }

    @Override
    public Field<String> field18() {
        return LogisticTransItem.LOGISTIC_TRANS_ITEM.ROUTE_DESCR;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public String component2() {
        return getTransporter();
    }

    @Override
    public String component3() {
        return getWerks();
    }

    @Override
    public String component4() {
        return getRouteNo();
    }

    @Override
    public LocalDate component5() {
        return getCrdat();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public String component7() {
        return getEbeln();
    }

    @Override
    public String component8() {
        return getTruckNo();
    }

    @Override
    public String component9() {
        return getTransType();
    }

    @Override
    public BigDecimal component10() {
        return getErfmg();
    }

    @Override
    public BigDecimal component11() {
        return getSoDis();
    }

    @Override
    public BigDecimal component12() {
        return getFixedKmRate();
    }

    @Override
    public BigDecimal component13() {
        return getKmRate();
    }

    @Override
    public BigDecimal component14() {
        return getLtrRate();
    }

    @Override
    public BigDecimal component15() {
        return getTotalKm();
    }

    @Override
    public BigDecimal component16() {
        return getTotalLtr();
    }

    @Override
    public BigDecimal component17() {
        return getTotal();
    }

    @Override
    public String component18() {
        return getRouteDescr();
    }

    @Override
    public String value1() {
        return getCompCode();
    }

    @Override
    public String value2() {
        return getTransporter();
    }

    @Override
    public String value3() {
        return getWerks();
    }

    @Override
    public String value4() {
        return getRouteNo();
    }

    @Override
    public LocalDate value5() {
        return getCrdat();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public String value7() {
        return getEbeln();
    }

    @Override
    public String value8() {
        return getTruckNo();
    }

    @Override
    public String value9() {
        return getTransType();
    }

    @Override
    public BigDecimal value10() {
        return getErfmg();
    }

    @Override
    public BigDecimal value11() {
        return getSoDis();
    }

    @Override
    public BigDecimal value12() {
        return getFixedKmRate();
    }

    @Override
    public BigDecimal value13() {
        return getKmRate();
    }

    @Override
    public BigDecimal value14() {
        return getLtrRate();
    }

    @Override
    public BigDecimal value15() {
        return getTotalKm();
    }

    @Override
    public BigDecimal value16() {
        return getTotalLtr();
    }

    @Override
    public BigDecimal value17() {
        return getTotal();
    }

    @Override
    public String value18() {
        return getRouteDescr();
    }

    @Override
    public LogisticTransItemRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value2(String value) {
        setTransporter(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value3(String value) {
        setWerks(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value4(String value) {
        setRouteNo(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value5(LocalDate value) {
        setCrdat(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value7(String value) {
        setEbeln(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value8(String value) {
        setTruckNo(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value9(String value) {
        setTransType(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value10(BigDecimal value) {
        setErfmg(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value11(BigDecimal value) {
        setSoDis(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value12(BigDecimal value) {
        setFixedKmRate(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value13(BigDecimal value) {
        setKmRate(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value14(BigDecimal value) {
        setLtrRate(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value15(BigDecimal value) {
        setTotalKm(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value16(BigDecimal value) {
        setTotalLtr(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value17(BigDecimal value) {
        setTotal(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord value18(String value) {
        setRouteDescr(value);
        return this;
    }

    @Override
    public LogisticTransItemRecord values(String value1, String value2, String value3, String value4, LocalDate value5, String value6, String value7, String value8, String value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13, BigDecimal value14, BigDecimal value15, BigDecimal value16, BigDecimal value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LogisticTransItemRecord
     */
    public LogisticTransItemRecord() {
        super(LogisticTransItem.LOGISTIC_TRANS_ITEM);
    }

    /**
     * Create a detached, initialised LogisticTransItemRecord
     */
    public LogisticTransItemRecord(String compCode, String transporter, String werks, String routeNo, LocalDate crdat, String name, String ebeln, String truckNo, String transType, BigDecimal erfmg, BigDecimal soDis, BigDecimal fixedKmRate, BigDecimal kmRate, BigDecimal ltrRate, BigDecimal totalKm, BigDecimal totalLtr, BigDecimal total, String routeDescr) {
        super(LogisticTransItem.LOGISTIC_TRANS_ITEM);

        setCompCode(compCode);
        setTransporter(transporter);
        setWerks(werks);
        setRouteNo(routeNo);
        setCrdat(crdat);
        setName(name);
        setEbeln(ebeln);
        setTruckNo(truckNo);
        setTransType(transType);
        setErfmg(erfmg);
        setSoDis(soDis);
        setFixedKmRate(fixedKmRate);
        setKmRate(kmRate);
        setLtrRate(ltrRate);
        setTotalKm(totalKm);
        setTotalLtr(totalLtr);
        setTotal(total);
        setRouteDescr(routeDescr);
    }
}