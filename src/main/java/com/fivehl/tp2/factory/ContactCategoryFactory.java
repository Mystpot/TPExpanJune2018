package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.ContactCategory;

import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class ContactCategoryFactory {
    public static ContactCategory getContactCategory(Map<String, Object> values)
    {
        ContactCategory factoryContactCategory = new ContactCategory.Builder()
                .categoryName((String)values.get("categoryName"))
                .build();
        return factoryContactCategory;
    }
}
