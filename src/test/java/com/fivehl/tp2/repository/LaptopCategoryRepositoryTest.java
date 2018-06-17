package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.FactoryLaptopCategory;
import com.fivehl.tp2.model.LaptopCategory;
import com.fivehl.tp2.repository.Impl.LaptopCategoryRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class LaptopCategoryRepositoryTest {
    Map<String, Object> values;
    LaptopCategoryRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = LaptopCategoryRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("categoryName", "Test");
    }

    @Test
    public void create() throws Exception {
        LaptopCategory laptopCategory = FactoryLaptopCategory.getLaptopCategory(values);
        repository.create(laptopCategory);
        assertEquals("Test", laptopCategory.getCategoryName());
    }

    @Test
    public void read() throws Exception {
        LaptopCategory readLaptopCategory = repository.read("Test");
        assertEquals("Test", readLaptopCategory.getCategoryName());
    }

    @Test
    public void update() throws Exception {
        LaptopCategory laptopCategory = repository.read("Test");
        LaptopCategory newLaptopCategory = new LaptopCategory.Builder()
                .categoryName((String)values.get("categoryName"))
                .build();
        repository.update(newLaptopCategory);
        LaptopCategory updateLaptopCategory = repository.read("Test");
        assertEquals("Test", updateLaptopCategory.getCategoryName());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("Test");
        LaptopCategory laptopCategory = repository.read("Test");
        assertNull(laptopCategory);
    }

}