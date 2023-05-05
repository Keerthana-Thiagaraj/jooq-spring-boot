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
public class GrnCustomerDispachHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        customerCode;
    private String        model;
    private LocalDate     assetReqDate;
    private String        customerName;
    private String        rsmName;
    private String        qty;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        updatedBy;
    private LocalDateTime updatedOn;
    private String        cfaCode;
    private String        cfaName;
    private String        dcAttachmentUrl;

    public GrnCustomerDispachHeader() {}

    public GrnCustomerDispachHeader(GrnCustomerDispachHeader value) {
        this.compCode = value.compCode;
        this.customerCode = value.customerCode;
        this.model = value.model;
        this.assetReqDate = value.assetReqDate;
        this.customerName = value.customerName;
        this.rsmName = value.rsmName;
        this.qty = value.qty;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.updatedBy = value.updatedBy;
        this.updatedOn = value.updatedOn;
        this.cfaCode = value.cfaCode;
        this.cfaName = value.cfaName;
        this.dcAttachmentUrl = value.dcAttachmentUrl;
    }

    public GrnCustomerDispachHeader(
        String        compCode,
        String        customerCode,
        String        model,
        LocalDate     assetReqDate,
        String        customerName,
        String        rsmName,
        String        qty,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        updatedBy,
        LocalDateTime updatedOn,
        String        cfaCode,
        String        cfaName,
        String        dcAttachmentUrl
    ) {
        this.compCode = compCode;
        this.customerCode = customerCode;
        this.model = model;
        this.assetReqDate = assetReqDate;
        this.customerName = customerName;
        this.rsmName = rsmName;
        this.qty = qty;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.cfaCode = cfaCode;
        this.cfaName = cfaName;
        this.dcAttachmentUrl = dcAttachmentUrl;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.COMP_CODE</code>.
     */
    public GrnCustomerDispachHeader setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.CUSTOMER_CODE</code>.
     */
    public GrnCustomerDispachHeader setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.MODEL</code>.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.MODEL</code>.
     */
    public GrnCustomerDispachHeader setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.ASSET_REQ_DATE</code>.
     */
    public LocalDate getAssetReqDate() {
        return this.assetReqDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.ASSET_REQ_DATE</code>.
     */
    public GrnCustomerDispachHeader setAssetReqDate(LocalDate assetReqDate) {
        this.assetReqDate = assetReqDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.CUSTOMER_NAME</code>.
     */
    public GrnCustomerDispachHeader setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.RSM_NAME</code>.
     */
    public String getRsmName() {
        return this.rsmName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.RSM_NAME</code>.
     */
    public GrnCustomerDispachHeader setRsmName(String rsmName) {
        this.rsmName = rsmName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.QTY</code>.
     */
    public String getQty() {
        return this.qty;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.QTY</code>.
     */
    public GrnCustomerDispachHeader setQty(String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.STATUS</code>.
     */
    public GrnCustomerDispachHeader setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.CREATED_BY</code>.
     */
    public GrnCustomerDispachHeader setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.CREATED_ON</code>.
     */
    public GrnCustomerDispachHeader setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.UPDATED_BY</code>.
     */
    public GrnCustomerDispachHeader setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.UPDATED_ON</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.UPDATED_ON</code>.
     */
    public GrnCustomerDispachHeader setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.CFA_CODE</code>.
     */
    public String getCfaCode() {
        return this.cfaCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.CFA_CODE</code>.
     */
    public GrnCustomerDispachHeader setCfaCode(String cfaCode) {
        this.cfaCode = cfaCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.CFA_NAME</code>.
     */
    public String getCfaName() {
        return this.cfaName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.CFA_NAME</code>.
     */
    public GrnCustomerDispachHeader setCfaName(String cfaName) {
        this.cfaName = cfaName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.grn_customer_dispach_header.DC_ATTACHMENT_URL</code>.
     */
    public String getDcAttachmentUrl() {
        return this.dcAttachmentUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.grn_customer_dispach_header.DC_ATTACHMENT_URL</code>.
     */
    public GrnCustomerDispachHeader setDcAttachmentUrl(String dcAttachmentUrl) {
        this.dcAttachmentUrl = dcAttachmentUrl;
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
        final GrnCustomerDispachHeader other = (GrnCustomerDispachHeader) obj;
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
        if (model == null) {
            if (other.model != null)
                return false;
        }
        else if (!model.equals(other.model))
            return false;
        if (assetReqDate == null) {
            if (other.assetReqDate != null)
                return false;
        }
        else if (!assetReqDate.equals(other.assetReqDate))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
            return false;
        if (rsmName == null) {
            if (other.rsmName != null)
                return false;
        }
        else if (!rsmName.equals(other.rsmName))
            return false;
        if (qty == null) {
            if (other.qty != null)
                return false;
        }
        else if (!qty.equals(other.qty))
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
        if (updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!updatedBy.equals(other.updatedBy))
            return false;
        if (updatedOn == null) {
            if (other.updatedOn != null)
                return false;
        }
        else if (!updatedOn.equals(other.updatedOn))
            return false;
        if (cfaCode == null) {
            if (other.cfaCode != null)
                return false;
        }
        else if (!cfaCode.equals(other.cfaCode))
            return false;
        if (cfaName == null) {
            if (other.cfaName != null)
                return false;
        }
        else if (!cfaName.equals(other.cfaName))
            return false;
        if (dcAttachmentUrl == null) {
            if (other.dcAttachmentUrl != null)
                return false;
        }
        else if (!dcAttachmentUrl.equals(other.dcAttachmentUrl))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.model == null) ? 0 : this.model.hashCode());
        result = prime * result + ((this.assetReqDate == null) ? 0 : this.assetReqDate.hashCode());
        result = prime * result + ((this.customerName == null) ? 0 : this.customerName.hashCode());
        result = prime * result + ((this.rsmName == null) ? 0 : this.rsmName.hashCode());
        result = prime * result + ((this.qty == null) ? 0 : this.qty.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        result = prime * result + ((this.updatedOn == null) ? 0 : this.updatedOn.hashCode());
        result = prime * result + ((this.cfaCode == null) ? 0 : this.cfaCode.hashCode());
        result = prime * result + ((this.cfaName == null) ? 0 : this.cfaName.hashCode());
        result = prime * result + ((this.dcAttachmentUrl == null) ? 0 : this.dcAttachmentUrl.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GrnCustomerDispachHeader (");

        sb.append(compCode);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(model);
        sb.append(", ").append(assetReqDate);
        sb.append(", ").append(customerName);
        sb.append(", ").append(rsmName);
        sb.append(", ").append(qty);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(cfaCode);
        sb.append(", ").append(cfaName);
        sb.append(", ").append(dcAttachmentUrl);

        sb.append(")");
        return sb.toString();
    }
}