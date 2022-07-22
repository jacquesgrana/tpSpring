package com.training.taches.controller;

import com.training.taches.entity.UserProfile;
import com.training.taches.service.UserProfileService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserProfileController {

    UserProfileService userProfileService = new UserProfileService();
    @RequestMapping(path="all", method = RequestMethod.GET)
    public List<UserProfile> getAll() {
        List<UserProfile> users = userProfileService.search();
        return users;
    }

    @PostMapping
    public void addUser(@RequestBody UserProfile user) {
        userProfileService.addOne(user);
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public UserProfile findOne(@PathVariable String id) {
        UserProfile user = userProfileService.getOne(id);
        return user;
    }

    @DeleteMapping(path = "{id}")
    public void deleteUSer(@PathVariable String id) {
        userProfileService.deleteUser(id);
    }
}
