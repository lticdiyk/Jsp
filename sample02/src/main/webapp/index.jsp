<%@ page import="java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--
	내장(암시)객체 : 동적으로 할당(생성)하지 않고 (언제든지 바로)사용할 수 있는 객체
	
	out : 웹출력
	request
	response
	session
	pageContext
	application
		:
 --%>
 
<h3>out</h3>

<%
	PrintWriter outt = response.getWriter();
	String title = "hello jsp";
	outt.println("<p>" + title + "</p>");   // = servlet java(html)
%>

<p><%=title %></p>

<h3>request</h3>

<%
// request(요청) : parameter 값을 취득, session을 접근, Object를 전송, encoding 설정 
// HttpServletRequest

	// encoding 설정
	request.setCharacterEncoding("utf-8");

	// parameter 값을 취득
	String name = request.getParameter("name");
%>
<p><%=name %></p>

<%
	String hobby[] = request.getParameterValues("hobby");

	for(int i = 0;i < hobby.length; i++){
	%>
		<p><%=hobby[i] %></p>
	<%	
	}
%>

<%
	// session을 접근
	request.getSession().setAttribute("visited", "1");

	Object obj = request.getSession().getAttribute("visited");
	String str = (String)obj;
	
	outt.println("<h5>" + str + "</h5>");
%>

<h5><%=str %></h5>

</body>
</html>




