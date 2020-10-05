package com.hsbc.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

import com.hsbc.dao.EmpImpl;
import com.hsbc.entity.Employee;

public class StarterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option=0;
		EmpImpl emp = new EmpImpl();
		
		Employee emp1 = new Employee(101, "Mrunu", 10_000, LocalDate.now());
		Employee emp2 = new Employee(102, "Kuki", 5_000, LocalDate.of(1998, 10, 06));
		Employee emp3 = new Employee(105, "Mishtri", 90_000, LocalDate.of(1998, 10, 10));
		do {
			
	
		System.out.println("------ : Menu : -------");
		System.out.println("Enter \n1. Store\n2. Sort\n3. Display\n0. Exit");
		Scanner s = new Scanner(System.in);
		int i = Integer.parseInt(s.next());
		//System.out.println(i);
		
		switch(i) {
		
		case 1:
			System.out.println("Enter the Employe details as (id, Nmae, Salary, DOB(yyyy-MM-dd)");
			
			int id = Integer.parseInt(s.next());
			String name = s.next();
			int sal = Integer.parseInt(s.next());
			LocalDate dob = LocalDate.parse(s.next());
			
			
			emp.store( new Employee(id, name, sal, dob));
			break;
			
		case 2:
			System.out.println("You want to sort by 1: Id in Asc 2: Id in Desc 3: DOB in Asc 4: DOB in Desc 5: Salary in Asc 6: Salary in Desc");
			option = s.nextInt();
			List<Employee> employees = emp.getEmployees();
			if(option == 1) {
				Collections.sort(employees, (e1, e2) -> e1.getId() - e2.getId());
				System.out.println(employees);
			} if (option == 2) {
				Collections.sort(employees, (e1, e2) -> e2.getId() - e1.getId());
				System.out.println(employees);
			} if (option == 3) {
				Collections.sort(employees, (e1, e2) -> e1.getDob().compareTo(e2.getDob()));
				System.out.println(employees);
			} if (option == 4) {
				Collections.sort(employees, (e1, e2) -> e2.getDob().compareTo(e1.getDob()));
				System.out.println(employees);
			}if(option == 5) {
				Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()) );
				System.out.println(employees);
			}if(option == 6) {
				Collections.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()) );
				System.out.println(employees);
			}
			break;
			
		case 3: 
			System.out.println("You want to Display by 1: Id  2: Salary 3: DOB ");
			int counter=0;
			option = s.nextInt();
			List<Employee> employees1 = emp.getEmployees();
			if(option == 1) {
				Collections.sort(employees1, (e1, e2) -> e1.getId() - e2.getId());
			
				for (Employee employee : employees1) {
					if(counter<3)
						System.out.println(employee);
				}
				if(option == 2) {
					Collections.sort(employees1, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()) );
					
					for (Employee employee : employees1) {
						if(counter<3)
							System.out.println(employee);
					}
					if(option == 3) {
						Collections.sort(employees1, (e1, e2) -> e1.getDob().compareTo(e2.getDob()));
						
						for (Employee employee : employees1) {
							if(counter<3)
								System.out.println(employee);
						}
			}
			
		}
	}
	}
		}while(option!=0);
	}

	}


