package com.fivehl.tp2.service;

import com.fivehl.tp2.model.Laptop;
import com.fivehl.tp2.model.TechSpec;

public interface TechSpecService {

    Laptop createLaptop(Laptop laptop);

    TechSpec getTechSpec(String laptopName);
}
