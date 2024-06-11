package org.example.asm_java5_final.service;

import org.example.asm_java5_final.entity.Account;
import org.example.asm_java5_final.entity.Role;
import org.example.asm_java5_final.entity.RoleDetail;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    Account findByUsername(String username);

    Account save(Account account);

    void deleteByUsername(String username);

    boolean existsById(String username);

    List<Account> findByFullname(String fullname);

    List<Role> findAllRole();

    List<RoleDetail> findAllAuthorities();

    RoleDetail saveRoleDetail(RoleDetail authority);

    void deleteRoleDetail(Long id);

    List<Account> findByUsernameLike(String username);

    Long countCustomer(String role);

}
