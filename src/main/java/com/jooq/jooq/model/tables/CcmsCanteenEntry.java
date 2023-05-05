/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsCanteenEntryRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class CcmsCanteenEntry extends TableImpl<CcmsCanteenEntryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_canteen_entry</code>
     */
    public static final CcmsCanteenEntry CCMS_CANTEEN_ENTRY = new CcmsCanteenEntry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsCanteenEntryRecord> getRecordType() {
        return CcmsCanteenEntryRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.id</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.created_by</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.created_on</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.last_modified_by</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> LAST_MODIFIED_BY = createField(DSL.name("last_modified_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.last_modified_on</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, LocalDateTime> LAST_MODIFIED_ON = createField(DSL.name("last_modified_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.guest_count</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, Integer> GUEST_COUNT = createField(DSL.name("guest_count"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.punch_time</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> PUNCH_TIME = createField(DSL.name("punch_time"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.emp_code</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> EMP_CODE = createField(DSL.name("emp_code"), SQLDataType.VARCHAR(55).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.shift_id</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, Long> SHIFT_ID = createField(DSL.name("shift_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.active</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> ACTIVE = createField(DSL.name("active"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.plant_code</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> PLANT_CODE = createField(DSL.name("plant_code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.punch_date</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> PUNCH_DATE = createField(DSL.name("punch_date"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.guest_id</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> GUEST_ID = createField(DSL.name("guest_id"), SQLDataType.VARCHAR(55), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.image_name</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> IMAGE_NAME = createField(DSL.name("image_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_entry.punch_image_url</code>.
     */
    public final TableField<CcmsCanteenEntryRecord, String> PUNCH_IMAGE_URL = createField(DSL.name("punch_image_url"), SQLDataType.VARCHAR(255), this, "");

    private CcmsCanteenEntry(Name alias, Table<CcmsCanteenEntryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsCanteenEntry(Name alias, Table<CcmsCanteenEntryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_canteen_entry</code> table reference
     */
    public CcmsCanteenEntry(String alias) {
        this(DSL.name(alias), CCMS_CANTEEN_ENTRY);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_canteen_entry</code> table reference
     */
    public CcmsCanteenEntry(Name alias) {
        this(alias, CCMS_CANTEEN_ENTRY);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_canteen_entry</code> table reference
     */
    public CcmsCanteenEntry() {
        this(DSL.name("ccms_canteen_entry"), null);
    }

    public <O extends Record> CcmsCanteenEntry(Table<O> child, ForeignKey<O, CcmsCanteenEntryRecord> key) {
        super(child, key, CCMS_CANTEEN_ENTRY);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CCMS_CANTEEN_ENTRY_EMP_FK_IDX, Indexes.CCMS_CANTEEN_ENTRY_SHIFT_FK_IDX);
    }

    @Override
    public Identity<CcmsCanteenEntryRecord, Long> getIdentity() {
        return (Identity<CcmsCanteenEntryRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CcmsCanteenEntryRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_CANTEEN_ENTRY_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsCanteenEntryRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsCanteenEntryRecord>>asList(Keys.KEY_CCMS_CANTEEN_ENTRY_PRIMARY);
    }

    @Override
    public List<ForeignKey<CcmsCanteenEntryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CcmsCanteenEntryRecord, ?>>asList(Keys.EMP_FK, Keys.SHIFT_FK);
    }

    private transient CcmsEmployee _ccmsEmployee;
    private transient CcmsShiftMaster _ccmsShiftMaster;

    public CcmsEmployee ccmsEmployee() {
        if (_ccmsEmployee == null)
            _ccmsEmployee = new CcmsEmployee(this, Keys.EMP_FK);

        return _ccmsEmployee;
    }

    public CcmsShiftMaster ccmsShiftMaster() {
        if (_ccmsShiftMaster == null)
            _ccmsShiftMaster = new CcmsShiftMaster(this, Keys.SHIFT_FK);

        return _ccmsShiftMaster;
    }

    @Override
    public CcmsCanteenEntry as(String alias) {
        return new CcmsCanteenEntry(DSL.name(alias), this);
    }

    @Override
    public CcmsCanteenEntry as(Name alias) {
        return new CcmsCanteenEntry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsCanteenEntry rename(String name) {
        return new CcmsCanteenEntry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsCanteenEntry rename(Name name) {
        return new CcmsCanteenEntry(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, String, LocalDateTime, String, LocalDateTime, Integer, String, String, Long, String, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}