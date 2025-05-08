<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>단 출력하기</title>
</head>
<body>

<% int num = (Integer) request.getAttribute("num"); %>

<h2><%=num %>단 출력하기</h2>
<ul>
    <% 
        for (int j = 1; j <= 9; j++) { 
    %>
        <li><%= num %> x <%= j %> = <%= num * j %></li>
    <% } %>
</ul>

</body>
</html>