package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.OrderItem;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface OrderItemRepository {

    OrderItem create(OrderItem orderItem);

    OrderItem read(int quantity);

    OrderItem update(OrderItem orderItem);

    void delete(int quantity);
}
