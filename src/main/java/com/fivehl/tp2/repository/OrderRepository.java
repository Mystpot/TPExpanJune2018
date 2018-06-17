package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.Order;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface OrderRepository {

    Order create(Order order);

    Order read(int orderNumber);

    Order update(Order order);

    void delete(int orderNumber);
}
