package com.miltondev.course.services;

import java.util.List;
import java.util.Optional;

import com.miltondev.course.entities.Category;
import com.miltondev.course.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id){
            Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
