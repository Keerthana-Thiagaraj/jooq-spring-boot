/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.VendorTurnoverRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class VendorTurnover extends TableImpl<VendorTurnoverRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.vendor_turnover</code>
     */
    public static final VendorTurnover VENDOR_TURNOVER = new VendorTurnover();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VendorTurnoverRecord> getRecordType() {
        return VendorTurnoverRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.VENDOR_CODE</code>.
     */
    public final TableField<VendorTurnoverRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.FINANCIAL_YEAR</code>.
     */
    public final TableField<VendorTurnoverRecord, String> FINANCIAL_YEAR = createField(DSL.name("FINANCIAL_YEAR"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.QUANTITY_VOLUME</code>.
     */
    public final TableField<VendorTurnoverRecord, String> QUANTITY_VOLUME = createField(DSL.name("QUANTITY_VOLUME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.UNIT_OF_MEASUREMENT</code>.
     */
    public final TableField<VendorTurnoverRecord, String> UNIT_OF_MEASUREMENT = createField(DSL.name("UNIT_OF_MEASUREMENT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.TURNOVER</code>.
     */
    public final TableField<VendorTurnoverRecord, String> TURNOVER = createField(DSL.name("TURNOVER"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.POTENTIAL_CATEGORY</code>.
     */
    public final TableField<VendorTurnoverRecord, String> POTENTIAL_CATEGORY = createField(DSL.name("POTENTIAL_CATEGORY"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.BUSINESS_TYPE</code>.
     */
    public final TableField<VendorTurnoverRecord, String> BUSINESS_TYPE = createField(DSL.name("BUSINESS_TYPE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.BUS_SCALE_TYPE</code>.
     */
    public final TableField<VendorTurnoverRecord, String> BUS_SCALE_TYPE = createField(DSL.name("BUS_SCALE_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT</code>.
     */
    public final TableField<VendorTurnoverRecord, byte[]> ATTACHMENT = createField(DSL.name("ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT_TYPE</code>.
     */
    public final TableField<VendorTurnoverRecord, String> ATTACHMENT_TYPE = createField(DSL.name("ATTACHMENT_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.ATTACHMENT_NAME</code>.
     */
    public final TableField<VendorTurnoverRecord, String> ATTACHMENT_NAME = createField(DSL.name("ATTACHMENT_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.FIRM_TYPE</code>.
     */
    public final TableField<VendorTurnoverRecord, String> FIRM_TYPE = createField(DSL.name("FIRM_TYPE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.ISSUE_DATE</code>.
     */
    public final TableField<VendorTurnoverRecord, LocalDate> ISSUE_DATE = createField(DSL.name("ISSUE_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.START_DATE</code>.
     */
    public final TableField<VendorTurnoverRecord, LocalDate> START_DATE = createField(DSL.name("START_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.END_DATE</code>.
     */
    public final TableField<VendorTurnoverRecord, LocalDate> END_DATE = createField(DSL.name("END_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.CREATED_BY</code>.
     */
    public final TableField<VendorTurnoverRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.CREATED_ON</code>.
     */
    public final TableField<VendorTurnoverRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.LAST_CHANGED_BY</code>.
     */
    public final TableField<VendorTurnoverRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.LAST_CHANGED_ON</code>.
     */
    public final TableField<VendorTurnoverRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.MSMC_CERTIFICATE_NO</code>.
     */
    public final TableField<VendorTurnoverRecord, String> MSMC_CERTIFICATE_NO = createField(DSL.name("MSMC_CERTIFICATE_NO"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT</code>.
     */
    public final TableField<VendorTurnoverRecord, byte[]> PROTENTIAL_ATTACHMENT = createField(DSL.name("PROTENTIAL_ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT_NAME</code>.
     */
    public final TableField<VendorTurnoverRecord, String> PROTENTIAL_ATTACHMENT_NAME = createField(DSL.name("PROTENTIAL_ATTACHMENT_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.PROTENTIAL_ATTACHMENT_TYPE</code>.
     */
    public final TableField<VendorTurnoverRecord, String> PROTENTIAL_ATTACHMENT_TYPE = createField(DSL.name("PROTENTIAL_ATTACHMENT_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.TURNOVER_DECLARATION_NAME</code>.
     */
    public final TableField<VendorTurnoverRecord, String> TURNOVER_DECLARATION_NAME = createField(DSL.name("TURNOVER_DECLARATION_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_turnover.TURNOVER_DECLARATION_NO</code>.
     */
    public final TableField<VendorTurnoverRecord, String> TURNOVER_DECLARATION_NO = createField(DSL.name("TURNOVER_DECLARATION_NO"), SQLDataType.VARCHAR(45), this, "");

    private VendorTurnover(Name alias, Table<VendorTurnoverRecord> aliased) {
        this(alias, aliased, null);
    }

    private VendorTurnover(Name alias, Table<VendorTurnoverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_turnover</code> table reference
     */
    public VendorTurnover(String alias) {
        this(DSL.name(alias), VENDOR_TURNOVER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_turnover</code> table reference
     */
    public VendorTurnover(Name alias) {
        this(alias, VENDOR_TURNOVER);
    }

    /**
     * Create a <code>vendor_portal_pbx.vendor_turnover</code> table reference
     */
    public VendorTurnover() {
        this(DSL.name("vendor_turnover"), null);
    }

    public <O extends Record> VendorTurnover(Table<O> child, ForeignKey<O, VendorTurnoverRecord> key) {
        super(child, key, VENDOR_TURNOVER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<VendorTurnoverRecord> getPrimaryKey() {
        return Keys.KEY_VENDOR_TURNOVER_PRIMARY;
    }

    @Override
    public List<UniqueKey<VendorTurnoverRecord>> getKeys() {
        return Arrays.<UniqueKey<VendorTurnoverRecord>>asList(Keys.KEY_VENDOR_TURNOVER_PRIMARY);
    }

    @Override
    public VendorTurnover as(String alias) {
        return new VendorTurnover(DSL.name(alias), this);
    }

    @Override
    public VendorTurnover as(Name alias) {
        return new VendorTurnover(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorTurnover rename(String name) {
        return new VendorTurnover(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorTurnover rename(Name name) {
        return new VendorTurnover(name, null);
    }
}