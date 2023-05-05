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
public class CcmsGstMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        state;
    private String        plant;
    private String        gstType;
    private Double        cgst;
    private Double        sgst;
    private String        status;
    private String        effectiveFrom;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public CcmsGstMaster() {}

    public CcmsGstMaster(CcmsGstMaster value) {
        this.state = value.state;
        this.plant = value.plant;
        this.gstType = value.gstType;
        this.cgst = value.cgst;
        this.sgst = value.sgst;
        this.status = value.status;
        this.effectiveFrom = value.effectiveFrom;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public CcmsGstMaster(
        String        state,
        String        plant,
        String        gstType,
        Double        cgst,
        Double        sgst,
        String        status,
        String        effectiveFrom,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.state = state;
        this.plant = plant;
        this.gstType = gstType;
        this.cgst = cgst;
        this.sgst = sgst;
        this.status = status;
        this.effectiveFrom = effectiveFrom;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.state</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.state</code>.
     */
    public CcmsGstMaster setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.plant</code>.
     */
    public CcmsGstMaster setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.gst_type</code>.
     */
    public String getGstType() {
        return this.gstType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.gst_type</code>.
     */
    public CcmsGstMaster setGstType(String gstType) {
        this.gstType = gstType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.cgst</code>.
     */
    public Double getCgst() {
        return this.cgst;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.cgst</code>.
     */
    public CcmsGstMaster setCgst(Double cgst) {
        this.cgst = cgst;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.sgst</code>.
     */
    public Double getSgst() {
        return this.sgst;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.sgst</code>.
     */
    public CcmsGstMaster setSgst(Double sgst) {
        this.sgst = sgst;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.status</code>.
     */
    public CcmsGstMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.effective_from</code>.
     */
    public String getEffectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.effective_from</code>.
     */
    public CcmsGstMaster setEffectiveFrom(String effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.created_by</code>.
     */
    public CcmsGstMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.created_on</code>.
     */
    public CcmsGstMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_by</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_by</code>.
     */
    public CcmsGstMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_on</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_gst_master.last_changed_on</code>.
     */
    public CcmsGstMaster setLastChangedOn(LocalDateTime lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
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
        final CcmsGstMaster other = (CcmsGstMaster) obj;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (gstType == null) {
            if (other.gstType != null)
                return false;
        }
        else if (!gstType.equals(other.gstType))
            return false;
        if (cgst == null) {
            if (other.cgst != null)
                return false;
        }
        else if (!cgst.equals(other.cgst))
            return false;
        if (sgst == null) {
            if (other.sgst != null)
                return false;
        }
        else if (!sgst.equals(other.sgst))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (effectiveFrom == null) {
            if (other.effectiveFrom != null)
                return false;
        }
        else if (!effectiveFrom.equals(other.effectiveFrom))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.gstType == null) ? 0 : this.gstType.hashCode());
        result = prime * result + ((this.cgst == null) ? 0 : this.cgst.hashCode());
        result = prime * result + ((this.sgst == null) ? 0 : this.sgst.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.effectiveFrom == null) ? 0 : this.effectiveFrom.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsGstMaster (");

        sb.append(state);
        sb.append(", ").append(plant);
        sb.append(", ").append(gstType);
        sb.append(", ").append(cgst);
        sb.append(", ").append(sgst);
        sb.append(", ").append(status);
        sb.append(", ").append(effectiveFrom);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
