/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.TcRouteMaster;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record3;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcRouteMasterRecord extends UpdatableRecordImpl<TcRouteMasterRecord> implements Record13<Integer, Integer, String, String, String, Integer, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.ROUTE_CODE</code>.
     */
    public TcRouteMasterRecord setRouteCode(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.ROUTE_CODE</code>.
     */
    public Integer getRouteCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.TR_CENTER_CODE</code>.
     */
    public TcRouteMasterRecord setTrCenterCode(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.TR_CENTER_CODE</code>.
     */
    public Integer getTrCenterCode() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.ROUTE_NAME</code>.
     */
    public TcRouteMasterRecord setRouteName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.ROUTE_NAME</code>.
     */
    public String getRouteName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.PICKUP_POINT_NAME</code>.
     */
    public TcRouteMasterRecord setPickupPointName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.PICKUP_POINT_NAME</code>.
     */
    public String getPickupPointName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.DROP_POINT_NAME</code>.
     */
    public TcRouteMasterRecord setDropPointName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.DROP_POINT_NAME</code>.
     */
    public String getDropPointName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.TRIP_KM</code>.
     */
    public TcRouteMasterRecord setTripKm(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.TRIP_KM</code>.
     */
    public Integer getTripKm() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.FROM_DATE</code>.
     */
    public TcRouteMasterRecord setFromDate(LocalDate value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.TO_DATE</code>.
     */
    public TcRouteMasterRecord setToDate(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.STATUS</code>.
     */
    public TcRouteMasterRecord setStatus(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.CREATED_BY</code>.
     */
    public TcRouteMasterRecord setCreatedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.CREATED_ON</code>.
     */
    public TcRouteMasterRecord setCreatedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.LAST_CHANGED_BY</code>.
     */
    public TcRouteMasterRecord setLastChangedBy(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.LAST_CHANGED_ON</code>.
     */
    public TcRouteMasterRecord setLastChangedOn(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_ROUTE_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Integer, Integer, LocalDate> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, Integer, String, String, String, Integer, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, Integer, String, String, String, Integer, LocalDate, LocalDate, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TcRouteMaster.TC_ROUTE_MASTER.ROUTE_CODE;
    }

    @Override
    public Field<Integer> field2() {
        return TcRouteMaster.TC_ROUTE_MASTER.TR_CENTER_CODE;
    }

    @Override
    public Field<String> field3() {
        return TcRouteMaster.TC_ROUTE_MASTER.ROUTE_NAME;
    }

    @Override
    public Field<String> field4() {
        return TcRouteMaster.TC_ROUTE_MASTER.PICKUP_POINT_NAME;
    }

    @Override
    public Field<String> field5() {
        return TcRouteMaster.TC_ROUTE_MASTER.DROP_POINT_NAME;
    }

    @Override
    public Field<Integer> field6() {
        return TcRouteMaster.TC_ROUTE_MASTER.TRIP_KM;
    }

    @Override
    public Field<LocalDate> field7() {
        return TcRouteMaster.TC_ROUTE_MASTER.FROM_DATE;
    }

    @Override
    public Field<LocalDate> field8() {
        return TcRouteMaster.TC_ROUTE_MASTER.TO_DATE;
    }

    @Override
    public Field<String> field9() {
        return TcRouteMaster.TC_ROUTE_MASTER.STATUS;
    }

    @Override
    public Field<String> field10() {
        return TcRouteMaster.TC_ROUTE_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return TcRouteMaster.TC_ROUTE_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field12() {
        return TcRouteMaster.TC_ROUTE_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return TcRouteMaster.TC_ROUTE_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public Integer component1() {
        return getRouteCode();
    }

    @Override
    public Integer component2() {
        return getTrCenterCode();
    }

    @Override
    public String component3() {
        return getRouteName();
    }

    @Override
    public String component4() {
        return getPickupPointName();
    }

    @Override
    public String component5() {
        return getDropPointName();
    }

    @Override
    public Integer component6() {
        return getTripKm();
    }

    @Override
    public LocalDate component7() {
        return getFromDate();
    }

    @Override
    public LocalDate component8() {
        return getToDate();
    }

    @Override
    public String component9() {
        return getStatus();
    }

    @Override
    public String component10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component11() {
        return getCreatedOn();
    }

    @Override
    public String component12() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component13() {
        return getLastChangedOn();
    }

    @Override
    public Integer value1() {
        return getRouteCode();
    }

    @Override
    public Integer value2() {
        return getTrCenterCode();
    }

    @Override
    public String value3() {
        return getRouteName();
    }

    @Override
    public String value4() {
        return getPickupPointName();
    }

    @Override
    public String value5() {
        return getDropPointName();
    }

    @Override
    public Integer value6() {
        return getTripKm();
    }

    @Override
    public LocalDate value7() {
        return getFromDate();
    }

    @Override
    public LocalDate value8() {
        return getToDate();
    }

    @Override
    public String value9() {
        return getStatus();
    }

    @Override
    public String value10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value11() {
        return getCreatedOn();
    }

    @Override
    public String value12() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value13() {
        return getLastChangedOn();
    }

    @Override
    public TcRouteMasterRecord value1(Integer value) {
        setRouteCode(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value2(Integer value) {
        setTrCenterCode(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value3(String value) {
        setRouteName(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value4(String value) {
        setPickupPointName(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value5(String value) {
        setDropPointName(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value6(Integer value) {
        setTripKm(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value7(LocalDate value) {
        setFromDate(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value8(LocalDate value) {
        setToDate(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value9(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value10(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value11(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value12(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord value13(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public TcRouteMasterRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Integer value6, LocalDate value7, LocalDate value8, String value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TcRouteMasterRecord
     */
    public TcRouteMasterRecord() {
        super(TcRouteMaster.TC_ROUTE_MASTER);
    }

    /**
     * Create a detached, initialised TcRouteMasterRecord
     */
    public TcRouteMasterRecord(Integer routeCode, Integer trCenterCode, String routeName, String pickupPointName, String dropPointName, Integer tripKm, LocalDate fromDate, LocalDate toDate, String status, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(TcRouteMaster.TC_ROUTE_MASTER);

        setRouteCode(routeCode);
        setTrCenterCode(trCenterCode);
        setRouteName(routeName);
        setPickupPointName(pickupPointName);
        setDropPointName(dropPointName);
        setTripKm(tripKm);
        setFromDate(fromDate);
        setToDate(toDate);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
