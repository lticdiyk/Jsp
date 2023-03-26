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

<p id="name"></p>
<p id="age"></p>
<p id="birth"></p>
<br>
<button type="button">button</button>

<script type="text/javascript">
$(function () {
	
	$("button").click(function(){
		
		$.ajax({
			url:"data.jsp",
			type:"get",
			datatype:"json",
			success:function(data){
				// alert('success');
				// alert(data.trim());
				
				let json = JSON.parse(data);
			//	alert(json);
				
				$("#name").text(json.name);
				$("#age").text(json.age);
				$("#birth").text(json.birth);
			
			},
			error:function(){
				alert('error');	
			}
		});
		
	});
});
</script>


</body>
</html>




