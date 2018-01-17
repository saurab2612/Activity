package com.sapient.service;

import java.math.BigInteger;

public class Factorial {
	public int num;
	public  BigInteger doFact(){
		BigInteger fact = BigInteger.ONE;
		for(int i=1;i<=num;i++){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}
