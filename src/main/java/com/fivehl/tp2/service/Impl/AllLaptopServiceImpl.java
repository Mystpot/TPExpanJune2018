package com.fivehl.tp2.service.Impl;

import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.repository.Impl.LaptopRepositoryImpl;
import com.fivehl.tp2.repository.LaptopRepository;
import com.fivehl.tp2.service.AllLaptopService;

import java.util.ArrayList;

public class AllLaptopServiceImpl implements AllLaptopService {

    LaptopRepository laptopRepository = LaptopRepositoryImpl.getInstance();

    @Override
    public Laptop createLaptop(Laptop laptop) {

        return laptopRepository.create(laptop);
    }

    @Override
    public ArrayList<Laptop> getAllLaptops() {
        return laptopRepository.readAll();
    }
}
