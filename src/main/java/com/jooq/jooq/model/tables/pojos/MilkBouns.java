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
public class MilkBouns implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private LocalDate     postingdate;
    private String        werks;
    private String        society;
    private String        partner;
    private String        j_1kftbus;
    private String        ebeln;
    private String        ebelp;
    private LocalDate     crdat;
    private String        shift;
    private String        incType;
    private String        milkType;
    private LocalDate     incValidFrom;
    private LocalDate     incValidTo;
    private String        qty;
    private String        uom;
    private String        qtyKg;
    private String        uomKg;
    private String        incRate;
    private BigDecimal    amt;
    private BigDecimal    incBonus;
    private String        localCurr;
    private String        remarks;
    private String        docno;
    private String        approver;
    private LocalDate     approvalDate;
    private String        sapStatus;
    private String        sapCreatedby;
    private LocalDate     sapCreatedon;
    private String        paid;
    private String        billNum;
    private String        incArrers;
    private String        fkimg;
    private String        processedFlg;
    private String        status;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;

    public MilkBouns() {}

    public MilkBouns(MilkBouns value) {
        this.compCode = value.compCode;
        this.postingdate = value.postingdate;
        this.werks = value.werks;
        this.society = value.society;
        this.partner = value.partner;
        this.j_1kftbus = value.j_1kftbus;
        this.ebeln = value.ebeln;
        this.ebelp = value.ebelp;
        this.crdat = value.crdat;
        this.shift = value.shift;
        this.incType = value.incType;
        this.milkType = value.milkType;
        this.incValidFrom = value.incValidFrom;
        this.incValidTo = value.incValidTo;
        this.qty = value.qty;
        this.uom = value.uom;
        this.qtyKg = value.qtyKg;
        this.uomKg = value.uomKg;
        this.incRate = value.incRate;
        this.amt = value.amt;
        this.incBonus = value.incBonus;
        this.localCurr = value.localCurr;
        this.remarks = value.remarks;
        this.docno = value.docno;
        this.approver = value.approver;
        this.approvalDate = value.approvalDate;
        this.sapStatus = value.sapStatus;
        this.sapCreatedby = value.sapCreatedby;
        this.sapCreatedon = value.sapCreatedon;
        this.paid = value.paid;
        this.billNum = value.billNum;
        this.incArrers = value.incArrers;
        this.fkimg = value.fkimg;
        this.processedFlg = value.processedFlg;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public MilkBouns(
        String        compCode,
        LocalDate     postingdate,
        String        werks,
        String        society,
        String        partner,
        String        j_1kftbus,
        String        ebeln,
        String        ebelp,
        LocalDate     crdat,
        String        shift,
        String        incType,
        String        milkType,
        LocalDate     incValidFrom,
        LocalDate     incValidTo,
        String        qty,
        String        uom,
        String        qtyKg,
        String        uomKg,
        String        incRate,
        BigDecimal    amt,
        BigDecimal    incBonus,
        String        localCurr,
        String        remarks,
        String        docno,
        String        approver,
        LocalDate     approvalDate,
        String        sapStatus,
        String        sapCreatedby,
        LocalDate     sapCreatedon,
        String        paid,
        String        billNum,
        String        incArrers,
        String        fkimg,
        String        processedFlg,
        String        status,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.compCode = compCode;
        this.postingdate = postingdate;
        this.werks = werks;
        this.society = society;
        this.partner = partner;
        this.j_1kftbus = j_1kftbus;
        this.ebeln = ebeln;
        this.ebelp = ebelp;
        this.crdat = crdat;
        this.shift = shift;
        this.incType = incType;
        this.milkType = milkType;
        this.incValidFrom = incValidFrom;
        this.incValidTo = incValidTo;
        this.qty = qty;
        this.uom = uom;
        this.qtyKg = qtyKg;
        this.uomKg = uomKg;
        this.incRate = incRate;
        this.amt = amt;
        this.incBonus = incBonus;
        this.localCurr = localCurr;
        this.remarks = remarks;
        this.docno = docno;
        this.approver = approver;
        this.approvalDate = approvalDate;
        this.sapStatus = sapStatus;
        this.sapCreatedby = sapCreatedby;
        this.sapCreatedon = sapCreatedon;
        this.paid = paid;
        this.billNum = billNum;
        this.incArrers = incArrers;
        this.fkimg = fkimg;
        this.processedFlg = processedFlg;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.COMP_CODE</code>.
     */
    public MilkBouns setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.POSTINGDATE</code>.
     */
    public LocalDate getPostingdate() {
        return this.postingdate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.POSTINGDATE</code>.
     */
    public MilkBouns setPostingdate(LocalDate postingdate) {
        this.postingdate = postingdate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.WERKS</code>.
     */
    public String getWerks() {
        return this.werks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.WERKS</code>.
     */
    public MilkBouns setWerks(String werks) {
        this.werks = werks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.SOCIETY</code>.
     */
    public String getSociety() {
        return this.society;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.SOCIETY</code>.
     */
    public MilkBouns setSociety(String society) {
        this.society = society;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.PARTNER</code>.
     */
    public String getPartner() {
        return this.partner;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.PARTNER</code>.
     */
    public MilkBouns setPartner(String partner) {
        this.partner = partner;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.J_1KFTBUS</code>.
     */
    public String getJ_1kftbus() {
        return this.j_1kftbus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.J_1KFTBUS</code>.
     */
    public MilkBouns setJ_1kftbus(String j_1kftbus) {
        this.j_1kftbus = j_1kftbus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.EBELN</code>.
     */
    public String getEbeln() {
        return this.ebeln;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.EBELN</code>.
     */
    public MilkBouns setEbeln(String ebeln) {
        this.ebeln = ebeln;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.EBELP</code>.
     */
    public String getEbelp() {
        return this.ebelp;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.EBELP</code>.
     */
    public MilkBouns setEbelp(String ebelp) {
        this.ebelp = ebelp;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.CRDAT</code>.
     */
    public LocalDate getCrdat() {
        return this.crdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.CRDAT</code>.
     */
    public MilkBouns setCrdat(LocalDate crdat) {
        this.crdat = crdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.SHIFT</code>.
     */
    public String getShift() {
        return this.shift;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.SHIFT</code>.
     */
    public MilkBouns setShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.INC_TYPE</code>.
     */
    public String getIncType() {
        return this.incType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.INC_TYPE</code>.
     */
    public MilkBouns setIncType(String incType) {
        this.incType = incType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.MILK_TYPE</code>.
     */
    public String getMilkType() {
        return this.milkType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.MILK_TYPE</code>.
     */
    public MilkBouns setMilkType(String milkType) {
        this.milkType = milkType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.INC_VALID_FROM</code>.
     */
    public LocalDate getIncValidFrom() {
        return this.incValidFrom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.INC_VALID_FROM</code>.
     */
    public MilkBouns setIncValidFrom(LocalDate incValidFrom) {
        this.incValidFrom = incValidFrom;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.INC_VALID_TO</code>.
     */
    public LocalDate getIncValidTo() {
        return this.incValidTo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.INC_VALID_TO</code>.
     */
    public MilkBouns setIncValidTo(LocalDate incValidTo) {
        this.incValidTo = incValidTo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.QTY</code>.
     */
    public String getQty() {
        return this.qty;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.QTY</code>.
     */
    public MilkBouns setQty(String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.UOM</code>.
     */
    public String getUom() {
        return this.uom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.UOM</code>.
     */
    public MilkBouns setUom(String uom) {
        this.uom = uom;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.QTY_KG</code>.
     */
    public String getQtyKg() {
        return this.qtyKg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.QTY_KG</code>.
     */
    public MilkBouns setQtyKg(String qtyKg) {
        this.qtyKg = qtyKg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.UOM_KG</code>.
     */
    public String getUomKg() {
        return this.uomKg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.UOM_KG</code>.
     */
    public MilkBouns setUomKg(String uomKg) {
        this.uomKg = uomKg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.INC_RATE</code>.
     */
    public String getIncRate() {
        return this.incRate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.INC_RATE</code>.
     */
    public MilkBouns setIncRate(String incRate) {
        this.incRate = incRate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.AMT</code>.
     */
    public BigDecimal getAmt() {
        return this.amt;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.AMT</code>.
     */
    public MilkBouns setAmt(BigDecimal amt) {
        this.amt = amt;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.INC_BONUS</code>.
     */
    public BigDecimal getIncBonus() {
        return this.incBonus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.INC_BONUS</code>.
     */
    public MilkBouns setIncBonus(BigDecimal incBonus) {
        this.incBonus = incBonus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.LOCAL_CURR</code>.
     */
    public String getLocalCurr() {
        return this.localCurr;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.LOCAL_CURR</code>.
     */
    public MilkBouns setLocalCurr(String localCurr) {
        this.localCurr = localCurr;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.REMARKS</code>.
     */
    public MilkBouns setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.DOCNO</code>.
     */
    public String getDocno() {
        return this.docno;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.DOCNO</code>.
     */
    public MilkBouns setDocno(String docno) {
        this.docno = docno;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.APPROVER</code>.
     */
    public String getApprover() {
        return this.approver;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.APPROVER</code>.
     */
    public MilkBouns setApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.APPROVAL_DATE</code>.
     */
    public LocalDate getApprovalDate() {
        return this.approvalDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.APPROVAL_DATE</code>.
     */
    public MilkBouns setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.SAP_STATUS</code>.
     */
    public String getSapStatus() {
        return this.sapStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.SAP_STATUS</code>.
     */
    public MilkBouns setSapStatus(String sapStatus) {
        this.sapStatus = sapStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.SAP_CREATEDBY</code>.
     */
    public String getSapCreatedby() {
        return this.sapCreatedby;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.SAP_CREATEDBY</code>.
     */
    public MilkBouns setSapCreatedby(String sapCreatedby) {
        this.sapCreatedby = sapCreatedby;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.SAP_CREATEDON</code>.
     */
    public LocalDate getSapCreatedon() {
        return this.sapCreatedon;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.SAP_CREATEDON</code>.
     */
    public MilkBouns setSapCreatedon(LocalDate sapCreatedon) {
        this.sapCreatedon = sapCreatedon;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.PAID</code>.
     */
    public String getPaid() {
        return this.paid;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.PAID</code>.
     */
    public MilkBouns setPaid(String paid) {
        this.paid = paid;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.BILL_NUM</code>.
     */
    public String getBillNum() {
        return this.billNum;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.BILL_NUM</code>.
     */
    public MilkBouns setBillNum(String billNum) {
        this.billNum = billNum;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.INC_ARRERS</code>.
     */
    public String getIncArrers() {
        return this.incArrers;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.INC_ARRERS</code>.
     */
    public MilkBouns setIncArrers(String incArrers) {
        this.incArrers = incArrers;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.FKIMG</code>.
     */
    public String getFkimg() {
        return this.fkimg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.FKIMG</code>.
     */
    public MilkBouns setFkimg(String fkimg) {
        this.fkimg = fkimg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.PROCESSED_FLG</code>.
     */
    public String getProcessedFlg() {
        return this.processedFlg;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.PROCESSED_FLG</code>.
     */
    public MilkBouns setProcessedFlg(String processedFlg) {
        this.processedFlg = processedFlg;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.STATUS</code>.
     */
    public MilkBouns setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.CREATED_BY</code>.
     */
    public MilkBouns setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.CREATED_ON</code>.
     */
    public MilkBouns setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.LAST_CHANGED_BY</code>.
     */
    public MilkBouns setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_bouns.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_bouns.LAST_CHANGED_ON</code>.
     */
    public MilkBouns setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final MilkBouns other = (MilkBouns) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (postingdate == null) {
            if (other.postingdate != null)
                return false;
        }
        else if (!postingdate.equals(other.postingdate))
            return false;
        if (werks == null) {
            if (other.werks != null)
                return false;
        }
        else if (!werks.equals(other.werks))
            return false;
        if (society == null) {
            if (other.society != null)
                return false;
        }
        else if (!society.equals(other.society))
            return false;
        if (partner == null) {
            if (other.partner != null)
                return false;
        }
        else if (!partner.equals(other.partner))
            return false;
        if (j_1kftbus == null) {
            if (other.j_1kftbus != null)
                return false;
        }
        else if (!j_1kftbus.equals(other.j_1kftbus))
            return false;
        if (ebeln == null) {
            if (other.ebeln != null)
                return false;
        }
        else if (!ebeln.equals(other.ebeln))
            return false;
        if (ebelp == null) {
            if (other.ebelp != null)
                return false;
        }
        else if (!ebelp.equals(other.ebelp))
            return false;
        if (crdat == null) {
            if (other.crdat != null)
                return false;
        }
        else if (!crdat.equals(other.crdat))
            return false;
        if (shift == null) {
            if (other.shift != null)
                return false;
        }
        else if (!shift.equals(other.shift))
            return false;
        if (incType == null) {
            if (other.incType != null)
                return false;
        }
        else if (!incType.equals(other.incType))
            return false;
        if (milkType == null) {
            if (other.milkType != null)
                return false;
        }
        else if (!milkType.equals(other.milkType))
            return false;
        if (incValidFrom == null) {
            if (other.incValidFrom != null)
                return false;
        }
        else if (!incValidFrom.equals(other.incValidFrom))
            return false;
        if (incValidTo == null) {
            if (other.incValidTo != null)
                return false;
        }
        else if (!incValidTo.equals(other.incValidTo))
            return false;
        if (qty == null) {
            if (other.qty != null)
                return false;
        }
        else if (!qty.equals(other.qty))
            return false;
        if (uom == null) {
            if (other.uom != null)
                return false;
        }
        else if (!uom.equals(other.uom))
            return false;
        if (qtyKg == null) {
            if (other.qtyKg != null)
                return false;
        }
        else if (!qtyKg.equals(other.qtyKg))
            return false;
        if (uomKg == null) {
            if (other.uomKg != null)
                return false;
        }
        else if (!uomKg.equals(other.uomKg))
            return false;
        if (incRate == null) {
            if (other.incRate != null)
                return false;
        }
        else if (!incRate.equals(other.incRate))
            return false;
        if (amt == null) {
            if (other.amt != null)
                return false;
        }
        else if (!amt.equals(other.amt))
            return false;
        if (incBonus == null) {
            if (other.incBonus != null)
                return false;
        }
        else if (!incBonus.equals(other.incBonus))
            return false;
        if (localCurr == null) {
            if (other.localCurr != null)
                return false;
        }
        else if (!localCurr.equals(other.localCurr))
            return false;
        if (remarks == null) {
            if (other.remarks != null)
                return false;
        }
        else if (!remarks.equals(other.remarks))
            return false;
        if (docno == null) {
            if (other.docno != null)
                return false;
        }
        else if (!docno.equals(other.docno))
            return false;
        if (approver == null) {
            if (other.approver != null)
                return false;
        }
        else if (!approver.equals(other.approver))
            return false;
        if (approvalDate == null) {
            if (other.approvalDate != null)
                return false;
        }
        else if (!approvalDate.equals(other.approvalDate))
            return false;
        if (sapStatus == null) {
            if (other.sapStatus != null)
                return false;
        }
        else if (!sapStatus.equals(other.sapStatus))
            return false;
        if (sapCreatedby == null) {
            if (other.sapCreatedby != null)
                return false;
        }
        else if (!sapCreatedby.equals(other.sapCreatedby))
            return false;
        if (sapCreatedon == null) {
            if (other.sapCreatedon != null)
                return false;
        }
        else if (!sapCreatedon.equals(other.sapCreatedon))
            return false;
        if (paid == null) {
            if (other.paid != null)
                return false;
        }
        else if (!paid.equals(other.paid))
            return false;
        if (billNum == null) {
            if (other.billNum != null)
                return false;
        }
        else if (!billNum.equals(other.billNum))
            return false;
        if (incArrers == null) {
            if (other.incArrers != null)
                return false;
        }
        else if (!incArrers.equals(other.incArrers))
            return false;
        if (fkimg == null) {
            if (other.fkimg != null)
                return false;
        }
        else if (!fkimg.equals(other.fkimg))
            return false;
        if (processedFlg == null) {
            if (other.processedFlg != null)
                return false;
        }
        else if (!processedFlg.equals(other.processedFlg))
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
        result = prime * result + ((this.postingdate == null) ? 0 : this.postingdate.hashCode());
        result = prime * result + ((this.werks == null) ? 0 : this.werks.hashCode());
        result = prime * result + ((this.society == null) ? 0 : this.society.hashCode());
        result = prime * result + ((this.partner == null) ? 0 : this.partner.hashCode());
        result = prime * result + ((this.j_1kftbus == null) ? 0 : this.j_1kftbus.hashCode());
        result = prime * result + ((this.ebeln == null) ? 0 : this.ebeln.hashCode());
        result = prime * result + ((this.ebelp == null) ? 0 : this.ebelp.hashCode());
        result = prime * result + ((this.crdat == null) ? 0 : this.crdat.hashCode());
        result = prime * result + ((this.shift == null) ? 0 : this.shift.hashCode());
        result = prime * result + ((this.incType == null) ? 0 : this.incType.hashCode());
        result = prime * result + ((this.milkType == null) ? 0 : this.milkType.hashCode());
        result = prime * result + ((this.incValidFrom == null) ? 0 : this.incValidFrom.hashCode());
        result = prime * result + ((this.incValidTo == null) ? 0 : this.incValidTo.hashCode());
        result = prime * result + ((this.qty == null) ? 0 : this.qty.hashCode());
        result = prime * result + ((this.uom == null) ? 0 : this.uom.hashCode());
        result = prime * result + ((this.qtyKg == null) ? 0 : this.qtyKg.hashCode());
        result = prime * result + ((this.uomKg == null) ? 0 : this.uomKg.hashCode());
        result = prime * result + ((this.incRate == null) ? 0 : this.incRate.hashCode());
        result = prime * result + ((this.amt == null) ? 0 : this.amt.hashCode());
        result = prime * result + ((this.incBonus == null) ? 0 : this.incBonus.hashCode());
        result = prime * result + ((this.localCurr == null) ? 0 : this.localCurr.hashCode());
        result = prime * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
        result = prime * result + ((this.docno == null) ? 0 : this.docno.hashCode());
        result = prime * result + ((this.approver == null) ? 0 : this.approver.hashCode());
        result = prime * result + ((this.approvalDate == null) ? 0 : this.approvalDate.hashCode());
        result = prime * result + ((this.sapStatus == null) ? 0 : this.sapStatus.hashCode());
        result = prime * result + ((this.sapCreatedby == null) ? 0 : this.sapCreatedby.hashCode());
        result = prime * result + ((this.sapCreatedon == null) ? 0 : this.sapCreatedon.hashCode());
        result = prime * result + ((this.paid == null) ? 0 : this.paid.hashCode());
        result = prime * result + ((this.billNum == null) ? 0 : this.billNum.hashCode());
        result = prime * result + ((this.incArrers == null) ? 0 : this.incArrers.hashCode());
        result = prime * result + ((this.fkimg == null) ? 0 : this.fkimg.hashCode());
        result = prime * result + ((this.processedFlg == null) ? 0 : this.processedFlg.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MilkBouns (");

        sb.append(compCode);
        sb.append(", ").append(postingdate);
        sb.append(", ").append(werks);
        sb.append(", ").append(society);
        sb.append(", ").append(partner);
        sb.append(", ").append(j_1kftbus);
        sb.append(", ").append(ebeln);
        sb.append(", ").append(ebelp);
        sb.append(", ").append(crdat);
        sb.append(", ").append(shift);
        sb.append(", ").append(incType);
        sb.append(", ").append(milkType);
        sb.append(", ").append(incValidFrom);
        sb.append(", ").append(incValidTo);
        sb.append(", ").append(qty);
        sb.append(", ").append(uom);
        sb.append(", ").append(qtyKg);
        sb.append(", ").append(uomKg);
        sb.append(", ").append(incRate);
        sb.append(", ").append(amt);
        sb.append(", ").append(incBonus);
        sb.append(", ").append(localCurr);
        sb.append(", ").append(remarks);
        sb.append(", ").append(docno);
        sb.append(", ").append(approver);
        sb.append(", ").append(approvalDate);
        sb.append(", ").append(sapStatus);
        sb.append(", ").append(sapCreatedby);
        sb.append(", ").append(sapCreatedon);
        sb.append(", ").append(paid);
        sb.append(", ").append(billNum);
        sb.append(", ").append(incArrers);
        sb.append(", ").append(fkimg);
        sb.append(", ").append(processedFlg);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}