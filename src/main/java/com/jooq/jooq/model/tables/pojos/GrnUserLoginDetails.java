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
public class GrnUserLoginDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        userId;
    private String        sapUserName;
    private String        password;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;

    public GrnUserLoginDetails() {}

    public GrnUserLoginDetails(GrnUserLoginDetails value) {
        this.userId = value.userId;
        this.sapUserName = value.sapUserName;
        this.password = value.password;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
    }

    public GrnUserLoginDetails(
        String        userId,
        String        sapUserName,
        String        password,
        String        status,
        String        createdBy,
        LocalDateTime createdOn
    ) {
        this.userId = userId;
        this.sapUserName = sapUserName;
        this.password = password;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.USER_ID</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.USER_ID</code>.
     */
    public GrnUserLoginDetails setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.SAP_USER_NAME</code>.
     */
    public String getSapUserName() {
        return this.sapUserName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.SAP_USER_NAME</code>.
     */
    public GrnUserLoginDetails setSapUserName(String sapUserName) {
        this.sapUserName = sapUserName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.PASSWORD</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.PASSWORD</code>.
     */
    public GrnUserLoginDetails setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.STATUS</code>.
     */
    public GrnUserLoginDetails setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_BY</code>.
     */
    public GrnUserLoginDetails setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_user_login_details.CREATED_ON</code>.
     */
    public GrnUserLoginDetails setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
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
        final GrnUserLoginDetails other = (GrnUserLoginDetails) obj;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (sapUserName == null) {
            if (other.sapUserName != null)
                return false;
        }
        else if (!sapUserName.equals(other.sapUserName))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        }
        else if (!password.equals(other.password))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.sapUserName == null) ? 0 : this.sapUserName.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GrnUserLoginDetails (");

        sb.append(userId);
        sb.append(", ").append(sapUserName);
        sb.append(", ").append(password);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
}
