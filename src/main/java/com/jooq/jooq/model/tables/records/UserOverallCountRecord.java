/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.UserOverallCount;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserOverallCountRecord extends UpdatableRecordImpl<UserOverallCountRecord> implements Record10<Integer, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.SNO</code>.
     */
    public UserOverallCountRecord setSno(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.SNO</code>.
     */
    public Integer getSno() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.USER_TYPE</code>.
     */
    public UserOverallCountRecord setUserType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.USER_TYPE</code>.
     */
    public String getUserType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.USER_ACC_GRP_CODE</code>.
     */
    public UserOverallCountRecord setUserAccGrpCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.USER_ACC_GRP_CODE</code>.
     */
    public String getUserAccGrpCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.ACC_GRP_CODE_DESC</code>.
     */
    public UserOverallCountRecord setAccGrpCodeDesc(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.ACC_GRP_CODE_DESC</code>.
     */
    public String getAccGrpCodeDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.TOTAL_USERS</code>.
     */
    public UserOverallCountRecord setTotalUsers(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.TOTAL_USERS</code>.
     */
    public String getTotalUsers() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.CREATED_bY</code>.
     */
    public UserOverallCountRecord setCreatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.CREATED_bY</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.CREATED_ON</code>.
     */
    public UserOverallCountRecord setCreatedOn(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.CHANGED_BY</code>.
     */
    public UserOverallCountRecord setChangedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.CHANGED_BY</code>.
     */
    public String getChangedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.CHANGED_ON</code>.
     */
    public UserOverallCountRecord setChangedOn(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.CHANGED_ON</code>.
     */
    public LocalDateTime getChangedOn() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_overall_count.count</code>.
     */
    public UserOverallCountRecord setCount(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_overall_count.count</code>.
     */
    public String getCount() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserOverallCount.USER_OVERALL_COUNT.SNO;
    }

    @Override
    public Field<String> field2() {
        return UserOverallCount.USER_OVERALL_COUNT.USER_TYPE;
    }

    @Override
    public Field<String> field3() {
        return UserOverallCount.USER_OVERALL_COUNT.USER_ACC_GRP_CODE;
    }

    @Override
    public Field<String> field4() {
        return UserOverallCount.USER_OVERALL_COUNT.ACC_GRP_CODE_DESC;
    }

    @Override
    public Field<String> field5() {
        return UserOverallCount.USER_OVERALL_COUNT.TOTAL_USERS;
    }

    @Override
    public Field<String> field6() {
        return UserOverallCount.USER_OVERALL_COUNT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return UserOverallCount.USER_OVERALL_COUNT.CREATED_ON;
    }

    @Override
    public Field<String> field8() {
        return UserOverallCount.USER_OVERALL_COUNT.CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return UserOverallCount.USER_OVERALL_COUNT.CHANGED_ON;
    }

    @Override
    public Field<String> field10() {
        return UserOverallCount.USER_OVERALL_COUNT.COUNT;
    }

    @Override
    public Integer component1() {
        return getSno();
    }

    @Override
    public String component2() {
        return getUserType();
    }

    @Override
    public String component3() {
        return getUserAccGrpCode();
    }

    @Override
    public String component4() {
        return getAccGrpCodeDesc();
    }

    @Override
    public String component5() {
        return getTotalUsers();
    }

    @Override
    public String component6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedOn();
    }

    @Override
    public String component8() {
        return getChangedBy();
    }

    @Override
    public LocalDateTime component9() {
        return getChangedOn();
    }

    @Override
    public String component10() {
        return getCount();
    }

    @Override
    public Integer value1() {
        return getSno();
    }

    @Override
    public String value2() {
        return getUserType();
    }

    @Override
    public String value3() {
        return getUserAccGrpCode();
    }

    @Override
    public String value4() {
        return getAccGrpCodeDesc();
    }

    @Override
    public String value5() {
        return getTotalUsers();
    }

    @Override
    public String value6() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedOn();
    }

    @Override
    public String value8() {
        return getChangedBy();
    }

    @Override
    public LocalDateTime value9() {
        return getChangedOn();
    }

    @Override
    public String value10() {
        return getCount();
    }

    @Override
    public UserOverallCountRecord value1(Integer value) {
        setSno(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value2(String value) {
        setUserType(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value3(String value) {
        setUserAccGrpCode(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value4(String value) {
        setAccGrpCodeDesc(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value5(String value) {
        setTotalUsers(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value7(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value8(String value) {
        setChangedBy(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value9(LocalDateTime value) {
        setChangedOn(value);
        return this;
    }

    @Override
    public UserOverallCountRecord value10(String value) {
        setCount(value);
        return this;
    }

    @Override
    public UserOverallCountRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, LocalDateTime value7, String value8, LocalDateTime value9, String value10) {
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
     * Create a detached UserOverallCountRecord
     */
    public UserOverallCountRecord() {
        super(UserOverallCount.USER_OVERALL_COUNT);
    }

    /**
     * Create a detached, initialised UserOverallCountRecord
     */
    public UserOverallCountRecord(Integer sno, String userType, String userAccGrpCode, String accGrpCodeDesc, String totalUsers, String createdBy, LocalDateTime createdOn, String changedBy, LocalDateTime changedOn, String count) {
        super(UserOverallCount.USER_OVERALL_COUNT);

        setSno(sno);
        setUserType(userType);
        setUserAccGrpCode(userAccGrpCode);
        setAccGrpCodeDesc(accGrpCodeDesc);
        setTotalUsers(totalUsers);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setChangedBy(changedBy);
        setChangedOn(changedOn);
        setCount(count);
    }
}