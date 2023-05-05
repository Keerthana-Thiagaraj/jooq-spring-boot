/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HmbServiceArrear implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        transNo;
    private LocalDate     postDat;
    private String        plant;
    private String        bukrs;
    private String        plantDesc;
    private String        centerCode;
    private String        centerDesc;
    private String        personResp;
    private String        j_1kftbus;
    private String        arrearCode;
    private String        arrearDesc;
    private LocalDate     arrallDate;
    private LocalDate     transDate;
    private BigDecimal    amt;
    private String        saknr;
    private String        kostl;
    private String        profitCenter;
    private String        sapStatus;
    private String        fiDocNo;
    private String        sapCreatedBy;
    private LocalDate     sapCreatedOn;
    private String        approvedBy;
    private LocalDate     approvalDate;
    private String        rejectedBy;
    private LocalDate     rejectedOn;
    private String        paidFlg;
    private String        billNum;
    private String        text;
    private String        whtType;
    private String        whtCode;
    private String        tdsPerc;
    private BigDecimal    totalTds;
    private BigDecimal    netArrear;
    private String        status;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;

    public HmbServiceArrear() {}

    public HmbServiceArrear(HmbServiceArrear value) {
        this.compCode = value.compCode;
        this.transNo = value.transNo;
        this.postDat = value.postDat;
        this.plant = value.plant;
        this.bukrs = value.bukrs;
        this.plantDesc = value.plantDesc;
        this.centerCode = value.centerCode;
        this.centerDesc = value.centerDesc;
        this.personResp = value.personResp;
        this.j_1kftbus = value.j_1kftbus;
        this.arrearCode = value.arrearCode;
        this.arrearDesc = value.arrearDesc;
        this.arrallDate = value.arrallDate;
        this.transDate = value.transDate;
        this.amt = value.amt;
        this.saknr = value.saknr;
        this.kostl = value.kostl;
        this.profitCenter = value.profitCenter;
        this.sapStatus = value.sapStatus;
        this.fiDocNo = value.fiDocNo;
        this.sapCreatedBy = value.sapCreatedBy;
        this.sapCreatedOn = value.sapCreatedOn;
        this.approvedBy = value.approvedBy;
        this.approvalDate = value.approvalDate;
        this.rejectedBy = value.rejectedBy;
        this.rejectedOn = value.rejectedOn;
        this.paidFlg = value.paidFlg;
        this.billNum = value.billNum;
        this.text = value.text;
        this.whtType = value.whtType;
        this.whtCode = value.whtCode;
        this.tdsPerc = value.tdsPerc;
        this.totalTds = value.totalTds;
        this.netArrear = value.netArrear;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public HmbServiceArrear(
        String        compCode,
        String        transNo,
        LocalDate     postDat,
        String        plant,
        String        bukrs,
        String        plantDesc,
        String        centerCode,
        String        centerDesc,
        String        personResp,
        String        j_1kftbus,
        String        arrearCode,
        String        arrearDesc,
        LocalDate     arrallDate,
        LocalDate     transDate,
        BigDecimal    amt,
        String        saknr,
        String        kostl,
        String        profitCenter,
        String        sapStatus,
        String        fiDocNo,
        String        sapCreatedBy,
        LocalDate     sapCreatedOn,
        String        approvedBy,
        LocalDate     approvalDate,
        String        rejectedBy,
        LocalDate     rejectedOn,
        String        paidFlg,
        String        billNum,
        String        text,
        String        whtType,
        String        whtCode,
        String        tdsPerc,
        BigDecimal    totalTds,
        BigDecimal    netArrear,
        String        status,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.compCode = compCode;
        this.transNo = transNo;
        this.postDat = postDat;
        this.plant = plant;
        this.bukrs = bukrs;
        this.plantDesc = plantDesc;
        this.centerCode = centerCode;
        this.centerDesc = centerDesc;
        this.personResp = personResp;
        this.j_1kftbus = j_1kftbus;
        this.arrearCode = arrearCode;
        this.arrearDesc = arrearDesc;
        this.arrallDate = arrallDate;
        this.transDate = transDate;
        this.amt = amt;
        this.saknr = saknr;
        this.kostl = kostl;
        this.profitCenter = profitCenter;
        this.sapStatus = sapStatus;
        this.fiDocNo = fiDocNo;
        this.sapCreatedBy = sapCreatedBy;
        this.sapCreatedOn = sapCreatedOn;
        this.approvedBy = approvedBy;
        this.approvalDate = approvalDate;
        this.rejectedBy = rejectedBy;
        this.rejectedOn = rejectedOn;
        this.paidFlg = paidFlg;
        this.billNum = billNum;
        this.text = text;
        this.whtType = whtType;
        this.whtCode = whtCode;
        this.tdsPerc = tdsPerc;
        this.totalTds = totalTds;
        this.netArrear = netArrear;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.COMP_CODE</code>.
     */
    public HmbServiceArrear setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_NO</code>.
     */
    public String getTransNo() {
        return this.transNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_NO</code>.
     */
    public HmbServiceArrear setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.POST_DAT</code>.
     */
    public LocalDate getPostDat() {
        return this.postDat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.POST_DAT</code>.
     */
    public HmbServiceArrear setPostDat(LocalDate postDat) {
        this.postDat = postDat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT</code>.
     */
    public HmbServiceArrear setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.BUKRS</code>.
     */
    public String getBukrs() {
        return this.bukrs;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.BUKRS</code>.
     */
    public HmbServiceArrear setBukrs(String bukrs) {
        this.bukrs = bukrs;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT_DESC</code>.
     */
    public String getPlantDesc() {
        return this.plantDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PLANT_DESC</code>.
     */
    public HmbServiceArrear setPlantDesc(String plantDesc) {
        this.plantDesc = plantDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_CODE</code>.
     */
    public String getCenterCode() {
        return this.centerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_CODE</code>.
     */
    public HmbServiceArrear setCenterCode(String centerCode) {
        this.centerCode = centerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_DESC</code>.
     */
    public String getCenterDesc() {
        return this.centerDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CENTER_DESC</code>.
     */
    public HmbServiceArrear setCenterDesc(String centerDesc) {
        this.centerDesc = centerDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PERSON_RESP</code>.
     */
    public String getPersonResp() {
        return this.personResp;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PERSON_RESP</code>.
     */
    public HmbServiceArrear setPersonResp(String personResp) {
        this.personResp = personResp;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.J_1KFTBUS</code>.
     */
    public String getJ_1kftbus() {
        return this.j_1kftbus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.J_1KFTBUS</code>.
     */
    public HmbServiceArrear setJ_1kftbus(String j_1kftbus) {
        this.j_1kftbus = j_1kftbus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_CODE</code>.
     */
    public String getArrearCode() {
        return this.arrearCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_CODE</code>.
     */
    public HmbServiceArrear setArrearCode(String arrearCode) {
        this.arrearCode = arrearCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_DESC</code>.
     */
    public String getArrearDesc() {
        return this.arrearDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.ARREAR_DESC</code>.
     */
    public HmbServiceArrear setArrearDesc(String arrearDesc) {
        this.arrearDesc = arrearDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.ARRALL_DATE</code>.
     */
    public LocalDate getArrallDate() {
        return this.arrallDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.ARRALL_DATE</code>.
     */
    public HmbServiceArrear setArrallDate(LocalDate arrallDate) {
        this.arrallDate = arrallDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_DATE</code>.
     */
    public LocalDate getTransDate() {
        return this.transDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TRANS_DATE</code>.
     */
    public HmbServiceArrear setTransDate(LocalDate transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.AMT</code>.
     */
    public BigDecimal getAmt() {
        return this.amt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.AMT</code>.
     */
    public HmbServiceArrear setAmt(BigDecimal amt) {
        this.amt = amt;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAKNR</code>.
     */
    public String getSaknr() {
        return this.saknr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAKNR</code>.
     */
    public HmbServiceArrear setSaknr(String saknr) {
        this.saknr = saknr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.KOSTL</code>.
     */
    public String getKostl() {
        return this.kostl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.KOSTL</code>.
     */
    public HmbServiceArrear setKostl(String kostl) {
        this.kostl = kostl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PROFIT_CENTER</code>.
     */
    public String getProfitCenter() {
        return this.profitCenter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PROFIT_CENTER</code>.
     */
    public HmbServiceArrear setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_STATUS</code>.
     */
    public String getSapStatus() {
        return this.sapStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_STATUS</code>.
     */
    public HmbServiceArrear setSapStatus(String sapStatus) {
        this.sapStatus = sapStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.FI_DOC_NO</code>.
     */
    public String getFiDocNo() {
        return this.fiDocNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.FI_DOC_NO</code>.
     */
    public HmbServiceArrear setFiDocNo(String fiDocNo) {
        this.fiDocNo = fiDocNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_BY</code>.
     */
    public String getSapCreatedBy() {
        return this.sapCreatedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_BY</code>.
     */
    public HmbServiceArrear setSapCreatedBy(String sapCreatedBy) {
        this.sapCreatedBy = sapCreatedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_ON</code>.
     */
    public LocalDate getSapCreatedOn() {
        return this.sapCreatedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.SAP_CREATED_ON</code>.
     */
    public HmbServiceArrear setSapCreatedOn(LocalDate sapCreatedOn) {
        this.sapCreatedOn = sapCreatedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVED_BY</code>.
     */
    public String getApprovedBy() {
        return this.approvedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVED_BY</code>.
     */
    public HmbServiceArrear setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVAL_DATE</code>.
     */
    public LocalDate getApprovalDate() {
        return this.approvalDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.APPROVAL_DATE</code>.
     */
    public HmbServiceArrear setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_BY</code>.
     */
    public String getRejectedBy() {
        return this.rejectedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_BY</code>.
     */
    public HmbServiceArrear setRejectedBy(String rejectedBy) {
        this.rejectedBy = rejectedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_ON</code>.
     */
    public LocalDate getRejectedOn() {
        return this.rejectedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.REJECTED_ON</code>.
     */
    public HmbServiceArrear setRejectedOn(LocalDate rejectedOn) {
        this.rejectedOn = rejectedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.PAID_FLG</code>.
     */
    public String getPaidFlg() {
        return this.paidFlg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.PAID_FLG</code>.
     */
    public HmbServiceArrear setPaidFlg(String paidFlg) {
        this.paidFlg = paidFlg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.BILL_NUM</code>.
     */
    public String getBillNum() {
        return this.billNum;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.BILL_NUM</code>.
     */
    public HmbServiceArrear setBillNum(String billNum) {
        this.billNum = billNum;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TEXT</code>.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TEXT</code>.
     */
    public HmbServiceArrear setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_TYPE</code>.
     */
    public String getWhtType() {
        return this.whtType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_TYPE</code>.
     */
    public HmbServiceArrear setWhtType(String whtType) {
        this.whtType = whtType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_CODE</code>.
     */
    public String getWhtCode() {
        return this.whtCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.WHT_CODE</code>.
     */
    public HmbServiceArrear setWhtCode(String whtCode) {
        this.whtCode = whtCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TDS_PERC</code>.
     */
    public String getTdsPerc() {
        return this.tdsPerc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TDS_PERC</code>.
     */
    public HmbServiceArrear setTdsPerc(String tdsPerc) {
        this.tdsPerc = tdsPerc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.TOTAL_TDS</code>.
     */
    public BigDecimal getTotalTds() {
        return this.totalTds;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.TOTAL_TDS</code>.
     */
    public HmbServiceArrear setTotalTds(BigDecimal totalTds) {
        this.totalTds = totalTds;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.NET_ARREAR</code>.
     */
    public BigDecimal getNetArrear() {
        return this.netArrear;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.NET_ARREAR</code>.
     */
    public HmbServiceArrear setNetArrear(BigDecimal netArrear) {
        this.netArrear = netArrear;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.STATUS</code>.
     */
    public HmbServiceArrear setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_BY</code>.
     */
    public HmbServiceArrear setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.CREATED_ON</code>.
     */
    public HmbServiceArrear setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_BY</code>.
     */
    public HmbServiceArrear setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_service_arrear.LAST_CHANGED_ON</code>.
     */
    public HmbServiceArrear setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
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
        final HmbServiceArrear other = (HmbServiceArrear) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (transNo == null) {
            if (other.transNo != null)
                return false;
        }
        else if (!transNo.equals(other.transNo))
            return false;
        if (postDat == null) {
            if (other.postDat != null)
                return false;
        }
        else if (!postDat.equals(other.postDat))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (bukrs == null) {
            if (other.bukrs != null)
                return false;
        }
        else if (!bukrs.equals(other.bukrs))
            return false;
        if (plantDesc == null) {
            if (other.plantDesc != null)
                return false;
        }
        else if (!plantDesc.equals(other.plantDesc))
            return false;
        if (centerCode == null) {
            if (other.centerCode != null)
                return false;
        }
        else if (!centerCode.equals(other.centerCode))
            return false;
        if (centerDesc == null) {
            if (other.centerDesc != null)
                return false;
        }
        else if (!centerDesc.equals(other.centerDesc))
            return false;
        if (personResp == null) {
            if (other.personResp != null)
                return false;
        }
        else if (!personResp.equals(other.personResp))
            return false;
        if (j_1kftbus == null) {
            if (other.j_1kftbus != null)
                return false;
        }
        else if (!j_1kftbus.equals(other.j_1kftbus))
            return false;
        if (arrearCode == null) {
            if (other.arrearCode != null)
                return false;
        }
        else if (!arrearCode.equals(other.arrearCode))
            return false;
        if (arrearDesc == null) {
            if (other.arrearDesc != null)
                return false;
        }
        else if (!arrearDesc.equals(other.arrearDesc))
            return false;
        if (arrallDate == null) {
            if (other.arrallDate != null)
                return false;
        }
        else if (!arrallDate.equals(other.arrallDate))
            return false;
        if (transDate == null) {
            if (other.transDate != null)
                return false;
        }
        else if (!transDate.equals(other.transDate))
            return false;
        if (amt == null) {
            if (other.amt != null)
                return false;
        }
        else if (!amt.equals(other.amt))
            return false;
        if (saknr == null) {
            if (other.saknr != null)
                return false;
        }
        else if (!saknr.equals(other.saknr))
            return false;
        if (kostl == null) {
            if (other.kostl != null)
                return false;
        }
        else if (!kostl.equals(other.kostl))
            return false;
        if (profitCenter == null) {
            if (other.profitCenter != null)
                return false;
        }
        else if (!profitCenter.equals(other.profitCenter))
            return false;
        if (sapStatus == null) {
            if (other.sapStatus != null)
                return false;
        }
        else if (!sapStatus.equals(other.sapStatus))
            return false;
        if (fiDocNo == null) {
            if (other.fiDocNo != null)
                return false;
        }
        else if (!fiDocNo.equals(other.fiDocNo))
            return false;
        if (sapCreatedBy == null) {
            if (other.sapCreatedBy != null)
                return false;
        }
        else if (!sapCreatedBy.equals(other.sapCreatedBy))
            return false;
        if (sapCreatedOn == null) {
            if (other.sapCreatedOn != null)
                return false;
        }
        else if (!sapCreatedOn.equals(other.sapCreatedOn))
            return false;
        if (approvedBy == null) {
            if (other.approvedBy != null)
                return false;
        }
        else if (!approvedBy.equals(other.approvedBy))
            return false;
        if (approvalDate == null) {
            if (other.approvalDate != null)
                return false;
        }
        else if (!approvalDate.equals(other.approvalDate))
            return false;
        if (rejectedBy == null) {
            if (other.rejectedBy != null)
                return false;
        }
        else if (!rejectedBy.equals(other.rejectedBy))
            return false;
        if (rejectedOn == null) {
            if (other.rejectedOn != null)
                return false;
        }
        else if (!rejectedOn.equals(other.rejectedOn))
            return false;
        if (paidFlg == null) {
            if (other.paidFlg != null)
                return false;
        }
        else if (!paidFlg.equals(other.paidFlg))
            return false;
        if (billNum == null) {
            if (other.billNum != null)
                return false;
        }
        else if (!billNum.equals(other.billNum))
            return false;
        if (text == null) {
            if (other.text != null)
                return false;
        }
        else if (!text.equals(other.text))
            return false;
        if (whtType == null) {
            if (other.whtType != null)
                return false;
        }
        else if (!whtType.equals(other.whtType))
            return false;
        if (whtCode == null) {
            if (other.whtCode != null)
                return false;
        }
        else if (!whtCode.equals(other.whtCode))
            return false;
        if (tdsPerc == null) {
            if (other.tdsPerc != null)
                return false;
        }
        else if (!tdsPerc.equals(other.tdsPerc))
            return false;
        if (totalTds == null) {
            if (other.totalTds != null)
                return false;
        }
        else if (!totalTds.equals(other.totalTds))
            return false;
        if (netArrear == null) {
            if (other.netArrear != null)
                return false;
        }
        else if (!netArrear.equals(other.netArrear))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
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
        if (lastChangedBy == null) {
            if (other.lastChangedBy != null)
                return false;
        }
        else if (!lastChangedBy.equals(other.lastChangedBy))
            return false;
        if (lastChangedOn == null) {
            if (other.lastChangedOn != null)
                return false;
        }
        else if (!lastChangedOn.equals(other.lastChangedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.transNo == null) ? 0 : this.transNo.hashCode());
        result = prime * result + ((this.postDat == null) ? 0 : this.postDat.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.bukrs == null) ? 0 : this.bukrs.hashCode());
        result = prime * result + ((this.plantDesc == null) ? 0 : this.plantDesc.hashCode());
        result = prime * result + ((this.centerCode == null) ? 0 : this.centerCode.hashCode());
        result = prime * result + ((this.centerDesc == null) ? 0 : this.centerDesc.hashCode());
        result = prime * result + ((this.personResp == null) ? 0 : this.personResp.hashCode());
        result = prime * result + ((this.j_1kftbus == null) ? 0 : this.j_1kftbus.hashCode());
        result = prime * result + ((this.arrearCode == null) ? 0 : this.arrearCode.hashCode());
        result = prime * result + ((this.arrearDesc == null) ? 0 : this.arrearDesc.hashCode());
        result = prime * result + ((this.arrallDate == null) ? 0 : this.arrallDate.hashCode());
        result = prime * result + ((this.transDate == null) ? 0 : this.transDate.hashCode());
        result = prime * result + ((this.amt == null) ? 0 : this.amt.hashCode());
        result = prime * result + ((this.saknr == null) ? 0 : this.saknr.hashCode());
        result = prime * result + ((this.kostl == null) ? 0 : this.kostl.hashCode());
        result = prime * result + ((this.profitCenter == null) ? 0 : this.profitCenter.hashCode());
        result = prime * result + ((this.sapStatus == null) ? 0 : this.sapStatus.hashCode());
        result = prime * result + ((this.fiDocNo == null) ? 0 : this.fiDocNo.hashCode());
        result = prime * result + ((this.sapCreatedBy == null) ? 0 : this.sapCreatedBy.hashCode());
        result = prime * result + ((this.sapCreatedOn == null) ? 0 : this.sapCreatedOn.hashCode());
        result = prime * result + ((this.approvedBy == null) ? 0 : this.approvedBy.hashCode());
        result = prime * result + ((this.approvalDate == null) ? 0 : this.approvalDate.hashCode());
        result = prime * result + ((this.rejectedBy == null) ? 0 : this.rejectedBy.hashCode());
        result = prime * result + ((this.rejectedOn == null) ? 0 : this.rejectedOn.hashCode());
        result = prime * result + ((this.paidFlg == null) ? 0 : this.paidFlg.hashCode());
        result = prime * result + ((this.billNum == null) ? 0 : this.billNum.hashCode());
        result = prime * result + ((this.text == null) ? 0 : this.text.hashCode());
        result = prime * result + ((this.whtType == null) ? 0 : this.whtType.hashCode());
        result = prime * result + ((this.whtCode == null) ? 0 : this.whtCode.hashCode());
        result = prime * result + ((this.tdsPerc == null) ? 0 : this.tdsPerc.hashCode());
        result = prime * result + ((this.totalTds == null) ? 0 : this.totalTds.hashCode());
        result = prime * result + ((this.netArrear == null) ? 0 : this.netArrear.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HmbServiceArrear (");

        sb.append(compCode);
        sb.append(", ").append(transNo);
        sb.append(", ").append(postDat);
        sb.append(", ").append(plant);
        sb.append(", ").append(bukrs);
        sb.append(", ").append(plantDesc);
        sb.append(", ").append(centerCode);
        sb.append(", ").append(centerDesc);
        sb.append(", ").append(personResp);
        sb.append(", ").append(j_1kftbus);
        sb.append(", ").append(arrearCode);
        sb.append(", ").append(arrearDesc);
        sb.append(", ").append(arrallDate);
        sb.append(", ").append(transDate);
        sb.append(", ").append(amt);
        sb.append(", ").append(saknr);
        sb.append(", ").append(kostl);
        sb.append(", ").append(profitCenter);
        sb.append(", ").append(sapStatus);
        sb.append(", ").append(fiDocNo);
        sb.append(", ").append(sapCreatedBy);
        sb.append(", ").append(sapCreatedOn);
        sb.append(", ").append(approvedBy);
        sb.append(", ").append(approvalDate);
        sb.append(", ").append(rejectedBy);
        sb.append(", ").append(rejectedOn);
        sb.append(", ").append(paidFlg);
        sb.append(", ").append(billNum);
        sb.append(", ").append(text);
        sb.append(", ").append(whtType);
        sb.append(", ").append(whtCode);
        sb.append(", ").append(tdsPerc);
        sb.append(", ").append(totalTds);
        sb.append(", ").append(netArrear);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
