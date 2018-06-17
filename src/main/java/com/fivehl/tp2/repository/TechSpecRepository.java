package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.TechSpec;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface TechSpecRepository {

    TechSpec create(TechSpec techSpec);

    TechSpec read(String processor);

    TechSpec update(TechSpec techSpec);

    void delete(String processor);
}
