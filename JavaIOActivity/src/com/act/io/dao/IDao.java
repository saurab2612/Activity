package com.act.io.dao;

import java.io.IOException;
import java.util.List;

import com.act.io.service.Employee;

public interface IDao {
	
	public List<Employee> viewEmployee() throws IOException, ClassNotFoundException;
	
	public void addEmployee(Employee emp) throws IOException;

}
