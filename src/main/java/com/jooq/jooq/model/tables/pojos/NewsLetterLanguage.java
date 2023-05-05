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
public class NewsLetterLanguage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       languageId;
    private String        languageName;
    private String        status;
    private Integer       createdBy;
    private LocalDateTime createdOn;
    private Integer       lastChangedBy;
    private LocalDateTime lastChangedOn;

    public NewsLetterLanguage() {}

    public NewsLetterLanguage(NewsLetterLanguage value) {
        this.languageId = value.languageId;
        this.languageName = value.languageName;
        this.status = value.status;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public NewsLetterLanguage(
        Integer       languageId,
        String        languageName,
        String        status,
        Integer       createdBy,
        LocalDateTime createdOn,
        Integer       lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.news_letter_language.LANGUAGE_ID</code>.
     */
    public Integer getLanguageId() {
        return this.languageId;
    }

    /**
     * Setter for <code>vendor_portal_pbx.news_letter_language.LANGUAGE_ID</code>.
     */
    public NewsLetterLanguage setLanguageId(Integer languageId) {
        this.languageId = languageId;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.news_letter_language.LANGUAGE_NAME</code>.
     */
    public String getLanguageName() {
        return this.languageName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.news_letter_language.LANGUAGE_NAME</code>.
     */
    public NewsLetterLanguage setLanguageName(String languageName) {
        this.languageName = languageName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.news_letter_language.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>vendor_portal_pbx.news_letter_language.STATUS</code>.
     */
    public NewsLetterLanguage setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.news_letter_language.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.news_letter_language.CREATED_BY</code>.
     */
    public NewsLetterLanguage setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.news_letter_language.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.news_letter_language.CREATED_ON</code>.
     */
    public NewsLetterLanguage setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.news_letter_language.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.news_letter_language.LAST_CHANGED_BY</code>.
     */
    public NewsLetterLanguage setLastChangedBy(Integer lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.news_letter_language.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.news_letter_language.LAST_CHANGED_ON</code>.
     */
    public NewsLetterLanguage setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final NewsLetterLanguage other = (NewsLetterLanguage) obj;
        if (languageId == null) {
            if (other.languageId != null)
                return false;
        }
        else if (!languageId.equals(other.languageId))
            return false;
        if (languageName == null) {
            if (other.languageName != null)
                return false;
        }
        else if (!languageName.equals(other.languageName))
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
        result = prime * result + ((this.languageId == null) ? 0 : this.languageId.hashCode());
        result = prime * result + ((this.languageName == null) ? 0 : this.languageName.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NewsLetterLanguage (");

        sb.append(languageId);
        sb.append(", ").append(languageName);
        sb.append(", ").append(status);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
