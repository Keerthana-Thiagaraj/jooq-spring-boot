/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcUserRoleDeptRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcUserRoleDept extends TableImpl<TcUserRoleDeptRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_USER_ROLE_DEPT</code>
     */
    public static final TcUserRoleDept TC_USER_ROLE_DEPT = new TcUserRoleDept();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcUserRoleDeptRecord> getRecordType() {
        return TcUserRoleDeptRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.USER_ID</code>.
     */
    public final TableField<TcUserRoleDeptRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.USER_TYPE_ID</code>.
     */
    public final TableField<TcUserRoleDeptRecord, Integer> USER_TYPE_ID = createField(DSL.name("USER_TYPE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.ROLE_ID</code>.
     */
    public final TableField<TcUserRoleDeptRecord, Integer> ROLE_ID = createField(DSL.name("ROLE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.DEPT_ID</code>.
     */
    public final TableField<TcUserRoleDeptRecord, String> DEPT_ID = createField(DSL.name("DEPT_ID"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.STATUS</code>.
     */
    public final TableField<TcUserRoleDeptRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.CREATED_BY</code>.
     */
    public final TableField<TcUserRoleDeptRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.CREATED_ON</code>.
     */
    public final TableField<TcUserRoleDeptRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.LAST_CHANGED_BY</code>.
     */
    public final TableField<TcUserRoleDeptRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_USER_ROLE_DEPT.LAST_CHANGED_ON</code>.
     */
    public final TableField<TcUserRoleDeptRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private TcUserRoleDept(Name alias, Table<TcUserRoleDeptRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcUserRoleDept(Name alias, Table<TcUserRoleDeptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_USER_ROLE_DEPT</code> table reference
     */
    public TcUserRoleDept(String alias) {
        this(DSL.name(alias), TC_USER_ROLE_DEPT);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_USER_ROLE_DEPT</code> table reference
     */
    public TcUserRoleDept(Name alias) {
        this(alias, TC_USER_ROLE_DEPT);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_USER_ROLE_DEPT</code> table reference
     */
    public TcUserRoleDept() {
        this(DSL.name("TC_USER_ROLE_DEPT"), null);
    }

    public <O extends Record> TcUserRoleDept(Table<O> child, ForeignKey<O, TcUserRoleDeptRecord> key) {
        super(child, key, TC_USER_ROLE_DEPT);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<TcUserRoleDeptRecord> getPrimaryKey() {
        return Keys.KEY_TC_USER_ROLE_DEPT_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcUserRoleDeptRecord>> getKeys() {
        return Arrays.<UniqueKey<TcUserRoleDeptRecord>>asList(Keys.KEY_TC_USER_ROLE_DEPT_PRIMARY);
    }

    @Override
    public TcUserRoleDept as(String alias) {
        return new TcUserRoleDept(DSL.name(alias), this);
    }

    @Override
    public TcUserRoleDept as(Name alias) {
        return new TcUserRoleDept(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcUserRoleDept rename(String name) {
        return new TcUserRoleDept(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcUserRoleDept rename(Name name) {
        return new TcUserRoleDept(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Integer, Integer, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
