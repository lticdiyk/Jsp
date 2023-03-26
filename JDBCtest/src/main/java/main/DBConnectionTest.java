package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {
	
	public void initConnection() {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success");
		} catch (ClassNotFoundException e) {			
			System.out.println("DB Driver를 찾지 못했습니다");
			e.printStackTrace();
		}		
	}
	
	public Connection getConnection() {
		Connection conn = null;		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
			System.out.println("Connection Success");			
		} catch (SQLException e) {			
			System.out.println("db을 연결하지 못했습니다");
			e.printStackTrace();
		}	
		return conn;
	}
	
	public int insert(String id, String name, int age) {
		
		String sql = " insert into user(id, name, age, joindate) "
				+ "    values('" + id + "', '" + name + "', " + age + ", now()) ";
		
		Connection conn = getConnection();
		Statement psmt = null;
		int count = 0;
		
		try {
			psmt = conn.createStatement();	// 접속 초기화
			
			count = psmt.executeUpdate(sql); // sql 실행
			
			System.out.println("db에 데이터 추가 성공!");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			
			try {
				if(conn != null) {	// db의 후처리
					conn.close();
				}
				if(psmt != null) {
					psmt.close();
				}
			} catch (SQLException e) {				
				e.printStackTrace();
			}			
		}
				
		return count;
	}
	/*
	public int delete() {
		
	}
	public void select() {
		
	}
	public int update() {
		
	}
	*/
}







