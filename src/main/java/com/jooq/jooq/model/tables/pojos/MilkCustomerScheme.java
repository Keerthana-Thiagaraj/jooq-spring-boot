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
public class MilkCustomerScheme implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        customerCode;
    private String        hdcName;
    private String        slab1;
    private String        slab2;
    private String        slab3;
    private LocalDate     validFromDate;
    private LocalDate     validTo;
    private String        slab1Coin;
    private String        slab2Coin;
    private String        slab3Coin;
    private String        uploadedBy;
    private LocalDateTime uploadedOn;
    private String        status;

    public MilkCustomerScheme() {}

    public MilkCustomerScheme(MilkCustomerScheme value) {
        this.customerCode = value.customerCode;
        this.hdcName = value.hdcName;
        this.slab1 = value.slab1;
        this.slab2 = value.slab2;
        this.slab3 = value.slab3;
        this.validFromDate = value.validFromDate;
        this.validTo = value.validTo;
        this.slab1Coin = value.slab1Coin;
        this.slab2Coin = value.slab2Coin;
        this.slab3Coin = value.slab3Coin;
        this.uploadedBy = value.uploadedBy;
        this.uploadedOn = value.uploadedOn;
        this.status = value.status;
    }

    public MilkCustomerScheme(
        String        customerCode,
        String        hdcName,
        String        slab1,
        String        slab2,
        String        slab3,
        LocalDate     validFromDate,
        LocalDate     validTo,
        String        slab1Coin,
        String        slab2Coin,
        String        slab3Coin,
        String        uploadedBy,
        LocalDateTime uploadedOn,
        String        status
    ) {
        this.customerCode = customerCode;
        this.hdcName = hdcName;
        this.slab1 = slab1;
        this.slab2 = slab2;
        this.slab3 = slab3;
        this.validFromDate = validFromDate;
        this.validTo = validTo;
        this.slab1Coin = slab1Coin;
        this.slab2Coin = slab2Coin;
        this.slab3Coin = slab3Coin;
        this.uploadedBy = uploadedBy;
        this.uploadedOn = uploadedOn;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.CUSTOMER_CODE</code>.
     */
    public MilkCustomerScheme setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.HDC_NAME</code>.
     */
    public String getHdcName() {
        return this.hdcName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.HDC_NAME</code>.
     */
    public MilkCustomerScheme setHdcName(String hdcName) {
        this.hdcName = hdcName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1</code>.
     */
    public String getSlab1() {
        return this.slab1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1</code>.
     */
    public MilkCustomerScheme setSlab1(String slab1) {
        this.slab1 = slab1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2</code>.
     */
    public String getSlab2() {
        return this.slab2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2</code>.
     */
    public MilkCustomerScheme setSlab2(String slab2) {
        this.slab2 = slab2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3</code>.
     */
    public String getSlab3() {
        return this.slab3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3</code>.
     */
    public MilkCustomerScheme setSlab3(String slab3) {
        this.slab3 = slab3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_FROM_DATE</code>.
     */
    public LocalDate getValidFromDate() {
        return this.validFromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_FROM_DATE</code>.
     */
    public MilkCustomerScheme setValidFromDate(LocalDate validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_TO</code>.
     */
    public LocalDate getValidTo() {
        return this.validTo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.VALID_TO</code>.
     */
    public MilkCustomerScheme setValidTo(LocalDate validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1_COIN</code>.
     */
    public String getSlab1Coin() {
        return this.slab1Coin;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB1_COIN</code>.
     */
    public MilkCustomerScheme setSlab1Coin(String slab1Coin) {
        this.slab1Coin = slab1Coin;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2_COIN</code>.
     */
    public String getSlab2Coin() {
        return this.slab2Coin;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB2_COIN</code>.
     */
    public MilkCustomerScheme setSlab2Coin(String slab2Coin) {
        this.slab2Coin = slab2Coin;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3_COIN</code>.
     */
    public String getSlab3Coin() {
        return this.slab3Coin;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.SLAB3_COIN</code>.
     */
    public MilkCustomerScheme setSlab3Coin(String slab3Coin) {
        this.slab3Coin = slab3Coin;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_BY</code>.
     */
    public String getUploadedBy() {
        return this.uploadedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_BY</code>.
     */
    public MilkCustomerScheme setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_ON</code>.
     */
    public LocalDateTime getUploadedOn() {
        return this.uploadedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.UPLOADED_ON</code>.
     */
    public MilkCustomerScheme setUploadedOn(LocalDateTime uploadedOn) {
        this.uploadedOn = uploadedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_customer_scheme.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_customer_scheme.STATUS</code>.
     */
    public MilkCustomerScheme setStatus(String status) {
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
        final MilkCustomerScheme other = (MilkCustomerScheme) obj;
        if (customerCode == null) {
            if (other.customerCode != null)
                return false;
        }
        else if (!customerCode.equals(other.customerCode))
            return false;
        if (hdcName == null) {
            if (other.hdcName != null)
                return false;
        }
        else if (!hdcName.equals(other.hdcName))
            return false;
        if (slab1 == null) {
            if (other.slab1 != null)
                return false;
        }
        else if (!slab1.equals(other.slab1))
            return false;
        if (slab2 == null) {
            if (other.slab2 != null)
                return false;
        }
        else if (!slab2.equals(other.slab2))
            return false;
        if (slab3 == null) {
            if (other.slab3 != null)
                return false;
        }
        else if (!slab3.equals(other.slab3))
            return false;
        if (validFromDate == null) {
            if (other.validFromDate != null)
                return false;
        }
        else if (!validFromDate.equals(other.validFromDate))
            return false;
        if (validTo == null) {
            if (other.validTo != null)
                return false;
        }
        else if (!validTo.equals(other.validTo))
            return false;
        if (slab1Coin == null) {
            if (other.slab1Coin != null)
                return false;
        }
        else if (!slab1Coin.equals(other.slab1Coin))
            return false;
        if (slab2Coin == null) {
            if (other.slab2Coin != null)
                return false;
        }
        else if (!slab2Coin.equals(other.slab2Coin))
            return false;
        if (slab3Coin == null) {
            if (other.slab3Coin != null)
                return false;
        }
        else if (!slab3Coin.equals(other.slab3Coin))
            return false;
        if (uploadedBy == null) {
            if (other.uploadedBy != null)
                return false;
        }
        else if (!uploadedBy.equals(other.uploadedBy))
            return false;
        if (uploadedOn == null) {
            if (other.uploadedOn != null)
                return false;
        }
        else if (!uploadedOn.equals(other.uploadedOn))
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
        result = prime * result + ((this.customerCode == null) ? 0 : this.customerCode.hashCode());
        result = prime * result + ((this.hdcName == null) ? 0 : this.hdcName.hashCode());
        result = prime * result + ((this.slab1 == null) ? 0 : this.slab1.hashCode());
        result = prime * result + ((this.slab2 == null) ? 0 : this.slab2.hashCode());
        result = prime * result + ((this.slab3 == null) ? 0 : this.slab3.hashCode());
        result = prime * result + ((this.validFromDate == null) ? 0 : this.validFromDate.hashCode());
        result = prime * result + ((this.validTo == null) ? 0 : this.validTo.hashCode());
        result = prime * result + ((this.slab1Coin == null) ? 0 : this.slab1Coin.hashCode());
        result = prime * result + ((this.slab2Coin == null) ? 0 : this.slab2Coin.hashCode());
        result = prime * result + ((this.slab3Coin == null) ? 0 : this.slab3Coin.hashCode());
        result = prime * result + ((this.uploadedBy == null) ? 0 : this.uploadedBy.hashCode());
        result = prime * result + ((this.uploadedOn == null) ? 0 : this.uploadedOn.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MilkCustomerScheme (");

        sb.append(customerCode);
        sb.append(", ").append(hdcName);
        sb.append(", ").append(slab1);
        sb.append(", ").append(slab2);
        sb.append(", ").append(slab3);
        sb.append(", ").append(validFromDate);
        sb.append(", ").append(validTo);
        sb.append(", ").append(slab1Coin);
        sb.append(", ").append(slab2Coin);
        sb.append(", ").append(slab3Coin);
        sb.append(", ").append(uploadedBy);
        sb.append(", ").append(uploadedOn);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
