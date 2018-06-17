package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Order;
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
public class FactoryOrderTest {
    Map<String, Object> values;
    @Before
    public void setUp() throws Exception {

        Date setupOd;
        values = new HashMap<String, Object>();
        values.put("orderNumber", 5);
        values.put("orderDate", setupOd = new SimpleDateFormat("yyyy/MM/dd").parse("2018/10/10"));
    }

    @Test
    public void getOrder() throws Exception {

        Order order = FactoryOrder.getOrder(values);
        Date setupOd;
        setupOd = new SimpleDateFormat("yyyy/MM/dd").parse("2018/10/10");
        assertEquals(setupOd,order.getOrderDate());
        assertEquals(5, order.getOrderNumber());
    }

}