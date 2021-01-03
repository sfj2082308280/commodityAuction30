<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
<%--		<%--%>
<%--			String path = request.getContextPath();--%>
<%--			String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";--%>
<%--		%>--%>
<%--		<base href="<%=basePath %>" />--%>
		<meta charset="utf-8">
		<title>商品竞拍注册界面</title>
	<script>
		// function validate() {
		// 	var account =document.getElementById("account").value;
		// 	var password =document.getElementById("password").value;
		// 	console.log(account);
		// 	//验证邮箱合法
		// 	// alert(email);
		// 	// alert(password);
		// 	// var pattern=/^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
		// 	if(account==''){
		// 		alert("account不能为空!");
		// 		return false;
		// 	}else if(account.length<6||account.length>12){
		// 		alert("account长度在6-8个字符之间!");
		// 		return false;
		// 	}
		// 	//验证password
		// 	if(password=='') {
		// 		alert("password不能为空!");
		// 		return false;
		// 	}else if(password.length<6||password.length>12){
		// 		alert("密码长度在6-8个字符之间!");
		// 		return false;
		// 	}
		// 	return true;
		// }
		var xhr=new XMLHttpRequest();
		function ajaxValidate(accountObj) {
			var url="../registerAjaxServlet";
			var content="type=accountAjaxValidate&account="+accountObj.value;
			xhr.open("POST",url,true);
			xhr.onreadystatechange=function () {
				if(xhr.readyState==4&&xhr.status==200){
					var responseObj=eval("("+xhr.responseText+")")
					document.getElementById("accountValidate").innerHTML=
							responseObj.reg;
				}
			};
			xhr.setRequestHeader("Content-Length",content.length);
			xhr.setRequestHeader("CONTENT-TYPE",
					"application/x-www-form-urlencoded");
			xhr.send(content);
		}
	</script>
	</head>
	<body>
		<form action="/registerServlet" method="get">
			<div class="register">
				<div class="account">
					<input id="account" required="required" placeholder="请填写账号" class="account_text" type="text" name="account" onblur="ajaxValidate(this)">
					<label style="color: #ff0000"  id="accountValidate"></label>
				</div>
				<div class="password">
					<input id="password" required="required" placeholder="请填写密码" class="password_text" type="password" name="password">
				</div>
				<div class="idCard">
					<input id="idCard" required="required" placeholder="请填写身份证" class="idCard_text" type="text" name="idCard">
				</div>
				<div class="phone">
					<input id="phone" required="required" placeholder="请填写手机号" class="phone_text" type="text" name="phone">
				</div>
				<div class="address">
					<input id="address" required="required" placeholder="请填写收货地址" class="address_text" type="text" name="address">
				</div>
				<input type="submit" name="register" value="注 册"  />
				<a href="/registerServlet">返 回</a>
			</div>
		</form>

	</body>
</html>
