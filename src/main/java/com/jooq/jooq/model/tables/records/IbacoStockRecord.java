/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.IbacoStock;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Record6;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IbacoStockRecord extends UpdatableRecordImpl<IbacoStockRecord> implements Record14<Integer, String, String, String, String, String, String, String, BigDecimal, LocalDate, LocalDate, BigDecimal, LocalDate, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.COMP_CODE</code>.
     */
    public IbacoStockRecord setCompCode(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.COMP_CODE</code>.
     */
    public Integer getCompCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.PLANT_CODE</code>.
     */
    public IbacoStockRecord setPlantCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_CODE</code>.
     */
    public IbacoStockRecord setMaterialCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_CODE</code>.
     */
    public String getMaterialCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.KUNNR</code>.
     */
    public IbacoStockRecord setKunnr(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.KUNNR</code>.
     */
    public String getKunnr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.CHARG</code>.
     */
    public IbacoStockRecord setCharg(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.CHARG</code>.
     */
    public String getCharg() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.NAME</code>.
     */
    public IbacoStockRecord setName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.NAME</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_DESC</code>.
     */
    public IbacoStockRecord setMaterialDesc(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.MATERIAL_DESC</code>.
     */
    public String getMaterialDesc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.UOM</code>.
     */
    public IbacoStockRecord setUom(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.UOM</code>.
     */
    public String getUom() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.LABST</code>.
     */
    public IbacoStockRecord setLabst(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.LABST</code>.
     */
    public BigDecimal getLabst() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.HSDAT</code>.
     */
    public IbacoStockRecord setHsdat(LocalDate value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.HSDAT</code>.
     */
    public LocalDate getHsdat() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.VFDAT</code>.
     */
    public IbacoStockRecord setVfdat(LocalDate value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.VFDAT</code>.
     */
    public LocalDate getVfdat() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.REMDAT</code>.
     */
    public IbacoStockRecord setRemdat(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.REMDAT</code>.
     */
    public BigDecimal getRemdat() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.CREATED_ON</code>.
     */
    public IbacoStockRecord setCreatedOn(LocalDate value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.CREATED_ON</code>.
     */
    public LocalDate getCreatedOn() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ibaco_stock.CREATED_TIME</code>.
     */
    public IbacoStockRecord setCreatedTime(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ibaco_stock.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record6<Integer, String, String, String, LocalDate, String> key() {
        return (Record6) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, String, String, String, String, BigDecimal, LocalDate, LocalDate, BigDecimal, LocalDate, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Integer, String, String, String, String, String, String, String, BigDecimal, LocalDate, LocalDate, BigDecimal, LocalDate, LocalDateTime> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return IbacoStock.IBACO_STOCK.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return IbacoStock.IBACO_STOCK.PLANT_CODE;
    }

    @Override
    public Field<String> field3() {
        return IbacoStock.IBACO_STOCK.MATERIAL_CODE;
    }

    @Override
    public Field<String> field4() {
        return IbacoStock.IBACO_STOCK.KUNNR;
    }

    @Override
    public Field<String> field5() {
        return IbacoStock.IBACO_STOCK.CHARG;
    }

    @Override
    public Field<String> field6() {
        return IbacoStock.IBACO_STOCK.NAME;
    }

    @Override
    public Field<String> field7() {
        return IbacoStock.IBACO_STOCK.MATERIAL_DESC;
    }

    @Override
    public Field<String> field8() {
        return IbacoStock.IBACO_STOCK.UOM;
    }

    @Override
    public Field<BigDecimal> field9() {
        return IbacoStock.IBACO_STOCK.LABST;
    }

    @Override
    public Field<LocalDate> field10() {
        return IbacoStock.IBACO_STOCK.HSDAT;
    }

    @Override
    public Field<LocalDate> field11() {
        return IbacoStock.IBACO_STOCK.VFDAT;
    }

    @Override
    public Field<BigDecimal> field12() {
        return IbacoStock.IBACO_STOCK.REMDAT;
    }

    @Override
    public Field<LocalDate> field13() {
        return IbacoStock.IBACO_STOCK.CREATED_ON;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return IbacoStock.IBACO_STOCK.CREATED_TIME;
    }

    @Override
    public Integer component1() {
        return getCompCode();
    }

    @Override
    public String component2() {
        return getPlantCode();
    }

    @Override
    public String component3() {
        return getMaterialCode();
    }

    @Override
    public String component4() {
        return getKunnr();
    }

    @Override
    public String component5() {
        return getCharg();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public String component7() {
        return getMaterialDesc();
    }

    @Override
    public String component8() {
        return getUom();
    }

    @Override
    public BigDecimal component9() {
        return getLabst();
    }

    @Override
    public LocalDate component10() {
        return getHsdat();
    }

    @Override
    public LocalDate component11() {
        return getVfdat();
    }

    @Override
    public BigDecimal component12() {
        return getRemdat();
    }

    @Override
    public LocalDate component13() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatedTime();
    }

    @Override
    public Integer value1() {
        return getCompCode();
    }

    @Override
    public String value2() {
        return getPlantCode();
    }

    @Override
    public String value3() {
        return getMaterialCode();
    }

    @Override
    public String value4() {
        return getKunnr();
    }

    @Override
    public String value5() {
        return getCharg();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public String value7() {
        return getMaterialDesc();
    }

    @Override
    public String value8() {
        return getUom();
    }

    @Override
    public BigDecimal value9() {
        return getLabst();
    }

    @Override
    public LocalDate value10() {
        return getHsdat();
    }

    @Override
    public LocalDate value11() {
        return getVfdat();
    }

    @Override
    public BigDecimal value12() {
        return getRemdat();
    }

    @Override
    public LocalDate value13() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatedTime();
    }

    @Override
    public IbacoStockRecord value1(Integer value) {
        setCompCode(value);
        return this;
    }

    @Override
    public IbacoStockRecord value2(String value) {
        setPlantCode(value);
        return this;
    }

    @Override
    public IbacoStockRecord value3(String value) {
        setMaterialCode(value);
        return this;
    }

    @Override
    public IbacoStockRecord value4(String value) {
        setKunnr(value);
        return this;
    }

    @Override
    public IbacoStockRecord value5(String value) {
        setCharg(value);
        return this;
    }

    @Override
    public IbacoStockRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public IbacoStockRecord value7(String value) {
        setMaterialDesc(value);
        return this;
    }

    @Override
    public IbacoStockRecord value8(String value) {
        setUom(value);
        return this;
    }

    @Override
    public IbacoStockRecord value9(BigDecimal value) {
        setLabst(value);
        return this;
    }

    @Override
    public IbacoStockRecord value10(LocalDate value) {
        setHsdat(value);
        return this;
    }

    @Override
    public IbacoStockRecord value11(LocalDate value) {
        setVfdat(value);
        return this;
    }

    @Override
    public IbacoStockRecord value12(BigDecimal value) {
        setRemdat(value);
        return this;
    }

    @Override
    public IbacoStockRecord value13(LocalDate value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public IbacoStockRecord value14(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    @Override
    public IbacoStockRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, BigDecimal value9, LocalDate value10, LocalDate value11, BigDecimal value12, LocalDate value13, LocalDateTime value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IbacoStockRecord
     */
    public IbacoStockRecord() {
        super(IbacoStock.IBACO_STOCK);
    }

    /**
     * Create a detached, initialised IbacoStockRecord
     */
    public IbacoStockRecord(Integer compCode, String plantCode, String materialCode, String kunnr, String charg, String name, String materialDesc, String uom, BigDecimal labst, LocalDate hsdat, LocalDate vfdat, BigDecimal remdat, LocalDate createdOn, LocalDateTime createdTime) {
        super(IbacoStock.IBACO_STOCK);

        setCompCode(compCode);
        setPlantCode(plantCode);
        setMaterialCode(materialCode);
        setKunnr(kunnr);
        setCharg(charg);
        setName(name);
        setMaterialDesc(materialDesc);
        setUom(uom);
        setLabst(labst);
        setHsdat(hsdat);
        setVfdat(vfdat);
        setRemdat(remdat);
        setCreatedOn(createdOn);
        setCreatedTime(createdTime);
    }
}