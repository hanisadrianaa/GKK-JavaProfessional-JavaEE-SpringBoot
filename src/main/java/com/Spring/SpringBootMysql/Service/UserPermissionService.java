package com.Spring.SpringBootMysql.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.model.UserPermission;

@Service
public interface UserPermissionService {
    
    Optional<UserPermission> getUserPermissionByUserId(Long id);
}
