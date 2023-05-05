/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsGateEntry;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsGateEntryRecord extends UpdatableRecordImpl<CcmsGateEntryRecord> implements Record19<Long, String, LocalDateTime, String, LocalDateTime, String, String, String, Long, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.id</code>.
     */
    public CcmsGateEntryRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.created_by</code>.
     */
    public CcmsGateEntryRecord setCreatedBy(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.created_on</code>.
     */
    public CcmsGateEntryRecord setCreatedOn(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.last_modified_by</code>.
     */
    public CcmsGateEntryRecord setLastModifiedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.last_modified_by</code>.
     */
    public String getLastModifiedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.last_modified_on</code>.
     */
    public CcmsGateEntryRecord setLastModifiedOn(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.last_modified_on</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.in_time</code>.
     */
    public CcmsGateEntryRecord setInTime(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.in_time</code>.
     */
    public String getInTime() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.out_time</code>.
     */
    public CcmsGateEntryRecord setOutTime(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.out_time</code>.
     */
    public String getOutTime() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.emp_code</code>.
     */
    public CcmsGateEntryRecord setEmpCode(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.emp_code</code>.
     */
    public String getEmpCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.shift_id</code>.
     */
    public CcmsGateEntryRecord setShiftId(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.shift_id</code>.
     */
    public Long getShiftId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.active</code>.
     */
    public CcmsGateEntryRecord setActive(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.active</code>.
     */
    public String getActive() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.punch_date</code>.
     */
    public CcmsGateEntryRecord setPunchDate(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.punch_date</code>.
     */
    public String getPunchDate() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.plant_code</code>.
     */
    public CcmsGateEntryRecord setPlantCode(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.plant_code</code>.
     */
    public String getPlantCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.status</code>.
     */
    public CcmsGateEntryRecord setStatus(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.status</code>.
     */
    public String getStatus() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.flag</code>.
     */
    public CcmsGateEntryRecord setFlag(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.flag</code>.
     */
    public String getFlag() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.reason</code>.
     */
    public CcmsGateEntryRecord setReason(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.reason</code>.
     */
    public String getReason() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.in_image_name</code>.
     */
    public CcmsGateEntryRecord setInImageName(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.in_image_name</code>.
     */
    public String getInImageName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.punch_in_image</code>.
     */
    public CcmsGateEntryRecord setPunchInImage(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.punch_in_image</code>.
     */
    public String getPunchInImage() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.out_image_name</code>.
     */
    public CcmsGateEntryRecord setOutImageName(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.out_image_name</code>.
     */
    public String getOutImageName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gate_entry.punch_out_image</code>.
     */
    public CcmsGateEntryRecord setPunchOutImage(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gate_entry.punch_out_image</code>.
     */
    public String getPunchOutImage() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, String, LocalDateTime, String, LocalDateTime, String, String, String, Long, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<Long, String, LocalDateTime, String, LocalDateTime, String, String, String, Long, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.ID;
    }

    @Override
    public Field<String> field2() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.CREATED_ON;
    }

    @Override
    public Field<String> field4() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.LAST_MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.LAST_MODIFIED_ON;
    }

    @Override
    public Field<String> field6() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.IN_TIME;
    }

    @Override
    public Field<String> field7() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.OUT_TIME;
    }

    @Override
    public Field<String> field8() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.EMP_CODE;
    }

    @Override
    public Field<Long> field9() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.SHIFT_ID;
    }

    @Override
    public Field<String> field10() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.ACTIVE;
    }

    @Override
    public Field<String> field11() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.PUNCH_DATE;
    }

    @Override
    public Field<String> field12() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.PLANT_CODE;
    }

    @Override
    public Field<String> field13() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.STATUS;
    }

    @Override
    public Field<String> field14() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.FLAG;
    }

    @Override
    public Field<String> field15() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.REASON;
    }

    @Override
    public Field<String> field16() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.IN_IMAGE_NAME;
    }

    @Override
    public Field<String> field17() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.PUNCH_IN_IMAGE;
    }

    @Override
    public Field<String> field18() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.OUT_IMAGE_NAME;
    }

    @Override
    public Field<String> field19() {
        return CcmsGateEntry.CCMS_GATE_ENTRY.PUNCH_OUT_IMAGE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component3() {
        return getCreatedOn();
    }

    @Override
    public String component4() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime component5() {
        return getLastModifiedOn();
    }

    @Override
    public String component6() {
        return getInTime();
    }

    @Override
    public String component7() {
        return getOutTime();
    }

    @Override
    public String component8() {
        return getEmpCode();
    }

    @Override
    public Long component9() {
        return getShiftId();
    }

    @Override
    public String component10() {
        return getActive();
    }

    @Override
    public String component11() {
        return getPunchDate();
    }

    @Override
    public String component12() {
        return getPlantCode();
    }

    @Override
    public String component13() {
        return getStatus();
    }

    @Override
    public String component14() {
        return getFlag();
    }

    @Override
    public String component15() {
        return getReason();
    }

    @Override
    public String component16() {
        return getInImageName();
    }

    @Override
    public String component17() {
        return getPunchInImage();
    }

    @Override
    public String component18() {
        return getOutImageName();
    }

    @Override
    public String component19() {
        return getPunchOutImage();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value3() {
        return getCreatedOn();
    }

    @Override
    public String value4() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime value5() {
        return getLastModifiedOn();
    }

    @Override
    public String value6() {
        return getInTime();
    }

    @Override
    public String value7() {
        return getOutTime();
    }

    @Override
    public String value8() {
        return getEmpCode();
    }

    @Override
    public Long value9() {
        return getShiftId();
    }

    @Override
    public String value10() {
        return getActive();
    }

    @Override
    public String value11() {
        return getPunchDate();
    }

    @Override
    public String value12() {
        return getPlantCode();
    }

    @Override
    public String value13() {
        return getStatus();
    }

    @Override
    public String value14() {
        return getFlag();
    }

    @Override
    public String value15() {
        return getReason();
    }

    @Override
    public String value16() {
        return getInImageName();
    }

    @Override
    public String value17() {
        return getPunchInImage();
    }

    @Override
    public String value18() {
        return getOutImageName();
    }

    @Override
    public String value19() {
        return getPunchOutImage();
    }

    @Override
    public CcmsGateEntryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value2(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value3(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value4(String value) {
        setLastModifiedBy(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value5(LocalDateTime value) {
        setLastModifiedOn(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value6(String value) {
        setInTime(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value7(String value) {
        setOutTime(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value8(String value) {
        setEmpCode(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value9(Long value) {
        setShiftId(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value10(String value) {
        setActive(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value11(String value) {
        setPunchDate(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value12(String value) {
        setPlantCode(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value13(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value14(String value) {
        setFlag(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value15(String value) {
        setReason(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value16(String value) {
        setInImageName(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value17(String value) {
        setPunchInImage(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value18(String value) {
        setOutImageName(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord value19(String value) {
        setPunchOutImage(value);
        return this;
    }

    @Override
    public CcmsGateEntryRecord values(Long value1, String value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, String value7, String value8, Long value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19) {
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
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CcmsGateEntryRecord
     */
    public CcmsGateEntryRecord() {
        super(CcmsGateEntry.CCMS_GATE_ENTRY);
    }

    /**
     * Create a detached, initialised CcmsGateEntryRecord
     */
    public CcmsGateEntryRecord(Long id, String createdBy, LocalDateTime createdOn, String lastModifiedBy, LocalDateTime lastModifiedOn, String inTime, String outTime, String empCode, Long shiftId, String active, String punchDate, String plantCode, String status, String flag, String reason, String inImageName, String punchInImage, String outImageName, String punchOutImage) {
        super(CcmsGateEntry.CCMS_GATE_ENTRY);

        setId(id);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastModifiedBy(lastModifiedBy);
        setLastModifiedOn(lastModifiedOn);
        setInTime(inTime);
        setOutTime(outTime);
        setEmpCode(empCode);
        setShiftId(shiftId);
        setActive(active);
        setPunchDate(punchDate);
        setPlantCode(plantCode);
        setStatus(status);
        setFlag(flag);
        setReason(reason);
        setInImageName(inImageName);
        setPunchInImage(punchInImage);
        setOutImageName(outImageName);
        setPunchOutImage(punchOutImage);
    }
}
