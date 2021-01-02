<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/2
  Time: 16:20
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
<jsp:include page="../menu.jsp"></jsp:include>
<form action="/myModCommodityServlet" method="get">
    <div>
        <label class="name_word">名称：</label>
        <input class="name_text"  type="text" name="name" value="${myModCommodity.commodity_name}" required="required">
    </div>
    <div>
        <label class="introduce_word">介绍：</label>
        <input class="introduce_text" type="text" name="introduce" value="${myModCommodity.commodity_introduce}" required="required">
    </div>
    <div>
        <label class="endTime_word">结束竞拍日期：</label>
        <input class="endTime_text"  type="text" name="endTime" value="<fmt:formatDate value="${myModCommodity.commodity_endTime}" pattern="yyyy-MM-dd"></fmt:formatDate>" required="required">
    </div>
    <div>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>
