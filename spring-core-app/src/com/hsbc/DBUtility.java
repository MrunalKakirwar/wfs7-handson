package com.hsbc;

public class DBUtility {
	private String username;
	private String password;
	
	public DBUtility(String username, String password) {
		this.username = username;
		this.password = password;
		System.out.println("DBUtility("+username+", "+password+")");
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		System.out.println("setUsername("+username+")");
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setPassword("+password+")");
		this.password = password;
	}
	public void getConnection() {
		System.out.println("getConnection() of DBUtility");
	}
	
}
