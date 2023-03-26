<%@page import="dao.MemberDao"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	System.out.println("id:" + id); 

	MemberDao dao = MemberDao.getInstance();
	boolean b = dao.getId(id);

	PrintWriter outt = response.getWriter();
	outt.println("Hello, World!");

	if(b == true){	// id 있음
		outt.println("NO");
	}else{
		outt.println("YES");
	}
%>


