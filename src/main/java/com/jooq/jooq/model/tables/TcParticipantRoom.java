/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcParticipantRoomRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class TcParticipantRoom extends TableImpl<TcParticipantRoomRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM</code>
     */
    public static final TcParticipantRoom TC_PARTICIPANT_ROOM = new TcParticipantRoom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcParticipantRoomRecord> getRecordType() {
        return TcParticipantRoomRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LINE_ID</code>.
     */
    public final TableField<TcParticipantRoomRecord, Integer> LINE_ID = createField(DSL.name("LINE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.REQUEST_ID</code>.
     */
    public final TableField<TcParticipantRoomRecord, String> REQUEST_ID = createField(DSL.name("REQUEST_ID"), SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.ROOM_CODE</code>.
     */
    public final TableField<TcParticipantRoomRecord, Integer> ROOM_CODE = createField(DSL.name("ROOM_CODE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.BED_CODE</code>.
     */
    public final TableField<TcParticipantRoomRecord, String> BED_CODE = createField(DSL.name("BED_CODE"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.FROM_DATE</code>.
     */
    public final TableField<TcParticipantRoomRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.TO_DATE</code>.
     */
    public final TableField<TcParticipantRoomRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.CREATED_BY</code>.
     */
    public final TableField<TcParticipantRoomRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.CREATED_ON</code>.
     */
    public final TableField<TcParticipantRoomRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LAST_CHANGED_BY</code>.
     */
    public final TableField<TcParticipantRoomRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM.LAST_CHANGED_ON</code>.
     */
    public final TableField<TcParticipantRoomRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private TcParticipantRoom(Name alias, Table<TcParticipantRoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcParticipantRoom(Name alias, Table<TcParticipantRoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM</code> table reference
     */
    public TcParticipantRoom(String alias) {
        this(DSL.name(alias), TC_PARTICIPANT_ROOM);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM</code> table reference
     */
    public TcParticipantRoom(Name alias) {
        this(alias, TC_PARTICIPANT_ROOM);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_PARTICIPANT_ROOM</code> table reference
     */
    public TcParticipantRoom() {
        this(DSL.name("TC_PARTICIPANT_ROOM"), null);
    }

    public <O extends Record> TcParticipantRoom(Table<O> child, ForeignKey<O, TcParticipantRoomRecord> key) {
        super(child, key, TC_PARTICIPANT_ROOM);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<TcParticipantRoomRecord> getPrimaryKey() {
        return Keys.KEY_TC_PARTICIPANT_ROOM_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcParticipantRoomRecord>> getKeys() {
        return Arrays.<UniqueKey<TcParticipantRoomRecord>>asList(Keys.KEY_TC_PARTICIPANT_ROOM_PRIMARY);
    }

    @Override
    public TcParticipantRoom as(String alias) {
        return new TcParticipantRoom(DSL.name(alias), this);
    }

    @Override
    public TcParticipantRoom as(Name alias) {
        return new TcParticipantRoom(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcParticipantRoom rename(String name) {
        return new TcParticipantRoom(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcParticipantRoom rename(Name name) {
        return new TcParticipantRoom(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, Integer, String, LocalDate, LocalDate, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}