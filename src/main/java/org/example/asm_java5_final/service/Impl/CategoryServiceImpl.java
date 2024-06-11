package org.example.asm_java5_final.service.Impl;

import org.example.asm_java5_final.entity.Category;
import org.example.asm_java5_final.repository.CategoryRepo;
import org.example.asm_java5_final.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo cRepo;

    @Override
    public List<Category> findAll() {
        return cRepo.findAll();
    }

    @Override
    public boolean existsById(String id) {
        return cRepo.existsById(id);
    }

    @Override
    public Category findById(String id) {
        return cRepo.findById(id).get();
    }

    @Override
    public List<Category> findByName(String kw) {
        return cRepo.findByName(kw);
    }

    @Override
    public Category save(Category cate) {
        return cRepo.save(cate);
    }

    @Override
    public void deleteById(String id) {
        cRepo.deleteById(id);
    }
}
