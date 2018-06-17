package com.fivehl.tp2.model;

import java.io.Serializable;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CustomerContact implements Serializable{

    private String contactDetails;
    private ContactCategory contactCategory;


    public String getContactDetails() {
        return contactDetails;
    }


    public ContactCategory getContactCategory() {
        return contactCategory;
    }

    private CustomerContact()
    {

    }

    private CustomerContact(Builder builder)
    {
        this.contactDetails = builder.contactDetails;
        this.contactCategory = builder.contactCategory;
    }


    public static class Builder {

        private String contactDetails;
        private ContactCategory contactCategory;

        public Builder contactDetails(String value)
        {
            this.contactDetails = value;
            return this;
        }

        public Builder contactCategory(ContactCategory value)
        {
            this.contactCategory = value;
            return this;
        }
        public CustomerContact build()
        {
            return new CustomerContact(this);
        }
    }
}
