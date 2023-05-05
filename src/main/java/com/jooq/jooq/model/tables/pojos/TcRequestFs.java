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
public class TcRequestFs implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       lineId;
    private String        requestId;
    private Integer       desigCode;
    private String        staffCode;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;
    private String        email;
    private String        mobile;

    public TcRequestFs() {}

    public TcRequestFs(TcRequestFs value) {
        this.lineId = value.lineId;
        this.requestId = value.requestId;
        this.desigCode = value.desigCode;
        this.staffCode = value.staffCode;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.email = value.email;
        this.mobile = value.mobile;
    }

    public TcRequestFs(
        Integer       lineId,
        String        requestId,
        Integer       desigCode,
        String        staffCode,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn,
        String        email,
        String        mobile
    ) {
        this.lineId = lineId;
        this.requestId = requestId;
        this.desigCode = desigCode;
        this.staffCode = staffCode;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.email = email;
        this.mobile = mobile;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.LINE_ID</code>.
     */
    public Integer getLineId() {
        return this.lineId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.LINE_ID</code>.
     */
    public TcRequestFs setLineId(Integer lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.REQUEST_ID</code>.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.REQUEST_ID</code>.
     */
    public TcRequestFs setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.DESIG_CODE</code>.
     */
    public Integer getDesigCode() {
        return this.desigCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.DESIG_CODE</code>.
     */
    public TcRequestFs setDesigCode(Integer desigCode) {
        this.desigCode = desigCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.STAFF_CODE</code>.
     */
    public String getStaffCode() {
        return this.staffCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.STAFF_CODE</code>.
     */
    public TcRequestFs setStaffCode(String staffCode) {
        this.staffCode = staffCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.CREATED_BY</code>.
     */
    public TcRequestFs setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.CREATED_ON</code>.
     */
    public TcRequestFs setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.LAST_CHANGED_BY</code>.
     */
    public TcRequestFs setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.LAST_CHANGED_ON</code>.
     */
    public TcRequestFs setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.EMAIL</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.EMAIL</code>.
     */
    public TcRequestFs setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_FS.MOBILE</code>.
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_FS.MOBILE</code>.
     */
    public TcRequestFs setMobile(String mobile) {
        this.mobile = mobile;
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
        final TcRequestFs other = (TcRequestFs) obj;
        if (lineId == null) {
            if (other.lineId != null)
                return false;
        }
        else if (!lineId.equals(other.lineId))
            return false;
        if (requestId == null) {
            if (other.requestId != null)
                return false;
        }
        else if (!requestId.equals(other.requestId))
            return false;
        if (desigCode == null) {
            if (other.desigCode != null)
                return false;
        }
        else if (!desigCode.equals(other.desigCode))
            return false;
        if (staffCode == null) {
            if (other.staffCode != null)
                return false;
        }
        else if (!staffCode.equals(other.staffCode))
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
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (mobile == null) {
            if (other.mobile != null)
                return false;
        }
        else if (!mobile.equals(other.mobile))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.lineId == null) ? 0 : this.lineId.hashCode());
        result = prime * result + ((this.requestId == null) ? 0 : this.requestId.hashCode());
        result = prime * result + ((this.desigCode == null) ? 0 : this.desigCode.hashCode());
        result = prime * result + ((this.staffCode == null) ? 0 : this.staffCode.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.mobile == null) ? 0 : this.mobile.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcRequestFs (");

        sb.append(lineId);
        sb.append(", ").append(requestId);
        sb.append(", ").append(desigCode);
        sb.append(", ").append(staffCode);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(email);
        sb.append(", ").append(mobile);

        sb.append(")");
        return sb.toString();
    }
}
