/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DashboardCategoryMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer categoryId;
    private String  categoryName;
    private String  status;

    public DashboardCategoryMaster() {}

    public DashboardCategoryMaster(DashboardCategoryMaster value) {
        this.categoryId = value.categoryId;
        this.categoryName = value.categoryName;
        this.status = value.status;
    }

    public DashboardCategoryMaster(
        Integer categoryId,
        String  categoryName,
        String  status
    ) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.dashboard_category_master.CATEGORY_ID</code>.
     */
    public Integer getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.dashboard_category_master.CATEGORY_ID</code>.
     */
    public DashboardCategoryMaster setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.dashboard_category_master.CATEGORY_NAME</code>.
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.dashboard_category_master.CATEGORY_NAME</code>.
     */
    public DashboardCategoryMaster setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.dashboard_category_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.dashboard_category_master.STATUS</code>.
     */
    public DashboardCategoryMaster setStatus(String status) {
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
        final DashboardCategoryMaster other = (DashboardCategoryMaster) obj;
        if (categoryId == null) {
            if (other.categoryId != null)
                return false;
        }
        else if (!categoryId.equals(other.categoryId))
            return false;
        if (categoryName == null) {
            if (other.categoryName != null)
                return false;
        }
        else if (!categoryName.equals(other.categoryName))
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
        result = prime * result + ((this.categoryId == null) ? 0 : this.categoryId.hashCode());
        result = prime * result + ((this.categoryName == null) ? 0 : this.categoryName.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DashboardCategoryMaster (");

        sb.append(categoryId);
        sb.append(", ").append(categoryName);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}