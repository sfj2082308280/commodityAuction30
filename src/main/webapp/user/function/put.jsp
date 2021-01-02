<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/28
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上架界面</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<form action="/putServlet" method="post" enctype="multipart/form-data">
    <div>
        <label class="name_word">名称：</label>
        <input class="name_text" required="required" type="text" name="name">
    </div>
    <div>
        <label class="introduce_word">介绍：</label>
        <input class="introduce_text" required="required" type="text" name="introduce">
    </div>
    <div>
        <label class="deposit_word">押金：</label>
        <input class="deposit_text" required="required" type="text" name="deposit">
    </div>
    <div>
        <label class="price_word">当前竞拍价：</label>
        <input class="price_text" required="required" type="text" name="price">
    </div>
    <div>
        <label class="startTime_word">开始竞拍日期：</label>
        <input class="startTime_text" required="required" type="text" name="startTime">
    </div>
    <div>
        <label class="endTime_word">结束竞拍日期：</label>
        <input class="endTime_text" required="required" type="text" name="endTime">
    </div>
    <div>
        <label class="endTime_word">图片：</label>
        <input class="image_file"  name="photo" type="file" style=""/>
    </div>
    <div>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>
