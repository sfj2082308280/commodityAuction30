<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/1
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>
<jsp:include page="adMenu.jsp"></jsp:include>
<form action="/modCommodityServlet" method="get">
    <div>
        <label class="name_word">名称：</label>
        <input class="name_text"  type="text" name="name" value="${modCommodity.commodity_name}" required="required">
    </div>
    <div>
        <label class="introduce_word">介绍：</label>
        <input class="introduce_text" type="text" name="introduce" value="${modCommodity.commodity_introduce}" required="required">
    </div>
    <div>
        <label class="deposit_word">押金：</label>
        <input class="deposit_text"  type="text" name="deposit" value="${modCommodity.commodity_deposit}" required="required">
    </div>
    <div>
        <label class="price_word">当前竞拍价：</label>
        <input class="price_text"  type="text" name="price" value="${modCommodity.commodity_price}" required="required">
    </div>
    <div>
        <label class="startTime_word">开始竞拍日期：</label>
        <input class="startTime_text"  type="text" name="startTime" value="<fmt:formatDate value="${modCommodity.commodity_startTime}" pattern="yyyy-MM-dd"></fmt:formatDate>" required="required">
    </div>
    <div>
        <label class="endTime_word">结束竞拍日期：</label>
        <input class="endTime_text"  type="text" name="endTime" value="<fmt:formatDate value="${modCommodity.commodity_endTime}" pattern="yyyy-MM-dd"></fmt:formatDate>" required="required">
    </div>
    <div>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>
