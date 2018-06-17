package com.fivehl.tp2.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class Laptop implements Serializable {

    private String laptopName;
    private BigDecimal unitPrice;
    private LaptopCategory laptopCategory;
    private TechSpec techSpec;


    public String getLaptopName() {
        return laptopName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public LaptopCategory getLaptopCategory() { return laptopCategory; }

    public TechSpec getTechSpec() { return techSpec; }


    private Laptop()
    {

    }

    private Laptop(Builder builder)
    {
        this.laptopName = builder.laptopName;
        this.unitPrice = builder.unitPrice;
        this.laptopCategory = builder.laptopCategory;
        this.techSpec = builder.techSpec;
    }



    public static class Builder {

        private String laptopName;
        private BigDecimal unitPrice;
        private LaptopCategory laptopCategory;
        private TechSpec techSpec;

        public Builder laptopName(String value)
        {
            this.laptopName = value;
            return this;
        }

        public Builder unitPrice(BigDecimal value)
        {
            this.unitPrice = value;
            return this;
        }

        public Builder laptopCategory(LaptopCategory value)
        {
            this.laptopCategory = value;
            return this;
        }

        public Builder techSpec(TechSpec value)
        {
            this.techSpec = value;
            return this;
        }

        public Laptop build()
        {
            return new Laptop(this);
        }
    }
}
