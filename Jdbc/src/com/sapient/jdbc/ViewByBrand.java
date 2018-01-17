package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewByBrand {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(url,"system","funappsfb");
			String sql = "select * from product where brand=?";
			PreparedStatement st = conn.prepareStatement(sql);
			Scanner scn = new Scanner(System.in);
			System.out.println("enter brand");
			String str = scn.nextLine();
			st.setString(1, str);
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

