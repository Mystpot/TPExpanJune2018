package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.CreditCard;
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
public class CreditCardFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        Date setupEd;

        values = new HashMap<String, Object>();
        values.put("cardNumber", "123456");
        values.put("nameOnCard", "Gareth");
        values.put("expiryDate", setupEd = new SimpleDateFormat("yyyy/MM/dd").parse("2018/11/19"));
    }

    @Test
    public void getCreditCard() throws Exception {

        CreditCard creditCard = CreditCardFactory.getCreditCard(values);
        Date setupEd;
        setupEd = new SimpleDateFormat("yyyy/MM/dd").parse("2018/11/19");
        assertEquals(setupEd, creditCard.getExpiryDate());
    }

}