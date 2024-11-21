package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Category;
import com.example.LibraryManagementSystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category getCategory(Long id){
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category Not Found"));
    }

    public void saveCategory(Category category){
        categoryRepository.save(category);
    }

    public void updateCategory(Category category){
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }


}
