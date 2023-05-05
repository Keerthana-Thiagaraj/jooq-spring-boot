/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.HapPoItemImageUploadRecord;

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
public class HapPoItemImageUpload extends TableImpl<HapPoItemImageUploadRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.hap_po_item_image_upload</code>
     */
    public static final HapPoItemImageUpload HAP_PO_ITEM_IMAGE_UPLOAD = new HapPoItemImageUpload();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HapPoItemImageUploadRecord> getRecordType() {
        return HapPoItemImageUploadRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.hap_po_item_image_upload.PO_NUMBER</code>.
     */
    public final TableField<HapPoItemImageUploadRecord, String> PO_NUMBER = createField(DSL.name("PO_NUMBER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item_image_upload.PO_ITEM_NO</code>.
     */
    public final TableField<HapPoItemImageUploadRecord, String> PO_ITEM_NO = createField(DSL.name("PO_ITEM_NO"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item_image_upload.PO_SERVICE_ITEM_NO</code>.
     */
    public final TableField<HapPoItemImageUploadRecord, String> PO_SERVICE_ITEM_NO = createField(DSL.name("PO_SERVICE_ITEM_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item_image_upload.PO_IMAGE</code>.
     */
    public final TableField<HapPoItemImageUploadRecord, String> PO_IMAGE = createField(DSL.name("PO_IMAGE"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item_image_upload.PO_URL</code>.
     */
    public final TableField<HapPoItemImageUploadRecord, String> PO_URL = createField(DSL.name("PO_URL"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item_image_upload.IMAGE_LATITUDE</code>.
     */
    public final TableField<HapPoItemImageUploadRecord, String> IMAGE_LATITUDE = createField(DSL.name("IMAGE_LATITUDE"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.hap_po_item_image_upload.IMAGE_LONGITUDE</code>.
     */
    public final TableField<HapPoItemImageUploadRecord, String> IMAGE_LONGITUDE = createField(DSL.name("IMAGE_LONGITUDE"), SQLDataType.VARCHAR(255), this, "");

    private HapPoItemImageUpload(Name alias, Table<HapPoItemImageUploadRecord> aliased) {
        this(alias, aliased, null);
    }

    private HapPoItemImageUpload(Name alias, Table<HapPoItemImageUploadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hap_po_item_image_upload</code> table reference
     */
    public HapPoItemImageUpload(String alias) {
        this(DSL.name(alias), HAP_PO_ITEM_IMAGE_UPLOAD);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.hap_po_item_image_upload</code> table reference
     */
    public HapPoItemImageUpload(Name alias) {
        this(alias, HAP_PO_ITEM_IMAGE_UPLOAD);
    }

    /**
     * Create a <code>vendor_portal_pbx.hap_po_item_image_upload</code> table reference
     */
    public HapPoItemImageUpload() {
        this(DSL.name("hap_po_item_image_upload"), null);
    }

    public <O extends Record> HapPoItemImageUpload(Table<O> child, ForeignKey<O, HapPoItemImageUploadRecord> key) {
        super(child, key, HAP_PO_ITEM_IMAGE_UPLOAD);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<HapPoItemImageUploadRecord> getPrimaryKey() {
        return Keys.KEY_HAP_PO_ITEM_IMAGE_UPLOAD_PRIMARY;
    }

    @Override
    public List<UniqueKey<HapPoItemImageUploadRecord>> getKeys() {
        return Arrays.<UniqueKey<HapPoItemImageUploadRecord>>asList(Keys.KEY_HAP_PO_ITEM_IMAGE_UPLOAD_PRIMARY);
    }

    @Override
    public HapPoItemImageUpload as(String alias) {
        return new HapPoItemImageUpload(DSL.name(alias), this);
    }

    @Override
    public HapPoItemImageUpload as(Name alias) {
        return new HapPoItemImageUpload(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HapPoItemImageUpload rename(String name) {
        return new HapPoItemImageUpload(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HapPoItemImageUpload rename(Name name) {
        return new HapPoItemImageUpload(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}