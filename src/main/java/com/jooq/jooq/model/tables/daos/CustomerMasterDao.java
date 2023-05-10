/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.daos;


import com.jooq.jooq.model.tables.CustomerMaster;
import com.jooq.jooq.model.tables.records.CustomerMasterRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class CustomerMasterDao extends DAOImpl<CustomerMasterRecord, com.jooq.jooq.model.tables.pojos.CustomerMaster, Record2<String, String>> {

    /**
     * Create a new CustomerMasterDao without any configuration
     */
    public CustomerMasterDao() {
        super(CustomerMaster.CUSTOMER_MASTER, com.jooq.jooq.model.tables.pojos.CustomerMaster.class);
    }

    /**
     * Create a new CustomerMasterDao with an attached configuration
     */
    @Autowired
    public CustomerMasterDao(Configuration configuration) {
        super(CustomerMaster.CUSTOMER_MASTER, com.jooq.jooq.model.tables.pojos.CustomerMaster.class, configuration);
    }

    @Override
    public Record2<String, String> getId(com.jooq.jooq.model.tables.pojos.CustomerMaster object) {
        return compositeKeyRecord(object.getCompCode(), object.getCustomerCode());
    }

    /**
     * Fetch records that have <code>COMP_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCompCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.COMP_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>COMP_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCompCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.COMP_CODE, values);
    }

    /**
     * Fetch records that have <code>CUSTOMER_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCustomerCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.CUSTOMER_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CUSTOMER_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCustomerCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.CUSTOMER_CODE, values);
    }

    /**
     * Fetch records that have <code>CUSTOMER_ACC_GRP_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCustomerAccGrpCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.CUSTOMER_ACC_GRP_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CUSTOMER_ACC_GRP_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCustomerAccGrpCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.CUSTOMER_ACC_GRP_CODE, values);
    }

    /**
     * Fetch records that have <code>CUSTOMER_GRP_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCustomerGrpCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.CUSTOMER_GRP_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CUSTOMER_GRP_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCustomerGrpCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.CUSTOMER_GRP_CODE, values);
    }

    /**
     * Fetch records that have <code>NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByName(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.NAME, values);
    }

    /**
     * Fetch records that have <code>NAME_2 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfName_2(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.NAME_2, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>NAME_2 IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByName_2(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.NAME_2, values);
    }

    /**
     * Fetch records that have <code>CITY BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCity(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.CITY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CITY IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCity(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.CITY, values);
    }

    /**
     * Fetch records that have <code>DISTRICT BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfDistrict(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.DISTRICT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>DISTRICT IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByDistrict(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.DISTRICT, values);
    }

    /**
     * Fetch records that have <code>POSTAL_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfPostalCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.POSTAL_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>POSTAL_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByPostalCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.POSTAL_CODE, values);
    }

    /**
     * Fetch records that have <code>REGION_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfRegionCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.REGION_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>REGION_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByRegionCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.REGION_CODE, values);
    }

    /**
     * Fetch records that have <code>COUNTRY_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCountryCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.COUNTRY_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>COUNTRY_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCountryCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.COUNTRY_CODE, values);
    }

    /**
     * Fetch records that have <code>PAN_NO BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfPanNo(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.PAN_NO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PAN_NO IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByPanNo(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.PAN_NO, values);
    }

    /**
     * Fetch records that have <code>GSTIN BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfGstin(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.GSTIN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>GSTIN IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByGstin(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.GSTIN, values);
    }

    /**
     * Fetch records that have <code>TELEPHONE_NO BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfTelephoneNo(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.TELEPHONE_NO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>TELEPHONE_NO IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByTelephoneNo(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.TELEPHONE_NO, values);
    }

    /**
     * Fetch records that have <code>DOOR_NO BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfDoorNo(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.DOOR_NO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>DOOR_NO IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByDoorNo(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.DOOR_NO, values);
    }

    /**
     * Fetch records that have <code>STREET_NAME_1 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfStreetName_1(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.STREET_NAME_1, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>STREET_NAME_1 IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByStreetName_1(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.STREET_NAME_1, values);
    }

    /**
     * Fetch records that have <code>STREET_NAME_3 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfStreetName_3(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.STREET_NAME_3, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>STREET_NAME_3 IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByStreetName_3(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.STREET_NAME_3, values);
    }

    /**
     * Fetch records that have <code>LANDMARK BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfLandmark(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.LANDMARK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LANDMARK IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByLandmark(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.LANDMARK, values);
    }

    /**
     * Fetch records that have <code>MOBILE_NO_1 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfMobileNo_1(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.MOBILE_NO_1, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>MOBILE_NO_1 IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByMobileNo_1(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.MOBILE_NO_1, values);
    }

    /**
     * Fetch records that have <code>MOBILE_NO_2 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfMobileNo_2(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.MOBILE_NO_2, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>MOBILE_NO_2 IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByMobileNo_2(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.MOBILE_NO_2, values);
    }

    /**
     * Fetch records that have <code>EMAIL BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByEmail(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>VENDOR_CODE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfVendorCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.VENDOR_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>VENDOR_CODE IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByVendorCode(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.VENDOR_CODE, values);
    }

    /**
     * Fetch records that have <code>STATUS BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfStatus(String lowerInclusive, String upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByStatus(String... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.STATUS, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCreatedBy(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCreatedBy(Integer... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>CREATED_ON BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfCreatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.CREATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CREATED_ON IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByCreatedOn(LocalDateTime... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.CREATED_ON, values);
    }

    /**
     * Fetch records that have <code>LAST_CHANGED_BY BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfLastChangedBy(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.LAST_CHANGED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LAST_CHANGED_BY IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByLastChangedBy(Integer... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.LAST_CHANGED_BY, values);
    }

    /**
     * Fetch records that have <code>LAST_CHANGED_ON BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchRangeOfLastChangedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(CustomerMaster.CUSTOMER_MASTER.LAST_CHANGED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LAST_CHANGED_ON IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CustomerMaster> fetchByLastChangedOn(LocalDateTime... values) {
        return fetch(CustomerMaster.CUSTOMER_MASTER.LAST_CHANGED_ON, values);
    }
}
