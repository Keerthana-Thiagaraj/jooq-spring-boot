/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsWorkLocationMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsWorkLocationMasterRecord extends UpdatableRecordImpl<CcmsWorkLocationMasterRecord> implements Record7<String, String, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_work_location_master.name</code>.
     */
    public CcmsWorkLocationMasterRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_work_location_master.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_work_location_master.plant</code>.
     */
    public CcmsWorkLocationMasterRecord setPlant(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_work_location_master.plant</code>.
     */
    public String getPlant() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_work_location_master.state</code>.
     */
    public CcmsWorkLocationMasterRecord setState(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_work_location_master.state</code>.
     */
    public String getState() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_work_location_master.created_by</code>.
     */
    public CcmsWorkLocationMasterRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_work_location_master.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_work_location_master.created_on</code>.
     */
    public CcmsWorkLocationMasterRecord setCreatedOn(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_work_location_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_work_location_master.last_changed_by</code>.
     */
    public CcmsWorkLocationMasterRecord setLastChangedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_work_location_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_work_location_master.last_changed_on</code>.
     */
    public CcmsWorkLocationMasterRecord setLastChangedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_work_location_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER.NAME;
    }

    @Override
    public Field<String> field2() {
        return CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER.PLANT;
    }

    @Override
    public Field<String> field3() {
        return CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER.STATE;
    }

    @Override
    public Field<String> field4() {
        return CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field6() {
        return CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getPlant();
    }

    @Override
    public String component3() {
        return getState();
    }

    @Override
    public String component4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedOn();
    }

    @Override
    public String component6() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getLastChangedOn();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getPlant();
    }

    @Override
    public String value3() {
        return getState();
    }

    @Override
    public String value4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedOn();
    }

    @Override
    public String value6() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getLastChangedOn();
    }

    @Override
    public CcmsWorkLocationMasterRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public CcmsWorkLocationMasterRecord value2(String value) {
        setPlant(value);
        return this;
    }

    @Override
    public CcmsWorkLocationMasterRecord value3(String value) {
        setState(value);
        return this;
    }

    @Override
    public CcmsWorkLocationMasterRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CcmsWorkLocationMasterRecord value5(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CcmsWorkLocationMasterRecord value6(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public CcmsWorkLocationMasterRecord value7(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public CcmsWorkLocationMasterRecord values(String value1, String value2, String value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CcmsWorkLocationMasterRecord
     */
    public CcmsWorkLocationMasterRecord() {
        super(CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER);
    }

    /**
     * Create a detached, initialised CcmsWorkLocationMasterRecord
     */
    public CcmsWorkLocationMasterRecord(String name, String plant, String state, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(CcmsWorkLocationMaster.CCMS_WORK_LOCATION_MASTER);

        setName(name);
        setPlant(plant);
        setState(state);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}