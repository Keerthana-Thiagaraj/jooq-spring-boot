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
public class TcCeritificateIssue implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       lineId;
    private String        requestId;
    private LocalDate     issueDate;
    private String        certificateId;
    private String        certificateUrl;
    private String        issuedBy;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public TcCeritificateIssue() {}

    public TcCeritificateIssue(TcCeritificateIssue value) {
        this.lineId = value.lineId;
        this.requestId = value.requestId;
        this.issueDate = value.issueDate;
        this.certificateId = value.certificateId;
        this.certificateUrl = value.certificateUrl;
        this.issuedBy = value.issuedBy;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public TcCeritificateIssue(
        Integer       lineId,
        String        requestId,
        LocalDate     issueDate,
        String        certificateId,
        String        certificateUrl,
        String        issuedBy,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.lineId = lineId;
        this.requestId = requestId;
        this.issueDate = issueDate;
        this.certificateId = certificateId;
        this.certificateUrl = certificateUrl;
        this.issuedBy = issuedBy;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.LINE_ID</code>.
     */
    public Integer getLineId() {
        return this.lineId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.LINE_ID</code>.
     */
    public TcCeritificateIssue setLineId(Integer lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.REQUEST_ID</code>.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.REQUEST_ID</code>.
     */
    public TcCeritificateIssue setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.ISSUE_DATE</code>.
     */
    public LocalDate getIssueDate() {
        return this.issueDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.ISSUE_DATE</code>.
     */
    public TcCeritificateIssue setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CERTIFICATE_ID</code>.
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CERTIFICATE_ID</code>.
     */
    public TcCeritificateIssue setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CERTIFICATE_URL</code>.
     */
    public String getCertificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CERTIFICATE_URL</code>.
     */
    public TcCeritificateIssue setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.ISSUED_BY</code>.
     */
    public String getIssuedBy() {
        return this.issuedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.ISSUED_BY</code>.
     */
    public TcCeritificateIssue setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CREATED_BY</code>.
     */
    public TcCeritificateIssue setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.CREATED_ON</code>.
     */
    public TcCeritificateIssue setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.LAST_CHANGED_BY</code>.
     */
    public TcCeritificateIssue setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.TC_CERITIFICATE_ISSUE.LAST_CHANGED_ON</code>.
     */
    public TcCeritificateIssue setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final TcCeritificateIssue other = (TcCeritificateIssue) obj;
        if (lineId == null) {
            if (other.lineId != null)
                return false;
        }
        else if (!lineId.equals(other.lineId))
            return false;
        if (requestId == null) {
            if (other.requestId != null)
                return false;
        }
        else if (!requestId.equals(other.requestId))
            return false;
        if (issueDate == null) {
            if (other.issueDate != null)
                return false;
        }
        else if (!issueDate.equals(other.issueDate))
            return false;
        if (certificateId == null) {
            if (other.certificateId != null)
                return false;
        }
        else if (!certificateId.equals(other.certificateId))
            return false;
        if (certificateUrl == null) {
            if (other.certificateUrl != null)
                return false;
        }
        else if (!certificateUrl.equals(other.certificateUrl))
            return false;
        if (issuedBy == null) {
            if (other.issuedBy != null)
                return false;
        }
        else if (!issuedBy.equals(other.issuedBy))
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
        result = prime * result + ((this.lineId == null) ? 0 : this.lineId.hashCode());
        result = prime * result + ((this.requestId == null) ? 0 : this.requestId.hashCode());
        result = prime * result + ((this.issueDate == null) ? 0 : this.issueDate.hashCode());
        result = prime * result + ((this.certificateId == null) ? 0 : this.certificateId.hashCode());
        result = prime * result + ((this.certificateUrl == null) ? 0 : this.certificateUrl.hashCode());
        result = prime * result + ((this.issuedBy == null) ? 0 : this.issuedBy.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TcCeritificateIssue (");

        sb.append(lineId);
        sb.append(", ").append(requestId);
        sb.append(", ").append(issueDate);
        sb.append(", ").append(certificateId);
        sb.append(", ").append(certificateUrl);
        sb.append(", ").append(issuedBy);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}