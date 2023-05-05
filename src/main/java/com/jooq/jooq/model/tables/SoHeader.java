/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.SoHeaderRecord;

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
public class SoHeader extends TableImpl<SoHeaderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.so_header</code>
     */
    public static final SoHeader SO_HEADER = new SoHeader();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SoHeaderRecord> getRecordType() {
        return SoHeaderRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.so_header.COMP_CODE</code>.
     */
    public final TableField<SoHeaderRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.CUSTOMER_CODE</code>.
     */
    public final TableField<SoHeaderRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.CUSTOMER_GROUP</code>.
     */
    public final TableField<SoHeaderRecord, String> CUSTOMER_GROUP = createField(DSL.name("CUSTOMER_GROUP"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.DOC_TYPE</code>.
     */
    public final TableField<SoHeaderRecord, String> DOC_TYPE = createField(DSL.name("DOC_TYPE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.BILLING_TYPE</code>.
     */
    public final TableField<SoHeaderRecord, String> BILLING_TYPE = createField(DSL.name("BILLING_TYPE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.DOC_NO</code>.
     */
    public final TableField<SoHeaderRecord, String> DOC_NO = createField(DSL.name("DOC_NO"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.CUSTOMER_NAME</code>.
     */
    public final TableField<SoHeaderRecord, String> CUSTOMER_NAME = createField(DSL.name("CUSTOMER_NAME"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.SO_CREATED_DATE</code>.
     */
    public final TableField<SoHeaderRecord, LocalDate> SO_CREATED_DATE = createField(DSL.name("SO_CREATED_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.SO_CREATED_BY</code>.
     */
    public final TableField<SoHeaderRecord, String> SO_CREATED_BY = createField(DSL.name("SO_CREATED_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.DOC_DATE</code>.
     */
    public final TableField<SoHeaderRecord, LocalDate> DOC_DATE = createField(DSL.name("DOC_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.DESCRIPTION</code>.
     */
    public final TableField<SoHeaderRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.FLAG</code>.
     */
    public final TableField<SoHeaderRecord, String> FLAG = createField(DSL.name("FLAG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.STATUS</code>.
     */
    public final TableField<SoHeaderRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.CREATED_BY</code>.
     */
    public final TableField<SoHeaderRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.CREATED_ON</code>.
     */
    public final TableField<SoHeaderRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.LAST_CHANGED_BY</code>.
     */
    public final TableField<SoHeaderRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.LAST_CHANGED_ON</code>.
     */
    public final TableField<SoHeaderRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.ORDER_RESN_DESC</code>.
     */
    public final TableField<SoHeaderRecord, String> ORDER_RESN_DESC = createField(DSL.name("ORDER_RESN_DESC"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.APPROVED_FREE_VAL</code>.
     */
    public final TableField<SoHeaderRecord, String> APPROVED_FREE_VAL = createField(DSL.name("APPROVED_FREE_VAL"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.FREE_GOODS_VAL</code>.
     */
    public final TableField<SoHeaderRecord, String> FREE_GOODS_VAL = createField(DSL.name("FREE_GOODS_VAL"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.OPEN_FREE_ORDER_VAL</code>.
     */
    public final TableField<SoHeaderRecord, String> OPEN_FREE_ORDER_VAL = createField(DSL.name("OPEN_FREE_ORDER_VAL"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.INVOICE_NO</code>.
     */
    public final TableField<SoHeaderRecord, String> INVOICE_NO = createField(DSL.name("INVOICE_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.INVOICE_DATE</code>.
     */
    public final TableField<SoHeaderRecord, LocalDate> INVOICE_DATE = createField(DSL.name("INVOICE_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.so_header.TEXTS</code>.
     */
    public final TableField<SoHeaderRecord, String> TEXTS = createField(DSL.name("TEXTS"), SQLDataType.VARCHAR(500), this, "");

    private SoHeader(Name alias, Table<SoHeaderRecord> aliased) {
        this(alias, aliased, null);
    }

    private SoHeader(Name alias, Table<SoHeaderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.so_header</code> table reference
     */
    public SoHeader(String alias) {
        this(DSL.name(alias), SO_HEADER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.so_header</code> table reference
     */
    public SoHeader(Name alias) {
        this(alias, SO_HEADER);
    }

    /**
     * Create a <code>vendor_portal_pbx.so_header</code> table reference
     */
    public SoHeader() {
        this(DSL.name("so_header"), null);
    }

    public <O extends Record> SoHeader(Table<O> child, ForeignKey<O, SoHeaderRecord> key) {
        super(child, key, SO_HEADER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<SoHeaderRecord> getPrimaryKey() {
        return Keys.KEY_SO_HEADER_PRIMARY;
    }

    @Override
    public List<UniqueKey<SoHeaderRecord>> getKeys() {
        return Arrays.<UniqueKey<SoHeaderRecord>>asList(Keys.KEY_SO_HEADER_PRIMARY);
    }

    @Override
    public SoHeader as(String alias) {
        return new SoHeader(DSL.name(alias), this);
    }

    @Override
    public SoHeader as(Name alias) {
        return new SoHeader(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SoHeader rename(String name) {
        return new SoHeader(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SoHeader rename(Name name) {
        return new SoHeader(name, null);
    }
}