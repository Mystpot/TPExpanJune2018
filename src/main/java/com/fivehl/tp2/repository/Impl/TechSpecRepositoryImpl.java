package com.fivehl.tp2.repository.Impl;

import com.fivehl.tp2.model.TechSpec;
import com.fivehl.tp2.repository.TechSpecRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class TechSpecRepositoryImpl implements TechSpecRepository {

    private static TechSpecRepositoryImpl repository = null;

    private Map<String, TechSpec> techSpecTable;

    private TechSpecRepositoryImpl()
    {
        techSpecTable = new HashMap<String, TechSpec>();
    }

    public static TechSpecRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new TechSpecRepositoryImpl();
        return repository;
    }

    public TechSpec create(TechSpec techSpec)
    {
        techSpecTable.put(techSpec.getProcessor(),techSpec);
        TechSpec dbTechSpec = techSpecTable.get(techSpec.getProcessor());
        return dbTechSpec;
    }

    public TechSpec read(String processor)
    {
        TechSpec techSpec = techSpecTable.get(processor);
        return techSpec;
    }

    public TechSpec update(TechSpec techSpec)
    {
        techSpecTable.put(techSpec.getProcessor(),techSpec);
        TechSpec dbTechSpec = techSpecTable.get(techSpec.getProcessor());
        return dbTechSpec;
    }

    public void delete (String processor)
    {
        techSpecTable.remove(processor);
    }
}
