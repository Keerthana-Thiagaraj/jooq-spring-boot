/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CircularDisplayDetailsRecord;

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
public class CircularDisplayDetails extends TableImpl<CircularDisplayDetailsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.circular_display_details</code>
     */
    public static final CircularDisplayDetails CIRCULAR_DISPLAY_DETAILS = new CircularDisplayDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CircularDisplayDetailsRecord> getRecordType() {
        return CircularDisplayDetailsRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.COMP_CODE</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.CUSTOMER_CODE</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.SERIAL_NO</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.COUNTRY_CODE</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> COUNTRY_CODE = createField(DSL.name("COUNTRY_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.REGION_CODE</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> REGION_CODE = createField(DSL.name("REGION_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.ROLE_ID</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> ROLE_ID = createField(DSL.name("ROLE_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.TYPE_ID</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> TYPE_ID = createField(DSL.name("TYPE_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.BLOCKED_BY</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, String> BLOCKED_BY = createField(DSL.name("BLOCKED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.circular_display_details.BLOCKED_ON</code>.
     */
    public final TableField<CircularDisplayDetailsRecord, LocalDateTime> BLOCKED_ON = createField(DSL.name("BLOCKED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private CircularDisplayDetails(Name alias, Table<CircularDisplayDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CircularDisplayDetails(Name alias, Table<CircularDisplayDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.circular_display_details</code> table reference
     */
    public CircularDisplayDetails(String alias) {
        this(DSL.name(alias), CIRCULAR_DISPLAY_DETAILS);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.circular_display_details</code> table reference
     */
    public CircularDisplayDetails(Name alias) {
        this(alias, CIRCULAR_DISPLAY_DETAILS);
    }

    /**
     * Create a <code>vendor_portal_pbx.circular_display_details</code> table reference
     */
    public CircularDisplayDetails() {
        this(DSL.name("circular_display_details"), null);
    }

    public <O extends Record> CircularDisplayDetails(Table<O> child, ForeignKey<O, CircularDisplayDetailsRecord> key) {
        super(child, key, CIRCULAR_DISPLAY_DETAILS);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CircularDisplayDetailsRecord> getPrimaryKey() {
        return Keys.KEY_CIRCULAR_DISPLAY_DETAILS_PRIMARY;
    }

    @Override
    public List<UniqueKey<CircularDisplayDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<CircularDisplayDetailsRecord>>asList(Keys.KEY_CIRCULAR_DISPLAY_DETAILS_PRIMARY);
    }

    @Override
    public CircularDisplayDetails as(String alias) {
        return new CircularDisplayDetails(DSL.name(alias), this);
    }

    @Override
    public CircularDisplayDetails as(Name alias) {
        return new CircularDisplayDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CircularDisplayDetails rename(String name) {
        return new CircularDisplayDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CircularDisplayDetails rename(Name name) {
        return new CircularDisplayDetails(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}