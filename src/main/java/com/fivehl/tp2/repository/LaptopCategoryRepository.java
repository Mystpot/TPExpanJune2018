package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.LaptopCategory;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface LaptopCategoryRepository {

    LaptopCategory create(LaptopCategory laptopCategory);

    LaptopCategory read(String categoryName);

    LaptopCategory update(LaptopCategory laptopCategory);

    void delete(String categoryName);
}
