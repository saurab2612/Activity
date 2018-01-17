package com.act.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoQ2 {

	public static void main(String[] args) throws IOException {
		 
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		int sum = 0;
		int count = 0;
		while((str=br.readLine())!=null) {
			sum = sum + Integer.parseInt(str);
			count++;
		}
		System.out.println("sum for data in file = " + sum);
		System.out.println("count for data in file = " + count);
		System.out.println("Avg for data in file = " + findAvg(sum,count));

	}
	
	public static double findAvg(int sum, int count) {
		return sum/count;
	}

}
