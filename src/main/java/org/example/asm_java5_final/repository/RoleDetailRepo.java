package org.example.asm_java5_final.repository;

import org.example.asm_java5_final.entity.RoleDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDetailRepo extends JpaRepository<RoleDetail, Long> {
}
