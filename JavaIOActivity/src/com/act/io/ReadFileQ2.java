package com.act.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileQ2 {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		int countWord = 0;
		int countLine = 0;
		while((str=br.readLine())!=null) {
			String[] strArr = str.split(" ");
			countWord = countWord + strArr.length;
			countLine++;
		}
		
		System.out.println("Count of line in the file "+ countLine);
		System.out.println("Count of word int the file "+ countWord);
		
		br.close();

	}
	
	

}
