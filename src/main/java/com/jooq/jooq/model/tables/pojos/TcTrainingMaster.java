/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TcTrainingMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       trainingCode;
    private Integer       trCenterCode;
    private String        trianingName;
    private LocalDate     fromDate;
    private Integer       deptCode;
    private String        plant;
    private String        plantOne;
    private Integer       durationDays;
    private Integer       durationHrs;
    private Integer       minCount;
    private Integer       maxCount;
    private String        demoCenter;
    private LocalDate     toDate;
    private LocalTime     startTime;
    private LocalTime     endTime;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public TcTrainingMaster() {}

    public TcTrainingMaster(TcTrainingMaster value) {
        this.trainingCode = value.trainingCode;
        this.trCenterCode = value.trCenterCode;
        this.trianingName = value.trianingName;
        this.fromDate = value.fromDate;
        this.deptCode = value.deptCode;
        this.plant = value.plant;
        this.plantOne = value.plantOne;
        this.durationDays = value.durationDays;
        this.durationHrs = value.durationHrs;
        this.minCount = value.minCount;
        this.maxCount = value.maxCount;
        this.demoCenter = value.demoCenter;
        this.toDate = value.toDate;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public TcTrainingMaster(
        Integer       trainingCode,
        Integer       trCenterCode,
        String        trianingName,
        LocalDate     fromDate,
        Integer       deptCode,
        String        plant,
        String        plantOne,
        Integer       durationDays,
        Integer       durationHrs,
        Integer       minCount,
        Integer       maxCount,
        String        demoCenter,
        LocalDate     toDate,
        LocalTime     startTime,
        LocalTime     endTime,
        String        status,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.trainingCode = trainingCode;
        this.trCenterCode = trCenterCode;
        this.trianingName = trianingName;
        this.fromDate = fromDate;
        this.deptCode = deptCode;
        this.plant = plant;
        this.plantOne = plantOne;
        this.durationDays = durationDays;
        this.durationHrs = durationHrs;
        this.minCount = minCount;
        this.maxCount = maxCount;
        this.demoCenter = demoCenter;
        this.toDate = toDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TRAINING_CODE</code>.
     */
    public Integer getTrainingCode() {
        return this.trainingCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TRAINING_CODE</code>.
     */
    public TcTrainingMaster setTrainingCode(Integer trainingCode) {
        this.trainingCode = trainingCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TR_CENTER_CODE</code>.
     */
    public Integer getTrCenterCode() {
        return this.trCenterCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TR_CENTER_CODE</code>.
     */
    public TcTrainingMaster setTrCenterCode(Integer trCenterCode) {
        this.trCenterCode = trCenterCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TRIANING_NAME</code>.
     */
    public String getTrianingName() {
        return this.trianingName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TRIANING_NAME</code>.
     */
    public TcTrainingMaster setTrianingName(String trianingName) {
        this.trianingName = trianingName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.FROM_DATE</code>.
     */
    public LocalDate getFromDate() {
        return this.fromDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.FROM_DATE</code>.
     */
    public TcTrainingMaster setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DEPT_CODE</code>.
     */
    public Integer getDeptCode() {
        return this.deptCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DEPT_CODE</code>.
     */
    public TcTrainingMaster setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.PLANT</code>.
     */
    public String getPlant() {
        return this.plant;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.PLANT</code>.
     */
    public TcTrainingMaster setPlant(String plant) {
        this.plant = plant;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.PLANT_ONE</code>.
     */
    public String getPlantOne() {
        return this.plantOne;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.PLANT_ONE</code>.
     */
    public TcTrainingMaster setPlantOne(String plantOne) {
        this.plantOne = plantOne;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DURATION_DAYS</code>.
     */
    public Integer getDurationDays() {
        return this.durationDays;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DURATION_DAYS</code>.
     */
    public TcTrainingMaster setDurationDays(Integer durationDays) {
        this.durationDays = durationDays;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DURATION_HRS</code>.
     */
    public Integer getDurationHrs() {
        return this.durationHrs;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DURATION_HRS</code>.
     */
    public TcTrainingMaster setDurationHrs(Integer durationHrs) {
        this.durationHrs = durationHrs;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.MIN_COUNT</code>.
     */
    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.MIN_COUNT</code>.
     */
    public TcTrainingMaster setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.MAX_COUNT</code>.
     */
    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.MAX_COUNT</code>.
     */
    public TcTrainingMaster setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DEMO_CENTER</code>.
     */
    public String getDemoCenter() {
        return this.demoCenter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.DEMO_CENTER</code>.
     */
    public TcTrainingMaster setDemoCenter(String demoCenter) {
        this.demoCenter = demoCenter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TO_DATE</code>.
     */
    public LocalDate getToDate() {
        return this.toDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.TO_DATE</code>.
     */
    public TcTrainingMaster setToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.START_TIME</code>.
     */
    public LocalTime getStartTime() {
        return this.startTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.START_TIME</code>.
     */
    public TcTrainingMaster setStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.END_TIME</code>.
     */
    public LocalTime getEndTime() {
        return this.endTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.END_TIME</code>.
     */
    public TcTrainingMaster setEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.STATUS</code>.
     */
    public TcTrainingMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.CREATED_BY</code>.
     */
    public TcTrainingMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.CREATED_ON</code>.
     */
    public TcTrainingMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.LAST_CHANGED_BY</code>.
     */
    public TcTrainingMaster setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_TRAINING_MASTER.LAST_CHANGED_ON</code>.
     */
    public TcTrainingMaster setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final TcTrainingMaster other = (TcTrainingMaster) obj;
        if (trainingCode == null) {
            if (other.trainingCode != null)
                return false;
        }
        else if (!trainingCode.equals(other.trainingCode))
            return false;
        if (trCenterCode == null) {
            if (other.trCenterCode != null)
                return false;
        }
        else if (!trCenterCode.equals(other.trCenterCode))
            return false;
        if (trianingName == null) {
            if (other.trianingName != null)
                return false;
        }
        else if (!trianingName.equals(other.trianingName))
            return false;
        if (fromDate == null) {
            if (other.fromDate != null)
                return false;
        }
        else if (!fromDate.equals(other.fromDate))
            return false;
        if (deptCode == null) {
            if (other.deptCode != null)
                return false;
        }
        else if (!deptCode.equals(other.deptCode))
            return false;
        if (plant == null) {
            if (other.plant != null)
                return false;
        }
        else if (!plant.equals(other.plant))
            return false;
        if (plantOne == null) {
            if (other.plantOne != null)
                return false;
        }
        else if (!plantOne.equals(other.plantOne))
            return false;
        if (durationDays == null) {
            if (other.durationDays != null)
                return false;
        }
        else if (!durationDays.equals(other.durationDays))
            return false;
        if (durationHrs == null) {
            if (other.durationHrs != null)
                return false;
        }
        else if (!durationHrs.equals(other.durationHrs))
            return false;
        if (minCount == null) {
            if (other.minCount != null)
                return false;
        }
        else if (!minCount.equals(other.minCount))
            return false;
        if (maxCount == null) {
            if (other.maxCount != null)
                return false;
        }
        else if (!maxCount.equals(other.maxCount))
            return false;
        if (demoCenter == null) {
            if (other.demoCenter != null)
                return false;
        }
        else if (!demoCenter.equals(other.demoCenter))
            return false;
        if (toDate == null) {
            if (other.toDate != null)
                return false;
        }
        else if (!toDate.equals(other.toDate))
            return false;
        if (startTime == null) {
            if (other.startTime != null)
                return false;
        }
        else if (!startTime.equals(other.startTime))
            return false;
        if (endTime == null) {
            if (other.endTime != null)
                return false;
        }
        else if (!endTime.equals(other.endTime))
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
        result = prime * result + ((this.trainingCode == null) ? 0 : this.trainingCode.hashCode());
        result = prime * result + ((this.trCenterCode == null) ? 0 : this.trCenterCode.hashCode());
        result = prime * result + ((this.trianingName == null) ? 0 : this.trianingName.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.deptCode == null) ? 0 : this.deptCode.hashCode());
        result = prime * result + ((this.plant == null) ? 0 : this.plant.hashCode());
        result = prime * result + ((this.plantOne == null) ? 0 : this.plantOne.hashCode());
        result = prime * result + ((this.durationDays == null) ? 0 : this.durationDays.hashCode());
        result = prime * result + ((this.durationHrs == null) ? 0 : this.durationHrs.hashCode());
        result = prime * result + ((this.minCount == null) ? 0 : this.minCount.hashCode());
        result = prime * result + ((this.maxCount == null) ? 0 : this.maxCount.hashCode());
        result = prime * result + ((this.demoCenter == null) ? 0 : this.demoCenter.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        result = prime * result + ((this.startTime == null) ? 0 : this.startTime.hashCode());
        result = prime * result + ((this.endTime == null) ? 0 : this.endTime.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcTrainingMaster (");

        sb.append(trainingCode);
        sb.append(", ").append(trCenterCode);
        sb.append(", ").append(trianingName);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(deptCode);
        sb.append(", ").append(plant);
        sb.append(", ").append(plantOne);
        sb.append(", ").append(durationDays);
        sb.append(", ").append(durationHrs);
        sb.append(", ").append(minCount);
        sb.append(", ").append(maxCount);
        sb.append(", ").append(demoCenter);
        sb.append(", ").append(toDate);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
