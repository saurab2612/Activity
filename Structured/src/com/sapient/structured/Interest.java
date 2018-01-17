package com.sapient.structured;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the amount");
			double pamt = scan.nextDouble();
			System.out.println("Enter the years");
			int terms = scan.nextInt();
			System.out.println("enter the rate");
			float per = scan.nextFloat();
			
			double simple = calcSimple(pamt, terms, per);
			double compound = calcCompound(pamt, terms, per);
			System.out.println("Simple interest:"+simple);
			System.out.println("Compound interest:"+compound);
			scan.close();
	}
			
	public static double calcSimple(double amt, int years, float rate){
			double si= amt* years * rate /100;
			return si;
	}
			
	public static double calcCompound(double amt, int years, float rate){
			double ci = amt* Math.pow((1+rate/100), years);
			return ci;
	}
}


