/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VendorLocationHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        vendorCode;
    private String        serialNo;
    private String        factoryOrOffice;
    private String        companyStartYear;
    private String        certificateType;
    private String        otherCertificateType;
    private String        certificateNo;
    private LocalDate     issuedDate;
    private LocalDate     startDate;
    private LocalDate     endDate;
    private byte[]        attachement;
    private String        attachmentType;
    private String        attachmentName;
    private String        locationName;
    private String        doorNo;
    private String        streetName1;
    private String        streetName2;
    private String        city;
    private String        pincode;
    private String        countryCode;
    private String        regionCode;
    private String        districtCode;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;
    private String        locationDeclarationName;
    private String        locationDeclarationNo;
    private LocalDateTime lastEditedOn;

    public VendorLocationHistory() {}

    public VendorLocationHistory(VendorLocationHistory value) {
        this.vendorCode = value.vendorCode;
        this.serialNo = value.serialNo;
        this.factoryOrOffice = value.factoryOrOffice;
        this.companyStartYear = value.companyStartYear;
        this.certificateType = value.certificateType;
        this.otherCertificateType = value.otherCertificateType;
        this.certificateNo = value.certificateNo;
        this.issuedDate = value.issuedDate;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.attachement = value.attachement;
        this.attachmentType = value.attachmentType;
        this.attachmentName = value.attachmentName;
        this.locationName = value.locationName;
        this.doorNo = value.doorNo;
        this.streetName1 = value.streetName1;
        this.streetName2 = value.streetName2;
        this.city = value.city;
        this.pincode = value.pincode;
        this.countryCode = value.countryCode;
        this.regionCode = value.regionCode;
        this.districtCode = value.districtCode;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.locationDeclarationName = value.locationDeclarationName;
        this.locationDeclarationNo = value.locationDeclarationNo;
        this.lastEditedOn = value.lastEditedOn;
    }

    public VendorLocationHistory(
        String        vendorCode,
        String        serialNo,
        String        factoryOrOffice,
        String        companyStartYear,
        String        certificateType,
        String        otherCertificateType,
        String        certificateNo,
        LocalDate     issuedDate,
        LocalDate     startDate,
        LocalDate     endDate,
        byte[]        attachement,
        String        attachmentType,
        String        attachmentName,
        String        locationName,
        String        doorNo,
        String        streetName1,
        String        streetName2,
        String        city,
        String        pincode,
        String        countryCode,
        String        regionCode,
        String        districtCode,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn,
        String        locationDeclarationName,
        String        locationDeclarationNo,
        LocalDateTime lastEditedOn
    ) {
        this.vendorCode = vendorCode;
        this.serialNo = serialNo;
        this.factoryOrOffice = factoryOrOffice;
        this.companyStartYear = companyStartYear;
        this.certificateType = certificateType;
        this.otherCertificateType = otherCertificateType;
        this.certificateNo = certificateNo;
        this.issuedDate = issuedDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.attachement = attachement;
        this.attachmentType = attachmentType;
        this.attachmentName = attachmentName;
        this.locationName = locationName;
        this.doorNo = doorNo;
        this.streetName1 = streetName1;
        this.streetName2 = streetName2;
        this.city = city;
        this.pincode = pincode;
        this.countryCode = countryCode;
        this.regionCode = regionCode;
        this.districtCode = districtCode;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.locationDeclarationName = locationDeclarationName;
        this.locationDeclarationNo = locationDeclarationNo;
        this.lastEditedOn = lastEditedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.VENDOR_CODE</code>.
     */
    public VendorLocationHistory setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.SERIAL_NO</code>.
     */
    public VendorLocationHistory setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.FACTORY_OR_OFFICE</code>.
     */
    public String getFactoryOrOffice() {
        return this.factoryOrOffice;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.FACTORY_OR_OFFICE</code>.
     */
    public VendorLocationHistory setFactoryOrOffice(String factoryOrOffice) {
        this.factoryOrOffice = factoryOrOffice;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.COMPANY_START_YEAR</code>.
     */
    public String getCompanyStartYear() {
        return this.companyStartYear;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.COMPANY_START_YEAR</code>.
     */
    public VendorLocationHistory setCompanyStartYear(String companyStartYear) {
        this.companyStartYear = companyStartYear;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.CERTIFICATE_TYPE</code>.
     */
    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.CERTIFICATE_TYPE</code>.
     */
    public VendorLocationHistory setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.OTHER_CERTIFICATE_TYPE</code>.
     */
    public String getOtherCertificateType() {
        return this.otherCertificateType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.OTHER_CERTIFICATE_TYPE</code>.
     */
    public VendorLocationHistory setOtherCertificateType(String otherCertificateType) {
        this.otherCertificateType = otherCertificateType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.CERTIFICATE_NO</code>.
     */
    public String getCertificateNo() {
        return this.certificateNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.CERTIFICATE_NO</code>.
     */
    public VendorLocationHistory setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.ISSUED_DATE</code>.
     */
    public LocalDate getIssuedDate() {
        return this.issuedDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.ISSUED_DATE</code>.
     */
    public VendorLocationHistory setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.START_DATE</code>.
     */
    public LocalDate getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.START_DATE</code>.
     */
    public VendorLocationHistory setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.END_DATE</code>.
     */
    public LocalDate getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.END_DATE</code>.
     */
    public VendorLocationHistory setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.ATTACHEMENT</code>.
     */
    public byte[] getAttachement() {
        return this.attachement;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.ATTACHEMENT</code>.
     */
    public VendorLocationHistory setAttachement(byte[] attachement) {
        this.attachement = attachement;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.ATTACHMENT_TYPE</code>.
     */
    public String getAttachmentType() {
        return this.attachmentType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.ATTACHMENT_TYPE</code>.
     */
    public VendorLocationHistory setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.ATTACHMENT_NAME</code>.
     */
    public String getAttachmentName() {
        return this.attachmentName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.ATTACHMENT_NAME</code>.
     */
    public VendorLocationHistory setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.LOCATION_NAME</code>.
     */
    public String getLocationName() {
        return this.locationName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.LOCATION_NAME</code>.
     */
    public VendorLocationHistory setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.DOOR_NO</code>.
     */
    public String getDoorNo() {
        return this.doorNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.DOOR_NO</code>.
     */
    public VendorLocationHistory setDoorNo(String doorNo) {
        this.doorNo = doorNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.STREET_NAME1</code>.
     */
    public String getStreetName1() {
        return this.streetName1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.STREET_NAME1</code>.
     */
    public VendorLocationHistory setStreetName1(String streetName1) {
        this.streetName1 = streetName1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.STREET_NAME2</code>.
     */
    public String getStreetName2() {
        return this.streetName2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.STREET_NAME2</code>.
     */
    public VendorLocationHistory setStreetName2(String streetName2) {
        this.streetName2 = streetName2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.CITY</code>.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.CITY</code>.
     */
    public VendorLocationHistory setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.PINCODE</code>.
     */
    public String getPincode() {
        return this.pincode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.PINCODE</code>.
     */
    public VendorLocationHistory setPincode(String pincode) {
        this.pincode = pincode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.COUNTRY_CODE</code>.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.COUNTRY_CODE</code>.
     */
    public VendorLocationHistory setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.REGION_CODE</code>.
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.REGION_CODE</code>.
     */
    public VendorLocationHistory setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.DISTRICT_CODE</code>.
     */
    public String getDistrictCode() {
        return this.districtCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.DISTRICT_CODE</code>.
     */
    public VendorLocationHistory setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.CREATED_BY</code>.
     */
    public VendorLocationHistory setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.CREATED_ON</code>.
     */
    public VendorLocationHistory setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.LAST_CHANGED_BY</code>.
     */
    public VendorLocationHistory setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.LAST_CHANGED_ON</code>.
     */
    public VendorLocationHistory setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.LOCATION_DECLARATION_NAME</code>.
     */
    public String getLocationDeclarationName() {
        return this.locationDeclarationName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.LOCATION_DECLARATION_NAME</code>.
     */
    public VendorLocationHistory setLocationDeclarationName(String locationDeclarationName) {
        this.locationDeclarationName = locationDeclarationName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.LOCATION_DECLARATION_NO</code>.
     */
    public String getLocationDeclarationNo() {
        return this.locationDeclarationNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.LOCATION_DECLARATION_NO</code>.
     */
    public VendorLocationHistory setLocationDeclarationNo(String locationDeclarationNo) {
        this.locationDeclarationNo = locationDeclarationNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_location_history.LAST_EDITED_ON</code>.
     */
    public LocalDateTime getLastEditedOn() {
        return this.lastEditedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_location_history.LAST_EDITED_ON</code>.
     */
    public VendorLocationHistory setLastEditedOn(LocalDateTime lastEditedOn) {
        this.lastEditedOn = lastEditedOn;
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
        final VendorLocationHistory other = (VendorLocationHistory) obj;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (serialNo == null) {
            if (other.serialNo != null)
                return false;
        }
        else if (!serialNo.equals(other.serialNo))
            return false;
        if (factoryOrOffice == null) {
            if (other.factoryOrOffice != null)
                return false;
        }
        else if (!factoryOrOffice.equals(other.factoryOrOffice))
            return false;
        if (companyStartYear == null) {
            if (other.companyStartYear != null)
                return false;
        }
        else if (!companyStartYear.equals(other.companyStartYear))
            return false;
        if (certificateType == null) {
            if (other.certificateType != null)
                return false;
        }
        else if (!certificateType.equals(other.certificateType))
            return false;
        if (otherCertificateType == null) {
            if (other.otherCertificateType != null)
                return false;
        }
        else if (!otherCertificateType.equals(other.otherCertificateType))
            return false;
        if (certificateNo == null) {
            if (other.certificateNo != null)
                return false;
        }
        else if (!certificateNo.equals(other.certificateNo))
            return false;
        if (issuedDate == null) {
            if (other.issuedDate != null)
                return false;
        }
        else if (!issuedDate.equals(other.issuedDate))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        }
        else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        }
        else if (!endDate.equals(other.endDate))
            return false;
        if (attachement == null) {
            if (other.attachement != null)
                return false;
        }
        else if (!Arrays.equals(attachement, other.attachement))
            return false;
        if (attachmentType == null) {
            if (other.attachmentType != null)
                return false;
        }
        else if (!attachmentType.equals(other.attachmentType))
            return false;
        if (attachmentName == null) {
            if (other.attachmentName != null)
                return false;
        }
        else if (!attachmentName.equals(other.attachmentName))
            return false;
        if (locationName == null) {
            if (other.locationName != null)
                return false;
        }
        else if (!locationName.equals(other.locationName))
            return false;
        if (doorNo == null) {
            if (other.doorNo != null)
                return false;
        }
        else if (!doorNo.equals(other.doorNo))
            return false;
        if (streetName1 == null) {
            if (other.streetName1 != null)
                return false;
        }
        else if (!streetName1.equals(other.streetName1))
            return false;
        if (streetName2 == null) {
            if (other.streetName2 != null)
                return false;
        }
        else if (!streetName2.equals(other.streetName2))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (pincode == null) {
            if (other.pincode != null)
                return false;
        }
        else if (!pincode.equals(other.pincode))
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
        if (districtCode == null) {
            if (other.districtCode != null)
                return false;
        }
        else if (!districtCode.equals(other.districtCode))
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
        if (locationDeclarationName == null) {
            if (other.locationDeclarationName != null)
                return false;
        }
        else if (!locationDeclarationName.equals(other.locationDeclarationName))
            return false;
        if (locationDeclarationNo == null) {
            if (other.locationDeclarationNo != null)
                return false;
        }
        else if (!locationDeclarationNo.equals(other.locationDeclarationNo))
            return false;
        if (lastEditedOn == null) {
            if (other.lastEditedOn != null)
                return false;
        }
        else if (!lastEditedOn.equals(other.lastEditedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.serialNo == null) ? 0 : this.serialNo.hashCode());
        result = prime * result + ((this.factoryOrOffice == null) ? 0 : this.factoryOrOffice.hashCode());
        result = prime * result + ((this.companyStartYear == null) ? 0 : this.companyStartYear.hashCode());
        result = prime * result + ((this.certificateType == null) ? 0 : this.certificateType.hashCode());
        result = prime * result + ((this.otherCertificateType == null) ? 0 : this.otherCertificateType.hashCode());
        result = prime * result + ((this.certificateNo == null) ? 0 : this.certificateNo.hashCode());
        result = prime * result + ((this.issuedDate == null) ? 0 : this.issuedDate.hashCode());
        result = prime * result + ((this.startDate == null) ? 0 : this.startDate.hashCode());
        result = prime * result + ((this.endDate == null) ? 0 : this.endDate.hashCode());
        result = prime * result + ((this.attachement == null) ? 0 : Arrays.hashCode(this.attachement));
        result = prime * result + ((this.attachmentType == null) ? 0 : this.attachmentType.hashCode());
        result = prime * result + ((this.attachmentName == null) ? 0 : this.attachmentName.hashCode());
        result = prime * result + ((this.locationName == null) ? 0 : this.locationName.hashCode());
        result = prime * result + ((this.doorNo == null) ? 0 : this.doorNo.hashCode());
        result = prime * result + ((this.streetName1 == null) ? 0 : this.streetName1.hashCode());
        result = prime * result + ((this.streetName2 == null) ? 0 : this.streetName2.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.pincode == null) ? 0 : this.pincode.hashCode());
        result = prime * result + ((this.countryCode == null) ? 0 : this.countryCode.hashCode());
        result = prime * result + ((this.regionCode == null) ? 0 : this.regionCode.hashCode());
        result = prime * result + ((this.districtCode == null) ? 0 : this.districtCode.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.locationDeclarationName == null) ? 0 : this.locationDeclarationName.hashCode());
        result = prime * result + ((this.locationDeclarationNo == null) ? 0 : this.locationDeclarationNo.hashCode());
        result = prime * result + ((this.lastEditedOn == null) ? 0 : this.lastEditedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VendorLocationHistory (");

        sb.append(vendorCode);
        sb.append(", ").append(serialNo);
        sb.append(", ").append(factoryOrOffice);
        sb.append(", ").append(companyStartYear);
        sb.append(", ").append(certificateType);
        sb.append(", ").append(otherCertificateType);
        sb.append(", ").append(certificateNo);
        sb.append(", ").append(issuedDate);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(attachmentType);
        sb.append(", ").append(attachmentName);
        sb.append(", ").append(locationName);
        sb.append(", ").append(doorNo);
        sb.append(", ").append(streetName1);
        sb.append(", ").append(streetName2);
        sb.append(", ").append(city);
        sb.append(", ").append(pincode);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(regionCode);
        sb.append(", ").append(districtCode);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(locationDeclarationName);
        sb.append(", ").append(locationDeclarationNo);
        sb.append(", ").append(lastEditedOn);

        sb.append(")");
        return sb.toString();
    }
}