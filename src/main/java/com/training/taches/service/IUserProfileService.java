package com.training.taches.service;

import com.training.taches.entity.UserProfile;

import java.util.List;

public interface IUserProfileService {
    List<UserProfile> search();

    void addOne(UserProfile user);

    UserProfile getOne(String id);

    void deleteUser(String id);

    void updateUser(UserProfile user, String id);
}
