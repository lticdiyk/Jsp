<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>

<%--
		AJAX : Asynchronous Javascript And Xml(Json)
				비동기
 --%>
 
<p id="demo"></p>

<button type="button">button</button>

<script type="text/javascript">
$(document).ready(function() {
	
	$("button").click(function() {
		
		// $("#demo").load("data.jsp");
		
		// $("#demo").load("data.jsp #data1");
		
		// $("#demo").load("data.jsp", "txt1=abc&txt2=가나다");
		
		// $("#demo").load("data.jsp", { txt1:"ABC", txt2:"라마바" });
		
		$("#demo").load(
				"data.jsp",
				{ txt1:"ABC", txt2:"라마바" },
				function (data, status, xhr) {
					alert('success');
					// alert(data);
					// alert(xhr);
				}
		);
	});	
	
});
</script>


</body>
</html>





