<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Home</title></head>
<body>
    <c:choose>
        <c:when test="${not empty loginUser}">
            <h2>환영합니다, ${loginUser.name}님!</h2>
            <a href="logout">로그아웃</a>
        </c:when>
        <c:otherwise>
            <h2>로그인이 필요합니다</h2>
            <a href="login">로그인</a>
        </c:otherwise>
    </c:choose>
    <a href="join">회원가입</a>
</body>
</html>
