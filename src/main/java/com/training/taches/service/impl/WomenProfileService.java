package com.training.taches.service.impl;

import com.training.taches.dao.UserProfileDao;
import com.training.taches.entity.UserProfile;
import com.training.taches.exception.ApplicationEntityNotFoundException;
import com.training.taches.service.IUserProfileService;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class WomenProfileService implements IUserProfileService {

    private UserProfileDao dao;

    List<UserProfile> users = new ArrayList<UserProfile>();
    {
        users.add(new UserProfile("129", "Anne", "André", "Mme"));
        users.add(new UserProfile("1864", "Angéla", "Martinsky", "Mme"));
    }

    public WomenProfileService() {
        dao = new UserProfileDao();

        dao.init();
        System.out.println("connection ok");
        //dao.close();
    }

    @Override
    public List<UserProfile> getAll() {
        return dao.getAll();
        //return this.users;
    }

    @Override
    public UserProfile getOne(String id) throws ApplicationEntityNotFoundException{
        //return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElseThrow(() -> new IOException());
        //return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElseThrow(() -> new ApplicationEntityNotFoundException(id));
        return dao.getById(id);
    }

    @Override
    public void addOne(UserProfile user) {
        user.setCivility("Mme");
        this.users.add(user);
    }

    @Override
    public void deleteUser(String id) {
        users.removeIf(u -> u.getId().equals(id));
    }

    @Override
    public void updateUser(UserProfile newUser, String id) {
        for (UserProfile user : users) {
            if(user.getId().equals(id)) {
                user.setFirstName(newUser.getFirstName());
                user.setLastName(newUser.getLastName());
                user.setCivility("Mme");
            }
        }
    }
}
