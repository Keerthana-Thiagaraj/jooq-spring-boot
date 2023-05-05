/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CustomerEbClaimRecord;

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
public class CustomerEbClaim extends TableImpl<CustomerEbClaimRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.customer_eb_claim</code>
     */
    public static final CustomerEbClaim CUSTOMER_EB_CLAIM = new CustomerEbClaim();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerEbClaimRecord> getRecordType() {
        return CustomerEbClaimRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.COMP_CODE</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.CUSTOMER_CODE</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.VENDOR_CODE</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_YEAR</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> EB_YEAR = createField(DSL.name("EB_YEAR"), SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_MONTH</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> EB_MONTH = createField(DSL.name("EB_MONTH"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.CUSTOMER_NAME</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> CUSTOMER_NAME = createField(DSL.name("CUSTOMER_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.RSM_ID</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> RSM_ID = createField(DSL.name("RSM_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.RSM_NAME</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> RSM_NAME = createField(DSL.name("RSM_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_BILL_RECEIPT_NAME</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> EB_BILL_RECEIPT_NAME = createField(DSL.name("EB_BILL_RECEIPT_NAME"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_RECEIPT_NO</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> EB_RECEIPT_NO = createField(DSL.name("EB_RECEIPT_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.RR_NO</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> RR_NO = createField(DSL.name("RR_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.ACC_ID</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> ACC_ID = createField(DSL.name("ACC_ID"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.BILL_PERIOD_FROM</code>.
     */
    public final TableField<CustomerEbClaimRecord, LocalDate> BILL_PERIOD_FROM = createField(DSL.name("BILL_PERIOD_FROM"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.BILL_PERIOD_TO</code>.
     */
    public final TableField<CustomerEbClaimRecord, LocalDate> BILL_PERIOD_TO = createField(DSL.name("BILL_PERIOD_TO"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.OPENING_UNIT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> OPENING_UNIT = createField(DSL.name("OPENING_UNIT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.CLOSING_UNIT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> CLOSING_UNIT = createField(DSL.name("CLOSING_UNIT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.CONSUMED_UNIT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> CONSUMED_UNIT = createField(DSL.name("CONSUMED_UNIT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_BILL_AMOUNT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> EB_BILL_AMOUNT = createField(DSL.name("EB_BILL_AMOUNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.PENALTY_FOR_LATE_DEDUCTION</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> PENALTY_FOR_LATE_DEDUCTION = createField(DSL.name("PENALTY_FOR_LATE_DEDUCTION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.ADDITIONAL_CHARGES</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> ADDITIONAL_CHARGES = createField(DSL.name("ADDITIONAL_CHARGES"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.ADDITIONAL_SERVICE_CHARGES</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> ADDITIONAL_SERVICE_CHARGES = createField(DSL.name("ADDITIONAL_SERVICE_CHARGES"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.DEDUCTION_AMT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> DEDUCTION_AMT = createField(DSL.name("DEDUCTION_AMT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.OTHER_DEDUCTION_AMT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> OTHER_DEDUCTION_AMT = createField(DSL.name("OTHER_DEDUCTION_AMT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.NET_PAYABLE_AMOUNT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> NET_PAYABLE_AMOUNT = createField(DSL.name("NET_PAYABLE_AMOUNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.CLAIM_AMOUNT</code>.
     */
    public final TableField<CustomerEbClaimRecord, Integer> CLAIM_AMOUNT = createField(DSL.name("CLAIM_AMOUNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_ATTACHMENT_NAME</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> EB_ATTACHMENT_NAME = createField(DSL.name("EB_ATTACHMENT_NAME"), SQLDataType.VARCHAR(350), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_ATTACHMENT_CONTENT</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> EB_ATTACHMENT_CONTENT = createField(DSL.name("EB_ATTACHMENT_CONTENT"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EB_ATTACHMENT</code>.
     */
    public final TableField<CustomerEbClaimRecord, byte[]> EB_ATTACHMENT = createField(DSL.name("EB_ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.APPROVED_BY</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> APPROVED_BY = createField(DSL.name("APPROVED_BY"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.APPROVED_ON</code>.
     */
    public final TableField<CustomerEbClaimRecord, LocalDateTime> APPROVED_ON = createField(DSL.name("APPROVED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.SALES_ORDER_NO</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> SALES_ORDER_NO = createField(DSL.name("SALES_ORDER_NO"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.SALES_ORDER_DATE</code>.
     */
    public final TableField<CustomerEbClaimRecord, LocalDateTime> SALES_ORDER_DATE = createField(DSL.name("SALES_ORDER_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.CREATED_BY</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.CREATED_ON</code>.
     */
    public final TableField<CustomerEbClaimRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EDITED_BY</code>.
     */
    public final TableField<CustomerEbClaimRecord, String> EDITED_BY = createField(DSL.name("EDITED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_eb_claim.EDITED_ON</code>.
     */
    public final TableField<CustomerEbClaimRecord, LocalDateTime> EDITED_ON = createField(DSL.name("EDITED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private CustomerEbClaim(Name alias, Table<CustomerEbClaimRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerEbClaim(Name alias, Table<CustomerEbClaimRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_eb_claim</code> table reference
     */
    public CustomerEbClaim(String alias) {
        this(DSL.name(alias), CUSTOMER_EB_CLAIM);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_eb_claim</code> table reference
     */
    public CustomerEbClaim(Name alias) {
        this(alias, CUSTOMER_EB_CLAIM);
    }

    /**
     * Create a <code>vendor_portal_pbx.customer_eb_claim</code> table reference
     */
    public CustomerEbClaim() {
        this(DSL.name("customer_eb_claim"), null);
    }

    public <O extends Record> CustomerEbClaim(Table<O> child, ForeignKey<O, CustomerEbClaimRecord> key) {
        super(child, key, CUSTOMER_EB_CLAIM);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CustomerEbClaimRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_EB_CLAIM_PRIMARY;
    }

    @Override
    public List<UniqueKey<CustomerEbClaimRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerEbClaimRecord>>asList(Keys.KEY_CUSTOMER_EB_CLAIM_PRIMARY);
    }

    @Override
    public CustomerEbClaim as(String alias) {
        return new CustomerEbClaim(DSL.name(alias), this);
    }

    @Override
    public CustomerEbClaim as(Name alias) {
        return new CustomerEbClaim(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerEbClaim rename(String name) {
        return new CustomerEbClaim(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerEbClaim rename(Name name) {
        return new CustomerEbClaim(name, null);
    }
}