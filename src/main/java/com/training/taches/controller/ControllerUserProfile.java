package com.training.taches.controller;

import com.training.taches.entity.UserProfile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "user", produces = MediaType.APPLICATION_JSON_VALUE)
public class ControllerUserProfile {

    @RequestMapping(path="all", method = RequestMethod.GET)
    public List<UserProfile> gatAll() {
        List<UserProfile> users = new ArrayList<UserProfile>();
        return users;
    }
}
