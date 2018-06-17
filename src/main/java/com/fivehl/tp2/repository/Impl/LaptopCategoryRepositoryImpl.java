package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.LaptopCategory;
import com.fivehl.tp2.repository.LaptopCategoryRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class LaptopCategoryRepositoryImpl implements LaptopCategoryRepository {

    private static LaptopCategoryRepositoryImpl repository = null;

    private Map<String, LaptopCategory> laptopCategoryTable;

    private LaptopCategoryRepositoryImpl()
    {
        laptopCategoryTable = new HashMap<String, LaptopCategory>();
    }

    public static LaptopCategoryRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new LaptopCategoryRepositoryImpl();
        return repository;
    }

    public LaptopCategory create(LaptopCategory laptopCategory)
    {
        laptopCategoryTable.put(laptopCategory.getCategoryName(),laptopCategory);
        LaptopCategory dbLaptopCategory = laptopCategoryTable.get(laptopCategory.getCategoryName());
        return dbLaptopCategory;
    }

    public LaptopCategory read(String categoryName)
    {
        LaptopCategory laptopCategory = laptopCategoryTable.get(categoryName);
        return laptopCategory;
    }

    public LaptopCategory update(LaptopCategory laptopCategory)
    {
        laptopCategoryTable.put(laptopCategory.getCategoryName(),laptopCategory);
        LaptopCategory dbLaptopCategory = laptopCategoryTable.get(laptopCategory.getCategoryName());
        return dbLaptopCategory;
    }

    public void delete (String categoryName)
    {
        laptopCategoryTable.remove(categoryName);
    }


}
