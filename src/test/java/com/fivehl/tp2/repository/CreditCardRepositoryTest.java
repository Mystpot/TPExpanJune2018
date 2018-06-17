package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.CreditCardFactory;
import com.fivehl.tp2.model.CreditCard;
import com.fivehl.tp2.repository.Impl.CreditCardRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class CreditCardRepositoryTest {
    Map<String, Object> values;
    CreditCardRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = CreditCardRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("cardNumber", "1234");
    }

    @Test
    public void create() throws Exception {
        CreditCard creditCard = CreditCardFactory.getCreditCard(values);
        repository.create(creditCard);
        assertEquals("1234", creditCard.getCardNumber());
    }

    @Test
    public void read() throws Exception {
        CreditCard readCreditCard = repository.read("1234");
        assertEquals("1234", readCreditCard.getCardNumber());
    }

    @Test
    public void update() throws Exception {
        CreditCard creditCard = repository.read("1234");
        CreditCard newCreditCard = new CreditCard.Builder()
                .cardNumber((String)values.get("cardNumber"))
                .nameOnCard((String)values.get("nameOnCard"))
                .expiryDate((Date)values.get("expiryDate"))
                .build();
        repository.update(newCreditCard);
        CreditCard updateCreditCard = repository.read("1234");
        assertEquals("1234", updateCreditCard.getCardNumber());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("1234");
        CreditCard creditCard = repository.read("1234");
        assertNull(creditCard);
    }

}