package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.model.LaptopCategory;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryLaptopCategoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("categoryName", "ASUS");
    }

    @Test
    public void getLaptopCategory() throws Exception {

        LaptopCategory laptopCategory = FactoryLaptopCategory.getLaptopCategory(values);
        assertEquals("ASUS", laptopCategory.getCategoryName());
    }

}