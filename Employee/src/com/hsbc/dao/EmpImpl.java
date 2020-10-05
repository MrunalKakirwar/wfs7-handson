package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.entity.Employee;

public class EmpImpl implements EmpDao{
	
	List<Employee> list = new ArrayList<Employee>();

	@Override
	public void store(Employee e) {
		// TODO Auto-generated method stub
		list.add(e);
	}

	public List<Employee> getEmployees() {
		return list;
	}

	
}
