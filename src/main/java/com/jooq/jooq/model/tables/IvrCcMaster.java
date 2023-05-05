/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.IvrCcMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class IvrCcMaster extends TableImpl<IvrCcMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ivr_cc_master</code>
     */
    public static final IvrCcMaster IVR_CC_MASTER = new IvrCcMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IvrCcMasterRecord> getRecordType() {
        return IvrCcMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.ENQUIRY_TYPE_ID</code>.
     */
    public final TableField<IvrCcMasterRecord, Integer> ENQUIRY_TYPE_ID = createField(DSL.name("ENQUIRY_TYPE_ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.OPTION_ID</code>.
     */
    public final TableField<IvrCcMasterRecord, Integer> OPTION_ID = createField(DSL.name("OPTION_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.ENQUIRY_NAME</code>.
     */
    public final TableField<IvrCcMasterRecord, String> ENQUIRY_NAME = createField(DSL.name("ENQUIRY_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.ENQUIRY_VAL</code>.
     */
    public final TableField<IvrCcMasterRecord, String> ENQUIRY_VAL = createField(DSL.name("ENQUIRY_VAL"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.OPTION_NAME</code>.
     */
    public final TableField<IvrCcMasterRecord, String> OPTION_NAME = createField(DSL.name("OPTION_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.OPTION_VAL</code>.
     */
    public final TableField<IvrCcMasterRecord, String> OPTION_VAL = createField(DSL.name("OPTION_VAL"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.STATUS</code>.
     */
    public final TableField<IvrCcMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.CREATED_BY</code>.
     */
    public final TableField<IvrCcMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.CREATED_ON</code>.
     */
    public final TableField<IvrCcMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.UPDATED_BY</code>.
     */
    public final TableField<IvrCcMasterRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ivr_cc_master.UPDATED_ON</code>.
     */
    public final TableField<IvrCcMasterRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("UPDATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private IvrCcMaster(Name alias, Table<IvrCcMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private IvrCcMaster(Name alias, Table<IvrCcMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ivr_cc_master</code> table reference
     */
    public IvrCcMaster(String alias) {
        this(DSL.name(alias), IVR_CC_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ivr_cc_master</code> table reference
     */
    public IvrCcMaster(Name alias) {
        this(alias, IVR_CC_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ivr_cc_master</code> table reference
     */
    public IvrCcMaster() {
        this(DSL.name("ivr_cc_master"), null);
    }

    public <O extends Record> IvrCcMaster(Table<O> child, ForeignKey<O, IvrCcMasterRecord> key) {
        super(child, key, IVR_CC_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public Identity<IvrCcMasterRecord, Integer> getIdentity() {
        return (Identity<IvrCcMasterRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<IvrCcMasterRecord> getPrimaryKey() {
        return Keys.KEY_IVR_CC_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<IvrCcMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<IvrCcMasterRecord>>asList(Keys.KEY_IVR_CC_MASTER_PRIMARY);
    }

    @Override
    public IvrCcMaster as(String alias) {
        return new IvrCcMaster(DSL.name(alias), this);
    }

    @Override
    public IvrCcMaster as(Name alias) {
        return new IvrCcMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IvrCcMaster rename(String name) {
        return new IvrCcMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IvrCcMaster rename(Name name) {
        return new IvrCcMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}