package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.User;

public class JdbcTest {

	// insert
	public boolean insert(String id, String name, int age) {
		
		String sql = " insert into user(id, name, age, joindate) "
				+ "    values(?, ?, ?, now()) ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();		
		
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, name);
			psmt.setInt(3, age);
			
			count = psmt.executeUpdate();
			
			System.out.println("성공적으로 추가되었습니다");
			
		} catch (SQLException e) {	
			System.out.println("추가되지 않았습니다");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, null);
		}
		
		return count>0?true:false;		
	}
	
	// delete
	
	// select
	// 1개(object)의 데이터 취득
	public User search(String id) {
		
		String sql = " select id, name, age, joindate  "
				+ "    from user "
				+ "    where id = ? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		User user = null;
				
		try {
			conn = DBConnection.getConnection();
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String _id = rs.getString("id");
				String _name = rs.getString("name");
				int _age = rs.getInt("age");
				String _joindate = rs.getString("joindate");
				
				user = new User(_id, _name, _age, _joindate);
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return user;
	}
	
	// 다수의 데이터를 취득
	public List<User> select() {
		
		String sql = " select id, name, age, joindate "
				+ "    from user ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<User> list = new ArrayList<User>();
				
		try {
			conn = DBConnection.getConnection();
				
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String _id = rs.getString(1);
				String _name = rs.getString(2);
				int _age = rs.getInt(3);
				String _joindate = rs.getString(4);
				
				User user = new User(_id, _name, _age, _joindate);
				
				list.add(user);
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return list;
	}
		
	// update
	public boolean update(String id, String name, int age) {
		
		String sql = " update user "
				+ "    set name=?, age=? "
				+ "    where id=? ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
				
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setInt(2, age);
			psmt.setString(3, id);
			
			count = psmt.executeUpdate();						
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, null);
		}
		
		return count>0?true:false;
	}
}







