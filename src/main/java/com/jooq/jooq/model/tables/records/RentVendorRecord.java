/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.RentVendor;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.jooq.Record6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RentVendorRecord extends UpdatableRecordImpl<RentVendorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.COMP_CODE</code>.
     */
    public RentVendorRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.VEN_LINE_ITM</code>.
     */
    public RentVendorRecord setVenLineItm(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.VEN_LINE_ITM</code>.
     */
    public String getVenLineItm() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.INC_IND</code>.
     */
    public RentVendorRecord setIncInd(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.INC_IND</code>.
     */
    public String getIncInd() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.RENT_AGR_ID</code>.
     */
    public RentVendorRecord setRentAgrId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.RENT_AGR_ID</code>.
     */
    public String getRentAgrId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.VENDOR_ID</code>.
     */
    public RentVendorRecord setVendorId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.VENDOR_ID</code>.
     */
    public String getVendorId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.REN_ST_DAT</code>.
     */
    public RentVendorRecord setRenStDat(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.REN_ST_DAT</code>.
     */
    public LocalDate getRenStDat() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.YEAR_TRM</code>.
     */
    public RentVendorRecord setYearTrm(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.YEAR_TRM</code>.
     */
    public String getYearTrm() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.MON_TRM</code>.
     */
    public RentVendorRecord setMonTrm(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.MON_TRM</code>.
     */
    public String getMonTrm() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.DAYS_TRM</code>.
     */
    public RentVendorRecord setDaysTrm(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.DAYS_TRM</code>.
     */
    public String getDaysTrm() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.REN_EN_DAT</code>.
     */
    public RentVendorRecord setRenEnDat(LocalDate value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.REN_EN_DAT</code>.
     */
    public LocalDate getRenEnDat() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.VEN_BASE_AMT</code>.
     */
    public RentVendorRecord setVenBaseAmt(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.VEN_BASE_AMT</code>.
     */
    public BigDecimal getVenBaseAmt() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.VEN_INC_AMT</code>.
     */
    public RentVendorRecord setVenIncAmt(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.VEN_INC_AMT</code>.
     */
    public BigDecimal getVenIncAmt() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.PRO_RENT_AMT</code>.
     */
    public RentVendorRecord setProRentAmt(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.PRO_RENT_AMT</code>.
     */
    public BigDecimal getProRentAmt() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.MAIN_AMT</code>.
     */
    public RentVendorRecord setMainAmt(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.MAIN_AMT</code>.
     */
    public BigDecimal getMainAmt() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.INC_MAIN_AMT</code>.
     */
    public RentVendorRecord setIncMainAmt(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.INC_MAIN_AMT</code>.
     */
    public BigDecimal getIncMainAmt() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.MAIN_KEY</code>.
     */
    public RentVendorRecord setMainKey(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.MAIN_KEY</code>.
     */
    public String getMainKey() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.ACT_RENT_AMT</code>.
     */
    public RentVendorRecord setActRentAmt(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.ACT_RENT_AMT</code>.
     */
    public BigDecimal getActRentAmt() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.BASE_INC</code>.
     */
    public RentVendorRecord setBaseInc(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.BASE_INC</code>.
     */
    public BigDecimal getBaseInc() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.INCR_FLG</code>.
     */
    public RentVendorRecord setIncrFlg(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.INCR_FLG</code>.
     */
    public String getIncrFlg() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.DEL_FLG</code>.
     */
    public RentVendorRecord setDelFlg(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.DEL_FLG</code>.
     */
    public String getDelFlg() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.MAIN_FLG</code>.
     */
    public RentVendorRecord setMainFlg(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.MAIN_FLG</code>.
     */
    public String getMainFlg() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.VEN_REMARKS</code>.
     */
    public RentVendorRecord setVenRemarks(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.VEN_REMARKS</code>.
     */
    public String getVenRemarks() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.AGR_RENW_DAT</code>.
     */
    public RentVendorRecord setAgrRenwDat(LocalDate value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.AGR_RENW_DAT</code>.
     */
    public LocalDate getAgrRenwDat() {
        return (LocalDate) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.TAX_CODE</code>.
     */
    public RentVendorRecord setTaxCode(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.TAX_CODE</code>.
     */
    public String getTaxCode() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.rent_vendor.TAX_CODE_M</code>.
     */
    public RentVendorRecord setTaxCodeM(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.rent_vendor.TAX_CODE_M</code>.
     */
    public String getTaxCodeM() {
        return (String) get(24);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record6<String, String, String, String, String, LocalDate> key() {
        return (Record6) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RentVendorRecord
     */
    public RentVendorRecord() {
        super(RentVendor.RENT_VENDOR);
    }

    /**
     * Create a detached, initialised RentVendorRecord
     */
    public RentVendorRecord(String compCode, String venLineItm, String incInd, String rentAgrId, String vendorId, LocalDate renStDat, String yearTrm, String monTrm, String daysTrm, LocalDate renEnDat, BigDecimal venBaseAmt, BigDecimal venIncAmt, BigDecimal proRentAmt, BigDecimal mainAmt, BigDecimal incMainAmt, String mainKey, BigDecimal actRentAmt, BigDecimal baseInc, String incrFlg, String delFlg, String mainFlg, String venRemarks, LocalDate agrRenwDat, String taxCode, String taxCodeM) {
        super(RentVendor.RENT_VENDOR);

        setCompCode(compCode);
        setVenLineItm(venLineItm);
        setIncInd(incInd);
        setRentAgrId(rentAgrId);
        setVendorId(vendorId);
        setRenStDat(renStDat);
        setYearTrm(yearTrm);
        setMonTrm(monTrm);
        setDaysTrm(daysTrm);
        setRenEnDat(renEnDat);
        setVenBaseAmt(venBaseAmt);
        setVenIncAmt(venIncAmt);
        setProRentAmt(proRentAmt);
        setMainAmt(mainAmt);
        setIncMainAmt(incMainAmt);
        setMainKey(mainKey);
        setActRentAmt(actRentAmt);
        setBaseInc(baseInc);
        setIncrFlg(incrFlg);
        setDelFlg(delFlg);
        setMainFlg(mainFlg);
        setVenRemarks(venRemarks);
        setAgrRenwDat(agrRenwDat);
        setTaxCode(taxCode);
        setTaxCodeM(taxCodeM);
    }
}