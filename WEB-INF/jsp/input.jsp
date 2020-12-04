<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head><title>商品登録</title></head>
<body>
<h1>商品登録</h1>
<form method='post' action='add'>
	<div hidden>
		商品番号<input type='text' name='pid' value="1"><br>
	</div>
	商品名<input type='text' name='name'><br>
	価格<input type='text' name='price'><br>
	<input type='submit' value='登録'>
</form>
</body>
</html>