package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Laptop;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryLaptopTest {

    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

       BigDecimal bigDecimal = new BigDecimal("100");
        values = new HashMap<String, Object>();
        values.put("laptopName", "Beast");
        values.put("unitPrice",  bigDecimal);
    }

    @Test
    public void getLaptop() throws Exception {

        BigDecimal testDecimal = new BigDecimal("100");
        Laptop laptop = FactoryLaptop.getLaptop(values);
        assertEquals(testDecimal, laptop.getUnitPrice());
    }

}