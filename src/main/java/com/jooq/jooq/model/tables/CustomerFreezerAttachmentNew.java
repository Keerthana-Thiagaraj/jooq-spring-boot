/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CustomerFreezerAttachmentNewRecord;

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
public class CustomerFreezerAttachmentNew extends TableImpl<CustomerFreezerAttachmentNewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.customer_freezer_attachment_new</code>
     */
    public static final CustomerFreezerAttachmentNew CUSTOMER_FREEZER_ATTACHMENT_NEW = new CustomerFreezerAttachmentNew();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerFreezerAttachmentNewRecord> getRecordType() {
        return CustomerFreezerAttachmentNewRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.COMP_CODE</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.CUSTOMER_CODE</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.RETAILER_SFA_CODE</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> RETAILER_SFA_CODE = createField(DSL.name("RETAILER_SFA_CODE"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.TAG_NO</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> TAG_NO = createField(DSL.name("TAG_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.SERIAL_NO</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.ATTACHMENT_URL</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> ATTACHMENT_URL = createField(DSL.name("ATTACHMENT_URL"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.ATTACHMENT_NAME</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> ATTACHMENT_NAME = createField(DSL.name("ATTACHMENT_NAME"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.ATTACHMENT_TYPE</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> ATTACHMENT_TYPE = createField(DSL.name("ATTACHMENT_TYPE"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.ATTACHED_DATETIME</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, LocalDateTime> ATTACHED_DATETIME = createField(DSL.name("ATTACHED_DATETIME"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.FILE2_ATTACHMENT_NAME</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> FILE2_ATTACHMENT_NAME = createField(DSL.name("FILE2_ATTACHMENT_NAME"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.FILE2_ATTACHMENT_TYPE</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> FILE2_ATTACHMENT_TYPE = createField(DSL.name("FILE2_ATTACHMENT_TYPE"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.FILE2_ATTACHMENT_URL</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> FILE2_ATTACHMENT_URL = createField(DSL.name("FILE2_ATTACHMENT_URL"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.FILE3_ATTACHMENT_URL</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> FILE3_ATTACHMENT_URL = createField(DSL.name("FILE3_ATTACHMENT_URL"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.FILE3_ATTACHMENT_TYPE</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> FILE3_ATTACHMENT_TYPE = createField(DSL.name("FILE3_ATTACHMENT_TYPE"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_freezer_attachment_new.FILE3_ATTACHMENT_NAME</code>.
     */
    public final TableField<CustomerFreezerAttachmentNewRecord, String> FILE3_ATTACHMENT_NAME = createField(DSL.name("FILE3_ATTACHMENT_NAME"), SQLDataType.VARCHAR(10000), this, "");

    private CustomerFreezerAttachmentNew(Name alias, Table<CustomerFreezerAttachmentNewRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerFreezerAttachmentNew(Name alias, Table<CustomerFreezerAttachmentNewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_freezer_attachment_new</code> table reference
     */
    public CustomerFreezerAttachmentNew(String alias) {
        this(DSL.name(alias), CUSTOMER_FREEZER_ATTACHMENT_NEW);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_freezer_attachment_new</code> table reference
     */
    public CustomerFreezerAttachmentNew(Name alias) {
        this(alias, CUSTOMER_FREEZER_ATTACHMENT_NEW);
    }

    /**
     * Create a <code>vendor_portal_pbx.customer_freezer_attachment_new</code> table reference
     */
    public CustomerFreezerAttachmentNew() {
        this(DSL.name("customer_freezer_attachment_new"), null);
    }

    public <O extends Record> CustomerFreezerAttachmentNew(Table<O> child, ForeignKey<O, CustomerFreezerAttachmentNewRecord> key) {
        super(child, key, CUSTOMER_FREEZER_ATTACHMENT_NEW);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CustomerFreezerAttachmentNewRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_FREEZER_ATTACHMENT_NEW_PRIMARY;
    }

    @Override
    public List<UniqueKey<CustomerFreezerAttachmentNewRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerFreezerAttachmentNewRecord>>asList(Keys.KEY_CUSTOMER_FREEZER_ATTACHMENT_NEW_PRIMARY);
    }

    @Override
    public CustomerFreezerAttachmentNew as(String alias) {
        return new CustomerFreezerAttachmentNew(DSL.name(alias), this);
    }

    @Override
    public CustomerFreezerAttachmentNew as(Name alias) {
        return new CustomerFreezerAttachmentNew(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerFreezerAttachmentNew rename(String name) {
        return new CustomerFreezerAttachmentNew(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerFreezerAttachmentNew rename(Name name) {
        return new CustomerFreezerAttachmentNew(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, String, String, String, String, String, LocalDateTime, String, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}