package com.ijse.instergram_clone.dao;

import com.ijse.instergram_clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User getUserByUserId(int userId);
}
