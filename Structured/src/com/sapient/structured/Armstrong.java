package com.sapient.structured;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args){
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		boolean res = isArmstrong(num);
		if(res) System.out.println(num+" is an Armstrong number");
		else System.out.println(num+" is not an Armstrong number");
		scan.close();
	}
	
	public static boolean isArmstrong(int num){
        int n = order(num);
        int temp=num;
		double sum=0;
        while (temp!=0)
        {
            int r = temp%10;
            sum = sum + Math.pow(r, n);
            temp = temp/10;
        }
        return (sum == num);
		
	}

	public static int order(int num) {
		int n = 0;
        while (num != 0)
        {
            n++;
            num = num/10;
        }
        return n;
	}
}
