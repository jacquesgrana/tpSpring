package com.training.taches.service.impl;

import com.training.taches.entity.UserProfile;
import com.training.taches.service.IUserProfileService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WomenProfileService implements IUserProfileService {

    List<UserProfile> users = new ArrayList<UserProfile>();
    {
        users.add(new UserProfile("129", "Anne", "André", "Mme"));
        users.add(new UserProfile("1864", "Angéla", "Martinsky", "Mme"));
    }

    public WomenProfileService() {
    }

    public List<UserProfile> search() {
        return this.users;
    }

    public UserProfile getOne(String id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
    }

    public void addOne(UserProfile user) {
        this.users.add(user);
    }

    public void deleteUser(String id) {
        UserProfile userToDelete = null;
        for (UserProfile user : users) {
            if(user.getId().equals(id)) {
                userToDelete = user;
            }
        }
        if(null != userToDelete) {
            users.remove(userToDelete);
        }
    }

    public void updateUser(UserProfile newUser, String id) {
        for (UserProfile user : users) {
            if(user.getId().equals(id)) {
                user.setFirstName(newUser.getFirstName());
                user.setLastName(newUser.getLastName());
            }
        }
    }
}
