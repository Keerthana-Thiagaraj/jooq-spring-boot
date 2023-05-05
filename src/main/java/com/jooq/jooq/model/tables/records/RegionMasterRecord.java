/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.RegionMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record2;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegionMasterRecord extends UpdatableRecordImpl<RegionMasterRecord> implements Record11<String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.region_master.REGION_CODE</code>.
     */
    public RegionMasterRecord setRegionCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.REGION_CODE</code>.
     */
    public String getRegionCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.COUNTRY_CODE</code>.
     */
    public RegionMasterRecord setCountryCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.COUNTRY_CODE</code>.
     */
    public String getCountryCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.REGION_NAME</code>.
     */
    public RegionMasterRecord setRegionName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.REGION_NAME</code>.
     */
    public String getRegionName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.LANGUAGE</code>.
     */
    public RegionMasterRecord setLanguage(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.LANGUAGE</code>.
     */
    public String getLanguage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.STATUS</code>.
     */
    public RegionMasterRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.STATE_CODE</code>.
     */
    public RegionMasterRecord setStateCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.STATE_CODE</code>.
     */
    public String getStateCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.STATE_DESC</code>.
     */
    public RegionMasterRecord setStateDesc(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.STATE_DESC</code>.
     */
    public String getStateDesc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.CREATED_BY</code>.
     */
    public RegionMasterRecord setCreatedBy(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.CREATED_ON</code>.
     */
    public RegionMasterRecord setCreatedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.LAST_CHANGED_BY</code>.
     */
    public RegionMasterRecord setLastChangedBy(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.region_master.LAST_CHANGED_ON</code>.
     */
    public RegionMasterRecord setLastChangedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.region_master.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RegionMaster.REGION_MASTER.REGION_CODE;
    }

    @Override
    public Field<String> field2() {
        return RegionMaster.REGION_MASTER.COUNTRY_CODE;
    }

    @Override
    public Field<String> field3() {
        return RegionMaster.REGION_MASTER.REGION_NAME;
    }

    @Override
    public Field<String> field4() {
        return RegionMaster.REGION_MASTER.LANGUAGE;
    }

    @Override
    public Field<String> field5() {
        return RegionMaster.REGION_MASTER.STATUS;
    }

    @Override
    public Field<String> field6() {
        return RegionMaster.REGION_MASTER.STATE_CODE;
    }

    @Override
    public Field<String> field7() {
        return RegionMaster.REGION_MASTER.STATE_DESC;
    }

    @Override
    public Field<Integer> field8() {
        return RegionMaster.REGION_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return RegionMaster.REGION_MASTER.CREATED_ON;
    }

    @Override
    public Field<Integer> field10() {
        return RegionMaster.REGION_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return RegionMaster.REGION_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public String component1() {
        return getRegionCode();
    }

    @Override
    public String component2() {
        return getCountryCode();
    }

    @Override
    public String component3() {
        return getRegionName();
    }

    @Override
    public String component4() {
        return getLanguage();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public String component6() {
        return getStateCode();
    }

    @Override
    public String component7() {
        return getStateDesc();
    }

    @Override
    public Integer component8() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component9() {
        return getCreatedOn();
    }

    @Override
    public Integer component10() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component11() {
        return getLastChangedOn();
    }

    @Override
    public String value1() {
        return getRegionCode();
    }

    @Override
    public String value2() {
        return getCountryCode();
    }

    @Override
    public String value3() {
        return getRegionName();
    }

    @Override
    public String value4() {
        return getLanguage();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public String value6() {
        return getStateCode();
    }

    @Override
    public String value7() {
        return getStateDesc();
    }

    @Override
    public Integer value8() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value9() {
        return getCreatedOn();
    }

    @Override
    public Integer value10() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value11() {
        return getLastChangedOn();
    }

    @Override
    public RegionMasterRecord value1(String value) {
        setRegionCode(value);
        return this;
    }

    @Override
    public RegionMasterRecord value2(String value) {
        setCountryCode(value);
        return this;
    }

    @Override
    public RegionMasterRecord value3(String value) {
        setRegionName(value);
        return this;
    }

    @Override
    public RegionMasterRecord value4(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public RegionMasterRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public RegionMasterRecord value6(String value) {
        setStateCode(value);
        return this;
    }

    @Override
    public RegionMasterRecord value7(String value) {
        setStateDesc(value);
        return this;
    }

    @Override
    public RegionMasterRecord value8(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RegionMasterRecord value9(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public RegionMasterRecord value10(Integer value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public RegionMasterRecord value11(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public RegionMasterRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8, LocalDateTime value9, Integer value10, LocalDateTime value11) {
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
     * Create a detached RegionMasterRecord
     */
    public RegionMasterRecord() {
        super(RegionMaster.REGION_MASTER);
    }

    /**
     * Create a detached, initialised RegionMasterRecord
     */
    public RegionMasterRecord(String regionCode, String countryCode, String regionName, String language, String status, String stateCode, String stateDesc, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(RegionMaster.REGION_MASTER);

        setRegionCode(regionCode);
        setCountryCode(countryCode);
        setRegionName(regionName);
        setLanguage(language);
        setStatus(status);
        setStateCode(stateCode);
        setStateDesc(stateDesc);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}