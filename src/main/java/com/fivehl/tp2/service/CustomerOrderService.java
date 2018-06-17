package com.fivehl.tp2.service;

import com.fivehl.tp2.model.Customer;
import com.fivehl.tp2.model.Order;

import java.util.ArrayList;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface CustomerOrderService {
    Customer createCustomer(Customer customer);
    ArrayList<Order> getCustomerOrder(String customerNumber);
}
