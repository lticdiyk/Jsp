package com.example.ajax03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dto.Human;
import org.json.JSONObject;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HelloServlet doGet()");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		System.out.println("id:" + id + " pw:" + pw);
		
		// String
		/*
		String str = "안녕하세요";
		
		JSONObject jObj = new JSONObject();
		jObj.put("str", str);
		
		resp.setContentType("application/x-json; charset=utf-8");
		resp.getWriter().print(jObj);
		*/
		
		// Object
		
		// dto
		/*
		Human human = new Human("홍길동", 24);
		
		JSONObject jObj = new JSONObject();
		jObj.put("human", human);
		
		resp.setContentType("application/x-json; charset=utf-8");
		resp.getWriter().print(jObj);
		*/
		
		// list
		/*
		List<Human> list = new ArrayList<Human>();
		list.add(new Human("홍길동", 24));
		list.add(new Human("성춘향", 16));
		list.add(new Human("홍두께", 22));
		
		JSONObject jObj = new JSONObject();
		jObj.put("list", list);
		
		resp.setContentType("application/x-json; charset=utf-8");
		resp.getWriter().print(jObj);
		*/
		
		
		// Map
		String str = "안녕하세요";
		
		List<Human> list = new ArrayList<Human>();
		list.add(new Human("홍길동", 24));
		list.add(new Human("성춘향", 16));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", str);
		map.put("mylist", list);

		JSONObject jObj = new JSONObject();
		jObj.put("map", map);


		
		resp.setContentType("application/x-json; charset=utf-8");
		resp.getWriter().print(jObj);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
}


