package com.sapient.structured;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scn.nextInt();
		BigInteger fact = doFact(num);
		System.out.println("factorial is:"+fact);
		scn.close();
	}
	
	public static BigInteger doFact(int num){
		BigInteger fact = BigInteger.ONE;
		for(int i=1;i<=num;i++){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}


