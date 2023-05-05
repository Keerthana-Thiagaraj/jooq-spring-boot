/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.RbFloorMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RbFloorMasterRecord extends UpdatableRecordImpl<RbFloorMasterRecord> implements Record9<Integer, Integer, Integer, String, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.FLOOR_CODE</code>.
     */
    public RbFloorMasterRecord setFloorCode(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.FLOOR_CODE</code>.
     */
    public Integer getFloorCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.BUILDING_CODE</code>.
     */
    public RbFloorMasterRecord setBuildingCode(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.BUILDING_CODE</code>.
     */
    public Integer getBuildingCode() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.RB_LOCATION_CODE</code>.
     */
    public RbFloorMasterRecord setRbLocationCode(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.RB_LOCATION_CODE</code>.
     */
    public Integer getRbLocationCode() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.FLOOR_NAME</code>.
     */
    public RbFloorMasterRecord setFloorName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.FLOOR_NAME</code>.
     */
    public String getFloorName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.STATUS_FLAG</code>.
     */
    public RbFloorMasterRecord setStatusFlag(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.STATUS_FLAG</code>.
     */
    public String getStatusFlag() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.CREATED_BY</code>.
     */
    public RbFloorMasterRecord setCreatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.CREATED_ON</code>.
     */
    public RbFloorMasterRecord setCreatedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.LAST_CHANGED_BY</code>.
     */
    public RbFloorMasterRecord setLastChangedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.LAST_CHANGED_ON</code>.
     */
    public RbFloorMasterRecord setLastChangedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_FLOOR_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, Integer, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RbFloorMaster.RB_FLOOR_MASTER.FLOOR_CODE;
    }

    @Override
    public Field<Integer> field2() {
        return RbFloorMaster.RB_FLOOR_MASTER.BUILDING_CODE;
    }

    @Override
    public Field<Integer> field3() {
        return RbFloorMaster.RB_FLOOR_MASTER.RB_LOCATION_CODE;
    }

    @Override
    public Field<String> field4() {
        return RbFloorMaster.RB_FLOOR_MASTER.FLOOR_NAME;
    }

    @Override
    public Field<String> field5() {
        return RbFloorMaster.RB_FLOOR_MASTER.STATUS_FLAG;
    }

    @Override
    public Field<String> field6() {
        return RbFloorMaster.RB_FLOOR_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return RbFloorMaster.RB_FLOOR_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field8() {
        return RbFloorMaster.RB_FLOOR_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return RbFloorMaster.RB_FLOOR_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public Integer component1() {
        return getFloorCode();
    }

    @Override
    public Integer component2() {
        return getBuildingCode();
    }

    @Override
    public Integer component3() {
        return getRbLocationCode();
    }

    @Override
    public String component4() {
        return getFloorName();
    }

    @Override
    public String component5() {
        return getStatusFlag();
    }

    @Override
    public String component6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedOn();
    }

    @Override
    public String component8() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component9() {
        return getLastChangedOn();
    }

    @Override
    public Integer value1() {
        return getFloorCode();
    }

    @Override
    public Integer value2() {
        return getBuildingCode();
    }

    @Override
    public Integer value3() {
        return getRbLocationCode();
    }

    @Override
    public String value4() {
        return getFloorName();
    }

    @Override
    public String value5() {
        return getStatusFlag();
    }

    @Override
    public String value6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedOn();
    }

    @Override
    public String value8() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value9() {
        return getLastChangedOn();
    }

    @Override
    public RbFloorMasterRecord value1(Integer value) {
        setFloorCode(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value2(Integer value) {
        setBuildingCode(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value3(Integer value) {
        setRbLocationCode(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value4(String value) {
        setFloorName(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value5(String value) {
        setStatusFlag(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value7(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value8(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord value9(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public RbFloorMasterRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, LocalDateTime value7, String value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RbFloorMasterRecord
     */
    public RbFloorMasterRecord() {
        super(RbFloorMaster.RB_FLOOR_MASTER);
    }

    /**
     * Create a detached, initialised RbFloorMasterRecord
     */
    public RbFloorMasterRecord(Integer floorCode, Integer buildingCode, Integer rbLocationCode, String floorName, String statusFlag, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(RbFloorMaster.RB_FLOOR_MASTER);

        setFloorCode(floorCode);
        setBuildingCode(buildingCode);
        setRbLocationCode(rbLocationCode);
        setFloorName(floorName);
        setStatusFlag(statusFlag);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}