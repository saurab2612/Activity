package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest obj = new Interest();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		obj.amt = scan.nextDouble();
		System.out.println("Enter the years");
		obj.years = scan.nextInt();
		System.out.println("enter the rate");
		obj.rate = scan.nextFloat();
		
		
		
		
		double si = obj.calcSimple();
		double ci = obj.calcCompound();
		System.out.println("Simple interest:"+si);
		System.out.println("Compound interest:"+ci);
		scan.close();
	}

}
