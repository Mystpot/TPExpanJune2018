package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Demography;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class DemographyFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        Date setupDb;

        values = new HashMap<String, Object>();
        values.put("gender", "Male");
        values.put("race", "White");
        values.put("dateOfBirth", setupDb =  new SimpleDateFormat("yyyy/MM/dd").parse("1991/11/19"));
    }

    @Test
    public void getDemography() throws Exception {

        Demography demography = DemographyFactory.getDemography(values);
        Date setupDb;
        setupDb = new SimpleDateFormat("yyyy/MM/dd").parse("1991/11/19");
        assertEquals(setupDb, demography.getDateOfBirth());
    }

}