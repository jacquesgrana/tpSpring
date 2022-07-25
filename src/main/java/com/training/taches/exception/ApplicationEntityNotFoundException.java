package com.training.taches.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Util not found")
public class ApplicationEntityNotFoundException extends Exception {

    public ApplicationEntityNotFoundException(String message) {
        super("Object not Found : " + message);
    }

    public ApplicationEntityNotFoundException() {
    }


}
