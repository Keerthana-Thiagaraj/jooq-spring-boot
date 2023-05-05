/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.HapPoHeaderRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class HapPoHeader extends TableImpl<HapPoHeaderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.hap_po_header</code>
     */
    public static final HapPoHeader HAP_PO_HEADER = new HapPoHeader();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HapPoHeaderRecord> getRecordType() {
        return HapPoHeaderRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.COMP_CODE</code>.
     */
    public final TableField<HapPoHeaderRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PO_NUMBER</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PO_NUMBER = createField(DSL.name("PO_NUMBER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.VENDOR_CODE</code>.
     */
    public final TableField<HapPoHeaderRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.DOC_CAT</code>.
     */
    public final TableField<HapPoHeaderRecord, String> DOC_CAT = createField(DSL.name("DOC_CAT"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.DOC_TYPE</code>.
     */
    public final TableField<HapPoHeaderRecord, String> DOC_TYPE = createField(DSL.name("DOC_TYPE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PO_CREATED_ON</code>.
     */
    public final TableField<HapPoHeaderRecord, LocalDate> PO_CREATED_ON = createField(DSL.name("PO_CREATED_ON"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PO_CREATED_BY</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PO_CREATED_BY = createField(DSL.name("PO_CREATED_BY"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PUR_GRP</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PUR_GRP = createField(DSL.name("PUR_GRP"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PUR_ORG</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PUR_ORG = createField(DSL.name("PUR_ORG"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.CURRENCY</code>.
     */
    public final TableField<HapPoHeaderRecord, String> CURRENCY = createField(DSL.name("CURRENCY"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.DOC_DATE</code>.
     */
    public final TableField<HapPoHeaderRecord, LocalDate> DOC_DATE = createField(DSL.name("DOC_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.DELET_IND</code>.
     */
    public final TableField<HapPoHeaderRecord, String> DELET_IND = createField(DSL.name("DELET_IND"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.STATUS</code>.
     */
    public final TableField<HapPoHeaderRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.CREATED_BY</code>.
     */
    public final TableField<HapPoHeaderRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.CREATED_ON</code>.
     */
    public final TableField<HapPoHeaderRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.LAST_CHANGED_BY</code>.
     */
    public final TableField<HapPoHeaderRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.LAST_CHANGED_ON</code>.
     */
    public final TableField<HapPoHeaderRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PAYMENT_TERM</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PAYMENT_TERM = createField(DSL.name("PAYMENT_TERM"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.RELEASE_VERSION</code>.
     */
    public final TableField<HapPoHeaderRecord, String> RELEASE_VERSION = createField(DSL.name("RELEASE_VERSION"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.RELEASE_DATE</code>.
     */
    public final TableField<HapPoHeaderRecord, LocalDate> RELEASE_DATE = createField(DSL.name("RELEASE_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.QUOTATION_REF</code>.
     */
    public final TableField<HapPoHeaderRecord, String> QUOTATION_REF = createField(DSL.name("QUOTATION_REF"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.DELIVERY</code>.
     */
    public final TableField<HapPoHeaderRecord, String> DELIVERY = createField(DSL.name("DELIVERY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.DESPATCH_MODE</code>.
     */
    public final TableField<HapPoHeaderRecord, String> DESPATCH_MODE = createField(DSL.name("DESPATCH_MODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PLANT_GSTIN</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PLANT_GSTIN = createField(DSL.name("PLANT_GSTIN"), SQLDataType.VARCHAR(18), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PLANTADDR</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PLANTADDR = createField(DSL.name("PLANTADDR"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PLANTCST</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PLANTCST = createField(DSL.name("PLANTCST"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PLANTPAN</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PLANTPAN = createField(DSL.name("PLANTPAN"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.PLANTTIN</code>.
     */
    public final TableField<HapPoHeaderRecord, String> PLANTTIN = createField(DSL.name("PLANTTIN"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.FLAG</code>.
     */
    public final TableField<HapPoHeaderRecord, String> FLAG = createField(DSL.name("FLAG"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.REL_GROUP</code>.
     */
    public final TableField<HapPoHeaderRecord, String> REL_GROUP = createField(DSL.name("REL_GROUP"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.REL_START</code>.
     */
    public final TableField<HapPoHeaderRecord, String> REL_START = createField(DSL.name("REL_START"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.REL_IND</code>.
     */
    public final TableField<HapPoHeaderRecord, String> REL_IND = createField(DSL.name("REL_IND"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_header.REL_STATUS</code>.
     */
    public final TableField<HapPoHeaderRecord, String> REL_STATUS = createField(DSL.name("REL_STATUS"), SQLDataType.VARCHAR(8), this, "");

    private HapPoHeader(Name alias, Table<HapPoHeaderRecord> aliased) {
        this(alias, aliased, null);
    }

    private HapPoHeader(Name alias, Table<HapPoHeaderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hap_po_header</code> table reference
     */
    public HapPoHeader(String alias) {
        this(DSL.name(alias), HAP_PO_HEADER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hap_po_header</code> table reference
     */
    public HapPoHeader(Name alias) {
        this(alias, HAP_PO_HEADER);
    }

    /**
     * Create a <code>vendor_portal_pbx.hap_po_header</code> table reference
     */
    public HapPoHeader() {
        this(DSL.name("hap_po_header"), null);
    }

    public <O extends Record> HapPoHeader(Table<O> child, ForeignKey<O, HapPoHeaderRecord> key) {
        super(child, key, HAP_PO_HEADER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HAP_PO_HEADER_PO_DATE, Indexes.HAP_PO_HEADER_SECONDARY);
    }

    @Override
    public UniqueKey<HapPoHeaderRecord> getPrimaryKey() {
        return Keys.KEY_HAP_PO_HEADER_PRIMARY;
    }

    @Override
    public List<UniqueKey<HapPoHeaderRecord>> getKeys() {
        return Arrays.<UniqueKey<HapPoHeaderRecord>>asList(Keys.KEY_HAP_PO_HEADER_PRIMARY);
    }

    @Override
    public HapPoHeader as(String alias) {
        return new HapPoHeader(DSL.name(alias), this);
    }

    @Override
    public HapPoHeader as(Name alias) {
        return new HapPoHeader(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HapPoHeader rename(String name) {
        return new HapPoHeader(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HapPoHeader rename(Name name) {
        return new HapPoHeader(name, null);
    }
}
