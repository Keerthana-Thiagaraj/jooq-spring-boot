/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.TcMonthStatusMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcMonthStatusMasterRecord extends UpdatableRecordImpl<TcMonthStatusMasterRecord> implements Record7<Integer, Integer, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.YEAR</code>.
     */
    public TcMonthStatusMasterRecord setYear(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.YEAR</code>.
     */
    public Integer getYear() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.MONTH</code>.
     */
    public TcMonthStatusMasterRecord setMonth(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.MONTH</code>.
     */
    public Integer getMonth() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.FLAG</code>.
     */
    public TcMonthStatusMasterRecord setFlag(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.FLAG</code>.
     */
    public String getFlag() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.CREATED_BY</code>.
     */
    public TcMonthStatusMasterRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.CREATED_ON</code>.
     */
    public TcMonthStatusMasterRecord setCreatedOn(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.LAST_CHANGED_BY</code>.
     */
    public TcMonthStatusMasterRecord setLastChangedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.LAST_CHANGED_ON</code>.
     */
    public TcMonthStatusMasterRecord setLastChangedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_MONTH_STATUS_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Integer, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TcMonthStatusMaster.TC_MONTH_STATUS_MASTER.YEAR;
    }

    @Override
    public Field<Integer> field2() {
        return TcMonthStatusMaster.TC_MONTH_STATUS_MASTER.MONTH;
    }

    @Override
    public Field<String> field3() {
        return TcMonthStatusMaster.TC_MONTH_STATUS_MASTER.FLAG;
    }

    @Override
    public Field<String> field4() {
        return TcMonthStatusMaster.TC_MONTH_STATUS_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TcMonthStatusMaster.TC_MONTH_STATUS_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field6() {
        return TcMonthStatusMaster.TC_MONTH_STATUS_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return TcMonthStatusMaster.TC_MONTH_STATUS_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public Integer component1() {
        return getYear();
    }

    @Override
    public Integer component2() {
        return getMonth();
    }

    @Override
    public String component3() {
        return getFlag();
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
    public Integer value1() {
        return getYear();
    }

    @Override
    public Integer value2() {
        return getMonth();
    }

    @Override
    public String value3() {
        return getFlag();
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
    public TcMonthStatusMasterRecord value1(Integer value) {
        setYear(value);
        return this;
    }

    @Override
    public TcMonthStatusMasterRecord value2(Integer value) {
        setMonth(value);
        return this;
    }

    @Override
    public TcMonthStatusMasterRecord value3(String value) {
        setFlag(value);
        return this;
    }

    @Override
    public TcMonthStatusMasterRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public TcMonthStatusMasterRecord value5(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public TcMonthStatusMasterRecord value6(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public TcMonthStatusMasterRecord value7(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public TcMonthStatusMasterRecord values(Integer value1, Integer value2, String value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7) {
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
     * Create a detached TcMonthStatusMasterRecord
     */
    public TcMonthStatusMasterRecord() {
        super(TcMonthStatusMaster.TC_MONTH_STATUS_MASTER);
    }

    /**
     * Create a detached, initialised TcMonthStatusMasterRecord
     */
    public TcMonthStatusMasterRecord(Integer year, Integer month, String flag, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(TcMonthStatusMaster.TC_MONTH_STATUS_MASTER);

        setYear(year);
        setMonth(month);
        setFlag(flag);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}