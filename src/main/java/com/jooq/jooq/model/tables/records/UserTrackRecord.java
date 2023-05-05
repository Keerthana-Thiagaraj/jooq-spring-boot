/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.UserTrack;

import java.time.LocalDate;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record2;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserTrackRecord extends UpdatableRecordImpl<UserTrackRecord> implements Record13<String, String, String, Integer, String, String, LocalDate, LocalTime, LocalDate, LocalTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.user_track.SESSION_ID</code>.
     */
    public UserTrackRecord setSessionId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.SESSION_ID</code>.
     */
    public String getSessionId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_ID</code>.
     */
    public UserTrackRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_NAME</code>.
     */
    public UserTrackRecord setUserName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_NAME</code>.
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_TYPE_ID</code>.
     */
    public UserTrackRecord setUserTypeId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_TYPE_ID</code>.
     */
    public Integer getUserTypeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGIN_IP</code>.
     */
    public UserTrackRecord setLoginIp(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGIN_IP</code>.
     */
    public String getLoginIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.SERVER_IP</code>.
     */
    public UserTrackRecord setServerIp(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.SERVER_IP</code>.
     */
    public String getServerIp() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGIN_DATE</code>.
     */
    public UserTrackRecord setLoginDate(LocalDate value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGIN_DATE</code>.
     */
    public LocalDate getLoginDate() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGIN_TIME</code>.
     */
    public UserTrackRecord setLoginTime(LocalTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGIN_TIME</code>.
     */
    public LocalTime getLoginTime() {
        return (LocalTime) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGGED_DATE</code>.
     */
    public UserTrackRecord setLoggedDate(LocalDate value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGGED_DATE</code>.
     */
    public LocalDate getLoggedDate() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.LOGGED_TIME</code>.
     */
    public UserTrackRecord setLoggedTime(LocalTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.LOGGED_TIME</code>.
     */
    public LocalTime getLoggedTime() {
        return (LocalTime) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_FLAG</code>.
     */
    public UserTrackRecord setUserFlag(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_FLAG</code>.
     */
    public String getUserFlag() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.ACC_GRP_CODE</code>.
     */
    public UserTrackRecord setAccGrpCode(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.ACC_GRP_CODE</code>.
     */
    public String getAccGrpCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.user_track.USER_GRP_CODE</code>.
     */
    public UserTrackRecord setUserGrpCode(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.user_track.USER_GRP_CODE</code>.
     */
    public String getUserGrpCode() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, Integer, String, String, LocalDate, LocalTime, LocalDate, LocalTime, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, String, Integer, String, String, LocalDate, LocalTime, LocalDate, LocalTime, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UserTrack.USER_TRACK.SESSION_ID;
    }

    @Override
    public Field<String> field2() {
        return UserTrack.USER_TRACK.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return UserTrack.USER_TRACK.USER_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return UserTrack.USER_TRACK.USER_TYPE_ID;
    }

    @Override
    public Field<String> field5() {
        return UserTrack.USER_TRACK.LOGIN_IP;
    }

    @Override
    public Field<String> field6() {
        return UserTrack.USER_TRACK.SERVER_IP;
    }

    @Override
    public Field<LocalDate> field7() {
        return UserTrack.USER_TRACK.LOGIN_DATE;
    }

    @Override
    public Field<LocalTime> field8() {
        return UserTrack.USER_TRACK.LOGIN_TIME;
    }

    @Override
    public Field<LocalDate> field9() {
        return UserTrack.USER_TRACK.LOGGED_DATE;
    }

    @Override
    public Field<LocalTime> field10() {
        return UserTrack.USER_TRACK.LOGGED_TIME;
    }

    @Override
    public Field<String> field11() {
        return UserTrack.USER_TRACK.USER_FLAG;
    }

    @Override
    public Field<String> field12() {
        return UserTrack.USER_TRACK.ACC_GRP_CODE;
    }

    @Override
    public Field<String> field13() {
        return UserTrack.USER_TRACK.USER_GRP_CODE;
    }

    @Override
    public String component1() {
        return getSessionId();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getUserName();
    }

    @Override
    public Integer component4() {
        return getUserTypeId();
    }

    @Override
    public String component5() {
        return getLoginIp();
    }

    @Override
    public String component6() {
        return getServerIp();
    }

    @Override
    public LocalDate component7() {
        return getLoginDate();
    }

    @Override
    public LocalTime component8() {
        return getLoginTime();
    }

    @Override
    public LocalDate component9() {
        return getLoggedDate();
    }

    @Override
    public LocalTime component10() {
        return getLoggedTime();
    }

    @Override
    public String component11() {
        return getUserFlag();
    }

    @Override
    public String component12() {
        return getAccGrpCode();
    }

    @Override
    public String component13() {
        return getUserGrpCode();
    }

    @Override
    public String value1() {
        return getSessionId();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getUserName();
    }

    @Override
    public Integer value4() {
        return getUserTypeId();
    }

    @Override
    public String value5() {
        return getLoginIp();
    }

    @Override
    public String value6() {
        return getServerIp();
    }

    @Override
    public LocalDate value7() {
        return getLoginDate();
    }

    @Override
    public LocalTime value8() {
        return getLoginTime();
    }

    @Override
    public LocalDate value9() {
        return getLoggedDate();
    }

    @Override
    public LocalTime value10() {
        return getLoggedTime();
    }

    @Override
    public String value11() {
        return getUserFlag();
    }

    @Override
    public String value12() {
        return getAccGrpCode();
    }

    @Override
    public String value13() {
        return getUserGrpCode();
    }

    @Override
    public UserTrackRecord value1(String value) {
        setSessionId(value);
        return this;
    }

    @Override
    public UserTrackRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserTrackRecord value3(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public UserTrackRecord value4(Integer value) {
        setUserTypeId(value);
        return this;
    }

    @Override
    public UserTrackRecord value5(String value) {
        setLoginIp(value);
        return this;
    }

    @Override
    public UserTrackRecord value6(String value) {
        setServerIp(value);
        return this;
    }

    @Override
    public UserTrackRecord value7(LocalDate value) {
        setLoginDate(value);
        return this;
    }

    @Override
    public UserTrackRecord value8(LocalTime value) {
        setLoginTime(value);
        return this;
    }

    @Override
    public UserTrackRecord value9(LocalDate value) {
        setLoggedDate(value);
        return this;
    }

    @Override
    public UserTrackRecord value10(LocalTime value) {
        setLoggedTime(value);
        return this;
    }

    @Override
    public UserTrackRecord value11(String value) {
        setUserFlag(value);
        return this;
    }

    @Override
    public UserTrackRecord value12(String value) {
        setAccGrpCode(value);
        return this;
    }

    @Override
    public UserTrackRecord value13(String value) {
        setUserGrpCode(value);
        return this;
    }

    @Override
    public UserTrackRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, LocalDate value7, LocalTime value8, LocalDate value9, LocalTime value10, String value11, String value12, String value13) {
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
     * Create a detached UserTrackRecord
     */
    public UserTrackRecord() {
        super(UserTrack.USER_TRACK);
    }

    /**
     * Create a detached, initialised UserTrackRecord
     */
    public UserTrackRecord(String sessionId, String userId, String userName, Integer userTypeId, String loginIp, String serverIp, LocalDate loginDate, LocalTime loginTime, LocalDate loggedDate, LocalTime loggedTime, String userFlag, String accGrpCode, String userGrpCode) {
        super(UserTrack.USER_TRACK);

        setSessionId(sessionId);
        setUserId(userId);
        setUserName(userName);
        setUserTypeId(userTypeId);
        setLoginIp(loginIp);
        setServerIp(serverIp);
        setLoginDate(loginDate);
        setLoginTime(loginTime);
        setLoggedDate(loggedDate);
        setLoggedTime(loggedTime);
        setUserFlag(userFlag);
        setAccGrpCode(accGrpCode);
        setUserGrpCode(userGrpCode);
    }
}