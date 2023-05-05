/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CustomerBillAttachment;

import java.time.LocalDateTime;

import org.jooq.Record3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerBillAttachmentRecord extends UpdatableRecordImpl<CustomerBillAttachmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.COMP_CODE</code>.
     */
    public CustomerBillAttachmentRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.CUSTOMER_CODE</code>.
     */
    public CustomerBillAttachmentRecord setCustomerCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.CUSTOMER_NAME</code>.
     */
    public CustomerBillAttachmentRecord setCustomerName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.SERIAL_NO</code>.
     */
    public CustomerBillAttachmentRecord setSerialNo(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.RSM_ID</code>.
     */
    public CustomerBillAttachmentRecord setRsmId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.RSM_ID</code>.
     */
    public String getRsmId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.RSM_NAME</code>.
     */
    public CustomerBillAttachmentRecord setRsmName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.RSM_NAME</code>.
     */
    public String getRsmName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.BILL_MONTH</code>.
     */
    public CustomerBillAttachmentRecord setBillMonth(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.BILL_MONTH</code>.
     */
    public String getBillMonth() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.BILL_YEAR</code>.
     */
    public CustomerBillAttachmentRecord setBillYear(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.BILL_YEAR</code>.
     */
    public String getBillYear() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.BILL_TYPE</code>.
     */
    public CustomerBillAttachmentRecord setBillType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.BILL_TYPE</code>.
     */
    public String getBillType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT_NAME</code>.
     */
    public CustomerBillAttachmentRecord setAttachmentName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT_NAME</code>.
     */
    public String getAttachmentName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT_TYPE</code>.
     */
    public CustomerBillAttachmentRecord setAttachmentType(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT_TYPE</code>.
     */
    public String getAttachmentType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT</code>.
     */
    public CustomerBillAttachmentRecord setAttachment(byte[] value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHMENT</code>.
     */
    public byte[] getAttachment() {
        return (byte[]) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHED_DATETIME</code>.
     */
    public CustomerBillAttachmentRecord setAttachedDatetime(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.ATTACHED_DATETIME</code>.
     */
    public LocalDateTime getAttachedDatetime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.FLAG</code>.
     */
    public CustomerBillAttachmentRecord setFlag(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.FLAG</code>.
     */
    public String getFlag() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.DEVICE_TYPE</code>.
     */
    public CustomerBillAttachmentRecord setDeviceType(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.DEVICE_TYPE</code>.
     */
    public String getDeviceType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.OTHER_BILL_TYPE</code>.
     */
    public CustomerBillAttachmentRecord setOtherBillType(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.OTHER_BILL_TYPE</code>.
     */
    public String getOtherBillType() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.HOLD_REMARK</code>.
     */
    public CustomerBillAttachmentRecord setHoldRemark(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.HOLD_REMARK</code>.
     */
    public String getHoldRemark() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.REJECT_REMARK</code>.
     */
    public CustomerBillAttachmentRecord setRejectRemark(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.REJECT_REMARK</code>.
     */
    public String getRejectRemark() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.STATUS</code>.
     */
    public CustomerBillAttachmentRecord setStatus(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.CREATED_ON</code>.
     */
    public CustomerBillAttachmentRecord setCreatedOn(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.CREATED_BY</code>.
     */
    public CustomerBillAttachmentRecord setCreatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.CHANGED_ON</code>.
     */
    public CustomerBillAttachmentRecord setChangedOn(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.CHANGED_ON</code>.
     */
    public LocalDateTime getChangedOn() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.CHANGED_BY</code>.
     */
    public CustomerBillAttachmentRecord setChangedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.CHANGED_BY</code>.
     */
    public String getChangedBy() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.COMPLETED_BY</code>.
     */
    public CustomerBillAttachmentRecord setCompletedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.COMPLETED_BY</code>.
     */
    public String getCompletedBy() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_bill_attachment.COMPLETED_ON</code>.
     */
    public CustomerBillAttachmentRecord setCompletedOn(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_bill_attachment.COMPLETED_ON</code>.
     */
    public LocalDateTime getCompletedOn() {
        return (LocalDateTime) get(24);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerBillAttachmentRecord
     */
    public CustomerBillAttachmentRecord() {
        super(CustomerBillAttachment.CUSTOMER_BILL_ATTACHMENT);
    }

    /**
     * Create a detached, initialised CustomerBillAttachmentRecord
     */
    public CustomerBillAttachmentRecord(String compCode, String customerCode, String customerName, String serialNo, String rsmId, String rsmName, String billMonth, String billYear, String billType, String attachmentName, String attachmentType, byte[] attachment, LocalDateTime attachedDatetime, String flag, String deviceType, String otherBillType, String holdRemark, String rejectRemark, String status, LocalDateTime createdOn, String createdBy, LocalDateTime changedOn, String changedBy, String completedBy, LocalDateTime completedOn) {
        super(CustomerBillAttachment.CUSTOMER_BILL_ATTACHMENT);

        setCompCode(compCode);
        setCustomerCode(customerCode);
        setCustomerName(customerName);
        setSerialNo(serialNo);
        setRsmId(rsmId);
        setRsmName(rsmName);
        setBillMonth(billMonth);
        setBillYear(billYear);
        setBillType(billType);
        setAttachmentName(attachmentName);
        setAttachmentType(attachmentType);
        setAttachment(attachment);
        setAttachedDatetime(attachedDatetime);
        setFlag(flag);
        setDeviceType(deviceType);
        setOtherBillType(otherBillType);
        setHoldRemark(holdRemark);
        setRejectRemark(rejectRemark);
        setStatus(status);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
        setChangedOn(changedOn);
        setChangedBy(changedBy);
        setCompletedBy(completedBy);
        setCompletedOn(completedOn);
    }
}