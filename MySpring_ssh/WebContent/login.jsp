<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="JavaScript" src="./js/jquery-1.4.2.js"></script>
<title>用户登陆</title>
</head>
<body>
	<s:form action="user_verify" namespace="/" method="post" theme="simple" >
	
		用户名：<s:textfield name="user"/><br/>
		密码：<s:textfield name="pass" type="password"/><s:fielderror fieldName="passError" /><br/>
		验证码：<s:textfield name="vercode"/><s:fielderror fieldName="vercodeError" /><br/>
		<s:submit value = "登录"/>
		<s:reset value="重置"/>
	</s:form>
	<img src="authImg" id="authImg" alt="看不清?请点击刷新验证码" 
				style="cursor : pointer;" onClick="this.src=this.src+'?'+Math.random();" />
	
</body> 

</html>