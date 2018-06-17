package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.ContactCategory;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class ContactCategoryFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        values.put("categoryName", "Testee");
    }

    @Test
    public void getContactCategory() throws Exception {

        ContactCategory contactCategory = ContactCategoryFactory.getContactCategory(values);
        assertEquals("Testee", contactCategory.getCategoryName());
    }

}