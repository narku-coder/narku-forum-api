package com.narku.codespring.narkuforum.services;

import com.narku.codespring.narkuforum.models.Category;
import com.narku.codespring.narkuforum.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    public List<Category> categoryList()
    {
        return categoryRepo.findAll();
    }

    public Optional<Category> category(String id)
    {
        return categoryRepo.findById(id);
    }

    public Category saveCategory(Category category)
    {
        return categoryRepo.save(category);
    }

    public void deleteCategory(String id)
    {
        categoryRepo.deleteById(id);
    }
}
