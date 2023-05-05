/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsCanteenPoHeaderRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class CcmsCanteenPoHeader extends TableImpl<CcmsCanteenPoHeaderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_canteen_po_header</code>
     */
    public static final CcmsCanteenPoHeader CCMS_CANTEEN_PO_HEADER = new CcmsCanteenPoHeader();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsCanteenPoHeaderRecord> getRecordType() {
        return CcmsCanteenPoHeaderRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.vendor</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> VENDOR = createField(DSL.name("vendor"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.plant</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> PLANT = createField(DSL.name("plant"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.month</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> MONTH = createField(DSL.name("month"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.year</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> YEAR = createField(DSL.name("year"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.cycle</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> CYCLE = createField(DSL.name("cycle"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.material_no</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> MATERIAL_NO = createField(DSL.name("material_no"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.strg_location</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> STRG_LOCATION = createField(DSL.name("strg_location"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.po_type</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> PO_TYPE = createField(DSL.name("po_type"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.create_date</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> CREATE_DATE = createField(DSL.name("create_date"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.currency</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> CURRENCY = createField(DSL.name("currency"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.po_number</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> PO_NUMBER = createField(DSL.name("po_number"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.status</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.created_on</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.created_by</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.last_changed_by</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> LAST_CHANGED_BY = createField(DSL.name("last_changed_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.last_changed_on</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("last_changed_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_canteen_po_header.vendor_invoice_pdf</code>.
     */
    public final TableField<CcmsCanteenPoHeaderRecord, String> VENDOR_INVOICE_PDF = createField(DSL.name("vendor_invoice_pdf"), SQLDataType.VARCHAR(245), this, "");

    private CcmsCanteenPoHeader(Name alias, Table<CcmsCanteenPoHeaderRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsCanteenPoHeader(Name alias, Table<CcmsCanteenPoHeaderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_canteen_po_header</code> table reference
     */
    public CcmsCanteenPoHeader(String alias) {
        this(DSL.name(alias), CCMS_CANTEEN_PO_HEADER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_canteen_po_header</code> table reference
     */
    public CcmsCanteenPoHeader(Name alias) {
        this(alias, CCMS_CANTEEN_PO_HEADER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_canteen_po_header</code> table reference
     */
    public CcmsCanteenPoHeader() {
        this(DSL.name("ccms_canteen_po_header"), null);
    }

    public <O extends Record> CcmsCanteenPoHeader(Table<O> child, ForeignKey<O, CcmsCanteenPoHeaderRecord> key) {
        super(child, key, CCMS_CANTEEN_PO_HEADER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsCanteenPoHeaderRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_CANTEEN_PO_HEADER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsCanteenPoHeaderRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsCanteenPoHeaderRecord>>asList(Keys.KEY_CCMS_CANTEEN_PO_HEADER_PRIMARY);
    }

    @Override
    public CcmsCanteenPoHeader as(String alias) {
        return new CcmsCanteenPoHeader(DSL.name(alias), this);
    }

    @Override
    public CcmsCanteenPoHeader as(Name alias) {
        return new CcmsCanteenPoHeader(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsCanteenPoHeader rename(String name) {
        return new CcmsCanteenPoHeader(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsCanteenPoHeader rename(Name name) {
        return new CcmsCanteenPoHeader(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, String, LocalDateTime, String, String, LocalDateTime, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}