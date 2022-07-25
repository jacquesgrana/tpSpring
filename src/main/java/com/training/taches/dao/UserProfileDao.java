package com.training.taches.dao;

import com.training.taches.entity.UserProfile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserProfileDao {

    private final String PERSISTENCE_UNIT_NAME = "tp_spring";

    private final String GET_ALL_REQ = "SELECT u FROM UserProfile u";
    private final String GET_BY_ID_REQ = "SELECT u FROM UserProfile u WHERE u.id = :id";
    private EntityManagerFactory emf;
    private EntityManager em;

    public UserProfileDao() {
    }

    public void init() {
        emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = emf.createEntityManager();
    }

    public void close() {
        em.close();
        emf.close();
    }

    public List<UserProfile> getAll() {
        Query query = em.createQuery(GET_ALL_REQ, UserProfile.class);
        return query.getResultList();
    }

    public UserProfile getById(String id) {
        Query query = em.createQuery(GET_BY_ID_REQ, UserProfile.class);
        query.setParameter("id", id);
        //UserProfile user = (UserProfile) query.getSingleResult();
        return (UserProfile) query.getSingleResult();
    }
}
