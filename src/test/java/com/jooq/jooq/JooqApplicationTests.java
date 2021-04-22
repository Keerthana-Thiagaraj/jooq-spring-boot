package com.jooq.jooq;

import com.jooq.jooq.model.Tables;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record3;
import org.jooq.Result;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@JooqTest
public class JooqApplicationTests {

    @Autowired
    private DSLContext dslContext;

    @Before
    public void insertRecords() {

        dslContext.delete(Tables.CUSTOMER).execute();
        dslContext.insertInto(Tables.CUSTOMER, Tables.CUSTOMER.NAME, Tables.CUSTOMER.AGE)
                .values("Ram", 20)
                .values("raji", 23)
                .values("seetha", 26).execute();
    }

    @Test
    public void totalRecordCountSuccess() throws Exception {

        Result<Record> result = dslContext.select().from(Tables.CUSTOMER).fetch();
        Assert.assertEquals(3, result.size());
    }

    @Test
    public void listOfNamesSuccess() {
        Result<Record3<Integer, String, Integer>> customerList = dslContext.select(Tables.CUSTOMER.ID, Tables.CUSTOMER.NAME, Tables.CUSTOMER.AGE).from(Tables.CUSTOMER).fetch();
        Assert.assertEquals(Arrays.asList("Ram", "raji", "seetha"), customerList.getValues(1));
    }

    @Test
    public void incorrectAgeEntryFailure() {
        Result<Record3<Integer, String, Integer>> customerList = dslContext.select(Tables.CUSTOMER.ID, Tables.CUSTOMER.NAME, Tables.CUSTOMER.AGE).from(Tables.CUSTOMER).fetch();
        Assert.assertEquals(Arrays.asList(12, 23, 26), customerList.getValues(2));
    }

    @Test
    public void emptyRecordsFailure() {
        dslContext.delete(Tables.CUSTOMER).execute();
        Result<Record> result = dslContext.select().from(Tables.CUSTOMER).fetch();
        Assert.assertEquals(3, result.size());
    }
}
