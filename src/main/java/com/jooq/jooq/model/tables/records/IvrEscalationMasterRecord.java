/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.IvrEscalationMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IvrEscalationMasterRecord extends UpdatableRecordImpl<IvrEscalationMasterRecord> implements Record11<Integer, Integer, String, String, String, String, String, String, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.SERIAL_ID</code>.
     */
    public IvrEscalationMasterRecord setSerialId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.SERIAL_ID</code>.
     */
    public Integer getSerialId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_ID</code>.
     */
    public IvrEscalationMasterRecord setDivisionId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_ID</code>.
     */
    public Integer getDivisionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_DESC</code>.
     */
    public IvrEscalationMasterRecord setDivisionDesc(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_DESC</code>.
     */
    public String getDivisionDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE_ID</code>.
     */
    public IvrEscalationMasterRecord setBusinessTypeId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE_ID</code>.
     */
    public String getBusinessTypeId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE</code>.
     */
    public IvrEscalationMasterRecord setBusinessType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE</code>.
     */
    public String getBusinessType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_TYPE</code>.
     */
    public IvrEscalationMasterRecord setEscType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_TYPE</code>.
     */
    public String getEscType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_DESIG</code>.
     */
    public IvrEscalationMasterRecord setEscDesig(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_DESIG</code>.
     */
    public String getEscDesig() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_MAIL</code>.
     */
    public IvrEscalationMasterRecord setEscMail(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_MAIL</code>.
     */
    public String getEscMail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_ON</code>.
     */
    public IvrEscalationMasterRecord setCreatedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_BY</code>.
     */
    public IvrEscalationMasterRecord setCreatedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.STATUS</code>.
     */
    public IvrEscalationMasterRecord setStatus(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, String, String, String, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, Integer, String, String, String, String, String, String, LocalDateTime, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.SERIAL_ID;
    }

    @Override
    public Field<Integer> field2() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.DIVISION_ID;
    }

    @Override
    public Field<String> field3() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.DIVISION_DESC;
    }

    @Override
    public Field<String> field4() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.BUSINESS_TYPE_ID;
    }

    @Override
    public Field<String> field5() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.BUSINESS_TYPE;
    }

    @Override
    public Field<String> field6() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.ESC_TYPE;
    }

    @Override
    public Field<String> field7() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.ESC_DESIG;
    }

    @Override
    public Field<String> field8() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.ESC_MAIL;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field10() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.CREATED_BY;
    }

    @Override
    public Field<String> field11() {
        return IvrEscalationMaster.IVR_ESCALATION_MASTER.STATUS;
    }

    @Override
    public Integer component1() {
        return getSerialId();
    }

    @Override
    public Integer component2() {
        return getDivisionId();
    }

    @Override
    public String component3() {
        return getDivisionDesc();
    }

    @Override
    public String component4() {
        return getBusinessTypeId();
    }

    @Override
    public String component5() {
        return getBusinessType();
    }

    @Override
    public String component6() {
        return getEscType();
    }

    @Override
    public String component7() {
        return getEscDesig();
    }

    @Override
    public String component8() {
        return getEscMail();
    }

    @Override
    public LocalDateTime component9() {
        return getCreatedOn();
    }

    @Override
    public String component10() {
        return getCreatedBy();
    }

    @Override
    public String component11() {
        return getStatus();
    }

    @Override
    public Integer value1() {
        return getSerialId();
    }

    @Override
    public Integer value2() {
        return getDivisionId();
    }

    @Override
    public String value3() {
        return getDivisionDesc();
    }

    @Override
    public String value4() {
        return getBusinessTypeId();
    }

    @Override
    public String value5() {
        return getBusinessType();
    }

    @Override
    public String value6() {
        return getEscType();
    }

    @Override
    public String value7() {
        return getEscDesig();
    }

    @Override
    public String value8() {
        return getEscMail();
    }

    @Override
    public LocalDateTime value9() {
        return getCreatedOn();
    }

    @Override
    public String value10() {
        return getCreatedBy();
    }

    @Override
    public String value11() {
        return getStatus();
    }

    @Override
    public IvrEscalationMasterRecord value1(Integer value) {
        setSerialId(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value2(Integer value) {
        setDivisionId(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value3(String value) {
        setDivisionDesc(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value4(String value) {
        setBusinessTypeId(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value5(String value) {
        setBusinessType(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value6(String value) {
        setEscType(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value7(String value) {
        setEscDesig(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value8(String value) {
        setEscMail(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value9(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value10(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord value11(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public IvrEscalationMasterRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, LocalDateTime value9, String value10, String value11) {
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
     * Create a detached IvrEscalationMasterRecord
     */
    public IvrEscalationMasterRecord() {
        super(IvrEscalationMaster.IVR_ESCALATION_MASTER);
    }

    /**
     * Create a detached, initialised IvrEscalationMasterRecord
     */
    public IvrEscalationMasterRecord(Integer serialId, Integer divisionId, String divisionDesc, String businessTypeId, String businessType, String escType, String escDesig, String escMail, LocalDateTime createdOn, String createdBy, String status) {
        super(IvrEscalationMaster.IVR_ESCALATION_MASTER);

        setSerialId(serialId);
        setDivisionId(divisionId);
        setDivisionDesc(divisionDesc);
        setBusinessTypeId(businessTypeId);
        setBusinessType(businessType);
        setEscType(escType);
        setEscDesig(escDesig);
        setEscMail(escMail);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
        setStatus(status);
    }
}