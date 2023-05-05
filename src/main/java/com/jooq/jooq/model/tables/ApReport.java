/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.ApReportRecord;

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
public class ApReport extends TableImpl<ApReportRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ap_report</code>
     */
    public static final ApReport AP_REPORT = new ApReport();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApReportRecord> getRecordType() {
        return ApReportRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ap_report.COMP_CODE</code>.
     */
    public final TableField<ApReportRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.VENDOR_CODE</code>.
     */
    public final TableField<ApReportRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.DOC_NO</code>.
     */
    public final TableField<ApReportRecord, String> DOC_NO = createField(DSL.name("DOC_NO"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.ITEM_NO</code>.
     */
    public final TableField<ApReportRecord, String> ITEM_NO = createField(DSL.name("ITEM_NO"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.FI_YEAR</code>.
     */
    public final TableField<ApReportRecord, Integer> FI_YEAR = createField(DSL.name("FI_YEAR"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.VENDOR_ACC_GRP_CODE</code>.
     */
    public final TableField<ApReportRecord, String> VENDOR_ACC_GRP_CODE = createField(DSL.name("VENDOR_ACC_GRP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.DOC_TYPE</code>.
     */
    public final TableField<ApReportRecord, String> DOC_TYPE = createField(DSL.name("DOC_TYPE"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.DOC_DATE</code>.
     */
    public final TableField<ApReportRecord, LocalDate> DOC_DATE = createField(DSL.name("DOC_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.POSTING_DATE</code>.
     */
    public final TableField<ApReportRecord, LocalDate> POSTING_DATE = createField(DSL.name("POSTING_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.AMOUNT</code>.
     */
    public final TableField<ApReportRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.DB_CR_IND</code>.
     */
    public final TableField<ApReportRecord, String> DB_CR_IND = createField(DSL.name("DB_CR_IND"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.DB_CR_IND_DESC</code>.
     */
    public final TableField<ApReportRecord, String> DB_CR_IND_DESC = createField(DSL.name("DB_CR_IND_DESC"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.STATUS</code>.
     */
    public final TableField<ApReportRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.CREATED_BY</code>.
     */
    public final TableField<ApReportRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.CREATED_ON</code>.
     */
    public final TableField<ApReportRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.LAST_CHANGED_BY</code>.
     */
    public final TableField<ApReportRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.LAST_CHANGED_ON</code>.
     */
    public final TableField<ApReportRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.REF_DOC_NO</code>.
     */
    public final TableField<ApReportRecord, String> REF_DOC_NO = createField(DSL.name("REF_DOC_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.ITEM_TYPE</code>.
     */
    public final TableField<ApReportRecord, String> ITEM_TYPE = createField(DSL.name("ITEM_TYPE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.TDS_AMOUNT</code>.
     */
    public final TableField<ApReportRecord, BigDecimal> TDS_AMOUNT = createField(DSL.name("TDS_AMOUNT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.NET_AMOUNT</code>.
     */
    public final TableField<ApReportRecord, BigDecimal> NET_AMOUNT = createField(DSL.name("NET_AMOUNT"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.SP_GL_IND</code>.
     */
    public final TableField<ApReportRecord, String> SP_GL_IND = createField(DSL.name("SP_GL_IND"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.ITEM_TEXT</code>.
     */
    public final TableField<ApReportRecord, String> ITEM_TEXT = createField(DSL.name("ITEM_TEXT"), SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.ALLOC_NMBR</code>.
     */
    public final TableField<ApReportRecord, String> ALLOC_NMBR = createField(DSL.name("ALLOC_NMBR"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.BKTXT</code>.
     */
    public final TableField<ApReportRecord, String> BKTXT = createField(DSL.name("BKTXT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.CLR_DOC_NO</code>.
     */
    public final TableField<ApReportRecord, String> CLR_DOC_NO = createField(DSL.name("CLR_DOC_NO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.OFFSET_NO</code>.
     */
    public final TableField<ApReportRecord, String> OFFSET_NO = createField(DSL.name("OFFSET_NO"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.CLEAR_DATE</code>.
     */
    public final TableField<ApReportRecord, LocalDate> CLEAR_DATE = createField(DSL.name("CLEAR_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.ap_report.BASE_AMT</code>.
     */
    public final TableField<ApReportRecord, BigDecimal> BASE_AMT = createField(DSL.name("BASE_AMT"), SQLDataType.DECIMAL(16, 2), this, "");

    private ApReport(Name alias, Table<ApReportRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApReport(Name alias, Table<ApReportRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ap_report</code> table reference
     */
    public ApReport(String alias) {
        this(DSL.name(alias), AP_REPORT);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ap_report</code> table reference
     */
    public ApReport(Name alias) {
        this(alias, AP_REPORT);
    }

    /**
     * Create a <code>vendor_portal_pbx.ap_report</code> table reference
     */
    public ApReport() {
        this(DSL.name("ap_report"), null);
    }

    public <O extends Record> ApReport(Table<O> child, ForeignKey<O, ApReportRecord> key) {
        super(child, key, AP_REPORT);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.AP_REPORT_SECONDARY_INDEX);
    }

    @Override
    public UniqueKey<ApReportRecord> getPrimaryKey() {
        return Keys.KEY_AP_REPORT_PRIMARY;
    }

    @Override
    public List<UniqueKey<ApReportRecord>> getKeys() {
        return Arrays.<UniqueKey<ApReportRecord>>asList(Keys.KEY_AP_REPORT_PRIMARY);
    }

    @Override
    public ApReport as(String alias) {
        return new ApReport(DSL.name(alias), this);
    }

    @Override
    public ApReport as(Name alias) {
        return new ApReport(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ApReport rename(String name) {
        return new ApReport(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ApReport rename(Name name) {
        return new ApReport(name, null);
    }
}