package com.hsbc.dao;

import java.util.List;

import com.hsbc.entity.Employee;

public interface EmpDao {

	public void store(Employee e);
	
	public List<Employee> getEmployees();
}
