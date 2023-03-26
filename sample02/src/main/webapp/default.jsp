<%@page import="sample02.Human"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>default.jsp</h1>

<%--
	String name = request.getParameter("name");
--%>
<%-- <p>이름:<%=name %></p> --%>


<%--
	Human human = (Human)request.getAttribute("lady");
--%>
<%-- 
<p>이름:<%=human.getName() %></p>
<p>나이:<%=human.getAge() %></p>
 --%>
 
<%
	// 지금이 나중임
	Human human = (Human)session.getAttribute("man");
%> 
<p>이름:<%=human.getName() %></p>
<p>나이:<%=human.getAge() %></p>

</body>
</html>




