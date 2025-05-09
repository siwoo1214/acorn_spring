package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {		 
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="1234";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,password);
		
		if(con!=null) {
			System.out.println("DB ok!");
		}
		
		//연결되었다면 sql작성
		String sql = "select * from member_tbl_11";
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {   //true, false
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
		
		//ArrayList<Member>
	}
}
