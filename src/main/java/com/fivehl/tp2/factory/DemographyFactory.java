package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.Demography;

import java.util.Date;
import java.util.Map;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class DemographyFactory {

    public static Demography getDemography(Map<String, Object> values)
    {
        Demography factoryDemography = new Demography.Builder()
                .gender((String)values.get("gender"))
                .race((String)values.get("race"))
                .dateOfBirth((Date)values.get("dateOfBirth"))
                .build();
        return factoryDemography;
    }
}
