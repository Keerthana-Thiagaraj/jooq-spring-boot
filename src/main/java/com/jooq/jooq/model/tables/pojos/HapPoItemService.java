/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HapPoItemService implements Serializable {

    private static final long serialVersionUID = 1L;

    private String        compCode;
    private String        poNumber;
    private String        poItemNo;
    private String        poServiceNo;
    private BigDecimal    quantity;
    private BigDecimal    confirmQuantity;
    private String        deviatedQuantity;
    private String        deviatedQuantityReason;
    private String        baseUom;
    private BigDecimal    priceUnit;
    private BigDecimal    grossVal;
    private BigDecimal    netValue;
    private String        shortText;
    private String        longText;
    private String        make;
    private String        selectedMake;
    private String        deviatedMakeReason;
    private String        createdBy;
    private LocalDateTime createdOn;
    private String        lastChangedBy;
    private LocalDateTime lastChangedOn;

    public HapPoItemService() {}

    public HapPoItemService(HapPoItemService value) {
        this.compCode = value.compCode;
        this.poNumber = value.poNumber;
        this.poItemNo = value.poItemNo;
        this.poServiceNo = value.poServiceNo;
        this.quantity = value.quantity;
        this.confirmQuantity = value.confirmQuantity;
        this.deviatedQuantity = value.deviatedQuantity;
        this.deviatedQuantityReason = value.deviatedQuantityReason;
        this.baseUom = value.baseUom;
        this.priceUnit = value.priceUnit;
        this.grossVal = value.grossVal;
        this.netValue = value.netValue;
        this.shortText = value.shortText;
        this.longText = value.longText;
        this.make = value.make;
        this.selectedMake = value.selectedMake;
        this.deviatedMakeReason = value.deviatedMakeReason;
        this.createdBy = value.createdBy;
        this.createdOn = value.createdOn;
        this.lastChangedBy = value.lastChangedBy;
        this.lastChangedOn = value.lastChangedOn;
    }

    public HapPoItemService(
        String        compCode,
        String        poNumber,
        String        poItemNo,
        String        poServiceNo,
        BigDecimal    quantity,
        BigDecimal    confirmQuantity,
        String        deviatedQuantity,
        String        deviatedQuantityReason,
        String        baseUom,
        BigDecimal    priceUnit,
        BigDecimal    grossVal,
        BigDecimal    netValue,
        String        shortText,
        String        longText,
        String        make,
        String        selectedMake,
        String        deviatedMakeReason,
        String        createdBy,
        LocalDateTime createdOn,
        String        lastChangedBy,
        LocalDateTime lastChangedOn
    ) {
        this.compCode = compCode;
        this.poNumber = poNumber;
        this.poItemNo = poItemNo;
        this.poServiceNo = poServiceNo;
        this.quantity = quantity;
        this.confirmQuantity = confirmQuantity;
        this.deviatedQuantity = deviatedQuantity;
        this.deviatedQuantityReason = deviatedQuantityReason;
        this.baseUom = baseUom;
        this.priceUnit = priceUnit;
        this.grossVal = grossVal;
        this.netValue = netValue;
        this.shortText = shortText;
        this.longText = longText;
        this.make = make;
        this.selectedMake = selectedMake;
        this.deviatedMakeReason = deviatedMakeReason;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedOn = lastChangedOn;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.COMP_CODE</code>.
     */
    public String getCompCode() {
        return this.compCode;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.COMP_CODE</code>.
     */
    public HapPoItemService setCompCode(String compCode) {
        this.compCode = compCode;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.PO_NUMBER</code>.
     */
    public String getPoNumber() {
        return this.poNumber;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.PO_NUMBER</code>.
     */
    public HapPoItemService setPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.PO_ITEM_NO</code>.
     */
    public String getPoItemNo() {
        return this.poItemNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.PO_ITEM_NO</code>.
     */
    public HapPoItemService setPoItemNo(String poItemNo) {
        this.poItemNo = poItemNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.PO_SERVICE_NO</code>.
     */
    public String getPoServiceNo() {
        return this.poServiceNo;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.PO_SERVICE_NO</code>.
     */
    public HapPoItemService setPoServiceNo(String poServiceNo) {
        this.poServiceNo = poServiceNo;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.QUANTITY</code>.
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.QUANTITY</code>.
     */
    public HapPoItemService setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.CONFIRM_QUANTITY</code>.
     */
    public BigDecimal getConfirmQuantity() {
        return this.confirmQuantity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.CONFIRM_QUANTITY</code>.
     */
    public HapPoItemService setConfirmQuantity(BigDecimal confirmQuantity) {
        this.confirmQuantity = confirmQuantity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.DEVIATED_QUANTITY</code>.
     */
    public String getDeviatedQuantity() {
        return this.deviatedQuantity;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.DEVIATED_QUANTITY</code>.
     */
    public HapPoItemService setDeviatedQuantity(String deviatedQuantity) {
        this.deviatedQuantity = deviatedQuantity;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.DEVIATED_QUANTITY_REASON</code>.
     */
    public String getDeviatedQuantityReason() {
        return this.deviatedQuantityReason;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.DEVIATED_QUANTITY_REASON</code>.
     */
    public HapPoItemService setDeviatedQuantityReason(String deviatedQuantityReason) {
        this.deviatedQuantityReason = deviatedQuantityReason;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.BASE_UOM</code>.
     */
    public String getBaseUom() {
        return this.baseUom;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.BASE_UOM</code>.
     */
    public HapPoItemService setBaseUom(String baseUom) {
        this.baseUom = baseUom;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.PRICE_UNIT</code>.
     */
    public BigDecimal getPriceUnit() {
        return this.priceUnit;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.PRICE_UNIT</code>.
     */
    public HapPoItemService setPriceUnit(BigDecimal priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.GROSS_VAL</code>.
     */
    public BigDecimal getGrossVal() {
        return this.grossVal;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.GROSS_VAL</code>.
     */
    public HapPoItemService setGrossVal(BigDecimal grossVal) {
        this.grossVal = grossVal;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.NET_VALUE</code>.
     */
    public BigDecimal getNetValue() {
        return this.netValue;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.NET_VALUE</code>.
     */
    public HapPoItemService setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.SHORT_TEXT</code>.
     */
    public String getShortText() {
        return this.shortText;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.SHORT_TEXT</code>.
     */
    public HapPoItemService setShortText(String shortText) {
        this.shortText = shortText;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.LONG_TEXT</code>.
     */
    public String getLongText() {
        return this.longText;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.LONG_TEXT</code>.
     */
    public HapPoItemService setLongText(String longText) {
        this.longText = longText;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.MAKE</code>.
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.MAKE</code>.
     */
    public HapPoItemService setMake(String make) {
        this.make = make;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.SELECTED_MAKE</code>.
     */
    public String getSelectedMake() {
        return this.selectedMake;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.SELECTED_MAKE</code>.
     */
    public HapPoItemService setSelectedMake(String selectedMake) {
        this.selectedMake = selectedMake;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.DEVIATED_MAKE_REASON</code>.
     */
    public String getDeviatedMakeReason() {
        return this.deviatedMakeReason;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.DEVIATED_MAKE_REASON</code>.
     */
    public HapPoItemService setDeviatedMakeReason(String deviatedMakeReason) {
        this.deviatedMakeReason = deviatedMakeReason;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.CREATED_BY</code>.
     */
    public HapPoItemService setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.CREATED_ON</code>.
     */
    public HapPoItemService setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.LAST_CHANGED_BY</code>.
     */
    public String getLastChangedBy() {
        return this.lastChangedBy;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.LAST_CHANGED_BY</code>.
     */
    public HapPoItemService setLastChangedBy(String lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_service.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return this.lastChangedOn;
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_service.LAST_CHANGED_ON</code>.
     */
    public HapPoItemService setLastChangedOn(LocalDateTime lastChangedOn) {
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
        final HapPoItemService other = (HapPoItemService) obj;
        if (compCode == null) {
            if (other.compCode != null)
                return false;
        }
        else if (!compCode.equals(other.compCode))
            return false;
        if (poNumber == null) {
            if (other.poNumber != null)
                return false;
        }
        else if (!poNumber.equals(other.poNumber))
            return false;
        if (poItemNo == null) {
            if (other.poItemNo != null)
                return false;
        }
        else if (!poItemNo.equals(other.poItemNo))
            return false;
        if (poServiceNo == null) {
            if (other.poServiceNo != null)
                return false;
        }
        else if (!poServiceNo.equals(other.poServiceNo))
            return false;
        if (quantity == null) {
            if (other.quantity != null)
                return false;
        }
        else if (!quantity.equals(other.quantity))
            return false;
        if (confirmQuantity == null) {
            if (other.confirmQuantity != null)
                return false;
        }
        else if (!confirmQuantity.equals(other.confirmQuantity))
            return false;
        if (deviatedQuantity == null) {
            if (other.deviatedQuantity != null)
                return false;
        }
        else if (!deviatedQuantity.equals(other.deviatedQuantity))
            return false;
        if (deviatedQuantityReason == null) {
            if (other.deviatedQuantityReason != null)
                return false;
        }
        else if (!deviatedQuantityReason.equals(other.deviatedQuantityReason))
            return false;
        if (baseUom == null) {
            if (other.baseUom != null)
                return false;
        }
        else if (!baseUom.equals(other.baseUom))
            return false;
        if (priceUnit == null) {
            if (other.priceUnit != null)
                return false;
        }
        else if (!priceUnit.equals(other.priceUnit))
            return false;
        if (grossVal == null) {
            if (other.grossVal != null)
                return false;
        }
        else if (!grossVal.equals(other.grossVal))
            return false;
        if (netValue == null) {
            if (other.netValue != null)
                return false;
        }
        else if (!netValue.equals(other.netValue))
            return false;
        if (shortText == null) {
            if (other.shortText != null)
                return false;
        }
        else if (!shortText.equals(other.shortText))
            return false;
        if (longText == null) {
            if (other.longText != null)
                return false;
        }
        else if (!longText.equals(other.longText))
            return false;
        if (make == null) {
            if (other.make != null)
                return false;
        }
        else if (!make.equals(other.make))
            return false;
        if (selectedMake == null) {
            if (other.selectedMake != null)
                return false;
        }
        else if (!selectedMake.equals(other.selectedMake))
            return false;
        if (deviatedMakeReason == null) {
            if (other.deviatedMakeReason != null)
                return false;
        }
        else if (!deviatedMakeReason.equals(other.deviatedMakeReason))
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
        result = prime * result + ((this.compCode == null) ? 0 : this.compCode.hashCode());
        result = prime * result + ((this.poNumber == null) ? 0 : this.poNumber.hashCode());
        result = prime * result + ((this.poItemNo == null) ? 0 : this.poItemNo.hashCode());
        result = prime * result + ((this.poServiceNo == null) ? 0 : this.poServiceNo.hashCode());
        result = prime * result + ((this.quantity == null) ? 0 : this.quantity.hashCode());
        result = prime * result + ((this.confirmQuantity == null) ? 0 : this.confirmQuantity.hashCode());
        result = prime * result + ((this.deviatedQuantity == null) ? 0 : this.deviatedQuantity.hashCode());
        result = prime * result + ((this.deviatedQuantityReason == null) ? 0 : this.deviatedQuantityReason.hashCode());
        result = prime * result + ((this.baseUom == null) ? 0 : this.baseUom.hashCode());
        result = prime * result + ((this.priceUnit == null) ? 0 : this.priceUnit.hashCode());
        result = prime * result + ((this.grossVal == null) ? 0 : this.grossVal.hashCode());
        result = prime * result + ((this.netValue == null) ? 0 : this.netValue.hashCode());
        result = prime * result + ((this.shortText == null) ? 0 : this.shortText.hashCode());
        result = prime * result + ((this.longText == null) ? 0 : this.longText.hashCode());
        result = prime * result + ((this.make == null) ? 0 : this.make.hashCode());
        result = prime * result + ((this.selectedMake == null) ? 0 : this.selectedMake.hashCode());
        result = prime * result + ((this.deviatedMakeReason == null) ? 0 : this.deviatedMakeReason.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.lastChangedBy == null) ? 0 : this.lastChangedBy.hashCode());
        result = prime * result + ((this.lastChangedOn == null) ? 0 : this.lastChangedOn.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HapPoItemService (");

        sb.append(compCode);
        sb.append(", ").append(poNumber);
        sb.append(", ").append(poItemNo);
        sb.append(", ").append(poServiceNo);
        sb.append(", ").append(quantity);
        sb.append(", ").append(confirmQuantity);
        sb.append(", ").append(deviatedQuantity);
        sb.append(", ").append(deviatedQuantityReason);
        sb.append(", ").append(baseUom);
        sb.append(", ").append(priceUnit);
        sb.append(", ").append(grossVal);
        sb.append(", ").append(netValue);
        sb.append(", ").append(shortText);
        sb.append(", ").append(longText);
        sb.append(", ").append(make);
        sb.append(", ").append(selectedMake);
        sb.append(", ").append(deviatedMakeReason);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(lastChangedBy);
        sb.append(", ").append(lastChangedOn);

        sb.append(")");
        return sb.toString();
    }
}