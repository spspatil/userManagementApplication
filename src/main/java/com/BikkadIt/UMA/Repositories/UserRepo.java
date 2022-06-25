package com.BikkadIt.UMA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.UMA.Models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
