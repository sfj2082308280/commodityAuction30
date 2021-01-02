<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/1
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="实验/css/font-awesome.css" />
    <style type="text/css">
        * {
            margin: 0px;
            padding: 0px;
        }

        .title {
            margin-top: 200px;
            margin-left: 200px;
            font-size: 30px;
        }

        table {
            background-color: #EEEEEE;
            margin-left: 200px;
            margin-right: 200px;
            width: 70%;
        }
    </style>
</head>
<body>
<jsp:include page="adMenu.jsp"></jsp:include>
<div class="title">用户账号</div>
<div class="div_table">
    <table rules="all">
        <tr>
            <td align="center" valign="center">账号id</td>
            <td class="title_price" align="center" valign="center">账号</td>
        </tr>
        <c:forEach items="${userList}" var="item">
        <tr>
            <td>
						<span>
							${item.user_id}
						</span>
            </td>
            <td>
                ${item.user_account}
                <!-- <span class="coupon-price-title">¥</span>
                <span class="coupon-price-afterCoupon">24.4</span> -->
            </td>
<%--            <td><a href="/adAccountServlet?run=add&user_id=${item.user_id}">增加</a></td>--%>
            <td><a href="/adAccountServlet?run=del&user_id=${item.user_id}">删除</a></td>
            <td><a href="/adAccountServlet?run=mod&user_id=${item.user_id}">修改</a></td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>