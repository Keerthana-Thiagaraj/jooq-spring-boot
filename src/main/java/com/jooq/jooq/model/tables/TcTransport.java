/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.TcTransportRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class TcTransport extends TableImpl<TcTransportRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.TC_TRANSPORT</code>
     */
    public static final TcTransport TC_TRANSPORT = new TcTransport();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TcTransportRecord> getRecordType() {
        return TcTransportRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.REQUEST_ID</code>.
     */
    public final TableField<TcTransportRecord, String> REQUEST_ID = createField(DSL.name("REQUEST_ID"), SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.TRANSPORTER_CODE</code>.
     */
    public final TableField<TcTransportRecord, Integer> TRANSPORTER_CODE = createField(DSL.name("TRANSPORTER_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.TRAVEL_TYPE</code>.
     */
    public final TableField<TcTransportRecord, String> TRAVEL_TYPE = createField(DSL.name("TRAVEL_TYPE"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.ROUTE_CODE</code>.
     */
    public final TableField<TcTransportRecord, Integer> ROUTE_CODE = createField(DSL.name("ROUTE_CODE"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.PLANT_CODE</code>.
     */
    public final TableField<TcTransportRecord, String> PLANT_CODE = createField(DSL.name("PLANT_CODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.VEHICLE_REG_NO</code>.
     */
    public final TableField<TcTransportRecord, String> VEHICLE_REG_NO = createField(DSL.name("VEHICLE_REG_NO"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.FROM_DATE</code>.
     */
    public final TableField<TcTransportRecord, LocalDate> FROM_DATE = createField(DSL.name("FROM_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.TO_DATE</code>.
     */
    public final TableField<TcTransportRecord, LocalDate> TO_DATE = createField(DSL.name("TO_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.PICKUP_START_TIME</code>.
     */
    public final TableField<TcTransportRecord, LocalTime> PICKUP_START_TIME = createField(DSL.name("PICKUP_START_TIME"), SQLDataType.LOCALTIME, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.PICKUP_END_TIME</code>.
     */
    public final TableField<TcTransportRecord, LocalTime> PICKUP_END_TIME = createField(DSL.name("PICKUP_END_TIME"), SQLDataType.LOCALTIME, this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.CREATED_BY</code>.
     */
    public final TableField<TcTransportRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.CREATED_ON</code>.
     */
    public final TableField<TcTransportRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.LAST_CHANGED_BY</code>.
     */
    public final TableField<TcTransportRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.TC_TRANSPORT.LAST_CHANGED_ON</code>.
     */
    public final TableField<TcTransportRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    private TcTransport(Name alias, Table<TcTransportRecord> aliased) {
        this(alias, aliased, null);
    }

    private TcTransport(Name alias, Table<TcTransportRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_TRANSPORT</code> table reference
     */
    public TcTransport(String alias) {
        this(DSL.name(alias), TC_TRANSPORT);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.TC_TRANSPORT</code> table reference
     */
    public TcTransport(Name alias) {
        this(alias, TC_TRANSPORT);
    }

    /**
     * Create a <code>vendor_portal_pbx.TC_TRANSPORT</code> table reference
     */
    public TcTransport() {
        this(DSL.name("TC_TRANSPORT"), null);
    }

    public <O extends Record> TcTransport(Table<O> child, ForeignKey<O, TcTransportRecord> key) {
        super(child, key, TC_TRANSPORT);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<TcTransportRecord> getPrimaryKey() {
        return Keys.KEY_TC_TRANSPORT_PRIMARY;
    }

    @Override
    public List<UniqueKey<TcTransportRecord>> getKeys() {
        return Arrays.<UniqueKey<TcTransportRecord>>asList(Keys.KEY_TC_TRANSPORT_PRIMARY);
    }

    @Override
    public List<ForeignKey<TcTransportRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TcTransportRecord, ?>>asList(Keys.FK_REQUEST_HA_TRASNSPORT);
    }

    private transient TcRequestHa _tcRequestHa;

    public TcRequestHa tcRequestHa() {
        if (_tcRequestHa == null)
            _tcRequestHa = new TcRequestHa(this, Keys.FK_REQUEST_HA_TRASNSPORT);

        return _tcRequestHa;
    }

    @Override
    public TcTransport as(String alias) {
        return new TcTransport(DSL.name(alias), this);
    }

    @Override
    public TcTransport as(Name alias) {
        return new TcTransport(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TcTransport rename(String name) {
        return new TcTransport(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TcTransport rename(Name name) {
        return new TcTransport(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, Integer, String, Integer, String, String, LocalDate, LocalDate, LocalTime, LocalTime, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}