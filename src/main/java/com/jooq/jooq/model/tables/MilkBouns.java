/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.MilkBounsRecord;

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
public class MilkBouns extends TableImpl<MilkBounsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.milk_bouns</code>
     */
    public static final MilkBouns MILK_BOUNS = new MilkBouns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MilkBounsRecord> getRecordType() {
        return MilkBounsRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.COMP_CODE</code>.
     */
    public final TableField<MilkBounsRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.POSTINGDATE</code>.
     */
    public final TableField<MilkBounsRecord, LocalDate> POSTINGDATE = createField(DSL.name("POSTINGDATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.WERKS</code>.
     */
    public final TableField<MilkBounsRecord, String> WERKS = createField(DSL.name("WERKS"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.SOCIETY</code>.
     */
    public final TableField<MilkBounsRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.PARTNER</code>.
     */
    public final TableField<MilkBounsRecord, String> PARTNER = createField(DSL.name("PARTNER"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.J_1KFTBUS</code>.
     */
    public final TableField<MilkBounsRecord, String> J_1KFTBUS = createField(DSL.name("J_1KFTBUS"), SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.EBELN</code>.
     */
    public final TableField<MilkBounsRecord, String> EBELN = createField(DSL.name("EBELN"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.EBELP</code>.
     */
    public final TableField<MilkBounsRecord, String> EBELP = createField(DSL.name("EBELP"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.CRDAT</code>.
     */
    public final TableField<MilkBounsRecord, LocalDate> CRDAT = createField(DSL.name("CRDAT"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.SHIFT</code>.
     */
    public final TableField<MilkBounsRecord, String> SHIFT = createField(DSL.name("SHIFT"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.INC_TYPE</code>.
     */
    public final TableField<MilkBounsRecord, String> INC_TYPE = createField(DSL.name("INC_TYPE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.MILK_TYPE</code>.
     */
    public final TableField<MilkBounsRecord, String> MILK_TYPE = createField(DSL.name("MILK_TYPE"), SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.INC_VALID_FROM</code>.
     */
    public final TableField<MilkBounsRecord, LocalDate> INC_VALID_FROM = createField(DSL.name("INC_VALID_FROM"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.INC_VALID_TO</code>.
     */
    public final TableField<MilkBounsRecord, LocalDate> INC_VALID_TO = createField(DSL.name("INC_VALID_TO"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.QTY</code>.
     */
    public final TableField<MilkBounsRecord, String> QTY = createField(DSL.name("QTY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.UOM</code>.
     */
    public final TableField<MilkBounsRecord, String> UOM = createField(DSL.name("UOM"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.QTY_KG</code>.
     */
    public final TableField<MilkBounsRecord, String> QTY_KG = createField(DSL.name("QTY_KG"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.UOM_KG</code>.
     */
    public final TableField<MilkBounsRecord, String> UOM_KG = createField(DSL.name("UOM_KG"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.INC_RATE</code>.
     */
    public final TableField<MilkBounsRecord, String> INC_RATE = createField(DSL.name("INC_RATE"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.AMT</code>.
     */
    public final TableField<MilkBounsRecord, BigDecimal> AMT = createField(DSL.name("AMT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.INC_BONUS</code>.
     */
    public final TableField<MilkBounsRecord, BigDecimal> INC_BONUS = createField(DSL.name("INC_BONUS"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.LOCAL_CURR</code>.
     */
    public final TableField<MilkBounsRecord, String> LOCAL_CURR = createField(DSL.name("LOCAL_CURR"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.REMARKS</code>.
     */
    public final TableField<MilkBounsRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.DOCNO</code>.
     */
    public final TableField<MilkBounsRecord, String> DOCNO = createField(DSL.name("DOCNO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.APPROVER</code>.
     */
    public final TableField<MilkBounsRecord, String> APPROVER = createField(DSL.name("APPROVER"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.APPROVAL_DATE</code>.
     */
    public final TableField<MilkBounsRecord, LocalDate> APPROVAL_DATE = createField(DSL.name("APPROVAL_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.SAP_STATUS</code>.
     */
    public final TableField<MilkBounsRecord, String> SAP_STATUS = createField(DSL.name("SAP_STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.SAP_CREATEDBY</code>.
     */
    public final TableField<MilkBounsRecord, String> SAP_CREATEDBY = createField(DSL.name("SAP_CREATEDBY"), SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.SAP_CREATEDON</code>.
     */
    public final TableField<MilkBounsRecord, LocalDate> SAP_CREATEDON = createField(DSL.name("SAP_CREATEDON"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.PAID</code>.
     */
    public final TableField<MilkBounsRecord, String> PAID = createField(DSL.name("PAID"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.BILL_NUM</code>.
     */
    public final TableField<MilkBounsRecord, String> BILL_NUM = createField(DSL.name("BILL_NUM"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.INC_ARRERS</code>.
     */
    public final TableField<MilkBounsRecord, String> INC_ARRERS = createField(DSL.name("INC_ARRERS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.FKIMG</code>.
     */
    public final TableField<MilkBounsRecord, String> FKIMG = createField(DSL.name("FKIMG"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.PROCESSED_FLG</code>.
     */
    public final TableField<MilkBounsRecord, String> PROCESSED_FLG = createField(DSL.name("PROCESSED_FLG"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.STATUS</code>.
     */
    public final TableField<MilkBounsRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.CREATED_BY</code>.
     */
    public final TableField<MilkBounsRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.CREATED_ON</code>.
     */
    public final TableField<MilkBounsRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.LAST_CHANGED_BY</code>.
     */
    public final TableField<MilkBounsRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.milk_bouns.LAST_CHANGED_ON</code>.
     */
    public final TableField<MilkBounsRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private MilkBouns(Name alias, Table<MilkBounsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MilkBouns(Name alias, Table<MilkBounsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_bouns</code> table reference
     */
    public MilkBouns(String alias) {
        this(DSL.name(alias), MILK_BOUNS);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.milk_bouns</code> table reference
     */
    public MilkBouns(Name alias) {
        this(alias, MILK_BOUNS);
    }

    /**
     * Create a <code>vendor_portal_pbx.milk_bouns</code> table reference
     */
    public MilkBouns() {
        this(DSL.name("milk_bouns"), null);
    }

    public <O extends Record> MilkBouns(Table<O> child, ForeignKey<O, MilkBounsRecord> key) {
        super(child, key, MILK_BOUNS);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<MilkBounsRecord> getPrimaryKey() {
        return Keys.KEY_MILK_BOUNS_PRIMARY;
    }

    @Override
    public List<UniqueKey<MilkBounsRecord>> getKeys() {
        return Arrays.<UniqueKey<MilkBounsRecord>>asList(Keys.KEY_MILK_BOUNS_PRIMARY);
    }

    @Override
    public MilkBouns as(String alias) {
        return new MilkBouns(DSL.name(alias), this);
    }

    @Override
    public MilkBouns as(Name alias) {
        return new MilkBouns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkBouns rename(String name) {
        return new MilkBouns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MilkBouns rename(Name name) {
        return new MilkBouns(name, null);
    }
}
