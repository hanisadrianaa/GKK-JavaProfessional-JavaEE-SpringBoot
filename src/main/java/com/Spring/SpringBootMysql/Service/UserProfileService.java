package com.Spring.SpringBootMysql.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.model.UserProfile;
import com.Spring.SpringBootMysql.repository.UserProfileRepo;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepo userProfileRepository;

    public UserProfile addUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public Iterable<UserProfile> addMultiUserProfile(List<UserProfile> userProfileList) {
        return userProfileRepository.saveAll(userProfileList);
    }

    public Iterable<UserProfile> getAllUserProfiles() {
        return userProfileRepository.findAll();
    }

    public Optional<UserProfile> getUserProfileById(Long id) {
        return userProfileRepository.findById(id);
    }

    public List<UserProfile> getUserProfileByUserId(Long userId) {
        return userProfileRepository.findAllByUserId(userId);
    }

    public UserProfile updateBioById(Long id, Map<String, String> bioMap) {
        UserProfile userProfile = userProfileRepository.findById(id).orElse(null);
        if (userProfile != null) {
            userProfile.setBio(bioMap.get("bio"));
            return userProfileRepository.save(userProfile);
        }
        return null;
    }

    public UserProfile updateNameById(Long id, Map<String, String> nameMap) {
        UserProfile userProfile = userProfileRepository.findById(id).orElse(null);
        if (userProfile != null) {
            userProfile.setFirstName(nameMap.get("firstName"));
            userProfile.setLastName(nameMap.get("lastName"));
            return userProfileRepository.save(userProfile);
        }
        return null;
    }

    public String deleteUserProfileById(Long id) {
        userProfileRepository.deleteById(id);
        return "Deleted";
    }

    public String deleteUserProfileByUserId(Long userId) {
        userProfileRepository.deleteByUserId(userId);
        return "Deleted";
    }
}

