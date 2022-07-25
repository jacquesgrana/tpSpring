package com.training.taches.entity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason= "Util not found")
public class UtilNotFoundException extends Exception {

    public UtilNotFoundException (String id) {
        super("Util not Found with id : " + id);
    }
}
