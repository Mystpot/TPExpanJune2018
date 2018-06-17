package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.ContactCategory;
import com.fivehl.tp2.repository.ContactCategoryRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class ContactCategoryRepositoryImpl implements ContactCategoryRepository {

    private static ContactCategoryRepositoryImpl repository = null;

    private Map<String, ContactCategory> contactCategoryTable;

    private ContactCategoryRepositoryImpl()
    {
        contactCategoryTable = new HashMap<String, ContactCategory>();
    }

    public static ContactCategoryRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new ContactCategoryRepositoryImpl();
        return repository;
    }

    public ContactCategory create(ContactCategory contactCategory)
    {
        contactCategoryTable.put(contactCategory.getCategoryName(),contactCategory);
        ContactCategory dbContactCategory = contactCategoryTable.get(contactCategory.getCategoryName());
        return dbContactCategory;
    }

    public ContactCategory read(String categoryName)
    {
        ContactCategory contactCategory = contactCategoryTable.get(categoryName);
        return contactCategory;
    }

    public ContactCategory update(ContactCategory contactCategory)
    {
        contactCategoryTable.put(contactCategory.getCategoryName(),contactCategory);
        ContactCategory dbContactCategory = contactCategoryTable.get(contactCategory.getCategoryName());
        return dbContactCategory;
    }

    public void delete (String categoryName)
    {
        contactCategoryTable.remove(categoryName);
    }
}
