package com.vijay.service.user.UserSerive.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.service.user.UserSerive.repositories.UserRespositry;
import com.vijay.service.user.UserSerive.services.UserService;
import com.vijay.service.user.UserSerive.exceptions.ResultNotFoundException;
import com.vijay.service.user.UserSerive.entities.User;

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
