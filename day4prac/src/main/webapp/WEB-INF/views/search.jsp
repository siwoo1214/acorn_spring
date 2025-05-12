<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	function search(){
		$.ajax({
			type:"GET",
			url:"/prac4/members",
			success:function(data){
				console.log(data);
				
			},
			error:function(err){
				console.log(err);
			}
		})
	}
</script>
</head>
<body>
	<h2>결과</h2>
	<div class="result"></div>
	
	<button onclick="search()">고객 조회하기</button>
</body>
</html>