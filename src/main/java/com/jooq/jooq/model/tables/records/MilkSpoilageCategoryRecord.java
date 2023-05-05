/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.MilkSpoilageCategory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MilkSpoilageCategoryRecord extends UpdatableRecordImpl<MilkSpoilageCategoryRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.milk_spoilage_category.milk_code</code>.
     */
    public MilkSpoilageCategoryRecord setMilkCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_spoilage_category.milk_code</code>.
     */
    public String getMilkCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_spoilage_category.milk_desc</code>.
     */
    public MilkSpoilageCategoryRecord setMilkDesc(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_spoilage_category.milk_desc</code>.
     */
    public String getMilkDesc() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MilkSpoilageCategory.MILK_SPOILAGE_CATEGORY.MILK_CODE;
    }

    @Override
    public Field<String> field2() {
        return MilkSpoilageCategory.MILK_SPOILAGE_CATEGORY.MILK_DESC;
    }

    @Override
    public String component1() {
        return getMilkCode();
    }

    @Override
    public String component2() {
        return getMilkDesc();
    }

    @Override
    public String value1() {
        return getMilkCode();
    }

    @Override
    public String value2() {
        return getMilkDesc();
    }

    @Override
    public MilkSpoilageCategoryRecord value1(String value) {
        setMilkCode(value);
        return this;
    }

    @Override
    public MilkSpoilageCategoryRecord value2(String value) {
        setMilkDesc(value);
        return this;
    }

    @Override
    public MilkSpoilageCategoryRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilkSpoilageCategoryRecord
     */
    public MilkSpoilageCategoryRecord() {
        super(MilkSpoilageCategory.MILK_SPOILAGE_CATEGORY);
    }

    /**
     * Create a detached, initialised MilkSpoilageCategoryRecord
     */
    public MilkSpoilageCategoryRecord(String milkCode, String milkDesc) {
        super(MilkSpoilageCategory.MILK_SPOILAGE_CATEGORY);

        setMilkCode(milkCode);
        setMilkDesc(milkDesc);
    }
}