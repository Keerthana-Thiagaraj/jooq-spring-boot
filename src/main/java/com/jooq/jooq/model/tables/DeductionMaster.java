/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.DeductionMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class DeductionMaster extends TableImpl<DeductionMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.deduction_master</code>
     */
    public static final DeductionMaster DEDUCTION_MASTER = new DeductionMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeductionMasterRecord> getRecordType() {
        return DeductionMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.deduction_master.DEDUCTION_CODE</code>.
     */
    public final TableField<DeductionMasterRecord, String> DEDUCTION_CODE = createField(DSL.name("DEDUCTION_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.deduction_master.DEDUCTION_DESC</code>.
     */
    public final TableField<DeductionMasterRecord, String> DEDUCTION_DESC = createField(DSL.name("DEDUCTION_DESC"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.deduction_master.STATUS</code>.
     */
    public final TableField<DeductionMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.deduction_master.CREATED_BY</code>.
     */
    public final TableField<DeductionMasterRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.deduction_master.CREATED_ON</code>.
     */
    public final TableField<DeductionMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.deduction_master.LAST_CHANGED_BY</code>.
     */
    public final TableField<DeductionMasterRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.deduction_master.LAST_CHANGED_ON</code>.
     */
    public final TableField<DeductionMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private DeductionMaster(Name alias, Table<DeductionMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeductionMaster(Name alias, Table<DeductionMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.deduction_master</code> table reference
     */
    public DeductionMaster(String alias) {
        this(DSL.name(alias), DEDUCTION_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.deduction_master</code> table reference
     */
    public DeductionMaster(Name alias) {
        this(alias, DEDUCTION_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.deduction_master</code> table reference
     */
    public DeductionMaster() {
        this(DSL.name("deduction_master"), null);
    }

    public <O extends Record> DeductionMaster(Table<O> child, ForeignKey<O, DeductionMasterRecord> key) {
        super(child, key, DEDUCTION_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<DeductionMasterRecord> getPrimaryKey() {
        return Keys.KEY_DEDUCTION_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<DeductionMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<DeductionMasterRecord>>asList(Keys.KEY_DEDUCTION_MASTER_PRIMARY);
    }

    @Override
    public DeductionMaster as(String alias) {
        return new DeductionMaster(DSL.name(alias), this);
    }

    @Override
    public DeductionMaster as(Name alias) {
        return new DeductionMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeductionMaster rename(String name) {
        return new DeductionMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeductionMaster rename(Name name) {
        return new DeductionMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}