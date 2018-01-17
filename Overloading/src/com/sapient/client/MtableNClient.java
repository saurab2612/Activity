package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.MtableN;

public class MtableNClient {
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		try {
			MtableN obj = new MtableN(scn.nextInt());
			System.out.println(" 1 for default\n 2 for n rows\n 3 for start and end");
			int ch = scn.nextInt();
			if(ch==1)
				obj.display();
			else if(ch==2){
				System.out.println("enter no of rows");
				int n = scn.nextInt();
				obj.display(n);
			}
			else if(ch==3){
				System.out.println("enter start and end rows");
				int start = scn.nextInt();
				int end = scn.nextInt();
				obj.display(start, end);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scn.close();
	}
}
