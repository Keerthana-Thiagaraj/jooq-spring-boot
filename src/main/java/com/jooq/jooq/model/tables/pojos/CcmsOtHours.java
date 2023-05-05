/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CcmsOtHours implements Serializable {

    private static final long serialVersionUID = 1L;

    private String     workTime;
    private BigDecimal dayCount;

    public CcmsOtHours() {}

    public CcmsOtHours(CcmsOtHours value) {
        this.workTime = value.workTime;
        this.dayCount = value.dayCount;
    }

    public CcmsOtHours(
        String     workTime,
        BigDecimal dayCount
    ) {
        this.workTime = workTime;
        this.dayCount = dayCount;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ot_hours.work_time</code>.
     */
    public String getWorkTime() {
        return this.workTime;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ot_hours.work_time</code>.
     */
    public CcmsOtHours setWorkTime(String workTime) {
        this.workTime = workTime;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_ot_hours.day_count</code>.
     */
    public BigDecimal getDayCount() {
        return this.dayCount;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_ot_hours.day_count</code>.
     */
    public CcmsOtHours setDayCount(BigDecimal dayCount) {
        this.dayCount = dayCount;
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
        final CcmsOtHours other = (CcmsOtHours) obj;
        if (workTime == null) {
            if (other.workTime != null)
                return false;
        }
        else if (!workTime.equals(other.workTime))
            return false;
        if (dayCount == null) {
            if (other.dayCount != null)
                return false;
        }
        else if (!dayCount.equals(other.dayCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.workTime == null) ? 0 : this.workTime.hashCode());
        result = prime * result + ((this.dayCount == null) ? 0 : this.dayCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsOtHours (");

        sb.append(workTime);
        sb.append(", ").append(dayCount);

        sb.append(")");
        return sb.toString();
    }
}