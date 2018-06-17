package com.fivehl.tp2.model;

import java.io.Serializable;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class TechSpec implements Serializable {

    private String processor;
    private String operatingSystem;
    private String memory;
    private String storage;


    public String getProcessor() {
        return processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getMemory() {
        return memory;
    }

    public String getStorage() {
        return storage;
    }



    private TechSpec()
    {

    }

    private TechSpec(Builder builder)
    {
        this.processor = builder.processor;
        this.operatingSystem = builder.operatingSystem;
        this.memory = builder.memory;
        this.storage = builder.storage;
    }



    public static class Builder {

        private String processor;
        private String operatingSystem;
        private String memory;
        private String storage;

        public Builder processor(String value)
        {
            this.processor = value;
            return this;
        }

        public Builder operatingSystem(String value)
        {
            this.operatingSystem = value;
            return this;
        }

        public Builder memory(String value)
        {
            this.memory = value;
            return this;
        }

        public Builder storage(String value)
        {
            this.storage = value;
            return this;
        }

        public TechSpec build()
        {
            return new TechSpec(this);
        }
    }
}
