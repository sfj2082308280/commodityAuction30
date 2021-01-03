<%@ page import="service.CommodityService" %>
<%@ page import="bean.Commodity" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/31
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>竞拍单</title>
    <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        .title{
            margin-top: 200px;
            margin-left: 200px;
            font-size: 30px;
        }
        table{
            background-color: #EEEEEE;
            margin-left: 200px;
            margin-right: 200px;
            width: 70%;
        }
    </style>
</head>
<body>
<jsp:include page="../menu.jsp"></jsp:include>
<div class="title">上架单</div>
<div class="div_table">
    <table rules="all">
        <tr>
            <td align="center" valign="center">产品</td>
            <td class="title_price" align="center" valign="center">竞拍价</td>
            <td class="title_price" align="center" valign="center">认证</td>
        </tr>
        <%--        <c:forEach items="${bidList}" var="bid">--%>
        <c:forEach items="${myCommodity}" var="commodity">
            <c:if test="${user.user_id==commodity.seller_id}">
                <tr>
                    <td>
                        <img width="100px" height="100px" src="../../../img/${commodity.commodity_photo}">
                        <span>
                                ${commodity.commodity_name}
                        </span>
                    </td>
                    <td align="center" valign="center">
                        <span class="coupon-price-title">¥</span>
                        <span class="coupon-price-afterCoupon">${commodity.commodity_price}</span>
                    </td>
                    <td align="center" valign="center">
                        <c:if test="${1<=commodity.commodity_ident}">
                        <span class="coupon-price-afterCoupon">认证通过</span>
                        </c:if>
                        <c:if test="${0>=commodity.commodity_ident}">
                            <span class="coupon-price-afterCoupon">认证中</span>
                        </c:if>
                    </td>
                    <td align="center" valign="center">
                        <a href="/myCommodityServlet?modOrDel=del&commodity_id=${commodity.commodity_id}">下架</a>
                    </td>
                    <td align="center" valign="center">
                        <a href="/myCommodityServlet?modOrDel=mod&commodity_id=${commodity.commodity_id}">修改</a>
                    </td>
                </tr>
            </c:if>
        </c:forEach>
        <%--        </c:forEach>--%>

    </table>
</div>
</body>
</html>
