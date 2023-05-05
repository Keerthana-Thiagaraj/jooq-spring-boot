/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcGiftMasterRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class TcGiftMaster extends TableImpl<TcGiftMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_GIFT_MASTER</code>
     */
    public static final TcGiftMaster TC_GIFT_MASTER = new TcGiftMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcGiftMasterRecord> getRecordType() {
        return TcGiftMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.ITEM_CODE</code>.
     */
    public final TableField<TcGiftMasterRecord, Integer> ITEM_CODE = createField(DSL.name("ITEM_CODE"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.ITEM_NAME</code>.
     */
    public final TableField<TcGiftMasterRecord, String> ITEM_NAME = createField(DSL.name("ITEM_NAME"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.FROM_DATE</code>.
     */
    public final TableField<TcGiftMasterRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.TO_DATE</code>.
     */
    public final TableField<TcGiftMasterRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.DEPT_CODE</code>.
     */
    public final TableField<TcGiftMasterRecord, Integer> DEPT_CODE = createField(DSL.name("DEPT_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.STATUS</code>.
     */
    public final TableField<TcGiftMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.CREATED_BY</code>.
     */
    public final TableField<TcGiftMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.CREATED_ON</code>.
     */
    public final TableField<TcGiftMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.LAST_CHANGED_BY</code>.
     */
    public final TableField<TcGiftMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_GIFT_MASTER.LAST_CHANGED_ON</code>.
     */
    public final TableField<TcGiftMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private TcGiftMaster(Name alias, Table<TcGiftMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcGiftMaster(Name alias, Table<TcGiftMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_GIFT_MASTER</code> table reference
     */
    public TcGiftMaster(String alias) {
        this(DSL.name(alias), TC_GIFT_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_GIFT_MASTER</code> table reference
     */
    public TcGiftMaster(Name alias) {
        this(alias, TC_GIFT_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_GIFT_MASTER</code> table reference
     */
    public TcGiftMaster() {
        this(DSL.name("TC_GIFT_MASTER"), null);
    }

    public <O extends Record> TcGiftMaster(Table<O> child, ForeignKey<O, TcGiftMasterRecord> key) {
        super(child, key, TC_GIFT_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public Identity<TcGiftMasterRecord, Integer> getIdentity() {
        return (Identity<TcGiftMasterRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TcGiftMasterRecord> getPrimaryKey() {
        return Keys.KEY_TC_GIFT_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcGiftMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<TcGiftMasterRecord>>asList(Keys.KEY_TC_GIFT_MASTER_PRIMARY);
    }

    @Override
    public TcGiftMaster as(String alias) {
        return new TcGiftMaster(DSL.name(alias), this);
    }

    @Override
    public TcGiftMaster as(Name alias) {
        return new TcGiftMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcGiftMaster rename(String name) {
        return new TcGiftMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcGiftMaster rename(Name name) {
        return new TcGiftMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, LocalDate, LocalDate, Integer, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
