package com.training.taches.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserProfileDao {

    private final String persistenceUnitName = "tp_spring";
    private EntityManagerFactory emf;
    private EntityManager em;

    public void init() {
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        em = emf.createEntityManager();
    }
}
