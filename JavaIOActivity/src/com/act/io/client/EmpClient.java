package com.act.io.client;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.act.io.dao.DaoFactory;
import com.act.io.dao.IDao;
import com.act.io.service.Employee;

public class EmpClient {
	public static Scanner scan = new Scanner(System.in);
	static IDao dao = DaoFactory.getDaoInstance();

	public static void main(String[] args) {
		
		
		String strmenu;
		String opt;
     	Menu emenu;
		do {
			System.out.println("Enter Your choice \n1)add employee(ADD) \n2)View Employee(VIEW)");
			strmenu = scan.next();
			
			try{
				emenu = Menu.valueOf(strmenu);
				processMenu(emenu);
			}catch(Exception ex){
				System.out.println("Invalid Menu option");
			}
			
			
			System.out.println("want to continue?");
			opt = scan.nextLine();
		}while(opt.equalsIgnoreCase("y"));
		
		

	}
	public static void processMenu(Menu menu) throws ClassNotFoundException, IOException {
		switch(menu){
			case ADD:
				add();
				break;
			case VIEW:
				view();
				break;
		}
	}
	private static void view() throws ClassNotFoundException, IOException {
		List<Employee> lst = dao.viewEmployee();
		for(Employee emp:lst){
			System.out.println(emp);
		}
		
	}
	private static void add() throws IOException {
		System.out.println("Enter employee Id : ");
		int eid = scan.nextInt();
		System.out.println("Enter employee name : ");
		String ename = scan.next();
		System.out.println("Enter employee salary : ");
		double sal = scan.nextDouble();
		
        Employee emp = new Employee(eid,ename,sal);
		dao.addEmployee(emp);
		System.out.println("Employee added");
		
		
		
	}

}
