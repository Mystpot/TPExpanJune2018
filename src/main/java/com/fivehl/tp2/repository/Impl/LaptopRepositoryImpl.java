package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.repository.LaptopRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class LaptopRepositoryImpl implements LaptopRepository {

    private static LaptopRepositoryImpl repository = null;

    private Map<String, Laptop> laptopTable;

    private LaptopRepositoryImpl()
    {
        laptopTable = new HashMap<String, Laptop>();
    }

    public static LaptopRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new LaptopRepositoryImpl();
        return repository;
    }

    public Laptop create(Laptop laptop)
    {
        laptopTable.put(laptop.getLaptopName(),laptop);
        Laptop dbLaptop = laptopTable.get(laptop.getLaptopName());
        return dbLaptop;
    }

    public Laptop read(String laptopName)
    {
        Laptop laptop = laptopTable.get(laptopName);
        return laptop;
    }

    public ArrayList<Laptop> readAll()
    {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        for(Map.Entry<String, Laptop> entry : laptopTable.entrySet()) {
            Laptop value = entry.getValue();
            laptops.add(value);
        }
        return laptops;
    }

    public Laptop update(Laptop laptop)
    {
        laptopTable.put(laptop.getLaptopName(),laptop);
        Laptop dbLaptop = laptopTable.get(laptop.getLaptopName());
        return dbLaptop;
    }

    public void delete (String laptopName)
    {
        laptopTable.remove(laptopName);
    }
}
