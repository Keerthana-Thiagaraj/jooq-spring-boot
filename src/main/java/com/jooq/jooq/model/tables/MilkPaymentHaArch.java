/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MilkPaymentHaArchRecord;

import java.math.BigDecimal;
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
public class MilkPaymentHaArch extends TableImpl<MilkPaymentHaArchRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.milk_payment_ha_arch</code>
     */
    public static final MilkPaymentHaArch MILK_PAYMENT_HA_ARCH = new MilkPaymentHaArch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilkPaymentHaArchRecord> getRecordType() {
        return MilkPaymentHaArchRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.COMP_CODE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.BILL_NUM</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Long> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.DATE_FRM</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, LocalDate> DATE_FRM = createField(DSL.name("DATE_FRM"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.DATE_TO</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, LocalDate> DATE_TO = createField(DSL.name("DATE_TO"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.PLANT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.SOCIETY</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.FARMER</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> FARMER = createField(DSL.name("FARMER"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.GROSS_AMT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> GROSS_AMT = createField(DSL.name("GROSS_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.DEDUCTIONS</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> DEDUCTIONS = createField(DSL.name("DEDUCTIONS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.RECOVERIES</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> RECOVERIES = createField(DSL.name("RECOVERIES"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.ARREARS</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> ARREARS = createField(DSL.name("ARREARS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.NET_AMT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> NET_AMT = createField(DSL.name("NET_AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.ACT_DED</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> ACT_DED = createField(DSL.name("ACT_DED"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.ADJ_DOC_POST_BY</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> ADJ_DOC_POST_BY = createField(DSL.name("ADJ_DOC_POST_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.AVG_RATE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> AVG_RATE = createField(DSL.name("AVG_RATE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.BASIC_MILK</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> BASIC_MILK = createField(DSL.name("BASIC_MILK"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.BLK_CNT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> BLK_CNT = createField(DSL.name("BLK_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.BUS_TYP</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> BUS_TYP = createField(DSL.name("BUS_TYP"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.C_NAME</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> C_NAME = createField(DSL.name("C_NAME"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.DOCNO</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> DOCNO = createField(DSL.name("DOCNO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.FARMER_TY</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> FARMER_TY = createField(DSL.name("FARMER_TY"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.FAR_CNT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> FAR_CNT = createField(DSL.name("FAR_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.FV_CNT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> FV_CNT = createField(DSL.name("FV_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.F_NAME</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> F_NAME = createField(DSL.name("F_NAME"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.HMB_CNT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> HMB_CNT = createField(DSL.name("HMB_CNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.INCENTIVE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, BigDecimal> INCENTIVE = createField(DSL.name("INCENTIVE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.NAME1</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> NAME1 = createField(DSL.name("NAME1"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.NEG_ADJ_DOC_C</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> NEG_ADJ_DOC_C = createField(DSL.name("NEG_ADJ_DOC_C"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.NEG_ADJ_DOC_F</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> NEG_ADJ_DOC_F = createField(DSL.name("NEG_ADJ_DOC_F"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.NEG_POST_DATE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, LocalDate> NEG_POST_DATE = createField(DSL.name("NEG_POST_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.PAYEE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> PAYEE = createField(DSL.name("PAYEE"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.POST_BY</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> POST_BY = createField(DSL.name("POST_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.POST_DAT</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, LocalDate> POST_DAT = createField(DSL.name("POST_DAT"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.P_CODE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> P_CODE = createField(DSL.name("P_CODE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.P_SO</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> P_SO = createField(DSL.name("P_SO"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.QUANTITY</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.REMARKS</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.ROUTE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> ROUTE = createField(DSL.name("ROUTE"), SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.R_NAME</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> R_NAME = createField(DSL.name("R_NAME"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.STATUS</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.CREATED_BY</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.CREATED_ON</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.LAST_CHANGED_BY</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.LAST_CHANGED_ON</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.BANKN</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> BANKN = createField(DSL.name("BANKN"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.BANKL</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> BANKL = createField(DSL.name("BANKL"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_ha_arch.FEED_ELIGIBLE</code>.
     */
    public final TableField<MilkPaymentHaArchRecord, String> FEED_ELIGIBLE = createField(DSL.name("FEED_ELIGIBLE"), SQLDataType.VARCHAR(260), this, "");

    private MilkPaymentHaArch(Name alias, Table<MilkPaymentHaArchRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilkPaymentHaArch(Name alias, Table<MilkPaymentHaArchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_payment_ha_arch</code> table reference
     */
    public MilkPaymentHaArch(String alias) {
        this(DSL.name(alias), MILK_PAYMENT_HA_ARCH);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_payment_ha_arch</code> table reference
     */
    public MilkPaymentHaArch(Name alias) {
        this(alias, MILK_PAYMENT_HA_ARCH);
    }

    /**
     * Create a <code>vendor_portal_pbx.milk_payment_ha_arch</code> table reference
     */
    public MilkPaymentHaArch() {
        this(DSL.name("milk_payment_ha_arch"), null);
    }

    public <O extends Record> MilkPaymentHaArch(Table<O> child, ForeignKey<O, MilkPaymentHaArchRecord> key) {
        super(child, key, MILK_PAYMENT_HA_ARCH);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<MilkPaymentHaArchRecord> getPrimaryKey() {
        return Keys.KEY_MILK_PAYMENT_HA_ARCH_PRIMARY;
    }

    @Override
    public List<UniqueKey<MilkPaymentHaArchRecord>> getKeys() {
        return Arrays.<UniqueKey<MilkPaymentHaArchRecord>>asList(Keys.KEY_MILK_PAYMENT_HA_ARCH_PRIMARY);
    }

    @Override
    public MilkPaymentHaArch as(String alias) {
        return new MilkPaymentHaArch(DSL.name(alias), this);
    }

    @Override
    public MilkPaymentHaArch as(Name alias) {
        return new MilkPaymentHaArch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkPaymentHaArch rename(String name) {
        return new MilkPaymentHaArch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkPaymentHaArch rename(Name name) {
        return new MilkPaymentHaArch(name, null);
    }
}
