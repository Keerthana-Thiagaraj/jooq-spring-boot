/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.MilkAvgArch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MilkAvgArchRecord extends UpdatableRecordImpl<MilkAvgArchRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.PLANT</code>.
     */
    public MilkAvgArchRecord setPlant(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.PLANT</code>.
     */
    public String getPlant() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.NAME1</code>.
     */
    public MilkAvgArchRecord setName1(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.NAME1</code>.
     */
    public String getName1() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SOCIETY</code>.
     */
    public MilkAvgArchRecord setSociety(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SOCIETY</code>.
     */
    public String getSociety() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SNAME</code>.
     */
    public MilkAvgArchRecord setSname(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SNAME</code>.
     */
    public String getSname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.CRDAT</code>.
     */
    public MilkAvgArchRecord setCrdat(LocalDate value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.CRDAT</code>.
     */
    public LocalDate getCrdat() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SHIFT</code>.
     */
    public MilkAvgArchRecord setShift(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SHIFT</code>.
     */
    public String getShift() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.QUANTITY</code>.
     */
    public MilkAvgArchRecord setQuantity(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.QUANTITY</code>.
     */
    public String getQuantity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.QUANTITY_KG</code>.
     */
    public MilkAvgArchRecord setQuantityKg(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.QUANTITY_KG</code>.
     */
    public String getQuantityKg() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.FAT</code>.
     */
    public MilkAvgArchRecord setFat(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.FAT</code>.
     */
    public String getFat() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.KG_FAT</code>.
     */
    public MilkAvgArchRecord setKgFat(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.KG_FAT</code>.
     */
    public String getKgFat() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.FAT_PER</code>.
     */
    public MilkAvgArchRecord setFatPer(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.FAT_PER</code>.
     */
    public String getFatPer() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.FAT_LOW</code>.
     */
    public MilkAvgArchRecord setFatLow(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.FAT_LOW</code>.
     */
    public String getFatLow() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.FAT_HIGH</code>.
     */
    public MilkAvgArchRecord setFatHigh(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.FAT_HIGH</code>.
     */
    public String getFatHigh() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.FAT_RN</code>.
     */
    public MilkAvgArchRecord setFatRn(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.FAT_RN</code>.
     */
    public String getFatRn() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SNF</code>.
     */
    public MilkAvgArchRecord setSnf(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SNF</code>.
     */
    public String getSnf() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.KG_SNF</code>.
     */
    public MilkAvgArchRecord setKgSnf(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.KG_SNF</code>.
     */
    public String getKgSnf() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SNF_PER</code>.
     */
    public MilkAvgArchRecord setSnfPer(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SNF_PER</code>.
     */
    public String getSnfPer() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SNF_LOW</code>.
     */
    public MilkAvgArchRecord setSnfLow(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SNF_LOW</code>.
     */
    public String getSnfLow() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SNF_HIGH</code>.
     */
    public MilkAvgArchRecord setSnfHigh(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SNF_HIGH</code>.
     */
    public String getSnfHigh() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.SNF_RN</code>.
     */
    public MilkAvgArchRecord setSnfRn(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.SNF_RN</code>.
     */
    public String getSnfRn() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.DMBTR</code>.
     */
    public MilkAvgArchRecord setDmbtr(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.DMBTR</code>.
     */
    public BigDecimal getDmbtr() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.INC</code>.
     */
    public MilkAvgArchRecord setInc(BigDecimal value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.INC</code>.
     */
    public BigDecimal getInc() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.AMOUNT</code>.
     */
    public MilkAvgArchRecord setAmount(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.AMOUNT</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.STATUS</code>.
     */
    public MilkAvgArchRecord setStatus(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.CREATED_BY</code>.
     */
    public MilkAvgArchRecord setCreatedBy(Integer value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.CREATED_ON</code>.
     */
    public MilkAvgArchRecord setCreatedOn(LocalDateTime value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.LAST_CHANGED_BY</code>.
     */
    public MilkAvgArchRecord setLastChangedBy(Integer value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.milk_avg_arch.LAST_CHANGED_ON</code>.
     */
    public MilkAvgArchRecord setLastChangedOn(LocalDateTime value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.milk_avg_arch.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(27);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, LocalDate, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MilkAvgArchRecord
     */
    public MilkAvgArchRecord() {
        super(MilkAvgArch.MILK_AVG_ARCH);
    }

    /**
     * Create a detached, initialised MilkAvgArchRecord
     */
    public MilkAvgArchRecord(String plant, String name1, String society, String sname, LocalDate crdat, String shift, String quantity, String quantityKg, String fat, String kgFat, String fatPer, String fatLow, String fatHigh, String fatRn, String snf, String kgSnf, String snfPer, String snfLow, String snfHigh, String snfRn, BigDecimal dmbtr, BigDecimal inc, BigDecimal amount, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn) {
        super(MilkAvgArch.MILK_AVG_ARCH);

        setPlant(plant);
        setName1(name1);
        setSociety(society);
        setSname(sname);
        setCrdat(crdat);
        setShift(shift);
        setQuantity(quantity);
        setQuantityKg(quantityKg);
        setFat(fat);
        setKgFat(kgFat);
        setFatPer(fatPer);
        setFatLow(fatLow);
        setFatHigh(fatHigh);
        setFatRn(fatRn);
        setSnf(snf);
        setKgSnf(kgSnf);
        setSnfPer(snfPer);
        setSnfLow(snfLow);
        setSnfHigh(snfHigh);
        setSnfRn(snfRn);
        setDmbtr(dmbtr);
        setInc(inc);
        setAmount(amount);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
    }
}