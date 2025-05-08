<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>오늘의 추천메뉴</h2>
	<c:forEach var="item" items="${foods}">
		${item}
	</c:forEach>
	<p>중에서도 특히 ${food}(을)를 추천드립니다</p>
	<p>${map}</p>
</body>
</html>