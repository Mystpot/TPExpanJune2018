package com.fivehl.tp2.model;

import com.fivehl.tp2.factory.DemographyFactory;

import java.io.Serializable;
import java.util.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class Customer implements Serializable   {

    private String customerNumber;
    private String firstName;
    private String lastName;
    private ArrayList<CustomerContact> customerContact;
    private ArrayList<CreditCard> creditCard;
    private ArrayList<Order> order;
    private Demography demography;


    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<CustomerContact> getCustomerContact() {
        return customerContact;
    }

    public ArrayList<CreditCard> getCreditCard() {
        return creditCard;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public Demography getDemography() {
        return demography;
    }


    private Customer()
    {

    }

    private Customer(Builder builder)
    {
        this.customerNumber = builder.customerNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.customerContact = builder.customerContact;
        this.creditCard = builder.creditCard;
        this.order = builder.order;
        this.demography = builder.demography;
    }

    public static class Builder {

        private String customerNumber;
        private String firstName;
        private String lastName;
        private ArrayList<CustomerContact> customerContact;
        private ArrayList<CreditCard> creditCard;
        private ArrayList<Order> order;
        private Demography demography;

        public Builder customerNumber(String value)
        {
            this.customerNumber = value;
            return this;
        }

        public Builder firstName(String value)
        {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value)
        {
            this.lastName = value;
            return this;
        }

        public Builder customerContact(){

            this.customerContact = new ArrayList<CustomerContact>() ;
            return this;
        }

        public Builder creditCard() {
            this.creditCard = new ArrayList<CreditCard>();
            return this;
        }

        public Builder order(ArrayList<Order> value) {
            this.order = new ArrayList<Order>();
            for (Order o:value) {
                this.order.add(o);
            }
            return this;
        }

        public Builder demography(String gender, String race, Date dateOfBirth)
        {
            Map<String, Object> values = new HashMap<String, Object>();
            values.put("gender", gender);
            values.put("race", race);
            values.put("dateOfBirth", dateOfBirth);

            this.demography = DemographyFactory.getDemography(values);
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }


    }
}
