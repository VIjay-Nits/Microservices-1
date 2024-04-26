package com.vijay.service.user.services;

import java.util.List;

import com.vijay.service.user.entities.User;

public interface UserService {
    
    User addUser(User user);

    List<User> getAllUsers();

    User getUserById(String userId);

    

}
