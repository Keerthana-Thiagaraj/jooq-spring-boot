/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.RbFloorMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class RbFloorMaster extends TableImpl<RbFloorMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.RB_FLOOR_MASTER</code>
     */
    public static final RbFloorMaster RB_FLOOR_MASTER = new RbFloorMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RbFloorMasterRecord> getRecordType() {
        return RbFloorMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.FLOOR_CODE</code>.
     */
    public final TableField<RbFloorMasterRecord, Integer> FLOOR_CODE = createField(DSL.name("FLOOR_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.BUILDING_CODE</code>.
     */
    public final TableField<RbFloorMasterRecord, Integer> BUILDING_CODE = createField(DSL.name("BUILDING_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.RB_LOCATION_CODE</code>.
     */
    public final TableField<RbFloorMasterRecord, Integer> RB_LOCATION_CODE = createField(DSL.name("RB_LOCATION_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.FLOOR_NAME</code>.
     */
    public final TableField<RbFloorMasterRecord, String> FLOOR_NAME = createField(DSL.name("FLOOR_NAME"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.STATUS_FLAG</code>.
     */
    public final TableField<RbFloorMasterRecord, String> STATUS_FLAG = createField(DSL.name("STATUS_FLAG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.CREATED_BY</code>.
     */
    public final TableField<RbFloorMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.CREATED_ON</code>.
     */
    public final TableField<RbFloorMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.LAST_CHANGED_BY</code>.
     */
    public final TableField<RbFloorMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.RB_FLOOR_MASTER.LAST_CHANGED_ON</code>.
     */
    public final TableField<RbFloorMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private RbFloorMaster(Name alias, Table<RbFloorMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private RbFloorMaster(Name alias, Table<RbFloorMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.RB_FLOOR_MASTER</code> table reference
     */
    public RbFloorMaster(String alias) {
        this(DSL.name(alias), RB_FLOOR_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.RB_FLOOR_MASTER</code> table reference
     */
    public RbFloorMaster(Name alias) {
        this(alias, RB_FLOOR_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.RB_FLOOR_MASTER</code> table reference
     */
    public RbFloorMaster() {
        this(DSL.name("RB_FLOOR_MASTER"), null);
    }

    public <O extends Record> RbFloorMaster(Table<O> child, ForeignKey<O, RbFloorMasterRecord> key) {
        super(child, key, RB_FLOOR_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RB_FLOOR_MASTER_FK_RB_FLOOR_BUILDING_IDX, Indexes.RB_FLOOR_MASTER_PK_INDEXES);
    }

    @Override
    public UniqueKey<RbFloorMasterRecord> getPrimaryKey() {
        return Keys.KEY_RB_FLOOR_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<RbFloorMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<RbFloorMasterRecord>>asList(Keys.KEY_RB_FLOOR_MASTER_PRIMARY);
    }

    @Override
    public List<ForeignKey<RbFloorMasterRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RbFloorMasterRecord, ?>>asList(Keys.FK_RB_FLOOR_BUILDING);
    }

    private transient RbBuildingMaster _rbBuildingMaster;

    public RbBuildingMaster rbBuildingMaster() {
        if (_rbBuildingMaster == null)
            _rbBuildingMaster = new RbBuildingMaster(this, Keys.FK_RB_FLOOR_BUILDING);

        return _rbBuildingMaster;
    }

    @Override
    public RbFloorMaster as(String alias) {
        return new RbFloorMaster(DSL.name(alias), this);
    }

    @Override
    public RbFloorMaster as(Name alias) {
        return new RbFloorMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RbFloorMaster rename(String name) {
        return new RbFloorMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RbFloorMaster rename(Name name) {
        return new RbFloorMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
