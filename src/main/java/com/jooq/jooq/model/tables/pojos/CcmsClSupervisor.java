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
public class CcmsClSupervisor implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        plant;
    private String        vendor;
    private String        empCode;
    private String        status;
    private LocalDateTime createdOn;
    private String        createdBy;
    private LocalDateTime lastModifiedOn;
    private String        lastModifiedBy;

    public CcmsClSupervisor() {}

    public CcmsClSupervisor(CcmsClSupervisor value) {
        this.plant = value.plant;
        this.vendor = value.vendor;
        this.empCode = value.empCode;
        this.status = value.status;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
        this.lastModifiedOn = value.lastModifiedOn;
        this.lastModifiedBy = value.lastModifiedBy;
    }

    public CcmsClSupervisor(
        String        plant,
        String        vendor,
        String        empCode,
        String        status,
        LocalDateTime createdOn,
        String        createdBy,
        LocalDateTime lastModifiedOn,
        String        lastModifiedBy
    ) {
        this.plant = plant;
        this.vendor = vendor;
        this.empCode = empCode;
        this.status = status;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.lastModifiedOn = lastModifiedOn;
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.plant</code>.
     */
    public CcmsClSupervisor setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.vendor</code>.
     */
    public String getVendor() {
        return this.vendor;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.vendor</code>.
     */
    public CcmsClSupervisor setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.emp_code</code>.
     */
    public String getEmpCode() {
        return this.empCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.emp_code</code>.
     */
    public CcmsClSupervisor setEmpCode(String empCode) {
        this.empCode = empCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.status</code>.
     */
    public CcmsClSupervisor setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.created_on</code>.
     */
    public CcmsClSupervisor setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.created_by</code>.
     */
    public CcmsClSupervisor setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.last_modified_on</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.last_modified_on</code>.
     */
    public CcmsClSupervisor setLastModifiedOn(LocalDateTime lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_cl_supervisor.last_modified_by</code>.
     */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_cl_supervisor.last_modified_by</code>.
     */
    public CcmsClSupervisor setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
        final CcmsClSupervisor other = (CcmsClSupervisor) obj;
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
        if (empCode == null) {
            if (other.empCode != null)
                return false;
        }
        else if (!empCode.equals(other.empCode))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (lastModifiedOn == null) {
            if (other.lastModifiedOn != null)
                return false;
        }
        else if (!lastModifiedOn.equals(other.lastModifiedOn))
            return false;
        if (lastModifiedBy == null) {
            if (other.lastModifiedBy != null)
                return false;
        }
        else if (!lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.vendor == null) ? 0 : this.vendor.hashCode());
        result = prime * result + ((this.empCode == null) ? 0 : this.empCode.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastModifiedOn == null) ? 0 : this.lastModifiedOn.hashCode());
        result = prime * result + ((this.lastModifiedBy == null) ? 0 : this.lastModifiedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsClSupervisor (");

        sb.append(plant);
        sb.append(", ").append(vendor);
        sb.append(", ").append(empCode);
        sb.append(", ").append(status);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastModifiedOn);
        sb.append(", ").append(lastModifiedBy);

        sb.append(")");
        return sb.toString();
    }
}