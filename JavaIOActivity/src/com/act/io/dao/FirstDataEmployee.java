package com.act.io.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.act.io.service.Employee;

public class FirstDataEmployee {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int eid = scan.nextInt();
		System.out.println("Enter employee name");
		String name = scan.next();
		System.out.println("enter the salary");
		double sal = scan.nextDouble();
		
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee(eid, name, sal);
	
		oos.writeObject(emp);
		oos.close();
		fos.close();
		System.out.println("java object appended");

	}

}
