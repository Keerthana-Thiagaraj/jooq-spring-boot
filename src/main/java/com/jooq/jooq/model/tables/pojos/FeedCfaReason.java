/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FeedCfaReason implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  reason;
    private String  status;

    public FeedCfaReason() {}

    public FeedCfaReason(FeedCfaReason value) {
        this.id = value.id;
        this.reason = value.reason;
        this.status = value.status;
    }

    public FeedCfaReason(
        Integer id,
        String  reason,
        String  status
    ) {
        this.id = id;
        this.reason = reason;
        this.status = status;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_cfa_reason.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_cfa_reason.id</code>.
     */
    public FeedCfaReason setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_cfa_reason.reason</code>.
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_cfa_reason.reason</code>.
     */
    public FeedCfaReason setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_cfa_reason.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_cfa_reason.status</code>.
     */
    public FeedCfaReason setStatus(String status) {
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
        final FeedCfaReason other = (FeedCfaReason) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        }
        else if (!reason.equals(other.reason))
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
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.reason == null) ? 0 : this.reason.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FeedCfaReason (");

        sb.append(id);
        sb.append(", ").append(reason);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}