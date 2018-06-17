package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.CustomerContact;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface CustomerContactRepository {

    CustomerContact create(CustomerContact customer);

    CustomerContact read(String contactDetails);

    CustomerContact update(CustomerContact customer);

    void delete(String contactDetails);
}
