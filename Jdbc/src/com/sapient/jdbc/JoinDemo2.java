package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JoinDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","funappsfb");
		String sql = "select  p.pid, p.pname, p.price, p.brand from product p inner join category c on c.cat_id=p.cid where cat_name = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		Scanner scn = new Scanner(System.in);
		System.out.println("enter category name");
		String cname = scn.nextLine();
		st.setString(1, cname);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("pid"));
			System.out.println(rs.getString("pname"));
			System.out.println(rs.getDouble("price"));
			System.out.println(rs.getString("brand"));
			
			System.out.println("-------------------------");
		}
		scn.close();
	}
}
