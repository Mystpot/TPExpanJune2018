package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.model.LaptopCategory;
import com.fivehl.tp2.model.TechSpec;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryLaptop {

    public static Laptop getLaptop(Map<String, Object> values)
    {
        Laptop factoryLaptop = new Laptop.Builder()
                .laptopName((String)values.get("laptopName"))
                .unitPrice((BigDecimal) values.get("unitPrice"))
                .laptopCategory((LaptopCategory)values.get("laptopCategory"))
                .techSpec((TechSpec)values.get("techSpec"))
                .build();
        return factoryLaptop;
    }
}
