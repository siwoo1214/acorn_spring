<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>두 숫자를 입력하세요</h2>
	<form action="calcNums" method="get">
		첫 번째 숫자: <input type="number" name="num1" required><br>
        두 번째 숫자: <input type="number" name="num2" required><br>
		<input type="submit" value="계산">
	</form>
</body>
</html>