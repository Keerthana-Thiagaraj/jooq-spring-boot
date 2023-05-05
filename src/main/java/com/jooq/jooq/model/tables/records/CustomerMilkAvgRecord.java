/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.CustomerMilkAvg;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerMilkAvgRecord extends UpdatableRecordImpl<CustomerMilkAvgRecord> implements Record18<String, String, String, String, String, String, String, String, String, String, BigDecimal, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.COMP_CODE</code>.
     */
    public CustomerMilkAvgRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.CUSTOMER_CODE</code>.
     */
    public CustomerMilkAvgRecord setCustomerCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.CUSTOMER_CODE</code>.
     */
    public String getCustomerCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.SPYEAR</code>.
     */
    public CustomerMilkAvgRecord setSpyear(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.SPYEAR</code>.
     */
    public String getSpyear() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.SPMON</code>.
     */
    public CustomerMilkAvgRecord setSpmon(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.SPMON</code>.
     */
    public String getSpmon() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.PUR_GRP</code>.
     */
    public CustomerMilkAvgRecord setPurGrp(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.PUR_GRP</code>.
     */
    public String getPurGrp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP1</code>.
     */
    public CustomerMilkAvgRecord setMatGrp1(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP1</code>.
     */
    public String getMatGrp1() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP2</code>.
     */
    public CustomerMilkAvgRecord setMatGrp2(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP2</code>.
     */
    public String getMatGrp2() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP3</code>.
     */
    public CustomerMilkAvgRecord setMatGrp3(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP3</code>.
     */
    public String getMatGrp3() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP4</code>.
     */
    public CustomerMilkAvgRecord setMatGrp4(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MAT_GRP4</code>.
     */
    public String getMatGrp4() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.MATNR</code>.
     */
    public CustomerMilkAvgRecord setMatnr(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.MATNR</code>.
     */
    public String getMatnr() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.QUANTITY</code>.
     */
    public CustomerMilkAvgRecord setQuantity(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.QUANTITY</code>.
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.STATUS</code>.
     */
    public CustomerMilkAvgRecord setStatus(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_BY</code>.
     */
    public CustomerMilkAvgRecord setCreatedBy(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_ON</code>.
     */
    public CustomerMilkAvgRecord setCreatedOn(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_BY</code>.
     */
    public CustomerMilkAvgRecord setLastChangedBy(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_ON</code>.
     */
    public CustomerMilkAvgRecord setLastChangedOn(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.VKBUR</code>.
     */
    public CustomerMilkAvgRecord setVkbur(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.VKBUR</code>.
     */
    public String getVkbur() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.customer_milk_avg.WERKS</code>.
     */
    public CustomerMilkAvgRecord setWerks(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.customer_milk_avg.WERKS</code>.
     */
    public String getWerks() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record12<String, String, String, String, String, String, String, String, String, String, String, String> key() {
        return (Record12) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, BigDecimal, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, BigDecimal, String, Integer, LocalDateTime, Integer, LocalDateTime, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.CUSTOMER_CODE;
    }

    @Override
    public Field<String> field3() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.SPYEAR;
    }

    @Override
    public Field<String> field4() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.SPMON;
    }

    @Override
    public Field<String> field5() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.PUR_GRP;
    }

    @Override
    public Field<String> field6() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.MAT_GRP1;
    }

    @Override
    public Field<String> field7() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.MAT_GRP2;
    }

    @Override
    public Field<String> field8() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.MAT_GRP3;
    }

    @Override
    public Field<String> field9() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.MAT_GRP4;
    }

    @Override
    public Field<String> field10() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.MATNR;
    }

    @Override
    public Field<BigDecimal> field11() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.QUANTITY;
    }

    @Override
    public Field<String> field12() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.STATUS;
    }

    @Override
    public Field<Integer> field13() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.CREATED_ON;
    }

    @Override
    public Field<Integer> field15() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.LAST_CHANGED_ON;
    }

    @Override
    public Field<String> field17() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.VKBUR;
    }

    @Override
    public Field<String> field18() {
        return CustomerMilkAvg.CUSTOMER_MILK_AVG.WERKS;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public String component2() {
        return getCustomerCode();
    }

    @Override
    public String component3() {
        return getSpyear();
    }

    @Override
    public String component4() {
        return getSpmon();
    }

    @Override
    public String component5() {
        return getPurGrp();
    }

    @Override
    public String component6() {
        return getMatGrp1();
    }

    @Override
    public String component7() {
        return getMatGrp2();
    }

    @Override
    public String component8() {
        return getMatGrp3();
    }

    @Override
    public String component9() {
        return getMatGrp4();
    }

    @Override
    public String component10() {
        return getMatnr();
    }

    @Override
    public BigDecimal component11() {
        return getQuantity();
    }

    @Override
    public String component12() {
        return getStatus();
    }

    @Override
    public Integer component13() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatedOn();
    }

    @Override
    public Integer component15() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime component16() {
        return getLastChangedOn();
    }

    @Override
    public String component17() {
        return getVkbur();
    }

    @Override
    public String component18() {
        return getWerks();
    }

    @Override
    public String value1() {
        return getCompCode();
    }

    @Override
    public String value2() {
        return getCustomerCode();
    }

    @Override
    public String value3() {
        return getSpyear();
    }

    @Override
    public String value4() {
        return getSpmon();
    }

    @Override
    public String value5() {
        return getPurGrp();
    }

    @Override
    public String value6() {
        return getMatGrp1();
    }

    @Override
    public String value7() {
        return getMatGrp2();
    }

    @Override
    public String value8() {
        return getMatGrp3();
    }

    @Override
    public String value9() {
        return getMatGrp4();
    }

    @Override
    public String value10() {
        return getMatnr();
    }

    @Override
    public BigDecimal value11() {
        return getQuantity();
    }

    @Override
    public String value12() {
        return getStatus();
    }

    @Override
    public Integer value13() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatedOn();
    }

    @Override
    public Integer value15() {
        return getLastChangedBy();
    }

    @Override
    public LocalDateTime value16() {
        return getLastChangedOn();
    }

    @Override
    public String value17() {
        return getVkbur();
    }

    @Override
    public String value18() {
        return getWerks();
    }

    @Override
    public CustomerMilkAvgRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value2(String value) {
        setCustomerCode(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value3(String value) {
        setSpyear(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value4(String value) {
        setSpmon(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value5(String value) {
        setPurGrp(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value6(String value) {
        setMatGrp1(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value7(String value) {
        setMatGrp2(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value8(String value) {
        setMatGrp3(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value9(String value) {
        setMatGrp4(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value10(String value) {
        setMatnr(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value11(BigDecimal value) {
        setQuantity(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value12(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value13(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value14(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value15(Integer value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value16(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value17(String value) {
        setVkbur(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord value18(String value) {
        setWerks(value);
        return this;
    }

    @Override
    public CustomerMilkAvgRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, BigDecimal value11, String value12, Integer value13, LocalDateTime value14, Integer value15, LocalDateTime value16, String value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerMilkAvgRecord
     */
    public CustomerMilkAvgRecord() {
        super(CustomerMilkAvg.CUSTOMER_MILK_AVG);
    }

    /**
     * Create a detached, initialised CustomerMilkAvgRecord
     */
    public CustomerMilkAvgRecord(String compCode, String customerCode, String spyear, String spmon, String purGrp, String matGrp1, String matGrp2, String matGrp3, String matGrp4, String matnr, BigDecimal quantity, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn, String vkbur, String werks) {
        super(CustomerMilkAvg.CUSTOMER_MILK_AVG);

        setCompCode(compCode);
        setCustomerCode(customerCode);
        setSpyear(spyear);
        setSpmon(spmon);
        setPurGrp(purGrp);
        setMatGrp1(matGrp1);
        setMatGrp2(matGrp2);
        setMatGrp3(matGrp3);
        setMatGrp4(matGrp4);
        setMatnr(matnr);
        setQuantity(quantity);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setVkbur(vkbur);
        setWerks(werks);
    }
}