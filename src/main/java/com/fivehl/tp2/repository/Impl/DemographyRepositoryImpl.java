package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.Demography;
import com.fivehl.tp2.repository.DemographyRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class DemographyRepositoryImpl implements DemographyRepository {

    private static DemographyRepositoryImpl repository = null;

    private Map<String, Demography> demographyTable;

    private DemographyRepositoryImpl()
    {
        demographyTable = new HashMap<String, Demography>();
    }

    public static DemographyRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new DemographyRepositoryImpl();
        return repository;
    }

    public Demography create(Demography demography)
    {
        demographyTable.put(demography.getGender(),demography);
        Demography dbDemography = demographyTable.get(demography.getGender());
        return dbDemography;
    }

    public Demography read(String gender)
    {
        Demography demography = demographyTable.get(gender);
        return demography;
    }

    public Demography update(Demography demography)
    {
        demographyTable.put(demography.getGender(),demography);
        Demography dbDemography = demographyTable.get(demography.getGender());
        return dbDemography;
    }

    public void delete (String gender)
    {
        demographyTable.remove(gender);
    }
}
