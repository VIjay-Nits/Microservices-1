package com.vijay.service.user.UserSerive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.service.user.UserSerive.entities.User;

public interface UserRespositry extends JpaRepository<User,String> {


}
