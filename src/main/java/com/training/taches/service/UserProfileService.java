package com.training.taches.service;

import com.training.taches.entity.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class UserProfileService {

    List<UserProfile> users = new ArrayList<UserProfile>();
    {
        UserProfile user1 = new UserProfile("129", "Jean", "Paul");
        UserProfile user2 = new UserProfile("1234", "Marie", "Boulanger");
        UserProfile user3 = new UserProfile("1864", "Angèle", "Deluxe");

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public UserProfileService() {
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
