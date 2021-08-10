package com.narku.codespring.narkuforum.repositories;

import com.narku.codespring.narkuforum.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepo extends MongoRepository<Category, String> {
    @Override
    void delete(Category delCategory);
}
