package com.Spring.SpringBootMysql.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Spring.SpringBootMysql.model.UserProfile;

@Repository
public interface UserProfileRepo extends CrudRepository<UserProfile, Long> {

    List<UserProfile> findAllByUserId(Long userId);

    void deleteByUserId(Long userId);
}
