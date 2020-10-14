package com.hsbc;
	
import java.util.List;
	
public interface AccountInterface {
	
	void createAccount();
    List<String> getAccounts();
    List<String> getAccountsSortByName();
	
}
