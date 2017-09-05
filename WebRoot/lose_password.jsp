<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
    <base href="<%=basePath%>">
    
    <title>密码更改|会议管理系统</title>
    <script src="js/jquery-3.1.1.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">	
    <script src="js/bootstrap.js"></script>
	

  </head>

  <body>
	<div class="container">
		<div class="row">
			<div class="col-md-12" style="background-image:url(1.jpg)">
				<ul class="nav nav-tabs" role="tablist">
					<br />
					<br />
					<br />
					<br />
					<li role="presentation" style="color:#C00;font-size:40px">Logo&nbsp;&nbsp;&nbsp;&nbsp;</li>
					<li role="presentation" style="font-size:20px"><a href="login.jsp">登录</a></li>
					<li role="presentation" style="font-size:20px"><a href="register.jsp">注册</a></li>
					<li role="presentation" class="active" style="font-size:20px"><a
						>忘记密码</a></li>
					
				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-12" style="background-image:url(11.jpg)">
				<br />
				<br />
				<br />
				<br />
				<br />
				<br />
				<div class="caption"
					style="text-align:center;color:#c0c0c0;font-size:35px;height:630px;">
					<form action="ChangePasswordServlet" method="post">
						登 录 账 户：<input type="text" name="UserName" style="border-radius:10px;"/>
						
						<br />
						<br /> 新 的 密 码： <input type="password" name="employeepassword2"style="border-radius:10px;"/><br />
						<br /> 确 认 密 码： <input type="password" name="confirm_password"style="border-radius:10px;"/><br />
						<br /> 喜欢的城市： <input type="text" name="MiBaoDaan" style="border-radius:10px;"/><br />
						<br /> 
						<button type="submit" class="btn btn-primary"value="修改密码" style="font-size:30px;width:400px;height:50px;color:#f5f5f5;">修改密码</button>
						<br /> 
						<br />
						<span> ${requestScope.info}</span>
					</form>
				</div>
				
				<br />
				<br />
			</div>
		</div>
	</div>

</body>
</html>
