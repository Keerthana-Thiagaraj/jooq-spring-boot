/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CustomerKycDetails;

import java.time.LocalDateTime;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerKycDetailsRecord extends UpdatableRecordImpl<CustomerKycDetailsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.CUSTOMER_CODE</code>.
     */
    public CustomerKycDetailsRecord setCustomerCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.SERIAL_NO</code>.
     */
    public CustomerKycDetailsRecord setSerialNo(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.CUSTOMER_NAME</code>.
     */
    public CustomerKycDetailsRecord setCustomerName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.PAN_NO</code>.
     */
    public CustomerKycDetailsRecord setPanNo(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.PAN_NO</code>.
     */
    public String getPanNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_NO</code>.
     */
    public CustomerKycDetailsRecord setAadharNo(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_NO</code>.
     */
    public String getAadharNo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.GST_NO</code>.
     */
    public CustomerKycDetailsRecord setGstNo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.GST_NO</code>.
     */
    public String getGstNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_NO</code>.
     */
    public CustomerKycDetailsRecord setFssaiNo(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_NO</code>.
     */
    public String getFssaiNo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.VALID_TO</code>.
     */
    public CustomerKycDetailsRecord setValidTo(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.VALID_TO</code>.
     */
    public LocalDateTime getValidTo() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.VALID_FROM</code>.
     */
    public CustomerKycDetailsRecord setValidFrom(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.VALID_FROM</code>.
     */
    public LocalDateTime getValidFrom() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.CREATED_BY</code>.
     */
    public CustomerKycDetailsRecord setCreatedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.CREATED_ON</code>.
     */
    public CustomerKycDetailsRecord setCreatedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.LAST_CHANGED_ON</code>.
     */
    public CustomerKycDetailsRecord setLastChangedOn(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.LAST_CHANGED_BY</code>.
     */
    public CustomerKycDetailsRecord setLastChangedBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.PAN_ATTACHMENT</code>.
     */
    public CustomerKycDetailsRecord setPanAttachment(byte[] value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.PAN_ATTACHMENT</code>.
     */
    public byte[] getPanAttachment() {
        return (byte[]) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.PAN_ATTACHMENT_TYPE</code>.
     */
    public CustomerKycDetailsRecord setPanAttachmentType(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.PAN_ATTACHMENT_TYPE</code>.
     */
    public String getPanAttachmentType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.PAN_ATTACHMENT_NAME</code>.
     */
    public CustomerKycDetailsRecord setPanAttachmentName(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.PAN_ATTACHMENT_NAME</code>.
     */
    public String getPanAttachmentName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_ATTACHMENT</code>.
     */
    public CustomerKycDetailsRecord setAadharAttachment(byte[] value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_ATTACHMENT</code>.
     */
    public byte[] getAadharAttachment() {
        return (byte[]) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_ATTACHMENT_TYPE</code>.
     */
    public CustomerKycDetailsRecord setAadharAttachmentType(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_ATTACHMENT_TYPE</code>.
     */
    public String getAadharAttachmentType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_ATTACHMENT_NAME</code>.
     */
    public CustomerKycDetailsRecord setAadharAttachmentName(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.AADHAR_ATTACHMENT_NAME</code>.
     */
    public String getAadharAttachmentName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.GST_ATTACHMENT</code>.
     */
    public CustomerKycDetailsRecord setGstAttachment(byte[] value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.GST_ATTACHMENT</code>.
     */
    public byte[] getGstAttachment() {
        return (byte[]) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.GST_ATTACHMENT_TYPE</code>.
     */
    public CustomerKycDetailsRecord setGstAttachmentType(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.GST_ATTACHMENT_TYPE</code>.
     */
    public String getGstAttachmentType() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.GST_ATTACHMENT_NAME</code>.
     */
    public CustomerKycDetailsRecord setGstAttachmentName(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.GST_ATTACHMENT_NAME</code>.
     */
    public String getGstAttachmentName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_ATTACHMENT</code>.
     */
    public CustomerKycDetailsRecord setFssaiAttachment(byte[] value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_ATTACHMENT</code>.
     */
    public byte[] getFssaiAttachment() {
        return (byte[]) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_ATTACHMENT_TYPE</code>.
     */
    public CustomerKycDetailsRecord setFssaiAttachmentType(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_ATTACHMENT_TYPE</code>.
     */
    public String getFssaiAttachmentType() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_ATTAMENT_NAME</code>.
     */
    public CustomerKycDetailsRecord setFssaiAttamentName(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_KYC_details.FSSAI_ATTAMENT_NAME</code>.
     */
    public String getFssaiAttamentName() {
        return (String) get(24);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerKycDetailsRecord
     */
    public CustomerKycDetailsRecord() {
        super(CustomerKycDetails.CUSTOMER_KYC_DETAILS);
    }

    /**
     * Create a detached, initialised CustomerKycDetailsRecord
     */
    public CustomerKycDetailsRecord(String customerCode, String serialNo, String customerName, String panNo, String aadharNo, String gstNo, String fssaiNo, LocalDateTime validTo, LocalDateTime validFrom, String createdBy, LocalDateTime createdOn, LocalDateTime lastChangedOn, String lastChangedBy, byte[] panAttachment, String panAttachmentType, String panAttachmentName, byte[] aadharAttachment, String aadharAttachmentType, String aadharAttachmentName, byte[] gstAttachment, String gstAttachmentType, String gstAttachmentName, byte[] fssaiAttachment, String fssaiAttachmentType, String fssaiAttamentName) {
        super(CustomerKycDetails.CUSTOMER_KYC_DETAILS);

        setCustomerCode(customerCode);
        setSerialNo(serialNo);
        setCustomerName(customerName);
        setPanNo(panNo);
        setAadharNo(aadharNo);
        setGstNo(gstNo);
        setFssaiNo(fssaiNo);
        setValidTo(validTo);
        setValidFrom(validFrom);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedOn(lastChangedOn);
        setLastChangedBy(lastChangedBy);
        setPanAttachment(panAttachment);
        setPanAttachmentType(panAttachmentType);
        setPanAttachmentName(panAttachmentName);
        setAadharAttachment(aadharAttachment);
        setAadharAttachmentType(aadharAttachmentType);
        setAadharAttachmentName(aadharAttachmentName);
        setGstAttachment(gstAttachment);
        setGstAttachmentType(gstAttachmentType);
        setGstAttachmentName(gstAttachmentName);
        setFssaiAttachment(fssaiAttachment);
        setFssaiAttachmentType(fssaiAttachmentType);
        setFssaiAttamentName(fssaiAttamentName);
    }
}
