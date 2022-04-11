package com.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

@Entity
public class AppUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String username;
	@NonNull
	private String password;
	@NonNull
	private int active;
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<AppRole> roles=new ArrayList<AppRole>();
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Collection<AppRole> getRoles() {
		return roles;
	}
	public void setRoles(Collection<AppRole> roles) {
		this.roles = roles;
	}
	public AppUser(String username, String password, int active, Collection<AppRole> roles) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}
	public AppUser() {
		super();
	}
	
	

}
