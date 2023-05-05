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
public class CcmsSecurityWagesMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        plant;
    private String        vendor;
    private String        securityType;
    private LocalDate     effectiveDate;
    private Double        ratePerDay;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastModifiedBy;
    private LocalDateTime lastModifiedOn;

    public CcmsSecurityWagesMaster() {}

    public CcmsSecurityWagesMaster(CcmsSecurityWagesMaster value) {
        this.plant = value.plant;
        this.vendor = value.vendor;
        this.securityType = value.securityType;
        this.effectiveDate = value.effectiveDate;
        this.ratePerDay = value.ratePerDay;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastModifiedBy = value.lastModifiedBy;
        this.lastModifiedOn = value.lastModifiedOn;
    }

    public CcmsSecurityWagesMaster(
        String        plant,
        String        vendor,
        String        securityType,
        LocalDate     effectiveDate,
        Double        ratePerDay,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastModifiedBy,
        LocalDateTime lastModifiedOn
    ) {
        this.plant = plant;
        this.vendor = vendor;
        this.securityType = securityType;
        this.effectiveDate = effectiveDate;
        this.ratePerDay = ratePerDay;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.plant</code>.
     */
    public CcmsSecurityWagesMaster setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.vendor</code>.
     */
    public String getVendor() {
        return this.vendor;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.vendor</code>.
     */
    public CcmsSecurityWagesMaster setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.security_type</code>.
     */
    public String getSecurityType() {
        return this.securityType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.security_type</code>.
     */
    public CcmsSecurityWagesMaster setSecurityType(String securityType) {
        this.securityType = securityType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.effective_date</code>.
     */
    public LocalDate getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.effective_date</code>.
     */
    public CcmsSecurityWagesMaster setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.rate_per_day</code>.
     */
    public Double getRatePerDay() {
        return this.ratePerDay;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.rate_per_day</code>.
     */
    public CcmsSecurityWagesMaster setRatePerDay(Double ratePerDay) {
        this.ratePerDay = ratePerDay;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.status</code>.
     */
    public CcmsSecurityWagesMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.created_by</code>.
     */
    public CcmsSecurityWagesMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.created_on</code>.
     */
    public CcmsSecurityWagesMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.last_modified_by</code>.
     */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.last_modified_by</code>.
     */
    public CcmsSecurityWagesMaster setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_security_wages_master.last_modified_on</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_security_wages_master.last_modified_on</code>.
     */
    public CcmsSecurityWagesMaster setLastModifiedOn(LocalDateTime lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
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
        final CcmsSecurityWagesMaster other = (CcmsSecurityWagesMaster) obj;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (vendor == null) {
            if (other.vendor != null)
                return false;
        }
        else if (!vendor.equals(other.vendor))
            return false;
        if (securityType == null) {
            if (other.securityType != null)
                return false;
        }
        else if (!securityType.equals(other.securityType))
            return false;
        if (effectiveDate == null) {
            if (other.effectiveDate != null)
                return false;
        }
        else if (!effectiveDate.equals(other.effectiveDate))
            return false;
        if (ratePerDay == null) {
            if (other.ratePerDay != null)
                return false;
        }
        else if (!ratePerDay.equals(other.ratePerDay))
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
        if (lastModifiedBy == null) {
            if (other.lastModifiedBy != null)
                return false;
        }
        else if (!lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        if (lastModifiedOn == null) {
            if (other.lastModifiedOn != null)
                return false;
        }
        else if (!lastModifiedOn.equals(other.lastModifiedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.vendor == null) ? 0 : this.vendor.hashCode());
        result = prime * result + ((this.securityType == null) ? 0 : this.securityType.hashCode());
        result = prime * result + ((this.effectiveDate == null) ? 0 : this.effectiveDate.hashCode());
        result = prime * result + ((this.ratePerDay == null) ? 0 : this.ratePerDay.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastModifiedBy == null) ? 0 : this.lastModifiedBy.hashCode());
        result = prime * result + ((this.lastModifiedOn == null) ? 0 : this.lastModifiedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsSecurityWagesMaster (");

        sb.append(plant);
        sb.append(", ").append(vendor);
        sb.append(", ").append(securityType);
        sb.append(", ").append(effectiveDate);
        sb.append(", ").append(ratePerDay);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastModifiedBy);
        sb.append(", ").append(lastModifiedOn);

        sb.append(")");
        return sb.toString();
    }
}
