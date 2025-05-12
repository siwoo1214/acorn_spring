<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- model 로 전달된 이미지 이름 -->
	${img}
	
	<!-- img가져오는 mapping 요청하기 -->
	<!-- pathVariable , path뒤에 값이 전달된다-->
	<!-- /prac4/images/귀여운이미지.jpg -->
	<img alt="아직 완성 안된 이미지" src="<%=request.getContextPath()%>/images/${img}">
</body>
</html>