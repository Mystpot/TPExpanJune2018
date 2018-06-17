package com.fivehl.tp2.factory;

import com.fivehl.tp2.model.TechSpec;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class FactoryTechSpecTest {
    Map<String, Object> values;


    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("processor", "Fast");
        values.put("operatingSystem", "Nice");
        values.put("memory","Best");
        values.put("storage", "Great");
    }

    @Test
    public void getTechSpec() throws Exception {

        TechSpec techSpec = FactoryTechSpec.getTechSpec(values);
        assertEquals("Great", techSpec.getStorage());
    }

}