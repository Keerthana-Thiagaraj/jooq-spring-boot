/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.CustomerSfCategoryRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class CustomerSfCategory extends TableImpl<CustomerSfCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.customer_sf_category</code>
     */
    public static final CustomerSfCategory CUSTOMER_SF_CATEGORY = new CustomerSfCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerSfCategoryRecord> getRecordType() {
        return CustomerSfCategoryRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.customer_sf_category.ID</code>.
     */
    public final TableField<CustomerSfCategoryRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_sf_category.PROD_CAT_NAME</code>.
     */
    public final TableField<CustomerSfCategoryRecord, String> PROD_CAT_NAME = createField(DSL.name("PROD_CAT_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_sf_category.TYPE</code>.
     */
    public final TableField<CustomerSfCategoryRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_sf_category.PRODUCT</code>.
     */
    public final TableField<CustomerSfCategoryRecord, String> PRODUCT = createField(DSL.name("PRODUCT"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.customer_sf_category.STATUS</code>.
     */
    public final TableField<CustomerSfCategoryRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    private CustomerSfCategory(Name alias, Table<CustomerSfCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerSfCategory(Name alias, Table<CustomerSfCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_sf_category</code> table reference
     */
    public CustomerSfCategory(String alias) {
        this(DSL.name(alias), CUSTOMER_SF_CATEGORY);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.customer_sf_category</code> table reference
     */
    public CustomerSfCategory(Name alias) {
        this(alias, CUSTOMER_SF_CATEGORY);
    }

    /**
     * Create a <code>vendor_portal_pbx.customer_sf_category</code> table reference
     */
    public CustomerSfCategory() {
        this(DSL.name("customer_sf_category"), null);
    }

    public <O extends Record> CustomerSfCategory(Table<O> child, ForeignKey<O, CustomerSfCategoryRecord> key) {
        super(child, key, CUSTOMER_SF_CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public Identity<CustomerSfCategoryRecord, Integer> getIdentity() {
        return (Identity<CustomerSfCategoryRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CustomerSfCategoryRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_SF_CATEGORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<CustomerSfCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerSfCategoryRecord>>asList(Keys.KEY_CUSTOMER_SF_CATEGORY_PRIMARY);
    }

    @Override
    public CustomerSfCategory as(String alias) {
        return new CustomerSfCategory(DSL.name(alias), this);
    }

    @Override
    public CustomerSfCategory as(Name alias) {
        return new CustomerSfCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerSfCategory rename(String name) {
        return new CustomerSfCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerSfCategory rename(Name name) {
        return new CustomerSfCategory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}