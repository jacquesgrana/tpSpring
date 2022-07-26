package com.training.taches.service;

import com.training.taches.entity.UserProfile;
import com.training.taches.exception.ApplicationEntityNotFoundException;
import org.springframework.context.ApplicationContextException;

import java.io.IOException;
import java.util.List;

public interface IUserProfileService {
    List<UserProfile> getAll();

    void addOne(UserProfile user);

    UserProfile getOne(int id) throws ApplicationEntityNotFoundException;

    void deleteUser(int id);

    void updateUser(UserProfile user, int id)  throws ApplicationEntityNotFoundException;
}
