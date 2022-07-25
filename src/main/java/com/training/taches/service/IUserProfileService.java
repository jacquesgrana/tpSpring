package com.training.taches.service;

import com.training.taches.entity.UserProfile;

import java.io.IOException;
import java.util.List;

public interface IUserProfileService {
    List<UserProfile> getAll();

    void addOne(UserProfile user);

    UserProfile getOne(String id) throws IOException;

    void deleteUser(String id);

    void updateUser(UserProfile user, String id);
}
