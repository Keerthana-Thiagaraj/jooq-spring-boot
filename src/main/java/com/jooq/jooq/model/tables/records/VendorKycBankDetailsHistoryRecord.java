/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.VendorKycBankDetailsHistory;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Record3;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VendorKycBankDetailsHistoryRecord extends UpdatableRecordImpl<VendorKycBankDetailsHistoryRecord> implements Record19<String, String, String, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, String, byte[], String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.VENDOR_CODE</code>.
     */
    public VendorKycBankDetailsHistoryRecord setVendorCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ACCOUNT_NO</code>.
     */
    public VendorKycBankDetailsHistoryRecord setAccountNo(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ACCOUNT_NO</code>.
     */
    public String getAccountNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BANK_NAME</code>.
     */
    public VendorKycBankDetailsHistoryRecord setBankName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BANK_NAME</code>.
     */
    public String getBankName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BRANCH_NAME</code>.
     */
    public VendorKycBankDetailsHistoryRecord setBranchName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BRANCH_NAME</code>.
     */
    public String getBranchName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.IFSC_CODE</code>.
     */
    public VendorKycBankDetailsHistoryRecord setIfscCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.IFSC_CODE</code>.
     */
    public String getIfscCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BANK_CITY</code>.
     */
    public VendorKycBankDetailsHistoryRecord setBankCity(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BANK_CITY</code>.
     */
    public String getBankCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BANK_COUNTRY</code>.
     */
    public VendorKycBankDetailsHistoryRecord setBankCountry(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.BANK_COUNTRY</code>.
     */
    public String getBankCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.SWIFT_CODE</code>.
     */
    public VendorKycBankDetailsHistoryRecord setSwiftCode(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.SWIFT_CODE</code>.
     */
    public String getSwiftCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.IBAN_CODE</code>.
     */
    public VendorKycBankDetailsHistoryRecord setIbanCode(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.IBAN_CODE</code>.
     */
    public String getIbanCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.CREATED_BY</code>.
     */
    public VendorKycBankDetailsHistoryRecord setCreatedBy(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.CREATED_ON</code>.
     */
    public VendorKycBankDetailsHistoryRecord setCreatedOn(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.LAST_CHANGED_BY</code>.
     */
    public VendorKycBankDetailsHistoryRecord setLastChangedBy(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.LAST_CHANGED_ON</code>.
     */
    public VendorKycBankDetailsHistoryRecord setLastChangedOn(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ATTACHMENT_NAME</code>.
     */
    public VendorKycBankDetailsHistoryRecord setAttachmentName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ATTACHMENT_NAME</code>.
     */
    public String getAttachmentName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ATTACHMENT_CONTENT_TYPE</code>.
     */
    public VendorKycBankDetailsHistoryRecord setAttachmentContentType(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ATTACHMENT_CONTENT_TYPE</code>.
     */
    public String getAttachmentContentType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ATTACHMENT</code>.
     */
    public VendorKycBankDetailsHistoryRecord setAttachment(byte[] value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.ATTACHMENT</code>.
     */
    public byte[] getAttachment() {
        return (byte[]) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.KYC_BANK_DECLARATION_NAME</code>.
     */
    public VendorKycBankDetailsHistoryRecord setKycBankDeclarationName(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.KYC_BANK_DECLARATION_NAME</code>.
     */
    public String getKycBankDeclarationName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.KYC_BANK_DECLARATION_NO</code>.
     */
    public VendorKycBankDetailsHistoryRecord setKycBankDeclarationNo(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.KYC_BANK_DECLARATION_NO</code>.
     */
    public String getKycBankDeclarationNo() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.LAST_EDITED_ON</code>.
     */
    public VendorKycBankDetailsHistoryRecord setLastEditedOn(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_kyc_bank_details_history.LAST_EDITED_ON</code>.
     */
    public LocalDateTime getLastEditedOn() {
        return (LocalDateTime) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<LocalDateTime, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, String, byte[], String, String, LocalDateTime> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<String, String, String, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime, String, String, byte[], String, String, LocalDateTime> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.VENDOR_CODE;
    }

    @Override
    public Field<String> field2() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.ACCOUNT_NO;
    }

    @Override
    public Field<String> field3() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.BANK_NAME;
    }

    @Override
    public Field<String> field4() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.BRANCH_NAME;
    }

    @Override
    public Field<String> field5() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.IFSC_CODE;
    }

    @Override
    public Field<String> field6() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.BANK_CITY;
    }

    @Override
    public Field<String> field7() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.BANK_COUNTRY;
    }

    @Override
    public Field<String> field8() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.SWIFT_CODE;
    }

    @Override
    public Field<String> field9() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.IBAN_CODE;
    }

    @Override
    public Field<String> field10() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.CREATED_ON;
    }

    @Override
    public Field<String> field12() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.LAST_CHANGED_ON;
    }

    @Override
    public Field<String> field14() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.ATTACHMENT_NAME;
    }

    @Override
    public Field<String> field15() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.ATTACHMENT_CONTENT_TYPE;
    }

    @Override
    public Field<byte[]> field16() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.ATTACHMENT;
    }

    @Override
    public Field<String> field17() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.KYC_BANK_DECLARATION_NAME;
    }

    @Override
    public Field<String> field18() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.KYC_BANK_DECLARATION_NO;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY.LAST_EDITED_ON;
    }

    @Override
    public String component1() {
        return getVendorCode();
    }

    @Override
    public String component2() {
        return getAccountNo();
    }

    @Override
    public String component3() {
        return getBankName();
    }

    @Override
    public String component4() {
        return getBranchName();
    }

    @Override
    public String component5() {
        return getIfscCode();
    }

    @Override
    public String component6() {
        return getBankCity();
    }

    @Override
    public String component7() {
        return getBankCountry();
    }

    @Override
    public String component8() {
        return getSwiftCode();
    }

    @Override
    public String component9() {
        return getIbanCode();
    }

    @Override
    public String component10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component11() {
        return getCreatedOn();
    }

    @Override
    public String component12() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component13() {
        return getLastChangedOn();
    }

    @Override
    public String component14() {
        return getAttachmentName();
    }

    @Override
    public String component15() {
        return getAttachmentContentType();
    }

    @Override
    public byte[] component16() {
        return getAttachment();
    }

    @Override
    public String component17() {
        return getKycBankDeclarationName();
    }

    @Override
    public String component18() {
        return getKycBankDeclarationNo();
    }

    @Override
    public LocalDateTime component19() {
        return getLastEditedOn();
    }

    @Override
    public String value1() {
        return getVendorCode();
    }

    @Override
    public String value2() {
        return getAccountNo();
    }

    @Override
    public String value3() {
        return getBankName();
    }

    @Override
    public String value4() {
        return getBranchName();
    }

    @Override
    public String value5() {
        return getIfscCode();
    }

    @Override
    public String value6() {
        return getBankCity();
    }

    @Override
    public String value7() {
        return getBankCountry();
    }

    @Override
    public String value8() {
        return getSwiftCode();
    }

    @Override
    public String value9() {
        return getIbanCode();
    }

    @Override
    public String value10() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value11() {
        return getCreatedOn();
    }

    @Override
    public String value12() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value13() {
        return getLastChangedOn();
    }

    @Override
    public String value14() {
        return getAttachmentName();
    }

    @Override
    public String value15() {
        return getAttachmentContentType();
    }

    @Override
    public byte[] value16() {
        return getAttachment();
    }

    @Override
    public String value17() {
        return getKycBankDeclarationName();
    }

    @Override
    public String value18() {
        return getKycBankDeclarationNo();
    }

    @Override
    public LocalDateTime value19() {
        return getLastEditedOn();
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value1(String value) {
        setVendorCode(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value2(String value) {
        setAccountNo(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value3(String value) {
        setBankName(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value4(String value) {
        setBranchName(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value5(String value) {
        setIfscCode(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value6(String value) {
        setBankCity(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value7(String value) {
        setBankCountry(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value8(String value) {
        setSwiftCode(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value9(String value) {
        setIbanCode(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value10(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value11(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value12(String value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value13(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value14(String value) {
        setAttachmentName(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value15(String value) {
        setAttachmentContentType(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value16(byte[] value) {
        setAttachment(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value17(String value) {
        setKycBankDeclarationName(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value18(String value) {
        setKycBankDeclarationNo(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord value19(LocalDateTime value) {
        setLastEditedOn(value);
        return this;
    }

    @Override
    public VendorKycBankDetailsHistoryRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13, String value14, String value15, byte[] value16, String value17, String value18, LocalDateTime value19) {
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
     * Create a detached VendorKycBankDetailsHistoryRecord
     */
    public VendorKycBankDetailsHistoryRecord() {
        super(VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY);
    }

    /**
     * Create a detached, initialised VendorKycBankDetailsHistoryRecord
     */
    public VendorKycBankDetailsHistoryRecord(String vendorCode, String accountNo, String bankName, String branchName, String ifscCode, String bankCity, String bankCountry, String swiftCode, String ibanCode, String createdBy, LocalDateTime createdOn, String lastChangedBy, LocalDateTime lastChangedOn, String attachmentName, String attachmentContentType, byte[] attachment, String kycBankDeclarationName, String kycBankDeclarationNo, LocalDateTime lastEditedOn) {
        super(VendorKycBankDetailsHistory.VENDOR_KYC_BANK_DETAILS_HISTORY);

        setVendorCode(vendorCode);
        setAccountNo(accountNo);
        setBankName(bankName);
        setBranchName(branchName);
        setIfscCode(ifscCode);
        setBankCity(bankCity);
        setBankCountry(bankCountry);
        setSwiftCode(swiftCode);
        setIbanCode(ibanCode);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setAttachmentName(attachmentName);
        setAttachmentContentType(attachmentContentType);
        setAttachment(attachment);
        setKycBankDeclarationName(kycBankDeclarationName);
        setKycBankDeclarationNo(kycBankDeclarationNo);
        setLastEditedOn(lastEditedOn);
    }
}
