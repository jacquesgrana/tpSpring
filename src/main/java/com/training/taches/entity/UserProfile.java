package com.training.taches.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 5)
    private String civility;



    public UserProfile() {
    }

    public UserProfile(String firstName, String lastName, String civility) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.civility = civility;
    }

    public UserProfile(int id, String firstName, String lastName, String civility) {
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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }
}
