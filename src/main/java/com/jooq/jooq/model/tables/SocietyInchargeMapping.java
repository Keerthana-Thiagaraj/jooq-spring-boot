/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.SocietyInchargeMappingRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class SocietyInchargeMapping extends TableImpl<SocietyInchargeMappingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.society_incharge_mapping</code>
     */
    public static final SocietyInchargeMapping SOCIETY_INCHARGE_MAPPING = new SocietyInchargeMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SocietyInchargeMappingRecord> getRecordType() {
        return SocietyInchargeMappingRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.COMP_CODE</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.SOCIETY</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> SOCIETY = createField(DSL.name("SOCIETY"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.EKORG</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> EKORG = createField(DSL.name("EKORG"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.PARVW</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> PARVW = createField(DSL.name("PARVW"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.INCHARGE</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> INCHARGE = createField(DSL.name("INCHARGE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.STATUS</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.CREATED_BY</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.CREATED_ON</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.LAST_CHANGED_BY</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.LAST_CHANGED_ON</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.CENTER_TYPE</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> CENTER_TYPE = createField(DSL.name("CENTER_TYPE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.society_incharge_mapping.CENTER_TYPE_NAME</code>.
     */
    public final TableField<SocietyInchargeMappingRecord, String> CENTER_TYPE_NAME = createField(DSL.name("CENTER_TYPE_NAME"), SQLDataType.VARCHAR(45), this, "");

    private SocietyInchargeMapping(Name alias, Table<SocietyInchargeMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private SocietyInchargeMapping(Name alias, Table<SocietyInchargeMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.society_incharge_mapping</code> table reference
     */
    public SocietyInchargeMapping(String alias) {
        this(DSL.name(alias), SOCIETY_INCHARGE_MAPPING);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.society_incharge_mapping</code> table reference
     */
    public SocietyInchargeMapping(Name alias) {
        this(alias, SOCIETY_INCHARGE_MAPPING);
    }

    /**
     * Create a <code>vendor_portal_pbx.society_incharge_mapping</code> table reference
     */
    public SocietyInchargeMapping() {
        this(DSL.name("society_incharge_mapping"), null);
    }

    public <O extends Record> SocietyInchargeMapping(Table<O> child, ForeignKey<O, SocietyInchargeMappingRecord> key) {
        super(child, key, SOCIETY_INCHARGE_MAPPING);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<SocietyInchargeMappingRecord> getPrimaryKey() {
        return Keys.KEY_SOCIETY_INCHARGE_MAPPING_PRIMARY;
    }

    @Override
    public List<UniqueKey<SocietyInchargeMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<SocietyInchargeMappingRecord>>asList(Keys.KEY_SOCIETY_INCHARGE_MAPPING_PRIMARY);
    }

    @Override
    public SocietyInchargeMapping as(String alias) {
        return new SocietyInchargeMapping(DSL.name(alias), this);
    }

    @Override
    public SocietyInchargeMapping as(Name alias) {
        return new SocietyInchargeMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SocietyInchargeMapping rename(String name) {
        return new SocietyInchargeMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SocietyInchargeMapping rename(Name name) {
        return new SocietyInchargeMapping(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}