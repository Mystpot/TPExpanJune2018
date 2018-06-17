package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.LaptopCategory;

import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryLaptopCategory {

    public static LaptopCategory getLaptopCategory(Map<String, Object> values)
    {
        LaptopCategory factoryLaptopCategory = new LaptopCategory.Builder()
                .categoryName((String)values.get("categoryName"))
                .build();
        return factoryLaptopCategory;
    }
}
