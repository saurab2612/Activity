package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.CircAreaPeri;

public class CircAreaPeriClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CircAreaPeri cir = new CircAreaPeri();
		System.out.println("enter radius of the circle");
		cir.rad = scan.nextFloat();
		double area =cir.area();
		double peri = cir.perimeter();
		System.out.println("area is"+area);
		System.out.println("perimeter is:"+peri);
		scan.close();
	}
}
