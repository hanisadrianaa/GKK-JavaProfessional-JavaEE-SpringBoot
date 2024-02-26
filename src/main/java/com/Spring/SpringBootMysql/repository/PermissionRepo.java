package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Spring.SpringBootMysql.model.Permission;

@Repository
public interface PermissionRepo extends CrudRepository<Permission, Long> {
    
}
