/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.TcCalenderPlanner;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record4;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcCalenderPlannerRecord extends UpdatableRecordImpl<TcCalenderPlannerRecord> implements Record12<Integer, LocalDate, String, String, String, String, String, String, String, String, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.TRAINING_CENTER_CODE</code>.
     */
    public TcCalenderPlannerRecord setTrainingCenterCode(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.TRAINING_CENTER_CODE</code>.
     */
    public Integer getTrainingCenterCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.DATE</code>.
     */
    public TcCalenderPlannerRecord setDate(LocalDate value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.DATE</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.YEAR</code>.
     */
    public TcCalenderPlannerRecord setYear(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.YEAR</code>.
     */
    public String getYear() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.MONTH</code>.
     */
    public TcCalenderPlannerRecord setMonth(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.MONTH</code>.
     */
    public String getMonth() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.DAY</code>.
     */
    public TcCalenderPlannerRecord setDay(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.DAY</code>.
     */
    public String getDay() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.HOLIDAY_FLAG</code>.
     */
    public TcCalenderPlannerRecord setHolidayFlag(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.HOLIDAY_FLAG</code>.
     */
    public String getHolidayFlag() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.BOOKED_FLAG</code>.
     */
    public TcCalenderPlannerRecord setBookedFlag(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.BOOKED_FLAG</code>.
     */
    public String getBookedFlag() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.AVAILABILITY_FLAG</code>.
     */
    public TcCalenderPlannerRecord setAvailabilityFlag(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.AVAILABILITY_FLAG</code>.
     */
    public String getAvailabilityFlag() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.COLOR_CODE</code>.
     */
    public TcCalenderPlannerRecord setColorCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.COLOR_CODE</code>.
     */
    public String getColorCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.REMARKS</code>.
     */
    public TcCalenderPlannerRecord setRemarks(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.UPDATED_ON</code>.
     */
    public TcCalenderPlannerRecord setUpdatedOn(LocalDate value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.UPDATED_ON</code>.
     */
    public LocalDate getUpdatedOn() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.UPDATED_BY</code>.
     */
    public TcCalenderPlannerRecord setUpdatedBy(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CALENDER_PLANNER.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<Integer, LocalDate, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, LocalDate, String, String, String, String, String, String, String, String, LocalDate, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, LocalDate, String, String, String, String, String, String, String, String, LocalDate, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.TRAINING_CENTER_CODE;
    }

    @Override
    public Field<LocalDate> field2() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.DATE;
    }

    @Override
    public Field<String> field3() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.YEAR;
    }

    @Override
    public Field<String> field4() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.MONTH;
    }

    @Override
    public Field<String> field5() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.DAY;
    }

    @Override
    public Field<String> field6() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.HOLIDAY_FLAG;
    }

    @Override
    public Field<String> field7() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.BOOKED_FLAG;
    }

    @Override
    public Field<String> field8() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.AVAILABILITY_FLAG;
    }

    @Override
    public Field<String> field9() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.COLOR_CODE;
    }

    @Override
    public Field<String> field10() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.REMARKS;
    }

    @Override
    public Field<LocalDate> field11() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.UPDATED_ON;
    }

    @Override
    public Field<String> field12() {
        return TcCalenderPlanner.TC_CALENDER_PLANNER.UPDATED_BY;
    }

    @Override
    public Integer component1() {
        return getTrainingCenterCode();
    }

    @Override
    public LocalDate component2() {
        return getDate();
    }

    @Override
    public String component3() {
        return getYear();
    }

    @Override
    public String component4() {
        return getMonth();
    }

    @Override
    public String component5() {
        return getDay();
    }

    @Override
    public String component6() {
        return getHolidayFlag();
    }

    @Override
    public String component7() {
        return getBookedFlag();
    }

    @Override
    public String component8() {
        return getAvailabilityFlag();
    }

    @Override
    public String component9() {
        return getColorCode();
    }

    @Override
    public String component10() {
        return getRemarks();
    }

    @Override
    public LocalDate component11() {
        return getUpdatedOn();
    }

    @Override
    public String component12() {
        return getUpdatedBy();
    }

    @Override
    public Integer value1() {
        return getTrainingCenterCode();
    }

    @Override
    public LocalDate value2() {
        return getDate();
    }

    @Override
    public String value3() {
        return getYear();
    }

    @Override
    public String value4() {
        return getMonth();
    }

    @Override
    public String value5() {
        return getDay();
    }

    @Override
    public String value6() {
        return getHolidayFlag();
    }

    @Override
    public String value7() {
        return getBookedFlag();
    }

    @Override
    public String value8() {
        return getAvailabilityFlag();
    }

    @Override
    public String value9() {
        return getColorCode();
    }

    @Override
    public String value10() {
        return getRemarks();
    }

    @Override
    public LocalDate value11() {
        return getUpdatedOn();
    }

    @Override
    public String value12() {
        return getUpdatedBy();
    }

    @Override
    public TcCalenderPlannerRecord value1(Integer value) {
        setTrainingCenterCode(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value2(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value3(String value) {
        setYear(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value4(String value) {
        setMonth(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value5(String value) {
        setDay(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value6(String value) {
        setHolidayFlag(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value7(String value) {
        setBookedFlag(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value8(String value) {
        setAvailabilityFlag(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value9(String value) {
        setColorCode(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value10(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value11(LocalDate value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord value12(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public TcCalenderPlannerRecord values(Integer value1, LocalDate value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, LocalDate value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TcCalenderPlannerRecord
     */
    public TcCalenderPlannerRecord() {
        super(TcCalenderPlanner.TC_CALENDER_PLANNER);
    }

    /**
     * Create a detached, initialised TcCalenderPlannerRecord
     */
    public TcCalenderPlannerRecord(Integer trainingCenterCode, LocalDate date, String year, String month, String day, String holidayFlag, String bookedFlag, String availabilityFlag, String colorCode, String remarks, LocalDate updatedOn, String updatedBy) {
        super(TcCalenderPlanner.TC_CALENDER_PLANNER);

        setTrainingCenterCode(trainingCenterCode);
        setDate(date);
        setYear(year);
        setMonth(month);
        setDay(day);
        setHolidayFlag(holidayFlag);
        setBookedFlag(bookedFlag);
        setAvailabilityFlag(availabilityFlag);
        setColorCode(colorCode);
        setRemarks(remarks);
        setUpdatedOn(updatedOn);
        setUpdatedBy(updatedBy);
    }
}
