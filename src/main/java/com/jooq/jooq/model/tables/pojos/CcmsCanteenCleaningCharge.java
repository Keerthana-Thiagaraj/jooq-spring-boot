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
public class CcmsCanteenCleaningCharge implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        plant;
    private LocalDate     effectiveDate;
    private BigDecimal    wagePerPerson;
    private Integer       labourCount;
    private BigDecimal    totalAmount;
    private Integer       count;
    private BigDecimal    amountPerCycle;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsCanteenCleaningCharge() {}

    public CcmsCanteenCleaningCharge(CcmsCanteenCleaningCharge value) {
        this.plant = value.plant;
        this.effectiveDate = value.effectiveDate;
        this.wagePerPerson = value.wagePerPerson;
        this.labourCount = value.labourCount;
        this.totalAmount = value.totalAmount;
        this.count = value.count;
        this.amountPerCycle = value.amountPerCycle;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsCanteenCleaningCharge(
        String        plant,
        LocalDate     effectiveDate,
        BigDecimal    wagePerPerson,
        Integer       labourCount,
        BigDecimal    totalAmount,
        Integer       count,
        BigDecimal    amountPerCycle,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.plant = plant;
        this.effectiveDate = effectiveDate;
        this.wagePerPerson = wagePerPerson;
        this.labourCount = labourCount;
        this.totalAmount = totalAmount;
        this.count = count;
        this.amountPerCycle = amountPerCycle;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.plant</code>.
     */
    public CcmsCanteenCleaningCharge setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.effective_date</code>.
     */
    public LocalDate getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.effective_date</code>.
     */
    public CcmsCanteenCleaningCharge setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.wage_per_person</code>.
     */
    public BigDecimal getWagePerPerson() {
        return this.wagePerPerson;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.wage_per_person</code>.
     */
    public CcmsCanteenCleaningCharge setWagePerPerson(BigDecimal wagePerPerson) {
        this.wagePerPerson = wagePerPerson;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.labour_count</code>.
     */
    public Integer getLabourCount() {
        return this.labourCount;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.labour_count</code>.
     */
    public CcmsCanteenCleaningCharge setLabourCount(Integer labourCount) {
        this.labourCount = labourCount;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.total_amount</code>.
     */
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.total_amount</code>.
     */
    public CcmsCanteenCleaningCharge setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.count</code>.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.count</code>.
     */
    public CcmsCanteenCleaningCharge setCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.amount_per_cycle</code>.
     */
    public BigDecimal getAmountPerCycle() {
        return this.amountPerCycle;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.amount_per_cycle</code>.
     */
    public CcmsCanteenCleaningCharge setAmountPerCycle(BigDecimal amountPerCycle) {
        this.amountPerCycle = amountPerCycle;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.status</code>.
     */
    public CcmsCanteenCleaningCharge setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.created_by</code>.
     */
    public CcmsCanteenCleaningCharge setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.created_on</code>.
     */
    public CcmsCanteenCleaningCharge setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.last_changed_by</code>.
     */
    public CcmsCanteenCleaningCharge setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_canteen_cleaning_charge.last_changed_on</code>.
     */
    public CcmsCanteenCleaningCharge setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final CcmsCanteenCleaningCharge other = (CcmsCanteenCleaningCharge) obj;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (effectiveDate == null) {
            if (other.effectiveDate != null)
                return false;
        }
        else if (!effectiveDate.equals(other.effectiveDate))
            return false;
        if (wagePerPerson == null) {
            if (other.wagePerPerson != null)
                return false;
        }
        else if (!wagePerPerson.equals(other.wagePerPerson))
            return false;
        if (labourCount == null) {
            if (other.labourCount != null)
                return false;
        }
        else if (!labourCount.equals(other.labourCount))
            return false;
        if (totalAmount == null) {
            if (other.totalAmount != null)
                return false;
        }
        else if (!totalAmount.equals(other.totalAmount))
            return false;
        if (count == null) {
            if (other.count != null)
                return false;
        }
        else if (!count.equals(other.count))
            return false;
        if (amountPerCycle == null) {
            if (other.amountPerCycle != null)
                return false;
        }
        else if (!amountPerCycle.equals(other.amountPerCycle))
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
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.effectiveDate == null) ? 0 : this.effectiveDate.hashCode());
        result = prime * result + ((this.wagePerPerson == null) ? 0 : this.wagePerPerson.hashCode());
        result = prime * result + ((this.labourCount == null) ? 0 : this.labourCount.hashCode());
        result = prime * result + ((this.totalAmount == null) ? 0 : this.totalAmount.hashCode());
        result = prime * result + ((this.count == null) ? 0 : this.count.hashCode());
        result = prime * result + ((this.amountPerCycle == null) ? 0 : this.amountPerCycle.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsCanteenCleaningCharge (");

        sb.append(plant);
        sb.append(", ").append(effectiveDate);
        sb.append(", ").append(wagePerPerson);
        sb.append(", ").append(labourCount);
        sb.append(", ").append(totalAmount);
        sb.append(", ").append(count);
        sb.append(", ").append(amountPerCycle);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
