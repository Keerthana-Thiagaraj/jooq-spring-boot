/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.MilkPaymentHa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MilkPaymentHaRecord extends UpdatableRecordImpl<MilkPaymentHaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.COMP_CODE</code>.
     */
    public MilkPaymentHaRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.BILL_NUM</code>.
     */
    public MilkPaymentHaRecord setBillNum(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.BILL_NUM</code>.
     */
    public Long getBillNum() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.DATE_FRM</code>.
     */
    public MilkPaymentHaRecord setDateFrm(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.DATE_FRM</code>.
     */
    public LocalDate getDateFrm() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.DATE_TO</code>.
     */
    public MilkPaymentHaRecord setDateTo(LocalDate value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.DATE_TO</code>.
     */
    public LocalDate getDateTo() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.PLANT</code>.
     */
    public MilkPaymentHaRecord setPlant(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.PLANT</code>.
     */
    public String getPlant() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.SOCIETY</code>.
     */
    public MilkPaymentHaRecord setSociety(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.SOCIETY</code>.
     */
    public String getSociety() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.FARMER</code>.
     */
    public MilkPaymentHaRecord setFarmer(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.FARMER</code>.
     */
    public String getFarmer() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.GROSS_AMT</code>.
     */
    public MilkPaymentHaRecord setGrossAmt(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.GROSS_AMT</code>.
     */
    public BigDecimal getGrossAmt() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.DEDUCTIONS</code>.
     */
    public MilkPaymentHaRecord setDeductions(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.DEDUCTIONS</code>.
     */
    public BigDecimal getDeductions() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.RECOVERIES</code>.
     */
    public MilkPaymentHaRecord setRecoveries(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.RECOVERIES</code>.
     */
    public BigDecimal getRecoveries() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.ARREARS</code>.
     */
    public MilkPaymentHaRecord setArrears(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.ARREARS</code>.
     */
    public BigDecimal getArrears() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.NET_AMT</code>.
     */
    public MilkPaymentHaRecord setNetAmt(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.NET_AMT</code>.
     */
    public BigDecimal getNetAmt() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.ACT_DED</code>.
     */
    public MilkPaymentHaRecord setActDed(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.ACT_DED</code>.
     */
    public BigDecimal getActDed() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.ADJ_DOC_POST_BY</code>.
     */
    public MilkPaymentHaRecord setAdjDocPostBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.ADJ_DOC_POST_BY</code>.
     */
    public String getAdjDocPostBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.AVG_RATE</code>.
     */
    public MilkPaymentHaRecord setAvgRate(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.AVG_RATE</code>.
     */
    public BigDecimal getAvgRate() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.BASIC_MILK</code>.
     */
    public MilkPaymentHaRecord setBasicMilk(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.BASIC_MILK</code>.
     */
    public BigDecimal getBasicMilk() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.BLK_CNT</code>.
     */
    public MilkPaymentHaRecord setBlkCnt(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.BLK_CNT</code>.
     */
    public Integer getBlkCnt() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.BUS_TYP</code>.
     */
    public MilkPaymentHaRecord setBusTyp(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.BUS_TYP</code>.
     */
    public String getBusTyp() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.C_NAME</code>.
     */
    public MilkPaymentHaRecord setCName(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.C_NAME</code>.
     */
    public String getCName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.DOCNO</code>.
     */
    public MilkPaymentHaRecord setDocno(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.DOCNO</code>.
     */
    public String getDocno() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.FARMER_TY</code>.
     */
    public MilkPaymentHaRecord setFarmerTy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.FARMER_TY</code>.
     */
    public String getFarmerTy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.FAR_CNT</code>.
     */
    public MilkPaymentHaRecord setFarCnt(Integer value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.FAR_CNT</code>.
     */
    public Integer getFarCnt() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.FV_CNT</code>.
     */
    public MilkPaymentHaRecord setFvCnt(Integer value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.FV_CNT</code>.
     */
    public Integer getFvCnt() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.F_NAME</code>.
     */
    public MilkPaymentHaRecord setFName(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.F_NAME</code>.
     */
    public String getFName() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.HMB_CNT</code>.
     */
    public MilkPaymentHaRecord setHmbCnt(Integer value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.HMB_CNT</code>.
     */
    public Integer getHmbCnt() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.INCENTIVE</code>.
     */
    public MilkPaymentHaRecord setIncentive(BigDecimal value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.INCENTIVE</code>.
     */
    public BigDecimal getIncentive() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.NAME1</code>.
     */
    public MilkPaymentHaRecord setName1(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.NAME1</code>.
     */
    public String getName1() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.NEG_ADJ_DOC_C</code>.
     */
    public MilkPaymentHaRecord setNegAdjDocC(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.NEG_ADJ_DOC_C</code>.
     */
    public String getNegAdjDocC() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.NEG_ADJ_DOC_F</code>.
     */
    public MilkPaymentHaRecord setNegAdjDocF(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.NEG_ADJ_DOC_F</code>.
     */
    public String getNegAdjDocF() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.NEG_POST_DATE</code>.
     */
    public MilkPaymentHaRecord setNegPostDate(LocalDate value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.NEG_POST_DATE</code>.
     */
    public LocalDate getNegPostDate() {
        return (LocalDate) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.PAYEE</code>.
     */
    public MilkPaymentHaRecord setPayee(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.PAYEE</code>.
     */
    public String getPayee() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.POST_BY</code>.
     */
    public MilkPaymentHaRecord setPostBy(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.POST_BY</code>.
     */
    public String getPostBy() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.POST_DAT</code>.
     */
    public MilkPaymentHaRecord setPostDat(LocalDate value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.POST_DAT</code>.
     */
    public LocalDate getPostDat() {
        return (LocalDate) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.P_CODE</code>.
     */
    public MilkPaymentHaRecord setPCode(Integer value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.P_CODE</code>.
     */
    public Integer getPCode() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.P_SO</code>.
     */
    public MilkPaymentHaRecord setPSo(Integer value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.P_SO</code>.
     */
    public Integer getPSo() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.QUANTITY</code>.
     */
    public MilkPaymentHaRecord setQuantity(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.QUANTITY</code>.
     */
    public String getQuantity() {
        return (String) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.REMARKS</code>.
     */
    public MilkPaymentHaRecord setRemarks(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.ROUTE</code>.
     */
    public MilkPaymentHaRecord setRoute(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.ROUTE</code>.
     */
    public String getRoute() {
        return (String) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.R_NAME</code>.
     */
    public MilkPaymentHaRecord setRName(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.R_NAME</code>.
     */
    public String getRName() {
        return (String) get(38);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.STATUS</code>.
     */
    public MilkPaymentHaRecord setStatus(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(39);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.CREATED_BY</code>.
     */
    public MilkPaymentHaRecord setCreatedBy(Integer value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.CREATED_ON</code>.
     */
    public MilkPaymentHaRecord setCreatedOn(LocalDateTime value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(41);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.LAST_CHANGED_BY</code>.
     */
    public MilkPaymentHaRecord setLastChangedBy(Integer value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(42);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.LAST_CHANGED_ON</code>.
     */
    public MilkPaymentHaRecord setLastChangedOn(LocalDateTime value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(43);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.BANKN</code>.
     */
    public MilkPaymentHaRecord setBankn(String value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.BANKN</code>.
     */
    public String getBankn() {
        return (String) get(44);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.BANKL</code>.
     */
    public MilkPaymentHaRecord setBankl(String value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.BANKL</code>.
     */
    public String getBankl() {
        return (String) get(45);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_payment_ha.FEED_ELIGIBLE</code>.
     */
    public MilkPaymentHaRecord setFeedEligible(String value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_payment_ha.FEED_ELIGIBLE</code>.
     */
    public String getFeedEligible() {
        return (String) get(46);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<Long, LocalDate, LocalDate, String, String> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilkPaymentHaRecord
     */
    public MilkPaymentHaRecord() {
        super(MilkPaymentHa.MILK_PAYMENT_HA);
    }

    /**
     * Create a detached, initialised MilkPaymentHaRecord
     */
    public MilkPaymentHaRecord(String compCode, Long billNum, LocalDate dateFrm, LocalDate dateTo, String plant, String society, String farmer, BigDecimal grossAmt, BigDecimal deductions, BigDecimal recoveries, BigDecimal arrears, BigDecimal netAmt, BigDecimal actDed, String adjDocPostBy, BigDecimal avgRate, BigDecimal basicMilk, Integer blkCnt, String busTyp, String cName, String docno, String farmerTy, Integer farCnt, Integer fvCnt, String fName, Integer hmbCnt, BigDecimal incentive, String name1, String negAdjDocC, String negAdjDocF, LocalDate negPostDate, String payee, String postBy, LocalDate postDat, Integer pCode, Integer pSo, String quantity, String remarks, String route, String rName, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn, String bankn, String bankl, String feedEligible) {
        super(MilkPaymentHa.MILK_PAYMENT_HA);

        setCompCode(compCode);
        setBillNum(billNum);
        setDateFrm(dateFrm);
        setDateTo(dateTo);
        setPlant(plant);
        setSociety(society);
        setFarmer(farmer);
        setGrossAmt(grossAmt);
        setDeductions(deductions);
        setRecoveries(recoveries);
        setArrears(arrears);
        setNetAmt(netAmt);
        setActDed(actDed);
        setAdjDocPostBy(adjDocPostBy);
        setAvgRate(avgRate);
        setBasicMilk(basicMilk);
        setBlkCnt(blkCnt);
        setBusTyp(busTyp);
        setCName(cName);
        setDocno(docno);
        setFarmerTy(farmerTy);
        setFarCnt(farCnt);
        setFvCnt(fvCnt);
        setFName(fName);
        setHmbCnt(hmbCnt);
        setIncentive(incentive);
        setName1(name1);
        setNegAdjDocC(negAdjDocC);
        setNegAdjDocF(negAdjDocF);
        setNegPostDate(negPostDate);
        setPayee(payee);
        setPostBy(postBy);
        setPostDat(postDat);
        setPCode(pCode);
        setPSo(pSo);
        setQuantity(quantity);
        setRemarks(remarks);
        setRoute(route);
        setRName(rName);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setBankn(bankn);
        setBankl(bankl);
        setFeedEligible(feedEligible);
    }
}