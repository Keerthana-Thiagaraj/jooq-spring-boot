/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.daos;


import com.jooq.jooq.model.tables.CityMaster;
import com.jooq.jooq.model.tables.records.CityMasterRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class CityMasterDao extends DAOImpl<CityMasterRecord, com.jooq.jooq.model.tables.pojos.CityMaster, Integer> {

    /**
     * Create a new CityMasterDao without any configuration
     */
    public CityMasterDao() {
        super(CityMaster.CITY_MASTER, com.jooq.jooq.model.tables.pojos.CityMaster.class);
    }

    /**
     * Create a new CityMasterDao with an attached configuration
     */
    @Autowired
    public CityMasterDao(Configuration configuration) {
        super(CityMaster.CITY_MASTER, com.jooq.jooq.model.tables.pojos.CityMaster.class, configuration);
    }

    @Override
    public Integer getId(com.jooq.jooq.model.tables.pojos.CityMaster object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CityMaster.CITY_MASTER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchById(Integer... values) {
        return fetch(CityMaster.CITY_MASTER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.jooq.jooq.model.tables.pojos.CityMaster fetchOneById(Integer value) {
        return fetchOne(CityMaster.CITY_MASTER.ID, value);
    }

    /**
     * Fetch records that have <code>CITY BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchRangeOfCity(String lowerInclusive, String upperInclusive) {
        return fetchRange(CityMaster.CITY_MASTER.CITY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CITY IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchByCity(String... values) {
        return fetch(CityMaster.CITY_MASTER.CITY, values);
    }

    /**
     * Fetch records that have <code>STATE_ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchRangeOfStateId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(CityMaster.CITY_MASTER.STATE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>STATE_ID IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchByStateId(Integer... values) {
        return fetch(CityMaster.CITY_MASTER.STATE_ID, values);
    }

    /**
     * Fetch records that have <code>STATUS BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchRangeOfStatus(String lowerInclusive, String upperInclusive) {
        return fetchRange(CityMaster.CITY_MASTER.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchByStatus(String... values) {
        return fetch(CityMaster.CITY_MASTER.STATUS, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchRangeOfCreatedBy(String lowerInclusive, String upperInclusive) {
        return fetchRange(CityMaster.CITY_MASTER.CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchByCreatedBy(String... values) {
        return fetch(CityMaster.CITY_MASTER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>CREATED_ON BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchRangeOfCreatedOn(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(CityMaster.CITY_MASTER.CREATED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CREATED_ON IN (values)</code>
     */
    public List<com.jooq.jooq.model.tables.pojos.CityMaster> fetchByCreatedOn(LocalDateTime... values) {
        return fetch(CityMaster.CITY_MASTER.CREATED_ON, values);
    }
}