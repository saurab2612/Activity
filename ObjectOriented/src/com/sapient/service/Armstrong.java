package com.sapient.service;

public class Armstrong {
	public boolean isArmstrong(int num){
        int n = order(num);
        int temp=num;
		double sum=0;
        while (temp!=0)
        {
            int r = temp%10;
            sum = sum + Math.pow(r, n);
            temp = temp/10;
        }
        return(sum == num); 
		
	}
	private int order(int num) {
		int n = 0;
        while (num != 0)
        {
            n++;
            num = num/10;
        }
        return n;
	
	}
}
