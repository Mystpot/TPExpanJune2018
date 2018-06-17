package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.CustomerContact;
import com.fivehl.tp2.repository.CustomerContactRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerContactRepositoryImpl implements CustomerContactRepository {

    private static CustomerContactRepositoryImpl repository = null;

    private Map<String, CustomerContact> customerContactTable;

    private CustomerContactRepositoryImpl()
    {
        customerContactTable = new HashMap<String, CustomerContact>();
    }

    public static CustomerContactRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new CustomerContactRepositoryImpl();
        return repository;
    }

    public CustomerContact create(CustomerContact customerContact)
    {
        customerContactTable.put(customerContact.getContactDetails(),customerContact);
        CustomerContact dbCustomerContact = customerContactTable.get(customerContact.getContactDetails());
        return dbCustomerContact;
    }

    public CustomerContact read(String contactDetails)
    {
        CustomerContact customerContact = customerContactTable.get(contactDetails);
        return customerContact;
    }

    public CustomerContact update(CustomerContact customerContact)
    {
        customerContactTable.put(customerContact.getContactDetails(),customerContact);
        CustomerContact dbCustomerContact = customerContactTable.get(customerContact.getContactDetails());
        return dbCustomerContact;
    }

    public void delete (String contactDetails)
    {
        customerContactTable.remove(contactDetails);
    }
}
