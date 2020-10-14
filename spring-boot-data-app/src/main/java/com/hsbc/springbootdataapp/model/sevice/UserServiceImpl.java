package com.hsbc.springbootdataapp.model.sevice;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.springbootdataapp.model.beans.User;
import com.hsbc.springbootdataapp.model.dao.UserDao;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User createUser(User user) {
		User createdUser = userDao.save(user); // save method takes the object and maps to the table
		return createdUser;
	}

	@Override
	public List<User> fetchUsers() {
		List<User> usersList = userDao.findAll(); // findAll method takes all the records and gives you the List of User
		return usersList;
	}

	@Override
	public User fetchUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id).get();
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}

	@Override
	public User updateDob(int id, LocalDate dob) {
		Optional<User> optional = userDao.findById(id);
		if(optional.isPresent()) {
			User us = optional.get();
			us.setDob(dob);
			return userDao.save(us);
			
		}
		return null;
	}

}
