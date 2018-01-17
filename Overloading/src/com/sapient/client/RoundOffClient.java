package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.RoundOff;

public class RoundOffClient {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		double num = scn.nextDouble();
		System.out.println("select 1 for 2 decimal places\n 2 for n decimal places");
		int val = scn.nextInt();
		if(val==1){
			RoundOff.rounding(num);
		}
		else if(val==2){
			System.out.println("enter no of places to round off");
			int n = scn.nextInt();
			RoundOff.rounding(num,n);	
		}
		else System.out.println("invalid");
		
		
	}

}
