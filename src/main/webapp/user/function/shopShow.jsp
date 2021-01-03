<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title></title>
	<link rel="stylesheet" type="text/css" href="实验/css/font-awesome.css" />
	<link rel="stylesheet" type="text/css" href="../css/shopShow.css"/>
	<style type="text/css">
		* {
			margin: 0px;
			padding: 0px;
			text-decoration: none;
			list-style: none;
		}

		.shopImg {
			margin-left: 500px;
			vertical-align: middle;
			width: 468px;
			height: 468px;
		}

		.text {

			margin-left: 500px;
			width: 400px;
			height: 600px;
		}

		.text p {
			color: red;
		}

		.money {
			font-size: 24px;
			color: #FF0036;
		}
		.buy{

			background-color: #ffeded;
			border: 1px solid #FF0036;
			color: #FF0036;
			/* width: 178px;
            height: 38px; */
			text-align: center;
			line-height: 38px;
		}
		.shopImg img{
			width: 400px;
			height: 400px;
		}
	</style>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div class="shopShow">
	<div class="shopImg">
		<img src="${sessionScope.path}">
	</div>
	<div class="text">
		<h1>
			${sessionScope.name}
		</h1>
		<div class="money">
			<span>价格</span>
			<span>${sessionScope.price}</span>
		</div>
		<div class="buy">
			<form action="/shopShowServlet">
				<span>交付押金${sessionScope.commodity_deposit}元</span>
				<input type="checkbox" value="deposit" name="deposit">
				<div></div>
				<span>加价竞拍</span><input type="text" name="price"><span>元</span>
				<input type="hidden" name="commodity_deposit" value="${sessionScope.commodity_deposit}"/>
				<input type="hidden" name="commodity_id" value="${sessionScope.commodity_id}"/>
				<input type="hidden" name="name" value="${sessionScope.name}"/>
				<input type="submit" value="立即竞拍">
			</form>
			<!-- <a href=""></a> -->
		</div>
	</div>

</div>
</body>
</html>
