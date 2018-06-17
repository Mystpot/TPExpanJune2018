package com.fivehl.tp2.service;

import com.fivehl.tp2.factory.FactoryLaptop;
import com.fivehl.tp2.factory.FactoryTechSpec;
import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.model.TechSpec;
import com.fivehl.tp2.service.Impl.AllLaptopServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AllLaptopServiceTest {

    Map<String, Object> values;
    Map<String, Object> values2;

    AllLaptopService allLaptopService;

    @Before
    public void setUp() throws Exception {

        BigDecimal bigDecimal = new BigDecimal("100");
        allLaptopService = new AllLaptopServiceImpl();
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

        BigDecimal bigDecimal2 = new BigDecimal("200");
        allLaptopService = new AllLaptopServiceImpl();
        values2 = new HashMap<String, Object>();
        values2.put("laptopName", "Haha");
        values2.put("unitPrice",  bigDecimal2);
        TechSpec techSpec2 = FactoryTechSpec.getTechSpec(new HashMap<String, Object>(){
            {put("processor","Intel Core");
                put("operatingSystem","woop");
                put("memory", "yay");
                put("storage", "wooooo");
            }
        });
        values.put("techSpec", techSpec2);

    }

    @Test
    public void createLaptop() {

        Laptop laptop = FactoryLaptop.getLaptop(values);
        Laptop newLaptop = allLaptopService.createLaptop(laptop);

        assertEquals("Beast", newLaptop.getLaptopName());

        Laptop laptop2 = FactoryLaptop.getLaptop(values2);
        Laptop newLaptop2 = allLaptopService.createLaptop(laptop2);

        assertEquals("Haha", newLaptop2.getLaptopName());
    }

    @Test
    public void getAllLaptops() {

        Laptop laptop = FactoryLaptop.getLaptop(values);
        Laptop newLaptop = allLaptopService.createLaptop(laptop);

        Laptop laptop2 = FactoryLaptop.getLaptop(values2);
        Laptop newLaptop2 = allLaptopService.createLaptop(laptop2);

        ArrayList<Laptop> laptops = allLaptopService.getAllLaptops();
        assertEquals("Haha", laptops.get(0).getLaptopName());
        assertEquals("Beast", laptops.get(1).getLaptopName());


    }
}