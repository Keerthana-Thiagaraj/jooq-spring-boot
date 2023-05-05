/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.TransporterMspDetails;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransporterMspDetailsRecord extends UpdatableRecordImpl<TransporterMspDetailsRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.VENDOR_CODE</code>.
     */
    public TransporterMspDetailsRecord setVendorCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.VENDOR_CODE</code>.
     */
    public String getVendorCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_CODE</code>.
     */
    public TransporterMspDetailsRecord setPlantCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_CODE</code>.
     */
    public String getPlantCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_NAME</code>.
     */
    public TransporterMspDetailsRecord setPlantName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.PLANT_NAME</code>.
     */
    public String getPlantName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_NAME</code>.
     */
    public TransporterMspDetailsRecord setLogisticTlName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_NAME</code>.
     */
    public String getLogisticTlName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_MOBILE</code>.
     */
    public TransporterMspDetailsRecord setLogisticTlMobile(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_MOBILE</code>.
     */
    public String getLogisticTlMobile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_EMAIL</code>.
     */
    public TransporterMspDetailsRecord setLogisticTlEmail(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.transporter_msp_details.LOGISTIC_TL_EMAIL</code>.
     */
    public String getLogisticTlEmail() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TransporterMspDetails.TRANSPORTER_MSP_DETAILS.VENDOR_CODE;
    }

    @Override
    public Field<String> field2() {
        return TransporterMspDetails.TRANSPORTER_MSP_DETAILS.PLANT_CODE;
    }

    @Override
    public Field<String> field3() {
        return TransporterMspDetails.TRANSPORTER_MSP_DETAILS.PLANT_NAME;
    }

    @Override
    public Field<String> field4() {
        return TransporterMspDetails.TRANSPORTER_MSP_DETAILS.LOGISTIC_TL_NAME;
    }

    @Override
    public Field<String> field5() {
        return TransporterMspDetails.TRANSPORTER_MSP_DETAILS.LOGISTIC_TL_MOBILE;
    }

    @Override
    public Field<String> field6() {
        return TransporterMspDetails.TRANSPORTER_MSP_DETAILS.LOGISTIC_TL_EMAIL;
    }

    @Override
    public String component1() {
        return getVendorCode();
    }

    @Override
    public String component2() {
        return getPlantCode();
    }

    @Override
    public String component3() {
        return getPlantName();
    }

    @Override
    public String component4() {
        return getLogisticTlName();
    }

    @Override
    public String component5() {
        return getLogisticTlMobile();
    }

    @Override
    public String component6() {
        return getLogisticTlEmail();
    }

    @Override
    public String value1() {
        return getVendorCode();
    }

    @Override
    public String value2() {
        return getPlantCode();
    }

    @Override
    public String value3() {
        return getPlantName();
    }

    @Override
    public String value4() {
        return getLogisticTlName();
    }

    @Override
    public String value5() {
        return getLogisticTlMobile();
    }

    @Override
    public String value6() {
        return getLogisticTlEmail();
    }

    @Override
    public TransporterMspDetailsRecord value1(String value) {
        setVendorCode(value);
        return this;
    }

    @Override
    public TransporterMspDetailsRecord value2(String value) {
        setPlantCode(value);
        return this;
    }

    @Override
    public TransporterMspDetailsRecord value3(String value) {
        setPlantName(value);
        return this;
    }

    @Override
    public TransporterMspDetailsRecord value4(String value) {
        setLogisticTlName(value);
        return this;
    }

    @Override
    public TransporterMspDetailsRecord value5(String value) {
        setLogisticTlMobile(value);
        return this;
    }

    @Override
    public TransporterMspDetailsRecord value6(String value) {
        setLogisticTlEmail(value);
        return this;
    }

    @Override
    public TransporterMspDetailsRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransporterMspDetailsRecord
     */
    public TransporterMspDetailsRecord() {
        super(TransporterMspDetails.TRANSPORTER_MSP_DETAILS);
    }

    /**
     * Create a detached, initialised TransporterMspDetailsRecord
     */
    public TransporterMspDetailsRecord(String vendorCode, String plantCode, String plantName, String logisticTlName, String logisticTlMobile, String logisticTlEmail) {
        super(TransporterMspDetails.TRANSPORTER_MSP_DETAILS);

        setVendorCode(vendorCode);
        setPlantCode(plantCode);
        setPlantName(plantName);
        setLogisticTlName(logisticTlName);
        setLogisticTlMobile(logisticTlMobile);
        setLogisticTlEmail(logisticTlEmail);
    }
}
