/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CustomerBillAttachmentRecord;

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
public class CustomerBillAttachment extends TableImpl<CustomerBillAttachmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.customer_bill_attachment</code>
     */
    public static final CustomerBillAttachment CUSTOMER_BILL_ATTACHMENT = new CustomerBillAttachment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerBillAttachmentRecord> getRecordType() {
        return CustomerBillAttachmentRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.COMP_CODE</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.CUSTOMER_CODE</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.CUSTOMER_NAME</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> CUSTOMER_NAME = createField(DSL.name("CUSTOMER_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.SERIAL_NO</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.RSM_ID</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> RSM_ID = createField(DSL.name("RSM_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.RSM_NAME</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> RSM_NAME = createField(DSL.name("RSM_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.BILL_MONTH</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> BILL_MONTH = createField(DSL.name("BILL_MONTH"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.BILL_YEAR</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> BILL_YEAR = createField(DSL.name("BILL_YEAR"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.BILL_TYPE</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> BILL_TYPE = createField(DSL.name("BILL_TYPE"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT_NAME</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> ATTACHMENT_NAME = createField(DSL.name("ATTACHMENT_NAME"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT_TYPE</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> ATTACHMENT_TYPE = createField(DSL.name("ATTACHMENT_TYPE"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, byte[]> ATTACHMENT = createField(DSL.name("ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.ATTACHED_DATETIME</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, LocalDateTime> ATTACHED_DATETIME = createField(DSL.name("ATTACHED_DATETIME"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.FLAG</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> FLAG = createField(DSL.name("FLAG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.DEVICE_TYPE</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> DEVICE_TYPE = createField(DSL.name("DEVICE_TYPE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.OTHER_BILL_TYPE</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> OTHER_BILL_TYPE = createField(DSL.name("OTHER_BILL_TYPE"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.HOLD_REMARK</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> HOLD_REMARK = createField(DSL.name("HOLD_REMARK"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.REJECT_REMARK</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> REJECT_REMARK = createField(DSL.name("REJECT_REMARK"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.STATUS</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.CREATED_ON</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.CREATED_BY</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.CHANGED_ON</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, LocalDateTime> CHANGED_ON = createField(DSL.name("CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.CHANGED_BY</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> CHANGED_BY = createField(DSL.name("CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.COMPLETED_BY</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, String> COMPLETED_BY = createField(DSL.name("COMPLETED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_bill_attachment.COMPLETED_ON</code>.
     */
    public final TableField<CustomerBillAttachmentRecord, LocalDateTime> COMPLETED_ON = createField(DSL.name("COMPLETED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private CustomerBillAttachment(Name alias, Table<CustomerBillAttachmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerBillAttachment(Name alias, Table<CustomerBillAttachmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_bill_attachment</code> table reference
     */
    public CustomerBillAttachment(String alias) {
        this(DSL.name(alias), CUSTOMER_BILL_ATTACHMENT);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_bill_attachment</code> table reference
     */
    public CustomerBillAttachment(Name alias) {
        this(alias, CUSTOMER_BILL_ATTACHMENT);
    }

    /**
     * Create a <code>vendor_portal_pbx.customer_bill_attachment</code> table reference
     */
    public CustomerBillAttachment() {
        this(DSL.name("customer_bill_attachment"), null);
    }

    public <O extends Record> CustomerBillAttachment(Table<O> child, ForeignKey<O, CustomerBillAttachmentRecord> key) {
        super(child, key, CUSTOMER_BILL_ATTACHMENT);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CUSTOMER_BILL_ATTACHMENT_SECONDARY);
    }

    @Override
    public UniqueKey<CustomerBillAttachmentRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_BILL_ATTACHMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<CustomerBillAttachmentRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerBillAttachmentRecord>>asList(Keys.KEY_CUSTOMER_BILL_ATTACHMENT_PRIMARY);
    }

    @Override
    public CustomerBillAttachment as(String alias) {
        return new CustomerBillAttachment(DSL.name(alias), this);
    }

    @Override
    public CustomerBillAttachment as(Name alias) {
        return new CustomerBillAttachment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerBillAttachment rename(String name) {
        return new CustomerBillAttachment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerBillAttachment rename(Name name) {
        return new CustomerBillAttachment(name, null);
    }
}
