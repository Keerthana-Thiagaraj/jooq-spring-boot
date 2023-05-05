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
public class CcmsMealDeductionHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        empCode;
    private String        plant;
    private Integer       year;
    private String        month;
    private String        punchDate;
    private Long          canteenId;
    private Long          canteen;
    private Long          gate;
    private String        freeMeal;
    private String        createdBy;
    private LocalDateTime createdOn;
    private Double        rate;
    private String        punchTime;
    private String        mealName;
    private Long          gateId;

    public CcmsMealDeductionHistory() {}

    public CcmsMealDeductionHistory(CcmsMealDeductionHistory value) {
        this.empCode = value.empCode;
        this.plant = value.plant;
        this.year = value.year;
        this.month = value.month;
        this.punchDate = value.punchDate;
        this.canteenId = value.canteenId;
        this.canteen = value.canteen;
        this.gate = value.gate;
        this.freeMeal = value.freeMeal;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.rate = value.rate;
        this.punchTime = value.punchTime;
        this.mealName = value.mealName;
        this.gateId = value.gateId;
    }

    public CcmsMealDeductionHistory(
        String        empCode,
        String        plant,
        Integer       year,
        String        month,
        String        punchDate,
        Long          canteenId,
        Long          canteen,
        Long          gate,
        String        freeMeal,
        String        createdBy,
        LocalDateTime createdOn,
        Double        rate,
        String        punchTime,
        String        mealName,
        Long          gateId
    ) {
        this.empCode = empCode;
        this.plant = plant;
        this.year = year;
        this.month = month;
        this.punchDate = punchDate;
        this.canteenId = canteenId;
        this.canteen = canteen;
        this.gate = gate;
        this.freeMeal = freeMeal;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.rate = rate;
        this.punchTime = punchTime;
        this.mealName = mealName;
        this.gateId = gateId;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.emp_code</code>.
     */
    public String getEmpCode() {
        return this.empCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.emp_code</code>.
     */
    public CcmsMealDeductionHistory setEmpCode(String empCode) {
        this.empCode = empCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.plant</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.plant</code>.
     */
    public CcmsMealDeductionHistory setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.year</code>.
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.year</code>.
     */
    public CcmsMealDeductionHistory setYear(Integer year) {
        this.year = year;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.month</code>.
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.month</code>.
     */
    public CcmsMealDeductionHistory setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.punch_date</code>.
     */
    public String getPunchDate() {
        return this.punchDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.punch_date</code>.
     */
    public CcmsMealDeductionHistory setPunchDate(String punchDate) {
        this.punchDate = punchDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.canteen_id</code>.
     */
    public Long getCanteenId() {
        return this.canteenId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.canteen_id</code>.
     */
    public CcmsMealDeductionHistory setCanteenId(Long canteenId) {
        this.canteenId = canteenId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.canteen</code>.
     */
    public Long getCanteen() {
        return this.canteen;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.canteen</code>.
     */
    public CcmsMealDeductionHistory setCanteen(Long canteen) {
        this.canteen = canteen;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.gate</code>.
     */
    public Long getGate() {
        return this.gate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.gate</code>.
     */
    public CcmsMealDeductionHistory setGate(Long gate) {
        this.gate = gate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.free_meal</code>.
     */
    public String getFreeMeal() {
        return this.freeMeal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.free_meal</code>.
     */
    public CcmsMealDeductionHistory setFreeMeal(String freeMeal) {
        this.freeMeal = freeMeal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.created_by</code>.
     */
    public CcmsMealDeductionHistory setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.created_on</code>.
     */
    public CcmsMealDeductionHistory setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.rate</code>.
     */
    public Double getRate() {
        return this.rate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.rate</code>.
     */
    public CcmsMealDeductionHistory setRate(Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.punch_time</code>.
     */
    public String getPunchTime() {
        return this.punchTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.punch_time</code>.
     */
    public CcmsMealDeductionHistory setPunchTime(String punchTime) {
        this.punchTime = punchTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.meal_name</code>.
     */
    public String getMealName() {
        return this.mealName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.meal_name</code>.
     */
    public CcmsMealDeductionHistory setMealName(String mealName) {
        this.mealName = mealName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_meal_deduction_history.gate_id</code>.
     */
    public Long getGateId() {
        return this.gateId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_meal_deduction_history.gate_id</code>.
     */
    public CcmsMealDeductionHistory setGateId(Long gateId) {
        this.gateId = gateId;
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
        final CcmsMealDeductionHistory other = (CcmsMealDeductionHistory) obj;
        if (empCode == null) {
            if (other.empCode != null)
                return false;
        }
        else if (!empCode.equals(other.empCode))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        }
        else if (!year.equals(other.year))
            return false;
        if (month == null) {
            if (other.month != null)
                return false;
        }
        else if (!month.equals(other.month))
            return false;
        if (punchDate == null) {
            if (other.punchDate != null)
                return false;
        }
        else if (!punchDate.equals(other.punchDate))
            return false;
        if (canteenId == null) {
            if (other.canteenId != null)
                return false;
        }
        else if (!canteenId.equals(other.canteenId))
            return false;
        if (canteen == null) {
            if (other.canteen != null)
                return false;
        }
        else if (!canteen.equals(other.canteen))
            return false;
        if (gate == null) {
            if (other.gate != null)
                return false;
        }
        else if (!gate.equals(other.gate))
            return false;
        if (freeMeal == null) {
            if (other.freeMeal != null)
                return false;
        }
        else if (!freeMeal.equals(other.freeMeal))
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
        if (rate == null) {
            if (other.rate != null)
                return false;
        }
        else if (!rate.equals(other.rate))
            return false;
        if (punchTime == null) {
            if (other.punchTime != null)
                return false;
        }
        else if (!punchTime.equals(other.punchTime))
            return false;
        if (mealName == null) {
            if (other.mealName != null)
                return false;
        }
        else if (!mealName.equals(other.mealName))
            return false;
        if (gateId == null) {
            if (other.gateId != null)
                return false;
        }
        else if (!gateId.equals(other.gateId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.empCode == null) ? 0 : this.empCode.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.year == null) ? 0 : this.year.hashCode());
        result = prime * result + ((this.month == null) ? 0 : this.month.hashCode());
        result = prime * result + ((this.punchDate == null) ? 0 : this.punchDate.hashCode());
        result = prime * result + ((this.canteenId == null) ? 0 : this.canteenId.hashCode());
        result = prime * result + ((this.canteen == null) ? 0 : this.canteen.hashCode());
        result = prime * result + ((this.gate == null) ? 0 : this.gate.hashCode());
        result = prime * result + ((this.freeMeal == null) ? 0 : this.freeMeal.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.rate == null) ? 0 : this.rate.hashCode());
        result = prime * result + ((this.punchTime == null) ? 0 : this.punchTime.hashCode());
        result = prime * result + ((this.mealName == null) ? 0 : this.mealName.hashCode());
        result = prime * result + ((this.gateId == null) ? 0 : this.gateId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsMealDeductionHistory (");

        sb.append(empCode);
        sb.append(", ").append(plant);
        sb.append(", ").append(year);
        sb.append(", ").append(month);
        sb.append(", ").append(punchDate);
        sb.append(", ").append(canteenId);
        sb.append(", ").append(canteen);
        sb.append(", ").append(gate);
        sb.append(", ").append(freeMeal);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(rate);
        sb.append(", ").append(punchTime);
        sb.append(", ").append(mealName);
        sb.append(", ").append(gateId);

        sb.append(")");
        return sb.toString();
    }
}