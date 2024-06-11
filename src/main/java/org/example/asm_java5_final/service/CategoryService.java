package org.example.asm_java5_final.service;

import org.example.asm_java5_final.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    boolean existsById(String id);

    Category findById(String id);

    List<Category> findByName(String kw);

    Category save(Category cate);

    void deleteById(String id);

}
