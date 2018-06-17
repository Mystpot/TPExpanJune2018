package com.fivehl.tp2.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CreditCard implements Serializable {

    private String cardNumber;
    private String nameOnCard;
    private Date expiryDate;


    public String getCardNumber() {
        return cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }


    private CreditCard()
    {

    }

    private CreditCard(Builder builder)
    {
        this.cardNumber = builder.cardNumber;
        this.nameOnCard = builder.nameOnCard;
        this.expiryDate = builder.expiryDate;
    }



    public static class Builder {

        private String cardNumber;
        private String nameOnCard;
        private Date expiryDate;

        public Builder cardNumber(String value)
        {
            this.cardNumber = value;
            return this;
        }

        public Builder nameOnCard(String value)
        {
            this.nameOnCard = value;
            return this;
        }

        public Builder expiryDate(Date value)
        {
            this.expiryDate = value;
            return this;
        }

        public CreditCard build()
        {
            return new CreditCard(this);
        }
    }
}
