package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.Customer;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface CustomerRepository {

    Customer create(Customer customer);

    Customer read(String customerNumber);

    Customer update(Customer customer);

    void delete(String customerNumber);
}
