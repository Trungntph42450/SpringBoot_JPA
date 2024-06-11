package org.example.asm_java5_final.repository;

import org.example.asm_java5_final.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, String> {
    @Query("SELECT a FROM Account a WHERE a.fullname LIKE :name")
    List<Account> findByFullname(@Param("name") String fullname);
    @Query("SELECT a FROM Account a WHERE a.username LIKE :username")
    List<Account> findByUsernameLike(@Param("username") String username);
    @Query("SELECT COUNT(a) FROM Account a, RoleDetail rd WHERE a.username = rd.account.username AND rd.role.role = :role")
    Long countCustomer(@Param("role") String role);

}
