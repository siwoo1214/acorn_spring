<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function reg(){
		alert("asd");
		let id = $("#id").val();   //document.querySelector("#id").value
		let pw = $("#pw").val();
		let name = $("#name").val();
		
		let member = {"id":id, "pw":pw, "name":name};
		console.log(member);
		
		$.ajax({
			type:"post",
			url:"/prac4/members",
			data:JSON.stringify(member),
			contentType:"application/json",
			success:function(data){
				console.log(data);
			},
			error:function(error){
				console.log(error);
			}
		})
	}
</script>
</head>
<body>
	<input type="text" id="id">
	<input type="text" id="pw">
	<input type="text" id="name">
	
	<button onclick="reg()">등록하기</button>
</body>
</html>