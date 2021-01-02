<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/2
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
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
<div class="title">认证单</div>
<div class="div_table">
    <table rules="all">
        <tr>
            <td align="center" valign="center">产品</td>
            <td class="title_price" align="center" valign="center">竞拍价</td>
        </tr>
        <c:forEach items="${identCommodityList}" var="commodity">
            <tr>
                <td>
                    <img width="100px" height="100px" src="../img/${commodity.commodity_photo}">
                    <span>
                            ${commodity.commodity_name}
                    </span>
                </td>
                <td align="center" valign="center">
                    <span class="coupon-price-title">¥</span>
                    <span class="coupon-price-afterCoupon">${commodity.commodity_price}</span>
                </td>
                    <%--            <td><a href="/adAccountServlet?run=add&user_id=${item.user_id}">增加</a></td>--%>
                <td><a href="/identCommodityServlet?run=del&commodity_id=${commodity.commodity_id}">删除</a></td>
                <td><a href="/identCommodityServlet?run=ident&commodity_id=${commodity.commodity_id}">认证</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>