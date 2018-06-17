package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.CreditCard;

import java.util.Date;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CreditCardFactory {

    public static CreditCard getCreditCard(Map<String, Object> values)
    {
        CreditCard factoryCreditCard = new CreditCard.Builder()
                .cardNumber((String)values.get("cardNumber"))
                .nameOnCard((String)values.get("nameOnCard"))
                .expiryDate((Date)values.get("expiryDate"))
                .build();
        return factoryCreditCard;

    }
}
