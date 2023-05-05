/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.StockauditConfirmstock;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StockauditConfirmstockRecord extends UpdatableRecordImpl<StockauditConfirmstockRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.COMP_CODE</code>.
     */
    public StockauditConfirmstockRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.WERKS</code>.
     */
    public StockauditConfirmstockRecord setWerks(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.WERKS</code>.
     */
    public String getWerks() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.LGORT</code>.
     */
    public StockauditConfirmstockRecord setLgort(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.LGORT</code>.
     */
    public String getLgort() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR</code>.
     */
    public StockauditConfirmstockRecord setMatnr(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR</code>.
     */
    public String getMatnr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR_DESC</code>.
     */
    public StockauditConfirmstockRecord setMatnrDesc(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR_DESC</code>.
     */
    public String getMatnrDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.MEINS</code>.
     */
    public StockauditConfirmstockRecord setMeins(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.MEINS</code>.
     */
    public String getMeins() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CLABS</code>.
     */
    public StockauditConfirmstockRecord setClabs(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CLABS</code>.
     */
    public String getClabs() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.ERSDA</code>.
     */
    public StockauditConfirmstockRecord setErsda(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.ERSDA</code>.
     */
    public LocalDate getErsda() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.VFDAT</code>.
     */
    public StockauditConfirmstockRecord setVfdat(LocalDate value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.VFDAT</code>.
     */
    public LocalDate getVfdat() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_DATE</code>.
     */
    public StockauditConfirmstockRecord setConfirmedDate(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_DATE</code>.
     */
    public LocalDateTime getConfirmedDate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_BY</code>.
     */
    public StockauditConfirmstockRecord setConfirmedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_BY</code>.
     */
    public String getConfirmedBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_D_QTY</code>.
     */
    public StockauditConfirmstockRecord setConfirmedDQty(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_D_QTY</code>.
     */
    public String getConfirmedDQty() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.REMARKS</code>.
     */
    public StockauditConfirmstockRecord setRemarks(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.UNIT_PRICE</code>.
     */
    public StockauditConfirmstockRecord setUnitPrice(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.UNIT_PRICE</code>.
     */
    public String getUnitPrice() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_QTY</code>.
     */
    public StockauditConfirmstockRecord setDeviationQty(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_QTY</code>.
     */
    public String getDeviationQty() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_VALUE</code>.
     */
    public StockauditConfirmstockRecord setDeviationValue(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_VALUE</code>.
     */
    public String getDeviationValue() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.REASON</code>.
     */
    public StockauditConfirmstockRecord setReason(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.REASON</code>.
     */
    public String getReason() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_REMARKS</code>.
     */
    public StockauditConfirmstockRecord setCfaRemarks(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_REMARKS</code>.
     */
    public String getCfaRemarks() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_STATUS</code>.
     */
    public StockauditConfirmstockRecord setCfaStatus(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_STATUS</code>.
     */
    public String getCfaStatus() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_DATE</code>.
     */
    public StockauditConfirmstockRecord setCfaUpdatedDate(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_DATE</code>.
     */
    public LocalDateTime getCfaUpdatedDate() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_BY</code>.
     */
    public StockauditConfirmstockRecord setCfaUpdatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_BY</code>.
     */
    public String getCfaUpdatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_REMARKS</code>.
     */
    public StockauditConfirmstockRecord setAuditRemarks(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_REMARKS</code>.
     */
    public String getAuditRemarks() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_STATUS</code>.
     */
    public StockauditConfirmstockRecord setAuditStatus(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_STATUS</code>.
     */
    public String getAuditStatus() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_DATE</code>.
     */
    public StockauditConfirmstockRecord setAuditUpdatedDate(LocalDateTime value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_DATE</code>.
     */
    public LocalDateTime getAuditUpdatedDate() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_BY</code>.
     */
    public StockauditConfirmstockRecord setAuditUpdatedBy(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_BY</code>.
     */
    public String getAuditUpdatedBy() {
        return (String) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_STATUS</code>.
     */
    public StockauditConfirmstockRecord setSapStatus(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_STATUS</code>.
     */
    public String getSapStatus() {
        return (String) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_REF_NO</code>.
     */
    public StockauditConfirmstockRecord setSapRefNo(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_REF_NO</code>.
     */
    public String getSapRefNo() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_CODE</code>.
     */
    public StockauditConfirmstockRecord setVendorCode(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_NAME</code>.
     */
    public StockauditConfirmstockRecord setVendorName(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_NAME</code>.
     */
    public String getVendorName() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_CODE</code>.
     */
    public StockauditConfirmstockRecord setCustomerCode(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_NAME</code>.
     */
    public StockauditConfirmstockRecord setCustomerName(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_TYPE</code>.
     */
    public StockauditConfirmstockRecord setDamageType(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_TYPE</code>.
     */
    public String getDamageType() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_STATUS</code>.
     */
    public StockauditConfirmstockRecord setDamageStatus(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_STATUS</code>.
     */
    public String getDamageStatus() {
        return (String) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.GOOD</code>.
     */
    public StockauditConfirmstockRecord setGood(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.GOOD</code>.
     */
    public String getGood() {
        return (String) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_BY</code>.
     */
    public StockauditConfirmstockRecord setCreatedBy(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_ON</code>.
     */
    public StockauditConfirmstockRecord setCreatedOn(LocalDateTime value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.FACTORY_DAMEGE</code>.
     */
    public StockauditConfirmstockRecord setFactoryDamege(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.FACTORY_DAMEGE</code>.
     */
    public String getFactoryDamege() {
        return (String) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_HANDLING</code>.
     */
    public StockauditConfirmstockRecord setDamageHandling(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_HANDLING</code>.
     */
    public String getDamageHandling() {
        return (String) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.TRANSPORTER_DAMAGE</code>.
     */
    public StockauditConfirmstockRecord setTransporterDamage(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.TRANSPORTER_DAMAGE</code>.
     */
    public String getTransporterDamage() {
        return (String) get(38);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.OUTLET_RETURN_DAMAGE</code>.
     */
    public StockauditConfirmstockRecord setOutletReturnDamage(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.OUTLET_RETURN_DAMAGE</code>.
     */
    public String getOutletReturnDamage() {
        return (String) get(39);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_RECOVERED_FROM_CFA</code>.
     */
    public StockauditConfirmstockRecord setExpRecoveredFromCfa(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_RECOVERED_FROM_CFA</code>.
     */
    public String getExpRecoveredFromCfa() {
        return (String) get(40);
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_OTHERS</code>.
     */
    public StockauditConfirmstockRecord setExpOthers(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_OTHERS</code>.
     */
    public String getExpOthers() {
        return (String) get(41);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record7<String, String, String, String, LocalDate, String, LocalDateTime> key() {
        return (Record7) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StockauditConfirmstockRecord
     */
    public StockauditConfirmstockRecord() {
        super(StockauditConfirmstock.STOCKAUDIT_CONFIRMSTOCK);
    }

    /**
     * Create a detached, initialised StockauditConfirmstockRecord
     */
    public StockauditConfirmstockRecord(String compCode, String werks, String lgort, String matnr, String matnrDesc, String meins, String clabs, LocalDate ersda, LocalDate vfdat, LocalDateTime confirmedDate, String confirmedBy, String confirmedDQty, String remarks, String unitPrice, String deviationQty, String deviationValue, String reason, String cfaRemarks, String cfaStatus, LocalDateTime cfaUpdatedDate, String cfaUpdatedBy, String auditRemarks, String auditStatus, LocalDateTime auditUpdatedDate, String auditUpdatedBy, String sapStatus, String sapRefNo, String vendorCode, String vendorName, String customerCode, String customerName, String damageType, String damageStatus, String good, String createdBy, LocalDateTime createdOn, String factoryDamege, String damageHandling, String transporterDamage, String outletReturnDamage, String expRecoveredFromCfa, String expOthers) {
        super(StockauditConfirmstock.STOCKAUDIT_CONFIRMSTOCK);

        setCompCode(compCode);
        setWerks(werks);
        setLgort(lgort);
        setMatnr(matnr);
        setMatnrDesc(matnrDesc);
        setMeins(meins);
        setClabs(clabs);
        setErsda(ersda);
        setVfdat(vfdat);
        setConfirmedDate(confirmedDate);
        setConfirmedBy(confirmedBy);
        setConfirmedDQty(confirmedDQty);
        setRemarks(remarks);
        setUnitPrice(unitPrice);
        setDeviationQty(deviationQty);
        setDeviationValue(deviationValue);
        setReason(reason);
        setCfaRemarks(cfaRemarks);
        setCfaStatus(cfaStatus);
        setCfaUpdatedDate(cfaUpdatedDate);
        setCfaUpdatedBy(cfaUpdatedBy);
        setAuditRemarks(auditRemarks);
        setAuditStatus(auditStatus);
        setAuditUpdatedDate(auditUpdatedDate);
        setAuditUpdatedBy(auditUpdatedBy);
        setSapStatus(sapStatus);
        setSapRefNo(sapRefNo);
        setVendorCode(vendorCode);
        setVendorName(vendorName);
        setCustomerCode(customerCode);
        setCustomerName(customerName);
        setDamageType(damageType);
        setDamageStatus(damageStatus);
        setGood(good);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setFactoryDamege(factoryDamege);
        setDamageHandling(damageHandling);
        setTransporterDamage(transporterDamage);
        setOutletReturnDamage(outletReturnDamage);
        setExpRecoveredFromCfa(expRecoveredFromCfa);
        setExpOthers(expOthers);
    }
}