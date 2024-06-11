package org.example.asm_java5_final.service.Impl;

import org.example.asm_java5_final.entity.Account;
import org.example.asm_java5_final.entity.Role;
import org.example.asm_java5_final.entity.RoleDetail;
import org.example.asm_java5_final.repository.AccountRepo;
import org.example.asm_java5_final.repository.RoleDetailRepo;
import org.example.asm_java5_final.repository.RoleRepo;
import org.example.asm_java5_final.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepo aRepo;
    @Autowired
    RoleRepo rRepo;
    @Autowired
    RoleDetailRepo rdRepo;

    @Override
    public List<Account> findAll() {
        return aRepo.findAll();
    }

    @Override
    public Account findByUsername(String username) {
        return aRepo.findById(username).get();
    }

    @Override
    public Account save(Account account) {
        return aRepo.save(account);
    }

    @Override
    public void deleteByUsername(String username) {
        aRepo.deleteById(username);
    }

    @Override
    public boolean existsById(String username) {
        return aRepo.existsById(username);
    }

    @Override
    public List<Account> findByFullname(String fullname) {
        return aRepo.findByFullname(fullname);
    }

    @Override
    public List<Role> findAllRole() {
        return rRepo.findAll();
    }

    @Override
    public List<RoleDetail> findAllAuthorities() {
        return rdRepo.findAll();
    }

    @Override
    public RoleDetail saveRoleDetail(RoleDetail authority) {
        return rdRepo.save(authority);
    }

    @Override
    public void deleteRoleDetail(Long id) {
        rdRepo.deleteById(id);
    }

    @Override
    public List<Account> findByUsernameLike(String username) {
        return aRepo.findByUsernameLike(username);
    }

    @Override
    public Long countCustomer(String role) {
        return aRepo.countCustomer(role);
    }
}
