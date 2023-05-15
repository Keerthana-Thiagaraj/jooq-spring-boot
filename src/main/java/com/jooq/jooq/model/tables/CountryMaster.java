/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.JooqDemo;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.tables.records.CountryMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class CountryMaster extends TableImpl<CountryMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq_demo.country_master</code>
     */
    public static final CountryMaster COUNTRY_MASTER = new CountryMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryMasterRecord> getRecordType() {
        return CountryMasterRecord.class;
    }

    /**
     * The column <code>jooq_demo.country_master.ID</code>.
     */
    public final TableField<CountryMasterRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jooq_demo.country_master.SORT_NAME</code>.
     */
    public final TableField<CountryMasterRecord, String> SORT_NAME = createField(DSL.name("SORT_NAME"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>jooq_demo.country_master.NAME</code>.
     */
    public final TableField<CountryMasterRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(150).nullable(false), this, "");

    /**
     * The column <code>jooq_demo.country_master.PHONE_CODE</code>.
     */
    public final TableField<CountryMasterRecord, Integer> PHONE_CODE = createField(DSL.name("PHONE_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq_demo.country_master.STATUS</code>.
     */
    public final TableField<CountryMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>jooq_demo.country_master.CREATED_BY</code>.
     */
    public final TableField<CountryMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>jooq_demo.country_master.CREATED_ON</code>.
     */
    public final TableField<CountryMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private CountryMaster(Name alias, Table<CountryMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private CountryMaster(Name alias, Table<CountryMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>jooq_demo.country_master</code> table reference
     */
    public CountryMaster(String alias) {
        this(DSL.name(alias), COUNTRY_MASTER);
    }

    /**
     * Create an aliased <code>jooq_demo.country_master</code> table reference
     */
    public CountryMaster(Name alias) {
        this(alias, COUNTRY_MASTER);
    }

    /**
     * Create a <code>jooq_demo.country_master</code> table reference
     */
    public CountryMaster() {
        this(DSL.name("country_master"), null);
    }

    public <O extends Record> CountryMaster(Table<O> child, ForeignKey<O, CountryMasterRecord> key) {
        super(child, key, COUNTRY_MASTER);
    }

    @Override
    public Schema getSchema() {
        return JooqDemo.JOOQ_DEMO;
    }

    @Override
    public Identity<CountryMasterRecord, Integer> getIdentity() {
        return (Identity<CountryMasterRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CountryMasterRecord> getPrimaryKey() {
        return Keys.KEY_COUNTRY_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CountryMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryMasterRecord>>asList(Keys.KEY_COUNTRY_MASTER_PRIMARY);
    }

    @Override
    public CountryMaster as(String alias) {
        return new CountryMaster(DSL.name(alias), this);
    }

    @Override
    public CountryMaster as(Name alias) {
        return new CountryMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryMaster rename(String name) {
        return new CountryMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryMaster rename(Name name) {
        return new CountryMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}