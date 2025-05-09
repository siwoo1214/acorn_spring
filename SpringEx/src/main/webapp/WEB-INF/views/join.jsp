<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>로그인</title></head>
<body>
    <form action="login" method="post">
        <label>아이디: <input type="text" name="id" /></label><br/>
        <label>비밀번호: <input type="password" name="password" /></label><br/>
        <input type="submit" value="로그인" />
    </form>
    <c:if test="${not empty msg}">
        <p style="color:red;">${msg}</p>
    </c:if>
</body>
</html>
