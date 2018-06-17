package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.CreditCard;
import com.fivehl.tp2.repository.CreditCardRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CreditCardRepositoryImpl implements CreditCardRepository {

    private static CreditCardRepositoryImpl repository = null;

    private Map<String, CreditCard> creditCardTable;

    private CreditCardRepositoryImpl()
    {
        creditCardTable = new HashMap<String, CreditCard>();
    }

    public static CreditCardRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new CreditCardRepositoryImpl();
        return repository;
    }

    public CreditCard create(CreditCard creditCard)
    {
        creditCardTable.put(creditCard.getCardNumber(),creditCard);
        CreditCard dbCreditCard = creditCardTable.get(creditCard.getCardNumber());
        return dbCreditCard;
    }

    public CreditCard read(String cardNumber)
    {
        CreditCard contactCategory = creditCardTable.get(cardNumber);
        return contactCategory;
    }

    public CreditCard update(CreditCard creditCard)
    {
        creditCardTable.put(creditCard.getCardNumber(),creditCard);
        CreditCard dbCreditCard = creditCardTable.get(creditCard.getCardNumber());
        return dbCreditCard;
    }

    public void delete (String cardNumber)
    {
        creditCardTable.remove(cardNumber);
    }
}
