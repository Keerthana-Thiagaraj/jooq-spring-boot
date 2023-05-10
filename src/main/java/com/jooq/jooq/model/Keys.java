/*
 * This file is generated by jOOQ.
 */
package com.jooq.jooq.model;


import com.jooq.jooq.model.tables.CustomerMaster;
import com.jooq.jooq.model.tables.FieldMaster;
import com.jooq.jooq.model.tables.FieldTabMaster;
import com.jooq.jooq.model.tables.UserMaster;
import com.jooq.jooq.model.tables.records.CustomerMasterRecord;
import com.jooq.jooq.model.tables.records.FieldMasterRecord;
import com.jooq.jooq.model.tables.records.FieldTabMasterRecord;
import com.jooq.jooq.model.tables.records.UserMasterRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * jooq_demo.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CustomerMasterRecord> KEY_CUSTOMER_MASTER_PRIMARY = Internal.createUniqueKey(CustomerMaster.CUSTOMER_MASTER, DSL.name("KEY_customer_master_PRIMARY"), new TableField[] { CustomerMaster.CUSTOMER_MASTER.COMP_CODE, CustomerMaster.CUSTOMER_MASTER.CUSTOMER_CODE }, true);
    public static final UniqueKey<FieldMasterRecord> KEY_FIELD_MASTER_PRIMARY = Internal.createUniqueKey(FieldMaster.FIELD_MASTER, DSL.name("KEY_Field_master_PRIMARY"), new TableField[] { FieldMaster.FIELD_MASTER.SNO }, true);
    public static final UniqueKey<FieldTabMasterRecord> KEY_FIELD_TAB_MASTER_PRIMARY = Internal.createUniqueKey(FieldTabMaster.FIELD_TAB_MASTER, DSL.name("KEY_field_tab_master_PRIMARY"), new TableField[] { FieldTabMaster.FIELD_TAB_MASTER.TAB_ID }, true);
    public static final UniqueKey<UserMasterRecord> KEY_USER_MASTER_PRIMARY = Internal.createUniqueKey(UserMaster.USER_MASTER, DSL.name("KEY_user_master_PRIMARY"), new TableField[] { UserMaster.USER_MASTER.USER_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<FieldMasterRecord, FieldTabMasterRecord> FK_FIELD_MASTER = Internal.createForeignKey(FieldMaster.FIELD_MASTER, DSL.name("fk_field_master"), new TableField[] { FieldMaster.FIELD_MASTER.TAB_ID }, Keys.KEY_FIELD_TAB_MASTER_PRIMARY, new TableField[] { FieldTabMaster.FIELD_TAB_MASTER.TAB_ID }, true);
}
