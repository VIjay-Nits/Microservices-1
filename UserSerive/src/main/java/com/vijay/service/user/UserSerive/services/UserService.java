package com.vijay.service.user.UserSerive.services;

import java.util.List;

import com.vijay.service.user.UserSerive.entities.User;

public interface UserService {
    
    public User addUser(User user);

    public List<User> getAllUsers();

    public User getUserById(String userId);

    

}
