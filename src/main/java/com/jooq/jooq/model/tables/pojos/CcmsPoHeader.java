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
public class CcmsPoHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        vendor;
    private String        month;
    private String        year;
    private String        empType;
    private String        plant;
    private String        materialNo;
    private String        strgLocation;
    private String        department;
    private String        createDate;
    private String        currency;
    private String        poNumber;
    private String        status;
    private LocalDateTime createdOn;
    private String        createdBy;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;
    private String        vendorInvoicePdf;
    private String        coldRoomStatus;
    private String        etpStatus;
    private String        motivationalStatus;
    private String        additionalStatus;
    private String        deductionStatus;

    public CcmsPoHeader() {}

    public CcmsPoHeader(CcmsPoHeader value) {
        this.vendor = value.vendor;
        this.month = value.month;
        this.year = value.year;
        this.empType = value.empType;
        this.plant = value.plant;
        this.materialNo = value.materialNo;
        this.strgLocation = value.strgLocation;
        this.department = value.department;
        this.createDate = value.createDate;
        this.currency = value.currency;
        this.poNumber = value.poNumber;
        this.status = value.status;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
        this.vendorInvoicePdf = value.vendorInvoicePdf;
        this.coldRoomStatus = value.coldRoomStatus;
        this.etpStatus = value.etpStatus;
        this.motivationalStatus = value.motivationalStatus;
        this.additionalStatus = value.additionalStatus;
        this.deductionStatus = value.deductionStatus;
    }

    public CcmsPoHeader(
        String        vendor,
        String        month,
        String        year,
        String        empType,
        String        plant,
        String        materialNo,
        String        strgLocation,
        String        department,
        String        createDate,
        String        currency,
        String        poNumber,
        String        status,
        LocalDateTime createdOn,
        String        createdBy,
        String        lastChangedBy,
        LocalDateTime lastChangedOn,
        String        vendorInvoicePdf,
        String        coldRoomStatus,
        String        etpStatus,
        String        motivationalStatus,
        String        additionalStatus,
        String        deductionStatus
    ) {
        this.vendor = vendor;
        this.month = month;
        this.year = year;
        this.empType = empType;
        this.plant = plant;
        this.materialNo = materialNo;
        this.strgLocation = strgLocation;
        this.department = department;
        this.createDate = createDate;
        this.currency = currency;
        this.poNumber = poNumber;
        this.status = status;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
        this.vendorInvoicePdf = vendorInvoicePdf;
        this.coldRoomStatus = coldRoomStatus;
        this.etpStatus = etpStatus;
        this.motivationalStatus = motivationalStatus;
        this.additionalStatus = additionalStatus;
        this.deductionStatus = deductionStatus;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.vendor</code>.
     */
    public String getVendor() {
        return this.vendor;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.vendor</code>.
     */
    public CcmsPoHeader setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.month</code>.
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.month</code>.
     */
    public CcmsPoHeader setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.year</code>.
     */
    public String getYear() {
        return this.year;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.year</code>.
     */
    public CcmsPoHeader setYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.emp_type</code>.
     */
    public String getEmpType() {
        return this.empType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.emp_type</code>.
     */
    public CcmsPoHeader setEmpType(String empType) {
        this.empType = empType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.plant</code>.
     */
    public CcmsPoHeader setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.material_no</code>.
     */
    public String getMaterialNo() {
        return this.materialNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.material_no</code>.
     */
    public CcmsPoHeader setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.strg_location</code>.
     */
    public String getStrgLocation() {
        return this.strgLocation;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.strg_location</code>.
     */
    public CcmsPoHeader setStrgLocation(String strgLocation) {
        this.strgLocation = strgLocation;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.department</code>.
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.department</code>.
     */
    public CcmsPoHeader setDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.create_date</code>.
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.create_date</code>.
     */
    public CcmsPoHeader setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.currency</code>.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.currency</code>.
     */
    public CcmsPoHeader setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.po_number</code>.
     */
    public String getPoNumber() {
        return this.poNumber;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.po_number</code>.
     */
    public CcmsPoHeader setPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.status</code>.
     */
    public CcmsPoHeader setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.created_on</code>.
     */
    public CcmsPoHeader setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.created_by</code>.
     */
    public CcmsPoHeader setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.last_changed_by</code>.
     */
    public CcmsPoHeader setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.last_changed_on</code>.
     */
    public CcmsPoHeader setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.vendor_invoice_pdf</code>.
     */
    public String getVendorInvoicePdf() {
        return this.vendorInvoicePdf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.vendor_invoice_pdf</code>.
     */
    public CcmsPoHeader setVendorInvoicePdf(String vendorInvoicePdf) {
        this.vendorInvoicePdf = vendorInvoicePdf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.cold_room_status</code>.
     */
    public String getColdRoomStatus() {
        return this.coldRoomStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.cold_room_status</code>.
     */
    public CcmsPoHeader setColdRoomStatus(String coldRoomStatus) {
        this.coldRoomStatus = coldRoomStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.etp_status</code>.
     */
    public String getEtpStatus() {
        return this.etpStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.etp_status</code>.
     */
    public CcmsPoHeader setEtpStatus(String etpStatus) {
        this.etpStatus = etpStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.motivational_status</code>.
     */
    public String getMotivationalStatus() {
        return this.motivationalStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.motivational_status</code>.
     */
    public CcmsPoHeader setMotivationalStatus(String motivationalStatus) {
        this.motivationalStatus = motivationalStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.additional_status</code>.
     */
    public String getAdditionalStatus() {
        return this.additionalStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.additional_status</code>.
     */
    public CcmsPoHeader setAdditionalStatus(String additionalStatus) {
        this.additionalStatus = additionalStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_po_header.deduction_status</code>.
     */
    public String getDeductionStatus() {
        return this.deductionStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_po_header.deduction_status</code>.
     */
    public CcmsPoHeader setDeductionStatus(String deductionStatus) {
        this.deductionStatus = deductionStatus;
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
        final CcmsPoHeader other = (CcmsPoHeader) obj;
        if (vendor == null) {
            if (other.vendor != null)
                return false;
        }
        else if (!vendor.equals(other.vendor))
            return false;
        if (month == null) {
            if (other.month != null)
                return false;
        }
        else if (!month.equals(other.month))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        }
        else if (!year.equals(other.year))
            return false;
        if (empType == null) {
            if (other.empType != null)
                return false;
        }
        else if (!empType.equals(other.empType))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (materialNo == null) {
            if (other.materialNo != null)
                return false;
        }
        else if (!materialNo.equals(other.materialNo))
            return false;
        if (strgLocation == null) {
            if (other.strgLocation != null)
                return false;
        }
        else if (!strgLocation.equals(other.strgLocation))
            return false;
        if (department == null) {
            if (other.department != null)
                return false;
        }
        else if (!department.equals(other.department))
            return false;
        if (createDate == null) {
            if (other.createDate != null)
                return false;
        }
        else if (!createDate.equals(other.createDate))
            return false;
        if (currency == null) {
            if (other.currency != null)
                return false;
        }
        else if (!currency.equals(other.currency))
            return false;
        if (poNumber == null) {
            if (other.poNumber != null)
                return false;
        }
        else if (!poNumber.equals(other.poNumber))
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
        if (vendorInvoicePdf == null) {
            if (other.vendorInvoicePdf != null)
                return false;
        }
        else if (!vendorInvoicePdf.equals(other.vendorInvoicePdf))
            return false;
        if (coldRoomStatus == null) {
            if (other.coldRoomStatus != null)
                return false;
        }
        else if (!coldRoomStatus.equals(other.coldRoomStatus))
            return false;
        if (etpStatus == null) {
            if (other.etpStatus != null)
                return false;
        }
        else if (!etpStatus.equals(other.etpStatus))
            return false;
        if (motivationalStatus == null) {
            if (other.motivationalStatus != null)
                return false;
        }
        else if (!motivationalStatus.equals(other.motivationalStatus))
            return false;
        if (additionalStatus == null) {
            if (other.additionalStatus != null)
                return false;
        }
        else if (!additionalStatus.equals(other.additionalStatus))
            return false;
        if (deductionStatus == null) {
            if (other.deductionStatus != null)
                return false;
        }
        else if (!deductionStatus.equals(other.deductionStatus))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.vendor == null) ? 0 : this.vendor.hashCode());
        result = prime * result + ((this.month == null) ? 0 : this.month.hashCode());
        result = prime * result + ((this.year == null) ? 0 : this.year.hashCode());
        result = prime * result + ((this.empType == null) ? 0 : this.empType.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.materialNo == null) ? 0 : this.materialNo.hashCode());
        result = prime * result + ((this.strgLocation == null) ? 0 : this.strgLocation.hashCode());
        result = prime * result + ((this.department == null) ? 0 : this.department.hashCode());
        result = prime * result + ((this.createDate == null) ? 0 : this.createDate.hashCode());
        result = prime * result + ((this.currency == null) ? 0 : this.currency.hashCode());
        result = prime * result + ((this.poNumber == null) ? 0 : this.poNumber.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        result = prime * result + ((this.vendorInvoicePdf == null) ? 0 : this.vendorInvoicePdf.hashCode());
        result = prime * result + ((this.coldRoomStatus == null) ? 0 : this.coldRoomStatus.hashCode());
        result = prime * result + ((this.etpStatus == null) ? 0 : this.etpStatus.hashCode());
        result = prime * result + ((this.motivationalStatus == null) ? 0 : this.motivationalStatus.hashCode());
        result = prime * result + ((this.additionalStatus == null) ? 0 : this.additionalStatus.hashCode());
        result = prime * result + ((this.deductionStatus == null) ? 0 : this.deductionStatus.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsPoHeader (");

        sb.append(vendor);
        sb.append(", ").append(month);
        sb.append(", ").append(year);
        sb.append(", ").append(empType);
        sb.append(", ").append(plant);
        sb.append(", ").append(materialNo);
        sb.append(", ").append(strgLocation);
        sb.append(", ").append(department);
        sb.append(", ").append(createDate);
        sb.append(", ").append(currency);
        sb.append(", ").append(poNumber);
        sb.append(", ").append(status);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);
        sb.append(", ").append(vendorInvoicePdf);
        sb.append(", ").append(coldRoomStatus);
        sb.append(", ").append(etpStatus);
        sb.append(", ").append(motivationalStatus);
        sb.append(", ").append(additionalStatus);
        sb.append(", ").append(deductionStatus);

        sb.append(")");
        return sb.toString();
    }
}