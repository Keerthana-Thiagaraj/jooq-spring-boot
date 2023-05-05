/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.MilkIncentiveMaster;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Record4;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MilkIncentiveMasterRecord extends UpdatableRecordImpl<MilkIncentiveMasterRecord> implements Record16<String, String, LocalDate, LocalDate, String, String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.COMP_CODE</code>.
     */
    public MilkIncentiveMasterRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.INC_TYPE</code>.
     */
    public MilkIncentiveMasterRecord setIncType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.INC_TYPE</code>.
     */
    public String getIncType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.INC_VALID_FROM</code>.
     */
    public MilkIncentiveMasterRecord setIncValidFrom(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.INC_VALID_FROM</code>.
     */
    public LocalDate getIncValidFrom() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.INC_VALID_TO</code>.
     */
    public MilkIncentiveMasterRecord setIncValidTo(LocalDate value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.INC_VALID_TO</code>.
     */
    public LocalDate getIncValidTo() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.INC_DESCRIPTION</code>.
     */
    public MilkIncentiveMasterRecord setIncDescription(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.INC_DESCRIPTION</code>.
     */
    public String getIncDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.QTY_STRUCTURE</code>.
     */
    public MilkIncentiveMasterRecord setQtyStructure(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.QTY_STRUCTURE</code>.
     */
    public String getQtyStructure() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.QUL_CONDITION</code>.
     */
    public MilkIncentiveMasterRecord setQulCondition(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.QUL_CONDITION</code>.
     */
    public String getQulCondition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.QUL_CRITERIA</code>.
     */
    public MilkIncentiveMasterRecord setQulCriteria(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.QUL_CRITERIA</code>.
     */
    public String getQulCriteria() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.COMPARISTION_TY</code>.
     */
    public MilkIncentiveMasterRecord setComparistionTy(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.COMPARISTION_TY</code>.
     */
    public String getComparistionTy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.SECURITY_DEPOSIT</code>.
     */
    public MilkIncentiveMasterRecord setSecurityDeposit(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.SECURITY_DEPOSIT</code>.
     */
    public String getSecurityDeposit() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.DEPOSIT_PERCENT</code>.
     */
    public MilkIncentiveMasterRecord setDepositPercent(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.DEPOSIT_PERCENT</code>.
     */
    public String getDepositPercent() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.STATUS</code>.
     */
    public MilkIncentiveMasterRecord setStatus(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.CREATED_BY</code>.
     */
    public MilkIncentiveMasterRecord setCreatedBy(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.CREATED_ON</code>.
     */
    public MilkIncentiveMasterRecord setCreatedOn(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.LAST_CHANGED_BY</code>.
     */
    public MilkIncentiveMasterRecord setLastChangedBy(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_incentive_master.LAST_CHANGED_ON</code>.
     */
    public MilkIncentiveMasterRecord setLastChangedOn(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_incentive_master.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, LocalDate, LocalDate> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, LocalDate, LocalDate, String, String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<String, String, LocalDate, LocalDate, String, String, String, String, String, String, String, String, Integer, LocalDateTime, Integer, LocalDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.COMP_CODE;
    }

    @Override
    public Field<String> field2() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.INC_TYPE;
    }

    @Override
    public Field<LocalDate> field3() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.INC_VALID_FROM;
    }

    @Override
    public Field<LocalDate> field4() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.INC_VALID_TO;
    }

    @Override
    public Field<String> field5() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.INC_DESCRIPTION;
    }

    @Override
    public Field<String> field6() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.QTY_STRUCTURE;
    }

    @Override
    public Field<String> field7() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.QUL_CONDITION;
    }

    @Override
    public Field<String> field8() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.QUL_CRITERIA;
    }

    @Override
    public Field<String> field9() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.COMPARISTION_TY;
    }

    @Override
    public Field<String> field10() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.SECURITY_DEPOSIT;
    }

    @Override
    public Field<String> field11() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.DEPOSIT_PERCENT;
    }

    @Override
    public Field<String> field12() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.STATUS;
    }

    @Override
    public Field<Integer> field13() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.CREATED_ON;
    }

    @Override
    public Field<Integer> field15() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.LAST_CHANGED_BY;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return MilkIncentiveMaster.MILK_INCENTIVE_MASTER.LAST_CHANGED_ON;
    }

    @Override
    public String component1() {
        return getCompCode();
    }

    @Override
    public String component2() {
        return getIncType();
    }

    @Override
    public LocalDate component3() {
        return getIncValidFrom();
    }

    @Override
    public LocalDate component4() {
        return getIncValidTo();
    }

    @Override
    public String component5() {
        return getIncDescription();
    }

    @Override
    public String component6() {
        return getQtyStructure();
    }

    @Override
    public String component7() {
        return getQulCondition();
    }

    @Override
    public String component8() {
        return getQulCriteria();
    }

    @Override
    public String component9() {
        return getComparistionTy();
    }

    @Override
    public String component10() {
        return getSecurityDeposit();
    }

    @Override
    public String component11() {
        return getDepositPercent();
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
    public String value1() {
        return getCompCode();
    }

    @Override
    public String value2() {
        return getIncType();
    }

    @Override
    public LocalDate value3() {
        return getIncValidFrom();
    }

    @Override
    public LocalDate value4() {
        return getIncValidTo();
    }

    @Override
    public String value5() {
        return getIncDescription();
    }

    @Override
    public String value6() {
        return getQtyStructure();
    }

    @Override
    public String value7() {
        return getQulCondition();
    }

    @Override
    public String value8() {
        return getQulCriteria();
    }

    @Override
    public String value9() {
        return getComparistionTy();
    }

    @Override
    public String value10() {
        return getSecurityDeposit();
    }

    @Override
    public String value11() {
        return getDepositPercent();
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
    public MilkIncentiveMasterRecord value1(String value) {
        setCompCode(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value2(String value) {
        setIncType(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value3(LocalDate value) {
        setIncValidFrom(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value4(LocalDate value) {
        setIncValidTo(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value5(String value) {
        setIncDescription(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value6(String value) {
        setQtyStructure(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value7(String value) {
        setQulCondition(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value8(String value) {
        setQulCriteria(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value9(String value) {
        setComparistionTy(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value10(String value) {
        setSecurityDeposit(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value11(String value) {
        setDepositPercent(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value12(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value13(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value14(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value15(Integer value) {
        setLastChangedBy(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord value16(LocalDateTime value) {
        setLastChangedOn(value);
        return this;
    }

    @Override
    public MilkIncentiveMasterRecord values(String value1, String value2, LocalDate value3, LocalDate value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Integer value13, LocalDateTime value14, Integer value15, LocalDateTime value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilkIncentiveMasterRecord
     */
    public MilkIncentiveMasterRecord() {
        super(MilkIncentiveMaster.MILK_INCENTIVE_MASTER);
    }

    /**
     * Create a detached, initialised MilkIncentiveMasterRecord
     */
    public MilkIncentiveMasterRecord(String compCode, String incType, LocalDate incValidFrom, LocalDate incValidTo, String incDescription, String qtyStructure, String qulCondition, String qulCriteria, String comparistionTy, String securityDeposit, String depositPercent, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(MilkIncentiveMaster.MILK_INCENTIVE_MASTER);

        setCompCode(compCode);
        setIncType(incType);
        setIncValidFrom(incValidFrom);
        setIncValidTo(incValidTo);
        setIncDescription(incDescription);
        setQtyStructure(qtyStructure);
        setQulCondition(qulCondition);
        setQulCriteria(qulCriteria);
        setComparistionTy(comparistionTy);
        setSecurityDeposit(securityDeposit);
        setDepositPercent(depositPercent);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}
