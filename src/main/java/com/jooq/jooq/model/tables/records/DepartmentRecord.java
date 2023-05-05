/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.Department;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DepartmentRecord extends UpdatableRecordImpl<DepartmentRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.department.DEPARTMENT_ID</code>.
     */
    public DepartmentRecord setDepartmentId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department.DEPARTMENT_ID</code>.
     */
    public Integer getDepartmentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.department.DEPARTMENT_NAME</code>.
     */
    public DepartmentRecord setDepartmentName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department.DEPARTMENT_NAME</code>.
     */
    public String getDepartmentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.department.BLOCK</code>.
     */
    public DepartmentRecord setBlock(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.department.BLOCK</code>.
     */
    public String getBlock() {
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
        return Department.DEPARTMENT.DEPARTMENT_ID;
    }

    @Override
    public Field<String> field2() {
        return Department.DEPARTMENT.DEPARTMENT_NAME;
    }

    @Override
    public Field<String> field3() {
        return Department.DEPARTMENT.BLOCK;
    }

    @Override
    public Integer component1() {
        return getDepartmentId();
    }

    @Override
    public String component2() {
        return getDepartmentName();
    }

    @Override
    public String component3() {
        return getBlock();
    }

    @Override
    public Integer value1() {
        return getDepartmentId();
    }

    @Override
    public String value2() {
        return getDepartmentName();
    }

    @Override
    public String value3() {
        return getBlock();
    }

    @Override
    public DepartmentRecord value1(Integer value) {
        setDepartmentId(value);
        return this;
    }

    @Override
    public DepartmentRecord value2(String value) {
        setDepartmentName(value);
        return this;
    }

    @Override
    public DepartmentRecord value3(String value) {
        setBlock(value);
        return this;
    }

    @Override
    public DepartmentRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DepartmentRecord
     */
    public DepartmentRecord() {
        super(Department.DEPARTMENT);
    }

    /**
     * Create a detached, initialised DepartmentRecord
     */
    public DepartmentRecord(Integer departmentId, String departmentName, String block) {
        super(Department.DEPARTMENT);

        setDepartmentId(departmentId);
        setDepartmentName(departmentName);
        setBlock(block);
    }
}