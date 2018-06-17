package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.Customer;
import com.fivehl.tp2.repository.CustomerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerRepositoryImpl implements CustomerRepository{

    private static CustomerRepositoryImpl repository = null;

    private Map<String, Customer> customerTable;

    private CustomerRepositoryImpl()
    {
        customerTable = new HashMap<String, Customer>();
    }

    public static CustomerRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new CustomerRepositoryImpl();
        return repository;
    }

    public Customer create(Customer customer)
    {
        customerTable.put(customer.getCustomerNumber(),customer);
        Customer dbCustomer = customerTable.get(customer.getCustomerNumber());
        return dbCustomer;
    }

    public Customer read(String customerNumber)
    {
        Customer customer = customerTable.get(customerNumber);
        return customer;
    }

    public Customer update(Customer customer)
    {
        customerTable.put(customer.getCustomerNumber(),customer);
        Customer dbCustomer = customerTable.get(customer.getCustomerNumber());
        return dbCustomer;
    }

    public void delete (String customerNumber)
    {
        customerTable.remove(customerNumber);
    }
}
