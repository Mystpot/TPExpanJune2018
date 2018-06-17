package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.Laptop;

import java.util.ArrayList;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface LaptopRepository {

    Laptop create(Laptop laptop);

    Laptop read(String laptopName);

    Laptop update(Laptop laptop);

    ArrayList<Laptop> readAll();

    void delete(String laptopName);
}
