package com.fivehl.tp2.repository;

import com.fivehl.tp2.factory.DemographyFactory;
import com.fivehl.tp2.model.Demography;
import com.fivehl.tp2.repository.Impl.DemographyRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class DemographyRepositoryTest {
    Map<String, Object> values;
    DemographyRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = DemographyRepositoryImpl.getInstance();
        values = new HashMap<String, Object>();
        values.put("gender", "Male");
    }

    @Test
    public void create() throws Exception {
        Demography demography = DemographyFactory.getDemography(values);
        repository.create(demography);
        assertEquals("Male", demography.getGender());
    }

    @Test
    public void read() throws Exception {
        Demography readDemography = repository.read("Male");
        assertEquals("Male", readDemography.getGender());
    }

    @Test
    public void update() throws Exception {
        Demography demography = repository.read("Male");
        Demography newDemography = new Demography.Builder()
                .gender((String)values.get("gender"))
                .race((String)values.get("race"))
                .dateOfBirth((Date)values.get("dateOfBirth"))
                .build();
        repository.update(newDemography);
        Demography updateDemography = repository.read("Male");
        assertEquals("Male", updateDemography.getGender());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("Male");
        Demography demography = repository.read("Male");
        assertNull(demography);
    }

}