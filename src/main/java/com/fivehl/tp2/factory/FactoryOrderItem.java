package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.OrderItem;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryOrderItem {

    public static OrderItem getOrderItem(Map<String, Object> values)
    {
        OrderItem factoryOrderItem = new OrderItem.Builder()
                .quantity((int)values.get("quantity"))
                .laptop((String)values.get("laptopName"), (BigDecimal)values.get("unitPrice"))
                .build();
        return factoryOrderItem;
    }
}
