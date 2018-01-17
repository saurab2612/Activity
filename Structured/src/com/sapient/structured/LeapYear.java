package com.sapient.structured;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year:");
		int year = scan.nextInt();
		boolean res = isLeap(year);
		if(res) System.out.println(year+" is a leap year");
		else System.out.println(year+" is not a leap year");
		scan.close();
	}
	
	static boolean isLeap(int year){
		if(year%4==0){
			if(year%100!=0) return true;
			else if(year%100==0 && year%400==0)
				return true;
			else return false;
		}
		else return false;
	}

}
