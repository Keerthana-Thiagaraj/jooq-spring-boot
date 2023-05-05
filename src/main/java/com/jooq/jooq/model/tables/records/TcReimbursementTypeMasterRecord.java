/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.TcReimbursementTypeMaster;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcReimbursementTypeMasterRecord extends UpdatableRecordImpl<TcReimbursementTypeMasterRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.ID</code>.
     */
    public TcReimbursementTypeMasterRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.REIMBURSE_TYPE_NAME</code>.
     */
    public TcReimbursementTypeMasterRecord setReimburseTypeName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.REIMBURSE_TYPE_NAME</code>.
     */
    public String getReimburseTypeName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.STATUS</code>.
     */
    public TcReimbursementTypeMasterRecord setStatus(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REIMBURSEMENT_TYPE_MASTER.STATUS</code>.
     */
    public String getStatus() {
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
        return TcReimbursementTypeMaster.TC_REIMBURSEMENT_TYPE_MASTER.ID;
    }

    @Override
    public Field<String> field2() {
        return TcReimbursementTypeMaster.TC_REIMBURSEMENT_TYPE_MASTER.REIMBURSE_TYPE_NAME;
    }

    @Override
    public Field<String> field3() {
        return TcReimbursementTypeMaster.TC_REIMBURSEMENT_TYPE_MASTER.STATUS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getReimburseTypeName();
    }

    @Override
    public String component3() {
        return getStatus();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getReimburseTypeName();
    }

    @Override
    public String value3() {
        return getStatus();
    }

    @Override
    public TcReimbursementTypeMasterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TcReimbursementTypeMasterRecord value2(String value) {
        setReimburseTypeName(value);
        return this;
    }

    @Override
    public TcReimbursementTypeMasterRecord value3(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public TcReimbursementTypeMasterRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TcReimbursementTypeMasterRecord
     */
    public TcReimbursementTypeMasterRecord() {
        super(TcReimbursementTypeMaster.TC_REIMBURSEMENT_TYPE_MASTER);
    }

    /**
     * Create a detached, initialised TcReimbursementTypeMasterRecord
     */
    public TcReimbursementTypeMasterRecord(Integer id, String reimburseTypeName, String status) {
        super(TcReimbursementTypeMaster.TC_REIMBURSEMENT_TYPE_MASTER);

        setId(id);
        setReimburseTypeName(reimburseTypeName);
        setStatus(status);
    }
}
