package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.OrderItem;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryOrderItemTest {

    Map<String, Object> values;
    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("quantity", 2);

    }

    @Test
    public void getOrderItem() throws Exception {

        OrderItem orderItem = FactoryOrderItem.getOrderItem(values);
        assertEquals(2, orderItem.getQuantity());
    }

}