package org.example.asm_java5_final.repository;

import org.example.asm_java5_final.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {
    @Query("SELECT c FROM Category c WHERE c.name LIKE :name")
    List<Category> findByName(@Param("name") String name);
}
