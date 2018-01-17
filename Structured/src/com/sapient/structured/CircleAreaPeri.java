package com.sapient.structured;

import java.util.Scanner;

public class CircleAreaPeri {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius of the circle");
		float rad = scan.nextFloat();
		double area =area(rad);
		double peri = perimeter(rad);
		System.out.println("area is"+area);
		System.out.println("perimeter is:"+peri);
		scan.close();
	}
	
	static double area(float rad){
		return (Math.PI*rad*rad);
	}
	
	static double perimeter(float rad){
		double peri= (2* Math.PI *rad);
		return peri;
	}
	
}
