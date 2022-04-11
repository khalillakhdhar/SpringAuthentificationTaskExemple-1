package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, String> {
public AppRole findByRoleName(String roleName);
}
