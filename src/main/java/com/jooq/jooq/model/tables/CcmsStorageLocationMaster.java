/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsStorageLocationMasterRecord;

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
public class CcmsStorageLocationMaster extends TableImpl<CcmsStorageLocationMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_storage_location_master</code>
     */
    public static final CcmsStorageLocationMaster CCMS_STORAGE_LOCATION_MASTER = new CcmsStorageLocationMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsStorageLocationMasterRecord> getRecordType() {
        return CcmsStorageLocationMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.cost_center</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, Integer> COST_CENTER = createField(DSL.name("cost_center"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.location</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, String> LOCATION = createField(DSL.name("location"), SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.plant</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, String> PLANT = createField(DSL.name("plant"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.tax_code</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, String> TAX_CODE = createField(DSL.name("tax_code"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.status</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.created_by</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.created_on</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.last_changed_by</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("last_changed_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_storage_location_master.last_changed_on</code>.
     */
    public final TableField<CcmsStorageLocationMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("last_changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    private CcmsStorageLocationMaster(Name alias, Table<CcmsStorageLocationMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsStorageLocationMaster(Name alias, Table<CcmsStorageLocationMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_storage_location_master</code> table reference
     */
    public CcmsStorageLocationMaster(String alias) {
        this(DSL.name(alias), CCMS_STORAGE_LOCATION_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_storage_location_master</code> table reference
     */
    public CcmsStorageLocationMaster(Name alias) {
        this(alias, CCMS_STORAGE_LOCATION_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_storage_location_master</code> table reference
     */
    public CcmsStorageLocationMaster() {
        this(DSL.name("ccms_storage_location_master"), null);
    }

    public <O extends Record> CcmsStorageLocationMaster(Table<O> child, ForeignKey<O, CcmsStorageLocationMasterRecord> key) {
        super(child, key, CCMS_STORAGE_LOCATION_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsStorageLocationMasterRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_STORAGE_LOCATION_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsStorageLocationMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsStorageLocationMasterRecord>>asList(Keys.KEY_CCMS_STORAGE_LOCATION_MASTER_PRIMARY);
    }

    @Override
    public CcmsStorageLocationMaster as(String alias) {
        return new CcmsStorageLocationMaster(DSL.name(alias), this);
    }

    @Override
    public CcmsStorageLocationMaster as(Name alias) {
        return new CcmsStorageLocationMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsStorageLocationMaster rename(String name) {
        return new CcmsStorageLocationMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsStorageLocationMaster rename(Name name) {
        return new CcmsStorageLocationMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}