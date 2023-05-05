/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.BillTypeMasterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class BillTypeMaster extends TableImpl<BillTypeMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.bill_type_master</code>
     */
    public static final BillTypeMaster BILL_TYPE_MASTER = new BillTypeMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BillTypeMasterRecord> getRecordType() {
        return BillTypeMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.bill_type_master.BILL_TYPE_ID</code>.
     */
    public final TableField<BillTypeMasterRecord, Integer> BILL_TYPE_ID = createField(DSL.name("BILL_TYPE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.bill_type_master.BILL_NAME</code>.
     */
    public final TableField<BillTypeMasterRecord, String> BILL_NAME = createField(DSL.name("BILL_NAME"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.bill_type_master.BILL_VALUE</code>.
     */
    public final TableField<BillTypeMasterRecord, String> BILL_VALUE = createField(DSL.name("BILL_VALUE"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.bill_type_master.STATUS</code>.
     */
    public final TableField<BillTypeMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    private BillTypeMaster(Name alias, Table<BillTypeMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private BillTypeMaster(Name alias, Table<BillTypeMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.bill_type_master</code> table reference
     */
    public BillTypeMaster(String alias) {
        this(DSL.name(alias), BILL_TYPE_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.bill_type_master</code> table reference
     */
    public BillTypeMaster(Name alias) {
        this(alias, BILL_TYPE_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.bill_type_master</code> table reference
     */
    public BillTypeMaster() {
        this(DSL.name("bill_type_master"), null);
    }

    public <O extends Record> BillTypeMaster(Table<O> child, ForeignKey<O, BillTypeMasterRecord> key) {
        super(child, key, BILL_TYPE_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<BillTypeMasterRecord> getPrimaryKey() {
        return Keys.KEY_BILL_TYPE_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<BillTypeMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<BillTypeMasterRecord>>asList(Keys.KEY_BILL_TYPE_MASTER_PRIMARY);
    }

    @Override
    public BillTypeMaster as(String alias) {
        return new BillTypeMaster(DSL.name(alias), this);
    }

    @Override
    public BillTypeMaster as(Name alias) {
        return new BillTypeMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BillTypeMaster rename(String name) {
        return new BillTypeMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BillTypeMaster rename(Name name) {
        return new BillTypeMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}