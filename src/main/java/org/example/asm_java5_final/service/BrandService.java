package org.example.asm_java5_final.service;

import org.example.asm_java5_final.entity.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> findAll();

    Brand findById(String id);

    boolean existsById(String id);

    Brand save(Brand brand);

    void deleteById(String id);

    List<Brand> findByName(String kw);
}
