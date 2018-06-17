package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.ContactCategoryFactory;
import com.fivehl.tp2.model.ContactCategory;
import com.fivehl.tp2.repository.Impl.ContactCategoryRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class ContactCategoryRepositoryTest {

    Map<String, Object> values;
    ContactCategoryRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = ContactCategoryRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("categoryName", "Test");
    }

    @Test
    public void create() throws Exception {
        ContactCategory contactCategory = ContactCategoryFactory.getContactCategory(values);
        repository.create(contactCategory);
        assertEquals("Test", contactCategory.getCategoryName());
    }

    @Test
    public void read() throws Exception {
        ContactCategory readContactCategory = repository.read("Test");
        assertEquals("Test", readContactCategory.getCategoryName());
    }

    @Test
    public void update() throws Exception {
        ContactCategory contactCategory = repository.read("Test");
        ContactCategory newContactCategory = new ContactCategory.Builder()
                .categoryName((String)values.get("categoryName"))
                .build();
        repository.update(newContactCategory);
        ContactCategory updateContactCategory = repository.read("Test");
        assertEquals("Test", updateContactCategory.getCategoryName());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("Test");
        ContactCategory contactCategory = repository.read("Test");
        assertNull(contactCategory);
    }

}