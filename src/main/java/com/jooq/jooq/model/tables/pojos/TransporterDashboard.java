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
public class TransporterDashboard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        vendorCode;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private String        period;
    private String        vehicleNo;
    private String        payment;
    private String        dieselNo;
    private String        sd;
    private String        tds;
    private String        gps;
    private String        addition;
    private String        deduction;
    private String        grandTotal;
    private String        netPaymentPaid;
    private String        createdBy;
    private LocalDateTime createdOn;

    public TransporterDashboard() {}

    public TransporterDashboard(TransporterDashboard value) {
        this.vendorCode = value.vendorCode;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
        this.period = value.period;
        this.vehicleNo = value.vehicleNo;
        this.payment = value.payment;
        this.dieselNo = value.dieselNo;
        this.sd = value.sd;
        this.tds = value.tds;
        this.gps = value.gps;
        this.addition = value.addition;
        this.deduction = value.deduction;
        this.grandTotal = value.grandTotal;
        this.netPaymentPaid = value.netPaymentPaid;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
    }

    public TransporterDashboard(
        String        vendorCode,
        LocalDateTime fromDate,
        LocalDateTime toDate,
        String        period,
        String        vehicleNo,
        String        payment,
        String        dieselNo,
        String        sd,
        String        tds,
        String        gps,
        String        addition,
        String        deduction,
        String        grandTotal,
        String        netPaymentPaid,
        String        createdBy,
        LocalDateTime createdOn
    ) {
        this.vendorCode = vendorCode;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.period = period;
        this.vehicleNo = vehicleNo;
        this.payment = payment;
        this.dieselNo = dieselNo;
        this.sd = sd;
        this.tds = tds;
        this.gps = gps;
        this.addition = addition;
        this.deduction = deduction;
        this.grandTotal = grandTotal;
        this.netPaymentPaid = netPaymentPaid;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.VENDOR_CODE</code>.
     */
    public TransporterDashboard setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.FROM_DATE</code>.
     */
    public LocalDateTime getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.FROM_DATE</code>.
     */
    public TransporterDashboard setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.TO_DATE</code>.
     */
    public LocalDateTime getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.TO_DATE</code>.
     */
    public TransporterDashboard setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.PERIOD</code>.
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.PERIOD</code>.
     */
    public TransporterDashboard setPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.VEHICLE_NO</code>.
     */
    public String getVehicleNo() {
        return this.vehicleNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.VEHICLE_NO</code>.
     */
    public TransporterDashboard setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.PAYMENT</code>.
     */
    public String getPayment() {
        return this.payment;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.PAYMENT</code>.
     */
    public TransporterDashboard setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.DIESEL_NO</code>.
     */
    public String getDieselNo() {
        return this.dieselNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.DIESEL_NO</code>.
     */
    public TransporterDashboard setDieselNo(String dieselNo) {
        this.dieselNo = dieselNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.SD</code>.
     */
    public String getSd() {
        return this.sd;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.SD</code>.
     */
    public TransporterDashboard setSd(String sd) {
        this.sd = sd;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.TDS</code>.
     */
    public String getTds() {
        return this.tds;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.TDS</code>.
     */
    public TransporterDashboard setTds(String tds) {
        this.tds = tds;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.GPS</code>.
     */
    public String getGps() {
        return this.gps;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.GPS</code>.
     */
    public TransporterDashboard setGps(String gps) {
        this.gps = gps;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.ADDITION</code>.
     */
    public String getAddition() {
        return this.addition;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.ADDITION</code>.
     */
    public TransporterDashboard setAddition(String addition) {
        this.addition = addition;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.DEDUCTION</code>.
     */
    public String getDeduction() {
        return this.deduction;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.DEDUCTION</code>.
     */
    public TransporterDashboard setDeduction(String deduction) {
        this.deduction = deduction;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.GRAND_TOTAL</code>.
     */
    public String getGrandTotal() {
        return this.grandTotal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.GRAND_TOTAL</code>.
     */
    public TransporterDashboard setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.NET_PAYMENT_PAID</code>.
     */
    public String getNetPaymentPaid() {
        return this.netPaymentPaid;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.NET_PAYMENT_PAID</code>.
     */
    public TransporterDashboard setNetPaymentPaid(String netPaymentPaid) {
        this.netPaymentPaid = netPaymentPaid;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.CREATED_BY</code>.
     */
    public TransporterDashboard setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_dashboard.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_dashboard.CREATED_ON</code>.
     */
    public TransporterDashboard setCreatedOn(LocalDateTime createdOn) {
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
        final TransporterDashboard other = (TransporterDashboard) obj;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (fromDate == null) {
            if (other.fromDate != null)
                return false;
        }
        else if (!fromDate.equals(other.fromDate))
            return false;
        if (toDate == null) {
            if (other.toDate != null)
                return false;
        }
        else if (!toDate.equals(other.toDate))
            return false;
        if (period == null) {
            if (other.period != null)
                return false;
        }
        else if (!period.equals(other.period))
            return false;
        if (vehicleNo == null) {
            if (other.vehicleNo != null)
                return false;
        }
        else if (!vehicleNo.equals(other.vehicleNo))
            return false;
        if (payment == null) {
            if (other.payment != null)
                return false;
        }
        else if (!payment.equals(other.payment))
            return false;
        if (dieselNo == null) {
            if (other.dieselNo != null)
                return false;
        }
        else if (!dieselNo.equals(other.dieselNo))
            return false;
        if (sd == null) {
            if (other.sd != null)
                return false;
        }
        else if (!sd.equals(other.sd))
            return false;
        if (tds == null) {
            if (other.tds != null)
                return false;
        }
        else if (!tds.equals(other.tds))
            return false;
        if (gps == null) {
            if (other.gps != null)
                return false;
        }
        else if (!gps.equals(other.gps))
            return false;
        if (addition == null) {
            if (other.addition != null)
                return false;
        }
        else if (!addition.equals(other.addition))
            return false;
        if (deduction == null) {
            if (other.deduction != null)
                return false;
        }
        else if (!deduction.equals(other.deduction))
            return false;
        if (grandTotal == null) {
            if (other.grandTotal != null)
                return false;
        }
        else if (!grandTotal.equals(other.grandTotal))
            return false;
        if (netPaymentPaid == null) {
            if (other.netPaymentPaid != null)
                return false;
        }
        else if (!netPaymentPaid.equals(other.netPaymentPaid))
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
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.period == null) ? 0 : this.period.hashCode());
        result = prime * result + ((this.vehicleNo == null) ? 0 : this.vehicleNo.hashCode());
        result = prime * result + ((this.payment == null) ? 0 : this.payment.hashCode());
        result = prime * result + ((this.dieselNo == null) ? 0 : this.dieselNo.hashCode());
        result = prime * result + ((this.sd == null) ? 0 : this.sd.hashCode());
        result = prime * result + ((this.tds == null) ? 0 : this.tds.hashCode());
        result = prime * result + ((this.gps == null) ? 0 : this.gps.hashCode());
        result = prime * result + ((this.addition == null) ? 0 : this.addition.hashCode());
        result = prime * result + ((this.deduction == null) ? 0 : this.deduction.hashCode());
        result = prime * result + ((this.grandTotal == null) ? 0 : this.grandTotal.hashCode());
        result = prime * result + ((this.netPaymentPaid == null) ? 0 : this.netPaymentPaid.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TransporterDashboard (");

        sb.append(vendorCode);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);
        sb.append(", ").append(period);
        sb.append(", ").append(vehicleNo);
        sb.append(", ").append(payment);
        sb.append(", ").append(dieselNo);
        sb.append(", ").append(sd);
        sb.append(", ").append(tds);
        sb.append(", ").append(gps);
        sb.append(", ").append(addition);
        sb.append(", ").append(deduction);
        sb.append(", ").append(grandTotal);
        sb.append(", ").append(netPaymentPaid);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
}