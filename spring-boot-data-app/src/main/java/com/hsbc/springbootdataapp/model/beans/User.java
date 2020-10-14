package com.hsbc.springbootdataapp.model.beans;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info1")
public class User {
	@Id
	@Column(name = "user_id")
	private int userId; // map to user_id column & this is primary key
	
	@Column(name = "username")
	private String name; // map to username column
	
	@Column(name = "dob")
	private LocalDate dob; // map to dob column, however @Column is optional when columns & variables have same name
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
