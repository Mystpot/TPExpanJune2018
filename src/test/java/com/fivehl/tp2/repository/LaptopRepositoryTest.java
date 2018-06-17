package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.FactoryLaptop;
import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.repository.Impl.LaptopRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class LaptopRepositoryTest {
    Map<String, Object> values;
    LaptopRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = LaptopRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("laptopName", "Beast");
    }

    @Test
    public void create() throws Exception {
        Laptop laptop = FactoryLaptop.getLaptop(values);
        repository.create(laptop);
        assertEquals("Beast", laptop.getLaptopName());
    }

    @Test
    public void read() throws Exception {
        Laptop readLaptop = repository.read("Beast");
        assertEquals("Beast", readLaptop.getLaptopName());
    }

    @Test
    public void update() throws Exception {
        Laptop laptop = repository.read("Beast");
        Laptop newLaptop = new Laptop.Builder()
                .laptopName((String)values.get("laptopName"))
                .unitPrice((BigDecimal) values.get("unitPrice"))
                .build();
        repository.update(newLaptop);
        Laptop updateLaptop = repository.read("Beast");
        assertEquals("Beast", updateLaptop.getLaptopName());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("Beast");
        Laptop laptop = repository.read("Beast");
        assertNull(laptop);
    }
}