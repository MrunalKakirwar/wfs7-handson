package com.hsbc;

import java.util.List;

public interface AccountService {
	public void createAccount();
	public List<String> getAccountsSortByName();
	public List<String> getAccounts();
	
}
