package com.bet.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L	;

	public User() {

	}

	// primary key
	@Id
	@Column(name = "id")
	private int code;

	@Column(name = "Frstname")
	private String firstName;
	
	@Column(name = "username")
	private String username;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "email")
	private String email;
	

	@Column(name = "password")
	private String password;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
