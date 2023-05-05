/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.FarmerMobile;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record3;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmerMobileRecord extends UpdatableRecordImpl<FarmerMobileRecord> implements Record13<String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.PLANT_CODE</code>.
     */
    public FarmerMobileRecord setPlantCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.HMB_CODE</code>.
     */
    public FarmerMobileRecord setHmbCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.HMB_CODE</code>.
     */
    public String getHmbCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.PID</code>.
     */
    public FarmerMobileRecord setPid(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.PID</code>.
     */
    public String getPid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.FARMER_NAME</code>.
     */
    public FarmerMobileRecord setFarmerName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.FARMER_NAME</code>.
     */
    public String getFarmerName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.E_MOBILE_NO</code>.
     */
    public FarmerMobileRecord setEMobileNo(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.E_MOBILE_NO</code>.
     */
    public String getEMobileNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.MOBILE_NO</code>.
     */
    public FarmerMobileRecord setMobileNo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.MOBILE_NO</code>.
     */
    public String getMobileNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.NET_WORK</code>.
     */
    public FarmerMobileRecord setNetWork(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.NET_WORK</code>.
     */
    public String getNetWork() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.MOBILE_TYPE</code>.
     */
    public FarmerMobileRecord setMobileType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.MOBILE_TYPE</code>.
     */
    public String getMobileType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.REASON</code>.
     */
    public FarmerMobileRecord setReason(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.REASON</code>.
     */
    public String getReason() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.PLANT_NAME</code>.
     */
    public FarmerMobileRecord setPlantName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.PLANT_NAME</code>.
     */
    public String getPlantName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.HMB_NAME</code>.
     */
    public FarmerMobileRecord setHmbName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.HMB_NAME</code>.
     */
    public String getHmbName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.VENDOR_CODE</code>.
     */
    public FarmerMobileRecord setVendorCode(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.farmer_mobile.CREATED_TIME</code>.
     */
    public FarmerMobileRecord setCreatedTime(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.farmer_mobile.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FarmerMobile.FARMER_MOBILE.PLANT_CODE;
    }

    @Override
    public Field<String> field2() {
        return FarmerMobile.FARMER_MOBILE.HMB_CODE;
    }

    @Override
    public Field<String> field3() {
        return FarmerMobile.FARMER_MOBILE.PID;
    }

    @Override
    public Field<String> field4() {
        return FarmerMobile.FARMER_MOBILE.FARMER_NAME;
    }

    @Override
    public Field<String> field5() {
        return FarmerMobile.FARMER_MOBILE.E_MOBILE_NO;
    }

    @Override
    public Field<String> field6() {
        return FarmerMobile.FARMER_MOBILE.MOBILE_NO;
    }

    @Override
    public Field<String> field7() {
        return FarmerMobile.FARMER_MOBILE.NET_WORK;
    }

    @Override
    public Field<String> field8() {
        return FarmerMobile.FARMER_MOBILE.MOBILE_TYPE;
    }

    @Override
    public Field<String> field9() {
        return FarmerMobile.FARMER_MOBILE.REASON;
    }

    @Override
    public Field<String> field10() {
        return FarmerMobile.FARMER_MOBILE.PLANT_NAME;
    }

    @Override
    public Field<String> field11() {
        return FarmerMobile.FARMER_MOBILE.HMB_NAME;
    }

    @Override
    public Field<String> field12() {
        return FarmerMobile.FARMER_MOBILE.VENDOR_CODE;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return FarmerMobile.FARMER_MOBILE.CREATED_TIME;
    }

    @Override
    public String component1() {
        return getPlantCode();
    }

    @Override
    public String component2() {
        return getHmbCode();
    }

    @Override
    public String component3() {
        return getPid();
    }

    @Override
    public String component4() {
        return getFarmerName();
    }

    @Override
    public String component5() {
        return getEMobileNo();
    }

    @Override
    public String component6() {
        return getMobileNo();
    }

    @Override
    public String component7() {
        return getNetWork();
    }

    @Override
    public String component8() {
        return getMobileType();
    }

    @Override
    public String component9() {
        return getReason();
    }

    @Override
    public String component10() {
        return getPlantName();
    }

    @Override
    public String component11() {
        return getHmbName();
    }

    @Override
    public String component12() {
        return getVendorCode();
    }

    @Override
    public LocalDateTime component13() {
        return getCreatedTime();
    }

    @Override
    public String value1() {
        return getPlantCode();
    }

    @Override
    public String value2() {
        return getHmbCode();
    }

    @Override
    public String value3() {
        return getPid();
    }

    @Override
    public String value4() {
        return getFarmerName();
    }

    @Override
    public String value5() {
        return getEMobileNo();
    }

    @Override
    public String value6() {
        return getMobileNo();
    }

    @Override
    public String value7() {
        return getNetWork();
    }

    @Override
    public String value8() {
        return getMobileType();
    }

    @Override
    public String value9() {
        return getReason();
    }

    @Override
    public String value10() {
        return getPlantName();
    }

    @Override
    public String value11() {
        return getHmbName();
    }

    @Override
    public String value12() {
        return getVendorCode();
    }

    @Override
    public LocalDateTime value13() {
        return getCreatedTime();
    }

    @Override
    public FarmerMobileRecord value1(String value) {
        setPlantCode(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value2(String value) {
        setHmbCode(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value3(String value) {
        setPid(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value4(String value) {
        setFarmerName(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value5(String value) {
        setEMobileNo(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value6(String value) {
        setMobileNo(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value7(String value) {
        setNetWork(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value8(String value) {
        setMobileType(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value9(String value) {
        setReason(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value10(String value) {
        setPlantName(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value11(String value) {
        setHmbName(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value12(String value) {
        setVendorCode(value);
        return this;
    }

    @Override
    public FarmerMobileRecord value13(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    @Override
    public FarmerMobileRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, LocalDateTime value13) {
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
     * Create a detached FarmerMobileRecord
     */
    public FarmerMobileRecord() {
        super(FarmerMobile.FARMER_MOBILE);
    }

    /**
     * Create a detached, initialised FarmerMobileRecord
     */
    public FarmerMobileRecord(String plantCode, String hmbCode, String pid, String farmerName, String eMobileNo, String mobileNo, String netWork, String mobileType, String reason, String plantName, String hmbName, String vendorCode, LocalDateTime createdTime) {
        super(FarmerMobile.FARMER_MOBILE);

        setPlantCode(plantCode);
        setHmbCode(hmbCode);
        setPid(pid);
        setFarmerName(farmerName);
        setEMobileNo(eMobileNo);
        setMobileNo(mobileNo);
        setNetWork(netWork);
        setMobileType(mobileType);
        setReason(reason);
        setPlantName(plantName);
        setHmbName(hmbName);
        setVendorCode(vendorCode);
        setCreatedTime(createdTime);
    }
}
