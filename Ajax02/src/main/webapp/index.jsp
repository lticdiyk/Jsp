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

<p id="demo"></p>
<button type="button">button</button>

<script type="text/javascript">

	$("button").click(function(){
		
		$.ajax({ 
			// 송신
			url:"data.json",		// 어디로 갈지?
			type:"get",				// 형식
			datatype:"json",		// 타입
			
			// 수신
			success:function(data){
				// alert('success');
				// alert(data);
				// alert(JSON.stringify(data));
				
				for(i = 0;i < data.length; i++){
					$("#demo").append((i + 1) + " ");
					$("#demo").append(data[i].name + " ");
					$("#demo").append(data[i].age + " ");
					$("#demo").append(data[i].address + " ");
					$("#demo").append(data[i].phone + "<br>");
				}
				
			},
			error:function(){
				alert('error');	
			}			
		});
	});


</script>


</body>
</html>