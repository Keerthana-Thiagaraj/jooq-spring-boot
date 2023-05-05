/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IvrHolidayMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDate     holidayDate;
    private String        year;
    private String        day;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;

    public IvrHolidayMaster() {}

    public IvrHolidayMaster(IvrHolidayMaster value) {
        this.holidayDate = value.holidayDate;
        this.year = value.year;
        this.day = value.day;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
    }

    public IvrHolidayMaster(
        LocalDate     holidayDate,
        String        year,
        String        day,
        String        status,
        String        createdBy,
        LocalDateTime createdOn
    ) {
        this.holidayDate = holidayDate;
        this.year = year;
        this.day = day;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_holiday_master.HOLIDAY_DATE</code>.
     */
    public LocalDate getHolidayDate() {
        return this.holidayDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_holiday_master.HOLIDAY_DATE</code>.
     */
    public IvrHolidayMaster setHolidayDate(LocalDate holidayDate) {
        this.holidayDate = holidayDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_holiday_master.YEAR</code>.
     */
    public String getYear() {
        return this.year;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_holiday_master.YEAR</code>.
     */
    public IvrHolidayMaster setYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_holiday_master.DAY</code>.
     */
    public String getDay() {
        return this.day;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_holiday_master.DAY</code>.
     */
    public IvrHolidayMaster setDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_holiday_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_holiday_master.STATUS</code>.
     */
    public IvrHolidayMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_holiday_master.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_holiday_master.CREATED_BY</code>.
     */
    public IvrHolidayMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ivr_holiday_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ivr_holiday_master.CREATED_ON</code>.
     */
    public IvrHolidayMaster setCreatedOn(LocalDateTime createdOn) {
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
        final IvrHolidayMaster other = (IvrHolidayMaster) obj;
        if (holidayDate == null) {
            if (other.holidayDate != null)
                return false;
        }
        else if (!holidayDate.equals(other.holidayDate))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        }
        else if (!year.equals(other.year))
            return false;
        if (day == null) {
            if (other.day != null)
                return false;
        }
        else if (!day.equals(other.day))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.holidayDate == null) ? 0 : this.holidayDate.hashCode());
        result = prime * result + ((this.year == null) ? 0 : this.year.hashCode());
        result = prime * result + ((this.day == null) ? 0 : this.day.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IvrHolidayMaster (");

        sb.append(holidayDate);
        sb.append(", ").append(year);
        sb.append(", ").append(day);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
}