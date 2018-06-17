package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.FactoryOrder;
import com.fivehl.tp2.model.Order;
import com.fivehl.tp2.repository.Impl.OrderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class OrderRepositoryTest {
    Map<String, Object> values;
    OrderRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = OrderRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("orderNumber", 1234);
    }

    @Test
    public void create() throws Exception {
        Order order = FactoryOrder.getOrder(values);
        repository.create(order);
        assertEquals(1234, order.getOrderNumber());
    }

    @Test
    public void read() throws Exception {
        Order readOrder = repository.read(1234);
        assertEquals(1234, readOrder.getOrderNumber());
    }

    @Test
    public void update() throws Exception {
        Order order = repository.read(1234);
        Order newOrder = new Order.Builder()
                .orderNumber((int)values.get("orderNumber"))
                .orderDate((Date)values.get("orderDate"))
                .build();
        repository.update(newOrder);
        Order updateOrder = repository.read(1234);
        assertEquals(1234, updateOrder.getOrderNumber());

    }

    @Test
    public void delete() throws Exception {
        repository.delete(1234);
        Order order = repository.read(1234);
        assertNull(order);
    }

}