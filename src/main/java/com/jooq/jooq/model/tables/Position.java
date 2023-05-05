/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.PositionRecord;

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
public class Position extends TableImpl<PositionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.position</code>
     */
    public static final Position POSITION = new Position();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PositionRecord> getRecordType() {
        return PositionRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.position.POSITION_ID</code>.
     */
    public final TableField<PositionRecord, String> POSITION_ID = createField(DSL.name("POSITION_ID"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.position.NAME</code>.
     */
    public final TableField<PositionRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>vendor_portal_pbx.position.STATUS</code>.
     */
    public final TableField<PositionRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.position.CREATED_BY</code>.
     */
    public final TableField<PositionRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.position.CREATED_ON</code>.
     */
    public final TableField<PositionRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.position.LAST_CHANGED_BY</code>.
     */
    public final TableField<PositionRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.position.LAST_CHANGED_ON</code>.
     */
    public final TableField<PositionRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private Position(Name alias, Table<PositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Position(Name alias, Table<PositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.position</code> table reference
     */
    public Position(String alias) {
        this(DSL.name(alias), POSITION);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.position</code> table reference
     */
    public Position(Name alias) {
        this(alias, POSITION);
    }

    /**
     * Create a <code>vendor_portal_pbx.position</code> table reference
     */
    public Position() {
        this(DSL.name("position"), null);
    }

    public <O extends Record> Position(Table<O> child, ForeignKey<O, PositionRecord> key) {
        super(child, key, POSITION);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<PositionRecord> getPrimaryKey() {
        return Keys.KEY_POSITION_PRIMARY;
    }

    @Override
    public List<UniqueKey<PositionRecord>> getKeys() {
        return Arrays.<UniqueKey<PositionRecord>>asList(Keys.KEY_POSITION_PRIMARY);
    }

    @Override
    public Position as(String alias) {
        return new Position(DSL.name(alias), this);
    }

    @Override
    public Position as(Name alias) {
        return new Position(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Position rename(String name) {
        return new Position(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Position rename(Name name) {
        return new Position(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}