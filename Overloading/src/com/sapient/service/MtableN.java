package com.sapient.service;

public class MtableN {
	private int number;
	public MtableN(int number) throws Exception{
		if(number<=0)
			throw new Exception("number must be positive");
		this.number = number;
	}
	public void display(){
		showTable(0,10);
	}
	public void display(int rows){
		showTable(1,rows);
	}
	public void display(int start,int end) throws Exception{
		if(end>0 && start>0 && end>=start)
			showTable(start, end);
		else throw new Exception("start and end should be positive and start should be greater than end");
	}
	private void showTable(int start,int end){
		for(int i=start;i<=end;i++){
			System.out.printf("%d * %d = %d\n",number,i,number*i);
		}
	}
}
