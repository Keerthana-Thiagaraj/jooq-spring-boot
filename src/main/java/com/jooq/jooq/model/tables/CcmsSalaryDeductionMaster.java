/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CcmsSalaryDeductionMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class CcmsSalaryDeductionMaster extends TableImpl<CcmsSalaryDeductionMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ccms_salary_deduction_master</code>
     */
    public static final CcmsSalaryDeductionMaster CCMS_SALARY_DEDUCTION_MASTER = new CcmsSalaryDeductionMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CcmsSalaryDeductionMasterRecord> getRecordType() {
        return CcmsSalaryDeductionMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.name</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.basic</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, Double> BASIC = createField(DSL.name("basic"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.hra</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, Double> HRA = createField(DSL.name("hra"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.allowance</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, Double> ALLOWANCE = createField(DSL.name("allowance"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.esi</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, Double> ESI = createField(DSL.name("esi"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.pf</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, Double> PF = createField(DSL.name("pf"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.er_esi</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, Double> ER_ESI = createField(DSL.name("er_esi"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.er_pf</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, Double> ER_PF = createField(DSL.name("er_pf"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.status</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.created_by</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.created_on</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.last_modified_on</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, LocalDateTime> LAST_MODIFIED_ON = createField(DSL.name("last_modified_on"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.last_modified_by</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, String> LAST_MODIFIED_BY = createField(DSL.name("last_modified_by"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ccms_salary_deduction_master.effective_from</code>.
     */
    public final TableField<CcmsSalaryDeductionMasterRecord, String> EFFECTIVE_FROM = createField(DSL.name("effective_from"), SQLDataType.VARCHAR(45), this, "");

    private CcmsSalaryDeductionMaster(Name alias, Table<CcmsSalaryDeductionMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private CcmsSalaryDeductionMaster(Name alias, Table<CcmsSalaryDeductionMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_salary_deduction_master</code> table reference
     */
    public CcmsSalaryDeductionMaster(String alias) {
        this(DSL.name(alias), CCMS_SALARY_DEDUCTION_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ccms_salary_deduction_master</code> table reference
     */
    public CcmsSalaryDeductionMaster(Name alias) {
        this(alias, CCMS_SALARY_DEDUCTION_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.ccms_salary_deduction_master</code> table reference
     */
    public CcmsSalaryDeductionMaster() {
        this(DSL.name("ccms_salary_deduction_master"), null);
    }

    public <O extends Record> CcmsSalaryDeductionMaster(Table<O> child, ForeignKey<O, CcmsSalaryDeductionMasterRecord> key) {
        super(child, key, CCMS_SALARY_DEDUCTION_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<CcmsSalaryDeductionMasterRecord> getPrimaryKey() {
        return Keys.KEY_CCMS_SALARY_DEDUCTION_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CcmsSalaryDeductionMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<CcmsSalaryDeductionMasterRecord>>asList(Keys.KEY_CCMS_SALARY_DEDUCTION_MASTER_PRIMARY);
    }

    @Override
    public CcmsSalaryDeductionMaster as(String alias) {
        return new CcmsSalaryDeductionMaster(DSL.name(alias), this);
    }

    @Override
    public CcmsSalaryDeductionMaster as(Name alias) {
        return new CcmsSalaryDeductionMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsSalaryDeductionMaster rename(String name) {
        return new CcmsSalaryDeductionMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CcmsSalaryDeductionMaster rename(Name name) {
        return new CcmsSalaryDeductionMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, Double, Double, Double, Double, Double, Double, Double, String, String, LocalDateTime, LocalDateTime, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}