/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.SmsConfigurationRecord;

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
public class SmsConfiguration extends TableImpl<SmsConfigurationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.sms_configuration</code>
     */
    public static final SmsConfiguration SMS_CONFIGURATION = new SmsConfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmsConfigurationRecord> getRecordType() {
        return SmsConfigurationRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.CONFIG_ID</code>.
     */
    public final TableField<SmsConfigurationRecord, Integer> CONFIG_ID = createField(DSL.name("CONFIG_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.SMS_URL</code>.
     */
    public final TableField<SmsConfigurationRecord, String> SMS_URL = createField(DSL.name("SMS_URL"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.USER_NAME</code>.
     */
    public final TableField<SmsConfigurationRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.PASSWORD</code>.
     */
    public final TableField<SmsConfigurationRecord, String> PASSWORD = createField(DSL.name("PASSWORD"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.P_ID</code>.
     */
    public final TableField<SmsConfigurationRecord, String> P_ID = createField(DSL.name("P_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.STATUS</code>.
     */
    public final TableField<SmsConfigurationRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.CREATED_BY</code>.
     */
    public final TableField<SmsConfigurationRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.CREATED_ON</code>.
     */
    public final TableField<SmsConfigurationRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.LAST_CHANGED_BY</code>.
     */
    public final TableField<SmsConfigurationRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.sms_configuration.LAST_CHANGED_ON</code>.
     */
    public final TableField<SmsConfigurationRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private SmsConfiguration(Name alias, Table<SmsConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmsConfiguration(Name alias, Table<SmsConfigurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.sms_configuration</code> table reference
     */
    public SmsConfiguration(String alias) {
        this(DSL.name(alias), SMS_CONFIGURATION);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.sms_configuration</code> table reference
     */
    public SmsConfiguration(Name alias) {
        this(alias, SMS_CONFIGURATION);
    }

    /**
     * Create a <code>vendor_portal_pbx.sms_configuration</code> table reference
     */
    public SmsConfiguration() {
        this(DSL.name("sms_configuration"), null);
    }

    public <O extends Record> SmsConfiguration(Table<O> child, ForeignKey<O, SmsConfigurationRecord> key) {
        super(child, key, SMS_CONFIGURATION);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<SmsConfigurationRecord> getPrimaryKey() {
        return Keys.KEY_SMS_CONFIGURATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<SmsConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<SmsConfigurationRecord>>asList(Keys.KEY_SMS_CONFIGURATION_PRIMARY);
    }

    @Override
    public SmsConfiguration as(String alias) {
        return new SmsConfiguration(DSL.name(alias), this);
    }

    @Override
    public SmsConfiguration as(Name alias) {
        return new SmsConfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsConfiguration rename(String name) {
        return new SmsConfiguration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsConfiguration rename(Name name) {
        return new SmsConfiguration(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}