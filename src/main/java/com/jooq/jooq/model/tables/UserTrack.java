/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.UserTrackRecord;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class UserTrack extends TableImpl<UserTrackRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.user_track</code>
     */
    public static final UserTrack USER_TRACK = new UserTrack();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserTrackRecord> getRecordType() {
        return UserTrackRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.user_track.SESSION_ID</code>.
     */
    public final TableField<UserTrackRecord, String> SESSION_ID = createField(DSL.name("SESSION_ID"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.USER_ID</code>.
     */
    public final TableField<UserTrackRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.USER_NAME</code>.
     */
    public final TableField<UserTrackRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.USER_TYPE_ID</code>.
     */
    public final TableField<UserTrackRecord, Integer> USER_TYPE_ID = createField(DSL.name("USER_TYPE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.LOGIN_IP</code>.
     */
    public final TableField<UserTrackRecord, String> LOGIN_IP = createField(DSL.name("LOGIN_IP"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.SERVER_IP</code>.
     */
    public final TableField<UserTrackRecord, String> SERVER_IP = createField(DSL.name("SERVER_IP"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.LOGIN_DATE</code>.
     */
    public final TableField<UserTrackRecord, LocalDate> LOGIN_DATE = createField(DSL.name("LOGIN_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.LOGIN_TIME</code>.
     */
    public final TableField<UserTrackRecord, LocalTime> LOGIN_TIME = createField(DSL.name("LOGIN_TIME"), SQLDataType.LOCALTIME, this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.LOGGED_DATE</code>.
     */
    public final TableField<UserTrackRecord, LocalDate> LOGGED_DATE = createField(DSL.name("LOGGED_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.LOGGED_TIME</code>.
     */
    public final TableField<UserTrackRecord, LocalTime> LOGGED_TIME = createField(DSL.name("LOGGED_TIME"), SQLDataType.LOCALTIME, this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.USER_FLAG</code>.
     */
    public final TableField<UserTrackRecord, String> USER_FLAG = createField(DSL.name("USER_FLAG"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.ACC_GRP_CODE</code>.
     */
    public final TableField<UserTrackRecord, String> ACC_GRP_CODE = createField(DSL.name("ACC_GRP_CODE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.user_track.USER_GRP_CODE</code>.
     */
    public final TableField<UserTrackRecord, String> USER_GRP_CODE = createField(DSL.name("USER_GRP_CODE"), SQLDataType.VARCHAR(150), this, "");

    private UserTrack(Name alias, Table<UserTrackRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserTrack(Name alias, Table<UserTrackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.user_track</code> table reference
     */
    public UserTrack(String alias) {
        this(DSL.name(alias), USER_TRACK);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.user_track</code> table reference
     */
    public UserTrack(Name alias) {
        this(alias, USER_TRACK);
    }

    /**
     * Create a <code>vendor_portal_pbx.user_track</code> table reference
     */
    public UserTrack() {
        this(DSL.name("user_track"), null);
    }

    public <O extends Record> UserTrack(Table<O> child, ForeignKey<O, UserTrackRecord> key) {
        super(child, key, USER_TRACK);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<UserTrackRecord> getPrimaryKey() {
        return Keys.KEY_USER_TRACK_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserTrackRecord>> getKeys() {
        return Arrays.<UniqueKey<UserTrackRecord>>asList(Keys.KEY_USER_TRACK_PRIMARY);
    }

    @Override
    public UserTrack as(String alias) {
        return new UserTrack(DSL.name(alias), this);
    }

    @Override
    public UserTrack as(Name alias) {
        return new UserTrack(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTrack rename(String name) {
        return new UserTrack(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTrack rename(Name name) {
        return new UserTrack(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, Integer, String, String, LocalDate, LocalTime, LocalDate, LocalTime, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}