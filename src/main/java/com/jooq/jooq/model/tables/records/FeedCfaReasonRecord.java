/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables.records;


import com.jooq.jooq.model.tables.FeedCfaReason;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FeedCfaReasonRecord extends UpdatableRecordImpl<FeedCfaReasonRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>vendor_portal_pbx.feed_cfa_reason.id</code>.
     */
    public FeedCfaReasonRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_cfa_reason.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_cfa_reason.reason</code>.
     */
    public FeedCfaReasonRecord setReason(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_cfa_reason.reason</code>.
     */
    public String getReason() {
        return (String) get(1);
    }

    /**
     * Setter for <code>vendor_portal_pbx.feed_cfa_reason.status</code>.
     */
    public FeedCfaReasonRecord setStatus(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>vendor_portal_pbx.feed_cfa_reason.status</code>.
     */
    public String getStatus() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FeedCfaReason.FEED_CFA_REASON.ID;
    }

    @Override
    public Field<String> field2() {
        return FeedCfaReason.FEED_CFA_REASON.REASON;
    }

    @Override
    public Field<String> field3() {
        return FeedCfaReason.FEED_CFA_REASON.STATUS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getReason();
    }

    @Override
    public String component3() {
        return getStatus();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getReason();
    }

    @Override
    public String value3() {
        return getStatus();
    }

    @Override
    public FeedCfaReasonRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public FeedCfaReasonRecord value2(String value) {
        setReason(value);
        return this;
    }

    @Override
    public FeedCfaReasonRecord value3(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public FeedCfaReasonRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FeedCfaReasonRecord
     */
    public FeedCfaReasonRecord() {
        super(FeedCfaReason.FEED_CFA_REASON);
    }

    /**
     * Create a detached, initialised FeedCfaReasonRecord
     */
    public FeedCfaReasonRecord(Integer id, String reason, String status) {
        super(FeedCfaReason.FEED_CFA_REASON);

        setId(id);
        setReason(reason);
        setStatus(status);
    }
}