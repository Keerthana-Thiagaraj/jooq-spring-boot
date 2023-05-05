/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MilkArrearRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
public class MilkArrear extends TableImpl<MilkArrearRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.milk_arrear</code>
     */
    public static final MilkArrear MILK_ARREAR = new MilkArrear();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilkArrearRecord> getRecordType() {
        return MilkArrearRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.COMP_CODE</code>.
     */
    public final TableField<MilkArrearRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.POST_DAT</code>.
     */
    public final TableField<MilkArrearRecord, LocalDate> POST_DAT = createField(DSL.name("POST_DAT"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.POST_TIME</code>.
     */
    public final TableField<MilkArrearRecord, LocalTime> POST_TIME = createField(DSL.name("POST_TIME"), SQLDataType.LOCALTIME.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.PLANT</code>.
     */
    public final TableField<MilkArrearRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.ARREAR_CODE</code>.
     */
    public final TableField<MilkArrearRecord, String> ARREAR_CODE = createField(DSL.name("ARREAR_CODE"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.ARREAR_DAT</code>.
     */
    public final TableField<MilkArrearRecord, LocalDate> ARREAR_DAT = createField(DSL.name("ARREAR_DAT"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.ARREAR_SHIFT</code>.
     */
    public final TableField<MilkArrearRecord, String> ARREAR_SHIFT = createField(DSL.name("ARREAR_SHIFT"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.MILK_TYPE</code>.
     */
    public final TableField<MilkArrearRecord, String> MILK_TYPE = createField(DSL.name("MILK_TYPE"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.SOCIETY</code>.
     */
    public final TableField<MilkArrearRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.P_CODE</code>.
     */
    public final TableField<MilkArrearRecord, Integer> P_CODE = createField(DSL.name("P_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.FARMER</code>.
     */
    public final TableField<MilkArrearRecord, String> FARMER = createField(DSL.name("FARMER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.J_1KFTBUS</code>.
     */
    public final TableField<MilkArrearRecord, String> J_1KFTBUS = createField(DSL.name("J_1KFTBUS"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.C_NAME</code>.
     */
    public final TableField<MilkArrearRecord, String> C_NAME = createField(DSL.name("C_NAME"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.FARMER_TY</code>.
     */
    public final TableField<MilkArrearRecord, String> FARMER_TY = createField(DSL.name("FARMER_TY"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.F_NAME</code>.
     */
    public final TableField<MilkArrearRecord, String> F_NAME = createField(DSL.name("F_NAME"), SQLDataType.VARCHAR(35), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.SAP_STATUS</code>.
     */
    public final TableField<MilkArrearRecord, String> SAP_STATUS = createField(DSL.name("SAP_STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.BUKRS</code>.
     */
    public final TableField<MilkArrearRecord, String> BUKRS = createField(DSL.name("BUKRS"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.TDATE</code>.
     */
    public final TableField<MilkArrearRecord, LocalDate> TDATE = createField(DSL.name("TDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.SAKNR</code>.
     */
    public final TableField<MilkArrearRecord, String> SAKNR = createField(DSL.name("SAKNR"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.PRCTR</code>.
     */
    public final TableField<MilkArrearRecord, String> PRCTR = createField(DSL.name("PRCTR"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.FAT</code>.
     */
    public final TableField<MilkArrearRecord, String> FAT = createField(DSL.name("FAT"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.SNF</code>.
     */
    public final TableField<MilkArrearRecord, String> SNF = createField(DSL.name("SNF"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.QTY</code>.
     */
    public final TableField<MilkArrearRecord, String> QTY = createField(DSL.name("QTY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.UOM</code>.
     */
    public final TableField<MilkArrearRecord, String> UOM = createField(DSL.name("UOM"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.CLR</code>.
     */
    public final TableField<MilkArrearRecord, String> CLR = createField(DSL.name("CLR"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.QTY_KG</code>.
     */
    public final TableField<MilkArrearRecord, String> QTY_KG = createField(DSL.name("QTY_KG"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.UOM_KG</code>.
     */
    public final TableField<MilkArrearRecord, String> UOM_KG = createField(DSL.name("UOM_KG"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.AMT</code>.
     */
    public final TableField<MilkArrearRecord, BigDecimal> AMT = createField(DSL.name("AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.RATE</code>.
     */
    public final TableField<MilkArrearRecord, String> RATE = createField(DSL.name("RATE"), SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.NEW_RATE</code>.
     */
    public final TableField<MilkArrearRecord, String> NEW_RATE = createField(DSL.name("NEW_RATE"), SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.LOCAL_CURR</code>.
     */
    public final TableField<MilkArrearRecord, String> LOCAL_CURR = createField(DSL.name("LOCAL_CURR"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.REMARKS</code>.
     */
    public final TableField<MilkArrearRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.SAP_CREATED_BY</code>.
     */
    public final TableField<MilkArrearRecord, String> SAP_CREATED_BY = createField(DSL.name("SAP_CREATED_BY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.DOCNO</code>.
     */
    public final TableField<MilkArrearRecord, String> DOCNO = createField(DSL.name("DOCNO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.APPROVER</code>.
     */
    public final TableField<MilkArrearRecord, String> APPROVER = createField(DSL.name("APPROVER"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.APPROVAL_DATE</code>.
     */
    public final TableField<MilkArrearRecord, LocalDate> APPROVAL_DATE = createField(DSL.name("APPROVAL_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.PAID</code>.
     */
    public final TableField<MilkArrearRecord, String> PAID = createField(DSL.name("PAID"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.BILL_NUM</code>.
     */
    public final TableField<MilkArrearRecord, String> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.STATUS</code>.
     */
    public final TableField<MilkArrearRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.CREATED_BY</code>.
     */
    public final TableField<MilkArrearRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.CREATED_ON</code>.
     */
    public final TableField<MilkArrearRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.LAST_CHANGED_BY</code>.
     */
    public final TableField<MilkArrearRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_arrear.LAST_CHANGED_ON</code>.
     */
    public final TableField<MilkArrearRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private MilkArrear(Name alias, Table<MilkArrearRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilkArrear(Name alias, Table<MilkArrearRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_arrear</code> table reference
     */
    public MilkArrear(String alias) {
        this(DSL.name(alias), MILK_ARREAR);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_arrear</code> table reference
     */
    public MilkArrear(Name alias) {
        this(alias, MILK_ARREAR);
    }

    /**
     * Create a <code>vendor_portal_pbx.milk_arrear</code> table reference
     */
    public MilkArrear() {
        this(DSL.name("milk_arrear"), null);
    }

    public <O extends Record> MilkArrear(Table<O> child, ForeignKey<O, MilkArrearRecord> key) {
        super(child, key, MILK_ARREAR);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MILK_ARREAR_IDX_SECONDMILKPAYARREAR);
    }

    @Override
    public UniqueKey<MilkArrearRecord> getPrimaryKey() {
        return Keys.KEY_MILK_ARREAR_PRIMARY;
    }

    @Override
    public List<UniqueKey<MilkArrearRecord>> getKeys() {
        return Arrays.<UniqueKey<MilkArrearRecord>>asList(Keys.KEY_MILK_ARREAR_PRIMARY);
    }

    @Override
    public MilkArrear as(String alias) {
        return new MilkArrear(DSL.name(alias), this);
    }

    @Override
    public MilkArrear as(Name alias) {
        return new MilkArrear(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkArrear rename(String name) {
        return new MilkArrear(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkArrear rename(Name name) {
        return new MilkArrear(name, null);
    }
}