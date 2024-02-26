package com.Spring.SpringBootMysql.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Spring.SpringBootMysql.model.UserPermission;

@Repository
public interface UserPermissionRepo extends CrudRepository<UserPermission,Long> {
    Optional<UserPermission> findByUserId(Long id);
}
