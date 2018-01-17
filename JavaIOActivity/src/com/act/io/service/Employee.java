package com.act.io.service;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int empId;
	private String empName;
	private double sal; 
	
	
	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}


	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public double getSal() {
		return sal;
	}
	
	
	
	

}
