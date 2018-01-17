package com.sapient.client;

import java.math.BigInteger;
import java.util.Scanner;

import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		Factorial fct = new Factorial();
		fct.num = scn.nextInt();
		
		BigInteger fact = fct.doFact();
		System.out.println("factorial is:"+fact);
		scn.close();
	}

}
