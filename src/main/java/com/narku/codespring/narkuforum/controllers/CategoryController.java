package com.narku.codespring.narkuforum.controllers;

import com.narku.codespring.narkuforum.models.Category;
import com.narku.codespring.narkuforum.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/all")
    public List<Category> categories(){
        return categoryRepo.findAll();
    }

    @PostMapping("/add")
    public Category save(@RequestBody Category category)
    {
        categoryRepo.save(category);
        return category;
    }

    @GetMapping("/get/{id}")
    public Optional<Category> show(@PathVariable String id)
    {
        return categoryRepo.findById(id);
    }

    @PutMapping("/update/{id}")
    public Category update(@PathVariable String id, @RequestBody Category category)
    {
        Optional<Category> optCategory = categoryRepo.findById(id);
        Category cat = optCategory.get();
        if(category.getName() != null)
            cat.setName(category.getName());
        if(category.getPosts() != 0)
            cat.setPosts(category.getPosts());
        if(category.getTopics() != 0)
            cat.setTopics(category.getTopics());
        if(category.getLastUpdated() != null)
            cat.setLastUpdated(category.getLastUpdated());
        if(category.getOwner() != null)
            cat.setOwner(category.getOwner());
        categoryRepo.save(cat);
        return cat;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id)
    {
        Optional<Category> optCategory = categoryRepo.findById(id);
        Category cat = optCategory.get();
        categoryRepo.delete(cat);
    }

}
