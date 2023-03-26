<%@page import="util.CalendarUtil"%>
<%@page import="dto.CalendarDto"%>
<%@page import="dao.CalendarDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int seq = Integer.parseInt( request.getParameter("seq") );
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
table, th, td{	
	border-collapse : collapse;
	border: rgb(128, 128, 128) solid 1px;	
}
th{
	background-color: rgb(0, 0, 192);
	color: white;
}
td{
	padding: 10px;
}
.content{
	font-size: 24px;
}
</style>
</head>
<body>
<%
CalendarDao dao = CalendarDao.getInstance();
CalendarDto dto = dao.getDay(seq);
%>

<h2>일정보기</h2>
<hr>
<br>

<div align="center">

<table>
<col width="200"><col width="500">
<tr>
	<th>아이디</th>
	<td><%=dto.getId() %></td>
</tr>
<tr>
	<th>제목</th>
	<td><%=dto.getTitle() %></td>
</tr>
<tr>
	<th>일정</th>
	<td><%=CalendarUtil.toDates(dto.getRdate()) %></td>
</tr>
<tr height="300">	
	<td colspan="2" valign="top" class="content"><%=dto.getContent() %></td>
</tr>
</table>
<br>
<button type="button" onclick="calUpdate(<%=dto.getSeq() %>)">수정</button>

<button type="button" onclick="calDelete(<%=dto.getSeq() %>)">삭제</button>
</div>

<script type="text/javascript">
function calUpdate(seq) {
	location.href = "calupdate.jsp?seq=" + seq;
}
function calDelete(seq) {
	location.href = "caldelete.jsp?seq=" + seq;
}
</script>

</body>
</html>











