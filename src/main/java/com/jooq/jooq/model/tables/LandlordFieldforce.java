/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.LandlordFieldforceRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class LandlordFieldforce extends TableImpl<LandlordFieldforceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.landlord_fieldforce</code>
     */
    public static final LandlordFieldforce LANDLORD_FIELDFORCE = new LandlordFieldforce();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LandlordFieldforceRecord> getRecordType() {
        return LandlordFieldforceRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.VENDOR_CODE</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.FS_NAME</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> FS_NAME = createField(DSL.name("FS_NAME"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.FS_MOBILE</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> FS_MOBILE = createField(DSL.name("FS_MOBILE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.FS_EMAIL</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> FS_EMAIL = createField(DSL.name("FS_EMAIL"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.TL_NAME</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> TL_NAME = createField(DSL.name("TL_NAME"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.TL_MAIL</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> TL_MAIL = createField(DSL.name("TL_MAIL"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.TL_MOBILE</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> TL_MOBILE = createField(DSL.name("TL_MOBILE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.MANAGER_NAME</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> MANAGER_NAME = createField(DSL.name("MANAGER_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.MANAGER_MOBILE</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> MANAGER_MOBILE = createField(DSL.name("MANAGER_MOBILE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.MANAGER_EMAIL</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> MANAGER_EMAIL = createField(DSL.name("MANAGER_EMAIL"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.BPO_NAME</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> BPO_NAME = createField(DSL.name("BPO_NAME"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.BPO_MOBILE</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> BPO_MOBILE = createField(DSL.name("BPO_MOBILE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.BPO_EMAIL</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> BPO_EMAIL = createField(DSL.name("BPO_EMAIL"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.CREATED_ON</code>.
     */
    public final TableField<LandlordFieldforceRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.CREATED_BY</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.landlord_fieldforce.STATUS</code>.
     */
    public final TableField<LandlordFieldforceRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    private LandlordFieldforce(Name alias, Table<LandlordFieldforceRecord> aliased) {
        this(alias, aliased, null);
    }

    private LandlordFieldforce(Name alias, Table<LandlordFieldforceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.landlord_fieldforce</code> table reference
     */
    public LandlordFieldforce(String alias) {
        this(DSL.name(alias), LANDLORD_FIELDFORCE);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.landlord_fieldforce</code> table reference
     */
    public LandlordFieldforce(Name alias) {
        this(alias, LANDLORD_FIELDFORCE);
    }

    /**
     * Create a <code>vendor_portal_pbx.landlord_fieldforce</code> table reference
     */
    public LandlordFieldforce() {
        this(DSL.name("landlord_fieldforce"), null);
    }

    public <O extends Record> LandlordFieldforce(Table<O> child, ForeignKey<O, LandlordFieldforceRecord> key) {
        super(child, key, LANDLORD_FIELDFORCE);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<LandlordFieldforceRecord> getPrimaryKey() {
        return Keys.KEY_LANDLORD_FIELDFORCE_PRIMARY;
    }

    @Override
    public List<UniqueKey<LandlordFieldforceRecord>> getKeys() {
        return Arrays.<UniqueKey<LandlordFieldforceRecord>>asList(Keys.KEY_LANDLORD_FIELDFORCE_PRIMARY);
    }

    @Override
    public LandlordFieldforce as(String alias) {
        return new LandlordFieldforce(DSL.name(alias), this);
    }

    @Override
    public LandlordFieldforce as(Name alias) {
        return new LandlordFieldforce(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LandlordFieldforce rename(String name) {
        return new LandlordFieldforce(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LandlordFieldforce rename(Name name) {
        return new LandlordFieldforce(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
