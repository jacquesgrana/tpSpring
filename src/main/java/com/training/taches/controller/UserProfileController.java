package com.training.taches.controller;

import com.training.taches.entity.UserProfile;

import com.training.taches.exception.ApplicationEntityNotFoundException;
import com.training.taches.service.IUserProfileService;
import com.training.taches.service.impl.MenProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserProfileController {

    //UserProfileService userProfileService = new UserProfileService();

    //@Autowired
    //@Qualifier("womenProfileService")
    @Autowired
    private MenProfileService userProfileService;



    public UserProfileController(MenProfileService userProfileService) {
        this.userProfileService = userProfileService;

    }

    /*
        @Autowired
        IUserProfileService womenProfileService;
    */

    @RequestMapping(path="all", method = RequestMethod.GET)
    public List<UserProfile> getAll() {
            List<UserProfile> users = userProfileService.getAll();
            return users;
    }
/*
    @PostMapping
    public void addUser(@RequestBody UserProfile user) {
        userProfileService.addOne(user);
    }*/

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public UserProfile findOne(@PathVariable("id") int id) throws ApplicationEntityNotFoundException {
        UserProfile user;
        user = userProfileService.getOne(id);
        return user;
    }
/*
    @DeleteMapping(path = "{id}")
    public void deleteUSer(@PathVariable("id") int id) {
        userProfileService.deleteUser(id);
    }
*/
    /*
    @PutMapping(path = "{id}")
    public void updateUser(@RequestBody UserProfile user, @PathVariable("id") int id) {
        userProfileService.updateUser(user, id);
    }*/
}
