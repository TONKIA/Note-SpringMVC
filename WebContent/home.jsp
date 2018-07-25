<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/SpringMVC/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#btn").click(func);
	});
	var func = function() {
		var prdId = $("input[name=prdId]").val();
		if (prdId) {
			$.get("/SpringMVC/product/getInfoById", {
				"prdId" : prdId
			}, function(data) {
				if (data) {
					var info = data.productName + ' : ' + data.price
					$("#res").html(info);
				}
			}, "json");
		}
	};
</script>
</head>
<body>
	欢迎,${user.userName}
	<br /> 产品ID:
	<input type="text" name="prdId" />
	<button id="btn">查询</button>
	<div id="res"></div>
	<img alt="img" src="/SpringMVC/img/img.jpg" style="width: 400px">
</body>
</html>