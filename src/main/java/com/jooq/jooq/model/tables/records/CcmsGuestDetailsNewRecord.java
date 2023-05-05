/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsGuestDetailsNew;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Record4;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsGuestDetailsNewRecord extends UpdatableRecordImpl<CcmsGuestDetailsNewRecord> implements Record17<String, String, String, String, String, String, String, String, String, Integer, Integer, Integer, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.emp_code</code>.
     */
    public CcmsGuestDetailsNewRecord setEmpCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.emp_code</code>.
     */
    public String getEmpCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.meal_date</code>.
     */
    public CcmsGuestDetailsNewRecord setMealDate(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.meal_date</code>.
     */
    public String getMealDate() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.meal_shift</code>.
     */
    public CcmsGuestDetailsNewRecord setMealShift(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.meal_shift</code>.
     */
    public String getMealShift() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.plant_code</code>.
     */
    public CcmsGuestDetailsNewRecord setPlantCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.plant_code</code>.
     */
    public String getPlantCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.emp_type</code>.
     */
    public CcmsGuestDetailsNewRecord setEmpType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.emp_type</code>.
     */
    public String getEmpType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.emp_name</code>.
     */
    public CcmsGuestDetailsNewRecord setEmpName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.emp_name</code>.
     */
    public String getEmpName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.company_name</code>.
     */
    public CcmsGuestDetailsNewRecord setCompanyName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.department</code>.
     */
    public CcmsGuestDetailsNewRecord setDepartment(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.department</code>.
     */
    public String getDepartment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.point_of_contact</code>.
     */
    public CcmsGuestDetailsNewRecord setPointOfContact(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.point_of_contact</code>.
     */
    public String getPointOfContact() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.meal_count</code>.
     */
    public CcmsGuestDetailsNewRecord setMealCount(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.meal_count</code>.
     */
    public Integer getMealCount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.extra_count</code>.
     */
    public CcmsGuestDetailsNewRecord setExtraCount(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.extra_count</code>.
     */
    public Integer getExtraCount() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.total_count</code>.
     */
    public CcmsGuestDetailsNewRecord setTotalCount(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.total_count</code>.
     */
    public Integer getTotalCount() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.active</code>.
     */
    public CcmsGuestDetailsNewRecord setActive(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.active</code>.
     */
    public String getActive() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.created_by</code>.
     */
    public CcmsGuestDetailsNewRecord setCreatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.created_on</code>.
     */
    public CcmsGuestDetailsNewRecord setCreatedOn(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.last_modified_by</code>.
     */
    public CcmsGuestDetailsNewRecord setLastModifiedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.last_modified_by</code>.
     */
    public String getLastModifiedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_guest_details_new.last_modified_on</code>.
     */
    public CcmsGuestDetailsNewRecord setLastModifiedOn(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_guest_details_new.last_modified_on</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return (LocalDateTime) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, Integer, Integer, Integer, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, String, String, String, String, Integer, Integer, Integer, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.EMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.MEAL_DATE;
    }

    @Override
    public Field<String> field3() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.MEAL_SHIFT;
    }

    @Override
    public Field<String> field4() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.PLANT_CODE;
    }

    @Override
    public Field<String> field5() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.EMP_TYPE;
    }

    @Override
    public Field<String> field6() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.EMP_NAME;
    }

    @Override
    public Field<String> field7() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.COMPANY_NAME;
    }

    @Override
    public Field<String> field8() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.DEPARTMENT;
    }

    @Override
    public Field<String> field9() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.POINT_OF_CONTACT;
    }

    @Override
    public Field<Integer> field10() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.MEAL_COUNT;
    }

    @Override
    public Field<Integer> field11() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.EXTRA_COUNT;
    }

    @Override
    public Field<Integer> field12() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.TOTAL_COUNT;
    }

    @Override
    public Field<String> field13() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.ACTIVE;
    }

    @Override
    public Field<String> field14() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.CREATED_ON;
    }

    @Override
    public Field<String> field16() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.LAST_MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW.LAST_MODIFIED_ON;
    }

    @Override
    public String component1() {
        return getEmpCode();
    }

    @Override
    public String component2() {
        return getMealDate();
    }

    @Override
    public String component3() {
        return getMealShift();
    }

    @Override
    public String component4() {
        return getPlantCode();
    }

    @Override
    public String component5() {
        return getEmpType();
    }

    @Override
    public String component6() {
        return getEmpName();
    }

    @Override
    public String component7() {
        return getCompanyName();
    }

    @Override
    public String component8() {
        return getDepartment();
    }

    @Override
    public String component9() {
        return getPointOfContact();
    }

    @Override
    public Integer component10() {
        return getMealCount();
    }

    @Override
    public Integer component11() {
        return getExtraCount();
    }

    @Override
    public Integer component12() {
        return getTotalCount();
    }

    @Override
    public String component13() {
        return getActive();
    }

    @Override
    public String component14() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component15() {
        return getCreatedOn();
    }

    @Override
    public String component16() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime component17() {
        return getLastModifiedOn();
    }

    @Override
    public String value1() {
        return getEmpCode();
    }

    @Override
    public String value2() {
        return getMealDate();
    }

    @Override
    public String value3() {
        return getMealShift();
    }

    @Override
    public String value4() {
        return getPlantCode();
    }

    @Override
    public String value5() {
        return getEmpType();
    }

    @Override
    public String value6() {
        return getEmpName();
    }

    @Override
    public String value7() {
        return getCompanyName();
    }

    @Override
    public String value8() {
        return getDepartment();
    }

    @Override
    public String value9() {
        return getPointOfContact();
    }

    @Override
    public Integer value10() {
        return getMealCount();
    }

    @Override
    public Integer value11() {
        return getExtraCount();
    }

    @Override
    public Integer value12() {
        return getTotalCount();
    }

    @Override
    public String value13() {
        return getActive();
    }

    @Override
    public String value14() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value15() {
        return getCreatedOn();
    }

    @Override
    public String value16() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime value17() {
        return getLastModifiedOn();
    }

    @Override
    public CcmsGuestDetailsNewRecord value1(String value) {
        setEmpCode(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value2(String value) {
        setMealDate(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value3(String value) {
        setMealShift(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value4(String value) {
        setPlantCode(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value5(String value) {
        setEmpType(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value6(String value) {
        setEmpName(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value7(String value) {
        setCompanyName(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value8(String value) {
        setDepartment(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value9(String value) {
        setPointOfContact(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value10(Integer value) {
        setMealCount(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value11(Integer value) {
        setExtraCount(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value12(Integer value) {
        setTotalCount(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value13(String value) {
        setActive(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value14(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value15(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value16(String value) {
        setLastModifiedBy(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord value17(LocalDateTime value) {
        setLastModifiedOn(value);
        return this;
    }

    @Override
    public CcmsGuestDetailsNewRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Integer value10, Integer value11, Integer value12, String value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CcmsGuestDetailsNewRecord
     */
    public CcmsGuestDetailsNewRecord() {
        super(CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW);
    }

    /**
     * Create a detached, initialised CcmsGuestDetailsNewRecord
     */
    public CcmsGuestDetailsNewRecord(String empCode, String mealDate, String mealShift, String plantCode, String empType, String empName, String companyName, String department, String pointOfContact, Integer mealCount, Integer extraCount, Integer totalCount, String active, String createdBy, LocalDateTime createdOn, String lastModifiedBy, LocalDateTime lastModifiedOn) {
        super(CcmsGuestDetailsNew.CCMS_GUEST_DETAILS_NEW);

        setEmpCode(empCode);
        setMealDate(mealDate);
        setMealShift(mealShift);
        setPlantCode(plantCode);
        setEmpType(empType);
        setEmpName(empName);
        setCompanyName(companyName);
        setDepartment(department);
        setPointOfContact(pointOfContact);
        setMealCount(mealCount);
        setExtraCount(extraCount);
        setTotalCount(totalCount);
        setActive(active);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastModifiedBy(lastModifiedBy);
        setLastModifiedOn(lastModifiedOn);
    }
}