package com.fivehl.tp2.repository;

import com.fivehl.tp2.model.ContactCategory;

/**
 * Created by 213018500 on 6/1/2018.
 */
public interface ContactCategoryRepository {

    ContactCategory create(ContactCategory contactCategory);

    ContactCategory read(String categoryName);

    ContactCategory update(ContactCategory contactCategory);

    void delete(String categoryName);
}
