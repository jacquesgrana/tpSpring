package com.training.taches.entity;

public class UserProfile {

    private String id;
    private String firstName;
    private String lastName;

    private String civility;



    public UserProfile() {
    }

    public UserProfile(String id, String firstName, String lastName, String civility) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.civility = civility;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }
}
