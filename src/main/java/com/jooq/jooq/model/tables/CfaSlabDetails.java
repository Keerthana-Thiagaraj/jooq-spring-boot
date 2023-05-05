/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CfaSlabDetailsRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class CfaSlabDetails extends TableImpl<CfaSlabDetailsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.cfa_slab_details</code>
     */
    public static final CfaSlabDetails CFA_SLAB_DETAILS = new CfaSlabDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CfaSlabDetailsRecord> getRecordType() {
        return CfaSlabDetailsRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.PLANT</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.FROM_DATE</code>.
     */
    public final TableField<CfaSlabDetailsRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.TO_DATE</code>.
     */
    public final TableField<CfaSlabDetailsRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.SLAB</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> SLAB = createField(DSL.name("SLAB"), SQLDataType.VARCHAR(150).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.PLANT_NAME</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> PLANT_NAME = createField(DSL.name("PLANT_NAME"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.STATE</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.CITY</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> CITY = createField(DSL.name("CITY"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.KILO_METER</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> KILO_METER = createField(DSL.name("KILO_METER"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.RATE_PER_KM</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> RATE_PER_KM = createField(DSL.name("RATE_PER_KM"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.CREATED_BY</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.CREATED_ON</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.cfa_slab_details.STATUS</code>.
     */
    public final TableField<CfaSlabDetailsRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    private CfaSlabDetails(Name alias, Table<CfaSlabDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CfaSlabDetails(Name alias, Table<CfaSlabDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.cfa_slab_details</code> table reference
     */
    public CfaSlabDetails(String alias) {
        this(DSL.name(alias), CFA_SLAB_DETAILS);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.cfa_slab_details</code> table reference
     */
    public CfaSlabDetails(Name alias) {
        this(alias, CFA_SLAB_DETAILS);
    }

    /**
     * Create a <code>vendor_portal_pbx.cfa_slab_details</code> table reference
     */
    public CfaSlabDetails() {
        this(DSL.name("cfa_slab_details"), null);
    }

    public <O extends Record> CfaSlabDetails(Table<O> child, ForeignKey<O, CfaSlabDetailsRecord> key) {
        super(child, key, CFA_SLAB_DETAILS);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CfaSlabDetailsRecord> getPrimaryKey() {
        return Keys.KEY_CFA_SLAB_DETAILS_PRIMARY;
    }

    @Override
    public List<UniqueKey<CfaSlabDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<CfaSlabDetailsRecord>>asList(Keys.KEY_CFA_SLAB_DETAILS_PRIMARY);
    }

    @Override
    public CfaSlabDetails as(String alias) {
        return new CfaSlabDetails(DSL.name(alias), this);
    }

    @Override
    public CfaSlabDetails as(Name alias) {
        return new CfaSlabDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CfaSlabDetails rename(String name) {
        return new CfaSlabDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CfaSlabDetails rename(Name name) {
        return new CfaSlabDetails(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, LocalDate, LocalDate, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
