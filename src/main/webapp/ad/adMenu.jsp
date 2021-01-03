<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/1
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
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
        *{
            margin: 0px;
            padding: 0;
            text-decoration: none;
            list-style: none;
        }
        .right_show{
            width: 100%;
            border: #9B9B9B 1px solid;
            background-color: #9B9B9B;
            height: 30px;

        }
        .show_1 li{
            display: inline-block;
            /* margin-top: 50px; */
            /* border: #9B9B9B 1px solid; */
            font-size: 20px;
            text-align:center;
        }
        .show_2{
            z-index: 100;
            position: absolute;
            /* left: 250px; */
            top: -25px;
            /* height: 500px; */
            margin-top: 50px;
            /* border: #9B9B9B 1px solid; */
            font-size: 20px;
            text-align:center;
        }
        .show_2 li{
            display: block;
        }
        .menu{
            height: 50px;
            font-size: 20px;
            text-align:center;
        }
        .my li a{
            /* height: auto; */
            /* width: 100px; */
            /* border: #9B9B9B 1px solid; */
            font-size: 20px;
            /* text-align:center; */
            top: 50px;
        }
        .my .show_2{

            display: none;
            background-color: #9B9B9B;
            /* border: #EEEEEE solid 1px; */
        }
        .my:hover .show_2{
            display: block;
        }
        .drop_list5 .borderRed{
            border: gold 100px solid;
        }
        .out{
            float: right;
        }
    </style>
</head>
<body>
<div class="right_show">
    <ul class="show_1">
        <li><a href="/adMenuServlet?path=1">用户账号管理</a></li>
        <li><a href="/adMenuServlet?path=2">商品管理</a></li>
        <li><a href="/adMenuServlet?path=3">认证竞拍品</a></li>
        <li><a href="/adMenuServlet?path=5">押金管理</a></li>
        <li class="out"><a href="/adMenuServlet?path=4"><h4 align="right">退出登录</h4></a></li>

        <div></div>
    </ul>
</div>

</body>

</html>

