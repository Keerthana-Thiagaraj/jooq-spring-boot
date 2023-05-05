/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.IbacoMaterialRecord;

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
public class IbacoMaterial extends TableImpl<IbacoMaterialRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.ibaco_material</code>
     */
    public static final IbacoMaterial IBACO_MATERIAL = new IbacoMaterial();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IbacoMaterialRecord> getRecordType() {
        return IbacoMaterialRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.ibaco_material.SERIAL_NO</code>.
     */
    public final TableField<IbacoMaterialRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ibaco_material.MATERIAL_CODE</code>.
     */
    public final TableField<IbacoMaterialRecord, String> MATERIAL_CODE = createField(DSL.name("MATERIAL_CODE"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.ibaco_material.MATERIAL_DESCRIPTION</code>.
     */
    public final TableField<IbacoMaterialRecord, String> MATERIAL_DESCRIPTION = createField(DSL.name("MATERIAL_DESCRIPTION"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.ibaco_material.UOM</code>.
     */
    public final TableField<IbacoMaterialRecord, String> UOM = createField(DSL.name("UOM"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ibaco_material.CREATED_BY</code>.
     */
    public final TableField<IbacoMaterialRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.ibaco_material.CREATED_ON</code>.
     */
    public final TableField<IbacoMaterialRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.ibaco_material.STATUS</code>.
     */
    public final TableField<IbacoMaterialRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(45), this, "");

    private IbacoMaterial(Name alias, Table<IbacoMaterialRecord> aliased) {
        this(alias, aliased, null);
    }

    private IbacoMaterial(Name alias, Table<IbacoMaterialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ibaco_material</code> table reference
     */
    public IbacoMaterial(String alias) {
        this(DSL.name(alias), IBACO_MATERIAL);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.ibaco_material</code> table reference
     */
    public IbacoMaterial(Name alias) {
        this(alias, IBACO_MATERIAL);
    }

    /**
     * Create a <code>vendor_portal_pbx.ibaco_material</code> table reference
     */
    public IbacoMaterial() {
        this(DSL.name("ibaco_material"), null);
    }

    public <O extends Record> IbacoMaterial(Table<O> child, ForeignKey<O, IbacoMaterialRecord> key) {
        super(child, key, IBACO_MATERIAL);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<IbacoMaterialRecord> getPrimaryKey() {
        return Keys.KEY_IBACO_MATERIAL_PRIMARY;
    }

    @Override
    public List<UniqueKey<IbacoMaterialRecord>> getKeys() {
        return Arrays.<UniqueKey<IbacoMaterialRecord>>asList(Keys.KEY_IBACO_MATERIAL_PRIMARY);
    }

    @Override
    public IbacoMaterial as(String alias) {
        return new IbacoMaterial(DSL.name(alias), this);
    }

    @Override
    public IbacoMaterial as(Name alias) {
        return new IbacoMaterial(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IbacoMaterial rename(String name) {
        return new IbacoMaterial(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IbacoMaterial rename(Name name) {
        return new IbacoMaterial(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}