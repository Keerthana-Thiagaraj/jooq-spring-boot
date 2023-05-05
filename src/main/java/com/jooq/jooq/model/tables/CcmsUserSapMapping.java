/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsUserSapMappingRecord;

import java.time.LocalDateTime;
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
public class CcmsUserSapMapping extends TableImpl<CcmsUserSapMappingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_user_sap_mapping</code>
     */
    public static final CcmsUserSapMapping CCMS_USER_SAP_MAPPING = new CcmsUserSapMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsUserSapMappingRecord> getRecordType() {
        return CcmsUserSapMappingRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_user_sap_mapping.user_id</code>.
     */
    public final TableField<CcmsUserSapMappingRecord, String> USER_ID = createField(DSL.name("user_id"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_user_sap_mapping.sap_id</code>.
     */
    public final TableField<CcmsUserSapMappingRecord, String> SAP_ID = createField(DSL.name("sap_id"), SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_user_sap_mapping.status</code>.
     */
    public final TableField<CcmsUserSapMappingRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_user_sap_mapping.created_on</code>.
     */
    public final TableField<CcmsUserSapMappingRecord, String> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_user_sap_mapping.created_by</code>.
     */
    public final TableField<CcmsUserSapMappingRecord, LocalDateTime> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    private CcmsUserSapMapping(Name alias, Table<CcmsUserSapMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsUserSapMapping(Name alias, Table<CcmsUserSapMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_user_sap_mapping</code> table reference
     */
    public CcmsUserSapMapping(String alias) {
        this(DSL.name(alias), CCMS_USER_SAP_MAPPING);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_user_sap_mapping</code> table reference
     */
    public CcmsUserSapMapping(Name alias) {
        this(alias, CCMS_USER_SAP_MAPPING);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_user_sap_mapping</code> table reference
     */
    public CcmsUserSapMapping() {
        this(DSL.name("ccms_user_sap_mapping"), null);
    }

    public <O extends Record> CcmsUserSapMapping(Table<O> child, ForeignKey<O, CcmsUserSapMappingRecord> key) {
        super(child, key, CCMS_USER_SAP_MAPPING);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsUserSapMappingRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_USER_SAP_MAPPING_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsUserSapMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsUserSapMappingRecord>>asList(Keys.KEY_CCMS_USER_SAP_MAPPING_PRIMARY);
    }

    @Override
    public CcmsUserSapMapping as(String alias) {
        return new CcmsUserSapMapping(DSL.name(alias), this);
    }

    @Override
    public CcmsUserSapMapping as(Name alias) {
        return new CcmsUserSapMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsUserSapMapping rename(String name) {
        return new CcmsUserSapMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsUserSapMapping rename(Name name) {
        return new CcmsUserSapMapping(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
