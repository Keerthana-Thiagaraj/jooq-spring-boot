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
public class CcmsSalaryDeductionMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        name;
    private Double        basic;
    private Double        hra;
    private Double        allowance;
    private Double        esi;
    private Double        pf;
    private Double        erEsi;
    private Double        erPf;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private LocalDateTime lastModifiedOn;
    private String        lastModifiedBy;
    private String        effectiveFrom;

    public CcmsSalaryDeductionMaster() {}

    public CcmsSalaryDeductionMaster(CcmsSalaryDeductionMaster value) {
        this.name = value.name;
        this.basic = value.basic;
        this.hra = value.hra;
        this.allowance = value.allowance;
        this.esi = value.esi;
        this.pf = value.pf;
        this.erEsi = value.erEsi;
        this.erPf = value.erPf;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastModifiedOn = value.lastModifiedOn;
        this.lastModifiedBy = value.lastModifiedBy;
        this.effectiveFrom = value.effectiveFrom;
    }

    public CcmsSalaryDeductionMaster(
        String        name,
        Double        basic,
        Double        hra,
        Double        allowance,
        Double        esi,
        Double        pf,
        Double        erEsi,
        Double        erPf,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        LocalDateTime lastModifiedOn,
        String        lastModifiedBy,
        String        effectiveFrom
    ) {
        this.name = name;
        this.basic = basic;
        this.hra = hra;
        this.allowance = allowance;
        this.esi = esi;
        this.pf = pf;
        this.erEsi = erEsi;
        this.erPf = erPf;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastModifiedOn = lastModifiedOn;
        this.lastModifiedBy = lastModifiedBy;
        this.effectiveFrom = effectiveFrom;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.name</code>.
     */
    public CcmsSalaryDeductionMaster setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.basic</code>.
     */
    public Double getBasic() {
        return this.basic;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.basic</code>.
     */
    public CcmsSalaryDeductionMaster setBasic(Double basic) {
        this.basic = basic;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.hra</code>.
     */
    public Double getHra() {
        return this.hra;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.hra</code>.
     */
    public CcmsSalaryDeductionMaster setHra(Double hra) {
        this.hra = hra;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.allowance</code>.
     */
    public Double getAllowance() {
        return this.allowance;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.allowance</code>.
     */
    public CcmsSalaryDeductionMaster setAllowance(Double allowance) {
        this.allowance = allowance;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.esi</code>.
     */
    public Double getEsi() {
        return this.esi;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.esi</code>.
     */
    public CcmsSalaryDeductionMaster setEsi(Double esi) {
        this.esi = esi;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.pf</code>.
     */
    public Double getPf() {
        return this.pf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.pf</code>.
     */
    public CcmsSalaryDeductionMaster setPf(Double pf) {
        this.pf = pf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.er_esi</code>.
     */
    public Double getErEsi() {
        return this.erEsi;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.er_esi</code>.
     */
    public CcmsSalaryDeductionMaster setErEsi(Double erEsi) {
        this.erEsi = erEsi;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.er_pf</code>.
     */
    public Double getErPf() {
        return this.erPf;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.er_pf</code>.
     */
    public CcmsSalaryDeductionMaster setErPf(Double erPf) {
        this.erPf = erPf;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.status</code>.
     */
    public CcmsSalaryDeductionMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.created_by</code>.
     */
    public CcmsSalaryDeductionMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.created_on</code>.
     */
    public CcmsSalaryDeductionMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.last_modified_on</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.last_modified_on</code>.
     */
    public CcmsSalaryDeductionMaster setLastModifiedOn(LocalDateTime lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.last_modified_by</code>.
     */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.last_modified_by</code>.
     */
    public CcmsSalaryDeductionMaster setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_salary_deduction_master.effective_from</code>.
     */
    public String getEffectiveFrom() {
        return this.effectiveFrom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_salary_deduction_master.effective_from</code>.
     */
    public CcmsSalaryDeductionMaster setEffectiveFrom(String effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
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
        final CcmsSalaryDeductionMaster other = (CcmsSalaryDeductionMaster) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (basic == null) {
            if (other.basic != null)
                return false;
        }
        else if (!basic.equals(other.basic))
            return false;
        if (hra == null) {
            if (other.hra != null)
                return false;
        }
        else if (!hra.equals(other.hra))
            return false;
        if (allowance == null) {
            if (other.allowance != null)
                return false;
        }
        else if (!allowance.equals(other.allowance))
            return false;
        if (esi == null) {
            if (other.esi != null)
                return false;
        }
        else if (!esi.equals(other.esi))
            return false;
        if (pf == null) {
            if (other.pf != null)
                return false;
        }
        else if (!pf.equals(other.pf))
            return false;
        if (erEsi == null) {
            if (other.erEsi != null)
                return false;
        }
        else if (!erEsi.equals(other.erEsi))
            return false;
        if (erPf == null) {
            if (other.erPf != null)
                return false;
        }
        else if (!erPf.equals(other.erPf))
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
        if (lastModifiedOn == null) {
            if (other.lastModifiedOn != null)
                return false;
        }
        else if (!lastModifiedOn.equals(other.lastModifiedOn))
            return false;
        if (lastModifiedBy == null) {
            if (other.lastModifiedBy != null)
                return false;
        }
        else if (!lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        if (effectiveFrom == null) {
            if (other.effectiveFrom != null)
                return false;
        }
        else if (!effectiveFrom.equals(other.effectiveFrom))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.basic == null) ? 0 : this.basic.hashCode());
        result = prime * result + ((this.hra == null) ? 0 : this.hra.hashCode());
        result = prime * result + ((this.allowance == null) ? 0 : this.allowance.hashCode());
        result = prime * result + ((this.esi == null) ? 0 : this.esi.hashCode());
        result = prime * result + ((this.pf == null) ? 0 : this.pf.hashCode());
        result = prime * result + ((this.erEsi == null) ? 0 : this.erEsi.hashCode());
        result = prime * result + ((this.erPf == null) ? 0 : this.erPf.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastModifiedOn == null) ? 0 : this.lastModifiedOn.hashCode());
        result = prime * result + ((this.lastModifiedBy == null) ? 0 : this.lastModifiedBy.hashCode());
        result = prime * result + ((this.effectiveFrom == null) ? 0 : this.effectiveFrom.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsSalaryDeductionMaster (");

        sb.append(name);
        sb.append(", ").append(basic);
        sb.append(", ").append(hra);
        sb.append(", ").append(allowance);
        sb.append(", ").append(esi);
        sb.append(", ").append(pf);
        sb.append(", ").append(erEsi);
        sb.append(", ").append(erPf);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastModifiedOn);
        sb.append(", ").append(lastModifiedBy);
        sb.append(", ").append(effectiveFrom);

        sb.append(")");
        return sb.toString();
    }
}