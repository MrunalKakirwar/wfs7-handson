package com.hsbc;

import java.util.List;

public class JdbcBackedDao implements AccountDao {

	private DBUtility dbutility;
	
	
	public void setDbutility(DBUtility dbutility) {
		
		this.dbutility = dbutility;
	}

	/**
	 * @param dbutility
	 */
	public JdbcBackedDao(DBUtility dbutility) {
		//first requirement
		System.out.println("JdbcBackedDao(DBUtility)");
		this.dbutility = dbutility;
	}

	public JdbcBackedDao() {
		System.out.println("JdbcBackedDao()");
	}
	@Override
	public void createAccount() {
		// old approach
		dbutility.getConnection();
		System.out.println("createAccount() of JdbcBackedDao");
	}
	@Override
	public List<String> getAccounts() {
		dbutility.getConnection();
		System.out.println("getAccounts() of JdbcBackedDao");
		return null;
	}

}
