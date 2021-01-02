<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/1
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<form action="/userMsgServlet">
    <div>
        <label class="account_word">账号：</label>
        <input class="account_text" type="text" name="account" value="${user.user_account}">
    </div>
    <div>
        <label class="password_word">密码：</label>
        <input class="password_text" type="password" name="password" value="${user.user_password}">
    </div>
    <div>
        <label class="IDcard_word">IDcard：</label>
        <input class="IDcard_text" type="text" name="IDcard" value="${user.user_idCard}">
    </div>
    <div>
        <label class="phone_word">phone：</label>
        <input class="phone_text" type="text" name="phone" value="${user.user_phone}">
    </div>
    <div>
        <label class="address_word">地址：</label>
        <input class="address_text" type="text" name="address" value="${user.user_address}">
    </div>
    <div>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>
