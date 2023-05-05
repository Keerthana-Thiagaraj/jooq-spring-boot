/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsAllowanceMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        plant;
    private String        incentiveType;
    private String        effectiveFromDate;
    private String        vendorCode;
    private String        description;
    private String        value;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsAllowanceMaster() {}

    public CcmsAllowanceMaster(CcmsAllowanceMaster value) {
        this.plant = value.plant;
        this.incentiveType = value.incentiveType;
        this.effectiveFromDate = value.effectiveFromDate;
        this.vendorCode = value.vendorCode;
        this.description = value.description;
        this.value = value.value;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsAllowanceMaster(
        String        plant,
        String        incentiveType,
        String        effectiveFromDate,
        String        vendorCode,
        String        description,
        String        value,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.plant = plant;
        this.incentiveType = incentiveType;
        this.effectiveFromDate = effectiveFromDate;
        this.vendorCode = vendorCode;
        this.description = description;
        this.value = value;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.plant</code>.
     */
    public CcmsAllowanceMaster setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.incentive_type</code>.
     */
    public String getIncentiveType() {
        return this.incentiveType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.incentive_type</code>.
     */
    public CcmsAllowanceMaster setIncentiveType(String incentiveType) {
        this.incentiveType = incentiveType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.effective_from_date</code>.
     */
    public String getEffectiveFromDate() {
        return this.effectiveFromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.effective_from_date</code>.
     */
    public CcmsAllowanceMaster setEffectiveFromDate(String effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.vendor_code</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.vendor_code</code>.
     */
    public CcmsAllowanceMaster setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.description</code>.
     */
    public CcmsAllowanceMaster setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.value</code>.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.value</code>.
     */
    public CcmsAllowanceMaster setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.status</code>.
     */
    public CcmsAllowanceMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.created_by</code>.
     */
    public CcmsAllowanceMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.created_on</code>.
     */
    public CcmsAllowanceMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.last_changed_by</code>.
     */
    public CcmsAllowanceMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_allowance_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_allowance_master.last_changed_on</code>.
     */
    public CcmsAllowanceMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final CcmsAllowanceMaster other = (CcmsAllowanceMaster) obj;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (incentiveType == null) {
            if (other.incentiveType != null)
                return false;
        }
        else if (!incentiveType.equals(other.incentiveType))
            return false;
        if (effectiveFromDate == null) {
            if (other.effectiveFromDate != null)
                return false;
        }
        else if (!effectiveFromDate.equals(other.effectiveFromDate))
            return false;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        }
        else if (!value.equals(other.value))
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
        result = prime * result + ((this.incentiveType == null) ? 0 : this.incentiveType.hashCode());
        result = prime * result + ((this.effectiveFromDate == null) ? 0 : this.effectiveFromDate.hashCode());
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsAllowanceMaster (");

        sb.append(plant);
        sb.append(", ").append(incentiveType);
        sb.append(", ").append(effectiveFromDate);
        sb.append(", ").append(vendorCode);
        sb.append(", ").append(description);
        sb.append(", ").append(value);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
