/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.FreezerAckApprovalRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row21;
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
public class FreezerAckApproval extends TableImpl<FreezerAckApprovalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.freezer_ack_approval</code>
     */
    public static final FreezerAckApproval FREEZER_ACK_APPROVAL = new FreezerAckApproval();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FreezerAckApprovalRecord> getRecordType() {
        return FreezerAckApprovalRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.CFA</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> CFA = createField(DSL.name("CFA"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.CUSTOMER_CODE</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> CUSTOMER_CODE = createField(DSL.name("CUSTOMER_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.GATE_ENTRY_NO</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> GATE_ENTRY_NO = createField(DSL.name("GATE_ENTRY_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.POSTING_DATE</code>.
     */
    public final TableField<FreezerAckApprovalRecord, LocalDate> POSTING_DATE = createField(DSL.name("POSTING_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.DESCRIPTION</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(150).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.DIVISION</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> DIVISION = createField(DSL.name("DIVISION"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.ADMIN_APPROVE</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> ADMIN_APPROVE = createField(DSL.name("ADMIN_APPROVE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.ADMIN_APPROVED_ON</code>.
     */
    public final TableField<FreezerAckApprovalRecord, LocalDateTime> ADMIN_APPROVED_ON = createField(DSL.name("ADMIN_APPROVED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.ADMIN_REMARK</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> ADMIN_REMARK = createField(DSL.name("ADMIN_REMARK"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.SDM_APPROVE</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> SDM_APPROVE = createField(DSL.name("SDM_APPROVE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.SDM_APPROVED_ON</code>.
     */
    public final TableField<FreezerAckApprovalRecord, LocalDateTime> SDM_APPROVED_ON = createField(DSL.name("SDM_APPROVED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.SDM_REMARK</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> SDM_REMARK = createField(DSL.name("SDM_REMARK"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.RSM_APPROVE</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> RSM_APPROVE = createField(DSL.name("RSM_APPROVE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.RSM_APPROVED_ON</code>.
     */
    public final TableField<FreezerAckApprovalRecord, LocalDateTime> RSM_APPROVED_ON = createField(DSL.name("RSM_APPROVED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.RSM_REMARK</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> RSM_REMARK = createField(DSL.name("RSM_REMARK"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.HO_ADMIN_APPROVE</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> HO_ADMIN_APPROVE = createField(DSL.name("HO_ADMIN_APPROVE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.HO_ADMIN_APPROVED_ON</code>.
     */
    public final TableField<FreezerAckApprovalRecord, LocalDateTime> HO_ADMIN_APPROVED_ON = createField(DSL.name("HO_ADMIN_APPROVED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.HO_ADMIN_REMARK</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> HO_ADMIN_REMARK = createField(DSL.name("HO_ADMIN_REMARK"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.QUANTITY</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.ADMIN_APPROVE_STATUS</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> ADMIN_APPROVE_STATUS = createField(DSL.name("ADMIN_APPROVE_STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.freezer_ack_approval.HO_ADMIN_APPROVE_STATUS</code>.
     */
    public final TableField<FreezerAckApprovalRecord, String> HO_ADMIN_APPROVE_STATUS = createField(DSL.name("HO_ADMIN_APPROVE_STATUS"), SQLDataType.VARCHAR(1), this, "");

    private FreezerAckApproval(Name alias, Table<FreezerAckApprovalRecord> aliased) {
        this(alias, aliased, null);
    }

    private FreezerAckApproval(Name alias, Table<FreezerAckApprovalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.freezer_ack_approval</code> table reference
     */
    public FreezerAckApproval(String alias) {
        this(DSL.name(alias), FREEZER_ACK_APPROVAL);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.freezer_ack_approval</code> table reference
     */
    public FreezerAckApproval(Name alias) {
        this(alias, FREEZER_ACK_APPROVAL);
    }

    /**
     * Create a <code>vendor_portal_pbx.freezer_ack_approval</code> table reference
     */
    public FreezerAckApproval() {
        this(DSL.name("freezer_ack_approval"), null);
    }

    public <O extends Record> FreezerAckApproval(Table<O> child, ForeignKey<O, FreezerAckApprovalRecord> key) {
        super(child, key, FREEZER_ACK_APPROVAL);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<FreezerAckApprovalRecord> getPrimaryKey() {
        return Keys.KEY_FREEZER_ACK_APPROVAL_PRIMARY;
    }

    @Override
    public List<UniqueKey<FreezerAckApprovalRecord>> getKeys() {
        return Arrays.<UniqueKey<FreezerAckApprovalRecord>>asList(Keys.KEY_FREEZER_ACK_APPROVAL_PRIMARY);
    }

    @Override
    public FreezerAckApproval as(String alias) {
        return new FreezerAckApproval(DSL.name(alias), this);
    }

    @Override
    public FreezerAckApproval as(Name alias) {
        return new FreezerAckApproval(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FreezerAckApproval rename(String name) {
        return new FreezerAckApproval(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FreezerAckApproval rename(Name name) {
        return new FreezerAckApproval(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, LocalDate, String, String, String, LocalDateTime, String, String, LocalDateTime, String, String, LocalDateTime, String, String, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
