/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.TeamleadMaster;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamleadMasterRecord extends UpdatableRecordImpl<TeamleadMasterRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.teamlead_master.PLANT</code>.
     */
    public TeamleadMasterRecord setPlant(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.teamlead_master.PLANT</code>.
     */
    public String getPlant() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.teamlead_master.TL_ID</code>.
     */
    public TeamleadMasterRecord setTlId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.teamlead_master.TL_ID</code>.
     */
    public String getTlId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.teamlead_master.TL_NAME</code>.
     */
    public TeamleadMasterRecord setTlName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.teamlead_master.TL_NAME</code>.
     */
    public String getTlName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.teamlead_master.STATUS</code>.
     */
    public TeamleadMasterRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.teamlead_master.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TeamleadMaster.TEAMLEAD_MASTER.PLANT;
    }

    @Override
    public Field<String> field2() {
        return TeamleadMaster.TEAMLEAD_MASTER.TL_ID;
    }

    @Override
    public Field<String> field3() {
        return TeamleadMaster.TEAMLEAD_MASTER.TL_NAME;
    }

    @Override
    public Field<String> field4() {
        return TeamleadMaster.TEAMLEAD_MASTER.STATUS;
    }

    @Override
    public String component1() {
        return getPlant();
    }

    @Override
    public String component2() {
        return getTlId();
    }

    @Override
    public String component3() {
        return getTlName();
    }

    @Override
    public String component4() {
        return getStatus();
    }

    @Override
    public String value1() {
        return getPlant();
    }

    @Override
    public String value2() {
        return getTlId();
    }

    @Override
    public String value3() {
        return getTlName();
    }

    @Override
    public String value4() {
        return getStatus();
    }

    @Override
    public TeamleadMasterRecord value1(String value) {
        setPlant(value);
        return this;
    }

    @Override
    public TeamleadMasterRecord value2(String value) {
        setTlId(value);
        return this;
    }

    @Override
    public TeamleadMasterRecord value3(String value) {
        setTlName(value);
        return this;
    }

    @Override
    public TeamleadMasterRecord value4(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public TeamleadMasterRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeamleadMasterRecord
     */
    public TeamleadMasterRecord() {
        super(TeamleadMaster.TEAMLEAD_MASTER);
    }

    /**
     * Create a detached, initialised TeamleadMasterRecord
     */
    public TeamleadMasterRecord(String plant, String tlId, String tlName, String status) {
        super(TeamleadMaster.TEAMLEAD_MASTER);

        setPlant(plant);
        setTlId(tlId);
        setTlName(tlName);
        setStatus(status);
    }
}
