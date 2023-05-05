/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.AssetTrackerMasterRecord;

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
public class AssetTrackerMaster extends TableImpl<AssetTrackerMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.asset_tracker_master</code>
     */
    public static final AssetTrackerMaster ASSET_TRACKER_MASTER = new AssetTrackerMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AssetTrackerMasterRecord> getRecordType() {
        return AssetTrackerMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.COMP_CODE</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.ASSET_NO</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> ASSET_NO = createField(DSL.name("ASSET_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.CUSTOMER_ID</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> CUSTOMER_ID = createField(DSL.name("CUSTOMER_ID"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.FLAG</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> FLAG = createField(DSL.name("FLAG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.SAP_UPLOADED_DATE</code>.
     */
    public final TableField<AssetTrackerMasterRecord, LocalDateTime> SAP_UPLOADED_DATE = createField(DSL.name("SAP_UPLOADED_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.SAP_STATUS</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> SAP_STATUS = createField(DSL.name("SAP_STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.SAP_ERROR</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> SAP_ERROR = createField(DSL.name("SAP_ERROR"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.CREATED_ON</code>.
     */
    public final TableField<AssetTrackerMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.CREATED_BY</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.asset_tracker_master.STATUS</code>.
     */
    public final TableField<AssetTrackerMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    private AssetTrackerMaster(Name alias, Table<AssetTrackerMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private AssetTrackerMaster(Name alias, Table<AssetTrackerMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.asset_tracker_master</code> table reference
     */
    public AssetTrackerMaster(String alias) {
        this(DSL.name(alias), ASSET_TRACKER_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.asset_tracker_master</code> table reference
     */
    public AssetTrackerMaster(Name alias) {
        this(alias, ASSET_TRACKER_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.asset_tracker_master</code> table reference
     */
    public AssetTrackerMaster() {
        this(DSL.name("asset_tracker_master"), null);
    }

    public <O extends Record> AssetTrackerMaster(Table<O> child, ForeignKey<O, AssetTrackerMasterRecord> key) {
        super(child, key, ASSET_TRACKER_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<AssetTrackerMasterRecord> getPrimaryKey() {
        return Keys.KEY_ASSET_TRACKER_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<AssetTrackerMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<AssetTrackerMasterRecord>>asList(Keys.KEY_ASSET_TRACKER_MASTER_PRIMARY);
    }

    @Override
    public AssetTrackerMaster as(String alias) {
        return new AssetTrackerMaster(DSL.name(alias), this);
    }

    @Override
    public AssetTrackerMaster as(Name alias) {
        return new AssetTrackerMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AssetTrackerMaster rename(String name) {
        return new AssetTrackerMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AssetTrackerMaster rename(Name name) {
        return new AssetTrackerMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, LocalDateTime, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}