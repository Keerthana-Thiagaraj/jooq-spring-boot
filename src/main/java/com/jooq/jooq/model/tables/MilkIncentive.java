/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MilkIncentiveRecord;

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
public class MilkIncentive extends TableImpl<MilkIncentiveRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.milk_incentive</code>
     */
    public static final MilkIncentive MILK_INCENTIVE = new MilkIncentive();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilkIncentiveRecord> getRecordType() {
        return MilkIncentiveRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.COMP_CODE</code>.
     */
    public final TableField<MilkIncentiveRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.POSTINGDATE</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDate> POSTINGDATE = createField(DSL.name("POSTINGDATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.WERKS</code>.
     */
    public final TableField<MilkIncentiveRecord, String> WERKS = createField(DSL.name("WERKS"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.SOCIETY</code>.
     */
    public final TableField<MilkIncentiveRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.PARTNER</code>.
     */
    public final TableField<MilkIncentiveRecord, String> PARTNER = createField(DSL.name("PARTNER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.J_1KFTBUS</code>.
     */
    public final TableField<MilkIncentiveRecord, String> J_1KFTBUS = createField(DSL.name("J_1KFTBUS"), SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.EBELN</code>.
     */
    public final TableField<MilkIncentiveRecord, String> EBELN = createField(DSL.name("EBELN"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.EBELP</code>.
     */
    public final TableField<MilkIncentiveRecord, String> EBELP = createField(DSL.name("EBELP"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.CRDAT</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDate> CRDAT = createField(DSL.name("CRDAT"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.SHIFT</code>.
     */
    public final TableField<MilkIncentiveRecord, String> SHIFT = createField(DSL.name("SHIFT"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.INC_TYPE</code>.
     */
    public final TableField<MilkIncentiveRecord, String> INC_TYPE = createField(DSL.name("INC_TYPE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.MILK_TYPE</code>.
     */
    public final TableField<MilkIncentiveRecord, String> MILK_TYPE = createField(DSL.name("MILK_TYPE"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.INC_VALID_FROM</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDate> INC_VALID_FROM = createField(DSL.name("INC_VALID_FROM"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.INC_VALID_TO</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDate> INC_VALID_TO = createField(DSL.name("INC_VALID_TO"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.QTY</code>.
     */
    public final TableField<MilkIncentiveRecord, String> QTY = createField(DSL.name("QTY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.UOM</code>.
     */
    public final TableField<MilkIncentiveRecord, String> UOM = createField(DSL.name("UOM"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.QTY_KG</code>.
     */
    public final TableField<MilkIncentiveRecord, String> QTY_KG = createField(DSL.name("QTY_KG"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.UOM_KG</code>.
     */
    public final TableField<MilkIncentiveRecord, String> UOM_KG = createField(DSL.name("UOM_KG"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.INC_RATE</code>.
     */
    public final TableField<MilkIncentiveRecord, String> INC_RATE = createField(DSL.name("INC_RATE"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.AMT</code>.
     */
    public final TableField<MilkIncentiveRecord, BigDecimal> AMT = createField(DSL.name("AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.INC_BONUS</code>.
     */
    public final TableField<MilkIncentiveRecord, BigDecimal> INC_BONUS = createField(DSL.name("INC_BONUS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.LOCAL_CURR</code>.
     */
    public final TableField<MilkIncentiveRecord, String> LOCAL_CURR = createField(DSL.name("LOCAL_CURR"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.REMARKS</code>.
     */
    public final TableField<MilkIncentiveRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.DOCNO</code>.
     */
    public final TableField<MilkIncentiveRecord, String> DOCNO = createField(DSL.name("DOCNO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.APPROVER</code>.
     */
    public final TableField<MilkIncentiveRecord, String> APPROVER = createField(DSL.name("APPROVER"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.APPROVAL_DATE</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDate> APPROVAL_DATE = createField(DSL.name("APPROVAL_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.SAP_STATUS</code>.
     */
    public final TableField<MilkIncentiveRecord, String> SAP_STATUS = createField(DSL.name("SAP_STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.SAP_CREATEDBY</code>.
     */
    public final TableField<MilkIncentiveRecord, String> SAP_CREATEDBY = createField(DSL.name("SAP_CREATEDBY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.SAP_CREATEDON</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDate> SAP_CREATEDON = createField(DSL.name("SAP_CREATEDON"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.PAID</code>.
     */
    public final TableField<MilkIncentiveRecord, String> PAID = createField(DSL.name("PAID"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.BILL_NUM</code>.
     */
    public final TableField<MilkIncentiveRecord, String> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.INC_ARRERS</code>.
     */
    public final TableField<MilkIncentiveRecord, String> INC_ARRERS = createField(DSL.name("INC_ARRERS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.FKIMG</code>.
     */
    public final TableField<MilkIncentiveRecord, String> FKIMG = createField(DSL.name("FKIMG"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.PROCESSED_FLG</code>.
     */
    public final TableField<MilkIncentiveRecord, String> PROCESSED_FLG = createField(DSL.name("PROCESSED_FLG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.STATUS</code>.
     */
    public final TableField<MilkIncentiveRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.CREATED_BY</code>.
     */
    public final TableField<MilkIncentiveRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.CREATED_ON</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.LAST_CHANGED_BY</code>.
     */
    public final TableField<MilkIncentiveRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_incentive.LAST_CHANGED_ON</code>.
     */
    public final TableField<MilkIncentiveRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private MilkIncentive(Name alias, Table<MilkIncentiveRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilkIncentive(Name alias, Table<MilkIncentiveRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_incentive</code> table reference
     */
    public MilkIncentive(String alias) {
        this(DSL.name(alias), MILK_INCENTIVE);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_incentive</code> table reference
     */
    public MilkIncentive(Name alias) {
        this(alias, MILK_INCENTIVE);
    }

    /**
     * Create a <code>vendor_portal_pbx.milk_incentive</code> table reference
     */
    public MilkIncentive() {
        this(DSL.name("milk_incentive"), null);
    }

    public <O extends Record> MilkIncentive(Table<O> child, ForeignKey<O, MilkIncentiveRecord> key) {
        super(child, key, MILK_INCENTIVE);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MILK_INCENTIVE_IDX_SECONDMILKPAYINCENTIVE);
    }

    @Override
    public UniqueKey<MilkIncentiveRecord> getPrimaryKey() {
        return Keys.KEY_MILK_INCENTIVE_PRIMARY;
    }

    @Override
    public List<UniqueKey<MilkIncentiveRecord>> getKeys() {
        return Arrays.<UniqueKey<MilkIncentiveRecord>>asList(Keys.KEY_MILK_INCENTIVE_PRIMARY);
    }

    @Override
    public MilkIncentive as(String alias) {
        return new MilkIncentive(DSL.name(alias), this);
    }

    @Override
    public MilkIncentive as(Name alias) {
        return new MilkIncentive(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkIncentive rename(String name) {
        return new MilkIncentive(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkIncentive rename(Name name) {
        return new MilkIncentive(name, null);
    }
}