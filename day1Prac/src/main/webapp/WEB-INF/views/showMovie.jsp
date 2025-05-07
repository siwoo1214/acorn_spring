<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>영화 목록</title>
</head>
<body>
    <h2>내가 본 영화 목록</h2>
    <c:forEach var="movie" items="${list}">
        <p>제목: ${movie.title}, 감독: ${movie.director}, 러닝타임: ${movie.runtime}</p>
    </c:forEach>
</body>
</html>