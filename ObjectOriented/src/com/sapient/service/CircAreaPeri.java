package com.sapient.service;

public class CircAreaPeri {
	public float rad;
	public double area(){
		return (Math.PI*rad*rad);
	}
	
	public double perimeter(){
		double peri= (2* Math.PI *rad);
		return peri;
	}
}
