package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "tel")
	private String tel;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "address")
	private String address;

	@Column(name = "user_create")
	private int userCreate;

	@Column(name = "admin")
	private char admin;

	@Column(name = "quit")
	private char quit;

	public User() {
	}

	public User(
			int userId,
			String userName,
			String email,
			String password,
			String tel,
			String postalCode,
			String address,
			int userCreate,
			char admin,
			char quit
			) {
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.tel = tel;
		this.postalCode = postalCode;
		this.address = address;
		this.userCreate = userCreate;
		this.admin = admin;
		this.quit = quit;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getTel() {
		return tel;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getAddress() {
		return address;
	}

	public int getUserCreate() {
		return userCreate;
	}

	public char getAdmin() {
		return admin;
	}

	public char getQuit() {
		return quit;
	}
}
