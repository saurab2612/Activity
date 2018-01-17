package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewByPriceRange {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","funappsfb");
		String sql = "select * from product where price between ? and ?";
		PreparedStatement st = conn.prepareStatement(sql);
		Scanner scn = new Scanner(System.in);
		System.out.println("enter min price");
		Double minPrice = scn.nextDouble();
		System.out.println("enter max price");
		Double maxPrice = scn.nextDouble();
		st.setDouble(1, minPrice);
		st.setDouble(2, maxPrice);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("pid"));
			System.out.println(rs.getString("pname"));
			System.out.println(rs.getDouble("price"));
			System.out.println(rs.getString("brand"));
			System.out.println(rs.getInt("cid"));
			System.out.println("-------------------------");
		}
		scn.close();

	
	}

}
