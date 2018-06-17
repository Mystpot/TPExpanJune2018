package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.CustomerFactory;
import com.fivehl.tp2.model.Customer;
import com.fivehl.tp2.repository.Impl.CustomerRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerRepositoryTest {
    Map<String, Object> values;
    CustomerRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = CustomerRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("customerNumber", "1234");
    }

    @Test
    public void create() throws Exception {
        Customer customer = CustomerFactory.getCustomer(values);
        repository.create(customer);
        assertEquals("1234", customer.getCustomerNumber());
    }

    @Test
    public void read() throws Exception {
        Customer readCustomer = repository.read("1234");
        assertEquals("1234", readCustomer.getCustomerNumber());
    }

    @Test
    public void update() throws Exception {
        Customer customer = repository.read("1234");
        Customer newCustomer = new Customer.Builder()
                .customerNumber((String)values.get("customerNumber"))
                .firstName((String)values.get("firstName"))
                .lastName((String)values.get("lastName"))
                .build();
        repository.update(newCustomer);
        Customer updateCustomer = repository.read("1234");
        assertEquals("1234", updateCustomer.getCustomerNumber());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("1234");
        Customer customer = repository.read("1234");
        assertNull(customer);
    }
}