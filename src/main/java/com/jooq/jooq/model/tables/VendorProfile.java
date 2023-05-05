/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model.tables;


import com.jooq.jooq.model.Keys;
import com.jooq.jooq.model.VendorPortalPbx;
import com.jooq.jooq.model.tables.records.VendorProfileRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class VendorProfile extends TableImpl<VendorProfileRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>vendor_portal_pbx.vendor_profile</code>
     */
    public static final VendorProfile VENDOR_PROFILE = new VendorProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VendorProfileRecord> getRecordType() {
        return VendorProfileRecord.class;
    }

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.VENDOR_CODE</code>.
     */
    public final TableField<VendorProfileRecord, String> VENDOR_CODE = createField(DSL.name("VENDOR_CODE"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.VENDOR_NAME</code>.
     */
    public final TableField<VendorProfileRecord, String> VENDOR_NAME = createField(DSL.name("VENDOR_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.DOOR_NO</code>.
     */
    public final TableField<VendorProfileRecord, String> DOOR_NO = createField(DSL.name("DOOR_NO"), SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.STREET1</code>.
     */
    public final TableField<VendorProfileRecord, String> STREET1 = createField(DSL.name("STREET1"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.STREET2</code>.
     */
    public final TableField<VendorProfileRecord, String> STREET2 = createField(DSL.name("STREET2"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.STREET3</code>.
     */
    public final TableField<VendorProfileRecord, String> STREET3 = createField(DSL.name("STREET3"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.STREET4</code>.
     */
    public final TableField<VendorProfileRecord, String> STREET4 = createField(DSL.name("STREET4"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.STREET5</code>.
     */
    public final TableField<VendorProfileRecord, String> STREET5 = createField(DSL.name("STREET5"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.CITY</code>.
     */
    public final TableField<VendorProfileRecord, String> CITY = createField(DSL.name("CITY"), SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.DISTRICT</code>.
     */
    public final TableField<VendorProfileRecord, String> DISTRICT = createField(DSL.name("DISTRICT"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.REGION_CODE</code>.
     */
    public final TableField<VendorProfileRecord, String> REGION_CODE = createField(DSL.name("REGION_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.COUNTRY_CODE</code>.
     */
    public final TableField<VendorProfileRecord, String> COUNTRY_CODE = createField(DSL.name("COUNTRY_CODE"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.PINCODE</code>.
     */
    public final TableField<VendorProfileRecord, String> PINCODE = createField(DSL.name("PINCODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.GSTIN</code>.
     */
    public final TableField<VendorProfileRecord, String> GSTIN = createField(DSL.name("GSTIN"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.GST_STATUS</code>.
     */
    public final TableField<VendorProfileRecord, String> GST_STATUS = createField(DSL.name("GST_STATUS"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.GST_REGISTRATION_DATE</code>.
     */
    public final TableField<VendorProfileRecord, LocalDate> GST_REGISTRATION_DATE = createField(DSL.name("GST_REGISTRATION_DATE"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.EMAIL_ID</code>.
     */
    public final TableField<VendorProfileRecord, String> EMAIL_ID = createField(DSL.name("EMAIL_ID"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.WEBSITE</code>.
     */
    public final TableField<VendorProfileRecord, String> WEBSITE = createField(DSL.name("WEBSITE"), SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.TELEPHONE_NO</code>.
     */
    public final TableField<VendorProfileRecord, String> TELEPHONE_NO = createField(DSL.name("TELEPHONE_NO"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.MOBILE_NO_1</code>.
     */
    public final TableField<VendorProfileRecord, String> MOBILE_NO_1 = createField(DSL.name("MOBILE_NO_1"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.MOBILE_NO_2</code>.
     */
    public final TableField<VendorProfileRecord, String> MOBILE_NO_2 = createField(DSL.name("MOBILE_NO_2"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.PAN_NO</code>.
     */
    public final TableField<VendorProfileRecord, String> PAN_NO = createField(DSL.name("PAN_NO"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.NATURE_OF_BUSINESS</code>.
     */
    public final TableField<VendorProfileRecord, String> NATURE_OF_BUSINESS = createField(DSL.name("NATURE_OF_BUSINESS"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.NATURE_OF_FIRM</code>.
     */
    public final TableField<VendorProfileRecord, String> NATURE_OF_FIRM = createField(DSL.name("NATURE_OF_FIRM"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.FATHER_HUSBAN_NAME</code>.
     */
    public final TableField<VendorProfileRecord, String> FATHER_HUSBAN_NAME = createField(DSL.name("FATHER_HUSBAN_NAME"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.AGE</code>.
     */
    public final TableField<VendorProfileRecord, String> AGE = createField(DSL.name("AGE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.CREATED_BY</code>.
     */
    public final TableField<VendorProfileRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.CREATED_ON</code>.
     */
    public final TableField<VendorProfileRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.LAST_CHANGED_BY</code>.
     */
    public final TableField<VendorProfileRecord, String> LAST_CHANGED_BY = createField(DSL.name("LAST_CHANGED_BY"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.LAST_CHANGED_ON</code>.
     */
    public final TableField<VendorProfileRecord, LocalDateTime> LAST_CHANGED_ON = createField(DSL.name("LAST_CHANGED_ON"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.PAN_ATTACHMENT</code>.
     */
    public final TableField<VendorProfileRecord, byte[]> PAN_ATTACHMENT = createField(DSL.name("PAN_ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.PAN_ATTACHMENT_TYPE</code>.
     */
    public final TableField<VendorProfileRecord, String> PAN_ATTACHMENT_TYPE = createField(DSL.name("PAN_ATTACHMENT_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.PAN_ATTACHMENT_NAME</code>.
     */
    public final TableField<VendorProfileRecord, String> PAN_ATTACHMENT_NAME = createField(DSL.name("PAN_ATTACHMENT_NAME"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.GST_ATTACHMENT</code>.
     */
    public final TableField<VendorProfileRecord, byte[]> GST_ATTACHMENT = createField(DSL.name("GST_ATTACHMENT"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.GST_ATTACHMENT_TYPE</code>.
     */
    public final TableField<VendorProfileRecord, String> GST_ATTACHMENT_TYPE = createField(DSL.name("GST_ATTACHMENT_TYPE"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.GST_ATTACHMENT_NAME</code>.
     */
    public final TableField<VendorProfileRecord, String> GST_ATTACHMENT_NAME = createField(DSL.name("GST_ATTACHMENT_NAME"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.DECLARATION_NAME</code>.
     */
    public final TableField<VendorProfileRecord, String> DECLARATION_NAME = createField(DSL.name("DECLARATION_NAME"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.DECLARATION_CONTACT_NO</code>.
     */
    public final TableField<VendorProfileRecord, String> DECLARATION_CONTACT_NO = createField(DSL.name("DECLARATION_CONTACT_NO"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>vendor_portal_pbx.vendor_profile.STD_CODE</code>.
     */
    public final TableField<VendorProfileRecord, String> STD_CODE = createField(DSL.name("STD_CODE"), SQLDataType.VARCHAR(45), this, "");

    private VendorProfile(Name alias, Table<VendorProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private VendorProfile(Name alias, Table<VendorProfileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_profile</code> table reference
     */
    public VendorProfile(String alias) {
        this(DSL.name(alias), VENDOR_PROFILE);
    }

    /**
     * Create an aliased <code>vendor_portal_pbx.vendor_profile</code> table reference
     */
    public VendorProfile(Name alias) {
        this(alias, VENDOR_PROFILE);
    }

    /**
     * Create a <code>vendor_portal_pbx.vendor_profile</code> table reference
     */
    public VendorProfile() {
        this(DSL.name("vendor_profile"), null);
    }

    public <O extends Record> VendorProfile(Table<O> child, ForeignKey<O, VendorProfileRecord> key) {
        super(child, key, VENDOR_PROFILE);
    }

    @Override
    public Schema getSchema() {
        return VendorPortalPbx.VENDOR_PORTAL_PBX;
    }

    @Override
    public UniqueKey<VendorProfileRecord> getPrimaryKey() {
        return Keys.KEY_VENDOR_PROFILE_PRIMARY;
    }

    @Override
    public List<UniqueKey<VendorProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<VendorProfileRecord>>asList(Keys.KEY_VENDOR_PROFILE_PRIMARY);
    }

    @Override
    public VendorProfile as(String alias) {
        return new VendorProfile(DSL.name(alias), this);
    }

    @Override
    public VendorProfile as(Name alias) {
        return new VendorProfile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorProfile rename(String name) {
        return new VendorProfile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VendorProfile rename(Name name) {
        return new VendorProfile(name, null);
    }
}
