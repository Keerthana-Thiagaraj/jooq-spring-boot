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
public class TcRequestHa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        requestId;
    private Integer       trainingCenterCode;
    private Integer       trainingCode;
    private Integer       deptCode;
    private LocalDate     startDate;
    private LocalDate     endDate;
    private LocalTime     startTime;
    private LocalTime     endTime;
    private Integer       trainerCode;
    private String        plantVisit;
    private String        plantVisitMeal;
    private String        demoCenter;
    private String        approvalStatus;
    private String        approvedBy;
    private LocalDate     approvedDate;
    private String        approvalRemarks;
    private String        status;
    private String        statusRemarks;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public TcRequestHa() {}

    public TcRequestHa(TcRequestHa value) {
        this.requestId = value.requestId;
        this.trainingCenterCode = value.trainingCenterCode;
        this.trainingCode = value.trainingCode;
        this.deptCode = value.deptCode;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.trainerCode = value.trainerCode;
        this.plantVisit = value.plantVisit;
        this.plantVisitMeal = value.plantVisitMeal;
        this.demoCenter = value.demoCenter;
        this.approvalStatus = value.approvalStatus;
        this.approvedBy = value.approvedBy;
        this.approvedDate = value.approvedDate;
        this.approvalRemarks = value.approvalRemarks;
        this.status = value.status;
        this.statusRemarks = value.statusRemarks;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public TcRequestHa(
        String        requestId,
        Integer       trainingCenterCode,
        Integer       trainingCode,
        Integer       deptCode,
        LocalDate     startDate,
        LocalDate     endDate,
        LocalTime     startTime,
        LocalTime     endTime,
        Integer       trainerCode,
        String        plantVisit,
        String        plantVisitMeal,
        String        demoCenter,
        String        approvalStatus,
        String        approvedBy,
        LocalDate     approvedDate,
        String        approvalRemarks,
        String        status,
        String        statusRemarks,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.requestId = requestId;
        this.trainingCenterCode = trainingCenterCode;
        this.trainingCode = trainingCode;
        this.deptCode = deptCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.trainerCode = trainerCode;
        this.plantVisit = plantVisit;
        this.plantVisitMeal = plantVisitMeal;
        this.demoCenter = demoCenter;
        this.approvalStatus = approvalStatus;
        this.approvedBy = approvedBy;
        this.approvedDate = approvedDate;
        this.approvalRemarks = approvalRemarks;
        this.status = status;
        this.statusRemarks = statusRemarks;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.REQUEST_ID</code>.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.REQUEST_ID</code>.
     */
    public TcRequestHa setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.TRAINING_CENTER_CODE</code>.
     */
    public Integer getTrainingCenterCode() {
        return this.trainingCenterCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.TRAINING_CENTER_CODE</code>.
     */
    public TcRequestHa setTrainingCenterCode(Integer trainingCenterCode) {
        this.trainingCenterCode = trainingCenterCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.TRAINING_CODE</code>.
     */
    public Integer getTrainingCode() {
        return this.trainingCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.TRAINING_CODE</code>.
     */
    public TcRequestHa setTrainingCode(Integer trainingCode) {
        this.trainingCode = trainingCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.DEPT_CODE</code>.
     */
    public Integer getDeptCode() {
        return this.deptCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.DEPT_CODE</code>.
     */
    public TcRequestHa setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.START_DATE</code>.
     */
    public LocalDate getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.START_DATE</code>.
     */
    public TcRequestHa setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.END_DATE</code>.
     */
    public LocalDate getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.END_DATE</code>.
     */
    public TcRequestHa setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.START_TIME</code>.
     */
    public LocalTime getStartTime() {
        return this.startTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.START_TIME</code>.
     */
    public TcRequestHa setStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.END_TIME</code>.
     */
    public LocalTime getEndTime() {
        return this.endTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.END_TIME</code>.
     */
    public TcRequestHa setEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.TRAINER_CODE</code>.
     */
    public Integer getTrainerCode() {
        return this.trainerCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.TRAINER_CODE</code>.
     */
    public TcRequestHa setTrainerCode(Integer trainerCode) {
        this.trainerCode = trainerCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.PLANT_VISIT</code>.
     */
    public String getPlantVisit() {
        return this.plantVisit;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.PLANT_VISIT</code>.
     */
    public TcRequestHa setPlantVisit(String plantVisit) {
        this.plantVisit = plantVisit;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.PLANT_VISIT_MEAL</code>.
     */
    public String getPlantVisitMeal() {
        return this.plantVisitMeal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.PLANT_VISIT_MEAL</code>.
     */
    public TcRequestHa setPlantVisitMeal(String plantVisitMeal) {
        this.plantVisitMeal = plantVisitMeal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.DEMO_CENTER</code>.
     */
    public String getDemoCenter() {
        return this.demoCenter;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.DEMO_CENTER</code>.
     */
    public TcRequestHa setDemoCenter(String demoCenter) {
        this.demoCenter = demoCenter;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVAL_STATUS</code>.
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVAL_STATUS</code>.
     */
    public TcRequestHa setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVED_BY</code>.
     */
    public String getApprovedBy() {
        return this.approvedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVED_BY</code>.
     */
    public TcRequestHa setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVED_DATE</code>.
     */
    public LocalDate getApprovedDate() {
        return this.approvedDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVED_DATE</code>.
     */
    public TcRequestHa setApprovedDate(LocalDate approvedDate) {
        this.approvedDate = approvedDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVAL_REMARKS</code>.
     */
    public String getApprovalRemarks() {
        return this.approvalRemarks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.APPROVAL_REMARKS</code>.
     */
    public TcRequestHa setApprovalRemarks(String approvalRemarks) {
        this.approvalRemarks = approvalRemarks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.STATUS</code>.
     */
    public TcRequestHa setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.STATUS_REMARKS</code>.
     */
    public String getStatusRemarks() {
        return this.statusRemarks;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.STATUS_REMARKS</code>.
     */
    public TcRequestHa setStatusRemarks(String statusRemarks) {
        this.statusRemarks = statusRemarks;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.CREATED_BY</code>.
     */
    public TcRequestHa setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.CREATED_ON</code>.
     */
    public TcRequestHa setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.LAST_CHANGED_BY</code>.
     */
    public TcRequestHa setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_REQUEST_HA.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_REQUEST_HA.LAST_CHANGED_ON</code>.
     */
    public TcRequestHa setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final TcRequestHa other = (TcRequestHa) obj;
        if (requestId == null) {
            if (other.requestId != null)
                return false;
        }
        else if (!requestId.equals(other.requestId))
            return false;
        if (trainingCenterCode == null) {
            if (other.trainingCenterCode != null)
                return false;
        }
        else if (!trainingCenterCode.equals(other.trainingCenterCode))
            return false;
        if (trainingCode == null) {
            if (other.trainingCode != null)
                return false;
        }
        else if (!trainingCode.equals(other.trainingCode))
            return false;
        if (deptCode == null) {
            if (other.deptCode != null)
                return false;
        }
        else if (!deptCode.equals(other.deptCode))
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
        if (trainerCode == null) {
            if (other.trainerCode != null)
                return false;
        }
        else if (!trainerCode.equals(other.trainerCode))
            return false;
        if (plantVisit == null) {
            if (other.plantVisit != null)
                return false;
        }
        else if (!plantVisit.equals(other.plantVisit))
            return false;
        if (plantVisitMeal == null) {
            if (other.plantVisitMeal != null)
                return false;
        }
        else if (!plantVisitMeal.equals(other.plantVisitMeal))
            return false;
        if (demoCenter == null) {
            if (other.demoCenter != null)
                return false;
        }
        else if (!demoCenter.equals(other.demoCenter))
            return false;
        if (approvalStatus == null) {
            if (other.approvalStatus != null)
                return false;
        }
        else if (!approvalStatus.equals(other.approvalStatus))
            return false;
        if (approvedBy == null) {
            if (other.approvedBy != null)
                return false;
        }
        else if (!approvedBy.equals(other.approvedBy))
            return false;
        if (approvedDate == null) {
            if (other.approvedDate != null)
                return false;
        }
        else if (!approvedDate.equals(other.approvedDate))
            return false;
        if (approvalRemarks == null) {
            if (other.approvalRemarks != null)
                return false;
        }
        else if (!approvalRemarks.equals(other.approvalRemarks))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (statusRemarks == null) {
            if (other.statusRemarks != null)
                return false;
        }
        else if (!statusRemarks.equals(other.statusRemarks))
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
        result = prime * result + ((this.requestId == null) ? 0 : this.requestId.hashCode());
        result = prime * result + ((this.trainingCenterCode == null) ? 0 : this.trainingCenterCode.hashCode());
        result = prime * result + ((this.trainingCode == null) ? 0 : this.trainingCode.hashCode());
        result = prime * result + ((this.deptCode == null) ? 0 : this.deptCode.hashCode());
        result = prime * result + ((this.startDate == null) ? 0 : this.startDate.hashCode());
        result = prime * result + ((this.endDate == null) ? 0 : this.endDate.hashCode());
        result = prime * result + ((this.startTime == null) ? 0 : this.startTime.hashCode());
        result = prime * result + ((this.endTime == null) ? 0 : this.endTime.hashCode());
        result = prime * result + ((this.trainerCode == null) ? 0 : this.trainerCode.hashCode());
        result = prime * result + ((this.plantVisit == null) ? 0 : this.plantVisit.hashCode());
        result = prime * result + ((this.plantVisitMeal == null) ? 0 : this.plantVisitMeal.hashCode());
        result = prime * result + ((this.demoCenter == null) ? 0 : this.demoCenter.hashCode());
        result = prime * result + ((this.approvalStatus == null) ? 0 : this.approvalStatus.hashCode());
        result = prime * result + ((this.approvedBy == null) ? 0 : this.approvedBy.hashCode());
        result = prime * result + ((this.approvedDate == null) ? 0 : this.approvedDate.hashCode());
        result = prime * result + ((this.approvalRemarks == null) ? 0 : this.approvalRemarks.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.statusRemarks == null) ? 0 : this.statusRemarks.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcRequestHa (");

        sb.append(requestId);
        sb.append(", ").append(trainingCenterCode);
        sb.append(", ").append(trainingCode);
        sb.append(", ").append(deptCode);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(trainerCode);
        sb.append(", ").append(plantVisit);
        sb.append(", ").append(plantVisitMeal);
        sb.append(", ").append(demoCenter);
        sb.append(", ").append(approvalStatus);
        sb.append(", ").append(approvedBy);
        sb.append(", ").append(approvedDate);
        sb.append(", ").append(approvalRemarks);
        sb.append(", ").append(status);
        sb.append(", ").append(statusRemarks);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
