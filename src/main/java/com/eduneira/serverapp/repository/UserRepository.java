package com.eduneira.serverapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduneira.serverapp.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}
