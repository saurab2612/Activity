package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoinDemo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","funappsfb");
		String sql = "select c.cat_name, p.pid, p.pname, p.price, p.brand from product p inner join category c on c.cat_id=p.cid";
		PreparedStatement st = conn.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("cat_name"));
			System.out.println(rs.getInt("pid"));
			System.out.println(rs.getString("pname"));
			System.out.println(rs.getDouble("price"));
			System.out.println(rs.getString("brand"));
			
			System.out.println("-------------------------");
		}
	}
}
