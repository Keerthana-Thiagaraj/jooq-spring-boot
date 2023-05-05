/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.GrnCustomerDispachHeaderRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class GrnCustomerDispachHeader extends TableImpl<GrnCustomerDispachHeaderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.grn_customer_dispach_header</code>
     */
    public static final GrnCustomerDispachHeader GRN_CUSTOMER_DISPACH_HEADER = new GrnCustomerDispachHeader();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GrnCustomerDispachHeaderRecord> getRecordType() {
        return GrnCustomerDispachHeaderRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.COMP_CODE</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.CUSTOMER_CODE</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.MODEL</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> MODEL = createField(DSL.name("MODEL"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.ASSET_REQ_DATE</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, LocalDate> ASSET_REQ_DATE = createField(DSL.name("ASSET_REQ_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.CUSTOMER_NAME</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> CUSTOMER_NAME = createField(DSL.name("CUSTOMER_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.RSM_NAME</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> RSM_NAME = createField(DSL.name("RSM_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.QTY</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> QTY = createField(DSL.name("QTY"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.STATUS</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.CREATED_BY</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.CREATED_ON</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.UPDATED_BY</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.UPDATED_ON</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("UPDATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.CFA_CODE</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> CFA_CODE = createField(DSL.name("CFA_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.CFA_NAME</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> CFA_NAME = createField(DSL.name("CFA_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.grn_customer_dispach_header.DC_ATTACHMENT_URL</code>.
     */
    public final TableField<GrnCustomerDispachHeaderRecord, String> DC_ATTACHMENT_URL = createField(DSL.name("DC_ATTACHMENT_URL"), SQLDataType.VARCHAR(550), this, "");

    private GrnCustomerDispachHeader(Name alias, Table<GrnCustomerDispachHeaderRecord> aliased) {
        this(alias, aliased, null);
    }

    private GrnCustomerDispachHeader(Name alias, Table<GrnCustomerDispachHeaderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.grn_customer_dispach_header</code> table reference
     */
    public GrnCustomerDispachHeader(String alias) {
        this(DSL.name(alias), GRN_CUSTOMER_DISPACH_HEADER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.grn_customer_dispach_header</code> table reference
     */
    public GrnCustomerDispachHeader(Name alias) {
        this(alias, GRN_CUSTOMER_DISPACH_HEADER);
    }

    /**
     * Create a <code>vendor_portal_pbx.grn_customer_dispach_header</code> table reference
     */
    public GrnCustomerDispachHeader() {
        this(DSL.name("grn_customer_dispach_header"), null);
    }

    public <O extends Record> GrnCustomerDispachHeader(Table<O> child, ForeignKey<O, GrnCustomerDispachHeaderRecord> key) {
        super(child, key, GRN_CUSTOMER_DISPACH_HEADER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<GrnCustomerDispachHeaderRecord> getPrimaryKey() {
        return Keys.KEY_GRN_CUSTOMER_DISPACH_HEADER_PRIMARY;
    }

    @Override
    public List<UniqueKey<GrnCustomerDispachHeaderRecord>> getKeys() {
        return Arrays.<UniqueKey<GrnCustomerDispachHeaderRecord>>asList(Keys.KEY_GRN_CUSTOMER_DISPACH_HEADER_PRIMARY);
    }

    @Override
    public GrnCustomerDispachHeader as(String alias) {
        return new GrnCustomerDispachHeader(DSL.name(alias), this);
    }

    @Override
    public GrnCustomerDispachHeader as(Name alias) {
        return new GrnCustomerDispachHeader(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GrnCustomerDispachHeader rename(String name) {
        return new GrnCustomerDispachHeader(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GrnCustomerDispachHeader rename(Name name) {
        return new GrnCustomerDispachHeader(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, LocalDate, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
