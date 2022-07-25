package com.training.taches.controller.advices;

import com.training.taches.dto.ErrorDTO;
import com.training.taches.exception.ApplicationEntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(value = ApplicationEntityNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorDTO handleIOException(HttpServletRequest req, Exception ex) {
       // applicationEntityNotFound.pr
        return new ErrorDTO(req.getRequestURI(), "La ressource demandée n'existe pas !");
    }

}
