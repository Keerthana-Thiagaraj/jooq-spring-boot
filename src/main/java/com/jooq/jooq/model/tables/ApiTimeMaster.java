/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.ApiTimeMasterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class ApiTimeMaster extends TableImpl<ApiTimeMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.api_time_master</code>
     */
    public static final ApiTimeMaster API_TIME_MASTER = new ApiTimeMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApiTimeMasterRecord> getRecordType() {
        return ApiTimeMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.api_time_master.COMP_CODE</code>.
     */
    public final TableField<ApiTimeMasterRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.api_time_master.ID</code>.
     */
    public final TableField<ApiTimeMasterRecord, String> ID = createField(DSL.name("ID"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.api_time_master.ACC_GRP_CODE</code>.
     */
    public final TableField<ApiTimeMasterRecord, String> ACC_GRP_CODE = createField(DSL.name("ACC_GRP_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.api_time_master.MENU_NAME</code>.
     */
    public final TableField<ApiTimeMasterRecord, String> MENU_NAME = createField(DSL.name("MENU_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.api_time_master.DURATION</code>.
     */
    public final TableField<ApiTimeMasterRecord, String> DURATION = createField(DSL.name("DURATION"), SQLDataType.VARCHAR(3), this, "");

    private ApiTimeMaster(Name alias, Table<ApiTimeMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApiTimeMaster(Name alias, Table<ApiTimeMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.api_time_master</code> table reference
     */
    public ApiTimeMaster(String alias) {
        this(DSL.name(alias), API_TIME_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.api_time_master</code> table reference
     */
    public ApiTimeMaster(Name alias) {
        this(alias, API_TIME_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.api_time_master</code> table reference
     */
    public ApiTimeMaster() {
        this(DSL.name("api_time_master"), null);
    }

    public <O extends Record> ApiTimeMaster(Table<O> child, ForeignKey<O, ApiTimeMasterRecord> key) {
        super(child, key, API_TIME_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<ApiTimeMasterRecord> getPrimaryKey() {
        return Keys.KEY_API_TIME_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<ApiTimeMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<ApiTimeMasterRecord>>asList(Keys.KEY_API_TIME_MASTER_PRIMARY);
    }

    @Override
    public ApiTimeMaster as(String alias) {
        return new ApiTimeMaster(DSL.name(alias), this);
    }

    @Override
    public ApiTimeMaster as(Name alias) {
        return new ApiTimeMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApiTimeMaster rename(String name) {
        return new ApiTimeMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApiTimeMaster rename(Name name) {
        return new ApiTimeMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}