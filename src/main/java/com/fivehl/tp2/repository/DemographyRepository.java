package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.Demography;

import java.util.Date;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface DemographyRepository {

    Demography create(Demography demography);

    Demography read(String gender);

    Demography update(Demography demography);

    void delete(String gender);
}
