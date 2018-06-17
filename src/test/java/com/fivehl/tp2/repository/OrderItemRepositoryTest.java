package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.FactoryOrder;
import com.fivehl.tp2.factory.FactoryOrderItem;
import com.fivehl.tp2.model.OrderItem;
import com.fivehl.tp2.repository.Impl.OrderItemRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class OrderItemRepositoryTest {
    Map<String, Object> values;
    OrderItemRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = OrderItemRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("quantity", 5);
    }

    @Test
    public void create() throws Exception {
        OrderItem orderItem = FactoryOrderItem.getOrderItem(values);
        repository.create(orderItem);
        assertEquals(5, orderItem.getQuantity());
    }

    @Test
    public void read() throws Exception {
        OrderItem readOrderItem = repository.read(5);
        assertEquals(5, readOrderItem.getQuantity());
    }

    @Test
    public void update() throws Exception {
        OrderItem orderItem = repository.read(5);
        OrderItem newOrderItem = new OrderItem.Builder()
                .quantity((int)values.get("quantity"))
                .build();
        repository.update(newOrderItem);
        OrderItem updateOrderItem = repository.read(5);
        assertEquals(5, updateOrderItem.getQuantity());

    }

    @Test
    public void delete() throws Exception {
        repository.delete(5);
        OrderItem orderItem = repository.read(5);
        assertNull(orderItem);
    }

}