package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.TechSpec;

import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryTechSpec {

    public static TechSpec getTechSpec(Map<String, Object> values)
    {
        TechSpec factoryTechSpec = new TechSpec.Builder()
                .processor((String)values.get("processor"))
                .operatingSystem((String)values.get("operatingSystem"))
                .memory((String)values.get("memory"))
                .storage((String)values.get("storage"))
                .build();
        return factoryTechSpec;
    }
}
