package com.sapient.service;

public class RoundOff {
	public static void rounding(double num){
		System.out.printf("%.2f",num);
	}
	public static void rounding(double num, int n){
		double val = Math.pow(10, n);
		num = Math.round(num*val)/val;
		System.out.printf("%f",num);
	}
}
