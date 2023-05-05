/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsWorkLocationMasterRecord;

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
public class CcmsWorkLocationMaster extends TableImpl<CcmsWorkLocationMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_work_location_master</code>
     */
    public static final CcmsWorkLocationMaster CCMS_WORK_LOCATION_MASTER = new CcmsWorkLocationMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsWorkLocationMasterRecord> getRecordType() {
        return CcmsWorkLocationMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_work_location_master.name</code>.
     */
    public final TableField<CcmsWorkLocationMasterRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_work_location_master.plant</code>.
     */
    public final TableField<CcmsWorkLocationMasterRecord, String> PLANT = createField(DSL.name("plant"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_work_location_master.state</code>.
     */
    public final TableField<CcmsWorkLocationMasterRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_work_location_master.created_by</code>.
     */
    public final TableField<CcmsWorkLocationMasterRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_work_location_master.created_on</code>.
     */
    public final TableField<CcmsWorkLocationMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_work_location_master.last_changed_by</code>.
     */
    public final TableField<CcmsWorkLocationMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("last_changed_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_work_location_master.last_changed_on</code>.
     */
    public final TableField<CcmsWorkLocationMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("last_changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    private CcmsWorkLocationMaster(Name alias, Table<CcmsWorkLocationMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsWorkLocationMaster(Name alias, Table<CcmsWorkLocationMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_work_location_master</code> table reference
     */
    public CcmsWorkLocationMaster(String alias) {
        this(DSL.name(alias), CCMS_WORK_LOCATION_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_work_location_master</code> table reference
     */
    public CcmsWorkLocationMaster(Name alias) {
        this(alias, CCMS_WORK_LOCATION_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_work_location_master</code> table reference
     */
    public CcmsWorkLocationMaster() {
        this(DSL.name("ccms_work_location_master"), null);
    }

    public <O extends Record> CcmsWorkLocationMaster(Table<O> child, ForeignKey<O, CcmsWorkLocationMasterRecord> key) {
        super(child, key, CCMS_WORK_LOCATION_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsWorkLocationMasterRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_WORK_LOCATION_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsWorkLocationMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsWorkLocationMasterRecord>>asList(Keys.KEY_CCMS_WORK_LOCATION_MASTER_PRIMARY);
    }

    @Override
    public CcmsWorkLocationMaster as(String alias) {
        return new CcmsWorkLocationMaster(DSL.name(alias), this);
    }

    @Override
    public CcmsWorkLocationMaster as(Name alias) {
        return new CcmsWorkLocationMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsWorkLocationMaster rename(String name) {
        return new CcmsWorkLocationMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsWorkLocationMaster rename(Name name) {
        return new CcmsWorkLocationMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}