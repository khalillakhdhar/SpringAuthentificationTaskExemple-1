package com.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.dao.RoleRepository;
import com.demo.dao.UserRepository;
import com.demo.entity.AppRole;
import com.demo.entity.AppUser;
@Service
@Transactional
public class AccountServiceImplement implements AccountService {

	@Bean
	public BCryptPasswordEncoder getBCPE()
	{
		return new BCryptPasswordEncoder();
		
	}
	
	
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;

	
	@Override
	public AppUser saveUser(AppUser appUser) {
		// TODO Auto-generated method stub
		String hashPW= this.getBCPE().encode(appUser.getPassword()); // cryptage de mdp
		appUser.setPassword(hashPW);
		System.out.println("hashed password: "+hashPW);
		return userRepository.save(appUser);
	}

	@Override
	public AppRole saveRole(AppRole appRole) {
		// TODO Auto-generated method stub
		
		return roleRepository.save(appRole);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		// TODO Auto-generated method stub
		AppRole role=roleRepository.findByRoleName(roleName);
		AppUser user=userRepository.findByUsername(username);
		user.getRoles().add(role);
		userRepository.save(user);
		

	}

	@Override
	public AppUser findUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

}
