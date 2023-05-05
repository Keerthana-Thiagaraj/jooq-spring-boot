/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Indexes;
import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.NewsLetterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewsLetter extends TableImpl<NewsLetterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.news_letter</code>
     */
    public static final NewsLetter NEWS_LETTER = new NewsLetter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NewsLetterRecord> getRecordType() {
        return NewsLetterRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.news_letter.COUNTRY_CODE</code>.
     */
    public final TableField<NewsLetterRecord, String> COUNTRY_CODE = createField(DSL.name("COUNTRY_CODE"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.REGION_CODE</code>.
     */
    public final TableField<NewsLetterRecord, String> REGION_CODE = createField(DSL.name("REGION_CODE"), SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.TYPE_ID</code>.
     */
    public final TableField<NewsLetterRecord, Integer> TYPE_ID = createField(DSL.name("TYPE_ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.UPLOAD_TYPE_ID</code>.
     */
    public final TableField<NewsLetterRecord, String> UPLOAD_TYPE_ID = createField(DSL.name("UPLOAD_TYPE_ID"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.SERIAL_NO</code>.
     */
    public final TableField<NewsLetterRecord, String> SERIAL_NO = createField(DSL.name("SERIAL_NO"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.FILE_NAME</code>.
     */
    public final TableField<NewsLetterRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.FILE_TYPE</code>.
     */
    public final TableField<NewsLetterRecord, String> FILE_TYPE = createField(DSL.name("FILE_TYPE"), SQLDataType.VARCHAR(55), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.FILE_CONTENT</code>.
     */
    public final TableField<NewsLetterRecord, byte[]> FILE_CONTENT = createField(DSL.name("FILE_CONTENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.VIDEO_URL</code>.
     */
    public final TableField<NewsLetterRecord, String> VIDEO_URL = createField(DSL.name("VIDEO_URL"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.STATUS</code>.
     */
    public final TableField<NewsLetterRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.CREATED_BY</code>.
     */
    public final TableField<NewsLetterRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.CREATED_ON</code>.
     */
    public final TableField<NewsLetterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.LAST_CHANGED_BY</code>.
     */
    public final TableField<NewsLetterRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.LAST_CHANGED_ON</code>.
     */
    public final TableField<NewsLetterRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.UPLOADED_DATE_TIME</code>.
     */
    public final TableField<NewsLetterRecord, LocalDateTime> UPLOADED_DATE_TIME = createField(DSL.name("UPLOADED_DATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.news_letter.REGIONAL_LANGUAGE_CODE</code>.
     */
    public final TableField<NewsLetterRecord, String> REGIONAL_LANGUAGE_CODE = createField(DSL.name("REGIONAL_LANGUAGE_CODE"), SQLDataType.VARCHAR(1000), this, "");

    private NewsLetter(Name alias, Table<NewsLetterRecord> aliased) {
        this(alias, aliased, null);
    }

    private NewsLetter(Name alias, Table<NewsLetterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.news_letter</code> table reference
     */
    public NewsLetter(String alias) {
        this(DSL.name(alias), NEWS_LETTER);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.news_letter</code> table reference
     */
    public NewsLetter(Name alias) {
        this(alias, NEWS_LETTER);
    }

    /**
     * Create a <code>vendor_portal_pbx.news_letter</code> table reference
     */
    public NewsLetter() {
        this(DSL.name("news_letter"), null);
    }

    public <O extends Record> NewsLetter(Table<O> child, ForeignKey<O, NewsLetterRecord> key) {
        super(child, key, NEWS_LETTER);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NEWS_LETTER_NEWSLETTER_INDIVIDUAL, Indexes.NEWS_LETTER_SECONDARY_NEWS_LIST);
    }

    @Override
    public UniqueKey<NewsLetterRecord> getPrimaryKey() {
        return Keys.KEY_NEWS_LETTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<NewsLetterRecord>> getKeys() {
        return Arrays.<UniqueKey<NewsLetterRecord>>asList(Keys.KEY_NEWS_LETTER_PRIMARY);
    }

    @Override
    public NewsLetter as(String alias) {
        return new NewsLetter(DSL.name(alias), this);
    }

    @Override
    public NewsLetter as(Name alias) {
        return new NewsLetter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NewsLetter rename(String name) {
        return new NewsLetter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NewsLetter rename(Name name) {
        return new NewsLetter(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, Integer, String, String, String, String, byte[], String, String, String, LocalDateTime, String, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}