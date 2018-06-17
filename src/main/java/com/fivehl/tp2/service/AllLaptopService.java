package com.fivehl.tp2.service;

import com.fivehl.tp2.model.Laptop;

import java.util.ArrayList;

public interface AllLaptopService {

    Laptop createLaptop(Laptop laptop);

    ArrayList<Laptop> getAllLaptops();
}
