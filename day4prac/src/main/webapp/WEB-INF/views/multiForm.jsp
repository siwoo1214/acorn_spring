<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/uploadMulti" method="post" enctype="multipart/form-data">
		<input type="text" name="goodsname">
		<input type="file" name="a">
		<input type="file" name="a">
		<button>등록하기</button>
	</form>
</body>
</html>