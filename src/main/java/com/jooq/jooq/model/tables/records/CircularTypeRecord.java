/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CircularType;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CircularTypeRecord extends UpdatableRecordImpl<CircularTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.circular_type.ID</code>.
     */
    public CircularTypeRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_type.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_type.CIRCULAR_NAME</code>.
     */
    public CircularTypeRecord setCircularName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_type.CIRCULAR_NAME</code>.
     */
    public String getCircularName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return CircularType.CIRCULAR_TYPE.ID;
    }

    @Override
    public Field<String> field2() {
        return CircularType.CIRCULAR_TYPE.CIRCULAR_NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCircularName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCircularName();
    }

    @Override
    public CircularTypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CircularTypeRecord value2(String value) {
        setCircularName(value);
        return this;
    }

    @Override
    public CircularTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CircularTypeRecord
     */
    public CircularTypeRecord() {
        super(CircularType.CIRCULAR_TYPE);
    }

    /**
     * Create a detached, initialised CircularTypeRecord
     */
    public CircularTypeRecord(Integer id, String circularName) {
        super(CircularType.CIRCULAR_TYPE);

        setId(id);
        setCircularName(circularName);
    }
}