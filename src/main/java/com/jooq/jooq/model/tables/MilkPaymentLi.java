/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MilkPaymentLiRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
public class MilkPaymentLi extends TableImpl<MilkPaymentLiRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.milk_payment_li</code>
     */
    public static final MilkPaymentLi MILK_PAYMENT_LI = new MilkPaymentLi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilkPaymentLiRecord> getRecordType() {
        return MilkPaymentLiRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.COMP_CODE</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.PLANT</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.SOCIETY</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.SS_DATE</code>.
     */
    public final TableField<MilkPaymentLiRecord, LocalDate> SS_DATE = createField(DSL.name("SS_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.SHIFT</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> SHIFT = createField(DSL.name("SHIFT"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.FARMER</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> FARMER = createField(DSL.name("FARMER"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.MILK_TYPE</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> MILK_TYPE = createField(DSL.name("MILK_TYPE"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.BOX_NUMBER</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> BOX_NUMBER = createField(DSL.name("BOX_NUMBER"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.PROCESSED</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> PROCESSED = createField(DSL.name("PROCESSED"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.P_CODE</code>.
     */
    public final TableField<MilkPaymentLiRecord, Integer> P_CODE = createField(DSL.name("P_CODE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.APPROVED</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> APPROVED = createField(DSL.name("APPROVED"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.J_1KFTBUS</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> J_1KFTBUS = createField(DSL.name("J_1KFTBUS"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.F_J_1KFTBUS</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> F_J_1KFTBUS = createField(DSL.name("F_J_1KFTBUS"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.QUANTITY</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> QUANTITY = createField(DSL.name("QUANTITY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.UOM</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> UOM = createField(DSL.name("UOM"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.QUANTITY_KG</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> QUANTITY_KG = createField(DSL.name("QUANTITY_KG"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.UOM_KG</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> UOM_KG = createField(DSL.name("UOM_KG"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.FAT</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> FAT = createField(DSL.name("FAT"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.SNF</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> SNF = createField(DSL.name("SNF"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.CLR</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> CLR = createField(DSL.name("CLR"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.NET_PRICE</code>.
     */
    public final TableField<MilkPaymentLiRecord, BigDecimal> NET_PRICE = createField(DSL.name("NET_PRICE"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.DMBTR</code>.
     */
    public final TableField<MilkPaymentLiRecord, BigDecimal> DMBTR = createField(DSL.name("DMBTR"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.USER_NAME</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.CREATION_DATE</code>.
     */
    public final TableField<MilkPaymentLiRecord, LocalDate> CREATION_DATE = createField(DSL.name("CREATION_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.TIME</code>.
     */
    public final TableField<MilkPaymentLiRecord, LocalTime> TIME = createField(DSL.name("TIME"), SQLDataType.LOCALTIME, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.APP_USER_NAME</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> APP_USER_NAME = createField(DSL.name("APP_USER_NAME"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.APP_DATE</code>.
     */
    public final TableField<MilkPaymentLiRecord, LocalDate> APP_DATE = createField(DSL.name("APP_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.PAID</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> PAID = createField(DSL.name("PAID"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.BILL_NUM</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.STATUS</code>.
     */
    public final TableField<MilkPaymentLiRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.CREATED_BY</code>.
     */
    public final TableField<MilkPaymentLiRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.CREATED_ON</code>.
     */
    public final TableField<MilkPaymentLiRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.LAST_CHANGED_BY</code>.
     */
    public final TableField<MilkPaymentLiRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_payment_li.LAST_CHANGED_ON</code>.
     */
    public final TableField<MilkPaymentLiRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private MilkPaymentLi(Name alias, Table<MilkPaymentLiRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilkPaymentLi(Name alias, Table<MilkPaymentLiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_payment_li</code> table reference
     */
    public MilkPaymentLi(String alias) {
        this(DSL.name(alias), MILK_PAYMENT_LI);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_payment_li</code> table reference
     */
    public MilkPaymentLi(Name alias) {
        this(alias, MILK_PAYMENT_LI);
    }

    /**
     * Create a <code>vendor_portal_pbx.milk_payment_li</code> table reference
     */
    public MilkPaymentLi() {
        this(DSL.name("milk_payment_li"), null);
    }

    public <O extends Record> MilkPaymentLi(Table<O> child, ForeignKey<O, MilkPaymentLiRecord> key) {
        super(child, key, MILK_PAYMENT_LI);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<MilkPaymentLiRecord> getPrimaryKey() {
        return Keys.KEY_MILK_PAYMENT_LI_PRIMARY;
    }

    @Override
    public List<UniqueKey<MilkPaymentLiRecord>> getKeys() {
        return Arrays.<UniqueKey<MilkPaymentLiRecord>>asList(Keys.KEY_MILK_PAYMENT_LI_PRIMARY);
    }

    @Override
    public MilkPaymentLi as(String alias) {
        return new MilkPaymentLi(DSL.name(alias), this);
    }

    @Override
    public MilkPaymentLi as(Name alias) {
        return new MilkPaymentLi(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkPaymentLi rename(String name) {
        return new MilkPaymentLi(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkPaymentLi rename(Name name) {
        return new MilkPaymentLi(name, null);
    }
}