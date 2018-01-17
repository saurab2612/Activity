package com.act.io.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.act.io.service.Employee;

public class EmpFileDao implements IDao{

	@Override
	public List<Employee> viewEmployee() throws IOException, ClassNotFoundException {
		List<Employee> lst = new ArrayList<>();
		
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = null;
		
		try {
			while(true) {
				emp = (Employee)ois.readObject();
				lst.add(emp);
			}
			
		}catch(EOFException e) {
			System.out.println("eof reached");
		}
		ois.close();
		return lst;
	}

	@Override
	public void addEmployee(Employee emp) throws IOException {
		FileOutputStream fos = new FileOutputStream("employee.txt",true);
		AppendableObjectStream oos = new AppendableObjectStream(fos);
		
		oos.writeObject(emp);
		
		oos.close();
		
	}
	

}
