<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function update(){
		alert("update funbction");
		
		let id = $("#id").val();
		let pw = $("#pw").val();
		let name = $("#name").val();
		let member = {"id":id, "pw":pw, "name":name}
		console.log(member);
		
		let memberStr = JSON.stringify(member);
		console.log(memberStr);
		
		//$.ajax
		
		$.ajax({
			type:"PUT",
			url:"/prac4/members/"+id,
			data:memberStr,
			contentType:"application/json",
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
	<input type="text" id="pw">
	<input type="text" id="name">
	<button onclick="update()">변경하기</button>
</body>
</html>