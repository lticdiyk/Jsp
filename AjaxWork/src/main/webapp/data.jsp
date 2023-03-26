<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// JDBC -> 데이터를 산출

String name = "홍길동";
int age = 24;
String birth = "2001/06/17";

// json + 내장객체

String str = "{ \"name\":\"" + name + "\", \"age\":" + age + ", \"birth\":\"" + birth + "\" }";

out.println(str);
%>
