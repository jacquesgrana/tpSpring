package com.training.taches.controller;

import com.training.taches.exception.ErrorObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@ControllerAdvice
public class ObjectNotFoundHandler {


    @ExceptionHandler(value = IOException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorObject handleIOException(HttpServletRequest req, Exception ex) {
        return new ErrorObject(req.getRequestURI(), "La ressource demandée n'existe pas !");
    }

}
