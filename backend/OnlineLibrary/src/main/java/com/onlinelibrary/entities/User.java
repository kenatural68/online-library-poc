package com.onlinelibrary.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
//	public class User extends AbstractEntity{
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="email")
	private String email;
	
	@Column(name="username")
	private String username;
	
	@Column(name ="password")
	private String password;
	
	@ManyToMany
	@JoinTable(name="userrole", joinColumns=@JoinColumn(name="userid"),inverseJoinColumns=@JoinColumn(name="roleid"))
	private Set<Role> roles;
	
	

	public User() {
		
	}

	

	public User(int id, String email, String username, String password) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
	}



	public int getUserid() {
		return id;
	}

	public void setUserid(int userid) {
		this.id = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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



	public Set<Role> getRoles() {
		return roles;
	}



	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}




	
	

}
