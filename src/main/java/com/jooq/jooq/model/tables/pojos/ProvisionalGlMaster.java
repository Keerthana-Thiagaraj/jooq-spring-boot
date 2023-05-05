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
public class ProvisionalGlMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        glAccNo;
    private String        glAccName;
    private String        flag;
    private String        status;
    private String        createdBy;
    private LocalDateTime createdOn;

    public ProvisionalGlMaster() {}

    public ProvisionalGlMaster(ProvisionalGlMaster value) {
        this.glAccNo = value.glAccNo;
        this.glAccName = value.glAccName;
        this.flag = value.flag;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
    }

    public ProvisionalGlMaster(
        String        glAccNo,
        String        glAccName,
        String        flag,
        String        status,
        String        createdBy,
        LocalDateTime createdOn
    ) {
        this.glAccNo = glAccNo;
        this.glAccName = glAccName;
        this.flag = flag;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_gl_master.GL_ACC_NO</code>.
     */
    public String getGlAccNo() {
        return this.glAccNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_gl_master.GL_ACC_NO</code>.
     */
    public ProvisionalGlMaster setGlAccNo(String glAccNo) {
        this.glAccNo = glAccNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_gl_master.GL_ACC_NAME</code>.
     */
    public String getGlAccName() {
        return this.glAccName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_gl_master.GL_ACC_NAME</code>.
     */
    public ProvisionalGlMaster setGlAccName(String glAccName) {
        this.glAccName = glAccName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_gl_master.FLAG</code>.
     */
    public String getFlag() {
        return this.flag;
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_gl_master.FLAG</code>.
     */
    public ProvisionalGlMaster setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_gl_master.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_gl_master.STATUS</code>.
     */
    public ProvisionalGlMaster setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_gl_master.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_gl_master.CREATED_BY</code>.
     */
    public ProvisionalGlMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.provisional_gl_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.provisional_gl_master.CREATED_ON</code>.
     */
    public ProvisionalGlMaster setCreatedOn(LocalDateTime createdOn) {
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
        final ProvisionalGlMaster other = (ProvisionalGlMaster) obj;
        if (glAccNo == null) {
            if (other.glAccNo != null)
                return false;
        }
        else if (!glAccNo.equals(other.glAccNo))
            return false;
        if (glAccName == null) {
            if (other.glAccName != null)
                return false;
        }
        else if (!glAccName.equals(other.glAccName))
            return false;
        if (flag == null) {
            if (other.flag != null)
                return false;
        }
        else if (!flag.equals(other.flag))
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
        result = prime * result + ((this.glAccNo == null) ? 0 : this.glAccNo.hashCode());
        result = prime * result + ((this.glAccName == null) ? 0 : this.glAccName.hashCode());
        result = prime * result + ((this.flag == null) ? 0 : this.flag.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisionalGlMaster (");

        sb.append(glAccNo);
        sb.append(", ").append(glAccName);
        sb.append(", ").append(flag);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
}