<%@ page import="bean.Commodity" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <style type="text/css">
        * {
            padding: 0px;
            margin: 0px;
            list-style: none;
            text-decoration: none;
        }

        .shop img {
            background-color: red;
            width: 200px;
            height: 200px;
        }

        div ul .shop_li {
            width: 236px;
            height: 368px;
            display: inline-block;
            vertical-align: top;
        }

        .shop a {
            width: 234px;
            height: 366px;
            display: inline-block;
            box-sizing: border-box;
            padding: 22px 20px 0;
            border: #EEEEEE;
            border: 1px solid #f2f2f2;
            position: relative;
        }
        .shop .borderRed{
            border: 1px solid red;
        }
        .coupon-price-title,
        .coupon-price-afterCoupon {
            display: inline-block;
            color: #fd3f31;
            font-size: 18px;
        }

        .coupon-price-old {
            font-size: 14px;
            color: #9b9b9b;
            text-decoration: line-through;
        }

        .shop .shop_ul li .title-text{
            vertical-align: middle;
            white-space: normal;
            line-height: 20px;
            cursor: pointer;
            overflow: hidden;
            color: #9b9b9b;
            padding: 22px 20px 0;
        }
        .num {
            position: absolute;
            border-top: 1px solid #f2f2f2;
            top: 340px;

        }
        .price{
            position: absolute;
            border-top: 1px solid #f2f2f2;
            top: 310px;
        }
        .text-size{
            position: absolute;
            overflow:hidden;
            width: 200px;
            height: 80px;
            word-break: normal;
        }
    </style>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div class="shop">
    <ul class="shop_ul">
        <c:forEach items="${commodityLink}" var="commodity">
            <li class="shop_li">
                <a class="shop_a" href="/shopServlet?path=../../img/${commodity.commodity_photo}&name=${commodity.commodity_name}&price=${commodity.commodity_price}&commodity_id=${commodity.commodity_id}&commodity_deposit=${commodity.commodity_deposit}">
                    <img class="shop_img" src="../../img/${commodity.commodity_photo}" alt="">
                    <div class="text-size">
                        <span class="title-text">${commodity.commodity_name}</span>
                    </div>
                    <div class="price">
                        <span class="coupon-price-title">¥</span>
                        <span class="coupon-price-afterCoupon">${commodity.commodity_price}</span>
                    </div>
                    <div class="num">
                        <div class="item-tags"></div>
                        <div class="sell-info">${commodity.commodity_introduce}</div>
                    </div>
                </a>
            </li>
        </c:forEach>
    </ul>
</div>
<script src="../../js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../../js/shop.js" type="text/javascript" charset="utf-8"></script>
</body>

</html>
