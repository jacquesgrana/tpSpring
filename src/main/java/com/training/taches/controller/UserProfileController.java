package com.training.taches.controller;

import com.training.taches.entity.UserProfile;

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
    @Autowired
    IUserProfileService menProfileService;

    @Autowired
    IUserProfileService womenProfileService;

    @RequestMapping(path="all", method = RequestMethod.GET)
    public List<UserProfile> getAll() {
        List<UserProfile> users = menProfileService.search();
        return users;
    }

    @PostMapping
    public void addUser(@RequestBody UserProfile user) {
        menProfileService.addOne(user);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public UserProfile findOne(@PathVariable String id) {
        UserProfile user = menProfileService.getOne(id);
        return user;
    }

    @DeleteMapping(path = "{id}")
    public void deleteUSer(@PathVariable String id) {
        menProfileService.deleteUser(id);
    }

    @PutMapping(path = "{id}")
    public void updateUser(@RequestBody UserProfile user, @PathVariable String id) {
        menProfileService.updateUser(user, id);
    }
}
