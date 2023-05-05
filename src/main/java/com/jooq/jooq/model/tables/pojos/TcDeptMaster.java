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
public class TcDeptMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       deptCode;
    private String        deptName;
    private LocalDate     fromDate;
    private LocalDate     toDate;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;
    private String        responsibleEmail;
    private String        responsibleAddlEmail;

    public TcDeptMaster() {}

    public TcDeptMaster(TcDeptMaster value) {
        this.deptCode = value.deptCode;
        this.deptName = value.deptName;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.responsibleEmail = value.responsibleEmail;
        this.responsibleAddlEmail = value.responsibleAddlEmail;
    }

    public TcDeptMaster(
        Integer       deptCode,
        String        deptName,
        LocalDate     fromDate,
        LocalDate     toDate,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn,
        String        responsibleEmail,
        String        responsibleAddlEmail
    ) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.responsibleEmail = responsibleEmail;
        this.responsibleAddlEmail = responsibleAddlEmail;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.DEPT_CODE</code>.
     */
    public Integer getDeptCode() {
        return this.deptCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.DEPT_CODE</code>.
     */
    public TcDeptMaster setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.DEPT_NAME</code>.
     */
    public String getDeptName() {
        return this.deptName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.DEPT_NAME</code>.
     */
    public TcDeptMaster setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.FROM_DATE</code>.
     */
    public TcDeptMaster setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.TO_DATE</code>.
     */
    public TcDeptMaster setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.STATUS</code>.
     */
    public TcDeptMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.CREATED_BY</code>.
     */
    public TcDeptMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.CREATED_ON</code>.
     */
    public TcDeptMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.LAST_CHANGED_BY</code>.
     */
    public TcDeptMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.LAST_CHANGED_ON</code>.
     */
    public TcDeptMaster setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.RESPONSIBLE_EMAIL</code>.
     */
    public String getResponsibleEmail() {
        return this.responsibleEmail;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.RESPONSIBLE_EMAIL</code>.
     */
    public TcDeptMaster setResponsibleEmail(String responsibleEmail) {
        this.responsibleEmail = responsibleEmail;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_DEPT_MASTER.RESPONSIBLE_ADDL_EMAIL</code>.
     */
    public String getResponsibleAddlEmail() {
        return this.responsibleAddlEmail;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_DEPT_MASTER.RESPONSIBLE_ADDL_EMAIL</code>.
     */
    public TcDeptMaster setResponsibleAddlEmail(String responsibleAddlEmail) {
        this.responsibleAddlEmail = responsibleAddlEmail;
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
        final TcDeptMaster other = (TcDeptMaster) obj;
        if (deptCode == null) {
            if (other.deptCode != null)
                return false;
        }
        else if (!deptCode.equals(other.deptCode))
            return false;
        if (deptName == null) {
            if (other.deptName != null)
                return false;
        }
        else if (!deptName.equals(other.deptName))
            return false;
        if (fromDate == null) {
            if (other.fromDate != null)
                return false;
        }
        else if (!fromDate.equals(other.fromDate))
            return false;
        if (toDate == null) {
            if (other.toDate != null)
                return false;
        }
        else if (!toDate.equals(other.toDate))
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
        if (responsibleEmail == null) {
            if (other.responsibleEmail != null)
                return false;
        }
        else if (!responsibleEmail.equals(other.responsibleEmail))
            return false;
        if (responsibleAddlEmail == null) {
            if (other.responsibleAddlEmail != null)
                return false;
        }
        else if (!responsibleAddlEmail.equals(other.responsibleAddlEmail))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.deptCode == null) ? 0 : this.deptCode.hashCode());
        result = prime * result + ((this.deptName == null) ? 0 : this.deptName.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.responsibleEmail == null) ? 0 : this.responsibleEmail.hashCode());
        result = prime * result + ((this.responsibleAddlEmail == null) ? 0 : this.responsibleAddlEmail.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcDeptMaster (");

        sb.append(deptCode);
        sb.append(", ").append(deptName);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(responsibleEmail);
        sb.append(", ").append(responsibleAddlEmail);

        sb.append(")");
        return sb.toString();
    }
}