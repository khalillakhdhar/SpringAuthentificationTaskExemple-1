package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.AppUser;

public interface UserRepository extends JpaRepository<AppUser, String> {
public AppUser findByUsername(String username);
}
