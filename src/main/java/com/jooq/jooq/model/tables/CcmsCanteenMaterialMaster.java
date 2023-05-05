/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsCanteenMaterialMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class CcmsCanteenMaterialMaster extends TableImpl<CcmsCanteenMaterialMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_canteen_material_master</code>
     */
    public static final CcmsCanteenMaterialMaster CCMS_CANTEEN_MATERIAL_MASTER = new CcmsCanteenMaterialMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsCanteenMaterialMasterRecord> getRecordType() {
        return CcmsCanteenMaterialMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.plant</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> PLANT = createField(DSL.name("plant"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.material_code</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> MATERIAL_CODE = createField(DSL.name("material_code"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.strg_location</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> STRG_LOCATION = createField(DSL.name("strg_location"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.hsn_code</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> HSN_CODE = createField(DSL.name("hsn_code"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.cost_center</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> COST_CENTER = createField(DSL.name("cost_center"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.type</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.created_by</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.created_on</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.last_changed_by</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("last_changed_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_material_master.last_changed_on</code>.
     */
    public final TableField<CcmsCanteenMaterialMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("last_changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    private CcmsCanteenMaterialMaster(Name alias, Table<CcmsCanteenMaterialMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsCanteenMaterialMaster(Name alias, Table<CcmsCanteenMaterialMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_canteen_material_master</code> table reference
     */
    public CcmsCanteenMaterialMaster(String alias) {
        this(DSL.name(alias), CCMS_CANTEEN_MATERIAL_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_canteen_material_master</code> table reference
     */
    public CcmsCanteenMaterialMaster(Name alias) {
        this(alias, CCMS_CANTEEN_MATERIAL_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_canteen_material_master</code> table reference
     */
    public CcmsCanteenMaterialMaster() {
        this(DSL.name("ccms_canteen_material_master"), null);
    }

    public <O extends Record> CcmsCanteenMaterialMaster(Table<O> child, ForeignKey<O, CcmsCanteenMaterialMasterRecord> key) {
        super(child, key, CCMS_CANTEEN_MATERIAL_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsCanteenMaterialMasterRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_CANTEEN_MATERIAL_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsCanteenMaterialMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsCanteenMaterialMasterRecord>>asList(Keys.KEY_CCMS_CANTEEN_MATERIAL_MASTER_PRIMARY);
    }

    @Override
    public CcmsCanteenMaterialMaster as(String alias) {
        return new CcmsCanteenMaterialMaster(DSL.name(alias), this);
    }

    @Override
    public CcmsCanteenMaterialMaster as(Name alias) {
        return new CcmsCanteenMaterialMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsCanteenMaterialMaster rename(String name) {
        return new CcmsCanteenMaterialMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsCanteenMaterialMaster rename(Name name) {
        return new CcmsCanteenMaterialMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}