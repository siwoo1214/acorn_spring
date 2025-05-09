package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;

public class DBTest2 {
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
		ArrayList<Member> list = new ArrayList<>();
		
		while(rs.next()) {   //true, false
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
			Member m = new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			list.add(m);
		}
		
		//ArrayList<Member>
		list.forEach(System.out::println);
		//위에꺼를 다 풀어서 쓴 거 consumer인터페이스 사용하는거
		list.forEach(new Consumer<Member>() {
			@Override
			public void accept(Member t) {
				System.out.println(t);
			}
			
		});
	}
}
