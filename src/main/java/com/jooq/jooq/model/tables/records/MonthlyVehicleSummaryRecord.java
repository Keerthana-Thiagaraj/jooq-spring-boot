/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.MonthlyVehicleSummary;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MonthlyVehicleSummaryRecord extends UpdatableRecordImpl<MonthlyVehicleSummaryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.COMP_CODE</code>.
     */
    public MonthlyVehicleSummaryRecord setCompCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.COMP_CODE</code>.
     */
    public String getCompCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SHIPMENT_NO</code>.
     */
    public MonthlyVehicleSummaryRecord setShipmentNo(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SHIPMENT_NO</code>.
     */
    public String getShipmentNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.LBLNI</code>.
     */
    public MonthlyVehicleSummaryRecord setLblni(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.LBLNI</code>.
     */
    public String getLblni() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.PAYMENT_VENDOR</code>.
     */
    public MonthlyVehicleSummaryRecord setPaymentVendor(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.PAYMENT_VENDOR</code>.
     */
    public String getPaymentVendor() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SHIPMENT_TYPE</code>.
     */
    public MonthlyVehicleSummaryRecord setShipmentType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SHIPMENT_TYPE</code>.
     */
    public String getShipmentType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SHIP_COMPLETION_DATE</code>.
     */
    public MonthlyVehicleSummaryRecord setShipCompletionDate(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SHIP_COMPLETION_DATE</code>.
     */
    public LocalDate getShipCompletionDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.PLANT</code>.
     */
    public MonthlyVehicleSummaryRecord setPlant(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.PLANT</code>.
     */
    public String getPlant() {
        return (String) get(6);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.PLANT_DESCRIPTON</code>.
     */
    public MonthlyVehicleSummaryRecord setPlantDescripton(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.PLANT_DESCRIPTON</code>.
     */
    public String getPlantDescripton() {
        return (String) get(7);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SPL_PROCESSING_INDICATOR</code>.
     */
    public MonthlyVehicleSummaryRecord setSplProcessingIndicator(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SPL_PROCESSING_INDICATOR</code>.
     */
    public String getSplProcessingIndicator() {
        return (String) get(8);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DESCRIPTON</code>.
     */
    public MonthlyVehicleSummaryRecord setDescripton(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DESCRIPTON</code>.
     */
    public String getDescripton() {
        return (String) get(9);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SERVICE_AGENT</code>.
     */
    public MonthlyVehicleSummaryRecord setServiceAgent(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SERVICE_AGENT</code>.
     */
    public String getServiceAgent() {
        return (String) get(10);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.NAME1</code>.
     */
    public MonthlyVehicleSummaryRecord setName1(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.NAME1</code>.
     */
    public String getName1() {
        return (String) get(11);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ROUTE</code>.
     */
    public MonthlyVehicleSummaryRecord setRoute(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ROUTE</code>.
     */
    public String getRoute() {
        return (String) get(12);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ROUTE_DESCRIPTON</code>.
     */
    public MonthlyVehicleSummaryRecord setRouteDescripton(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ROUTE_DESCRIPTON</code>.
     */
    public String getRouteDescripton() {
        return (String) get(13);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.TRUCK_NUMBER</code>.
     */
    public MonthlyVehicleSummaryRecord setTruckNumber(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.TRUCK_NUMBER</code>.
     */
    public String getTruckNumber() {
        return (String) get(14);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.STARTING_KM</code>.
     */
    public MonthlyVehicleSummaryRecord setStartingKm(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.STARTING_KM</code>.
     */
    public String getStartingKm() {
        return (String) get(15);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ENDING_KM</code>.
     */
    public MonthlyVehicleSummaryRecord setEndingKm(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ENDING_KM</code>.
     */
    public String getEndingKm() {
        return (String) get(16);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ROUTE_MASTER_DISTANCE</code>.
     */
    public MonthlyVehicleSummaryRecord setRouteMasterDistance(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ROUTE_MASTER_DISTANCE</code>.
     */
    public String getRouteMasterDistance() {
        return (String) get(17);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DISTANCE_TRAVELLED</code>.
     */
    public MonthlyVehicleSummaryRecord setDistanceTravelled(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DISTANCE_TRAVELLED</code>.
     */
    public String getDistanceTravelled() {
        return (String) get(18);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.PASSING_KM</code>.
     */
    public MonthlyVehicleSummaryRecord setPassingKm(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.PASSING_KM</code>.
     */
    public String getPassingKm() {
        return (String) get(19);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.TOLL_FEES</code>.
     */
    public MonthlyVehicleSummaryRecord setTollFees(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.TOLL_FEES</code>.
     */
    public String getTollFees() {
        return (String) get(20);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.STAGE_FIXED_AMT</code>.
     */
    public MonthlyVehicleSummaryRecord setStageFixedAmt(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.STAGE_FIXED_AMT</code>.
     */
    public String getStageFixedAmt() {
        return (String) get(21);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.FREIGHT_KM</code>.
     */
    public MonthlyVehicleSummaryRecord setFreightKm(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.FREIGHT_KM</code>.
     */
    public String getFreightKm() {
        return (String) get(22);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.FREIGHT_FIXED</code>.
     */
    public MonthlyVehicleSummaryRecord setFreightFixed(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.FREIGHT_FIXED</code>.
     */
    public String getFreightFixed() {
        return (String) get(23);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.FREIGHT_RATE</code>.
     */
    public MonthlyVehicleSummaryRecord setFreightRate(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.FREIGHT_RATE</code>.
     */
    public String getFreightRate() {
        return (String) get(24);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SUPPLM1</code>.
     */
    public MonthlyVehicleSummaryRecord setSupplm1(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SUPPLM1</code>.
     */
    public String getSupplm1() {
        return (String) get(25);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SUPPLM2</code>.
     */
    public MonthlyVehicleSummaryRecord setSupplm2(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SUPPLM2</code>.
     */
    public String getSupplm2() {
        return (String) get(26);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SEC_ROUTE_FREIGHT_AMT</code>.
     */
    public MonthlyVehicleSummaryRecord setSecRouteFreightAmt(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SEC_ROUTE_FREIGHT_AMT</code>.
     */
    public String getSecRouteFreightAmt() {
        return (String) get(27);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SEC_ROUTE_FREIGHT_KM</code>.
     */
    public MonthlyVehicleSummaryRecord setSecRouteFreightKm(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SEC_ROUTE_FREIGHT_KM</code>.
     */
    public String getSecRouteFreightKm() {
        return (String) get(28);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ADDITIONAL_AMOUNT</code>.
     */
    public MonthlyVehicleSummaryRecord setAdditionalAmount(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ADDITIONAL_AMOUNT</code>.
     */
    public String getAdditionalAmount() {
        return (String) get(29);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEDUCTION_AMOUNT</code>.
     */
    public MonthlyVehicleSummaryRecord setDeductionAmount(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEDUCTION_AMOUNT</code>.
     */
    public String getDeductionAmount() {
        return (String) get(30);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.STATUS</code>.
     */
    public MonthlyVehicleSummaryRecord setStatus(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(31);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.CREATED_BY</code>.
     */
    public MonthlyVehicleSummaryRecord setCreatedBy(Integer value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.CREATED_BY</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.CREATED_ON</code>.
     */
    public MonthlyVehicleSummaryRecord setCreatedOn(LocalDateTime value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(33);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.LAST_CHANGED_BY</code>.
     */
    public MonthlyVehicleSummaryRecord setLastChangedBy(Integer value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.LAST_CHANGED_BY</code>.
     */
    public Integer getLastChangedBy() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.LAST_CHANGED_ON</code>.
     */
    public MonthlyVehicleSummaryRecord setLastChangedOn(LocalDateTime value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.LAST_CHANGED_ON</code>.
     */
    public LocalDateTime getLastChangedOn() {
        return (LocalDateTime) get(35);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DALBG</code>.
     */
    public MonthlyVehicleSummaryRecord setDalbg(LocalDate value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DALBG</code>.
     */
    public LocalDate getDalbg() {
        return (LocalDate) get(36);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZFKMRT</code>.
     */
    public MonthlyVehicleSummaryRecord setZfkmrt(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZFKMRT</code>.
     */
    public String getZfkmrt() {
        return (String) get(37);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.KZWI4</code>.
     */
    public MonthlyVehicleSummaryRecord setKzwi4(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.KZWI4</code>.
     */
    public String getKzwi4() {
        return (String) get(38);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZDI1</code>.
     */
    public MonthlyVehicleSummaryRecord setZdi1(BigDecimal value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZDI1</code>.
     */
    public BigDecimal getZdi1() {
        return (BigDecimal) get(39);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZDI2</code>.
     */
    public MonthlyVehicleSummaryRecord setZdi2(BigDecimal value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZDI2</code>.
     */
    public BigDecimal getZdi2() {
        return (BigDecimal) get(40);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZVTK</code>.
     */
    public MonthlyVehicleSummaryRecord setZvtk(BigDecimal value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZVTK</code>.
     */
    public BigDecimal getZvtk() {
        return (BigDecimal) get(41);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZKNR</code>.
     */
    public MonthlyVehicleSummaryRecord setZknr(BigDecimal value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZKNR</code>.
     */
    public BigDecimal getZknr() {
        return (BigDecimal) get(42);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZANR</code>.
     */
    public MonthlyVehicleSummaryRecord setZanr(BigDecimal value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZANR</code>.
     */
    public BigDecimal getZanr() {
        return (BigDecimal) get(43);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZVAD</code>.
     */
    public MonthlyVehicleSummaryRecord setZvad(BigDecimal value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZVAD</code>.
     */
    public BigDecimal getZvad() {
        return (BigDecimal) get(44);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.COST2</code>.
     */
    public MonthlyVehicleSummaryRecord setCost2(BigDecimal value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.COST2</code>.
     */
    public BigDecimal getCost2() {
        return (BigDecimal) get(45);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZPFC</code>.
     */
    public MonthlyVehicleSummaryRecord setZpfc(BigDecimal value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZPFC</code>.
     */
    public BigDecimal getZpfc() {
        return (BigDecimal) get(46);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZSFC</code>.
     */
    public MonthlyVehicleSummaryRecord setZsfc(BigDecimal value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.ZSFC</code>.
     */
    public BigDecimal getZsfc() {
        return (BigDecimal) get(47);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.SERVICE_AGENT_STAGE</code>.
     */
    public MonthlyVehicleSummaryRecord setServiceAgentStage(String value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.SERVICE_AGENT_STAGE</code>.
     */
    public String getServiceAgentStage() {
        return (String) get(48);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEPT_POINT</code>.
     */
    public MonthlyVehicleSummaryRecord setDeptPoint(String value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEPT_POINT</code>.
     */
    public String getDeptPoint() {
        return (String) get(49);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEPT_DESC</code>.
     */
    public MonthlyVehicleSummaryRecord setDeptDesc(String value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEPT_DESC</code>.
     */
    public String getDeptDesc() {
        return (String) get(50);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DESTINATION</code>.
     */
    public MonthlyVehicleSummaryRecord setDestination(String value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DESTINATION</code>.
     */
    public String getDestination() {
        return (String) get(51);
    }

    /**
     * Setter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEST_DESC</code>.
     */
    public MonthlyVehicleSummaryRecord setDestDesc(String value) {
        set(52, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.monthly_vehicle_summary.DEST_DESC</code>.
     */
    public String getDestDesc() {
        return (String) get(52);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MonthlyVehicleSummaryRecord
     */
    public MonthlyVehicleSummaryRecord() {
        super(MonthlyVehicleSummary.MONTHLY_VEHICLE_SUMMARY);
    }

    /**
     * Create a detached, initialised MonthlyVehicleSummaryRecord
     */
    public MonthlyVehicleSummaryRecord(String compCode, String shipmentNo, String lblni, String paymentVendor, String shipmentType, LocalDate shipCompletionDate, String plant, String plantDescripton, String splProcessingIndicator, String descripton, String serviceAgent, String name1, String route, String routeDescripton, String truckNumber, String startingKm, String endingKm, String routeMasterDistance, String distanceTravelled, String passingKm, String tollFees, String stageFixedAmt, String freightKm, String freightFixed, String freightRate, String supplm1, String supplm2, String secRouteFreightAmt, String secRouteFreightKm, String additionalAmount, String deductionAmount, String status, Integer createdBy, LocalDateTime createdOn, Integer lastChangedBy, LocalDateTime lastChangedOn, LocalDate dalbg, String zfkmrt, String kzwi4, BigDecimal zdi1, BigDecimal zdi2, BigDecimal zvtk, BigDecimal zknr, BigDecimal zanr, BigDecimal zvad, BigDecimal cost2, BigDecimal zpfc, BigDecimal zsfc, String serviceAgentStage, String deptPoint, String deptDesc, String destination, String destDesc) {
        super(MonthlyVehicleSummary.MONTHLY_VEHICLE_SUMMARY);

        setCompCode(compCode);
        setShipmentNo(shipmentNo);
        setLblni(lblni);
        setPaymentVendor(paymentVendor);
        setShipmentType(shipmentType);
        setShipCompletionDate(shipCompletionDate);
        setPlant(plant);
        setPlantDescripton(plantDescripton);
        setSplProcessingIndicator(splProcessingIndicator);
        setDescripton(descripton);
        setServiceAgent(serviceAgent);
        setName1(name1);
        setRoute(route);
        setRouteDescripton(routeDescripton);
        setTruckNumber(truckNumber);
        setStartingKm(startingKm);
        setEndingKm(endingKm);
        setRouteMasterDistance(routeMasterDistance);
        setDistanceTravelled(distanceTravelled);
        setPassingKm(passingKm);
        setTollFees(tollFees);
        setStageFixedAmt(stageFixedAmt);
        setFreightKm(freightKm);
        setFreightFixed(freightFixed);
        setFreightRate(freightRate);
        setSupplm1(supplm1);
        setSupplm2(supplm2);
        setSecRouteFreightAmt(secRouteFreightAmt);
        setSecRouteFreightKm(secRouteFreightKm);
        setAdditionalAmount(additionalAmount);
        setDeductionAmount(deductionAmount);
        setStatus(status);
        setCreatedBy(createdBy);
        setCreatedOn(createdOn);
        setLastChangedBy(lastChangedBy);
        setLastChangedOn(lastChangedOn);
        setDalbg(dalbg);
        setZfkmrt(zfkmrt);
        setKzwi4(kzwi4);
        setZdi1(zdi1);
        setZdi2(zdi2);
        setZvtk(zvtk);
        setZknr(zknr);
        setZanr(zanr);
        setZvad(zvad);
        setCost2(cost2);
        setZpfc(zpfc);
        setZsfc(zsfc);
        setServiceAgentStage(serviceAgentStage);
        setDeptPoint(deptPoint);
        setDeptDesc(deptDesc);
        setDestination(destination);
        setDestDesc(destDesc);
    }
}