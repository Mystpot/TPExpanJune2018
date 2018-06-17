package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.CreditCard;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface CreditCardRepository {

    CreditCard create(CreditCard creditCard);

    CreditCard read(String cardNumber);

    CreditCard update(CreditCard creditCard);

    void delete(String cardNumber);
}
