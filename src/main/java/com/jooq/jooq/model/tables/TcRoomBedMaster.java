/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcRoomBedMasterRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class TcRoomBedMaster extends TableImpl<TcRoomBedMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_ROOM_BED_MASTER</code>
     */
    public static final TcRoomBedMaster TC_ROOM_BED_MASTER = new TcRoomBedMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcRoomBedMasterRecord> getRecordType() {
        return TcRoomBedMasterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.ROOM_CODE</code>.
     */
    public final TableField<TcRoomBedMasterRecord, Integer> ROOM_CODE = createField(DSL.name("ROOM_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.FLOOR_CODE</code>.
     */
    public final TableField<TcRoomBedMasterRecord, Integer> FLOOR_CODE = createField(DSL.name("FLOOR_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.BUILDING_CODE</code>.
     */
    public final TableField<TcRoomBedMasterRecord, Integer> BUILDING_CODE = createField(DSL.name("BUILDING_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.FROM_DATE</code>.
     */
    public final TableField<TcRoomBedMasterRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.BED_CODE</code>.
     */
    public final TableField<TcRoomBedMasterRecord, String> BED_CODE = createField(DSL.name("BED_CODE"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.TO_DATE</code>.
     */
    public final TableField<TcRoomBedMasterRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.STATUS</code>.
     */
    public final TableField<TcRoomBedMasterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.CREATED_BY</code>.
     */
    public final TableField<TcRoomBedMasterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.CREATED_ON</code>.
     */
    public final TableField<TcRoomBedMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.LAST_CHANGED_BY</code>.
     */
    public final TableField<TcRoomBedMasterRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_ROOM_BED_MASTER.LAST_CHANGED_ON</code>.
     */
    public final TableField<TcRoomBedMasterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private TcRoomBedMaster(Name alias, Table<TcRoomBedMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcRoomBedMaster(Name alias, Table<TcRoomBedMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_ROOM_BED_MASTER</code> table reference
     */
    public TcRoomBedMaster(String alias) {
        this(DSL.name(alias), TC_ROOM_BED_MASTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_ROOM_BED_MASTER</code> table reference
     */
    public TcRoomBedMaster(Name alias) {
        this(alias, TC_ROOM_BED_MASTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_ROOM_BED_MASTER</code> table reference
     */
    public TcRoomBedMaster() {
        this(DSL.name("TC_ROOM_BED_MASTER"), null);
    }

    public <O extends Record> TcRoomBedMaster(Table<O> child, ForeignKey<O, TcRoomBedMasterRecord> key) {
        super(child, key, TC_ROOM_BED_MASTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TC_ROOM_BED_MASTER_FK_ROOM_CODE_BED_IDX);
    }

    @Override
    public UniqueKey<TcRoomBedMasterRecord> getPrimaryKey() {
        return Keys.KEY_TC_ROOM_BED_MASTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcRoomBedMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<TcRoomBedMasterRecord>>asList(Keys.KEY_TC_ROOM_BED_MASTER_PRIMARY);
    }

    @Override
    public List<ForeignKey<TcRoomBedMasterRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TcRoomBedMasterRecord, ?>>asList(Keys.FK_ROOM_BED_MASTER_RM);
    }

    private transient TcRoomMaster _tcRoomMaster;

    public TcRoomMaster tcRoomMaster() {
        if (_tcRoomMaster == null)
            _tcRoomMaster = new TcRoomMaster(this, Keys.FK_ROOM_BED_MASTER_RM);

        return _tcRoomMaster;
    }

    @Override
    public TcRoomBedMaster as(String alias) {
        return new TcRoomBedMaster(DSL.name(alias), this);
    }

    @Override
    public TcRoomBedMaster as(Name alias) {
        return new TcRoomBedMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcRoomBedMaster rename(String name) {
        return new TcRoomBedMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcRoomBedMaster rename(Name name) {
        return new TcRoomBedMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, Integer, LocalDate, String, LocalDate, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}