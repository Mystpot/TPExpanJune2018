package com.fivehl.tp2.service;

import com.fivehl.tp2.factory.CustomerFactory;
import com.fivehl.tp2.factory.FactoryOrder;
import com.fivehl.tp2.model.Customer;
import com.fivehl.tp2.model.Order;
import com.fivehl.tp2.repository.CustomerRepository;
import com.fivehl.tp2.repository.Impl.CustomerRepositoryImpl;
import com.fivehl.tp2.service.Impl.CustomerOrderServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerOrderServiceTest {
    Map<String, Object> values;
    CustomerOrderService customerOrderService;

    @org.junit.Before
    public void setUp() throws Exception {
        customerOrderService = new CustomerOrderServiceImpl();
    }

    @org.junit.Test
    public void getCustomerOrder() {
        ArrayList<Order> orders = new ArrayList<Order>();
        Order mySpecialOrder = FactoryOrder.getOrder(new HashMap<String, Object>() {{ put("orderNumber",10);}});
        orders.add(mySpecialOrder);

        values = new HashMap<String, Object>();
        values.put("customerNumber", "1234");
        values.put("order", orders);

        Customer customer = CustomerFactory.getCustomer(values);
        customerOrderService.createCustomer(customer);
        ArrayList<Order> custO =  customerOrderService.getCustomerOrder("1234");

        assertEquals(10, custO.get(0).getOrderNumber());

    }
}