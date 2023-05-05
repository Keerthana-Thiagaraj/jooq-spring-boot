/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.HmbReasonMaster;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HmbReasonMasterRecord extends UpdatableRecordImpl<HmbReasonMasterRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.hmb_reason_master.ID</code>.
     */
    public HmbReasonMasterRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_reason_master.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_reason_master.REASON_KEY</code>.
     */
    public HmbReasonMasterRecord setReasonKey(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_reason_master.REASON_KEY</code>.
     */
    public String getReasonKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_reason_master.REASON_VALUE</code>.
     */
    public HmbReasonMasterRecord setReasonValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_reason_master.REASON_VALUE</code>.
     */
    public String getReasonValue() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return HmbReasonMaster.HMB_REASON_MASTER.ID;
    }

    @Override
    public Field<String> field2() {
        return HmbReasonMaster.HMB_REASON_MASTER.REASON_KEY;
    }

    @Override
    public Field<String> field3() {
        return HmbReasonMaster.HMB_REASON_MASTER.REASON_VALUE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getReasonKey();
    }

    @Override
    public String component3() {
        return getReasonValue();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getReasonKey();
    }

    @Override
    public String value3() {
        return getReasonValue();
    }

    @Override
    public HmbReasonMasterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HmbReasonMasterRecord value2(String value) {
        setReasonKey(value);
        return this;
    }

    @Override
    public HmbReasonMasterRecord value3(String value) {
        setReasonValue(value);
        return this;
    }

    @Override
    public HmbReasonMasterRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HmbReasonMasterRecord
     */
    public HmbReasonMasterRecord() {
        super(HmbReasonMaster.HMB_REASON_MASTER);
    }

    /**
     * Create a detached, initialised HmbReasonMasterRecord
     */
    public HmbReasonMasterRecord(Integer id, String reasonKey, String reasonValue) {
        super(HmbReasonMaster.HMB_REASON_MASTER);

        setId(id);
        setReasonKey(reasonKey);
        setReasonValue(reasonValue);
    }
}