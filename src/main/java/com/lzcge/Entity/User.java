package com.lzcge.Entity;

import java.io.Serializable;

public class User implements Serializable{
	private Integer userId;
	private String username;
	private String password;
	private Integer age;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(Integer userId, String username, String password, Integer age) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public User(){}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				'}';
	}
}
