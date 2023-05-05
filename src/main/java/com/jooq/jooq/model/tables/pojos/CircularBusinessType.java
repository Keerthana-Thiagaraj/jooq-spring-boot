/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CircularBusinessType implements Serializable {

    private static final long serialVersionUID = 1L;

    private String accGrpCode;
    private String accGrpName;
    private String category;
    private String optionType;

    public CircularBusinessType() {}

    public CircularBusinessType(CircularBusinessType value) {
        this.accGrpCode = value.accGrpCode;
        this.accGrpName = value.accGrpName;
        this.category = value.category;
        this.optionType = value.optionType;
    }

    public CircularBusinessType(
        String accGrpCode,
        String accGrpName,
        String category,
        String optionType
    ) {
        this.accGrpCode = accGrpCode;
        this.accGrpName = accGrpName;
        this.category = category;
        this.optionType = optionType;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_business_type.ACC_GRP_CODE</code>.
     */
    public String getAccGrpCode() {
        return this.accGrpCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_business_type.ACC_GRP_CODE</code>.
     */
    public CircularBusinessType setAccGrpCode(String accGrpCode) {
        this.accGrpCode = accGrpCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_business_type.ACC_GRP_NAME</code>.
     */
    public String getAccGrpName() {
        return this.accGrpName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_business_type.ACC_GRP_NAME</code>.
     */
    public CircularBusinessType setAccGrpName(String accGrpName) {
        this.accGrpName = accGrpName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_business_type.CATEGORY</code>.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_business_type.CATEGORY</code>.
     */
    public CircularBusinessType setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.circular_business_type.OPTION_TYPE</code>.
     */
    public String getOptionType() {
        return this.optionType;
    }

    /**
     * Setter for <code>vendor_portal_pbx.circular_business_type.OPTION_TYPE</code>.
     */
    public CircularBusinessType setOptionType(String optionType) {
        this.optionType = optionType;
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
        final CircularBusinessType other = (CircularBusinessType) obj;
        if (accGrpCode == null) {
            if (other.accGrpCode != null)
                return false;
        }
        else if (!accGrpCode.equals(other.accGrpCode))
            return false;
        if (accGrpName == null) {
            if (other.accGrpName != null)
                return false;
        }
        else if (!accGrpName.equals(other.accGrpName))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        }
        else if (!category.equals(other.category))
            return false;
        if (optionType == null) {
            if (other.optionType != null)
                return false;
        }
        else if (!optionType.equals(other.optionType))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.accGrpCode == null) ? 0 : this.accGrpCode.hashCode());
        result = prime * result + ((this.accGrpName == null) ? 0 : this.accGrpName.hashCode());
        result = prime * result + ((this.category == null) ? 0 : this.category.hashCode());
        result = prime * result + ((this.optionType == null) ? 0 : this.optionType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CircularBusinessType (");

        sb.append(accGrpCode);
        sb.append(", ").append(accGrpName);
        sb.append(", ").append(category);
        sb.append(", ").append(optionType);

        sb.append(")");
        return sb.toString();
    }
}