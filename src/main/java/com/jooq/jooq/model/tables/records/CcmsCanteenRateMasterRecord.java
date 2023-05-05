/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsCanteenRateMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record3;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsCanteenRateMasterRecord extends UpdatableRecordImpl<CcmsCanteenRateMasterRecord> implements Record10<Integer, String, String, Double, Double, Double, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.plant</code>.
     */
    public CcmsCanteenRateMasterRecord setPlant(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.plant</code>.
     */
    public Integer getPlant() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.meal_type</code>.
     */
    public CcmsCanteenRateMasterRecord setMealType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.meal_type</code>.
     */
    public String getMealType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.effective_from_date</code>.
     */
    public CcmsCanteenRateMasterRecord setEffectiveFromDate(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.effective_from_date</code>.
     */
    public String getEffectiveFromDate() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.emp_contribution</code>.
     */
    public CcmsCanteenRateMasterRecord setEmpContribution(Double value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.emp_contribution</code>.
     */
    public Double getEmpContribution() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.employer_contribution</code>.
     */
    public CcmsCanteenRateMasterRecord setEmployerContribution(Double value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.employer_contribution</code>.
     */
    public Double getEmployerContribution() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.full_meal_value</code>.
     */
    public CcmsCanteenRateMasterRecord setFullMealValue(Double value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.full_meal_value</code>.
     */
    public Double getFullMealValue() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.created_by</code>.
     */
    public CcmsCanteenRateMasterRecord setCreatedBy(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.created_on</code>.
     */
    public CcmsCanteenRateMasterRecord setCreatedOn(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.last_changed_by</code>.
     */
    public CcmsCanteenRateMasterRecord setLastChangedBy(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_rate_master.last_changed_on</code>.
     */
    public CcmsCanteenRateMasterRecord setLastChangedOn(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_rate_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Integer, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, Double, Double, Double, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, Double, Double, Double, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.PLANT;
    }

    @Override
    public Field<String> field2() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.MEAL_TYPE;
    }

    @Override
    public Field<String> field3() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.EFFECTIVE_FROM_DATE;
    }

    @Override
    public Field<Double> field4() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.EMP_CONTRIBUTION;
    }

    @Override
    public Field<Double> field5() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.EMPLOYER_CONTRIBUTION;
    }

    @Override
    public Field<Double> field6() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.FULL_MEAL_VALUE;
    }

    @Override
    public Field<String> field7() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.CREATED_ON;
    }

    @Override
    public Field<String> field9() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public Integer component1() {
        return getPlant();
    }

    @Override
    public String component2() {
        return getMealType();
    }

    @Override
    public String component3() {
        return getEffectiveFromDate();
    }

    @Override
    public Double component4() {
        return getEmpContribution();
    }

    @Override
    public Double component5() {
        return getEmployerContribution();
    }

    @Override
    public Double component6() {
        return getFullMealValue();
    }

    @Override
    public String component7() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component8() {
        return getCreatedOn();
    }

    @Override
    public String component9() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component10() {
        return getLastChangedOn();
    }

    @Override
    public Integer value1() {
        return getPlant();
    }

    @Override
    public String value2() {
        return getMealType();
    }

    @Override
    public String value3() {
        return getEffectiveFromDate();
    }

    @Override
    public Double value4() {
        return getEmpContribution();
    }

    @Override
    public Double value5() {
        return getEmployerContribution();
    }

    @Override
    public Double value6() {
        return getFullMealValue();
    }

    @Override
    public String value7() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value8() {
        return getCreatedOn();
    }

    @Override
    public String value9() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value10() {
        return getLastChangedOn();
    }

    @Override
    public CcmsCanteenRateMasterRecord value1(Integer value) {
        setPlant(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value2(String value) {
        setMealType(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value3(String value) {
        setEffectiveFromDate(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value4(Double value) {
        setEmpContribution(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value5(Double value) {
        setEmployerContribution(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value6(Double value) {
        setFullMealValue(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value7(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value8(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value9(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord value10(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public CcmsCanteenRateMasterRecord values(Integer value1, String value2, String value3, Double value4, Double value5, Double value6, String value7, LocalDateTime value8, String value9, LocalDateTime value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CcmsCanteenRateMasterRecord
     */
    public CcmsCanteenRateMasterRecord() {
        super(CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER);
    }

    /**
     * Create a detached, initialised CcmsCanteenRateMasterRecord
     */
    public CcmsCanteenRateMasterRecord(Integer plant, String mealType, String effectiveFromDate, Double empContribution, Double employerContribution, Double fullMealValue, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn) {
        super(CcmsCanteenRateMaster.CCMS_CANTEEN_RATE_MASTER);

        setPlant(plant);
        setMealType(mealType);
        setEffectiveFromDate(effectiveFromDate);
        setEmpContribution(empContribution);
        setEmployerContribution(employerContribution);
        setFullMealValue(fullMealValue);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
