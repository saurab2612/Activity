package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoinDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","funappsfb");
		String sql = "select  count(pid) count, max(price) maxsal, min(price) minsal from product p inner join category c on p.cid = c.cat_id group by c.cat_name";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("count"));
			System.out.println(rs.getDouble("maxsal"));
			System.out.println(rs.getDouble("minsal"));
			System.out.println("-------------------------");
		}
	}
}
