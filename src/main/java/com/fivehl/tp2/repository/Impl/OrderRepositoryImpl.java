package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.Order;
import com.fivehl.tp2.repository.OrderRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class OrderRepositoryImpl implements OrderRepository {

    private static OrderRepositoryImpl repository = null;

    private Map<Integer, Order> orderTable;

    private OrderRepositoryImpl()
    {
        orderTable = new HashMap<Integer, Order>();
    }

    public static OrderRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new OrderRepositoryImpl();
        return repository;
    }

    public Order create(Order order)
    {
        orderTable.put(order.getOrderNumber(),order);
        Order dbOrder = orderTable.get(order.getOrderNumber());
        return dbOrder;
    }

    public Order read(int orderNumber)
    {
        Order order = orderTable.get(orderNumber);
        return order;
    }

    public Order update(Order order)
    {
        orderTable.put(order.getOrderNumber(),order);
        Order dbOrder = orderTable.get(order.getOrderNumber());
        return dbOrder;
    }

    public void delete (int orderNumber)
    {
        orderTable.remove(orderNumber);
    }
}
