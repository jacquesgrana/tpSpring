package com.training.taches.service.impl;

import com.training.taches.dao.UserInfosDAO;
import com.training.taches.dao.UserProfileDao;
import com.training.taches.entity.UserProfile;
import com.training.taches.exception.ApplicationEntityNotFoundException;
import com.training.taches.service.IUserProfileService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenProfileService implements IUserProfileService { //implements IUserProfileService

   private UserProfileDao userProfileDao;

    /*
    List<UserProfile> users = new ArrayList<UserProfile>();
    {
        users.add(new UserProfile("129", "Jean", "Paul", "M."));
        users.add(new UserProfile("1864", "Angèlo", "Martino", "M."));
    }
*/

    public MenProfileService(UserProfileDao userProfileDao) {
        this.userProfileDao = userProfileDao;
    }

    @Override
    public List<UserProfile> getAll() {
        return userProfileDao.findAll();
        //return this.users;
    }


    @Override
    public UserProfile getOne(int id) throws ApplicationEntityNotFoundException {
        UserProfile user = userProfileDao.findById(id).stream().findFirst().orElseThrow(() -> new ApplicationEntityNotFoundException(Integer.toString(id)));
        return user;
    }

    @Override
    public void addOne(UserProfile user) {
       userProfileDao.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userProfileDao.deleteById(id);
    }

    @Override
    public void updateUser(UserProfile newUser, int id) throws ApplicationEntityNotFoundException {
        UserProfile user = userProfileDao.findById(id).stream().findFirst().orElseThrow(() -> new ApplicationEntityNotFoundException(Integer.toString(id)));
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setCivility(newUser.getCivility());
        userProfileDao.save(user);
    }
}
