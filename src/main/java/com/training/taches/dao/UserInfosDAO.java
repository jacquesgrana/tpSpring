package com.training.taches.dao;

import com.training.taches.entity.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class UserInfosDAO {

    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    public List<UserProfile> getAll() {
        /*
        Query query = em.createQuery(GET_ALL_REQ, UserProfile.class);
        return query.getResultList();*/
        return null;
    }

    public UserProfile getById(String id) {
        /*
        Query query = em.createQuery(GET_BY_ID_REQ, UserProfile.class);
        query.setParameter("id", id);
        UserProfile user = (UserProfile) query.getResultStream().findFirst().orElse(null);
        return user;*/
        return null;
    }

/*
    private final String GET_ALL_REQ = "SELECT u FROM UserProfile u";
    private final String GET_BY_ID_REQ = "SELECT u FROM UserProfile u WHERE u.id = :id";




    public List<UserProfile> getAll() {
        Query query = em.createQuery(GET_ALL_REQ, UserProfile.class);
        return query.getResultList();
    }

    public UserProfile getById(String id) {
        Query query = em.createQuery(GET_BY_ID_REQ, UserProfile.class);
        query.setParameter("id", id);
        UserProfile user = (UserProfile) query.getResultStream().findFirst().orElse(null);
        return user;
    }*/
}
