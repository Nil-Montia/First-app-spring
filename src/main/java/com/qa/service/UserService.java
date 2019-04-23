package com.qa.service;

import com.qa.Repository.UserRepository;
import com.qa.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public String create(User user){
        userRepository.saveAndFlush(user);
        return "User successfully created";
    }

    public String login (String username, String password){
        if (userRepository.findByUsername(username).isEmpty()){
            return "User does not exist";
        }
        if (userRepository.findUserByUsername(username).getPassword().equals(password)){
            return "Login successful";
        }
        return "Username and password don't match";
    }

    public String register(User user){
        if (!userRepository.findByUsername(user.getUsername()).isEmpty()){
            return "User already exists";
        }
        userRepository.saveAndFlush(user);
        return "User successfully created";
    }

}
