package com.hsbc;

import java.util.List;

public class HibernateBackedDao implements AccountDao {

	private DBUtility dbutility;
	

	
	
	@Override
	public void createAccount() {

		// TODO Auto-generated method stub
		dbutility.getConnection();
		System.out.println("createAccount() of HibernateBackedDao");
	

		dbutility.getConnection();
		System.out.println("createAccount() of HibernateBackedDao");


	}

	@Override
	public List<String> getAccounts() {
		dbutility.getConnection();

		System.out.println("getAccounts() of HibernateBackedDao");
		return null;
	
	}

	/**
	 * 
	 */
	public HibernateBackedDao() {
		super();
		System.out.println("In Hibernate");

		System.out.println("getAccouts() of HibernateBackedDao");
	
	}

	public void setDbutility(DBUtility dbutility) {
		this.dbutility = dbutility;

	}

}
