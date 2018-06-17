package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.CustomerContactFactory;
import com.fivehl.tp2.model.CustomerContact;
import com.fivehl.tp2.repository.Impl.CustomerContactRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerContactRepositoryTest {
    Map<String, Object> values;
    CustomerContactRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = CustomerContactRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("contactDetails", "11223344");
    }

    @Test
    public void create() throws Exception {
        CustomerContact customerContact = CustomerContactFactory.getCustomerContact(values);
        repository.create(customerContact);
        assertEquals("11223344", customerContact.getContactDetails());
    }

    @Test
    public void read() throws Exception {
        CustomerContact readCustomerContact = repository.read("11223344");
        assertEquals("11223344", readCustomerContact.getContactDetails());
    }

    @Test
    public void update() throws Exception {
        CustomerContact customerContact = repository.read("1123344");
        CustomerContact newCustomerContact = new CustomerContact.Builder()
                .contactDetails((String)values.get("contactDetails"))
                .build();
        repository.update(newCustomerContact);
        CustomerContact updateCustomerContact = repository.read("11223344");
        assertEquals("11223344", updateCustomerContact.getContactDetails());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("11223344");
        CustomerContact customerContact = repository.read("11223344");
        assertNull(customerContact);
    }
}