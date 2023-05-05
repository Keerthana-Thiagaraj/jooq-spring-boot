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
public class SoHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        customerCode;
    private String        customerGroup;
    private String        docType;
    private String        billingType;
    private String        docNo;
    private String        customerName;
    private LocalDate     soCreatedDate;
    private String        soCreatedBy;
    private LocalDate     docDate;
    private String        description;
    private String        flag;
    private String        status;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;
    private String        orderResnDesc;
    private String        approvedFreeVal;
    private String        freeGoodsVal;
    private String        openFreeOrderVal;
    private String        invoiceNo;
    private LocalDate     invoiceDate;
    private String        texts;

    public SoHeader() {}

    public SoHeader(SoHeader value) {
        this.compCode = value.compCode;
        this.customerCode = value.customerCode;
        this.customerGroup = value.customerGroup;
        this.docType = value.docType;
        this.billingType = value.billingType;
        this.docNo = value.docNo;
        this.customerName = value.customerName;
        this.soCreatedDate = value.soCreatedDate;
        this.soCreatedBy = value.soCreatedBy;
        this.docDate = value.docDate;
        this.description = value.description;
        this.flag = value.flag;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.orderResnDesc = value.orderResnDesc;
        this.approvedFreeVal = value.approvedFreeVal;
        this.freeGoodsVal = value.freeGoodsVal;
        this.openFreeOrderVal = value.openFreeOrderVal;
        this.invoiceNo = value.invoiceNo;
        this.invoiceDate = value.invoiceDate;
        this.texts = value.texts;
    }

    public SoHeader(
        String        compCode,
        String        customerCode,
        String        customerGroup,
        String        docType,
        String        billingType,
        String        docNo,
        String        customerName,
        LocalDate     soCreatedDate,
        String        soCreatedBy,
        LocalDate     docDate,
        String        description,
        String        flag,
        String        status,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn,
        String        orderResnDesc,
        String        approvedFreeVal,
        String        freeGoodsVal,
        String        openFreeOrderVal,
        String        invoiceNo,
        LocalDate     invoiceDate,
        String        texts
    ) {
        this.compCode = compCode;
        this.customerCode = customerCode;
        this.customerGroup = customerGroup;
        this.docType = docType;
        this.billingType = billingType;
        this.docNo = docNo;
        this.customerName = customerName;
        this.soCreatedDate = soCreatedDate;
        this.soCreatedBy = soCreatedBy;
        this.docDate = docDate;
        this.description = description;
        this.flag = flag;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.orderResnDesc = orderResnDesc;
        this.approvedFreeVal = approvedFreeVal;
        this.freeGoodsVal = freeGoodsVal;
        this.openFreeOrderVal = openFreeOrderVal;
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.texts = texts;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.COMP_CODE</code>.
     */
    public SoHeader setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.CUSTOMER_CODE</code>.
     */
    public SoHeader setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.CUSTOMER_GROUP</code>.
     */
    public String getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.CUSTOMER_GROUP</code>.
     */
    public SoHeader setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.DOC_TYPE</code>.
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.DOC_TYPE</code>.
     */
    public SoHeader setDocType(String docType) {
        this.docType = docType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.BILLING_TYPE</code>.
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.BILLING_TYPE</code>.
     */
    public SoHeader setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.DOC_NO</code>.
     */
    public String getDocNo() {
        return this.docNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.DOC_NO</code>.
     */
    public SoHeader setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.CUSTOMER_NAME</code>.
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.CUSTOMER_NAME</code>.
     */
    public SoHeader setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.SO_CREATED_DATE</code>.
     */
    public LocalDate getSoCreatedDate() {
        return this.soCreatedDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.SO_CREATED_DATE</code>.
     */
    public SoHeader setSoCreatedDate(LocalDate soCreatedDate) {
        this.soCreatedDate = soCreatedDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.SO_CREATED_BY</code>.
     */
    public String getSoCreatedBy() {
        return this.soCreatedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.SO_CREATED_BY</code>.
     */
    public SoHeader setSoCreatedBy(String soCreatedBy) {
        this.soCreatedBy = soCreatedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.DOC_DATE</code>.
     */
    public LocalDate getDocDate() {
        return this.docDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.DOC_DATE</code>.
     */
    public SoHeader setDocDate(LocalDate docDate) {
        this.docDate = docDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.DESCRIPTION</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.DESCRIPTION</code>.
     */
    public SoHeader setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.FLAG</code>.
     */
    public String getFlag() {
        return this.flag;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.FLAG</code>.
     */
    public SoHeader setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.STATUS</code>.
     */
    public SoHeader setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.CREATED_BY</code>.
     */
    public SoHeader setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.CREATED_ON</code>.
     */
    public SoHeader setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.LAST_CHANGED_BY</code>.
     */
    public SoHeader setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.LAST_CHANGED_ON</code>.
     */
    public SoHeader setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.ORDER_RESN_DESC</code>.
     */
    public String getOrderResnDesc() {
        return this.orderResnDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.ORDER_RESN_DESC</code>.
     */
    public SoHeader setOrderResnDesc(String orderResnDesc) {
        this.orderResnDesc = orderResnDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.APPROVED_FREE_VAL</code>.
     */
    public String getApprovedFreeVal() {
        return this.approvedFreeVal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.APPROVED_FREE_VAL</code>.
     */
    public SoHeader setApprovedFreeVal(String approvedFreeVal) {
        this.approvedFreeVal = approvedFreeVal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.FREE_GOODS_VAL</code>.
     */
    public String getFreeGoodsVal() {
        return this.freeGoodsVal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.FREE_GOODS_VAL</code>.
     */
    public SoHeader setFreeGoodsVal(String freeGoodsVal) {
        this.freeGoodsVal = freeGoodsVal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.OPEN_FREE_ORDER_VAL</code>.
     */
    public String getOpenFreeOrderVal() {
        return this.openFreeOrderVal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.OPEN_FREE_ORDER_VAL</code>.
     */
    public SoHeader setOpenFreeOrderVal(String openFreeOrderVal) {
        this.openFreeOrderVal = openFreeOrderVal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.INVOICE_NO</code>.
     */
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.INVOICE_NO</code>.
     */
    public SoHeader setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.INVOICE_DATE</code>.
     */
    public LocalDate getInvoiceDate() {
        return this.invoiceDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.INVOICE_DATE</code>.
     */
    public SoHeader setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.so_header.TEXTS</code>.
     */
    public String getTexts() {
        return this.texts;
    }

    /**
     * Setter for <code>vendor_portal_pbx.so_header.TEXTS</code>.
     */
    public SoHeader setTexts(String texts) {
        this.texts = texts;
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
        final SoHeader other = (SoHeader) obj;
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
        if (customerGroup == null) {
            if (other.customerGroup != null)
                return false;
        }
        else if (!customerGroup.equals(other.customerGroup))
            return false;
        if (docType == null) {
            if (other.docType != null)
                return false;
        }
        else if (!docType.equals(other.docType))
            return false;
        if (billingType == null) {
            if (other.billingType != null)
                return false;
        }
        else if (!billingType.equals(other.billingType))
            return false;
        if (docNo == null) {
            if (other.docNo != null)
                return false;
        }
        else if (!docNo.equals(other.docNo))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        }
        else if (!customerName.equals(other.customerName))
            return false;
        if (soCreatedDate == null) {
            if (other.soCreatedDate != null)
                return false;
        }
        else if (!soCreatedDate.equals(other.soCreatedDate))
            return false;
        if (soCreatedBy == null) {
            if (other.soCreatedBy != null)
                return false;
        }
        else if (!soCreatedBy.equals(other.soCreatedBy))
            return false;
        if (docDate == null) {
            if (other.docDate != null)
                return false;
        }
        else if (!docDate.equals(other.docDate))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (flag == null) {
            if (other.flag != null)
                return false;
        }
        else if (!flag.equals(other.flag))
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
        if (orderResnDesc == null) {
            if (other.orderResnDesc != null)
                return false;
        }
        else if (!orderResnDesc.equals(other.orderResnDesc))
            return false;
        if (approvedFreeVal == null) {
            if (other.approvedFreeVal != null)
                return false;
        }
        else if (!approvedFreeVal.equals(other.approvedFreeVal))
            return false;
        if (freeGoodsVal == null) {
            if (other.freeGoodsVal != null)
                return false;
        }
        else if (!freeGoodsVal.equals(other.freeGoodsVal))
            return false;
        if (openFreeOrderVal == null) {
            if (other.openFreeOrderVal != null)
                return false;
        }
        else if (!openFreeOrderVal.equals(other.openFreeOrderVal))
            return false;
        if (invoiceNo == null) {
            if (other.invoiceNo != null)
                return false;
        }
        else if (!invoiceNo.equals(other.invoiceNo))
            return false;
        if (invoiceDate == null) {
            if (other.invoiceDate != null)
                return false;
        }
        else if (!invoiceDate.equals(other.invoiceDate))
            return false;
        if (texts == null) {
            if (other.texts != null)
                return false;
        }
        else if (!texts.equals(other.texts))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.customerGroup == null) ? 0 : this.customerGroup.hashCode());
        result = prime * result + ((this.docType == null) ? 0 : this.docType.hashCode());
        result = prime * result + ((this.billingType == null) ? 0 : this.billingType.hashCode());
        result = prime * result + ((this.docNo == null) ? 0 : this.docNo.hashCode());
        result = prime * result + ((this.customerName == null) ? 0 : this.customerName.hashCode());
        result = prime * result + ((this.soCreatedDate == null) ? 0 : this.soCreatedDate.hashCode());
        result = prime * result + ((this.soCreatedBy == null) ? 0 : this.soCreatedBy.hashCode());
        result = prime * result + ((this.docDate == null) ? 0 : this.docDate.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.flag == null) ? 0 : this.flag.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.orderResnDesc == null) ? 0 : this.orderResnDesc.hashCode());
        result = prime * result + ((this.approvedFreeVal == null) ? 0 : this.approvedFreeVal.hashCode());
        result = prime * result + ((this.freeGoodsVal == null) ? 0 : this.freeGoodsVal.hashCode());
        result = prime * result + ((this.openFreeOrderVal == null) ? 0 : this.openFreeOrderVal.hashCode());
        result = prime * result + ((this.invoiceNo == null) ? 0 : this.invoiceNo.hashCode());
        result = prime * result + ((this.invoiceDate == null) ? 0 : this.invoiceDate.hashCode());
        result = prime * result + ((this.texts == null) ? 0 : this.texts.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SoHeader (");

        sb.append(compCode);
        sb.append(", ").append(customerCode);
        sb.append(", ").append(customerGroup);
        sb.append(", ").append(docType);
        sb.append(", ").append(billingType);
        sb.append(", ").append(docNo);
        sb.append(", ").append(customerName);
        sb.append(", ").append(soCreatedDate);
        sb.append(", ").append(soCreatedBy);
        sb.append(", ").append(docDate);
        sb.append(", ").append(description);
        sb.append(", ").append(flag);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(orderResnDesc);
        sb.append(", ").append(approvedFreeVal);
        sb.append(", ").append(freeGoodsVal);
        sb.append(", ").append(openFreeOrderVal);
        sb.append(", ").append(invoiceNo);
        sb.append(", ").append(invoiceDate);
        sb.append(", ").append(texts);

        sb.append(")");
        return sb.toString();
    }
}