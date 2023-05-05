/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StockauditConfirmstock implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        werks;
    private String        lgort;
    private String        matnr;
    private String        matnrDesc;
    private String        meins;
    private String        clabs;
    private LocalDate     ersda;
    private LocalDate     vfdat;
    private LocalDateTime confirmedDate;
    private String        confirmedBy;
    private String        confirmedDQty;
    private String        remarks;
    private String        unitPrice;
    private String        deviationQty;
    private String        deviationValue;
    private String        reason;
    private String        cfaRemarks;
    private String        cfaStatus;
    private LocalDateTime cfaUpdatedDate;
    private String        cfaUpdatedBy;
    private String        auditRemarks;
    private String        auditStatus;
    private LocalDateTime auditUpdatedDate;
    private String        auditUpdatedBy;
    private String        sapStatus;
    private String        sapRefNo;
    private String        vendorCode;
    private String        vendorName;
    private String        customerCode;
    private String        customerName;
    private String        damageType;
    private String        damageStatus;
    private String        good;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        factoryDamege;
    private String        damageHandling;
    private String        transporterDamage;
    private String        outletReturnDamage;
    private String        expRecoveredFromCfa;
    private String        expOthers;

    public StockauditConfirmstock() {}

    public StockauditConfirmstock(StockauditConfirmstock value) {
        this.compCode = value.compCode;
        this.werks = value.werks;
        this.lgort = value.lgort;
        this.matnr = value.matnr;
        this.matnrDesc = value.matnrDesc;
        this.meins = value.meins;
        this.clabs = value.clabs;
        this.ersda = value.ersda;
        this.vfdat = value.vfdat;
        this.confirmedDate = value.confirmedDate;
        this.confirmedBy = value.confirmedBy;
        this.confirmedDQty = value.confirmedDQty;
        this.remarks = value.remarks;
        this.unitPrice = value.unitPrice;
        this.deviationQty = value.deviationQty;
        this.deviationValue = value.deviationValue;
        this.reason = value.reason;
        this.cfaRemarks = value.cfaRemarks;
        this.cfaStatus = value.cfaStatus;
        this.cfaUpdatedDate = value.cfaUpdatedDate;
        this.cfaUpdatedBy = value.cfaUpdatedBy;
        this.auditRemarks = value.auditRemarks;
        this.auditStatus = value.auditStatus;
        this.auditUpdatedDate = value.auditUpdatedDate;
        this.auditUpdatedBy = value.auditUpdatedBy;
        this.sapStatus = value.sapStatus;
        this.sapRefNo = value.sapRefNo;
        this.vendorCode = value.vendorCode;
        this.vendorName = value.vendorName;
        this.customerCode = value.customerCode;
        this.customerName = value.customerName;
        this.damageType = value.damageType;
        this.damageStatus = value.damageStatus;
        this.good = value.good;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.factoryDamege = value.factoryDamege;
        this.damageHandling = value.damageHandling;
        this.transporterDamage = value.transporterDamage;
        this.outletReturnDamage = value.outletReturnDamage;
        this.expRecoveredFromCfa = value.expRecoveredFromCfa;
        this.expOthers = value.expOthers;
    }

    public StockauditConfirmstock(
        String        compCode,
        String        werks,
        String        lgort,
        String        matnr,
        String        matnrDesc,
        String        meins,
        String        clabs,
        LocalDate     ersda,
        LocalDate     vfdat,
        LocalDateTime confirmedDate,
        String        confirmedBy,
        String        confirmedDQty,
        String        remarks,
        String        unitPrice,
        String        deviationQty,
        String        deviationValue,
        String        reason,
        String        cfaRemarks,
        String        cfaStatus,
        LocalDateTime cfaUpdatedDate,
        String        cfaUpdatedBy,
        String        auditRemarks,
        String        auditStatus,
        LocalDateTime auditUpdatedDate,
        String        auditUpdatedBy,
        String        sapStatus,
        String        sapRefNo,
        String        vendorCode,
        String        vendorName,
        String        customerCode,
        String        customerName,
        String        damageType,
        String        damageStatus,
        String        good,
        String        createdBy,
        LocalDateTime createdOn,
        String        factoryDamege,
        String        damageHandling,
        String        transporterDamage,
        String        outletReturnDamage,
        String        expRecoveredFromCfa,
        String        expOthers
    ) {
        this.compCode = compCode;
        this.werks = werks;
        this.lgort = lgort;
        this.matnr = matnr;
        this.matnrDesc = matnrDesc;
        this.meins = meins;
        this.clabs = clabs;
        this.ersda = ersda;
        this.vfdat = vfdat;
        this.confirmedDate = confirmedDate;
        this.confirmedBy = confirmedBy;
        this.confirmedDQty = confirmedDQty;
        this.remarks = remarks;
        this.unitPrice = unitPrice;
        this.deviationQty = deviationQty;
        this.deviationValue = deviationValue;
        this.reason = reason;
        this.cfaRemarks = cfaRemarks;
        this.cfaStatus = cfaStatus;
        this.cfaUpdatedDate = cfaUpdatedDate;
        this.cfaUpdatedBy = cfaUpdatedBy;
        this.auditRemarks = auditRemarks;
        this.auditStatus = auditStatus;
        this.auditUpdatedDate = auditUpdatedDate;
        this.auditUpdatedBy = auditUpdatedBy;
        this.sapStatus = sapStatus;
        this.sapRefNo = sapRefNo;
        this.vendorCode = vendorCode;
        this.vendorName = vendorName;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.damageType = damageType;
        this.damageStatus = damageStatus;
        this.good = good;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.factoryDamege = factoryDamege;
        this.damageHandling = damageHandling;
        this.transporterDamage = transporterDamage;
        this.outletReturnDamage = outletReturnDamage;
        this.expRecoveredFromCfa = expRecoveredFromCfa;
        this.expOthers = expOthers;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.COMP_CODE</code>.
     */
    public StockauditConfirmstock setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.WERKS</code>.
     */
    public String getWerks() {
        return this.werks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.WERKS</code>.
     */
    public StockauditConfirmstock setWerks(String werks) {
        this.werks = werks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.LGORT</code>.
     */
    public String getLgort() {
        return this.lgort;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.LGORT</code>.
     */
    public StockauditConfirmstock setLgort(String lgort) {
        this.lgort = lgort;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR</code>.
     */
    public String getMatnr() {
        return this.matnr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR</code>.
     */
    public StockauditConfirmstock setMatnr(String matnr) {
        this.matnr = matnr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR_DESC</code>.
     */
    public String getMatnrDesc() {
        return this.matnrDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.MATNR_DESC</code>.
     */
    public StockauditConfirmstock setMatnrDesc(String matnrDesc) {
        this.matnrDesc = matnrDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.MEINS</code>.
     */
    public String getMeins() {
        return this.meins;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.MEINS</code>.
     */
    public StockauditConfirmstock setMeins(String meins) {
        this.meins = meins;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CLABS</code>.
     */
    public String getClabs() {
        return this.clabs;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CLABS</code>.
     */
    public StockauditConfirmstock setClabs(String clabs) {
        this.clabs = clabs;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.ERSDA</code>.
     */
    public LocalDate getErsda() {
        return this.ersda;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.ERSDA</code>.
     */
    public StockauditConfirmstock setErsda(LocalDate ersda) {
        this.ersda = ersda;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.VFDAT</code>.
     */
    public LocalDate getVfdat() {
        return this.vfdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.VFDAT</code>.
     */
    public StockauditConfirmstock setVfdat(LocalDate vfdat) {
        this.vfdat = vfdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_DATE</code>.
     */
    public LocalDateTime getConfirmedDate() {
        return this.confirmedDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_DATE</code>.
     */
    public StockauditConfirmstock setConfirmedDate(LocalDateTime confirmedDate) {
        this.confirmedDate = confirmedDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_BY</code>.
     */
    public String getConfirmedBy() {
        return this.confirmedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_BY</code>.
     */
    public StockauditConfirmstock setConfirmedBy(String confirmedBy) {
        this.confirmedBy = confirmedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_D_QTY</code>.
     */
    public String getConfirmedDQty() {
        return this.confirmedDQty;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CONFIRMED_D_QTY</code>.
     */
    public StockauditConfirmstock setConfirmedDQty(String confirmedDQty) {
        this.confirmedDQty = confirmedDQty;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.REMARKS</code>.
     */
    public StockauditConfirmstock setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.UNIT_PRICE</code>.
     */
    public String getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.UNIT_PRICE</code>.
     */
    public StockauditConfirmstock setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_QTY</code>.
     */
    public String getDeviationQty() {
        return this.deviationQty;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_QTY</code>.
     */
    public StockauditConfirmstock setDeviationQty(String deviationQty) {
        this.deviationQty = deviationQty;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_VALUE</code>.
     */
    public String getDeviationValue() {
        return this.deviationValue;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DEVIATION_VALUE</code>.
     */
    public StockauditConfirmstock setDeviationValue(String deviationValue) {
        this.deviationValue = deviationValue;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.REASON</code>.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.REASON</code>.
     */
    public StockauditConfirmstock setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_REMARKS</code>.
     */
    public String getCfaRemarks() {
        return this.cfaRemarks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_REMARKS</code>.
     */
    public StockauditConfirmstock setCfaRemarks(String cfaRemarks) {
        this.cfaRemarks = cfaRemarks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_STATUS</code>.
     */
    public String getCfaStatus() {
        return this.cfaStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_STATUS</code>.
     */
    public StockauditConfirmstock setCfaStatus(String cfaStatus) {
        this.cfaStatus = cfaStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_DATE</code>.
     */
    public LocalDateTime getCfaUpdatedDate() {
        return this.cfaUpdatedDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_DATE</code>.
     */
    public StockauditConfirmstock setCfaUpdatedDate(LocalDateTime cfaUpdatedDate) {
        this.cfaUpdatedDate = cfaUpdatedDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_BY</code>.
     */
    public String getCfaUpdatedBy() {
        return this.cfaUpdatedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CFA_UPDATED_BY</code>.
     */
    public StockauditConfirmstock setCfaUpdatedBy(String cfaUpdatedBy) {
        this.cfaUpdatedBy = cfaUpdatedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_REMARKS</code>.
     */
    public String getAuditRemarks() {
        return this.auditRemarks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_REMARKS</code>.
     */
    public StockauditConfirmstock setAuditRemarks(String auditRemarks) {
        this.auditRemarks = auditRemarks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_STATUS</code>.
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_STATUS</code>.
     */
    public StockauditConfirmstock setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_DATE</code>.
     */
    public LocalDateTime getAuditUpdatedDate() {
        return this.auditUpdatedDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_DATE</code>.
     */
    public StockauditConfirmstock setAuditUpdatedDate(LocalDateTime auditUpdatedDate) {
        this.auditUpdatedDate = auditUpdatedDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_BY</code>.
     */
    public String getAuditUpdatedBy() {
        return this.auditUpdatedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.AUDIT_UPDATED_BY</code>.
     */
    public StockauditConfirmstock setAuditUpdatedBy(String auditUpdatedBy) {
        this.auditUpdatedBy = auditUpdatedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_STATUS</code>.
     */
    public String getSapStatus() {
        return this.sapStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_STATUS</code>.
     */
    public StockauditConfirmstock setSapStatus(String sapStatus) {
        this.sapStatus = sapStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_REF_NO</code>.
     */
    public String getSapRefNo() {
        return this.sapRefNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.SAP_REF_NO</code>.
     */
    public StockauditConfirmstock setSapRefNo(String sapRefNo) {
        this.sapRefNo = sapRefNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_CODE</code>.
     */
    public StockauditConfirmstock setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_NAME</code>.
     */
    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.VENDOR_NAME</code>.
     */
    public StockauditConfirmstock setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_CODE</code>.
     */
    public StockauditConfirmstock setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CUSTOMER_NAME</code>.
     */
    public StockauditConfirmstock setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_TYPE</code>.
     */
    public String getDamageType() {
        return this.damageType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_TYPE</code>.
     */
    public StockauditConfirmstock setDamageType(String damageType) {
        this.damageType = damageType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_STATUS</code>.
     */
    public String getDamageStatus() {
        return this.damageStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_STATUS</code>.
     */
    public StockauditConfirmstock setDamageStatus(String damageStatus) {
        this.damageStatus = damageStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.GOOD</code>.
     */
    public String getGood() {
        return this.good;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.GOOD</code>.
     */
    public StockauditConfirmstock setGood(String good) {
        this.good = good;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_BY</code>.
     */
    public StockauditConfirmstock setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.CREATED_ON</code>.
     */
    public StockauditConfirmstock setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.FACTORY_DAMEGE</code>.
     */
    public String getFactoryDamege() {
        return this.factoryDamege;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.FACTORY_DAMEGE</code>.
     */
    public StockauditConfirmstock setFactoryDamege(String factoryDamege) {
        this.factoryDamege = factoryDamege;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_HANDLING</code>.
     */
    public String getDamageHandling() {
        return this.damageHandling;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.DAMAGE_HANDLING</code>.
     */
    public StockauditConfirmstock setDamageHandling(String damageHandling) {
        this.damageHandling = damageHandling;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.TRANSPORTER_DAMAGE</code>.
     */
    public String getTransporterDamage() {
        return this.transporterDamage;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.TRANSPORTER_DAMAGE</code>.
     */
    public StockauditConfirmstock setTransporterDamage(String transporterDamage) {
        this.transporterDamage = transporterDamage;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.OUTLET_RETURN_DAMAGE</code>.
     */
    public String getOutletReturnDamage() {
        return this.outletReturnDamage;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.OUTLET_RETURN_DAMAGE</code>.
     */
    public StockauditConfirmstock setOutletReturnDamage(String outletReturnDamage) {
        this.outletReturnDamage = outletReturnDamage;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_RECOVERED_FROM_CFA</code>.
     */
    public String getExpRecoveredFromCfa() {
        return this.expRecoveredFromCfa;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_RECOVERED_FROM_CFA</code>.
     */
    public StockauditConfirmstock setExpRecoveredFromCfa(String expRecoveredFromCfa) {
        this.expRecoveredFromCfa = expRecoveredFromCfa;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_OTHERS</code>.
     */
    public String getExpOthers() {
        return this.expOthers;
    }

    /**
     * Setter for <code>vendor_portal_pbx.stockaudit_confirmstock.EXP_OTHERS</code>.
     */
    public StockauditConfirmstock setExpOthers(String expOthers) {
        this.expOthers = expOthers;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final StockauditConfirmstock other = (StockauditConfirmstock) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (werks == null) {
            if (other.werks != null)
                return false;
        }
        else if (!werks.equals(other.werks))
            return false;
        if (lgort == null) {
            if (other.lgort != null)
                return false;
        }
        else if (!lgort.equals(other.lgort))
            return false;
        if (matnr == null) {
            if (other.matnr != null)
                return false;
        }
        else if (!matnr.equals(other.matnr))
            return false;
        if (matnrDesc == null) {
            if (other.matnrDesc != null)
                return false;
        }
        else if (!matnrDesc.equals(other.matnrDesc))
            return false;
        if (meins == null) {
            if (other.meins != null)
                return false;
        }
        else if (!meins.equals(other.meins))
            return false;
        if (clabs == null) {
            if (other.clabs != null)
                return false;
        }
        else if (!clabs.equals(other.clabs))
            return false;
        if (ersda == null) {
            if (other.ersda != null)
                return false;
        }
        else if (!ersda.equals(other.ersda))
            return false;
        if (vfdat == null) {
            if (other.vfdat != null)
                return false;
        }
        else if (!vfdat.equals(other.vfdat))
            return false;
        if (confirmedDate == null) {
            if (other.confirmedDate != null)
                return false;
        }
        else if (!confirmedDate.equals(other.confirmedDate))
            return false;
        if (confirmedBy == null) {
            if (other.confirmedBy != null)
                return false;
        }
        else if (!confirmedBy.equals(other.confirmedBy))
            return false;
        if (confirmedDQty == null) {
            if (other.confirmedDQty != null)
                return false;
        }
        else if (!confirmedDQty.equals(other.confirmedDQty))
            return false;
        if (remarks == null) {
            if (other.remarks != null)
                return false;
        }
        else if (!remarks.equals(other.remarks))
            return false;
        if (unitPrice == null) {
            if (other.unitPrice != null)
                return false;
        }
        else if (!unitPrice.equals(other.unitPrice))
            return false;
        if (deviationQty == null) {
            if (other.deviationQty != null)
                return false;
        }
        else if (!deviationQty.equals(other.deviationQty))
            return false;
        if (deviationValue == null) {
            if (other.deviationValue != null)
                return false;
        }
        else if (!deviationValue.equals(other.deviationValue))
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        }
        else if (!reason.equals(other.reason))
            return false;
        if (cfaRemarks == null) {
            if (other.cfaRemarks != null)
                return false;
        }
        else if (!cfaRemarks.equals(other.cfaRemarks))
            return false;
        if (cfaStatus == null) {
            if (other.cfaStatus != null)
                return false;
        }
        else if (!cfaStatus.equals(other.cfaStatus))
            return false;
        if (cfaUpdatedDate == null) {
            if (other.cfaUpdatedDate != null)
                return false;
        }
        else if (!cfaUpdatedDate.equals(other.cfaUpdatedDate))
            return false;
        if (cfaUpdatedBy == null) {
            if (other.cfaUpdatedBy != null)
                return false;
        }
        else if (!cfaUpdatedBy.equals(other.cfaUpdatedBy))
            return false;
        if (auditRemarks == null) {
            if (other.auditRemarks != null)
                return false;
        }
        else if (!auditRemarks.equals(other.auditRemarks))
            return false;
        if (auditStatus == null) {
            if (other.auditStatus != null)
                return false;
        }
        else if (!auditStatus.equals(other.auditStatus))
            return false;
        if (auditUpdatedDate == null) {
            if (other.auditUpdatedDate != null)
                return false;
        }
        else if (!auditUpdatedDate.equals(other.auditUpdatedDate))
            return false;
        if (auditUpdatedBy == null) {
            if (other.auditUpdatedBy != null)
                return false;
        }
        else if (!auditUpdatedBy.equals(other.auditUpdatedBy))
            return false;
        if (sapStatus == null) {
            if (other.sapStatus != null)
                return false;
        }
        else if (!sapStatus.equals(other.sapStatus))
            return false;
        if (sapRefNo == null) {
            if (other.sapRefNo != null)
                return false;
        }
        else if (!sapRefNo.equals(other.sapRefNo))
            return false;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (vendorName == null) {
            if (other.vendorName != null)
                return false;
        }
        else if (!vendorName.equals(other.vendorName))
            return false;
        if (customerCode == null) {
            if (other.customerCode != null)
                return false;
        }
        else if (!customerCode.equals(other.customerCode))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
            return false;
        if (damageType == null) {
            if (other.damageType != null)
                return false;
        }
        else if (!damageType.equals(other.damageType))
            return false;
        if (damageStatus == null) {
            if (other.damageStatus != null)
                return false;
        }
        else if (!damageStatus.equals(other.damageStatus))
            return false;
        if (good == null) {
            if (other.good != null)
                return false;
        }
        else if (!good.equals(other.good))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (factoryDamege == null) {
            if (other.factoryDamege != null)
                return false;
        }
        else if (!factoryDamege.equals(other.factoryDamege))
            return false;
        if (damageHandling == null) {
            if (other.damageHandling != null)
                return false;
        }
        else if (!damageHandling.equals(other.damageHandling))
            return false;
        if (transporterDamage == null) {
            if (other.transporterDamage != null)
                return false;
        }
        else if (!transporterDamage.equals(other.transporterDamage))
            return false;
        if (outletReturnDamage == null) {
            if (other.outletReturnDamage != null)
                return false;
        }
        else if (!outletReturnDamage.equals(other.outletReturnDamage))
            return false;
        if (expRecoveredFromCfa == null) {
            if (other.expRecoveredFromCfa != null)
                return false;
        }
        else if (!expRecoveredFromCfa.equals(other.expRecoveredFromCfa))
            return false;
        if (expOthers == null) {
            if (other.expOthers != null)
                return false;
        }
        else if (!expOthers.equals(other.expOthers))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.werks == null) ? 0 : this.werks.hashCode());
        result = prime * result + ((this.lgort == null) ? 0 : this.lgort.hashCode());
        result = prime * result + ((this.matnr == null) ? 0 : this.matnr.hashCode());
        result = prime * result + ((this.matnrDesc == null) ? 0 : this.matnrDesc.hashCode());
        result = prime * result + ((this.meins == null) ? 0 : this.meins.hashCode());
        result = prime * result + ((this.clabs == null) ? 0 : this.clabs.hashCode());
        result = prime * result + ((this.ersda == null) ? 0 : this.ersda.hashCode());
        result = prime * result + ((this.vfdat == null) ? 0 : this.vfdat.hashCode());
        result = prime * result + ((this.confirmedDate == null) ? 0 : this.confirmedDate.hashCode());
        result = prime * result + ((this.confirmedBy == null) ? 0 : this.confirmedBy.hashCode());
        result = prime * result + ((this.confirmedDQty == null) ? 0 : this.confirmedDQty.hashCode());
        result = prime * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
        result = prime * result + ((this.unitPrice == null) ? 0 : this.unitPrice.hashCode());
        result = prime * result + ((this.deviationQty == null) ? 0 : this.deviationQty.hashCode());
        result = prime * result + ((this.deviationValue == null) ? 0 : this.deviationValue.hashCode());
        result = prime * result + ((this.reason == null) ? 0 : this.reason.hashCode());
        result = prime * result + ((this.cfaRemarks == null) ? 0 : this.cfaRemarks.hashCode());
        result = prime * result + ((this.cfaStatus == null) ? 0 : this.cfaStatus.hashCode());
        result = prime * result + ((this.cfaUpdatedDate == null) ? 0 : this.cfaUpdatedDate.hashCode());
        result = prime * result + ((this.cfaUpdatedBy == null) ? 0 : this.cfaUpdatedBy.hashCode());
        result = prime * result + ((this.auditRemarks == null) ? 0 : this.auditRemarks.hashCode());
        result = prime * result + ((this.auditStatus == null) ? 0 : this.auditStatus.hashCode());
        result = prime * result + ((this.auditUpdatedDate == null) ? 0 : this.auditUpdatedDate.hashCode());
        result = prime * result + ((this.auditUpdatedBy == null) ? 0 : this.auditUpdatedBy.hashCode());
        result = prime * result + ((this.sapStatus == null) ? 0 : this.sapStatus.hashCode());
        result = prime * result + ((this.sapRefNo == null) ? 0 : this.sapRefNo.hashCode());
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.vendorName == null) ? 0 : this.vendorName.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.customerName == null) ? 0 : this.customerName.hashCode());
        result = prime * result + ((this.damageType == null) ? 0 : this.damageType.hashCode());
        result = prime * result + ((this.damageStatus == null) ? 0 : this.damageStatus.hashCode());
        result = prime * result + ((this.good == null) ? 0 : this.good.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.factoryDamege == null) ? 0 : this.factoryDamege.hashCode());
        result = prime * result + ((this.damageHandling == null) ? 0 : this.damageHandling.hashCode());
        result = prime * result + ((this.transporterDamage == null) ? 0 : this.transporterDamage.hashCode());
        result = prime * result + ((this.outletReturnDamage == null) ? 0 : this.outletReturnDamage.hashCode());
        result = prime * result + ((this.expRecoveredFromCfa == null) ? 0 : this.expRecoveredFromCfa.hashCode());
        result = prime * result + ((this.expOthers == null) ? 0 : this.expOthers.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StockauditConfirmstock (");

        sb.append(compCode);
        sb.append(", ").append(werks);
        sb.append(", ").append(lgort);
        sb.append(", ").append(matnr);
        sb.append(", ").append(matnrDesc);
        sb.append(", ").append(meins);
        sb.append(", ").append(clabs);
        sb.append(", ").append(ersda);
        sb.append(", ").append(vfdat);
        sb.append(", ").append(confirmedDate);
        sb.append(", ").append(confirmedBy);
        sb.append(", ").append(confirmedDQty);
        sb.append(", ").append(remarks);
        sb.append(", ").append(unitPrice);
        sb.append(", ").append(deviationQty);
        sb.append(", ").append(deviationValue);
        sb.append(", ").append(reason);
        sb.append(", ").append(cfaRemarks);
        sb.append(", ").append(cfaStatus);
        sb.append(", ").append(cfaUpdatedDate);
        sb.append(", ").append(cfaUpdatedBy);
        sb.append(", ").append(auditRemarks);
        sb.append(", ").append(auditStatus);
        sb.append(", ").append(auditUpdatedDate);
        sb.append(", ").append(auditUpdatedBy);
        sb.append(", ").append(sapStatus);
        sb.append(", ").append(sapRefNo);
        sb.append(", ").append(vendorCode);
        sb.append(", ").append(vendorName);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(customerName);
        sb.append(", ").append(damageType);
        sb.append(", ").append(damageStatus);
        sb.append(", ").append(good);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(factoryDamege);
        sb.append(", ").append(damageHandling);
        sb.append(", ").append(transporterDamage);
        sb.append(", ").append(outletReturnDamage);
        sb.append(", ").append(expRecoveredFromCfa);
        sb.append(", ").append(expOthers);

        sb.append(")");
        return sb.toString();
    }
}
