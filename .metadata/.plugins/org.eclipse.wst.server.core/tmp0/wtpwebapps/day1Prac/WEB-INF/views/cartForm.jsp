<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>장바구니 수정</title>
</head>
<body>
    <h2>장바구니 수정 </h2>

    <form action="${pageContext.request.contextPath}/cart/update" method="post">
        <fieldset style="margin-bottom: 20px;">
            <legend>상품 샘플 1</legend>
			<input type="hidden" name="items[0].productId" value="101" />
			<input type="number" name="items[0].quantity" value="2" />
			<input type="text" name="items[0].option" value="Red" />
        </fieldset>

        <fieldset style="margin-bottom: 20px;">
            <legend>상품 2</legend>
             <input type="hidden" name="items[1].productId" value="102" />
			<input type="number" name="items[1].quantity" value="1" />
			<input type="text" name="items[1].option" value="Blue" />

        </fieldset>

        <button type="submit">장바구니 업데이트</button>
    </form>
</body>
</html>
