package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("customerNumber", "0211234567");
        values.put("firstName", "Gareth");
        values.put("lastName", "Morgan");
    }

    @Test
    public void getCustomer() throws Exception {
        Customer customer = CustomerFactory.getCustomer(values);
        assertEquals("Morgan", customer.getLastName());
    }

}