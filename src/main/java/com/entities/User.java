package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="userdata")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	@Column(name = "fullname", nullable = false, length = 50)
	private String name;
	
	public String getName() {
		System.out.println(this.name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserid() {
		return userid;
	}
	public User() {
		
	}
	public User(String name) {
		this.name = name;
	}
}
