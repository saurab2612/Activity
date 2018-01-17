package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Armstrong;

public class ArmstrongClient {
	public static void main(String[] args){
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		Armstrong arm = new Armstrong();
		boolean res=arm.isArmstrong(num);
		if(res) System.out.println(num+" is an Armstrong number");
		else System.out.println(num+" is not an Armstrong number");
		scan.close();
	}
}
