package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aggregation1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","funappsfb");
		String sql = "select count(pid) totproducts, max(price) maxsal, min(price) minsal from product";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("totproducts"));
			System.out.println(rs.getDouble("maxsal"));
			System.out.println(rs.getDouble("minsal"));
			System.out.println("-------------------------");
		}
		conn.close();
	}
}
