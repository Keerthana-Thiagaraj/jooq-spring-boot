/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.PincodeMaster;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PincodeMasterRecord extends UpdatableRecordImpl<PincodeMasterRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.pincode_master.PINCODE</code>.
     */
    public PincodeMasterRecord setPincode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.pincode_master.PINCODE</code>.
     */
    public String getPincode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.pincode_master.REGION_CODE</code>.
     */
    public PincodeMasterRecord setRegionCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.pincode_master.REGION_CODE</code>.
     */
    public String getRegionCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.pincode_master.COUNTRY_CODE</code>.
     */
    public PincodeMasterRecord setCountryCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.pincode_master.COUNTRY_CODE</code>.
     */
    public String getCountryCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.pincode_master.REGION_NAME</code>.
     */
    public PincodeMasterRecord setRegionName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.pincode_master.REGION_NAME</code>.
     */
    public String getRegionName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.pincode_master.DISTRICT_NAME</code>.
     */
    public PincodeMasterRecord setDistrictName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.pincode_master.DISTRICT_NAME</code>.
     */
    public String getDistrictName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.pincode_master.STATUS</code>.
     */
    public PincodeMasterRecord setStatus(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.pincode_master.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PincodeMaster.PINCODE_MASTER.PINCODE;
    }

    @Override
    public Field<String> field2() {
        return PincodeMaster.PINCODE_MASTER.REGION_CODE;
    }

    @Override
    public Field<String> field3() {
        return PincodeMaster.PINCODE_MASTER.COUNTRY_CODE;
    }

    @Override
    public Field<String> field4() {
        return PincodeMaster.PINCODE_MASTER.REGION_NAME;
    }

    @Override
    public Field<String> field5() {
        return PincodeMaster.PINCODE_MASTER.DISTRICT_NAME;
    }

    @Override
    public Field<String> field6() {
        return PincodeMaster.PINCODE_MASTER.STATUS;
    }

    @Override
    public String component1() {
        return getPincode();
    }

    @Override
    public String component2() {
        return getRegionCode();
    }

    @Override
    public String component3() {
        return getCountryCode();
    }

    @Override
    public String component4() {
        return getRegionName();
    }

    @Override
    public String component5() {
        return getDistrictName();
    }

    @Override
    public String component6() {
        return getStatus();
    }

    @Override
    public String value1() {
        return getPincode();
    }

    @Override
    public String value2() {
        return getRegionCode();
    }

    @Override
    public String value3() {
        return getCountryCode();
    }

    @Override
    public String value4() {
        return getRegionName();
    }

    @Override
    public String value5() {
        return getDistrictName();
    }

    @Override
    public String value6() {
        return getStatus();
    }

    @Override
    public PincodeMasterRecord value1(String value) {
        setPincode(value);
        return this;
    }

    @Override
    public PincodeMasterRecord value2(String value) {
        setRegionCode(value);
        return this;
    }

    @Override
    public PincodeMasterRecord value3(String value) {
        setCountryCode(value);
        return this;
    }

    @Override
    public PincodeMasterRecord value4(String value) {
        setRegionName(value);
        return this;
    }

    @Override
    public PincodeMasterRecord value5(String value) {
        setDistrictName(value);
        return this;
    }

    @Override
    public PincodeMasterRecord value6(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public PincodeMasterRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PincodeMasterRecord
     */
    public PincodeMasterRecord() {
        super(PincodeMaster.PINCODE_MASTER);
    }

    /**
     * Create a detached, initialised PincodeMasterRecord
     */
    public PincodeMasterRecord(String pincode, String regionCode, String countryCode, String regionName, String districtName, String status) {
        super(PincodeMaster.PINCODE_MASTER);

        setPincode(pincode);
        setRegionCode(regionCode);
        setCountryCode(countryCode);
        setRegionName(regionName);
        setDistrictName(districtName);
        setStatus(status);
    }
}