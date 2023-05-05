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
public class FeedInvoiceHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        invoiceNo;
    private String        plant;
    private String        plantName;
    private String        vendorCode;
    private String        ccCode;
    private String        ccName;
    private String        custNo;
    private String        custName;
    private String        city;
    private String        street;
    private String        postalCode;
    private String        street2;
    private String        street3;
    private String        billDate;
    private String        transportId;
    private String        custReference;
    private String        pan;
    private String        taxNumber;
    private String        street4;
    private String        street5;
    private String        street6;
    private String        city1;
    private String        postalCode1;
    private String        invoiceImage;
    private String        invoiceUrl;
    private String        status;
    private LocalDateTime createdOn;
    private String        createdBy;
    private LocalDateTime lastChangedOn;
    private String        lastChangedBy;
    private String        imageLatitude;
    private String        imageLongitude;

    public FeedInvoiceHeader() {}

    public FeedInvoiceHeader(FeedInvoiceHeader value) {
        this.invoiceNo = value.invoiceNo;
        this.plant = value.plant;
        this.plantName = value.plantName;
        this.vendorCode = value.vendorCode;
        this.ccCode = value.ccCode;
        this.ccName = value.ccName;
        this.custNo = value.custNo;
        this.custName = value.custName;
        this.city = value.city;
        this.street = value.street;
        this.postalCode = value.postalCode;
        this.street2 = value.street2;
        this.street3 = value.street3;
        this.billDate = value.billDate;
        this.transportId = value.transportId;
        this.custReference = value.custReference;
        this.pan = value.pan;
        this.taxNumber = value.taxNumber;
        this.street4 = value.street4;
        this.street5 = value.street5;
        this.street6 = value.street6;
        this.city1 = value.city1;
        this.postalCode1 = value.postalCode1;
        this.invoiceImage = value.invoiceImage;
        this.invoiceUrl = value.invoiceUrl;
        this.status = value.status;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
        this.lastChangedOn = value.lastChangedOn;
        this.lastChangedBy = value.lastChangedBy;
        this.imageLatitude = value.imageLatitude;
        this.imageLongitude = value.imageLongitude;
    }

    public FeedInvoiceHeader(
        String        invoiceNo,
        String        plant,
        String        plantName,
        String        vendorCode,
        String        ccCode,
        String        ccName,
        String        custNo,
        String        custName,
        String        city,
        String        street,
        String        postalCode,
        String        street2,
        String        street3,
        String        billDate,
        String        transportId,
        String        custReference,
        String        pan,
        String        taxNumber,
        String        street4,
        String        street5,
        String        street6,
        String        city1,
        String        postalCode1,
        String        invoiceImage,
        String        invoiceUrl,
        String        status,
        LocalDateTime createdOn,
        String        createdBy,
        LocalDateTime lastChangedOn,
        String        lastChangedBy,
        String        imageLatitude,
        String        imageLongitude
    ) {
        this.invoiceNo = invoiceNo;
        this.plant = plant;
        this.plantName = plantName;
        this.vendorCode = vendorCode;
        this.ccCode = ccCode;
        this.ccName = ccName;
        this.custNo = custNo;
        this.custName = custName;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.street2 = street2;
        this.street3 = street3;
        this.billDate = billDate;
        this.transportId = transportId;
        this.custReference = custReference;
        this.pan = pan;
        this.taxNumber = taxNumber;
        this.street4 = street4;
        this.street5 = street5;
        this.street6 = street6;
        this.city1 = city1;
        this.postalCode1 = postalCode1;
        this.invoiceImage = invoiceImage;
        this.invoiceUrl = invoiceUrl;
        this.status = status;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.lastChangedOn = lastChangedOn;
        this.lastChangedBy = lastChangedBy;
        this.imageLatitude = imageLatitude;
        this.imageLongitude = imageLongitude;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.invoice_no</code>.
     */
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.invoice_no</code>.
     */
    public FeedInvoiceHeader setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.plant</code>.
     */
    public FeedInvoiceHeader setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.plant_name</code>.
     */
    public String getPlantName() {
        return this.plantName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.plant_name</code>.
     */
    public FeedInvoiceHeader setPlantName(String plantName) {
        this.plantName = plantName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.vendor_code</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.vendor_code</code>.
     */
    public FeedInvoiceHeader setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.cc_code</code>.
     */
    public String getCcCode() {
        return this.ccCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.cc_code</code>.
     */
    public FeedInvoiceHeader setCcCode(String ccCode) {
        this.ccCode = ccCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.cc_name</code>.
     */
    public String getCcName() {
        return this.ccName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.cc_name</code>.
     */
    public FeedInvoiceHeader setCcName(String ccName) {
        this.ccName = ccName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.cust_no</code>.
     */
    public String getCustNo() {
        return this.custNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.cust_no</code>.
     */
    public FeedInvoiceHeader setCustNo(String custNo) {
        this.custNo = custNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.cust_name</code>.
     */
    public String getCustName() {
        return this.custName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.cust_name</code>.
     */
    public FeedInvoiceHeader setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.city</code>.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.city</code>.
     */
    public FeedInvoiceHeader setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.street</code>.
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.street</code>.
     */
    public FeedInvoiceHeader setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.postal_code</code>.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.postal_code</code>.
     */
    public FeedInvoiceHeader setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.street2</code>.
     */
    public String getStreet2() {
        return this.street2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.street2</code>.
     */
    public FeedInvoiceHeader setStreet2(String street2) {
        this.street2 = street2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.street3</code>.
     */
    public String getStreet3() {
        return this.street3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.street3</code>.
     */
    public FeedInvoiceHeader setStreet3(String street3) {
        this.street3 = street3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.bill_date</code>.
     */
    public String getBillDate() {
        return this.billDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.bill_date</code>.
     */
    public FeedInvoiceHeader setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.transport_id</code>.
     */
    public String getTransportId() {
        return this.transportId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.transport_id</code>.
     */
    public FeedInvoiceHeader setTransportId(String transportId) {
        this.transportId = transportId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.cust_reference</code>.
     */
    public String getCustReference() {
        return this.custReference;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.cust_reference</code>.
     */
    public FeedInvoiceHeader setCustReference(String custReference) {
        this.custReference = custReference;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.pan</code>.
     */
    public String getPan() {
        return this.pan;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.pan</code>.
     */
    public FeedInvoiceHeader setPan(String pan) {
        this.pan = pan;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.tax_number</code>.
     */
    public String getTaxNumber() {
        return this.taxNumber;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.tax_number</code>.
     */
    public FeedInvoiceHeader setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.street4</code>.
     */
    public String getStreet4() {
        return this.street4;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.street4</code>.
     */
    public FeedInvoiceHeader setStreet4(String street4) {
        this.street4 = street4;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.street5</code>.
     */
    public String getStreet5() {
        return this.street5;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.street5</code>.
     */
    public FeedInvoiceHeader setStreet5(String street5) {
        this.street5 = street5;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.street6</code>.
     */
    public String getStreet6() {
        return this.street6;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.street6</code>.
     */
    public FeedInvoiceHeader setStreet6(String street6) {
        this.street6 = street6;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.city1</code>.
     */
    public String getCity1() {
        return this.city1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.city1</code>.
     */
    public FeedInvoiceHeader setCity1(String city1) {
        this.city1 = city1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.postal_code1</code>.
     */
    public String getPostalCode1() {
        return this.postalCode1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.postal_code1</code>.
     */
    public FeedInvoiceHeader setPostalCode1(String postalCode1) {
        this.postalCode1 = postalCode1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.invoice_image</code>.
     */
    public String getInvoiceImage() {
        return this.invoiceImage;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.invoice_image</code>.
     */
    public FeedInvoiceHeader setInvoiceImage(String invoiceImage) {
        this.invoiceImage = invoiceImage;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.invoice_url</code>.
     */
    public String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.invoice_url</code>.
     */
    public FeedInvoiceHeader setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.status</code>.
     */
    public FeedInvoiceHeader setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.created_on</code>.
     */
    public FeedInvoiceHeader setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.created_by</code>.
     */
    public FeedInvoiceHeader setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.last_changed_on</code>.
     */
    public FeedInvoiceHeader setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.last_changed_by</code>.
     */
    public FeedInvoiceHeader setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.image_latitude</code>.
     */
    public String getImageLatitude() {
        return this.imageLatitude;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.image_latitude</code>.
     */
    public FeedInvoiceHeader setImageLatitude(String imageLatitude) {
        this.imageLatitude = imageLatitude;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_invoice_header.image_longitude</code>.
     */
    public String getImageLongitude() {
        return this.imageLongitude;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_invoice_header.image_longitude</code>.
     */
    public FeedInvoiceHeader setImageLongitude(String imageLongitude) {
        this.imageLongitude = imageLongitude;
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
        final FeedInvoiceHeader other = (FeedInvoiceHeader) obj;
        if (invoiceNo == null) {
            if (other.invoiceNo != null)
                return false;
        }
        else if (!invoiceNo.equals(other.invoiceNo))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (plantName == null) {
            if (other.plantName != null)
                return false;
        }
        else if (!plantName.equals(other.plantName))
            return false;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (ccCode == null) {
            if (other.ccCode != null)
                return false;
        }
        else if (!ccCode.equals(other.ccCode))
            return false;
        if (ccName == null) {
            if (other.ccName != null)
                return false;
        }
        else if (!ccName.equals(other.ccName))
            return false;
        if (custNo == null) {
            if (other.custNo != null)
                return false;
        }
        else if (!custNo.equals(other.custNo))
            return false;
        if (custName == null) {
            if (other.custName != null)
                return false;
        }
        else if (!custName.equals(other.custName))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        }
        else if (!street.equals(other.street))
            return false;
        if (postalCode == null) {
            if (other.postalCode != null)
                return false;
        }
        else if (!postalCode.equals(other.postalCode))
            return false;
        if (street2 == null) {
            if (other.street2 != null)
                return false;
        }
        else if (!street2.equals(other.street2))
            return false;
        if (street3 == null) {
            if (other.street3 != null)
                return false;
        }
        else if (!street3.equals(other.street3))
            return false;
        if (billDate == null) {
            if (other.billDate != null)
                return false;
        }
        else if (!billDate.equals(other.billDate))
            return false;
        if (transportId == null) {
            if (other.transportId != null)
                return false;
        }
        else if (!transportId.equals(other.transportId))
            return false;
        if (custReference == null) {
            if (other.custReference != null)
                return false;
        }
        else if (!custReference.equals(other.custReference))
            return false;
        if (pan == null) {
            if (other.pan != null)
                return false;
        }
        else if (!pan.equals(other.pan))
            return false;
        if (taxNumber == null) {
            if (other.taxNumber != null)
                return false;
        }
        else if (!taxNumber.equals(other.taxNumber))
            return false;
        if (street4 == null) {
            if (other.street4 != null)
                return false;
        }
        else if (!street4.equals(other.street4))
            return false;
        if (street5 == null) {
            if (other.street5 != null)
                return false;
        }
        else if (!street5.equals(other.street5))
            return false;
        if (street6 == null) {
            if (other.street6 != null)
                return false;
        }
        else if (!street6.equals(other.street6))
            return false;
        if (city1 == null) {
            if (other.city1 != null)
                return false;
        }
        else if (!city1.equals(other.city1))
            return false;
        if (postalCode1 == null) {
            if (other.postalCode1 != null)
                return false;
        }
        else if (!postalCode1.equals(other.postalCode1))
            return false;
        if (invoiceImage == null) {
            if (other.invoiceImage != null)
                return false;
        }
        else if (!invoiceImage.equals(other.invoiceImage))
            return false;
        if (invoiceUrl == null) {
            if (other.invoiceUrl != null)
                return false;
        }
        else if (!invoiceUrl.equals(other.invoiceUrl))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (lastChangedOn == null) {
            if (other.lastChangedOn != null)
                return false;
        }
        else if (!lastChangedOn.equals(other.lastChangedOn))
            return false;
        if (lastChangedBy == null) {
            if (other.lastChangedBy != null)
                return false;
        }
        else if (!lastChangedBy.equals(other.lastChangedBy))
            return false;
        if (imageLatitude == null) {
            if (other.imageLatitude != null)
                return false;
        }
        else if (!imageLatitude.equals(other.imageLatitude))
            return false;
        if (imageLongitude == null) {
            if (other.imageLongitude != null)
                return false;
        }
        else if (!imageLongitude.equals(other.imageLongitude))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.invoiceNo == null) ? 0 : this.invoiceNo.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.plantName == null) ? 0 : this.plantName.hashCode());
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.ccCode == null) ? 0 : this.ccCode.hashCode());
        result = prime * result + ((this.ccName == null) ? 0 : this.ccName.hashCode());
        result = prime * result + ((this.custNo == null) ? 0 : this.custNo.hashCode());
        result = prime * result + ((this.custName == null) ? 0 : this.custName.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.street == null) ? 0 : this.street.hashCode());
        result = prime * result + ((this.postalCode == null) ? 0 : this.postalCode.hashCode());
        result = prime * result + ((this.street2 == null) ? 0 : this.street2.hashCode());
        result = prime * result + ((this.street3 == null) ? 0 : this.street3.hashCode());
        result = prime * result + ((this.billDate == null) ? 0 : this.billDate.hashCode());
        result = prime * result + ((this.transportId == null) ? 0 : this.transportId.hashCode());
        result = prime * result + ((this.custReference == null) ? 0 : this.custReference.hashCode());
        result = prime * result + ((this.pan == null) ? 0 : this.pan.hashCode());
        result = prime * result + ((this.taxNumber == null) ? 0 : this.taxNumber.hashCode());
        result = prime * result + ((this.street4 == null) ? 0 : this.street4.hashCode());
        result = prime * result + ((this.street5 == null) ? 0 : this.street5.hashCode());
        result = prime * result + ((this.street6 == null) ? 0 : this.street6.hashCode());
        result = prime * result + ((this.city1 == null) ? 0 : this.city1.hashCode());
        result = prime * result + ((this.postalCode1 == null) ? 0 : this.postalCode1.hashCode());
        result = prime * result + ((this.invoiceImage == null) ? 0 : this.invoiceImage.hashCode());
        result = prime * result + ((this.invoiceUrl == null) ? 0 : this.invoiceUrl.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.imageLatitude == null) ? 0 : this.imageLatitude.hashCode());
        result = prime * result + ((this.imageLongitude == null) ? 0 : this.imageLongitude.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FeedInvoiceHeader (");

        sb.append(invoiceNo);
        sb.append(", ").append(plant);
        sb.append(", ").append(plantName);
        sb.append(", ").append(vendorCode);
        sb.append(", ").append(ccCode);
        sb.append(", ").append(ccName);
        sb.append(", ").append(custNo);
        sb.append(", ").append(custName);
        sb.append(", ").append(city);
        sb.append(", ").append(street);
        sb.append(", ").append(postalCode);
        sb.append(", ").append(street2);
        sb.append(", ").append(street3);
        sb.append(", ").append(billDate);
        sb.append(", ").append(transportId);
        sb.append(", ").append(custReference);
        sb.append(", ").append(pan);
        sb.append(", ").append(taxNumber);
        sb.append(", ").append(street4);
        sb.append(", ").append(street5);
        sb.append(", ").append(street6);
        sb.append(", ").append(city1);
        sb.append(", ").append(postalCode1);
        sb.append(", ").append(invoiceImage);
        sb.append(", ").append(invoiceUrl);
        sb.append(", ").append(status);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(imageLatitude);
        sb.append(", ").append(imageLongitude);

        sb.append(")");
        return sb.toString();
    }
}