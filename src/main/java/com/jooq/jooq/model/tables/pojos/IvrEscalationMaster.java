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
public class IvrEscalationMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       serialId;
    private Integer       divisionId;
    private String        divisionDesc;
    private String        businessTypeId;
    private String        businessType;
    private String        escType;
    private String        escDesig;
    private String        escMail;
    private LocalDateTime createdOn;
    private String        createdBy;
    private String        status;

    public IvrEscalationMaster() {}

    public IvrEscalationMaster(IvrEscalationMaster value) {
        this.serialId = value.serialId;
        this.divisionId = value.divisionId;
        this.divisionDesc = value.divisionDesc;
        this.businessTypeId = value.businessTypeId;
        this.businessType = value.businessType;
        this.escType = value.escType;
        this.escDesig = value.escDesig;
        this.escMail = value.escMail;
        this.createdOn = value.createdOn;
        this.createdBy = value.createdBy;
        this.status = value.status;
    }

    public IvrEscalationMaster(
        Integer       serialId,
        Integer       divisionId,
        String        divisionDesc,
        String        businessTypeId,
        String        businessType,
        String        escType,
        String        escDesig,
        String        escMail,
        LocalDateTime createdOn,
        String        createdBy,
        String        status
    ) {
        this.serialId = serialId;
        this.divisionId = divisionId;
        this.divisionDesc = divisionDesc;
        this.businessTypeId = businessTypeId;
        this.businessType = businessType;
        this.escType = escType;
        this.escDesig = escDesig;
        this.escMail = escMail;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.SERIAL_ID</code>.
     */
    public Integer getSerialId() {
        return this.serialId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.SERIAL_ID</code>.
     */
    public IvrEscalationMaster setSerialId(Integer serialId) {
        this.serialId = serialId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_ID</code>.
     */
    public Integer getDivisionId() {
        return this.divisionId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_ID</code>.
     */
    public IvrEscalationMaster setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_DESC</code>.
     */
    public String getDivisionDesc() {
        return this.divisionDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.DIVISION_DESC</code>.
     */
    public IvrEscalationMaster setDivisionDesc(String divisionDesc) {
        this.divisionDesc = divisionDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE_ID</code>.
     */
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE_ID</code>.
     */
    public IvrEscalationMaster setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE</code>.
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.BUSINESS_TYPE</code>.
     */
    public IvrEscalationMaster setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_TYPE</code>.
     */
    public String getEscType() {
        return this.escType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_TYPE</code>.
     */
    public IvrEscalationMaster setEscType(String escType) {
        this.escType = escType;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_DESIG</code>.
     */
    public String getEscDesig() {
        return this.escDesig;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_DESIG</code>.
     */
    public IvrEscalationMaster setEscDesig(String escDesig) {
        this.escDesig = escDesig;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_MAIL</code>.
     */
    public String getEscMail() {
        return this.escMail;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.ESC_MAIL</code>.
     */
    public IvrEscalationMaster setEscMail(String escMail) {
        this.escMail = escMail;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_ON</code>.
     */
    public IvrEscalationMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.CREATED_BY</code>.
     */
    public IvrEscalationMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_escalation_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_escalation_master.STATUS</code>.
     */
    public IvrEscalationMaster setStatus(String status) {
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
        final IvrEscalationMaster other = (IvrEscalationMaster) obj;
        if (serialId == null) {
            if (other.serialId != null)
                return false;
        }
        else if (!serialId.equals(other.serialId))
            return false;
        if (divisionId == null) {
            if (other.divisionId != null)
                return false;
        }
        else if (!divisionId.equals(other.divisionId))
            return false;
        if (divisionDesc == null) {
            if (other.divisionDesc != null)
                return false;
        }
        else if (!divisionDesc.equals(other.divisionDesc))
            return false;
        if (businessTypeId == null) {
            if (other.businessTypeId != null)
                return false;
        }
        else if (!businessTypeId.equals(other.businessTypeId))
            return false;
        if (businessType == null) {
            if (other.businessType != null)
                return false;
        }
        else if (!businessType.equals(other.businessType))
            return false;
        if (escType == null) {
            if (other.escType != null)
                return false;
        }
        else if (!escType.equals(other.escType))
            return false;
        if (escDesig == null) {
            if (other.escDesig != null)
                return false;
        }
        else if (!escDesig.equals(other.escDesig))
            return false;
        if (escMail == null) {
            if (other.escMail != null)
                return false;
        }
        else if (!escMail.equals(other.escMail))
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
        result = prime * result + ((this.serialId == null) ? 0 : this.serialId.hashCode());
        result = prime * result + ((this.divisionId == null) ? 0 : this.divisionId.hashCode());
        result = prime * result + ((this.divisionDesc == null) ? 0 : this.divisionDesc.hashCode());
        result = prime * result + ((this.businessTypeId == null) ? 0 : this.businessTypeId.hashCode());
        result = prime * result + ((this.businessType == null) ? 0 : this.businessType.hashCode());
        result = prime * result + ((this.escType == null) ? 0 : this.escType.hashCode());
        result = prime * result + ((this.escDesig == null) ? 0 : this.escDesig.hashCode());
        result = prime * result + ((this.escMail == null) ? 0 : this.escMail.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IvrEscalationMaster (");

        sb.append(serialId);
        sb.append(", ").append(divisionId);
        sb.append(", ").append(divisionDesc);
        sb.append(", ").append(businessTypeId);
        sb.append(", ").append(businessType);
        sb.append(", ").append(escType);
        sb.append(", ").append(escDesig);
        sb.append(", ").append(escMail);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}