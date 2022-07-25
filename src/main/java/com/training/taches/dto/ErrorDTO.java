package com.training.taches.dto;

public class ErrorDTO {

    private String requestURI;
    private String raison;
    public ErrorDTO(String requestURI, String raison) {
        this.requestURI = requestURI;
        this.raison = raison;
    }

    public ErrorDTO() {
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
