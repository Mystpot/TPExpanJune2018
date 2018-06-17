package com.fivehl.tp2.service.Impl;

import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.model.TechSpec;
import com.fivehl.tp2.repository.Impl.LaptopRepositoryImpl;
import com.fivehl.tp2.repository.LaptopRepository;
import com.fivehl.tp2.service.TechSpecService;

public class TechSpecServiceImpl implements TechSpecService{

    LaptopRepository laptopRepository = LaptopRepositoryImpl.getInstance();

    public Laptop createLaptop(Laptop laptop)
    {
        return laptopRepository.create(laptop);
    }

    @Override
    public TechSpec getTechSpec(String laptopName) {
        return laptopRepository.read(laptopName).getTechSpec();
    }
}
