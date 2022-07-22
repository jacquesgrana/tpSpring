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
    public List<UserProfile> getAll(@RequestParam String civility) {
        if (civility.equals("M.")) {
            List<UserProfile> users = menProfileService.search();
            return users;
        }
        else {
            List<UserProfile> users = womenProfileService.search();
            return users;
        }

    }

    @PostMapping
    public void addUser(@RequestBody UserProfile user, @RequestParam String civility) {
        if (civility.equals("M.")) {
            menProfileService.addOne(user);
        }
        else {
            womenProfileService.addOne(user);
        }
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public UserProfile findOne(@PathVariable String id, @RequestParam String civility) {
        UserProfile user;
        if (civility.equals("M.")) {
            user = menProfileService.getOne(id);
        }
        else {
            user = womenProfileService.getOne(id);
        }

        return user;
    }

    @DeleteMapping(path = "{id}")
    public void deleteUSer(@PathVariable String id, @RequestParam String civility) {
        if (civility.equals("M.")) {
            menProfileService.deleteUser(id);
        }
        else {
            womenProfileService.deleteUser(id);
        }

    }

    @PutMapping(path = "{id}")
    public void updateUser(@RequestBody UserProfile user, @PathVariable String id, @RequestParam String civility) {
        if (civility.equals("M.")) {
            menProfileService.updateUser(user, id);
        }
        else {
            womenProfileService.updateUser(user, id);
        }

    }
}
