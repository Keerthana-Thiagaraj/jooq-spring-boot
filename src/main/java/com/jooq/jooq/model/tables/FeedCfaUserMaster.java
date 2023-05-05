/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.FeedCfaUserMasterRecord;

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
public class FeedCfaUserMaster extends TableImpl<FeedCfaUserMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.feed_cfa_user_master</code>
     */
    public static final FeedCfaUserMaster FEED_CFA_USER_MASTER = new FeedCfaUserMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeedCfaUserMasterRecord> getRecordType() {
        return FeedCfaUserMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.feed_cfa_user_master.cfa_plant</code>.
     */
    public final TableField<FeedCfaUserMasterRecord, Integer> CFA_PLANT = createField(DSL.name("cfa_plant"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.feed_cfa_user_master.cfa_user</code>.
     */
    public final TableField<FeedCfaUserMasterRecord, String> CFA_USER = createField(DSL.name("cfa_user"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.feed_cfa_user_master.status</code>.
     */
    public final TableField<FeedCfaUserMasterRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45).nullable(false).defaultValue(DSL.inline("A", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>vendor_portal_pbx.feed_cfa_user_master.created_by</code>.
     */
    public final TableField<FeedCfaUserMasterRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.feed_cfa_user_master.created_on</code>.
     */
    public final TableField<FeedCfaUserMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.feed_cfa_user_master.changed_by</code>.
     */
    public final TableField<FeedCfaUserMasterRecord, String> CHANGED_BY = createField(DSL.name("changed_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.feed_cfa_user_master.changed_on</code>.
     */
    public final TableField<FeedCfaUserMasterRecord, LocalDateTime> CHANGED_ON = createField(DSL.name("changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    private FeedCfaUserMaster(Name alias, Table<FeedCfaUserMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private FeedCfaUserMaster(Name alias, Table<FeedCfaUserMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.feed_cfa_user_master</code> table reference
     */
    public FeedCfaUserMaster(String alias) {
        this(DSL.name(alias), FEED_CFA_USER_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.feed_cfa_user_master</code> table reference
     */
    public FeedCfaUserMaster(Name alias) {
        this(alias, FEED_CFA_USER_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.feed_cfa_user_master</code> table reference
     */
    public FeedCfaUserMaster() {
        this(DSL.name("feed_cfa_user_master"), null);
    }

    public <O extends Record> FeedCfaUserMaster(Table<O> child, ForeignKey<O, FeedCfaUserMasterRecord> key) {
        super(child, key, FEED_CFA_USER_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<FeedCfaUserMasterRecord> getPrimaryKey() {
        return Keys.KEY_FEED_CFA_USER_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<FeedCfaUserMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<FeedCfaUserMasterRecord>>asList(Keys.KEY_FEED_CFA_USER_MASTER_PRIMARY);
    }

    @Override
    public FeedCfaUserMaster as(String alias) {
        return new FeedCfaUserMaster(DSL.name(alias), this);
    }

    @Override
    public FeedCfaUserMaster as(Name alias) {
        return new FeedCfaUserMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FeedCfaUserMaster rename(String name) {
        return new FeedCfaUserMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FeedCfaUserMaster rename(Name name) {
        return new FeedCfaUserMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
