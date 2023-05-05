/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VendorEvaluation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        vendorCode;
    private String        serialNo;
    private String        evalQuestion;
    private String        evalYesNo;
    private String        evalPersonName;
    private LocalDate     evalDate;
    private String        evalFreeText;
    private byte[]        attachement;
    private String        additionalPersonStatus;
    private String        additionalPersonName1;
    private String        additionalPersonContact1;
    private String        additionalPersonName2;
    private String        additionalPersonContact2;
    private String        additionalPersonName3;
    private String        additionalPersonContact3;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public VendorEvaluation() {}

    public VendorEvaluation(VendorEvaluation value) {
        this.vendorCode = value.vendorCode;
        this.serialNo = value.serialNo;
        this.evalQuestion = value.evalQuestion;
        this.evalYesNo = value.evalYesNo;
        this.evalPersonName = value.evalPersonName;
        this.evalDate = value.evalDate;
        this.evalFreeText = value.evalFreeText;
        this.attachement = value.attachement;
        this.additionalPersonStatus = value.additionalPersonStatus;
        this.additionalPersonName1 = value.additionalPersonName1;
        this.additionalPersonContact1 = value.additionalPersonContact1;
        this.additionalPersonName2 = value.additionalPersonName2;
        this.additionalPersonContact2 = value.additionalPersonContact2;
        this.additionalPersonName3 = value.additionalPersonName3;
        this.additionalPersonContact3 = value.additionalPersonContact3;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public VendorEvaluation(
        String        vendorCode,
        String        serialNo,
        String        evalQuestion,
        String        evalYesNo,
        String        evalPersonName,
        LocalDate     evalDate,
        String        evalFreeText,
        byte[]        attachement,
        String        additionalPersonStatus,
        String        additionalPersonName1,
        String        additionalPersonContact1,
        String        additionalPersonName2,
        String        additionalPersonContact2,
        String        additionalPersonName3,
        String        additionalPersonContact3,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.vendorCode = vendorCode;
        this.serialNo = serialNo;
        this.evalQuestion = evalQuestion;
        this.evalYesNo = evalYesNo;
        this.evalPersonName = evalPersonName;
        this.evalDate = evalDate;
        this.evalFreeText = evalFreeText;
        this.attachement = attachement;
        this.additionalPersonStatus = additionalPersonStatus;
        this.additionalPersonName1 = additionalPersonName1;
        this.additionalPersonContact1 = additionalPersonContact1;
        this.additionalPersonName2 = additionalPersonName2;
        this.additionalPersonContact2 = additionalPersonContact2;
        this.additionalPersonName3 = additionalPersonName3;
        this.additionalPersonContact3 = additionalPersonContact3;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.VENDOR_CODE</code>.
     */
    public VendorEvaluation setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.SERIAL_NO</code>.
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.SERIAL_NO</code>.
     */
    public VendorEvaluation setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_QUESTION</code>.
     */
    public String getEvalQuestion() {
        return this.evalQuestion;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_QUESTION</code>.
     */
    public VendorEvaluation setEvalQuestion(String evalQuestion) {
        this.evalQuestion = evalQuestion;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_YES_NO</code>.
     */
    public String getEvalYesNo() {
        return this.evalYesNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_YES_NO</code>.
     */
    public VendorEvaluation setEvalYesNo(String evalYesNo) {
        this.evalYesNo = evalYesNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_PERSON_NAME</code>.
     */
    public String getEvalPersonName() {
        return this.evalPersonName;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_PERSON_NAME</code>.
     */
    public VendorEvaluation setEvalPersonName(String evalPersonName) {
        this.evalPersonName = evalPersonName;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_DATE</code>.
     */
    public LocalDate getEvalDate() {
        return this.evalDate;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_DATE</code>.
     */
    public VendorEvaluation setEvalDate(LocalDate evalDate) {
        this.evalDate = evalDate;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_FREE_TEXT</code>.
     */
    public String getEvalFreeText() {
        return this.evalFreeText;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.EVAL_FREE_TEXT</code>.
     */
    public VendorEvaluation setEvalFreeText(String evalFreeText) {
        this.evalFreeText = evalFreeText;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ATTACHEMENT</code>.
     */
    public byte[] getAttachement() {
        return this.attachement;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ATTACHEMENT</code>.
     */
    public VendorEvaluation setAttachement(byte[] attachement) {
        this.attachement = attachement;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_STATUS</code>.
     */
    public String getAdditionalPersonStatus() {
        return this.additionalPersonStatus;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_STATUS</code>.
     */
    public VendorEvaluation setAdditionalPersonStatus(String additionalPersonStatus) {
        this.additionalPersonStatus = additionalPersonStatus;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_NAME1</code>.
     */
    public String getAdditionalPersonName1() {
        return this.additionalPersonName1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_NAME1</code>.
     */
    public VendorEvaluation setAdditionalPersonName1(String additionalPersonName1) {
        this.additionalPersonName1 = additionalPersonName1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_CONTACT1</code>.
     */
    public String getAdditionalPersonContact1() {
        return this.additionalPersonContact1;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_CONTACT1</code>.
     */
    public VendorEvaluation setAdditionalPersonContact1(String additionalPersonContact1) {
        this.additionalPersonContact1 = additionalPersonContact1;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_NAME2</code>.
     */
    public String getAdditionalPersonName2() {
        return this.additionalPersonName2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_NAME2</code>.
     */
    public VendorEvaluation setAdditionalPersonName2(String additionalPersonName2) {
        this.additionalPersonName2 = additionalPersonName2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_CONTACT2</code>.
     */
    public String getAdditionalPersonContact2() {
        return this.additionalPersonContact2;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_CONTACT2</code>.
     */
    public VendorEvaluation setAdditionalPersonContact2(String additionalPersonContact2) {
        this.additionalPersonContact2 = additionalPersonContact2;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_NAME3</code>.
     */
    public String getAdditionalPersonName3() {
        return this.additionalPersonName3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_NAME3</code>.
     */
    public VendorEvaluation setAdditionalPersonName3(String additionalPersonName3) {
        this.additionalPersonName3 = additionalPersonName3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_CONTACT3</code>.
     */
    public String getAdditionalPersonContact3() {
        return this.additionalPersonContact3;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.ADDITIONAL_PERSON_CONTACT3</code>.
     */
    public VendorEvaluation setAdditionalPersonContact3(String additionalPersonContact3) {
        this.additionalPersonContact3 = additionalPersonContact3;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.CREATED_BY</code>.
     */
    public VendorEvaluation setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.CREATED_ON</code>.
     */
    public VendorEvaluation setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.LAST_CHANGED_BY</code>.
     */
    public VendorEvaluation setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.vendor_evaluation.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.vendor_evaluation.LAST_CHANGED_ON</code>.
     */
    public VendorEvaluation setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final VendorEvaluation other = (VendorEvaluation) obj;
        if (vendorCode == null) {
            if (other.vendorCode != null)
                return false;
        }
        else if (!vendorCode.equals(other.vendorCode))
            return false;
        if (serialNo == null) {
            if (other.serialNo != null)
                return false;
        }
        else if (!serialNo.equals(other.serialNo))
            return false;
        if (evalQuestion == null) {
            if (other.evalQuestion != null)
                return false;
        }
        else if (!evalQuestion.equals(other.evalQuestion))
            return false;
        if (evalYesNo == null) {
            if (other.evalYesNo != null)
                return false;
        }
        else if (!evalYesNo.equals(other.evalYesNo))
            return false;
        if (evalPersonName == null) {
            if (other.evalPersonName != null)
                return false;
        }
        else if (!evalPersonName.equals(other.evalPersonName))
            return false;
        if (evalDate == null) {
            if (other.evalDate != null)
                return false;
        }
        else if (!evalDate.equals(other.evalDate))
            return false;
        if (evalFreeText == null) {
            if (other.evalFreeText != null)
                return false;
        }
        else if (!evalFreeText.equals(other.evalFreeText))
            return false;
        if (attachement == null) {
            if (other.attachement != null)
                return false;
        }
        else if (!Arrays.equals(attachement, other.attachement))
            return false;
        if (additionalPersonStatus == null) {
            if (other.additionalPersonStatus != null)
                return false;
        }
        else if (!additionalPersonStatus.equals(other.additionalPersonStatus))
            return false;
        if (additionalPersonName1 == null) {
            if (other.additionalPersonName1 != null)
                return false;
        }
        else if (!additionalPersonName1.equals(other.additionalPersonName1))
            return false;
        if (additionalPersonContact1 == null) {
            if (other.additionalPersonContact1 != null)
                return false;
        }
        else if (!additionalPersonContact1.equals(other.additionalPersonContact1))
            return false;
        if (additionalPersonName2 == null) {
            if (other.additionalPersonName2 != null)
                return false;
        }
        else if (!additionalPersonName2.equals(other.additionalPersonName2))
            return false;
        if (additionalPersonContact2 == null) {
            if (other.additionalPersonContact2 != null)
                return false;
        }
        else if (!additionalPersonContact2.equals(other.additionalPersonContact2))
            return false;
        if (additionalPersonName3 == null) {
            if (other.additionalPersonName3 != null)
                return false;
        }
        else if (!additionalPersonName3.equals(other.additionalPersonName3))
            return false;
        if (additionalPersonContact3 == null) {
            if (other.additionalPersonContact3 != null)
                return false;
        }
        else if (!additionalPersonContact3.equals(other.additionalPersonContact3))
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
        result = prime * result + ((this.vendorCode == null) ? 0 : this.vendorCode.hashCode());
        result = prime * result + ((this.serialNo == null) ? 0 : this.serialNo.hashCode());
        result = prime * result + ((this.evalQuestion == null) ? 0 : this.evalQuestion.hashCode());
        result = prime * result + ((this.evalYesNo == null) ? 0 : this.evalYesNo.hashCode());
        result = prime * result + ((this.evalPersonName == null) ? 0 : this.evalPersonName.hashCode());
        result = prime * result + ((this.evalDate == null) ? 0 : this.evalDate.hashCode());
        result = prime * result + ((this.evalFreeText == null) ? 0 : this.evalFreeText.hashCode());
        result = prime * result + ((this.attachement == null) ? 0 : Arrays.hashCode(this.attachement));
        result = prime * result + ((this.additionalPersonStatus == null) ? 0 : this.additionalPersonStatus.hashCode());
        result = prime * result + ((this.additionalPersonName1 == null) ? 0 : this.additionalPersonName1.hashCode());
        result = prime * result + ((this.additionalPersonContact1 == null) ? 0 : this.additionalPersonContact1.hashCode());
        result = prime * result + ((this.additionalPersonName2 == null) ? 0 : this.additionalPersonName2.hashCode());
        result = prime * result + ((this.additionalPersonContact2 == null) ? 0 : this.additionalPersonContact2.hashCode());
        result = prime * result + ((this.additionalPersonName3 == null) ? 0 : this.additionalPersonName3.hashCode());
        result = prime * result + ((this.additionalPersonContact3 == null) ? 0 : this.additionalPersonContact3.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VendorEvaluation (");

        sb.append(vendorCode);
        sb.append(", ").append(serialNo);
        sb.append(", ").append(evalQuestion);
        sb.append(", ").append(evalYesNo);
        sb.append(", ").append(evalPersonName);
        sb.append(", ").append(evalDate);
        sb.append(", ").append(evalFreeText);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(additionalPersonStatus);
        sb.append(", ").append(additionalPersonName1);
        sb.append(", ").append(additionalPersonContact1);
        sb.append(", ").append(additionalPersonName2);
        sb.append(", ").append(additionalPersonContact2);
        sb.append(", ").append(additionalPersonName3);
        sb.append(", ").append(additionalPersonContact3);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}
