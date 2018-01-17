package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aggregation3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","funappsfb");
		String sql = "select count(pid) totproducts, sum(price) totsal, avg(price) avgsal from product group by cid";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("totproducts"));
			System.out.println(rs.getDouble("totsal"));
			System.out.println(rs.getDouble("avgsal"));
			System.out.println("-------------------------");
		}
	}
}
