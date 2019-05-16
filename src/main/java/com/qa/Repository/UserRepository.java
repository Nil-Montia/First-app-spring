package com.qa.Repository;

import com.qa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsernameAndPassword(String username, String Password);
    List<User> findAllByUsername(String username);
}

