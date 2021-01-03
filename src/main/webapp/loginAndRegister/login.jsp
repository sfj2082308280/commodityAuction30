
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <base href="<%=basePath %>" />
    <meta charset="utf-8">
    <title>商品竞拍登录界面</title>
    <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        .login{
            position: relative;
        }
        .background{
            position: absolute;
            z-index: 2;
            top: 0;
            left: 0;
            background-size: cover;
            background-repeat: no-repeat;
            background-position: 50%;
            width: 100%;
            height: 600px;
            float: right;
        }
        .log{
            position: absolute;
            width: 200px;
            height: 200px;
            left: 25%;
            top: 200px;
            z-index: 2;
            float: left;
        }
        .login_show{
            z-index: 3;
            width: 20%;
            height: 15%;
            min-height: 100px;
            min-width: 300px;
            position: relative;
            left: 40%;
            top: 200px;
            background-color: rgba(240, 255, 255, 0.5);
            border-radius: 10px;
            padding: 13px;
            text-align: center;
        }
        .name{
            color: #3BD9FF;
            font-size: 32px;
        }
        .account_word,.password_word{
            width: 200px;
            background-color: #3BD9FF;
        }
    </style>
</head>
<body>
<iframe src="../top.html" width="100%" height="100" scrolling="no" frameborder="0"></iframe>
<div class="login">
    <img class="background" src="../img/loginBackground.jpg" >
    <img class="log" src="../img/loginLog2.png" >
    <div class="login_show">
        <form action="loginServlet" method="post">
            <div>
                <span class="name">商品竞拍系统</span>
            </div>
            <div class="type">
                <label class="acount_type">用户</label><input class="account_text" checked type="radio" name="type" value="account">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <label class="administrator_type">管理员</label><input class="administrator_text" type="radio" name="type" value="administrator">
            </div>
            <div class="account">
                <label class="account_word">账号：</label>
                <input class="account_text" required="required" type="text" name="account">
            </div>
            <div class="span1">
                <label class="password_word">密码：</label>
                <input class="password_text" required="required" type="password" name="password">
            </div>
            <input name="" type="submit" class="login_submit" value="登   录">
            <a href="loginAndRegister/register.jsp" target="_parent"><span class="type2">注册</span></a>
        </form>
    </div>
</div>

</body>
</html>
