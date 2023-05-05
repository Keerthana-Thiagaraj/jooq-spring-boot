/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.IvrCallStatusMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IvrCallStatusMasterRecord extends UpdatableRecordImpl<IvrCallStatusMasterRecord> implements Record5<Integer, String, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ivr_call_status_master.CALL_STATUS_ID</code>.
     */
    public IvrCallStatusMasterRecord setCallStatusId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_call_status_master.CALL_STATUS_ID</code>.
     */
    public Integer getCallStatusId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_call_status_master.CALL_STATUS_DESC</code>.
     */
    public IvrCallStatusMasterRecord setCallStatusDesc(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_call_status_master.CALL_STATUS_DESC</code>.
     */
    public String getCallStatusDesc() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_call_status_master.CREATED_ON</code>.
     */
    public IvrCallStatusMasterRecord setCreatedOn(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_call_status_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_call_status_master.CREATED_BY</code>.
     */
    public IvrCallStatusMasterRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_call_status_master.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_call_status_master.STATUS</code>.
     */
    public IvrCallStatusMasterRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_call_status_master.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, LocalDateTime, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, LocalDateTime, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return IvrCallStatusMaster.IVR_CALL_STATUS_MASTER.CALL_STATUS_ID;
    }

    @Override
    public Field<String> field2() {
        return IvrCallStatusMaster.IVR_CALL_STATUS_MASTER.CALL_STATUS_DESC;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return IvrCallStatusMaster.IVR_CALL_STATUS_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field4() {
        return IvrCallStatusMaster.IVR_CALL_STATUS_MASTER.CREATED_BY;
    }

    @Override
    public Field<String> field5() {
        return IvrCallStatusMaster.IVR_CALL_STATUS_MASTER.STATUS;
    }

    @Override
    public Integer component1() {
        return getCallStatusId();
    }

    @Override
    public String component2() {
        return getCallStatusDesc();
    }

    @Override
    public LocalDateTime component3() {
        return getCreatedOn();
    }

    @Override
    public String component4() {
        return getCreatedBy();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public Integer value1() {
        return getCallStatusId();
    }

    @Override
    public String value2() {
        return getCallStatusDesc();
    }

    @Override
    public LocalDateTime value3() {
        return getCreatedOn();
    }

    @Override
    public String value4() {
        return getCreatedBy();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public IvrCallStatusMasterRecord value1(Integer value) {
        setCallStatusId(value);
        return this;
    }

    @Override
    public IvrCallStatusMasterRecord value2(String value) {
        setCallStatusDesc(value);
        return this;
    }

    @Override
    public IvrCallStatusMasterRecord value3(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public IvrCallStatusMasterRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public IvrCallStatusMasterRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public IvrCallStatusMasterRecord values(Integer value1, String value2, LocalDateTime value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IvrCallStatusMasterRecord
     */
    public IvrCallStatusMasterRecord() {
        super(IvrCallStatusMaster.IVR_CALL_STATUS_MASTER);
    }

    /**
     * Create a detached, initialised IvrCallStatusMasterRecord
     */
    public IvrCallStatusMasterRecord(Integer callStatusId, String callStatusDesc, LocalDateTime createdOn, String createdBy, String status) {
        super(IvrCallStatusMaster.IVR_CALL_STATUS_MASTER);

        setCallStatusId(callStatusId);
        setCallStatusDesc(callStatusDesc);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
        setStatus(status);
    }
}