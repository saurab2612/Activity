package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.LeapYear;

public class LeapYearClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LeapYear lp = new LeapYear();
		System.out.println("enter the year:");
		lp.year = scan.nextInt();
		boolean res = lp.isLeap();
		if(res) System.out.println(lp.year+" is a leap year");
		else System.out.println(lp.year+" is not a leap year");
		scan.close();
	}

}
