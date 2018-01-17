package com.sapient.service;

public class Salary {
	private int empId;
	private String empName;
	private double sal;
	private double da;
	private double pf;
	private double netSal;
	public Salary(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public void calcNetSal(){
		calcPf();
		calcDa();
		netSal=sal+da-pf;
	}
	private void calcDa(){
		 da=0.4*sal;
	}
	private void calcPf(){
		pf = 0.12*sal;
	}
	public String display(){
		return empId+" "+empName+" "+sal+" "+netSal;
	}

}
