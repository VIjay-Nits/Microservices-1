package com.vijay.service.user.UserSerive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.service.user.UserSerive.entities.User;
import com.vijay.service.user.UserSerive.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService; 
    // create user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user ){
        
        System.out.println("Innide post mapping");
        User newAddedUser = userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAddedUser);
    }

    // get user by ID
    @GetMapping("/{userId}")
    ResponseEntity<User> getUserById(@PathVariable String userId){
        User userDetail = userService.getUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).body(userDetail);
    }

    // get all users
    @GetMapping
    ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers = userService.getAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(allUsers);
    }

}
