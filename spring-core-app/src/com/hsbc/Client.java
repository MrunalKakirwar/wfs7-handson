package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AccountInterface service = (AccountInterface) context.getBean("service");
		service.createAccount();
		System.out.println("**************");
		service.getAccounts();
		System.out.println("**************");
		
		service.getAccountsSortByName();
		
	}

}
