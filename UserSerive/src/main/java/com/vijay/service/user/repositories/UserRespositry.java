package com.vijay.service.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.service.user.entities.User;

public interface UserRespositry extends JpaRepository<User,String> {


}
