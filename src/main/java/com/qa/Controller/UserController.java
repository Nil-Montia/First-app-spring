package com.qa.Controller;

import com.qa.Repository.UserRepository;
import com.qa.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public int create(@RequestBody User user) {
        if (userRepository.findAllByUsername(user.getUsername()).isEmpty()){
            userRepository.saveAndFlush(user);
            return 1;
        }
        else{
            return 0;
        }
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public void update(@PathVariable Long id, @RequestBody User user) {
        User existingUser = userRepository.findOne(id);
        user.setId(id);
        BeanUtils.copyProperties(user, existingUser);
        userRepository.saveAndFlush(user);
    }

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public User retrieve(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Long login(@RequestBody User user) {
        if (!(userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword()).isEmpty())){
            List<User> foundUser = userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
            return foundUser.get(0).getId();
        }else{
            return 0L;
        }
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<User> retrieve() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        userRepository.delete(id);
    }
}
