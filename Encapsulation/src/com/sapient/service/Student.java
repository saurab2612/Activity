package com.sapient.service;

public class Student {
	private int stuId;
	private String stuName;
	private int eng;
	private int maths;
	private int sci;
	private int lang;
	private int social;
	
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	private int calTot(){
		return eng+maths+sci+lang+social;
	}
	private double calAvg(){
		return calTot()/5.0;
	}
	public String display(){
		return stuId+" "+stuName+" "+calTot()+" "+calAvg();
	}

}
