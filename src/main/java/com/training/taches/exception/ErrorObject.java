package com.training.taches.exception;

import java.io.IOException;

public class ErrorObject {

    private String requestURI;
    private String raison;
    public ErrorObject(String requestURI, String raison) {
        this.requestURI = requestURI;
        this.raison = raison;
    }

    public ErrorObject() {
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRequestURI(String requestURI) {
        this.requestURI = requestURI;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }
}
