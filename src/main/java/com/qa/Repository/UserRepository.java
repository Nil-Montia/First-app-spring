package com.qa.Repository;

import com.qa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(Long id);
    User findUserByUsername(String username);
    List<User> findByUsername(String username);

}
