package com.fivehl.tp2.service;

import com.fivehl.tp2.factory.FactoryLaptop;
import com.fivehl.tp2.factory.FactoryTechSpec;
import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.model.TechSpec;
import com.fivehl.tp2.service.Impl.TechSpecServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TechSpecServiceTest {

    Map<String, Object> values;
    TechSpecService techSpecService;

    @Before
    public void setUp() throws Exception {

        techSpecService = new TechSpecServiceImpl();

        BigDecimal bigDecimal = new BigDecimal("100");
        values = new HashMap<String, Object>();
        values.put("laptopName", "Beast");
        values.put("unitPrice",  bigDecimal);
        TechSpec techSpec = FactoryTechSpec.getTechSpec(new HashMap<String, Object>(){
            {put("processor","Intel Core");
                put("operatingSystem","LOL");
                put("memory", "fun");
                put("storage", "alot");
            }
        });
        values.put("techSpec", techSpec);
    }


    @Test
    public void createLaptop() {

        Laptop laptop = FactoryLaptop.getLaptop(values);
        Laptop newLaptop = techSpecService.createLaptop(laptop);

        assertEquals(laptop.getLaptopName(), newLaptop.getLaptopName());
    }

    @Test
    public void getTechSpec() {

        Laptop laptop = FactoryLaptop.getLaptop(values);
        Laptop newLaptop = techSpecService.createLaptop(laptop);
        TechSpec techSpec = techSpecService.getTechSpec(newLaptop.getLaptopName());
        assertEquals("alot", techSpec.getStorage());
    }

}