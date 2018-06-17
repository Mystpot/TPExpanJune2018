package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Order;
import com.fivehl.tp2.model.OrderItem;

import java.util.Date;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryOrder {

    public static Order getOrder(Map<String, Object> values)
    {
        Order factoryOrder = new Order.Builder()
                .orderNumber((int)values.get("orderNumber"))
                .orderDate((Date)values.get("orderDate"))
                .orderItem((OrderItem)values.get("orderItem"))
                .build();
        return factoryOrder;
    }
}
