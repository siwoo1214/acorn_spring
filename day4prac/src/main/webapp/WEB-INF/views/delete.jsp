<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function delete1(){
		alert("delete");
		let id = $("#id").val();
		console.log(id);
		
		$.ajax({
			type:"delete",
			url:"/prac4/members/"+id,
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
	<input type="text" id="id">
	
	<button onclick="delete1()">삭제하기</button>
</body>
</html>