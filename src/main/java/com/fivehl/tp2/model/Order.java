package com.fivehl.tp2.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class Order implements Serializable {

    private int orderNumber;
    private Date orderDate;
    private OrderItem orderItem;


    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public OrderItem getOrderItem() { return orderItem; }


    private Order()
    {

    }

    private Order(Builder builder)
    {
        this.orderNumber = builder.orderNumber;
        this.orderDate = builder.orderDate;
        this.orderItem = builder.orderItem;
    }



    public static class Builder {

        private int orderNumber;
        private Date orderDate;
        private OrderItem orderItem;

        public Builder orderNumber(int value)
        {
            this.orderNumber = value;
            return this;
        }

        public Builder orderDate(Date value)
        {
            this.orderDate = value;
            return this;
        }

        public Builder orderItem(OrderItem value)
        {
            this.orderItem = value;
            return this;
        }

        public Order build()
        {
            return new Order(this);
        }
    }
}
