/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CcmsCardHistory;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsCardHistoryRecord extends UpdatableRecordImpl<CcmsCardHistoryRecord> implements Record7<String, String, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_history.card_no</code>.
     */
    public CcmsCardHistoryRecord setCardNo(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_history.card_no</code>.
     */
    public String getCardNo() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_history.employee_id</code>.
     */
    public CcmsCardHistoryRecord setEmployeeId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_history.employee_id</code>.
     */
    public String getEmployeeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_history.active</code>.
     */
    public CcmsCardHistoryRecord setActive(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_history.active</code>.
     */
    public String getActive() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_history.created_by</code>.
     */
    public CcmsCardHistoryRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_history.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_history.created_on</code>.
     */
    public CcmsCardHistoryRecord setCreatedOn(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_history.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_history.last_modified_by</code>.
     */
    public CcmsCardHistoryRecord setLastModifiedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_history.last_modified_by</code>.
     */
    public String getLastModifiedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_history.last_modified_on</code>.
     */
    public CcmsCardHistoryRecord setLastModifiedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_history.last_modified_on</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CcmsCardHistory.CCMS_CARD_HISTORY.CARD_NO;
    }

    @Override
    public Field<String> field2() {
        return CcmsCardHistory.CCMS_CARD_HISTORY.EMPLOYEE_ID;
    }

    @Override
    public Field<String> field3() {
        return CcmsCardHistory.CCMS_CARD_HISTORY.ACTIVE;
    }

    @Override
    public Field<String> field4() {
        return CcmsCardHistory.CCMS_CARD_HISTORY.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return CcmsCardHistory.CCMS_CARD_HISTORY.CREATED_ON;
    }

    @Override
    public Field<String> field6() {
        return CcmsCardHistory.CCMS_CARD_HISTORY.LAST_MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return CcmsCardHistory.CCMS_CARD_HISTORY.LAST_MODIFIED_ON;
    }

    @Override
    public String component1() {
        return getCardNo();
    }

    @Override
    public String component2() {
        return getEmployeeId();
    }

    @Override
    public String component3() {
        return getActive();
    }

    @Override
    public String component4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedOn();
    }

    @Override
    public String component6() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getLastModifiedOn();
    }

    @Override
    public String value1() {
        return getCardNo();
    }

    @Override
    public String value2() {
        return getEmployeeId();
    }

    @Override
    public String value3() {
        return getActive();
    }

    @Override
    public String value4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedOn();
    }

    @Override
    public String value6() {
        return getLastModifiedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getLastModifiedOn();
    }

    @Override
    public CcmsCardHistoryRecord value1(String value) {
        setCardNo(value);
        return this;
    }

    @Override
    public CcmsCardHistoryRecord value2(String value) {
        setEmployeeId(value);
        return this;
    }

    @Override
    public CcmsCardHistoryRecord value3(String value) {
        setActive(value);
        return this;
    }

    @Override
    public CcmsCardHistoryRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CcmsCardHistoryRecord value5(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CcmsCardHistoryRecord value6(String value) {
        setLastModifiedBy(value);
        return this;
    }

    @Override
    public CcmsCardHistoryRecord value7(LocalDateTime value) {
        setLastModifiedOn(value);
        return this;
    }

    @Override
    public CcmsCardHistoryRecord values(String value1, String value2, String value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CcmsCardHistoryRecord
     */
    public CcmsCardHistoryRecord() {
        super(CcmsCardHistory.CCMS_CARD_HISTORY);
    }

    /**
     * Create a detached, initialised CcmsCardHistoryRecord
     */
    public CcmsCardHistoryRecord(String cardNo, String employeeId, String active, String createdBy, LocalDateTime createdOn, String lastModifiedBy, LocalDateTime lastModifiedOn) {
        super(CcmsCardHistory.CCMS_CARD_HISTORY);

        setCardNo(cardNo);
        setEmployeeId(employeeId);
        setActive(active);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastModifiedBy(lastModifiedBy);
        setLastModifiedOn(lastModifiedOn);
    }
}