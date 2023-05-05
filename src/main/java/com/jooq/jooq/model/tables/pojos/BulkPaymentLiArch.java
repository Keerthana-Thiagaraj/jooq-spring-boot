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
public class BulkPaymentLiArch implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        billNum;
    private String        plant;
    private LocalDate     ssDate;
    private String        shift;
    private String        docno;
    private String        society;
    private String        farmer;
    private String        qtyC;
    private String        qtyKgC;
    private String        fatC;
    private String        snfC;
    private String        clrC;
    private BigDecimal    rateC;
    private BigDecimal    incentiveC;
    private BigDecimal    dmbtrC;
    private String        qtyB;
    private String        qtyKgB;
    private String        fatB;
    private String        snfB;
    private String        clrB;
    private BigDecimal    rateB;
    private BigDecimal    incentiveB;
    private BigDecimal    dmbtrB;
    private LocalDate     crdat;
    private String        status;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;

    public BulkPaymentLiArch() {}

    public BulkPaymentLiArch(BulkPaymentLiArch value) {
        this.billNum = value.billNum;
        this.plant = value.plant;
        this.ssDate = value.ssDate;
        this.shift = value.shift;
        this.docno = value.docno;
        this.society = value.society;
        this.farmer = value.farmer;
        this.qtyC = value.qtyC;
        this.qtyKgC = value.qtyKgC;
        this.fatC = value.fatC;
        this.snfC = value.snfC;
        this.clrC = value.clrC;
        this.rateC = value.rateC;
        this.incentiveC = value.incentiveC;
        this.dmbtrC = value.dmbtrC;
        this.qtyB = value.qtyB;
        this.qtyKgB = value.qtyKgB;
        this.fatB = value.fatB;
        this.snfB = value.snfB;
        this.clrB = value.clrB;
        this.rateB = value.rateB;
        this.incentiveB = value.incentiveB;
        this.dmbtrB = value.dmbtrB;
        this.crdat = value.crdat;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public BulkPaymentLiArch(
        String        billNum,
        String        plant,
        LocalDate     ssDate,
        String        shift,
        String        docno,
        String        society,
        String        farmer,
        String        qtyC,
        String        qtyKgC,
        String        fatC,
        String        snfC,
        String        clrC,
        BigDecimal    rateC,
        BigDecimal    incentiveC,
        BigDecimal    dmbtrC,
        String        qtyB,
        String        qtyKgB,
        String        fatB,
        String        snfB,
        String        clrB,
        BigDecimal    rateB,
        BigDecimal    incentiveB,
        BigDecimal    dmbtrB,
        LocalDate     crdat,
        String        status,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.billNum = billNum;
        this.plant = plant;
        this.ssDate = ssDate;
        this.shift = shift;
        this.docno = docno;
        this.society = society;
        this.farmer = farmer;
        this.qtyC = qtyC;
        this.qtyKgC = qtyKgC;
        this.fatC = fatC;
        this.snfC = snfC;
        this.clrC = clrC;
        this.rateC = rateC;
        this.incentiveC = incentiveC;
        this.dmbtrC = dmbtrC;
        this.qtyB = qtyB;
        this.qtyKgB = qtyKgB;
        this.fatB = fatB;
        this.snfB = snfB;
        this.clrB = clrB;
        this.rateB = rateB;
        this.incentiveB = incentiveB;
        this.dmbtrB = dmbtrB;
        this.crdat = crdat;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.BILL_NUM</code>.
     */
    public String getBillNum() {
        return this.billNum;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.BILL_NUM</code>.
     */
    public BulkPaymentLiArch setBillNum(String billNum) {
        this.billNum = billNum;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.PLANT</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.PLANT</code>.
     */
    public BulkPaymentLiArch setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.SS_DATE</code>.
     */
    public LocalDate getSsDate() {
        return this.ssDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.SS_DATE</code>.
     */
    public BulkPaymentLiArch setSsDate(LocalDate ssDate) {
        this.ssDate = ssDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.SHIFT</code>.
     */
    public String getShift() {
        return this.shift;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.SHIFT</code>.
     */
    public BulkPaymentLiArch setShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.DOCNO</code>.
     */
    public String getDocno() {
        return this.docno;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.DOCNO</code>.
     */
    public BulkPaymentLiArch setDocno(String docno) {
        this.docno = docno;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.SOCIETY</code>.
     */
    public String getSociety() {
        return this.society;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.SOCIETY</code>.
     */
    public BulkPaymentLiArch setSociety(String society) {
        this.society = society;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.FARMER</code>.
     */
    public String getFarmer() {
        return this.farmer;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.FARMER</code>.
     */
    public BulkPaymentLiArch setFarmer(String farmer) {
        this.farmer = farmer;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_C</code>.
     */
    public String getQtyC() {
        return this.qtyC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_C</code>.
     */
    public BulkPaymentLiArch setQtyC(String qtyC) {
        this.qtyC = qtyC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_KG_C</code>.
     */
    public String getQtyKgC() {
        return this.qtyKgC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_KG_C</code>.
     */
    public BulkPaymentLiArch setQtyKgC(String qtyKgC) {
        this.qtyKgC = qtyKgC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.FAT_C</code>.
     */
    public String getFatC() {
        return this.fatC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.FAT_C</code>.
     */
    public BulkPaymentLiArch setFatC(String fatC) {
        this.fatC = fatC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.SNF_C</code>.
     */
    public String getSnfC() {
        return this.snfC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.SNF_C</code>.
     */
    public BulkPaymentLiArch setSnfC(String snfC) {
        this.snfC = snfC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.CLR_C</code>.
     */
    public String getClrC() {
        return this.clrC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.CLR_C</code>.
     */
    public BulkPaymentLiArch setClrC(String clrC) {
        this.clrC = clrC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.RATE_C</code>.
     */
    public BigDecimal getRateC() {
        return this.rateC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.RATE_C</code>.
     */
    public BulkPaymentLiArch setRateC(BigDecimal rateC) {
        this.rateC = rateC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.INCENTIVE_C</code>.
     */
    public BigDecimal getIncentiveC() {
        return this.incentiveC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.INCENTIVE_C</code>.
     */
    public BulkPaymentLiArch setIncentiveC(BigDecimal incentiveC) {
        this.incentiveC = incentiveC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.DMBTR_C</code>.
     */
    public BigDecimal getDmbtrC() {
        return this.dmbtrC;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.DMBTR_C</code>.
     */
    public BulkPaymentLiArch setDmbtrC(BigDecimal dmbtrC) {
        this.dmbtrC = dmbtrC;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_B</code>.
     */
    public String getQtyB() {
        return this.qtyB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_B</code>.
     */
    public BulkPaymentLiArch setQtyB(String qtyB) {
        this.qtyB = qtyB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_KG_B</code>.
     */
    public String getQtyKgB() {
        return this.qtyKgB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.QTY_KG_B</code>.
     */
    public BulkPaymentLiArch setQtyKgB(String qtyKgB) {
        this.qtyKgB = qtyKgB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.FAT_B</code>.
     */
    public String getFatB() {
        return this.fatB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.FAT_B</code>.
     */
    public BulkPaymentLiArch setFatB(String fatB) {
        this.fatB = fatB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.SNF_B</code>.
     */
    public String getSnfB() {
        return this.snfB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.SNF_B</code>.
     */
    public BulkPaymentLiArch setSnfB(String snfB) {
        this.snfB = snfB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.CLR_B</code>.
     */
    public String getClrB() {
        return this.clrB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.CLR_B</code>.
     */
    public BulkPaymentLiArch setClrB(String clrB) {
        this.clrB = clrB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.RATE_B</code>.
     */
    public BigDecimal getRateB() {
        return this.rateB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.RATE_B</code>.
     */
    public BulkPaymentLiArch setRateB(BigDecimal rateB) {
        this.rateB = rateB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.INCENTIVE_B</code>.
     */
    public BigDecimal getIncentiveB() {
        return this.incentiveB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.INCENTIVE_B</code>.
     */
    public BulkPaymentLiArch setIncentiveB(BigDecimal incentiveB) {
        this.incentiveB = incentiveB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.DMBTR_B</code>.
     */
    public BigDecimal getDmbtrB() {
        return this.dmbtrB;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.DMBTR_B</code>.
     */
    public BulkPaymentLiArch setDmbtrB(BigDecimal dmbtrB) {
        this.dmbtrB = dmbtrB;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.CRDAT</code>.
     */
    public LocalDate getCrdat() {
        return this.crdat;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.CRDAT</code>.
     */
    public BulkPaymentLiArch setCrdat(LocalDate crdat) {
        this.crdat = crdat;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.STATUS</code>.
     */
    public BulkPaymentLiArch setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.CREATED_BY</code>.
     */
    public BulkPaymentLiArch setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.CREATED_ON</code>.
     */
    public BulkPaymentLiArch setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.LAST_CHANGED_BY</code>.
     */
    public BulkPaymentLiArch setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.bulk_payment_li_arch.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.bulk_payment_li_arch.LAST_CHANGED_ON</code>.
     */
    public BulkPaymentLiArch setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final BulkPaymentLiArch other = (BulkPaymentLiArch) obj;
        if (billNum == null) {
            if (other.billNum != null)
                return false;
        }
        else if (!billNum.equals(other.billNum))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (ssDate == null) {
            if (other.ssDate != null)
                return false;
        }
        else if (!ssDate.equals(other.ssDate))
            return false;
        if (shift == null) {
            if (other.shift != null)
                return false;
        }
        else if (!shift.equals(other.shift))
            return false;
        if (docno == null) {
            if (other.docno != null)
                return false;
        }
        else if (!docno.equals(other.docno))
            return false;
        if (society == null) {
            if (other.society != null)
                return false;
        }
        else if (!society.equals(other.society))
            return false;
        if (farmer == null) {
            if (other.farmer != null)
                return false;
        }
        else if (!farmer.equals(other.farmer))
            return false;
        if (qtyC == null) {
            if (other.qtyC != null)
                return false;
        }
        else if (!qtyC.equals(other.qtyC))
            return false;
        if (qtyKgC == null) {
            if (other.qtyKgC != null)
                return false;
        }
        else if (!qtyKgC.equals(other.qtyKgC))
            return false;
        if (fatC == null) {
            if (other.fatC != null)
                return false;
        }
        else if (!fatC.equals(other.fatC))
            return false;
        if (snfC == null) {
            if (other.snfC != null)
                return false;
        }
        else if (!snfC.equals(other.snfC))
            return false;
        if (clrC == null) {
            if (other.clrC != null)
                return false;
        }
        else if (!clrC.equals(other.clrC))
            return false;
        if (rateC == null) {
            if (other.rateC != null)
                return false;
        }
        else if (!rateC.equals(other.rateC))
            return false;
        if (incentiveC == null) {
            if (other.incentiveC != null)
                return false;
        }
        else if (!incentiveC.equals(other.incentiveC))
            return false;
        if (dmbtrC == null) {
            if (other.dmbtrC != null)
                return false;
        }
        else if (!dmbtrC.equals(other.dmbtrC))
            return false;
        if (qtyB == null) {
            if (other.qtyB != null)
                return false;
        }
        else if (!qtyB.equals(other.qtyB))
            return false;
        if (qtyKgB == null) {
            if (other.qtyKgB != null)
                return false;
        }
        else if (!qtyKgB.equals(other.qtyKgB))
            return false;
        if (fatB == null) {
            if (other.fatB != null)
                return false;
        }
        else if (!fatB.equals(other.fatB))
            return false;
        if (snfB == null) {
            if (other.snfB != null)
                return false;
        }
        else if (!snfB.equals(other.snfB))
            return false;
        if (clrB == null) {
            if (other.clrB != null)
                return false;
        }
        else if (!clrB.equals(other.clrB))
            return false;
        if (rateB == null) {
            if (other.rateB != null)
                return false;
        }
        else if (!rateB.equals(other.rateB))
            return false;
        if (incentiveB == null) {
            if (other.incentiveB != null)
                return false;
        }
        else if (!incentiveB.equals(other.incentiveB))
            return false;
        if (dmbtrB == null) {
            if (other.dmbtrB != null)
                return false;
        }
        else if (!dmbtrB.equals(other.dmbtrB))
            return false;
        if (crdat == null) {
            if (other.crdat != null)
                return false;
        }
        else if (!crdat.equals(other.crdat))
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
        result = prime * result + ((this.billNum == null) ? 0 : this.billNum.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.ssDate == null) ? 0 : this.ssDate.hashCode());
        result = prime * result + ((this.shift == null) ? 0 : this.shift.hashCode());
        result = prime * result + ((this.docno == null) ? 0 : this.docno.hashCode());
        result = prime * result + ((this.society == null) ? 0 : this.society.hashCode());
        result = prime * result + ((this.farmer == null) ? 0 : this.farmer.hashCode());
        result = prime * result + ((this.qtyC == null) ? 0 : this.qtyC.hashCode());
        result = prime * result + ((this.qtyKgC == null) ? 0 : this.qtyKgC.hashCode());
        result = prime * result + ((this.fatC == null) ? 0 : this.fatC.hashCode());
        result = prime * result + ((this.snfC == null) ? 0 : this.snfC.hashCode());
        result = prime * result + ((this.clrC == null) ? 0 : this.clrC.hashCode());
        result = prime * result + ((this.rateC == null) ? 0 : this.rateC.hashCode());
        result = prime * result + ((this.incentiveC == null) ? 0 : this.incentiveC.hashCode());
        result = prime * result + ((this.dmbtrC == null) ? 0 : this.dmbtrC.hashCode());
        result = prime * result + ((this.qtyB == null) ? 0 : this.qtyB.hashCode());
        result = prime * result + ((this.qtyKgB == null) ? 0 : this.qtyKgB.hashCode());
        result = prime * result + ((this.fatB == null) ? 0 : this.fatB.hashCode());
        result = prime * result + ((this.snfB == null) ? 0 : this.snfB.hashCode());
        result = prime * result + ((this.clrB == null) ? 0 : this.clrB.hashCode());
        result = prime * result + ((this.rateB == null) ? 0 : this.rateB.hashCode());
        result = prime * result + ((this.incentiveB == null) ? 0 : this.incentiveB.hashCode());
        result = prime * result + ((this.dmbtrB == null) ? 0 : this.dmbtrB.hashCode());
        result = prime * result + ((this.crdat == null) ? 0 : this.crdat.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BulkPaymentLiArch (");

        sb.append(billNum);
        sb.append(", ").append(plant);
        sb.append(", ").append(ssDate);
        sb.append(", ").append(shift);
        sb.append(", ").append(docno);
        sb.append(", ").append(society);
        sb.append(", ").append(farmer);
        sb.append(", ").append(qtyC);
        sb.append(", ").append(qtyKgC);
        sb.append(", ").append(fatC);
        sb.append(", ").append(snfC);
        sb.append(", ").append(clrC);
        sb.append(", ").append(rateC);
        sb.append(", ").append(incentiveC);
        sb.append(", ").append(dmbtrC);
        sb.append(", ").append(qtyB);
        sb.append(", ").append(qtyKgB);
        sb.append(", ").append(fatB);
        sb.append(", ").append(snfB);
        sb.append(", ").append(clrB);
        sb.append(", ").append(rateB);
        sb.append(", ").append(incentiveB);
        sb.append(", ").append(dmbtrB);
        sb.append(", ").append(crdat);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}