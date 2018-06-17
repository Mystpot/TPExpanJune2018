package com.fivehl.tp2.model;

import java.io.Serializable;

/**
 * Created by 213018500 on 6/1/2018.
 */
public class ContactCategory implements Serializable {

    private String categoryName;


    public String getCategoryName() {
        return categoryName;
    }

    private ContactCategory()
    {

    }

    private ContactCategory(Builder builder)
    {
        this.categoryName = builder.categoryName;
    }

    public static class Builder {

        private String categoryName;

        public Builder categoryName(String value)
        {
            this.categoryName = value;
            return this;
        }

        public ContactCategory build()
        {
            return new ContactCategory(this);
        }
    }
}
