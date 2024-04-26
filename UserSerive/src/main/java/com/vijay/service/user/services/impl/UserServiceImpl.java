package com.vijay.service.user.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.service.user.entities.User;
import com.vijay.service.user.exceptions.ResultNotFoundException;
import com.vijay.service.user.repositories.UserRespositry;
import com.vijay.service.user.services.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRespositry userRespositry;


    @Override
    public User addUser(User user) {
        String randomUserID = UUID.randomUUID().toString();
        user.setUserId(randomUserID);
        return userRespositry.save(user);
    }

    @Override
    public List<User> getAllUsers() {
      return userRespositry.findAll();
    }

    @Override
    public User getUserById(String userId) {
        User ansUser = userRespositry.findById(userId).orElseThrow(
            () -> new ResultNotFoundException(userId+" user is not found on server"));
            return ansUser;
    }
        

}
