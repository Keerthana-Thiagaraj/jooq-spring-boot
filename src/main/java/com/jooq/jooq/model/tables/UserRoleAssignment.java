/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.UserRoleAssignmentRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class UserRoleAssignment extends TableImpl<UserRoleAssignmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.user_role_assignment</code>
     */
    public static final UserRoleAssignment USER_ROLE_ASSIGNMENT = new UserRoleAssignment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleAssignmentRecord> getRecordType() {
        return UserRoleAssignmentRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.COMP_CODE</code>.
     */
    public final TableField<UserRoleAssignmentRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.USER_ID</code>.
     */
    public final TableField<UserRoleAssignmentRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.USER_TYPE_ID</code>.
     */
    public final TableField<UserRoleAssignmentRecord, Integer> USER_TYPE_ID = createField(DSL.name("USER_TYPE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.ROLE_ID</code>.
     */
    public final TableField<UserRoleAssignmentRecord, Integer> ROLE_ID = createField(DSL.name("ROLE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.STATUS</code>.
     */
    public final TableField<UserRoleAssignmentRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.CREATED_BY</code>.
     */
    public final TableField<UserRoleAssignmentRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.CREATED_ON</code>.
     */
    public final TableField<UserRoleAssignmentRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.LAST_CHANGED_BY</code>.
     */
    public final TableField<UserRoleAssignmentRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.user_role_assignment.LAST_CHANGED_ON</code>.
     */
    public final TableField<UserRoleAssignmentRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private UserRoleAssignment(Name alias, Table<UserRoleAssignmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRoleAssignment(Name alias, Table<UserRoleAssignmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.user_role_assignment</code> table reference
     */
    public UserRoleAssignment(String alias) {
        this(DSL.name(alias), USER_ROLE_ASSIGNMENT);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.user_role_assignment</code> table reference
     */
    public UserRoleAssignment(Name alias) {
        this(alias, USER_ROLE_ASSIGNMENT);
    }

    /**
     * Create a <code>vendor_portal_pbx.user_role_assignment</code> table reference
     */
    public UserRoleAssignment() {
        this(DSL.name("user_role_assignment"), null);
    }

    public <O extends Record> UserRoleAssignment(Table<O> child, ForeignKey<O, UserRoleAssignmentRecord> key) {
        super(child, key, USER_ROLE_ASSIGNMENT);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<UserRoleAssignmentRecord> getPrimaryKey() {
        return Keys.KEY_USER_ROLE_ASSIGNMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserRoleAssignmentRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRoleAssignmentRecord>>asList(Keys.KEY_USER_ROLE_ASSIGNMENT_PRIMARY);
    }

    @Override
    public UserRoleAssignment as(String alias) {
        return new UserRoleAssignment(DSL.name(alias), this);
    }

    @Override
    public UserRoleAssignment as(Name alias) {
        return new UserRoleAssignment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoleAssignment rename(String name) {
        return new UserRoleAssignment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoleAssignment rename(Name name) {
        return new UserRoleAssignment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, Integer, Integer, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
