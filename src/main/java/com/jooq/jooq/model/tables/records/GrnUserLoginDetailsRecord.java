/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.GrnUserLoginDetails;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GrnUserLoginDetailsRecord extends UpdatableRecordImpl<GrnUserLoginDetailsRecord> implements Record6<String, String, String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.USER_ID</code>.
     */
    public GrnUserLoginDetailsRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.SAP_USER_NAME</code>.
     */
    public GrnUserLoginDetailsRecord setSapUserName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.SAP_USER_NAME</code>.
     */
    public String getSapUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.PASSWORD</code>.
     */
    public GrnUserLoginDetailsRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.PASSWORD</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.STATUS</code>.
     */
    public GrnUserLoginDetailsRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_BY</code>.
     */
    public GrnUserLoginDetailsRecord setCreatedBy(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_ON</code>.
     */
    public GrnUserLoginDetailsRecord setCreatedOn(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS.SAP_USER_NAME;
    }

    @Override
    public Field<String> field3() {
        return GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS.STATUS;
    }

    @Override
    public Field<String> field5() {
        return GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS.CREATED_ON;
    }

    @Override
    public String component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getSapUserName();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public String component4() {
        return getStatus();
    }

    @Override
    public String component5() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedOn();
    }

    @Override
    public String value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getSapUserName();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public String value4() {
        return getStatus();
    }

    @Override
    public String value5() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedOn();
    }

    @Override
    public GrnUserLoginDetailsRecord value1(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public GrnUserLoginDetailsRecord value2(String value) {
        setSapUserName(value);
        return this;
    }

    @Override
    public GrnUserLoginDetailsRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public GrnUserLoginDetailsRecord value4(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public GrnUserLoginDetailsRecord value5(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GrnUserLoginDetailsRecord value6(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public GrnUserLoginDetailsRecord values(String value1, String value2, String value3, String value4, String value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GrnUserLoginDetailsRecord
     */
    public GrnUserLoginDetailsRecord() {
        super(GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS);
    }

    /**
     * Create a detached, initialised GrnUserLoginDetailsRecord
     */
    public GrnUserLoginDetailsRecord(String userId, String sapUserName, String password, String status, String createdBy, LocalDateTime createdOn) {
        super(GrnUserLoginDetails.GRN_USER_LOGIN_DETAILS);

        setUserId(userId);
        setSapUserName(sapUserName);
        setPassword(password);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
    }
}