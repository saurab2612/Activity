package com.act.io.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	private static ResourceBundle rb;
	private static IDao dao;
	
	static{
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname"));//load the class 
			dao = (IDao)cls.newInstance();//create instance
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static IDao getDaoInstance(){
		return dao;
	}

}
