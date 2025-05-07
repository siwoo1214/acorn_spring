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
	<p>${num }단 출력 결과</p>
	<%int i=1; %>
	<c:forEach var="line" items="${list }">
		<p>${num} * <%=i %> = ${line }</p>
		<% i++; %>
	</c:forEach>	
</body>
</html>