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
public class CustomerSfAnswer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        plantCode;
    private String        hmbCode;
    private String        vendorCode;
    private String        state;
    private String        plantName;
    private String        hmbName;
    private String        pid;
    private String        name;
    private Integer       month;
    private String        year;
    private String        roleId;
    private String        categoryId;
    private Integer       qId;
    private String        answer;
    private String        product;
    private String        comments;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;

    public CustomerSfAnswer() {}

    public CustomerSfAnswer(CustomerSfAnswer value) {
        this.compCode = value.compCode;
        this.plantCode = value.plantCode;
        this.hmbCode = value.hmbCode;
        this.vendorCode = value.vendorCode;
        this.state = value.state;
        this.plantName = value.plantName;
        this.hmbName = value.hmbName;
        this.pid = value.pid;
        this.name = value.name;
        this.month = value.month;
        this.year = value.year;
        this.roleId = value.roleId;
        this.categoryId = value.categoryId;
        this.qId = value.qId;
        this.answer = value.answer;
        this.product = value.product;
        this.comments = value.comments;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
    }

    public CustomerSfAnswer(
        String        compCode,
        String        plantCode,
        String        hmbCode,
        String        vendorCode,
        String        state,
        String        plantName,
        String        hmbName,
        String        pid,
        String        name,
        Integer       month,
        String        year,
        String        roleId,
        String        categoryId,
        Integer       qId,
        String        answer,
        String        product,
        String        comments,
        String        status,
        String        createdBy,
        LocalDateTime createdOn
    ) {
        this.compCode = compCode;
        this.plantCode = plantCode;
        this.hmbCode = hmbCode;
        this.vendorCode = vendorCode;
        this.state = state;
        this.plantName = plantName;
        this.hmbName = hmbName;
        this.pid = pid;
        this.name = name;
        this.month = month;
        this.year = year;
        this.roleId = roleId;
        this.categoryId = categoryId;
        this.qId = qId;
        this.answer = answer;
        this.product = product;
        this.comments = comments;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.COMP_CODE</code>.
     */
    public CustomerSfAnswer setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return this.plantCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.PLANT_CODE</code>.
     */
    public CustomerSfAnswer setPlantCode(String plantCode) {
        this.plantCode = plantCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.HMB_CODE</code>.
     */
    public String getHmbCode() {
        return this.hmbCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.HMB_CODE</code>.
     */
    public CustomerSfAnswer setHmbCode(String hmbCode) {
        this.hmbCode = hmbCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.VENDOR_CODE</code>.
     */
    public CustomerSfAnswer setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.STATE</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.STATE</code>.
     */
    public CustomerSfAnswer setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.PLANT_NAME</code>.
     */
    public String getPlantName() {
        return this.plantName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.PLANT_NAME</code>.
     */
    public CustomerSfAnswer setPlantName(String plantName) {
        this.plantName = plantName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.HMB_NAME</code>.
     */
    public String getHmbName() {
        return this.hmbName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.HMB_NAME</code>.
     */
    public CustomerSfAnswer setHmbName(String hmbName) {
        this.hmbName = hmbName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.PID</code>.
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.PID</code>.
     */
    public CustomerSfAnswer setPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.NAME</code>.
     */
    public CustomerSfAnswer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.MONTH</code>.
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.MONTH</code>.
     */
    public CustomerSfAnswer setMonth(Integer month) {
        this.month = month;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.YEAR</code>.
     */
    public String getYear() {
        return this.year;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.YEAR</code>.
     */
    public CustomerSfAnswer setYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.ROLE_ID</code>.
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.ROLE_ID</code>.
     */
    public CustomerSfAnswer setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.CATEGORY_ID</code>.
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.CATEGORY_ID</code>.
     */
    public CustomerSfAnswer setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.Q_ID</code>.
     */
    public Integer getQId() {
        return this.qId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.Q_ID</code>.
     */
    public CustomerSfAnswer setQId(Integer qId) {
        this.qId = qId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.ANSWER</code>.
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.ANSWER</code>.
     */
    public CustomerSfAnswer setAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.PRODUCT</code>.
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.PRODUCT</code>.
     */
    public CustomerSfAnswer setProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.COMMENTS</code>.
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.COMMENTS</code>.
     */
    public CustomerSfAnswer setComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.STATUS</code>.
     */
    public CustomerSfAnswer setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.CREATED_BY</code>.
     */
    public CustomerSfAnswer setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_sf_answer.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_sf_answer.CREATED_ON</code>.
     */
    public CustomerSfAnswer setCreatedOn(LocalDateTime createdOn) {
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
        final CustomerSfAnswer other = (CustomerSfAnswer) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (plantCode == null) {
            if (other.plantCode != null)
                return false;
        }
        else if (!plantCode.equals(other.plantCode))
            return false;
        if (hmbCode == null) {
            if (other.hmbCode != null)
                return false;
        }
        else if (!hmbCode.equals(other.hmbCode))
            return false;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (plantName == null) {
            if (other.plantName != null)
                return false;
        }
        else if (!plantName.equals(other.plantName))
            return false;
        if (hmbName == null) {
            if (other.hmbName != null)
                return false;
        }
        else if (!hmbName.equals(other.hmbName))
            return false;
        if (pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!pid.equals(other.pid))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (month == null) {
            if (other.month != null)
                return false;
        }
        else if (!month.equals(other.month))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        }
        else if (!year.equals(other.year))
            return false;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        if (categoryId == null) {
            if (other.categoryId != null)
                return false;
        }
        else if (!categoryId.equals(other.categoryId))
            return false;
        if (qId == null) {
            if (other.qId != null)
                return false;
        }
        else if (!qId.equals(other.qId))
            return false;
        if (answer == null) {
            if (other.answer != null)
                return false;
        }
        else if (!answer.equals(other.answer))
            return false;
        if (product == null) {
            if (other.product != null)
                return false;
        }
        else if (!product.equals(other.product))
            return false;
        if (comments == null) {
            if (other.comments != null)
                return false;
        }
        else if (!comments.equals(other.comments))
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
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.plantCode == null) ? 0 : this.plantCode.hashCode());
        result = prime * result + ((this.hmbCode == null) ? 0 : this.hmbCode.hashCode());
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.plantName == null) ? 0 : this.plantName.hashCode());
        result = prime * result + ((this.hmbName == null) ? 0 : this.hmbName.hashCode());
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.month == null) ? 0 : this.month.hashCode());
        result = prime * result + ((this.year == null) ? 0 : this.year.hashCode());
        result = prime * result + ((this.roleId == null) ? 0 : this.roleId.hashCode());
        result = prime * result + ((this.categoryId == null) ? 0 : this.categoryId.hashCode());
        result = prime * result + ((this.qId == null) ? 0 : this.qId.hashCode());
        result = prime * result + ((this.answer == null) ? 0 : this.answer.hashCode());
        result = prime * result + ((this.product == null) ? 0 : this.product.hashCode());
        result = prime * result + ((this.comments == null) ? 0 : this.comments.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerSfAnswer (");

        sb.append(compCode);
        sb.append(", ").append(plantCode);
        sb.append(", ").append(hmbCode);
        sb.append(", ").append(vendorCode);
        sb.append(", ").append(state);
        sb.append(", ").append(plantName);
        sb.append(", ").append(hmbName);
        sb.append(", ").append(pid);
        sb.append(", ").append(name);
        sb.append(", ").append(month);
        sb.append(", ").append(year);
        sb.append(", ").append(roleId);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(qId);
        sb.append(", ").append(answer);
        sb.append(", ").append(product);
        sb.append(", ").append(comments);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
}