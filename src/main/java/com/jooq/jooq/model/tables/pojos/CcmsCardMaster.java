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
public class CcmsCardMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        cardNumber;
    private String        active;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastModifiedBy;
    private LocalDateTime lastModifiedOn;

    public CcmsCardMaster() {}

    public CcmsCardMaster(CcmsCardMaster value) {
        this.cardNumber = value.cardNumber;
        this.active = value.active;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastModifiedBy = value.lastModifiedBy;
        this.lastModifiedOn = value.lastModifiedOn;
    }

    public CcmsCardMaster(
        String        cardNumber,
        String        active,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastModifiedBy,
        LocalDateTime lastModifiedOn
    ) {
        this.cardNumber = cardNumber;
        this.active = active;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_master.card_number</code>.
     */
    public String getCardNumber() {
        return this.cardNumber;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_master.card_number</code>.
     */
    public CcmsCardMaster setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_master.active</code>.
     */
    public String getActive() {
        return this.active;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_master.active</code>.
     */
    public CcmsCardMaster setActive(String active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_master.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_master.created_by</code>.
     */
    public CcmsCardMaster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_master.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_master.created_on</code>.
     */
    public CcmsCardMaster setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_master.last_modified_by</code>.
     */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_master.last_modified_by</code>.
     */
    public CcmsCardMaster setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.ccms_card_master.last_modified_on</code>.
     */
    public LocalDateTime getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.ccms_card_master.last_modified_on</code>.
     */
    public CcmsCardMaster setLastModifiedOn(LocalDateTime lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
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
        final CcmsCardMaster other = (CcmsCardMaster) obj;
        if (cardNumber == null) {
            if (other.cardNumber != null)
                return false;
        }
        else if (!cardNumber.equals(other.cardNumber))
            return false;
        if (active == null) {
            if (other.active != null)
                return false;
        }
        else if (!active.equals(other.active))
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
        if (lastModifiedBy == null) {
            if (other.lastModifiedBy != null)
                return false;
        }
        else if (!lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        if (lastModifiedOn == null) {
            if (other.lastModifiedOn != null)
                return false;
        }
        else if (!lastModifiedOn.equals(other.lastModifiedOn))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.cardNumber == null) ? 0 : this.cardNumber.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastModifiedBy == null) ? 0 : this.lastModifiedBy.hashCode());
        result = prime * result + ((this.lastModifiedOn == null) ? 0 : this.lastModifiedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CcmsCardMaster (");

        sb.append(cardNumber);
        sb.append(", ").append(active);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastModifiedBy);
        sb.append(", ").append(lastModifiedOn);

        sb.append(")");
        return sb.toString();
    }
}