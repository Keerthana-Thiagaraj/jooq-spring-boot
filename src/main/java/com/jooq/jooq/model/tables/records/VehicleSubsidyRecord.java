/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.VehicleSubsidy;

import java.time.LocalDateTime;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VehicleSubsidyRecord extends UpdatableRecordImpl<VehicleSubsidyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.SERIAL_NO</code>.
     */
    public VehicleSubsidyRecord setSerialNo(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.TICKET_ID</code>.
     */
    public VehicleSubsidyRecord setTicketId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.TICKET_ID</code>.
     */
    public String getTicketId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.CUSTOMER_CODE</code>.
     */
    public VehicleSubsidyRecord setCustomerCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.CUSTOMER_NAME</code>.
     */
    public VehicleSubsidyRecord setCustomerName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.SUBSIDY_TYPE</code>.
     */
    public VehicleSubsidyRecord setSubsidyType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.SUBSIDY_TYPE</code>.
     */
    public String getSubsidyType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_NUMBER</code>.
     */
    public VehicleSubsidyRecord setVehicleNumber(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_NUMBER</code>.
     */
    public String getVehicleNumber() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_NUMBER</code>.
     */
    public VehicleSubsidyRecord setInsuranceNumber(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_NUMBER</code>.
     */
    public String getInsuranceNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_EXP_DATE</code>.
     */
    public VehicleSubsidyRecord setInsuranceExpDate(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_EXP_DATE</code>.
     */
    public LocalDateTime getInsuranceExpDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_NUMBER</code>.
     */
    public VehicleSubsidyRecord setRcBookNumber(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_NUMBER</code>.
     */
    public String getRcBookNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_FRONT_TYPE</code>.
     */
    public VehicleSubsidyRecord setVehicleFrontType(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_FRONT_TYPE</code>.
     */
    public String getVehicleFrontType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_FRONT_NAME</code>.
     */
    public VehicleSubsidyRecord setVehicleFrontName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_FRONT_NAME</code>.
     */
    public String getVehicleFrontName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_FRONT_URL</code>.
     */
    public VehicleSubsidyRecord setVehicleFrontUrl(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_FRONT_URL</code>.
     */
    public String getVehicleFrontUrl() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_BACK_TYPE</code>.
     */
    public VehicleSubsidyRecord setVehicleBackType(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_BACK_TYPE</code>.
     */
    public String getVehicleBackType() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_BACK_NAME</code>.
     */
    public VehicleSubsidyRecord setVehicleBackName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_BACK_NAME</code>.
     */
    public String getVehicleBackName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_BACK_URL</code>.
     */
    public VehicleSubsidyRecord setVehicleBackUrl(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.VEHICLE_BACK_URL</code>.
     */
    public String getVehicleBackUrl() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_NAME</code>.
     */
    public VehicleSubsidyRecord setRcBookName(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_NAME</code>.
     */
    public String getRcBookName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_URL</code>.
     */
    public VehicleSubsidyRecord setRcBookUrl(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_URL</code>.
     */
    public String getRcBookUrl() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_TYPE</code>.
     */
    public VehicleSubsidyRecord setRcBookType(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.RC_BOOK_TYPE</code>.
     */
    public String getRcBookType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_NAME</code>.
     */
    public VehicleSubsidyRecord setInsuranceName(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_NAME</code>.
     */
    public String getInsuranceName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_URL</code>.
     */
    public VehicleSubsidyRecord setInsuranceUrl(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_URL</code>.
     */
    public String getInsuranceUrl() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_TYPE</code>.
     */
    public VehicleSubsidyRecord setInsuranceType(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.INSURANCE_TYPE</code>.
     */
    public String getInsuranceType() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.KMS</code>.
     */
    public VehicleSubsidyRecord setKms(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.KMS</code>.
     */
    public String getKms() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.FROM_PLACE</code>.
     */
    public VehicleSubsidyRecord setFromPlace(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.FROM_PLACE</code>.
     */
    public String getFromPlace() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.TO_PLACE</code>.
     */
    public VehicleSubsidyRecord setToPlace(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.TO_PLACE</code>.
     */
    public String getToPlace() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.OPENING_DATE</code>.
     */
    public VehicleSubsidyRecord setOpeningDate(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.OPENING_DATE</code>.
     */
    public LocalDateTime getOpeningDate() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.OTHER_BRAND_VOLUME</code>.
     */
    public VehicleSubsidyRecord setOtherBrandVolume(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.OTHER_BRAND_VOLUME</code>.
     */
    public String getOtherBrandVolume() {
        return (String) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.EXPECTED_BRAND_VOLUME</code>.
     */
    public VehicleSubsidyRecord setExpectedBrandVolume(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.EXPECTED_BRAND_VOLUME</code>.
     */
    public String getExpectedBrandVolume() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.TOLL_PALAZA_NAME</code>.
     */
    public VehicleSubsidyRecord setTollPalazaName(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.TOLL_PALAZA_NAME</code>.
     */
    public String getTollPalazaName() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.TOLL_PALAZA_AMOUNT</code>.
     */
    public VehicleSubsidyRecord setTollPalazaAmount(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.TOLL_PALAZA_AMOUNT</code>.
     */
    public String getTollPalazaAmount() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.CREATED_ON</code>.
     */
    public VehicleSubsidyRecord setCreatedOn(LocalDateTime value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.CREATED_BY</code>.
     */
    public VehicleSubsidyRecord setCreatedBy(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.CURRENT_LPD</code>.
     */
    public VehicleSubsidyRecord setCurrentLpd(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.CURRENT_LPD</code>.
     */
    public String getCurrentLpd() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.EXPECTED_LPD</code>.
     */
    public VehicleSubsidyRecord setExpectedLpd(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.EXPECTED_LPD</code>.
     */
    public String getExpectedLpd() {
        return (String) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.REQUEST_AMOUNT</code>.
     */
    public VehicleSubsidyRecord setRequestAmount(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.REQUEST_AMOUNT</code>.
     */
    public String getRequestAmount() {
        return (String) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.APPROVAL_AMOUNT</code>.
     */
    public VehicleSubsidyRecord setApprovalAmount(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.APPROVAL_AMOUNT</code>.
     */
    public String getApprovalAmount() {
        return (String) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.REQUEST_BY</code>.
     */
    public VehicleSubsidyRecord setRequestBy(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.REQUEST_BY</code>.
     */
    public String getRequestBy() {
        return (String) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.REQUEST_ON</code>.
     */
    public VehicleSubsidyRecord setRequestOn(LocalDateTime value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.REQUEST_ON</code>.
     */
    public LocalDateTime getRequestOn() {
        return (LocalDateTime) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.APPEOVED_BY</code>.
     */
    public VehicleSubsidyRecord setAppeovedBy(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.APPEOVED_BY</code>.
     */
    public String getAppeovedBy() {
        return (String) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.vehicle_subsidy.APPROVED_ON</code>.
     */
    public VehicleSubsidyRecord setApprovedOn(LocalDateTime value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vehicle_subsidy.APPROVED_ON</code>.
     */
    public LocalDateTime getApprovedOn() {
        return (LocalDateTime) get(38);
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
     * Create a detached VehicleSubsidyRecord
     */
    public VehicleSubsidyRecord() {
        super(VehicleSubsidy.VEHICLE_SUBSIDY);
    }

    /**
     * Create a detached, initialised VehicleSubsidyRecord
     */
    public VehicleSubsidyRecord(String serialNo, String ticketId, String customerCode, String customerName, String subsidyType, String vehicleNumber, String insuranceNumber, LocalDateTime insuranceExpDate, String rcBookNumber, String vehicleFrontType, String vehicleFrontName, String vehicleFrontUrl, String vehicleBackType, String vehicleBackName, String vehicleBackUrl, String rcBookName, String rcBookUrl, String rcBookType, String insuranceName, String insuranceUrl, String insuranceType, String kms, String fromPlace, String toPlace, LocalDateTime openingDate, String otherBrandVolume, String expectedBrandVolume, String tollPalazaName, String tollPalazaAmount, LocalDateTime createdOn, String createdBy, String currentLpd, String expectedLpd, String requestAmount, String approvalAmount, String requestBy, LocalDateTime requestOn, String appeovedBy, LocalDateTime approvedOn) {
        super(VehicleSubsidy.VEHICLE_SUBSIDY);

        setSerialNo(serialNo);
        setTicketId(ticketId);
        setCustomerCode(customerCode);
        setCustomerName(customerName);
        setSubsidyType(subsidyType);
        setVehicleNumber(vehicleNumber);
        setInsuranceNumber(insuranceNumber);
        setInsuranceExpDate(insuranceExpDate);
        setRcBookNumber(rcBookNumber);
        setVehicleFrontType(vehicleFrontType);
        setVehicleFrontName(vehicleFrontName);
        setVehicleFrontUrl(vehicleFrontUrl);
        setVehicleBackType(vehicleBackType);
        setVehicleBackName(vehicleBackName);
        setVehicleBackUrl(vehicleBackUrl);
        setRcBookName(rcBookName);
        setRcBookUrl(rcBookUrl);
        setRcBookType(rcBookType);
        setInsuranceName(insuranceName);
        setInsuranceUrl(insuranceUrl);
        setInsuranceType(insuranceType);
        setKms(kms);
        setFromPlace(fromPlace);
        setToPlace(toPlace);
        setOpeningDate(openingDate);
        setOtherBrandVolume(otherBrandVolume);
        setExpectedBrandVolume(expectedBrandVolume);
        setTollPalazaName(tollPalazaName);
        setTollPalazaAmount(tollPalazaAmount);
        setCreatedOn(createdOn);
        setCreatedBy(createdBy);
        setCurrentLpd(currentLpd);
        setExpectedLpd(expectedLpd);
        setRequestAmount(requestAmount);
        setApprovalAmount(approvalAmount);
        setRequestBy(requestBy);
        setRequestOn(requestOn);
        setAppeovedBy(appeovedBy);
        setApprovedOn(approvedOn);
    }
}