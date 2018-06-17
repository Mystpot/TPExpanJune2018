package com.fivehl.tp2.model;

import com.fivehl.tp2.factory.FactoryLaptop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class OrderItem implements Serializable{

    private int quantity;
    private Laptop laptop;


    public int getQuantity() {
        return quantity;
    }

    public Laptop getLaptop() { return laptop; }

    private OrderItem()
    {

    }

    private OrderItem(Builder builder)
    {
        this.quantity = builder.quantity;
    }

    public static class Builder {

        private int quantity;
        private Laptop laptop;

        public Builder quantity(int value)
        {
            this.quantity = value;
            return this;
        }

        public Builder laptop(String laptopName, BigDecimal unitPrice) {

            Map<String, Object> values = new HashMap<String, Object>();
            values.put("laptopName", laptopName);
            values.put("unitPrice", unitPrice);
            this.laptop = FactoryLaptop.getLaptop(values);
            return this;

        }

        public OrderItem build()
        {
            return new OrderItem(this);
        }
    }
}
