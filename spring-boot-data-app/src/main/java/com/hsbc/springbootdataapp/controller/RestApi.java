package com.hsbc.springbootdataapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.springbootdataapp.model.beans.User;
import com.hsbc.springbootdataapp.model.sevice.UserService;

@RestController
public class RestApi {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "users", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<User> getAllUsersApi() {
		return userService.fetchUsers();
	}
	
	// { "userId" : 1000, "name" : "Alex", "dob" : "1999-10-22" } 
	@RequestMapping(value = "store", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User createUserAPI(@RequestBody User user) { // User (userId, name dob)
		User createdUser = userService.createUser(user);
		return createdUser;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteUser(@PathVariable int id) {
		userService.deleteUserById(id);

	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable int id) {
		return userService.fetchUserById(id);

	}
}
