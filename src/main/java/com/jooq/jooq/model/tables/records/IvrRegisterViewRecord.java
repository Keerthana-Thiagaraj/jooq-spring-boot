/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.IvrRegisterView;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IvrRegisterViewRecord extends TableRecordImpl<IvrRegisterViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.TICKET_ID</code>.
     */
    public IvrRegisterViewRecord setTicketId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.TICKET_ID</code>.
     */
    public String getTicketId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.OPTION_ID</code>.
     */
    public IvrRegisterViewRecord setOptionId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.OPTION_ID</code>.
     */
    public Integer getOptionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.DIVISION_ID</code>.
     */
    public IvrRegisterViewRecord setDivisionId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.DIVISION_ID</code>.
     */
    public Integer getDivisionId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.OPTION_DESC</code>.
     */
    public IvrRegisterViewRecord setOptionDesc(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.OPTION_DESC</code>.
     */
    public String getOptionDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.DVISION_DESC</code>.
     */
    public IvrRegisterViewRecord setDvisionDesc(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.DVISION_DESC</code>.
     */
    public String getDvisionDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CUSTOMER_CODE</code>.
     */
    public IvrRegisterViewRecord setCustomerCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CUSTOMER_NAME</code>.
     */
    public IvrRegisterViewRecord setCustomerName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.MOBILE_NO</code>.
     */
    public IvrRegisterViewRecord setMobileNo(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.MOBILE_NO</code>.
     */
    public String getMobileNo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.PLANT_CODE</code>.
     */
    public IvrRegisterViewRecord setPlantCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.PLANT_NAME</code>.
     */
    public IvrRegisterViewRecord setPlantName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.PLANT_NAME</code>.
     */
    public String getPlantName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.REGISTERED_DATE</code>.
     */
    public IvrRegisterViewRecord setRegisteredDate(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.REGISTERED_DATE</code>.
     */
    public LocalDateTime getRegisteredDate() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.BUSINESS_TYPE</code>.
     */
    public IvrRegisterViewRecord setBusinessType(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.BUSINESS_TYPE</code>.
     */
    public String getBusinessType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.LANGUAGE</code>.
     */
    public IvrRegisterViewRecord setLanguage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.LANGUAGE</code>.
     */
    public String getLanguage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CREATED_ON</code>.
     */
    public IvrRegisterViewRecord setCreatedOn(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CREATED_BY</code>.
     */
    public IvrRegisterViewRecord setCreatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.STATUS</code>.
     */
    public IvrRegisterViewRecord setStatus(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CALL_STATUS</code>.
     */
    public IvrRegisterViewRecord setCallStatus(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CALL_STATUS</code>.
     */
    public String getCallStatus() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CALL_CATEGORY</code>.
     */
    public IvrRegisterViewRecord setCallCategory(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CALL_CATEGORY</code>.
     */
    public String getCallCategory() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.COMMENTS</code>.
     */
    public IvrRegisterViewRecord setComments(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.COMMENTS</code>.
     */
    public String getComments() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CC_MAIL_ID</code>.
     */
    public IvrRegisterViewRecord setCcMailId(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CC_MAIL_ID</code>.
     */
    public String getCcMailId() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.TO_MAIL_ID</code>.
     */
    public IvrRegisterViewRecord setToMailId(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.TO_MAIL_ID</code>.
     */
    public String getToMailId() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ACTION_TAKEN_DATE</code>.
     */
    public IvrRegisterViewRecord setActionTakenDate(LocalDate value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ACTION_TAKEN_DATE</code>.
     */
    public LocalDate getActionTakenDate() {
        return (LocalDate) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ACTION_TAKEN_PERSON</code>.
     */
    public IvrRegisterViewRecord setActionTakenPerson(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ACTION_TAKEN_PERSON</code>.
     */
    public String getActionTakenPerson() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ACTION_TAKEN_REPLY</code>.
     */
    public IvrRegisterViewRecord setActionTakenReply(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ACTION_TAKEN_REPLY</code>.
     */
    public String getActionTakenReply() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.REPLY_DATE</code>.
     */
    public IvrRegisterViewRecord setReplyDate(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.REPLY_DATE</code>.
     */
    public LocalDateTime getReplyDate() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.REPLY_PERSON</code>.
     */
    public IvrRegisterViewRecord setReplyPerson(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.REPLY_PERSON</code>.
     */
    public String getReplyPerson() {
        return (String) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.REPLY_STATUS</code>.
     */
    public IvrRegisterViewRecord setReplyStatus(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.REPLY_STATUS</code>.
     */
    public String getReplyStatus() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.HMB_CODE</code>.
     */
    public IvrRegisterViewRecord setHmbCode(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.HMB_CODE</code>.
     */
    public String getHmbCode() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.HMB_NAME</code>.
     */
    public IvrRegisterViewRecord setHmbName(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.HMB_NAME</code>.
     */
    public String getHmbName() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.P_CODE</code>.
     */
    public IvrRegisterViewRecord setPCode(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.P_CODE</code>.
     */
    public String getPCode() {
        return (String) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.RSM_NAME</code>.
     */
    public IvrRegisterViewRecord setRsmName(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.RSM_NAME</code>.
     */
    public String getRsmName() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.RSM_MOBILE</code>.
     */
    public IvrRegisterViewRecord setRsmMobile(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.RSM_MOBILE</code>.
     */
    public String getRsmMobile() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION1_DATE</code>.
     */
    public IvrRegisterViewRecord setEscalation1Date(LocalDateTime value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION1_DATE</code>.
     */
    public LocalDateTime getEscalation1Date() {
        return (LocalDateTime) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION1_TO_MAIL</code>.
     */
    public IvrRegisterViewRecord setEscalation1ToMail(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION1_TO_MAIL</code>.
     */
    public String getEscalation1ToMail() {
        return (String) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION1_CC_MAIL</code>.
     */
    public IvrRegisterViewRecord setEscalation1CcMail(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION1_CC_MAIL</code>.
     */
    public String getEscalation1CcMail() {
        return (String) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION2_DATE</code>.
     */
    public IvrRegisterViewRecord setEscalation2Date(LocalDateTime value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION2_DATE</code>.
     */
    public LocalDateTime getEscalation2Date() {
        return (LocalDateTime) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION2_TO_MAIL</code>.
     */
    public IvrRegisterViewRecord setEscalation2ToMail(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION2_TO_MAIL</code>.
     */
    public String getEscalation2ToMail() {
        return (String) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION2_CC_MAIL</code>.
     */
    public IvrRegisterViewRecord setEscalation2CcMail(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION2_CC_MAIL</code>.
     */
    public String getEscalation2CcMail() {
        return (String) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION3_DATE</code>.
     */
    public IvrRegisterViewRecord setEscalation3Date(LocalDateTime value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION3_DATE</code>.
     */
    public LocalDateTime getEscalation3Date() {
        return (LocalDateTime) get(38);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION3_TO_MAIL</code>.
     */
    public IvrRegisterViewRecord setEscalation3ToMail(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION3_TO_MAIL</code>.
     */
    public String getEscalation3ToMail() {
        return (String) get(39);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION3_CC_MAIL</code>.
     */
    public IvrRegisterViewRecord setEscalation3CcMail(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ESCALATION3_CC_MAIL</code>.
     */
    public String getEscalation3CcMail() {
        return (String) get(40);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ATTACHMENT_URL</code>.
     */
    public IvrRegisterViewRecord setAttachmentUrl(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ATTACHMENT_URL</code>.
     */
    public String getAttachmentUrl() {
        return (String) get(41);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ATTACHMENT_NAME</code>.
     */
    public IvrRegisterViewRecord setAttachmentName(String value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ATTACHMENT_NAME</code>.
     */
    public String getAttachmentName() {
        return (String) get(42);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ATTACHMENT_TYPE</code>.
     */
    public IvrRegisterViewRecord setAttachmentType(String value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ATTACHMENT_TYPE</code>.
     */
    public String getAttachmentType() {
        return (String) get(43);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.EDITED_DATE</code>.
     */
    public IvrRegisterViewRecord setEditedDate(LocalDateTime value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.EDITED_DATE</code>.
     */
    public LocalDateTime getEditedDate() {
        return (LocalDateTime) get(44);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.EDITED_BY</code>.
     */
    public IvrRegisterViewRecord setEditedBy(String value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.EDITED_BY</code>.
     */
    public String getEditedBy() {
        return (String) get(45);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.UPDATED_BY</code>.
     */
    public IvrRegisterViewRecord setUpdatedBy(String value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return (String) get(46);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.UPDATED_ON</code>.
     */
    public IvrRegisterViewRecord setUpdatedOn(LocalDateTime value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.UPDATED_ON</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(47);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CALL_TO</code>.
     */
    public IvrRegisterViewRecord setCallTo(String value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CALL_TO</code>.
     */
    public String getCallTo() {
        return (String) get(48);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CALL_TIME</code>.
     */
    public IvrRegisterViewRecord setCallTime(LocalDateTime value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CALL_TIME</code>.
     */
    public LocalDateTime getCallTime() {
        return (LocalDateTime) get(49);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.START_TIME</code>.
     */
    public IvrRegisterViewRecord setStartTime(LocalDateTime value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.START_TIME</code>.
     */
    public LocalDateTime getStartTime() {
        return (LocalDateTime) get(50);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.END_TIME</code>.
     */
    public IvrRegisterViewRecord setEndTime(LocalDateTime value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.END_TIME</code>.
     */
    public LocalDateTime getEndTime() {
        return (LocalDateTime) get(51);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.FROM_CALL</code>.
     */
    public IvrRegisterViewRecord setFromCall(Integer value) {
        set(52, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.FROM_CALL</code>.
     */
    public Integer getFromCall() {
        return (Integer) get(52);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.DIRECTION</code>.
     */
    public IvrRegisterViewRecord setDirection(String value) {
        set(53, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.DIRECTION</code>.
     */
    public String getDirection() {
        return (String) get(53);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.DURATION</code>.
     */
    public IvrRegisterViewRecord setDuration(Integer value) {
        set(54, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.DURATION</code>.
     */
    public Integer getDuration() {
        return (Integer) get(54);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CMUUID</code>.
     */
    public IvrRegisterViewRecord setCmuuid(String value) {
        set(55, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CMUUID</code>.
     */
    public String getCmuuid() {
        return (String) get(55);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CALL_RATE</code>.
     */
    public IvrRegisterViewRecord setCallRate(String value) {
        set(56, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CALL_RATE</code>.
     */
    public String getCallRate() {
        return (String) get(56);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.BALANCE</code>.
     */
    public IvrRegisterViewRecord setBalance(String value) {
        set(57, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.BALANCE</code>.
     */
    public String getBalance() {
        return (String) get(57);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CONVERSATION_UUID</code>.
     */
    public IvrRegisterViewRecord setConversationUuid(String value) {
        set(58, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CONVERSATION_UUID</code>.
     */
    public String getConversationUuid() {
        return (String) get(58);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.ANSWER_TIME</code>.
     */
    public IvrRegisterViewRecord setAnswerTime(LocalDateTime value) {
        set(59, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.ANSWER_TIME</code>.
     */
    public LocalDateTime getAnswerTime() {
        return (LocalDateTime) get(59);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.REQUEST_ID</code>.
     */
    public IvrRegisterViewRecord setRequestId(String value) {
        set(60, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.REQUEST_ID</code>.
     */
    public String getRequestId() {
        return (String) get(60);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.CALLER_ID</code>.
     */
    public IvrRegisterViewRecord setCallerId(Integer value) {
        set(61, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.CALLER_ID</code>.
     */
    public Integer getCallerId() {
        return (Integer) get(61);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.TYPE_CALL</code>.
     */
    public IvrRegisterViewRecord setTypeCall(String value) {
        set(62, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.TYPE_CALL</code>.
     */
    public String getTypeCall() {
        return (String) get(62);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.OUT_CALL</code>.
     */
    public IvrRegisterViewRecord setOutCall(String value) {
        set(63, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.OUT_CALL</code>.
     */
    public String getOutCall() {
        return (String) get(63);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.SAVE_FLAG</code>.
     */
    public IvrRegisterViewRecord setSaveFlag(String value) {
        set(64, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.SAVE_FLAG</code>.
     */
    public String getSaveFlag() {
        return (String) get(64);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.API_INIT</code>.
     */
    public IvrRegisterViewRecord setApiInit(String value) {
        set(65, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.API_INIT</code>.
     */
    public String getApiInit() {
        return (String) get(65);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.APP_ID</code>.
     */
    public IvrRegisterViewRecord setAppId(Integer value) {
        set(66, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.APP_ID</code>.
     */
    public Integer getAppId() {
        return (Integer) get(66);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.LEG</code>.
     */
    public IvrRegisterViewRecord setLeg(String value) {
        set(67, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.LEG</code>.
     */
    public String getLeg() {
        return (String) get(67);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.PO_NUMBER</code>.
     */
    public IvrRegisterViewRecord setPoNumber(String value) {
        set(68, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.PO_NUMBER</code>.
     */
    public String getPoNumber() {
        return (String) get(68);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.SUB_OPTION_ID</code>.
     */
    public IvrRegisterViewRecord setSubOptionId(Integer value) {
        set(69, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.SUB_OPTION_ID</code>.
     */
    public Integer getSubOptionId() {
        return (Integer) get(69);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.FIELD_STAFF_NAME</code>.
     */
    public IvrRegisterViewRecord setFieldStaffName(String value) {
        set(70, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.FIELD_STAFF_NAME</code>.
     */
    public String getFieldStaffName() {
        return (String) get(70);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.FIELD_STAFF_MOBILE</code>.
     */
    public IvrRegisterViewRecord setFieldStaffMobile(String value) {
        set(71, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.FIELD_STAFF_MOBILE</code>.
     */
    public String getFieldStaffMobile() {
        return (String) get(71);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.FIELD_STAFF_EMAIL</code>.
     */
    public IvrRegisterViewRecord setFieldStaffEmail(String value) {
        set(72, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.FIELD_STAFF_EMAIL</code>.
     */
    public String getFieldStaffEmail() {
        return (String) get(72);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.MENU</code>.
     */
    public IvrRegisterViewRecord setMenu(Integer value) {
        set(73, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.MENU</code>.
     */
    public Integer getMenu() {
        return (Integer) get(73);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.OPTION_NAME</code>.
     */
    public IvrRegisterViewRecord setOptionName(String value) {
        set(74, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.OPTION_NAME</code>.
     */
    public String getOptionName() {
        return (String) get(74);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.MENU_NAME</code>.
     */
    public IvrRegisterViewRecord setMenuName(String value) {
        set(75, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.MENU_NAME</code>.
     */
    public String getMenuName() {
        return (String) get(75);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.SUB_OPTION_NAME</code>.
     */
    public IvrRegisterViewRecord setSubOptionName(String value) {
        set(76, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.SUB_OPTION_NAME</code>.
     */
    public String getSubOptionName() {
        return (String) get(76);
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_register_view.AGING_DAYS</code>.
     */
    public IvrRegisterViewRecord setAgingDays(Integer value) {
        set(77, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_register_view.AGING_DAYS</code>.
     */
    public Integer getAgingDays() {
        return (Integer) get(77);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IvrRegisterViewRecord
     */
    public IvrRegisterViewRecord() {
        super(IvrRegisterView.IVR_REGISTER_VIEW);
    }

    /**
     * Create a detached, initialised IvrRegisterViewRecord
     */
    public IvrRegisterViewRecord(String ticketId, Integer optionId, Integer divisionId, String optionDesc, String dvisionDesc, String customerCode, String customerName, String mobileNo, String plantCode, String plantName, LocalDateTime registeredDate, String businessType, String language, LocalDateTime createdOn, String createdBy, String status, String callStatus, String callCategory, String comments, String ccMailId, String toMailId, LocalDate actionTakenDate, String actionTakenPerson, String actionTakenReply, LocalDateTime replyDate, String replyPerson, String replyStatus, String hmbCode, String hmbName, String pCode, String rsmName, String rsmMobile, LocalDateTime escalation1Date, String escalation1ToMail, String escalation1CcMail, LocalDateTime escalation2Date, String escalation2ToMail, String escalation2CcMail, LocalDateTime escalation3Date, String escalation3ToMail, String escalation3CcMail, String attachmentUrl, String attachmentName, String attachmentType, LocalDateTime editedDate, String editedBy, String updatedBy, LocalDateTime updatedOn, String callTo, LocalDateTime callTime, LocalDateTime startTime, LocalDateTime endTime, Integer fromCall, String direction, Integer duration, String cmuuid, String callRate, String balance, String conversationUuid, LocalDateTime answerTime, String requestId, Integer callerId, String typeCall, String outCall, String saveFlag, String apiInit, Integer appId, String leg, String poNumber, Integer subOptionId, String fieldStaffName, String fieldStaffMobile, String fieldStaffEmail, Integer menu, String optionName, String menuName, String subOptionName, Integer agingDays) {
        super(IvrRegisterView.IVR_REGISTER_VIEW);

        setTicketId(ticketId);
        setOptionId(optionId);
        setDivisionId(divisionId);
        setOptionDesc(optionDesc);
        setDvisionDesc(dvisionDesc);
        setCustomerCode(customerCode);
        setCustomerName(customerName);
        setMobileNo(mobileNo);
        setPlantCode(plantCode);
        setPlantName(plantName);
        setRegisteredDate(registeredDate);
        setBusinessType(businessType);
        setLanguage(language);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
        setStatus(status);
        setCallStatus(callStatus);
        setCallCategory(callCategory);
        setComments(comments);
        setCcMailId(ccMailId);
        setToMailId(toMailId);
        setActionTakenDate(actionTakenDate);
        setActionTakenPerson(actionTakenPerson);
        setActionTakenReply(actionTakenReply);
        setReplyDate(replyDate);
        setReplyPerson(replyPerson);
        setReplyStatus(replyStatus);
        setHmbCode(hmbCode);
        setHmbName(hmbName);
        setPCode(pCode);
        setRsmName(rsmName);
        setRsmMobile(rsmMobile);
        setEscalation1Date(escalation1Date);
        setEscalation1ToMail(escalation1ToMail);
        setEscalation1CcMail(escalation1CcMail);
        setEscalation2Date(escalation2Date);
        setEscalation2ToMail(escalation2ToMail);
        setEscalation2CcMail(escalation2CcMail);
        setEscalation3Date(escalation3Date);
        setEscalation3ToMail(escalation3ToMail);
        setEscalation3CcMail(escalation3CcMail);
        setAttachmentUrl(attachmentUrl);
        setAttachmentName(attachmentName);
        setAttachmentType(attachmentType);
        setEditedDate(editedDate);
        setEditedBy(editedBy);
        setUpdatedBy(updatedBy);
        setUpdatedOn(updatedOn);
        setCallTo(callTo);
        setCallTime(callTime);
        setStartTime(startTime);
        setEndTime(endTime);
        setFromCall(fromCall);
        setDirection(direction);
        setDuration(duration);
        setCmuuid(cmuuid);
        setCallRate(callRate);
        setBalance(balance);
        setConversationUuid(conversationUuid);
        setAnswerTime(answerTime);
        setRequestId(requestId);
        setCallerId(callerId);
        setTypeCall(typeCall);
        setOutCall(outCall);
        setSaveFlag(saveFlag);
        setApiInit(apiInit);
        setAppId(appId);
        setLeg(leg);
        setPoNumber(poNumber);
        setSubOptionId(subOptionId);
        setFieldStaffName(fieldStaffName);
        setFieldStaffMobile(fieldStaffMobile);
        setFieldStaffEmail(fieldStaffEmail);
        setMenu(menu);
        setOptionName(optionName);
        setMenuName(menuName);
        setSubOptionName(subOptionName);
        setAgingDays(agingDays);
    }
}