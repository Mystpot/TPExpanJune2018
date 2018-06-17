package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Customer;
import com.fivehl.tp2.model.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerFactory {

    public static Customer getCustomer(Map<String, Object> values)
    {
        Customer factoryCustomer = new Customer.Builder()
                .customerNumber((String)values.get("customerNumber"))
                .firstName((String)values.get("firstName"))
                .lastName((String)values.get("lastName"))
                .customerContact()
                .creditCard()
                .order((ArrayList<Order>)values.get("order"))
                .demography((String)values.get("gender"), (String)values.get("race"), (Date)values.get("dateOfBirth"))
                .build();
        return factoryCustomer;
    }
}
