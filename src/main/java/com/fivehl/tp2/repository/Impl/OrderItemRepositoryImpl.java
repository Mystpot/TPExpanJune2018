package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.OrderItem;
import com.fivehl.tp2.repository.OrderItemRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class OrderItemRepositoryImpl implements OrderItemRepository {

    private static OrderItemRepositoryImpl repository = null;

    private Map<Integer, OrderItem> orderItemTable;

    private OrderItemRepositoryImpl()
    {
        orderItemTable = new HashMap<Integer, OrderItem>();
    }

    public static OrderItemRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new OrderItemRepositoryImpl();
        return repository;
    }

    public OrderItem create(OrderItem orderItem)
    {
        orderItemTable.put(orderItem.getQuantity(),orderItem);
        OrderItem dbOrderItem = orderItemTable.get(orderItem.getQuantity());
        return dbOrderItem;
    }

    public OrderItem read(int quantity)
    {
        OrderItem orderItem = orderItemTable.get(quantity);
        return orderItem;
    }

    public OrderItem update(OrderItem orderItem)
    {
        orderItemTable.put(orderItem.getQuantity(),orderItem);
        OrderItem dbOrderItem = orderItemTable.get(orderItem.getQuantity());
        return dbOrderItem;
    }

    public void delete (int quantity)
    {
        orderItemTable.remove(quantity);
    }
}
