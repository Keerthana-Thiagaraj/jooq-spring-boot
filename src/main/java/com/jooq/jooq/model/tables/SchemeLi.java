/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.SchemeLiRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class SchemeLi extends TableImpl<SchemeLiRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.scheme_li</code>
     */
    public static final SchemeLi SCHEME_LI = new SchemeLi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemeLiRecord> getRecordType() {
        return SchemeLiRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.scheme_li.ITEM_NO</code>.
     */
    public final TableField<SchemeLiRecord, Integer> ITEM_NO = createField(DSL.name("ITEM_NO"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.COMP_CODE</code>.
     */
    public final TableField<SchemeLiRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.DEPARTMENT_ID</code>.
     */
    public final TableField<SchemeLiRecord, Integer> DEPARTMENT_ID = createField(DSL.name("DEPARTMENT_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.DEPARTMENT_VISIBLE_ID</code>.
     */
    public final TableField<SchemeLiRecord, Integer> DEPARTMENT_VISIBLE_ID = createField(DSL.name("DEPARTMENT_VISIBLE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.FROM_DATE</code>.
     */
    public final TableField<SchemeLiRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.TO_DATE</code>.
     */
    public final TableField<SchemeLiRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.STATUS</code>.
     */
    public final TableField<SchemeLiRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.CREATED_BY</code>.
     */
    public final TableField<SchemeLiRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.CREATED_ON</code>.
     */
    public final TableField<SchemeLiRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.LAST_CHANGED_BY</code>.
     */
    public final TableField<SchemeLiRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.scheme_li.LAST_CHANGED_ON</code>.
     */
    public final TableField<SchemeLiRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private SchemeLi(Name alias, Table<SchemeLiRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemeLi(Name alias, Table<SchemeLiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.scheme_li</code> table reference
     */
    public SchemeLi(String alias) {
        this(DSL.name(alias), SCHEME_LI);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.scheme_li</code> table reference
     */
    public SchemeLi(Name alias) {
        this(alias, SCHEME_LI);
    }

    /**
     * Create a <code>vendor_portal_pbx.scheme_li</code> table reference
     */
    public SchemeLi() {
        this(DSL.name("scheme_li"), null);
    }

    public <O extends Record> SchemeLi(Table<O> child, ForeignKey<O, SchemeLiRecord> key) {
        super(child, key, SCHEME_LI);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<SchemeLiRecord> getPrimaryKey() {
        return Keys.KEY_SCHEME_LI_PRIMARY;
    }

    @Override
    public List<UniqueKey<SchemeLiRecord>> getKeys() {
        return Arrays.<UniqueKey<SchemeLiRecord>>asList(Keys.KEY_SCHEME_LI_PRIMARY);
    }

    @Override
    public SchemeLi as(String alias) {
        return new SchemeLi(DSL.name(alias), this);
    }

    @Override
    public SchemeLi as(Name alias) {
        return new SchemeLi(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemeLi rename(String name) {
        return new SchemeLi(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemeLi rename(Name name) {
        return new SchemeLi(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, Integer, Integer, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
