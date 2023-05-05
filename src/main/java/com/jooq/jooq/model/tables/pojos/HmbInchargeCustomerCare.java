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
public class HmbInchargeCustomerCare implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private String        customerCareMobileNo;
    private String        customerCareEmailId;
    private String        status;
    private LocalDateTime createdDateTime;

    public HmbInchargeCustomerCare() {}

    public HmbInchargeCustomerCare(HmbInchargeCustomerCare value) {
        this.id = value.id;
        this.customerCareMobileNo = value.customerCareMobileNo;
        this.customerCareEmailId = value.customerCareEmailId;
        this.status = value.status;
        this.createdDateTime = value.createdDateTime;
    }

    public HmbInchargeCustomerCare(
        Integer       id,
        String        customerCareMobileNo,
        String        customerCareEmailId,
        String        status,
        LocalDateTime createdDateTime
    ) {
        this.id = id;
        this.customerCareMobileNo = customerCareMobileNo;
        this.customerCareEmailId = customerCareEmailId;
        this.status = status;
        this.createdDateTime = createdDateTime;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_incharge_customer_care.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_incharge_customer_care.ID</code>.
     */
    public HmbInchargeCustomerCare setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_incharge_customer_care.CUSTOMER_CARE_MOBILE_NO</code>.
     */
    public String getCustomerCareMobileNo() {
        return this.customerCareMobileNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_incharge_customer_care.CUSTOMER_CARE_MOBILE_NO</code>.
     */
    public HmbInchargeCustomerCare setCustomerCareMobileNo(String customerCareMobileNo) {
        this.customerCareMobileNo = customerCareMobileNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_incharge_customer_care.CUSTOMER_CARE_EMAIL_ID</code>.
     */
    public String getCustomerCareEmailId() {
        return this.customerCareEmailId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_incharge_customer_care.CUSTOMER_CARE_EMAIL_ID</code>.
     */
    public HmbInchargeCustomerCare setCustomerCareEmailId(String customerCareEmailId) {
        this.customerCareEmailId = customerCareEmailId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_incharge_customer_care.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_incharge_customer_care.STATUS</code>.
     */
    public HmbInchargeCustomerCare setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hmb_incharge_customer_care.CREATED_DATE_TIME</code>.
     */
    public LocalDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hmb_incharge_customer_care.CREATED_DATE_TIME</code>.
     */
    public HmbInchargeCustomerCare setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
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
        final HmbInchargeCustomerCare other = (HmbInchargeCustomerCare) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (customerCareMobileNo == null) {
            if (other.customerCareMobileNo != null)
                return false;
        }
        else if (!customerCareMobileNo.equals(other.customerCareMobileNo))
            return false;
        if (customerCareEmailId == null) {
            if (other.customerCareEmailId != null)
                return false;
        }
        else if (!customerCareEmailId.equals(other.customerCareEmailId))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (createdDateTime == null) {
            if (other.createdDateTime != null)
                return false;
        }
        else if (!createdDateTime.equals(other.createdDateTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.customerCareMobileNo == null) ? 0 : this.customerCareMobileNo.hashCode());
        result = prime * result + ((this.customerCareEmailId == null) ? 0 : this.customerCareEmailId.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdDateTime == null) ? 0 : this.createdDateTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HmbInchargeCustomerCare (");

        sb.append(id);
        sb.append(", ").append(customerCareMobileNo);
        sb.append(", ").append(customerCareEmailId);
        sb.append(", ").append(status);
        sb.append(", ").append(createdDateTime);

        sb.append(")");
        return sb.toString();
    }
}