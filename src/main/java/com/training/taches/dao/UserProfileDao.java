package com.training.taches.dao;

import com.training.taches.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileDao extends JpaRepository<UserProfile, Integer> {
}
