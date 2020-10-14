package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		DBUtility utility = (DBUtility)context.getBean("db");
//		System.out.println("Username = "+utility.getUsername());
//		System.out.println("Password = "+utility.getPassword());
//		utility.getConnection();
		
		// Service Code
//		AccountDao accountDao = (AccountDao)context.getBean("dao");
//		accountDao.createAccount();
//		accountDao.getAccounts();
		

		System.out.println("\n*****************************\n");
		
		AccountDao accountDao1 = (AccountDao) context.getBean("hdao");
		accountDao1.createAccount();
		accountDao1.getAccounts();

		// Controller Code
		
		AccountService service = (AccountService) context.getBean("service");
		service.createAccount();
		System.out.println("**************************************");
		service.getAccounts();
		System.out.println("**************************************");
		service.getAccountsSortByName();

	}

}
