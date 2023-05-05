/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.VendorVehicleDetailsRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
public class VendorVehicleDetails extends TableImpl<VendorVehicleDetailsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.vendor_vehicle_details</code>
     */
    public static final VendorVehicleDetails VENDOR_VEHICLE_DETAILS = new VendorVehicleDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VendorVehicleDetailsRecord> getRecordType() {
        return VendorVehicleDetailsRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.COMP_CODE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> COMP_CODE = createField(DSL.name("COMP_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.SERVICE_AGENT</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> SERVICE_AGENT = createField(DSL.name("SERVICE_AGENT"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.PAYMENT_VENDOR</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> PAYMENT_VENDOR = createField(DSL.name("PAYMENT_VENDOR"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.TRUCK_NUMBER</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> TRUCK_NUMBER = createField(DSL.name("TRUCK_NUMBER"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.NAME1</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> NAME1 = createField(DSL.name("NAME1"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.PAYEE_VENDOR_NAME</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> PAYEE_VENDOR_NAME = createField(DSL.name("PAYEE_VENDOR_NAME"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.PERMIT_STATUS</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> PERMIT_STATUS = createField(DSL.name("PERMIT_STATUS"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.BIRTH_DATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> BIRTH_DATE = createField(DSL.name("BIRTH_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.DIESEL_CARD_NUMBER</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> DIESEL_CARD_NUMBER = createField(DSL.name("DIESEL_CARD_NUMBER"), SQLDataType.VARCHAR(17), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.TRUCK_TYPE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> TRUCK_TYPE = createField(DSL.name("TRUCK_TYPE"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.VEHICLE_TYPE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> VEHICLE_TYPE = createField(DSL.name("VEHICLE_TYPE"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.CRATE_CAPACITY</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, BigDecimal> CRATE_CAPACITY = createField(DSL.name("CRATE_CAPACITY"), SQLDataType.DECIMAL(13, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.STATUS</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.CREATED_BY</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, Integer> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.CREATED_ON</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.LAST_CHANGED_BY</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, Integer> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.LAST_CHANGED_ON</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.SUPPL1_DES</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> SUPPL1_DES = createField(DSL.name("SUPPL1_DES"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.SUPPL2_DES</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> SUPPL2_DES = createField(DSL.name("SUPPL2_DES"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.SUPPL3_DES</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> SUPPL3_DES = createField(DSL.name("SUPPL3_DES"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.SUPPL4_DES</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> SUPPL4_DES = createField(DSL.name("SUPPL4_DES"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.DELETION</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> DELETION = createField(DSL.name("DELETION"), SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.FSSAI_FROM_DATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> FSSAI_FROM_DATE = createField(DSL.name("FSSAI_FROM_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.FSSAI_TO_DATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> FSSAI_TO_DATE = createField(DSL.name("FSSAI_TO_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.CFA_NAME</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> CFA_NAME = createField(DSL.name("CFA_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.CFA_REF</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> CFA_REF = createField(DSL.name("CFA_REF"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZEMISSION_CEF</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> ZEMISSION_CEF = createField(DSL.name("ZEMISSION_CEF"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZEMIS_FDATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> ZEMIS_FDATE = createField(DSL.name("ZEMIS_FDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZEMIS_TDATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> ZEMIS_TDATE = createField(DSL.name("ZEMIS_TDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZFCOMP_QTY</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, BigDecimal> ZFCOMP_QTY = createField(DSL.name("ZFCOMP_QTY"), SQLDataType.DECIMAL(12, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZMCOMP_QTY</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, BigDecimal> ZMCOMP_QTY = createField(DSL.name("ZMCOMP_QTY"), SQLDataType.DECIMAL(12, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZBCOMP_QTY</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, BigDecimal> ZBCOMP_QTY = createField(DSL.name("ZBCOMP_QTY"), SQLDataType.DECIMAL(12, 2), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZVEH_FC_NO</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> ZVEH_FC_NO = createField(DSL.name("ZVEH_FC_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZVEH_FC_FDATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> ZVEH_FC_FDATE = createField(DSL.name("ZVEH_FC_FDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZVEH_FC_TDATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> ZVEH_FC_TDATE = createField(DSL.name("ZVEH_FC_TDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZVEH_INSUR_NO</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> ZVEH_INSUR_NO = createField(DSL.name("ZVEH_INSUR_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZVEH_INS_FDATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> ZVEH_INS_FDATE = createField(DSL.name("ZVEH_INS_FDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZVEH_INS_TDATE</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, LocalDate> ZVEH_INS_TDATE = createField(DSL.name("ZVEH_INS_TDATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_vehicle_details.ZFSSAI_NO</code>.
     */
    public final TableField<VendorVehicleDetailsRecord, String> ZFSSAI_NO = createField(DSL.name("ZFSSAI_NO"), SQLDataType.VARCHAR(45), this, "");

    private VendorVehicleDetails(Name alias, Table<VendorVehicleDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VendorVehicleDetails(Name alias, Table<VendorVehicleDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_vehicle_details</code> table reference
     */
    public VendorVehicleDetails(String alias) {
        this(DSL.name(alias), VENDOR_VEHICLE_DETAILS);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_vehicle_details</code> table reference
     */
    public VendorVehicleDetails(Name alias) {
        this(alias, VENDOR_VEHICLE_DETAILS);
    }

    /**
     * Create a <code>vendor_portal_pbx.vendor_vehicle_details</code> table reference
     */
    public VendorVehicleDetails() {
        this(DSL.name("vendor_vehicle_details"), null);
    }

    public <O extends Record> VendorVehicleDetails(Table<O> child, ForeignKey<O, VendorVehicleDetailsRecord> key) {
        super(child, key, VENDOR_VEHICLE_DETAILS);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VENDOR_VEHICLE_DETAILS_SECONDARY_INDEX);
    }

    @Override
    public UniqueKey<VendorVehicleDetailsRecord> getPrimaryKey() {
        return Keys.KEY_VENDOR_VEHICLE_DETAILS_PRIMARY;
    }

    @Override
    public List<UniqueKey<VendorVehicleDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<VendorVehicleDetailsRecord>>asList(Keys.KEY_VENDOR_VEHICLE_DETAILS_PRIMARY);
    }

    @Override
    public VendorVehicleDetails as(String alias) {
        return new VendorVehicleDetails(DSL.name(alias), this);
    }

    @Override
    public VendorVehicleDetails as(Name alias) {
        return new VendorVehicleDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorVehicleDetails rename(String name) {
        return new VendorVehicleDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorVehicleDetails rename(Name name) {
        return new VendorVehicleDetails(name, null);
    }
}