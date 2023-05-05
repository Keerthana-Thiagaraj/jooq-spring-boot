/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FreezerOverallCount implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rsmId;
    private String rsmName;
    private String overallFreezer;
    private String uploadedFreezer;
    private String percentage;
    private String status;

    public FreezerOverallCount() {}

    public FreezerOverallCount(FreezerOverallCount value) {
        this.rsmId = value.rsmId;
        this.rsmName = value.rsmName;
        this.overallFreezer = value.overallFreezer;
        this.uploadedFreezer = value.uploadedFreezer;
        this.percentage = value.percentage;
        this.status = value.status;
    }

    public FreezerOverallCount(
        String rsmId,
        String rsmName,
        String overallFreezer,
        String uploadedFreezer,
        String percentage,
        String status
    ) {
        this.rsmId = rsmId;
        this.rsmName = rsmName;
        this.overallFreezer = overallFreezer;
        this.uploadedFreezer = uploadedFreezer;
        this.percentage = percentage;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.freezer_overall_count.RSM_ID</code>.
     */
    public String getRsmId() {
        return this.rsmId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.freezer_overall_count.RSM_ID</code>.
     */
    public FreezerOverallCount setRsmId(String rsmId) {
        this.rsmId = rsmId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.freezer_overall_count.RSM_NAME</code>.
     */
    public String getRsmName() {
        return this.rsmName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.freezer_overall_count.RSM_NAME</code>.
     */
    public FreezerOverallCount setRsmName(String rsmName) {
        this.rsmName = rsmName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.freezer_overall_count.OVERALL_FREEZER</code>.
     */
    public String getOverallFreezer() {
        return this.overallFreezer;
    }

    /**
     * Setter for <code>vendor_portal_pbx.freezer_overall_count.OVERALL_FREEZER</code>.
     */
    public FreezerOverallCount setOverallFreezer(String overallFreezer) {
        this.overallFreezer = overallFreezer;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.freezer_overall_count.UPLOADED FREEZER</code>.
     */
    public String getUploadedFreezer() {
        return this.uploadedFreezer;
    }

    /**
     * Setter for <code>vendor_portal_pbx.freezer_overall_count.UPLOADED FREEZER</code>.
     */
    public FreezerOverallCount setUploadedFreezer(String uploadedFreezer) {
        this.uploadedFreezer = uploadedFreezer;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.freezer_overall_count.PERCENTAGE</code>.
     */
    public String getPercentage() {
        return this.percentage;
    }

    /**
     * Setter for <code>vendor_portal_pbx.freezer_overall_count.PERCENTAGE</code>.
     */
    public FreezerOverallCount setPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.freezer_overall_count.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.freezer_overall_count.STATUS</code>.
     */
    public FreezerOverallCount setStatus(String status) {
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
        final FreezerOverallCount other = (FreezerOverallCount) obj;
        if (rsmId == null) {
            if (other.rsmId != null)
                return false;
        }
        else if (!rsmId.equals(other.rsmId))
            return false;
        if (rsmName == null) {
            if (other.rsmName != null)
                return false;
        }
        else if (!rsmName.equals(other.rsmName))
            return false;
        if (overallFreezer == null) {
            if (other.overallFreezer != null)
                return false;
        }
        else if (!overallFreezer.equals(other.overallFreezer))
            return false;
        if (uploadedFreezer == null) {
            if (other.uploadedFreezer != null)
                return false;
        }
        else if (!uploadedFreezer.equals(other.uploadedFreezer))
            return false;
        if (percentage == null) {
            if (other.percentage != null)
                return false;
        }
        else if (!percentage.equals(other.percentage))
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
        result = prime * result + ((this.rsmId == null) ? 0 : this.rsmId.hashCode());
        result = prime * result + ((this.rsmName == null) ? 0 : this.rsmName.hashCode());
        result = prime * result + ((this.overallFreezer == null) ? 0 : this.overallFreezer.hashCode());
        result = prime * result + ((this.uploadedFreezer == null) ? 0 : this.uploadedFreezer.hashCode());
        result = prime * result + ((this.percentage == null) ? 0 : this.percentage.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FreezerOverallCount (");

        sb.append(rsmId);
        sb.append(", ").append(rsmName);
        sb.append(", ").append(overallFreezer);
        sb.append(", ").append(uploadedFreezer);
        sb.append(", ").append(percentage);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}