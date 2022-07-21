package com.training.taches.controller;

import com.training.taches.entity.UserProfile;
import com.training.taches.service.UserProfileService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "user", produces = MediaType.APPLICATION_JSON_VALUE)
public class ControllerUserProfile {

    UserProfileService userProfileService = new UserProfileService();
    @RequestMapping(path="all", method = RequestMethod.GET)
    public List<UserProfile> gatAll() {
        List<UserProfile> users = userProfileService.search();

        return users;
    }
}
