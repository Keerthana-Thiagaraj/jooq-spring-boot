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
public class CircularDisplayDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        customerCode;
    private String        serialNo;
    private String        countryCode;
    private String        regionCode;
    private String        roleId;
    private String        typeId;
    private String        blockedBy;
    private LocalDateTime blockedOn;

    public CircularDisplayDetails() {}

    public CircularDisplayDetails(CircularDisplayDetails value) {
        this.compCode = value.compCode;
        this.customerCode = value.customerCode;
        this.serialNo = value.serialNo;
        this.countryCode = value.countryCode;
        this.regionCode = value.regionCode;
        this.roleId = value.roleId;
        this.typeId = value.typeId;
        this.blockedBy = value.blockedBy;
        this.blockedOn = value.blockedOn;
    }

    public CircularDisplayDetails(
        String        compCode,
        String        customerCode,
        String        serialNo,
        String        countryCode,
        String        regionCode,
        String        roleId,
        String        typeId,
        String        blockedBy,
        LocalDateTime blockedOn
    ) {
        this.compCode = compCode;
        this.customerCode = customerCode;
        this.serialNo = serialNo;
        this.countryCode = countryCode;
        this.regionCode = regionCode;
        this.roleId = roleId;
        this.typeId = typeId;
        this.blockedBy = blockedBy;
        this.blockedOn = blockedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.COMP_CODE</code>.
     */
    public CircularDisplayDetails setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.CUSTOMER_CODE</code>.
     */
    public CircularDisplayDetails setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.SERIAL_NO</code>.
     */
    public CircularDisplayDetails setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.COUNTRY_CODE</code>.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.COUNTRY_CODE</code>.
     */
    public CircularDisplayDetails setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.REGION_CODE</code>.
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.REGION_CODE</code>.
     */
    public CircularDisplayDetails setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.ROLE_ID</code>.
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.ROLE_ID</code>.
     */
    public CircularDisplayDetails setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.TYPE_ID</code>.
     */
    public String getTypeId() {
        return this.typeId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.TYPE_ID</code>.
     */
    public CircularDisplayDetails setTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.BLOCKED_BY</code>.
     */
    public String getBlockedBy() {
        return this.blockedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.BLOCKED_BY</code>.
     */
    public CircularDisplayDetails setBlockedBy(String blockedBy) {
        this.blockedBy = blockedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_display_details.BLOCKED_ON</code>.
     */
    public LocalDateTime getBlockedOn() {
        return this.blockedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_display_details.BLOCKED_ON</code>.
     */
    public CircularDisplayDetails setBlockedOn(LocalDateTime blockedOn) {
        this.blockedOn = blockedOn;
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
        final CircularDisplayDetails other = (CircularDisplayDetails) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (customerCode == null) {
            if (other.customerCode != null)
                return false;
        }
        else if (!customerCode.equals(other.customerCode))
            return false;
        if (serialNo == null) {
            if (other.serialNo != null)
                return false;
        }
        else if (!serialNo.equals(other.serialNo))
            return false;
        if (countryCode == null) {
            if (other.countryCode != null)
                return false;
        }
        else if (!countryCode.equals(other.countryCode))
            return false;
        if (regionCode == null) {
            if (other.regionCode != null)
                return false;
        }
        else if (!regionCode.equals(other.regionCode))
            return false;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        if (typeId == null) {
            if (other.typeId != null)
                return false;
        }
        else if (!typeId.equals(other.typeId))
            return false;
        if (blockedBy == null) {
            if (other.blockedBy != null)
                return false;
        }
        else if (!blockedBy.equals(other.blockedBy))
            return false;
        if (blockedOn == null) {
            if (other.blockedOn != null)
                return false;
        }
        else if (!blockedOn.equals(other.blockedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.serialNo == null) ? 0 : this.serialNo.hashCode());
        result = prime * result + ((this.countryCode == null) ? 0 : this.countryCode.hashCode());
        result = prime * result + ((this.regionCode == null) ? 0 : this.regionCode.hashCode());
        result = prime * result + ((this.roleId == null) ? 0 : this.roleId.hashCode());
        result = prime * result + ((this.typeId == null) ? 0 : this.typeId.hashCode());
        result = prime * result + ((this.blockedBy == null) ? 0 : this.blockedBy.hashCode());
        result = prime * result + ((this.blockedOn == null) ? 0 : this.blockedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CircularDisplayDetails (");

        sb.append(compCode);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(serialNo);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(regionCode);
        sb.append(", ").append(roleId);
        sb.append(", ").append(typeId);
        sb.append(", ").append(blockedBy);
        sb.append(", ").append(blockedOn);

        sb.append(")");
        return sb.toString();
    }
}