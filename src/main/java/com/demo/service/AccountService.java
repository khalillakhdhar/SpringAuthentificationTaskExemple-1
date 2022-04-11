package com.demo.service;

import com.demo.entity.AppRole;
import com.demo.entity.AppUser;

public interface AccountService {
public AppUser saveUser(AppUser appUser);
public AppRole saveRole(AppRole appRole);
public void addRoleToUser(String username,String roleName);
AppUser findUserByUserName(String username);
}
