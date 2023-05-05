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
public class SchemeLi implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       itemNo;
    private String        compCode;
    private Integer       departmentId;
    private Integer       departmentVisibleId;
    private LocalDate     fromDate;
    private LocalDate     toDate;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public SchemeLi() {}

    public SchemeLi(SchemeLi value) {
        this.itemNo = value.itemNo;
        this.compCode = value.compCode;
        this.departmentId = value.departmentId;
        this.departmentVisibleId = value.departmentVisibleId;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public SchemeLi(
        Integer       itemNo,
        String        compCode,
        Integer       departmentId,
        Integer       departmentVisibleId,
        LocalDate     fromDate,
        LocalDate     toDate,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.itemNo = itemNo;
        this.compCode = compCode;
        this.departmentId = departmentId;
        this.departmentVisibleId = departmentVisibleId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.ITEM_NO</code>.
     */
    public Integer getItemNo() {
        return this.itemNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.ITEM_NO</code>.
     */
    public SchemeLi setItemNo(Integer itemNo) {
        this.itemNo = itemNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.COMP_CODE</code>.
     */
    public SchemeLi setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.DEPARTMENT_ID</code>.
     */
    public Integer getDepartmentId() {
        return this.departmentId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.DEPARTMENT_ID</code>.
     */
    public SchemeLi setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.DEPARTMENT_VISIBLE_ID</code>.
     */
    public Integer getDepartmentVisibleId() {
        return this.departmentVisibleId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.DEPARTMENT_VISIBLE_ID</code>.
     */
    public SchemeLi setDepartmentVisibleId(Integer departmentVisibleId) {
        this.departmentVisibleId = departmentVisibleId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.FROM_DATE</code>.
     */
    public SchemeLi setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.TO_DATE</code>.
     */
    public SchemeLi setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.STATUS</code>.
     */
    public SchemeLi setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.CREATED_BY</code>.
     */
    public SchemeLi setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.CREATED_ON</code>.
     */
    public SchemeLi setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.LAST_CHANGED_BY</code>.
     */
    public SchemeLi setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.scheme_li.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.scheme_li.LAST_CHANGED_ON</code>.
     */
    public SchemeLi setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final SchemeLi other = (SchemeLi) obj;
        if (itemNo == null) {
            if (other.itemNo != null)
                return false;
        }
        else if (!itemNo.equals(other.itemNo))
            return false;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (departmentId == null) {
            if (other.departmentId != null)
                return false;
        }
        else if (!departmentId.equals(other.departmentId))
            return false;
        if (departmentVisibleId == null) {
            if (other.departmentVisibleId != null)
                return false;
        }
        else if (!departmentVisibleId.equals(other.departmentVisibleId))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.itemNo == null) ? 0 : this.itemNo.hashCode());
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.departmentId == null) ? 0 : this.departmentId.hashCode());
        result = prime * result + ((this.departmentVisibleId == null) ? 0 : this.departmentVisibleId.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SchemeLi (");

        sb.append(itemNo);
        sb.append(", ").append(compCode);
        sb.append(", ").append(departmentId);
        sb.append(", ").append(departmentVisibleId);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}