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
public class CcmsBonusMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        userType;
    private String        startDate;
    private String        endDate;
    private String        value;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsBonusMaster() {}

    public CcmsBonusMaster(CcmsBonusMaster value) {
        this.userType = value.userType;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.value = value.value;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsBonusMaster(
        String        userType,
        String        startDate,
        String        endDate,
        String        value,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.userType = userType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.value = value;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.user_type</code>.
     */
    public String getUserType() {
        return this.userType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.user_type</code>.
     */
    public CcmsBonusMaster setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.start_date</code>.
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.start_date</code>.
     */
    public CcmsBonusMaster setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.end_date</code>.
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.end_date</code>.
     */
    public CcmsBonusMaster setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.value</code>.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.value</code>.
     */
    public CcmsBonusMaster setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.status</code>.
     */
    public CcmsBonusMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.created_by</code>.
     */
    public CcmsBonusMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.created_on</code>.
     */
    public CcmsBonusMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.last_changed_by</code>.
     */
    public CcmsBonusMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_bonus_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_bonus_master.last_changed_on</code>.
     */
    public CcmsBonusMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final CcmsBonusMaster other = (CcmsBonusMaster) obj;
        if (userType == null) {
            if (other.userType != null)
                return false;
        }
        else if (!userType.equals(other.userType))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        }
        else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        }
        else if (!endDate.equals(other.endDate))
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
        result = prime * result + ((this.userType == null) ? 0 : this.userType.hashCode());
        result = prime * result + ((this.startDate == null) ? 0 : this.startDate.hashCode());
        result = prime * result + ((this.endDate == null) ? 0 : this.endDate.hashCode());
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
        StringBuilder sb = new StringBuilder("CcmsBonusMaster (");

        sb.append(userType);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
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
