/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.IbacoMaterial;

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
public class IbacoMaterialRecord extends UpdatableRecordImpl<IbacoMaterialRecord> implements Record7<String, String, String, String, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_material.SERIAL_NO</code>.
     */
    public IbacoMaterialRecord setSerialNo(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_material.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_material.MATERIAL_CODE</code>.
     */
    public IbacoMaterialRecord setMaterialCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_material.MATERIAL_CODE</code>.
     */
    public String getMaterialCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_material.MATERIAL_DESCRIPTION</code>.
     */
    public IbacoMaterialRecord setMaterialDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_material.MATERIAL_DESCRIPTION</code>.
     */
    public String getMaterialDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_material.UOM</code>.
     */
    public IbacoMaterialRecord setUom(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_material.UOM</code>.
     */
    public String getUom() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_material.CREATED_BY</code>.
     */
    public IbacoMaterialRecord setCreatedBy(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_material.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_material.CREATED_ON</code>.
     */
    public IbacoMaterialRecord setCreatedOn(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_material.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_material.STATUS</code>.
     */
    public IbacoMaterialRecord setStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_material.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, LocalDateTime, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return IbacoMaterial.IBACO_MATERIAL.SERIAL_NO;
    }

    @Override
    public Field<String> field2() {
        return IbacoMaterial.IBACO_MATERIAL.MATERIAL_CODE;
    }

    @Override
    public Field<String> field3() {
        return IbacoMaterial.IBACO_MATERIAL.MATERIAL_DESCRIPTION;
    }

    @Override
    public Field<String> field4() {
        return IbacoMaterial.IBACO_MATERIAL.UOM;
    }

    @Override
    public Field<String> field5() {
        return IbacoMaterial.IBACO_MATERIAL.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return IbacoMaterial.IBACO_MATERIAL.CREATED_ON;
    }

    @Override
    public Field<String> field7() {
        return IbacoMaterial.IBACO_MATERIAL.STATUS;
    }

    @Override
    public String component1() {
        return getSerialNo();
    }

    @Override
    public String component2() {
        return getMaterialCode();
    }

    @Override
    public String component3() {
        return getMaterialDescription();
    }

    @Override
    public String component4() {
        return getUom();
    }

    @Override
    public String component5() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedOn();
    }

    @Override
    public String component7() {
        return getStatus();
    }

    @Override
    public String value1() {
        return getSerialNo();
    }

    @Override
    public String value2() {
        return getMaterialCode();
    }

    @Override
    public String value3() {
        return getMaterialDescription();
    }

    @Override
    public String value4() {
        return getUom();
    }

    @Override
    public String value5() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedOn();
    }

    @Override
    public String value7() {
        return getStatus();
    }

    @Override
    public IbacoMaterialRecord value1(String value) {
        setSerialNo(value);
        return this;
    }

    @Override
    public IbacoMaterialRecord value2(String value) {
        setMaterialCode(value);
        return this;
    }

    @Override
    public IbacoMaterialRecord value3(String value) {
        setMaterialDescription(value);
        return this;
    }

    @Override
    public IbacoMaterialRecord value4(String value) {
        setUom(value);
        return this;
    }

    @Override
    public IbacoMaterialRecord value5(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public IbacoMaterialRecord value6(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public IbacoMaterialRecord value7(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public IbacoMaterialRecord values(String value1, String value2, String value3, String value4, String value5, LocalDateTime value6, String value7) {
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
     * Create a detached IbacoMaterialRecord
     */
    public IbacoMaterialRecord() {
        super(IbacoMaterial.IBACO_MATERIAL);
    }

    /**
     * Create a detached, initialised IbacoMaterialRecord
     */
    public IbacoMaterialRecord(String serialNo, String materialCode, String materialDescription, String uom, String createdBy, LocalDateTime createdOn, String status) {
        super(IbacoMaterial.IBACO_MATERIAL);

        setSerialNo(serialNo);
        setMaterialCode(materialCode);
        setMaterialDescription(materialDescription);
        setUom(uom);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setStatus(status);
    }
}
