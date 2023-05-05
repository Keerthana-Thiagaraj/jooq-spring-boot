/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PortalUsageMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sNo;
    private String  accGrpCode;
    private String  accGrpName;
    private String  accGrpVal;
    private String  status;

    public PortalUsageMaster() {}

    public PortalUsageMaster(PortalUsageMaster value) {
        this.sNo = value.sNo;
        this.accGrpCode = value.accGrpCode;
        this.accGrpName = value.accGrpName;
        this.accGrpVal = value.accGrpVal;
        this.status = value.status;
    }

    public PortalUsageMaster(
        Integer sNo,
        String  accGrpCode,
        String  accGrpName,
        String  accGrpVal,
        String  status
    ) {
        this.sNo = sNo;
        this.accGrpCode = accGrpCode;
        this.accGrpName = accGrpName;
        this.accGrpVal = accGrpVal;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.portal_usage_master.S_NO</code>.
     */
    public Integer getSNo() {
        return this.sNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.portal_usage_master.S_NO</code>.
     */
    public PortalUsageMaster setSNo(Integer sNo) {
        this.sNo = sNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.portal_usage_master.ACC_GRP_CODE</code>.
     */
    public String getAccGrpCode() {
        return this.accGrpCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.portal_usage_master.ACC_GRP_CODE</code>.
     */
    public PortalUsageMaster setAccGrpCode(String accGrpCode) {
        this.accGrpCode = accGrpCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.portal_usage_master.ACC_GRP_NAME</code>.
     */
    public String getAccGrpName() {
        return this.accGrpName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.portal_usage_master.ACC_GRP_NAME</code>.
     */
    public PortalUsageMaster setAccGrpName(String accGrpName) {
        this.accGrpName = accGrpName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.portal_usage_master.ACC_GRP_VAL</code>.
     */
    public String getAccGrpVal() {
        return this.accGrpVal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.portal_usage_master.ACC_GRP_VAL</code>.
     */
    public PortalUsageMaster setAccGrpVal(String accGrpVal) {
        this.accGrpVal = accGrpVal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.portal_usage_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.portal_usage_master.STATUS</code>.
     */
    public PortalUsageMaster setStatus(String status) {
        this.status = status;
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
        final PortalUsageMaster other = (PortalUsageMaster) obj;
        if (sNo == null) {
            if (other.sNo != null)
                return false;
        }
        else if (!sNo.equals(other.sNo))
            return false;
        if (accGrpCode == null) {
            if (other.accGrpCode != null)
                return false;
        }
        else if (!accGrpCode.equals(other.accGrpCode))
            return false;
        if (accGrpName == null) {
            if (other.accGrpName != null)
                return false;
        }
        else if (!accGrpName.equals(other.accGrpName))
            return false;
        if (accGrpVal == null) {
            if (other.accGrpVal != null)
                return false;
        }
        else if (!accGrpVal.equals(other.accGrpVal))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sNo == null) ? 0 : this.sNo.hashCode());
        result = prime * result + ((this.accGrpCode == null) ? 0 : this.accGrpCode.hashCode());
        result = prime * result + ((this.accGrpName == null) ? 0 : this.accGrpName.hashCode());
        result = prime * result + ((this.accGrpVal == null) ? 0 : this.accGrpVal.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PortalUsageMaster (");

        sb.append(sNo);
        sb.append(", ").append(accGrpCode);
        sb.append(", ").append(accGrpName);
        sb.append(", ").append(accGrpVal);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}