package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.ContactCategory;
import com.fivehl.tp2.model.CustomerContact;

import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerContactFactory {

    public static CustomerContact getCustomerContact(Map<String, Object> values)
    {
        CustomerContact factoryCustomerContact = new CustomerContact.Builder()
                .contactDetails((String)values.get("contactDetails"))
                .contactCategory((ContactCategory)values.get("contactCategory"))
                .build();
        return factoryCustomerContact;
    }
}
