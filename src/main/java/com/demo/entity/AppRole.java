package com.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AppRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String roleName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public AppRole() {
		super();
	}
	public AppRole(String roleName) {
		super();
		this.roleName = roleName;
	}
	

}
