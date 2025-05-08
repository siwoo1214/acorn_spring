<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/addBook" method="post">
		이름 : <input type="text" name="name"><br>
		숙박 일 수 : <input type="number" name="days"><br>
		가격 : <input type="number" name="price"><br>
		<button type="submit">예약하기</button>
	</form>
</body>
</html>