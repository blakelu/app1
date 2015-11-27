<%@ page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script language="JavaScript" src="./js/jquery-1.7.2.js"></script>

<title>用户注册</title>

</head>
<body>
	<center>
		<h3>请输入注册信息</h3>
		<s:actionerror />
		<s:form method="post" action="user_regist" namespace="/" theme="simple">
			<table>
				<tr>
					<td>用户名：</td>
					<td><s:textfield name="user" id="user" /> <span
						class='formtips onSuccess' id="userErrorInfo"
						style="display: none;">可以注册</span> <span
						class='formtips onSuccess' id="userSuccessInfo"
						style="display: none;">用户名已存在</span></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><s:password name="pass" /></td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><s:password name="repass" /></td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><s:textfield name="managername" /></td>
				</tr>
				<tr>  
                <td>生日：</td>  
                <td><s:textfield name="managerage" >  
                       <%--  <s:param name="value">  
                            <s:date name="managerage" format="yyyy-MM-dd" />  
                        </s:param>   --%>
                    </s:textfield>  
                </td>  
            	</tr>  
				<tr>
					<td>手机：</td>
					<td><s:textfield name="managerpho" maxlength="11" /></td>
				</tr>
				<tr>
					<td>身份证：</td>
					<td><s:textfield name="manageridno" maxlength="18" /></td>
				</tr>
				<tr>
					<td>验证码:</td>
					<td><s:textfield name="vercode" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="登陆" /></td>
				</tr>
			</table>
			
		</s:form>
		<img src="authImg" id="authImg" alt="看不清?请点击刷新验证码"
			style="cursor: pointer;"
			onClick="this.src=this.src+'?'+Math.random();" />

	</center>
	
</body>
<script type="text/javascript">


$(function(){  
    
    $("#user").focus(function(){  
    	
        $('#user').before("<span class='formtips onWaiting'></span>");  
    });  
      
     $("#user").blur(function(){  
        $.getJSON("user_exist.action",   
        "user=" + $("#user").val(),   
        function(dataMap){ 
        	console.log(dataMap);
            if (dataMap.flag) {  
            	$('#userSuccessInfo').hide();
                $('#userErrorInfo').show(); 
            }else{  
            	$('#userErrorInfo').hide(); 
            	$('#userSuccessInfo').show(); 
            }     
        });  
    });
      
});  
</script>


</html>