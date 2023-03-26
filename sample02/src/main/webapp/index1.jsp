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

<h3>response</h3>
<%--
// response : 이동
String name = "Tom";
response.sendRedirect("default.jsp?name=" + name + "&age=" + 15);
--%>



<h3>pageContext</h3>
<%--
String name = "성춘향";
int age = 16;
// response.sendRedirect("default.jsp?name=" + name + "&age=" + age);

// 짐싸!
Human human = new Human(name, age);
request.setAttribute("lady", human);

// 잘가! = getRequestDispatcher
pageContext.forward("default.jsp");

--%>

<h3>session</h3>
<%

Human human = new Human("홍두께", 25);

// 짐을 보관해(나중에 찾을꺼임)!
session.setAttribute("man", human);

// 잘가!
response.sendRedirect("default.jsp");



%>






</body>
</html>




