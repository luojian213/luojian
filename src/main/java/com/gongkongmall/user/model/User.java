package com.gongkongmall.user.model;

import java.util.Date;

public class User {
	
	private long id;
	
	private String userName;
	
	private int age;
	
	private Date registerDate;
	
	public User(){}
	
	public User(String userName, int age){
		this.userName = userName;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	

}
