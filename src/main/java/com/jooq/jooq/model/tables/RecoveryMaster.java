/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.RecoveryMasterRecord;

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
public class RecoveryMaster extends TableImpl<RecoveryMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.recovery_master</code>
     */
    public static final RecoveryMaster RECOVERY_MASTER = new RecoveryMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecoveryMasterRecord> getRecordType() {
        return RecoveryMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.recovery_master.RECOVERY_CODE</code>.
     */
    public final TableField<RecoveryMasterRecord, String> RECOVERY_CODE = createField(DSL.name("RECOVERY_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.recovery_master.RECOVERY_NAME</code>.
     */
    public final TableField<RecoveryMasterRecord, String> RECOVERY_NAME = createField(DSL.name("RECOVERY_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.recovery_master.STATUS</code>.
     */
    public final TableField<RecoveryMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.recovery_master.CREATED_BY</code>.
     */
    public final TableField<RecoveryMasterRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.recovery_master.CREATED_ON</code>.
     */
    public final TableField<RecoveryMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.recovery_master.LAST_CHANGED_BY</code>.
     */
    public final TableField<RecoveryMasterRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.recovery_master.LAST_CHANGED_ON</code>.
     */
    public final TableField<RecoveryMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private RecoveryMaster(Name alias, Table<RecoveryMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private RecoveryMaster(Name alias, Table<RecoveryMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.recovery_master</code> table reference
     */
    public RecoveryMaster(String alias) {
        this(DSL.name(alias), RECOVERY_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.recovery_master</code> table reference
     */
    public RecoveryMaster(Name alias) {
        this(alias, RECOVERY_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.recovery_master</code> table reference
     */
    public RecoveryMaster() {
        this(DSL.name("recovery_master"), null);
    }

    public <O extends Record> RecoveryMaster(Table<O> child, ForeignKey<O, RecoveryMasterRecord> key) {
        super(child, key, RECOVERY_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<RecoveryMasterRecord> getPrimaryKey() {
        return Keys.KEY_RECOVERY_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<RecoveryMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<RecoveryMasterRecord>>asList(Keys.KEY_RECOVERY_MASTER_PRIMARY);
    }

    @Override
    public RecoveryMaster as(String alias) {
        return new RecoveryMaster(DSL.name(alias), this);
    }

    @Override
    public RecoveryMaster as(Name alias) {
        return new RecoveryMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RecoveryMaster rename(String name) {
        return new RecoveryMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RecoveryMaster rename(Name name) {
        return new RecoveryMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}