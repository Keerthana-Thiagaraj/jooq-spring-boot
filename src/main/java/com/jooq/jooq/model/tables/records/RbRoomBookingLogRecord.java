/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.RbRoomBookingLog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Record7;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RbRoomBookingLogRecord extends UpdatableRecordImpl<RbRoomBookingLogRecord> implements Record18<Integer, Integer, Integer, Integer, LocalDate, LocalTime, LocalTime, Integer, Integer, Integer, String, String, String, String, String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.RB_LOCATION_CODE</code>.
     */
    public RbRoomBookingLogRecord setRbLocationCode(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.RB_LOCATION_CODE</code>.
     */
    public Integer getRbLocationCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BUILDING_CODE</code>.
     */
    public RbRoomBookingLogRecord setBuildingCode(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BUILDING_CODE</code>.
     */
    public Integer getBuildingCode() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.FLOOR_CODE</code>.
     */
    public RbRoomBookingLogRecord setFloorCode(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.FLOOR_CODE</code>.
     */
    public Integer getFloorCode() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.ROOM_CODE</code>.
     */
    public RbRoomBookingLogRecord setRoomCode(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.ROOM_CODE</code>.
     */
    public Integer getRoomCode() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BOOKED_DATE</code>.
     */
    public RbRoomBookingLogRecord setBookedDate(LocalDate value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BOOKED_DATE</code>.
     */
    public LocalDate getBookedDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.FROM_TIME</code>.
     */
    public RbRoomBookingLogRecord setFromTime(LocalTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.FROM_TIME</code>.
     */
    public LocalTime getFromTime() {
        return (LocalTime) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.TO_TIME</code>.
     */
    public RbRoomBookingLogRecord setToTime(LocalTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.TO_TIME</code>.
     */
    public LocalTime getToTime() {
        return (LocalTime) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.ACTUAL_SEAT</code>.
     */
    public RbRoomBookingLogRecord setActualSeat(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.ACTUAL_SEAT</code>.
     */
    public Integer getActualSeat() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BOOKED_SEAT</code>.
     */
    public RbRoomBookingLogRecord setBookedSeat(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BOOKED_SEAT</code>.
     */
    public Integer getBookedSeat() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.AVAILABLE_SEAT</code>.
     */
    public RbRoomBookingLogRecord setAvailableSeat(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.AVAILABLE_SEAT</code>.
     */
    public Integer getAvailableSeat() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.EMAIL</code>.
     */
    public RbRoomBookingLogRecord setEmail(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.PHONE</code>.
     */
    public RbRoomBookingLogRecord setPhone(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.PHONE</code>.
     */
    public String getPhone() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.SUBJECT</code>.
     */
    public RbRoomBookingLogRecord setSubject(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.SUBJECT</code>.
     */
    public String getSubject() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.STATUS_FLAG</code>.
     */
    public RbRoomBookingLogRecord setStatusFlag(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.STATUS_FLAG</code>.
     */
    public String getStatusFlag() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BOOKED_FOR</code>.
     */
    public RbRoomBookingLogRecord setBookedFor(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.BOOKED_FOR</code>.
     */
    public String getBookedFor() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.REMARKS</code>.
     */
    public RbRoomBookingLogRecord setRemarks(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.CREATED_BY</code>.
     */
    public RbRoomBookingLogRecord setCreatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.CREATED_ON</code>.
     */
    public RbRoomBookingLogRecord setCreatedOn(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.RB_ROOM_BOOKING_LOG.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record7<Integer, Integer, Integer, Integer, LocalDate, LocalTime, String> key() {
        return (Record7) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, Integer, Integer, LocalDate, LocalTime, LocalTime, Integer, Integer, Integer, String, String, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, Integer, Integer, Integer, LocalDate, LocalTime, LocalTime, Integer, Integer, Integer, String, String, String, String, String, String, String, LocalDateTime> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.RB_LOCATION_CODE;
    }

    @Override
    public Field<Integer> field2() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.BUILDING_CODE;
    }

    @Override
    public Field<Integer> field3() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.FLOOR_CODE;
    }

    @Override
    public Field<Integer> field4() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.ROOM_CODE;
    }

    @Override
    public Field<LocalDate> field5() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.BOOKED_DATE;
    }

    @Override
    public Field<LocalTime> field6() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.FROM_TIME;
    }

    @Override
    public Field<LocalTime> field7() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.TO_TIME;
    }

    @Override
    public Field<Integer> field8() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.ACTUAL_SEAT;
    }

    @Override
    public Field<Integer> field9() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.BOOKED_SEAT;
    }

    @Override
    public Field<Integer> field10() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.AVAILABLE_SEAT;
    }

    @Override
    public Field<String> field11() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.EMAIL;
    }

    @Override
    public Field<String> field12() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.PHONE;
    }

    @Override
    public Field<String> field13() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.SUBJECT;
    }

    @Override
    public Field<String> field14() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.STATUS_FLAG;
    }

    @Override
    public Field<String> field15() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.BOOKED_FOR;
    }

    @Override
    public Field<String> field16() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.REMARKS;
    }

    @Override
    public Field<String> field17() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return RbRoomBookingLog.RB_ROOM_BOOKING_LOG.CREATED_ON;
    }

    @Override
    public Integer component1() {
        return getRbLocationCode();
    }

    @Override
    public Integer component2() {
        return getBuildingCode();
    }

    @Override
    public Integer component3() {
        return getFloorCode();
    }

    @Override
    public Integer component4() {
        return getRoomCode();
    }

    @Override
    public LocalDate component5() {
        return getBookedDate();
    }

    @Override
    public LocalTime component6() {
        return getFromTime();
    }

    @Override
    public LocalTime component7() {
        return getToTime();
    }

    @Override
    public Integer component8() {
        return getActualSeat();
    }

    @Override
    public Integer component9() {
        return getBookedSeat();
    }

    @Override
    public Integer component10() {
        return getAvailableSeat();
    }

    @Override
    public String component11() {
        return getEmail();
    }

    @Override
    public String component12() {
        return getPhone();
    }

    @Override
    public String component13() {
        return getSubject();
    }

    @Override
    public String component14() {
        return getStatusFlag();
    }

    @Override
    public String component15() {
        return getBookedFor();
    }

    @Override
    public String component16() {
        return getRemarks();
    }

    @Override
    public String component17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component18() {
        return getCreatedOn();
    }

    @Override
    public Integer value1() {
        return getRbLocationCode();
    }

    @Override
    public Integer value2() {
        return getBuildingCode();
    }

    @Override
    public Integer value3() {
        return getFloorCode();
    }

    @Override
    public Integer value4() {
        return getRoomCode();
    }

    @Override
    public LocalDate value5() {
        return getBookedDate();
    }

    @Override
    public LocalTime value6() {
        return getFromTime();
    }

    @Override
    public LocalTime value7() {
        return getToTime();
    }

    @Override
    public Integer value8() {
        return getActualSeat();
    }

    @Override
    public Integer value9() {
        return getBookedSeat();
    }

    @Override
    public Integer value10() {
        return getAvailableSeat();
    }

    @Override
    public String value11() {
        return getEmail();
    }

    @Override
    public String value12() {
        return getPhone();
    }

    @Override
    public String value13() {
        return getSubject();
    }

    @Override
    public String value14() {
        return getStatusFlag();
    }

    @Override
    public String value15() {
        return getBookedFor();
    }

    @Override
    public String value16() {
        return getRemarks();
    }

    @Override
    public String value17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value18() {
        return getCreatedOn();
    }

    @Override
    public RbRoomBookingLogRecord value1(Integer value) {
        setRbLocationCode(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value2(Integer value) {
        setBuildingCode(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value3(Integer value) {
        setFloorCode(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value4(Integer value) {
        setRoomCode(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value5(LocalDate value) {
        setBookedDate(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value6(LocalTime value) {
        setFromTime(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value7(LocalTime value) {
        setToTime(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value8(Integer value) {
        setActualSeat(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value9(Integer value) {
        setBookedSeat(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value10(Integer value) {
        setAvailableSeat(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value11(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value12(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value13(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value14(String value) {
        setStatusFlag(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value15(String value) {
        setBookedFor(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value16(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value17(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord value18(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public RbRoomBookingLogRecord values(Integer value1, Integer value2, Integer value3, Integer value4, LocalDate value5, LocalTime value6, LocalTime value7, Integer value8, Integer value9, Integer value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, LocalDateTime value18) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RbRoomBookingLogRecord
     */
    public RbRoomBookingLogRecord() {
        super(RbRoomBookingLog.RB_ROOM_BOOKING_LOG);
    }

    /**
     * Create a detached, initialised RbRoomBookingLogRecord
     */
    public RbRoomBookingLogRecord(Integer rbLocationCode, Integer buildingCode, Integer floorCode, Integer roomCode, LocalDate bookedDate, LocalTime fromTime, LocalTime toTime, Integer actualSeat, Integer bookedSeat, Integer availableSeat, String email, String phone, String subject, String statusFlag, String bookedFor, String remarks, String createdBy, LocalDateTime createdOn) {
        super(RbRoomBookingLog.RB_ROOM_BOOKING_LOG);

        setRbLocationCode(rbLocationCode);
        setBuildingCode(buildingCode);
        setFloorCode(floorCode);
        setRoomCode(roomCode);
        setBookedDate(bookedDate);
        setFromTime(fromTime);
        setToTime(toTime);
        setActualSeat(actualSeat);
        setBookedSeat(bookedSeat);
        setAvailableSeat(availableSeat);
        setEmail(email);
        setPhone(phone);
        setSubject(subject);
        setStatusFlag(statusFlag);
        setBookedFor(bookedFor);
        setRemarks(remarks);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
    }
}
