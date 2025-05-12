<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action = "<%=request.getContextPath() %>/upload" method="post" enctype="multipart/form-data">
		상품이름 : <input type="text" name = "goodsname">
		<input type="file" name="file">
		<button>등록</button>
	</form>

</body>
</html>