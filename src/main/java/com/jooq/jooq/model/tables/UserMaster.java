/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.JooqDemo;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.tables.records.UserMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class UserMaster extends TableImpl<UserMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq_demo.user_master</code>
     */
    public static final UserMaster USER_MASTER = new UserMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserMasterRecord> getRecordType() {
        return UserMasterRecord.class;
    }

    /**
     * The column <code>jooq_demo.user_master.USER_ID</code>.
     */
    public final TableField<UserMasterRecord, Integer> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq_demo.user_master.CREATED_BY</code>.
     */
    public final TableField<UserMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>jooq_demo.user_master.STATUS</code>.
     */
    public final TableField<UserMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>jooq_demo.user_master.NAME</code>.
     */
    public final TableField<UserMasterRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>jooq_demo.user_master.CREATED_ON</code>.
     */
    public final TableField<UserMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>jooq_demo.user_master.MOBILE</code>.
     */
    public final TableField<UserMasterRecord, String> MOBILE = createField(DSL.name("MOBILE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>jooq_demo.user_master.EMAIL_ID</code>.
     */
    public final TableField<UserMasterRecord, String> EMAIL_ID = createField(DSL.name("EMAIL_ID"), SQLDataType.VARCHAR(80), this, "");

    private UserMaster(Name alias, Table<UserMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserMaster(Name alias, Table<UserMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>jooq_demo.user_master</code> table reference
     */
    public UserMaster(String alias) {
        this(DSL.name(alias), USER_MASTER);
    }

    /**
     * Create an aliased <code>jooq_demo.user_master</code> table reference
     */
    public UserMaster(Name alias) {
        this(alias, USER_MASTER);
    }

    /**
     * Create a <code>jooq_demo.user_master</code> table reference
     */
    public UserMaster() {
        this(DSL.name("user_master"), null);
    }

    public <O extends Record> UserMaster(Table<O> child, ForeignKey<O, UserMasterRecord> key) {
        super(child, key, USER_MASTER);
    }

    @Override
    public Schema getSchema() {
        return JooqDemo.JOOQ_DEMO;
    }

    @Override
    public UniqueKey<UserMasterRecord> getPrimaryKey() {
        return Keys.KEY_USER_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<UserMasterRecord>>asList(Keys.KEY_USER_MASTER_PRIMARY);
    }

    @Override
    public UserMaster as(String alias) {
        return new UserMaster(DSL.name(alias), this);
    }

    @Override
    public UserMaster as(Name alias) {
        return new UserMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMaster rename(String name) {
        return new UserMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMaster rename(Name name) {
        return new UserMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
