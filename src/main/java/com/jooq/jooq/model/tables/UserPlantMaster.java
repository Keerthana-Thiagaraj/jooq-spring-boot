/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.UserPlantMasterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class UserPlantMaster extends TableImpl<UserPlantMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.user_plant_master</code>
     */
    public static final UserPlantMaster USER_PLANT_MASTER = new UserPlantMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserPlantMasterRecord> getRecordType() {
        return UserPlantMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.user_plant_master.COMP_CODE</code>.
     */
    public final TableField<UserPlantMasterRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_plant_master.USER_ID</code>.
     */
    public final TableField<UserPlantMasterRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_plant_master.USER_ACC_GRP</code>.
     */
    public final TableField<UserPlantMasterRecord, String> USER_ACC_GRP = createField(DSL.name("USER_ACC_GRP"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_plant_master.PLANT</code>.
     */
    public final TableField<UserPlantMasterRecord, String> PLANT = createField(DSL.name("PLANT"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_plant_master.STATUS</code>.
     */
    public final TableField<UserPlantMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    private UserPlantMaster(Name alias, Table<UserPlantMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserPlantMaster(Name alias, Table<UserPlantMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.user_plant_master</code> table reference
     */
    public UserPlantMaster(String alias) {
        this(DSL.name(alias), USER_PLANT_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.user_plant_master</code> table reference
     */
    public UserPlantMaster(Name alias) {
        this(alias, USER_PLANT_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.user_plant_master</code> table reference
     */
    public UserPlantMaster() {
        this(DSL.name("user_plant_master"), null);
    }

    public <O extends Record> UserPlantMaster(Table<O> child, ForeignKey<O, UserPlantMasterRecord> key) {
        super(child, key, USER_PLANT_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<UserPlantMasterRecord> getPrimaryKey() {
        return Keys.KEY_USER_PLANT_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserPlantMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<UserPlantMasterRecord>>asList(Keys.KEY_USER_PLANT_MASTER_PRIMARY);
    }

    @Override
    public UserPlantMaster as(String alias) {
        return new UserPlantMaster(DSL.name(alias), this);
    }

    @Override
    public UserPlantMaster as(Name alias) {
        return new UserPlantMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPlantMaster rename(String name) {
        return new UserPlantMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPlantMaster rename(Name name) {
        return new UserPlantMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}