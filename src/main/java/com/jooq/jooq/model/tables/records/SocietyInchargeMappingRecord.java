/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.SocietyInchargeMapping;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record4;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SocietyInchargeMappingRecord extends UpdatableRecordImpl<SocietyInchargeMappingRecord> implements Record12<String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.COMP_CODE</code>.
     */
    public SocietyInchargeMappingRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.SOCIETY</code>.
     */
    public SocietyInchargeMappingRecord setSociety(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.SOCIETY</code>.
     */
    public String getSociety() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.EKORG</code>.
     */
    public SocietyInchargeMappingRecord setEkorg(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.EKORG</code>.
     */
    public String getEkorg() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.PARVW</code>.
     */
    public SocietyInchargeMappingRecord setParvw(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.PARVW</code>.
     */
    public String getParvw() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.INCHARGE</code>.
     */
    public SocietyInchargeMappingRecord setIncharge(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.INCHARGE</code>.
     */
    public String getIncharge() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.STATUS</code>.
     */
    public SocietyInchargeMappingRecord setStatus(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.CREATED_BY</code>.
     */
    public SocietyInchargeMappingRecord setCreatedBy(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.CREATED_ON</code>.
     */
    public SocietyInchargeMappingRecord setCreatedOn(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.LAST_CHANGED_BY</code>.
     */
    public SocietyInchargeMappingRecord setLastChangedBy(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.LAST_CHANGED_ON</code>.
     */
    public SocietyInchargeMappingRecord setLastChangedOn(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.CENTER_TYPE</code>.
     */
    public SocietyInchargeMappingRecord setCenterType(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.CENTER_TYPE</code>.
     */
    public String getCenterType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.society_incharge_mapping.CENTER_TYPE_NAME</code>.
     */
    public SocietyInchargeMappingRecord setCenterTypeName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.society_incharge_mapping.CENTER_TYPE_NAME</code>.
     */
    public String getCenterTypeName() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.SOCIETY;
    }

    @Override
    public Field<String> field3() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.EKORG;
    }

    @Override
    public Field<String> field4() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.PARVW;
    }

    @Override
    public Field<String> field5() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.INCHARGE;
    }

    @Override
    public Field<String> field6() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.STATUS;
    }

    @Override
    public Field<Integer> field7() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.CREATED_ON;
    }

    @Override
    public Field<Integer> field9() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.LAST_CHANGED_ON;
    }

    @Override
    public Field<String> field11() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.CENTER_TYPE;
    }

    @Override
    public Field<String> field12() {
        return SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING.CENTER_TYPE_NAME;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public String component2() {
        return getSociety();
    }

    @Override
    public String component3() {
        return getEkorg();
    }

    @Override
    public String component4() {
        return getParvw();
    }

    @Override
    public String component5() {
        return getIncharge();
    }

    @Override
    public String component6() {
        return getStatus();
    }

    @Override
    public Integer component7() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component8() {
        return getCreatedOn();
    }

    @Override
    public Integer component9() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component10() {
        return getLastChangedOn();
    }

    @Override
    public String component11() {
        return getCenterType();
    }

    @Override
    public String component12() {
        return getCenterTypeName();
    }

    @Override
    public String value1() {
        return getCompCode();
    }

    @Override
    public String value2() {
        return getSociety();
    }

    @Override
    public String value3() {
        return getEkorg();
    }

    @Override
    public String value4() {
        return getParvw();
    }

    @Override
    public String value5() {
        return getIncharge();
    }

    @Override
    public String value6() {
        return getStatus();
    }

    @Override
    public Integer value7() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value8() {
        return getCreatedOn();
    }

    @Override
    public Integer value9() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value10() {
        return getLastChangedOn();
    }

    @Override
    public String value11() {
        return getCenterType();
    }

    @Override
    public String value12() {
        return getCenterTypeName();
    }

    @Override
    public SocietyInchargeMappingRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value2(String value) {
        setSociety(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value3(String value) {
        setEkorg(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value4(String value) {
        setParvw(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value5(String value) {
        setIncharge(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value6(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value7(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value8(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value9(Integer value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value10(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value11(String value) {
        setCenterType(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord value12(String value) {
        setCenterTypeName(value);
        return this;
    }

    @Override
    public SocietyInchargeMappingRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Integer value7, LocalDateTime value8, Integer value9, LocalDateTime value10, String value11, String value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SocietyInchargeMappingRecord
     */
    public SocietyInchargeMappingRecord() {
        super(SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING);
    }

    /**
     * Create a detached, initialised SocietyInchargeMappingRecord
     */
    public SocietyInchargeMappingRecord(String compCode, String society, String ekorg, String parvw, String incharge, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn, String centerType, String centerTypeName) {
        super(SocietyInchargeMapping.SOCIETY_INCHARGE_MAPPING);

        setCompCode(compCode);
        setSociety(society);
        setEkorg(ekorg);
        setParvw(parvw);
        setIncharge(incharge);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setCenterType(centerType);
        setCenterTypeName(centerTypeName);
    }
}