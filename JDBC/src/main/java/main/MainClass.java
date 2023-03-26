package main;

import java.util.List;

import db.DBConnection;
import dto.User;
import jdbc.JdbcTest;

public class MainClass {
	public static void main(String[] args) {
		DBConnection.initConnection();
				
	
		
		JdbcTest jt = new JdbcTest();
		
		/*
		String id = "aabbcc";
		String name = "이찬성";
		int age = 35;
		
		boolean b = jt.insert(id, name, age);
		if(b == true) {
			System.out.println("정상적으로 추가되었습니다");
		}
		*/
		
		String id = "aabbcc";
		
		User user = jt.search(id);
		if(user != null) {
			System.out.println(user.toString());
		}else {
			System.out.println("해당하는 정보를 찾을 수 없습니다");
		}
		
		
		List<User> list = jt.select();
		for(User u : list) {
			System.out.println(u.toString());
		}
		/*
		for(int i = 0;i < list.size(); i++) {
			User u = list.get(i);
			
		}
		*/
		
		
		id = "aabbcc";
		String name = "이재범";
		int age = 27;
		
		boolean b1 = jt.update(id, name, age);
		if(b1 == true) {
			System.out.println("정상적으로 수정되었습니다");
		}
		
		
		
		
	}
}






