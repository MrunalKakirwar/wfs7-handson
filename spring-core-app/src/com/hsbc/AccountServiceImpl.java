package com.hsbc;

import java.util.List;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	

	public void setAccountDao(AccountDao accountDao) {
		
		this.accountDao = accountDao;
	}
	
	@Override
	public void createAccount() {
		accountDao.createAccount();
		System.out.println("createAccount() of AccountService");
	}

	@Override
	public List<String> getAccountsSortByName() {
		accountDao.getAccounts();
		System.out.println("getAccountsSortByName() of AccountService");

		return null;
	}

	

	/**
	 * @return the accountDao
	 */
	
	/**
	 * @param accountDao the accountDao to set
	 */
	
	/**
	 * 
	 */
	public AccountServiceImpl() {
		super();
		System.out.println("AccountServiceImpl created");
	}

	

	public List<String> getAccounts() {
		accountDao.getAccounts();
		System.out.println("getAccounts() of AccountService");
		return null;
	}


}
