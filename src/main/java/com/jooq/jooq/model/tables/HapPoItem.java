/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.HapPoItemRecord;

import java.math.BigDecimal;
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
public class HapPoItem extends TableImpl<HapPoItemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.hap_po_item</code>
     */
    public static final HapPoItem HAP_PO_ITEM = new HapPoItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HapPoItemRecord> getRecordType() {
        return HapPoItemRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.COMP_CODE</code>.
     */
    public final TableField<HapPoItemRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.PO_NUMBER</code>.
     */
    public final TableField<HapPoItemRecord, String> PO_NUMBER = createField(DSL.name("PO_NUMBER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.PO_ITEM_NO</code>.
     */
    public final TableField<HapPoItemRecord, String> PO_ITEM_NO = createField(DSL.name("PO_ITEM_NO"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.DOC_CAT</code>.
     */
    public final TableField<HapPoItemRecord, String> DOC_CAT = createField(DSL.name("DOC_CAT"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.ITEM_CAT</code>.
     */
    public final TableField<HapPoItemRecord, String> ITEM_CAT = createField(DSL.name("ITEM_CAT"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.ACC_ASSIGN_CAT</code>.
     */
    public final TableField<HapPoItemRecord, String> ACC_ASSIGN_CAT = createField(DSL.name("ACC_ASSIGN_CAT"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.SHORT_TEXT</code>.
     */
    public final TableField<HapPoItemRecord, String> SHORT_TEXT = createField(DSL.name("SHORT_TEXT"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.LONG_TEXT</code>.
     */
    public final TableField<HapPoItemRecord, String> LONG_TEXT = createField(DSL.name("LONG_TEXT"), SQLDataType.VARCHAR(5000), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.MATERIAL_CODE</code>.
     */
    public final TableField<HapPoItemRecord, String> MATERIAL_CODE = createField(DSL.name("MATERIAL_CODE"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.NET_VALUE</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> NET_VALUE = createField(DSL.name("NET_VALUE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.PLANT</code>.
     */
    public final TableField<HapPoItemRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.QUANTITY</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.CONFIRM_QUANTITY</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> CONFIRM_QUANTITY = createField(DSL.name("CONFIRM_QUANTITY"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.UOM</code>.
     */
    public final TableField<HapPoItemRecord, String> UOM = createField(DSL.name("UOM"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.BASE_VALUE</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> BASE_VALUE = createField(DSL.name("BASE_VALUE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.FRIGHT_AMT</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> FRIGHT_AMT = createField(DSL.name("FRIGHT_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.TAX_AMT</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> TAX_AMT = createField(DSL.name("TAX_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.OTHER_AMT</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> OTHER_AMT = createField(DSL.name("OTHER_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.TOT_PO_VALUE</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> TOT_PO_VALUE = createField(DSL.name("TOT_PO_VALUE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.CURR</code>.
     */
    public final TableField<HapPoItemRecord, String> CURR = createField(DSL.name("CURR"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.LAST_BOUGHT_PRICE</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> LAST_BOUGHT_PRICE = createField(DSL.name("LAST_BOUGHT_PRICE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.PO_DEL_DATE</code>.
     */
    public final TableField<HapPoItemRecord, LocalDate> PO_DEL_DATE = createField(DSL.name("PO_DEL_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.PCKG_NO</code>.
     */
    public final TableField<HapPoItemRecord, String> PCKG_NO = createField(DSL.name("PCKG_NO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.DELETE_IND</code>.
     */
    public final TableField<HapPoItemRecord, String> DELETE_IND = createField(DSL.name("DELETE_IND"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.STATUS</code>.
     */
    public final TableField<HapPoItemRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.CREATED_BY</code>.
     */
    public final TableField<HapPoItemRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.CREATED_ON</code>.
     */
    public final TableField<HapPoItemRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.LAST_CHANGED_BY</code>.
     */
    public final TableField<HapPoItemRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.LAST_CHANGED_ON</code>.
     */
    public final TableField<HapPoItemRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.RATE</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> RATE = createField(DSL.name("RATE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.SGST</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> SGST = createField(DSL.name("SGST"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.CGST</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> CGST = createField(DSL.name("CGST"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.IGST</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> IGST = createField(DSL.name("IGST"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.CESS</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> CESS = createField(DSL.name("CESS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.DELI_QUANTITY</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> DELI_QUANTITY = createField(DSL.name("DELI_QUANTITY"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.DELI_LOCATION</code>.
     */
    public final TableField<HapPoItemRecord, String> DELI_LOCATION = createField(DSL.name("DELI_LOCATION"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.DISCOUNT_AMOUNT</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> DISCOUNT_AMOUNT = createField(DSL.name("DISCOUNT_AMOUNT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.PACKING_AMOUNT</code>.
     */
    public final TableField<HapPoItemRecord, BigDecimal> PACKING_AMOUNT = createField(DSL.name("PACKING_AMOUNT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.HSN_CODE</code>.
     */
    public final TableField<HapPoItemRecord, String> HSN_CODE = createField(DSL.name("HSN_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.RATE_DESC</code>.
     */
    public final TableField<HapPoItemRecord, String> RATE_DESC = createField(DSL.name("RATE_DESC"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.PLANT_DESCRIPTION</code>.
     */
    public final TableField<HapPoItemRecord, String> PLANT_DESCRIPTION = createField(DSL.name("PLANT_DESCRIPTION"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.UNIT_PRICE</code>.
     */
    public final TableField<HapPoItemRecord, String> UNIT_PRICE = createField(DSL.name("UNIT_PRICE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item.TAX_PERCENTAGE</code>.
     */
    public final TableField<HapPoItemRecord, String> TAX_PERCENTAGE = createField(DSL.name("TAX_PERCENTAGE"), SQLDataType.VARCHAR(45), this, "");

    private HapPoItem(Name alias, Table<HapPoItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private HapPoItem(Name alias, Table<HapPoItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hap_po_item</code> table reference
     */
    public HapPoItem(String alias) {
        this(DSL.name(alias), HAP_PO_ITEM);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hap_po_item</code> table reference
     */
    public HapPoItem(Name alias) {
        this(alias, HAP_PO_ITEM);
    }

    /**
     * Create a <code>vendor_portal_pbx.hap_po_item</code> table reference
     */
    public HapPoItem() {
        this(DSL.name("hap_po_item"), null);
    }

    public <O extends Record> HapPoItem(Table<O> child, ForeignKey<O, HapPoItemRecord> key) {
        super(child, key, HAP_PO_ITEM);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.HAP_PO_ITEM_FK_HAP_PO_HEADER_PO_ITEM_IDX);
    }

    @Override
    public UniqueKey<HapPoItemRecord> getPrimaryKey() {
        return Keys.KEY_HAP_PO_ITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<HapPoItemRecord>> getKeys() {
        return Arrays.<UniqueKey<HapPoItemRecord>>asList(Keys.KEY_HAP_PO_ITEM_PRIMARY);
    }

    @Override
    public List<ForeignKey<HapPoItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<HapPoItemRecord, ?>>asList(Keys.FK_HAP_PO_HEADER_PO_ITEM);
    }

    private transient HapPoHeader _hapPoHeader;

    public HapPoHeader hapPoHeader() {
        if (_hapPoHeader == null)
            _hapPoHeader = new HapPoHeader(this, Keys.FK_HAP_PO_HEADER_PO_ITEM);

        return _hapPoHeader;
    }

    @Override
    public HapPoItem as(String alias) {
        return new HapPoItem(DSL.name(alias), this);
    }

    @Override
    public HapPoItem as(Name alias) {
        return new HapPoItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HapPoItem rename(String name) {
        return new HapPoItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HapPoItem rename(Name name) {
        return new HapPoItem(name, null);
    }
}