package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.CustomerContact;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerContactFactoryTest {

    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("contactDetails", "0211112233");
    }

    @Test
    public void getCustomerContact() throws Exception {

        CustomerContact customerContact = CustomerContactFactory.getCustomerContact(values);
        assertEquals("0211112233", customerContact.getContactDetails());
    }

}