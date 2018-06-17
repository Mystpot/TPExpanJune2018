package com.fivehl.tp2.service.Impl;

import com.fivehl.tp2.model.Customer;
import com.fivehl.tp2.model.Order;
import com.fivehl.tp2.repository.CustomerRepository;
import com.fivehl.tp2.repository.Impl.CustomerRepositoryImpl;
import com.fivehl.tp2.service.CustomerOrderService;

import java.util.ArrayList;

public class CustomerOrderServiceImpl implements CustomerOrderService {

    CustomerRepository customerRepository  = CustomerRepositoryImpl.getInstance();

    public Customer createCustomer(Customer customer)
    {
        return customerRepository.create(customer);
    }

    @Override
    public ArrayList<Order> getCustomerOrder(String customerNumber) {
        Customer c = customerRepository.read(customerNumber);
        return c.getOrder();
    }
}
