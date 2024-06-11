package org.example.asm_java5_final.repository;

import org.example.asm_java5_final.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepo extends JpaRepository<Brand, String> {
    @Query("SELECT b FROM Brand b WHERE b.name LIKE :name")
    List<Brand> findByName(@Param("name") String name);

}
