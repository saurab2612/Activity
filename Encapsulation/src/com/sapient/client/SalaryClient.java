package com.sapient.client;

import com.sapient.service.Salary;

public class SalaryClient {

	public static void main(String[] args) {
		Salary e1 = new Salary(1001,"amar",2000);
		Salary e2 = new Salary(1002,"rama",3000);
		Salary e3 = new Salary(1003,"shyam",4000);
		e1.calcNetSal();
		e2.calcNetSal();
		e3.calcNetSal();
		System.out.println(e1.display());
		System.out.println(e2.display());
		System.out.println(e3.display());
		
	}

}
