package com.fivehl.tp2.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class Demography implements Serializable {


    private String gender;
    private String race;
    private Date dateOfBirth;


    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }


    private Demography()
    {

    }

    private Demography(Builder builder)
    {
        this.gender = builder.gender;
        this.race = builder.race;
        this.dateOfBirth = builder.dateOfBirth;
    }


    public static class Builder {

        private String gender;
        private String race;
        private Date dateOfBirth;

        public Builder gender(String value)
        {
            this.gender = value;
            return this;
        }

        public Builder race(String value)
        {
            this.race = value;
            return this;
        }

        public Builder dateOfBirth(Date value)
        {
            this.dateOfBirth = value;
            return this;
        }

        public Demography build()
        {
            return new Demography(this);
        }
    }
}
