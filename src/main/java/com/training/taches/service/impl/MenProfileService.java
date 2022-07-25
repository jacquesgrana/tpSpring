package com.training.taches.service.impl;

import com.training.taches.entity.UserProfile;
import com.training.taches.exception.ApplicationEntityNotFoundException;
import com.training.taches.service.IUserProfileService;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MenProfileService implements IUserProfileService {

    List<UserProfile> users = new ArrayList<UserProfile>();
    {
        users.add(new UserProfile("129", "Jean", "Paul", "M."));
        users.add(new UserProfile("1864", "Angèlo", "Martino", "M."));
    }

    public MenProfileService() {
    }

    @Override
    public List<UserProfile> getAll() {
        return this.users;
    }

    @Override
    public UserProfile getOne(String id) throws ApplicationEntityNotFoundException {
        //return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElseThrow(IOException::new);
        return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElseThrow(() -> new ApplicationEntityNotFoundException(id));//throw new IOException()
    }

    @Override
    public void addOne(UserProfile user) {
        user.setCivility("M.");
        this.users.add(user);
    }

    @Override
    public void deleteUser(String id) {
        users.removeIf(u -> u.getId().equals(id));
    }

    @Override
    public void updateUser(UserProfile newUser, String id) {
      // users.stream().filter(u -> u.getId().equals(id)).findFirst().(()u -> {u.setFirstName(newUser.getFirstName()); u.setLastName(newUser.getFirstName());});
        for (UserProfile user : users) {
            if(user.getId().equals(id)) {
                user.setFirstName(newUser.getFirstName());
                user.setLastName(newUser.getLastName());
                user.setCivility("M.");
            }
        }
    }
}
