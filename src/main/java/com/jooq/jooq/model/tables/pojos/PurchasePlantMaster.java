/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PurchasePlantMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String planCode;
    private String plantDesc;
    private String tlName;
    private String tlEmail;
    private String status;
    private String level2;
    private String level3;

    public PurchasePlantMaster() {}

    public PurchasePlantMaster(PurchasePlantMaster value) {
        this.planCode = value.planCode;
        this.plantDesc = value.plantDesc;
        this.tlName = value.tlName;
        this.tlEmail = value.tlEmail;
        this.status = value.status;
        this.level2 = value.level2;
        this.level3 = value.level3;
    }

    public PurchasePlantMaster(
        String planCode,
        String plantDesc,
        String tlName,
        String tlEmail,
        String status,
        String level2,
        String level3
    ) {
        this.planCode = planCode;
        this.plantDesc = plantDesc;
        this.tlName = tlName;
        this.tlEmail = tlEmail;
        this.status = status;
        this.level2 = level2;
        this.level3 = level3;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_plant_master.PLAN_CODE</code>.
     */
    public String getPlanCode() {
        return this.planCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_plant_master.PLAN_CODE</code>.
     */
    public PurchasePlantMaster setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_plant_master.PLANT_DESC</code>.
     */
    public String getPlantDesc() {
        return this.plantDesc;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_plant_master.PLANT_DESC</code>.
     */
    public PurchasePlantMaster setPlantDesc(String plantDesc) {
        this.plantDesc = plantDesc;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_plant_master.TL_NAME</code>.
     */
    public String getTlName() {
        return this.tlName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_plant_master.TL_NAME</code>.
     */
    public PurchasePlantMaster setTlName(String tlName) {
        this.tlName = tlName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_plant_master.TL_EMAIL</code>.
     */
    public String getTlEmail() {
        return this.tlEmail;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_plant_master.TL_EMAIL</code>.
     */
    public PurchasePlantMaster setTlEmail(String tlEmail) {
        this.tlEmail = tlEmail;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_plant_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_plant_master.STATUS</code>.
     */
    public PurchasePlantMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_plant_master.LEVEL2</code>.
     */
    public String getLevel2() {
        return this.level2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_plant_master.LEVEL2</code>.
     */
    public PurchasePlantMaster setLevel2(String level2) {
        this.level2 = level2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.purchase_plant_master.LEVEL3</code>.
     */
    public String getLevel3() {
        return this.level3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.purchase_plant_master.LEVEL3</code>.
     */
    public PurchasePlantMaster setLevel3(String level3) {
        this.level3 = level3;
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
        final PurchasePlantMaster other = (PurchasePlantMaster) obj;
        if (planCode == null) {
            if (other.planCode != null)
                return false;
        }
        else if (!planCode.equals(other.planCode))
            return false;
        if (plantDesc == null) {
            if (other.plantDesc != null)
                return false;
        }
        else if (!plantDesc.equals(other.plantDesc))
            return false;
        if (tlName == null) {
            if (other.tlName != null)
                return false;
        }
        else if (!tlName.equals(other.tlName))
            return false;
        if (tlEmail == null) {
            if (other.tlEmail != null)
                return false;
        }
        else if (!tlEmail.equals(other.tlEmail))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (level2 == null) {
            if (other.level2 != null)
                return false;
        }
        else if (!level2.equals(other.level2))
            return false;
        if (level3 == null) {
            if (other.level3 != null)
                return false;
        }
        else if (!level3.equals(other.level3))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.planCode == null) ? 0 : this.planCode.hashCode());
        result = prime * result + ((this.plantDesc == null) ? 0 : this.plantDesc.hashCode());
        result = prime * result + ((this.tlName == null) ? 0 : this.tlName.hashCode());
        result = prime * result + ((this.tlEmail == null) ? 0 : this.tlEmail.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.level2 == null) ? 0 : this.level2.hashCode());
        result = prime * result + ((this.level3 == null) ? 0 : this.level3.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PurchasePlantMaster (");

        sb.append(planCode);
        sb.append(", ").append(plantDesc);
        sb.append(", ").append(tlName);
        sb.append(", ").append(tlEmail);
        sb.append(", ").append(status);
        sb.append(", ").append(level2);
        sb.append(", ").append(level3);

        sb.append(")");
        return sb.toString();
    }
}