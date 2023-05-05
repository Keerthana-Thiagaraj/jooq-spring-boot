/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.HapPoItemImageUpload;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HapPoItemImageUploadRecord extends UpdatableRecordImpl<HapPoItemImageUploadRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_NUMBER</code>.
     */
    public HapPoItemImageUploadRecord setPoNumber(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_NUMBER</code>.
     */
    public String getPoNumber() {
        return (String) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_ITEM_NO</code>.
     */
    public HapPoItemImageUploadRecord setPoItemNo(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_ITEM_NO</code>.
     */
    public String getPoItemNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_SERVICE_ITEM_NO</code>.
     */
    public HapPoItemImageUploadRecord setPoServiceItemNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_SERVICE_ITEM_NO</code>.
     */
    public String getPoServiceItemNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_IMAGE</code>.
     */
    public HapPoItemImageUploadRecord setPoImage(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_IMAGE</code>.
     */
    public String getPoImage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_URL</code>.
     */
    public HapPoItemImageUploadRecord setPoUrl(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_image_upload.PO_URL</code>.
     */
    public String getPoUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_image_upload.IMAGE_LATITUDE</code>.
     */
    public HapPoItemImageUploadRecord setImageLatitude(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_image_upload.IMAGE_LATITUDE</code>.
     */
    public String getImageLatitude() {
        return (String) get(5);
    }

    /**
     * Setter for <code>vendor_portal_pbx.hap_po_item_image_upload.IMAGE_LONGITUDE</code>.
     */
    public HapPoItemImageUploadRecord setImageLongitude(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.hap_po_item_image_upload.IMAGE_LONGITUDE</code>.
     */
    public String getImageLongitude() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD.PO_NUMBER;
    }

    @Override
    public Field<String> field2() {
        return HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD.PO_ITEM_NO;
    }

    @Override
    public Field<String> field3() {
        return HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD.PO_SERVICE_ITEM_NO;
    }

    @Override
    public Field<String> field4() {
        return HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD.PO_IMAGE;
    }

    @Override
    public Field<String> field5() {
        return HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD.PO_URL;
    }

    @Override
    public Field<String> field6() {
        return HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD.IMAGE_LATITUDE;
    }

    @Override
    public Field<String> field7() {
        return HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD.IMAGE_LONGITUDE;
    }

    @Override
    public String component1() {
        return getPoNumber();
    }

    @Override
    public String component2() {
        return getPoItemNo();
    }

    @Override
    public String component3() {
        return getPoServiceItemNo();
    }

    @Override
    public String component4() {
        return getPoImage();
    }

    @Override
    public String component5() {
        return getPoUrl();
    }

    @Override
    public String component6() {
        return getImageLatitude();
    }

    @Override
    public String component7() {
        return getImageLongitude();
    }

    @Override
    public String value1() {
        return getPoNumber();
    }

    @Override
    public String value2() {
        return getPoItemNo();
    }

    @Override
    public String value3() {
        return getPoServiceItemNo();
    }

    @Override
    public String value4() {
        return getPoImage();
    }

    @Override
    public String value5() {
        return getPoUrl();
    }

    @Override
    public String value6() {
        return getImageLatitude();
    }

    @Override
    public String value7() {
        return getImageLongitude();
    }

    @Override
    public HapPoItemImageUploadRecord value1(String value) {
        setPoNumber(value);
        return this;
    }

    @Override
    public HapPoItemImageUploadRecord value2(String value) {
        setPoItemNo(value);
        return this;
    }

    @Override
    public HapPoItemImageUploadRecord value3(String value) {
        setPoServiceItemNo(value);
        return this;
    }

    @Override
    public HapPoItemImageUploadRecord value4(String value) {
        setPoImage(value);
        return this;
    }

    @Override
    public HapPoItemImageUploadRecord value5(String value) {
        setPoUrl(value);
        return this;
    }

    @Override
    public HapPoItemImageUploadRecord value6(String value) {
        setImageLatitude(value);
        return this;
    }

    @Override
    public HapPoItemImageUploadRecord value7(String value) {
        setImageLongitude(value);
        return this;
    }

    @Override
    public HapPoItemImageUploadRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HapPoItemImageUploadRecord
     */
    public HapPoItemImageUploadRecord() {
        super(HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD);
    }

    /**
     * Create a detached, initialised HapPoItemImageUploadRecord
     */
    public HapPoItemImageUploadRecord(String poNumber, String poItemNo, String poServiceItemNo, String poImage, String poUrl, String imageLatitude, String imageLongitude) {
        super(HapPoItemImageUpload.HAP_PO_ITEM_IMAGE_UPLOAD);

        setPoNumber(poNumber);
        setPoItemNo(poItemNo);
        setPoServiceItemNo(poServiceItemNo);
        setPoImage(poImage);
        setPoUrl(poUrl);
        setImageLatitude(imageLatitude);
        setImageLongitude(imageLongitude);
    }
}