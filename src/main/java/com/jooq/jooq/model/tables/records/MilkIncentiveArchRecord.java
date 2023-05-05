/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.MilkIncentiveArch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MilkIncentiveArchRecord extends UpdatableRecordImpl<MilkIncentiveArchRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.COMP_CODE</code>.
     */
    public MilkIncentiveArchRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.POSTINGDATE</code>.
     */
    public MilkIncentiveArchRecord setPostingdate(LocalDate value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.POSTINGDATE</code>.
     */
    public LocalDate getPostingdate() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.WERKS</code>.
     */
    public MilkIncentiveArchRecord setWerks(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.WERKS</code>.
     */
    public String getWerks() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.SOCIETY</code>.
     */
    public MilkIncentiveArchRecord setSociety(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.SOCIETY</code>.
     */
    public String getSociety() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.PARTNER</code>.
     */
    public MilkIncentiveArchRecord setPartner(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.PARTNER</code>.
     */
    public String getPartner() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.J_1KFTBUS</code>.
     */
    public MilkIncentiveArchRecord setJ_1kftbus(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.J_1KFTBUS</code>.
     */
    public String getJ_1kftbus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.EBELN</code>.
     */
    public MilkIncentiveArchRecord setEbeln(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.EBELN</code>.
     */
    public String getEbeln() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.EBELP</code>.
     */
    public MilkIncentiveArchRecord setEbelp(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.EBELP</code>.
     */
    public String getEbelp() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.CRDAT</code>.
     */
    public MilkIncentiveArchRecord setCrdat(LocalDate value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.CRDAT</code>.
     */
    public LocalDate getCrdat() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.SHIFT</code>.
     */
    public MilkIncentiveArchRecord setShift(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.SHIFT</code>.
     */
    public String getShift() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.INC_TYPE</code>.
     */
    public MilkIncentiveArchRecord setIncType(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.INC_TYPE</code>.
     */
    public String getIncType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.MILK_TYPE</code>.
     */
    public MilkIncentiveArchRecord setMilkType(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.MILK_TYPE</code>.
     */
    public String getMilkType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.INC_VALID_FROM</code>.
     */
    public MilkIncentiveArchRecord setIncValidFrom(LocalDate value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.INC_VALID_FROM</code>.
     */
    public LocalDate getIncValidFrom() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.INC_VALID_TO</code>.
     */
    public MilkIncentiveArchRecord setIncValidTo(LocalDate value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.INC_VALID_TO</code>.
     */
    public LocalDate getIncValidTo() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.QTY</code>.
     */
    public MilkIncentiveArchRecord setQty(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.QTY</code>.
     */
    public String getQty() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.UOM</code>.
     */
    public MilkIncentiveArchRecord setUom(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.UOM</code>.
     */
    public String getUom() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.QTY_KG</code>.
     */
    public MilkIncentiveArchRecord setQtyKg(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.QTY_KG</code>.
     */
    public String getQtyKg() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.UOM_KG</code>.
     */
    public MilkIncentiveArchRecord setUomKg(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.UOM_KG</code>.
     */
    public String getUomKg() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.INC_RATE</code>.
     */
    public MilkIncentiveArchRecord setIncRate(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.INC_RATE</code>.
     */
    public String getIncRate() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.AMT</code>.
     */
    public MilkIncentiveArchRecord setAmt(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.AMT</code>.
     */
    public BigDecimal getAmt() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.INC_BONUS</code>.
     */
    public MilkIncentiveArchRecord setIncBonus(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.INC_BONUS</code>.
     */
    public BigDecimal getIncBonus() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.LOCAL_CURR</code>.
     */
    public MilkIncentiveArchRecord setLocalCurr(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.LOCAL_CURR</code>.
     */
    public String getLocalCurr() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.REMARKS</code>.
     */
    public MilkIncentiveArchRecord setRemarks(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.DOCNO</code>.
     */
    public MilkIncentiveArchRecord setDocno(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.DOCNO</code>.
     */
    public String getDocno() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.APPROVER</code>.
     */
    public MilkIncentiveArchRecord setApprover(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.APPROVER</code>.
     */
    public String getApprover() {
        return (String) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.APPROVAL_DATE</code>.
     */
    public MilkIncentiveArchRecord setApprovalDate(LocalDate value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.APPROVAL_DATE</code>.
     */
    public LocalDate getApprovalDate() {
        return (LocalDate) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.SAP_STATUS</code>.
     */
    public MilkIncentiveArchRecord setSapStatus(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.SAP_STATUS</code>.
     */
    public String getSapStatus() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.SAP_CREATEDBY</code>.
     */
    public MilkIncentiveArchRecord setSapCreatedby(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.SAP_CREATEDBY</code>.
     */
    public String getSapCreatedby() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.SAP_CREATEDON</code>.
     */
    public MilkIncentiveArchRecord setSapCreatedon(LocalDate value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.SAP_CREATEDON</code>.
     */
    public LocalDate getSapCreatedon() {
        return (LocalDate) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.PAID</code>.
     */
    public MilkIncentiveArchRecord setPaid(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.PAID</code>.
     */
    public String getPaid() {
        return (String) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.BILL_NUM</code>.
     */
    public MilkIncentiveArchRecord setBillNum(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.BILL_NUM</code>.
     */
    public String getBillNum() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.INC_ARRERS</code>.
     */
    public MilkIncentiveArchRecord setIncArrers(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.INC_ARRERS</code>.
     */
    public String getIncArrers() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.FKIMG</code>.
     */
    public MilkIncentiveArchRecord setFkimg(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.FKIMG</code>.
     */
    public String getFkimg() {
        return (String) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.PROCESSED_FLG</code>.
     */
    public MilkIncentiveArchRecord setProcessedFlg(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.PROCESSED_FLG</code>.
     */
    public String getProcessedFlg() {
        return (String) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.STATUS</code>.
     */
    public MilkIncentiveArchRecord setStatus(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.CREATED_BY</code>.
     */
    public MilkIncentiveArchRecord setCreatedBy(Integer value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.CREATED_ON</code>.
     */
    public MilkIncentiveArchRecord setCreatedOn(LocalDateTime value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.LAST_CHANGED_BY</code>.
     */
    public MilkIncentiveArchRecord setLastChangedBy(Integer value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_arch.LAST_CHANGED_ON</code>.
     */
    public MilkIncentiveArchRecord setLastChangedOn(LocalDateTime value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_arch.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(38);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record12<String, LocalDate, String, String, String, String, String, String, LocalDate, String, String, String> key() {
        return (Record12) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilkIncentiveArchRecord
     */
    public MilkIncentiveArchRecord() {
        super(MilkIncentiveArch.MILK_INCENTIVE_ARCH);
    }

    /**
     * Create a detached, initialised MilkIncentiveArchRecord
     */
    public MilkIncentiveArchRecord(String compCode, LocalDate postingdate, String werks, String society, String partner, String j_1kftbus, String ebeln, String ebelp, LocalDate crdat, String shift, String incType, String milkType, LocalDate incValidFrom, LocalDate incValidTo, String qty, String uom, String qtyKg, String uomKg, String incRate, BigDecimal amt, BigDecimal incBonus, String localCurr, String remarks, String docno, String approver, LocalDate approvalDate, String sapStatus, String sapCreatedby, LocalDate sapCreatedon, String paid, String billNum, String incArrers, String fkimg, String processedFlg, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(MilkIncentiveArch.MILK_INCENTIVE_ARCH);

        setCompCode(compCode);
        setPostingdate(postingdate);
        setWerks(werks);
        setSociety(society);
        setPartner(partner);
        setJ_1kftbus(j_1kftbus);
        setEbeln(ebeln);
        setEbelp(ebelp);
        setCrdat(crdat);
        setShift(shift);
        setIncType(incType);
        setMilkType(milkType);
        setIncValidFrom(incValidFrom);
        setIncValidTo(incValidTo);
        setQty(qty);
        setUom(uom);
        setQtyKg(qtyKg);
        setUomKg(uomKg);
        setIncRate(incRate);
        setAmt(amt);
        setIncBonus(incBonus);
        setLocalCurr(localCurr);
        setRemarks(remarks);
        setDocno(docno);
        setApprover(approver);
        setApprovalDate(approvalDate);
        setSapStatus(sapStatus);
        setSapCreatedby(sapCreatedby);
        setSapCreatedon(sapCreatedon);
        setPaid(paid);
        setBillNum(billNum);
        setIncArrers(incArrers);
        setFkimg(fkimg);
        setProcessedFlg(processedFlg);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}