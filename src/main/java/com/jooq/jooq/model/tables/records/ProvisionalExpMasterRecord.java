/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.ProvisionalExpMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProvisionalExpMasterRecord extends UpdatableRecordImpl<ProvisionalExpMasterRecord> implements Record8<String, String, String, String, String, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.SERIAL_NO</code>.
     */
    public ProvisionalExpMasterRecord setSerialNo(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.PROVISION_DESC</code>.
     */
    public ProvisionalExpMasterRecord setProvisionDesc(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.PROVISION_DESC</code>.
     */
    public String getProvisionDesc() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.GL_ACC_NO</code>.
     */
    public ProvisionalExpMasterRecord setGlAccNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.GL_ACC_NO</code>.
     */
    public String getGlAccNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.GL_ACC_NAME</code>.
     */
    public ProvisionalExpMasterRecord setGlAccName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.GL_ACC_NAME</code>.
     */
    public String getGlAccName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.PROVISIONAL_GL</code>.
     */
    public ProvisionalExpMasterRecord setProvisionalGl(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.PROVISIONAL_GL</code>.
     */
    public String getProvisionalGl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.PROVISIONAL_GL_NAME</code>.
     */
    public ProvisionalExpMasterRecord setProvisionalGlName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.PROVISIONAL_GL_NAME</code>.
     */
    public String getProvisionalGlName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.CRAETED_ON</code>.
     */
    public ProvisionalExpMasterRecord setCraetedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.CRAETED_ON</code>.
     */
    public LocalDateTime getCraetedOn() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_exp_master.CRAETED_BY</code>.
     */
    public ProvisionalExpMasterRecord setCraetedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_exp_master.CRAETED_BY</code>.
     */
    public String getCraetedBy() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, String, String, LocalDateTime, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.SERIAL_NO;
    }

    @Override
    public Field<String> field2() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.PROVISION_DESC;
    }

    @Override
    public Field<String> field3() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.GL_ACC_NO;
    }

    @Override
    public Field<String> field4() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.GL_ACC_NAME;
    }

    @Override
    public Field<String> field5() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.PROVISIONAL_GL;
    }

    @Override
    public Field<String> field6() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.PROVISIONAL_GL_NAME;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.CRAETED_ON;
    }

    @Override
    public Field<String> field8() {
        return ProvisionalExpMaster.PROVISIONAL_EXP_MASTER.CRAETED_BY;
    }

    @Override
    public String component1() {
        return getSerialNo();
    }

    @Override
    public String component2() {
        return getProvisionDesc();
    }

    @Override
    public String component3() {
        return getGlAccNo();
    }

    @Override
    public String component4() {
        return getGlAccName();
    }

    @Override
    public String component5() {
        return getProvisionalGl();
    }

    @Override
    public String component6() {
        return getProvisionalGlName();
    }

    @Override
    public LocalDateTime component7() {
        return getCraetedOn();
    }

    @Override
    public String component8() {
        return getCraetedBy();
    }

    @Override
    public String value1() {
        return getSerialNo();
    }

    @Override
    public String value2() {
        return getProvisionDesc();
    }

    @Override
    public String value3() {
        return getGlAccNo();
    }

    @Override
    public String value4() {
        return getGlAccName();
    }

    @Override
    public String value5() {
        return getProvisionalGl();
    }

    @Override
    public String value6() {
        return getProvisionalGlName();
    }

    @Override
    public LocalDateTime value7() {
        return getCraetedOn();
    }

    @Override
    public String value8() {
        return getCraetedBy();
    }

    @Override
    public ProvisionalExpMasterRecord value1(String value) {
        setSerialNo(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord value2(String value) {
        setProvisionDesc(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord value3(String value) {
        setGlAccNo(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord value4(String value) {
        setGlAccName(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord value5(String value) {
        setProvisionalGl(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord value6(String value) {
        setProvisionalGlName(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord value7(LocalDateTime value) {
        setCraetedOn(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord value8(String value) {
        setCraetedBy(value);
        return this;
    }

    @Override
    public ProvisionalExpMasterRecord values(String value1, String value2, String value3, String value4, String value5, String value6, LocalDateTime value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProvisionalExpMasterRecord
     */
    public ProvisionalExpMasterRecord() {
        super(ProvisionalExpMaster.PROVISIONAL_EXP_MASTER);
    }

    /**
     * Create a detached, initialised ProvisionalExpMasterRecord
     */
    public ProvisionalExpMasterRecord(String serialNo, String provisionDesc, String glAccNo, String glAccName, String provisionalGl, String provisionalGlName, LocalDateTime craetedOn, String craetedBy) {
        super(ProvisionalExpMaster.PROVISIONAL_EXP_MASTER);

        setSerialNo(serialNo);
        setProvisionDesc(provisionDesc);
        setGlAccNo(glAccNo);
        setGlAccName(glAccName);
        setProvisionalGl(provisionalGl);
        setProvisionalGlName(provisionalGlName);
        setCraetedOn(craetedOn);
        setCraetedBy(craetedBy);
    }
}