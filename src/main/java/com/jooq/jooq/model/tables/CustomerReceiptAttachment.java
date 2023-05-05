/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CustomerReceiptAttachmentRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class CustomerReceiptAttachment extends TableImpl<CustomerReceiptAttachmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.customer_receipt_attachment</code>
     */
    public static final CustomerReceiptAttachment CUSTOMER_RECEIPT_ATTACHMENT = new CustomerReceiptAttachment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerReceiptAttachmentRecord> getRecordType() {
        return CustomerReceiptAttachmentRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.COMP_CODE</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.CUSTOMER_CODE</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(11).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.SERIAL_NO</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.ATTACHED_DATETIME</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, LocalDateTime> ATTACHED_DATETIME = createField(DSL.name("ATTACHED_DATETIME"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.ATTACHMENT_NAME</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, String> ATTACHMENT_NAME = createField(DSL.name("ATTACHMENT_NAME"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.ATTACHMENT_TYPE</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, String> ATTACHMENT_TYPE = createField(DSL.name("ATTACHMENT_TYPE"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.CHANGED_BY</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, String> CHANGED_BY = createField(DSL.name("CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.CHANGED_ON</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, LocalDateTime> CHANGED_ON = createField(DSL.name("CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.CREATED_BY</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.CREATED_ON</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_receipt_attachment.ATTACHMENT</code>.
     */
    public final TableField<CustomerReceiptAttachmentRecord, byte[]> ATTACHMENT = createField(DSL.name("ATTACHMENT"), SQLDataType.BLOB, this, "");

    private CustomerReceiptAttachment(Name alias, Table<CustomerReceiptAttachmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerReceiptAttachment(Name alias, Table<CustomerReceiptAttachmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_receipt_attachment</code> table reference
     */
    public CustomerReceiptAttachment(String alias) {
        this(DSL.name(alias), CUSTOMER_RECEIPT_ATTACHMENT);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_receipt_attachment</code> table reference
     */
    public CustomerReceiptAttachment(Name alias) {
        this(alias, CUSTOMER_RECEIPT_ATTACHMENT);
    }

    /**
     * Create a <code>vendor_portal_pbx.customer_receipt_attachment</code> table reference
     */
    public CustomerReceiptAttachment() {
        this(DSL.name("customer_receipt_attachment"), null);
    }

    public <O extends Record> CustomerReceiptAttachment(Table<O> child, ForeignKey<O, CustomerReceiptAttachmentRecord> key) {
        super(child, key, CUSTOMER_RECEIPT_ATTACHMENT);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CustomerReceiptAttachmentRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_RECEIPT_ATTACHMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<CustomerReceiptAttachmentRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerReceiptAttachmentRecord>>asList(Keys.KEY_CUSTOMER_RECEIPT_ATTACHMENT_PRIMARY);
    }

    @Override
    public CustomerReceiptAttachment as(String alias) {
        return new CustomerReceiptAttachment(DSL.name(alias), this);
    }

    @Override
    public CustomerReceiptAttachment as(Name alias) {
        return new CustomerReceiptAttachment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerReceiptAttachment rename(String name) {
        return new CustomerReceiptAttachment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerReceiptAttachment rename(Name name) {
        return new CustomerReceiptAttachment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, LocalDateTime, String, String, String, LocalDateTime, String, LocalDateTime, byte[]> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}