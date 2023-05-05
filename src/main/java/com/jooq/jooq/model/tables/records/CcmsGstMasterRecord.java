/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsGstMaster;

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
public class CcmsGstMasterRecord extends UpdatableRecordImpl<CcmsGstMasterRecord> implements Record11<String, String, String, Double, Double, String, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.state</code>.
     */
    public CcmsGstMasterRecord setState(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.state</code>.
     */
    public String getState() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.plant</code>.
     */
    public CcmsGstMasterRecord setPlant(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.plant</code>.
     */
    public String getPlant() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.gst_type</code>.
     */
    public CcmsGstMasterRecord setGstType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.gst_type</code>.
     */
    public String getGstType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.cgst</code>.
     */
    public CcmsGstMasterRecord setCgst(Double value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.cgst</code>.
     */
    public Double getCgst() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.sgst</code>.
     */
    public CcmsGstMasterRecord setSgst(Double value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.sgst</code>.
     */
    public Double getSgst() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.status</code>.
     */
    public CcmsGstMasterRecord setStatus(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.status</code>.
     */
    public String getStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.effective_from</code>.
     */
    public CcmsGstMasterRecord setEffectiveFrom(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.effective_from</code>.
     */
    public String getEffectiveFrom() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.created_by</code>.
     */
    public CcmsGstMasterRecord setCreatedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.created_on</code>.
     */
    public CcmsGstMasterRecord setCreatedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_by</code>.
     */
    public CcmsGstMasterRecord setLastChangedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_on</code>.
     */
    public CcmsGstMasterRecord setLastChangedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_on</code>.
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
    public Row11<String, String, String, Double, Double, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, Double, Double, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CcmsGstMaster.CCMS_GST_MASTER.STATE;
    }

    @Override
    public Field<String> field2() {
        return CcmsGstMaster.CCMS_GST_MASTER.PLANT;
    }

    @Override
    public Field<String> field3() {
        return CcmsGstMaster.CCMS_GST_MASTER.GST_TYPE;
    }

    @Override
    public Field<Double> field4() {
        return CcmsGstMaster.CCMS_GST_MASTER.CGST;
    }

    @Override
    public Field<Double> field5() {
        return CcmsGstMaster.CCMS_GST_MASTER.SGST;
    }

    @Override
    public Field<String> field6() {
        return CcmsGstMaster.CCMS_GST_MASTER.STATUS;
    }

    @Override
    public Field<String> field7() {
        return CcmsGstMaster.CCMS_GST_MASTER.EFFECTIVE_FROM;
    }

    @Override
    public Field<String> field8() {
        return CcmsGstMaster.CCMS_GST_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return CcmsGstMaster.CCMS_GST_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field10() {
        return CcmsGstMaster.CCMS_GST_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return CcmsGstMaster.CCMS_GST_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public String component1() {
        return getState();
    }

    @Override
    public String component2() {
        return getPlant();
    }

    @Override
    public String component3() {
        return getGstType();
    }

    @Override
    public Double component4() {
        return getCgst();
    }

    @Override
    public Double component5() {
        return getSgst();
    }

    @Override
    public String component6() {
        return getStatus();
    }

    @Override
    public String component7() {
        return getEffectiveFrom();
    }

    @Override
    public String component8() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component9() {
        return getCreatedOn();
    }

    @Override
    public String component10() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component11() {
        return getLastChangedOn();
    }

    @Override
    public String value1() {
        return getState();
    }

    @Override
    public String value2() {
        return getPlant();
    }

    @Override
    public String value3() {
        return getGstType();
    }

    @Override
    public Double value4() {
        return getCgst();
    }

    @Override
    public Double value5() {
        return getSgst();
    }

    @Override
    public String value6() {
        return getStatus();
    }

    @Override
    public String value7() {
        return getEffectiveFrom();
    }

    @Override
    public String value8() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value9() {
        return getCreatedOn();
    }

    @Override
    public String value10() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value11() {
        return getLastChangedOn();
    }

    @Override
    public CcmsGstMasterRecord value1(String value) {
        setState(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value2(String value) {
        setPlant(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value3(String value) {
        setGstType(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value4(Double value) {
        setCgst(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value5(Double value) {
        setSgst(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value6(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value7(String value) {
        setEffectiveFrom(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value8(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value9(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value10(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord value11(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public CcmsGstMasterRecord values(String value1, String value2, String value3, Double value4, Double value5, String value6, String value7, String value8, LocalDateTime value9, String value10, LocalDateTime value11) {
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
     * Create a detached CcmsGstMasterRecord
     */
    public CcmsGstMasterRecord() {
        super(CcmsGstMaster.CCMS_GST_MASTER);
    }

    /**
     * Create a detached, initialised CcmsGstMasterRecord
     */
    public CcmsGstMasterRecord(String state, String plant, String gstType, Double cgst, Double sgst, String status, String effectiveFrom, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(CcmsGstMaster.CCMS_GST_MASTER);

        setState(state);
        setPlant(plant);
        setGstType(gstType);
        setCgst(cgst);
        setSgst(sgst);
        setStatus(status);
        setEffectiveFrom(effectiveFrom);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}