<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<javascript>
</javascript>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
    <base href="<%=basePath%>">
    
    <title>用户注册|会议管理系统</title>
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
					
					<li role="presentation" class="active" style="font-size:20px"><a
						>注册</a></li>
					
					<li role="presentation" style="font-size:20px"><a href="lose_password.jsp">忘记密码</a></li>
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
				
				<div class="caption"
					style="text-align:center;color:#c0c0c0;font-size:30px;height:900px;">
					<form action="Login" method="post">
						登 录 账 号：<input type="text" name="username" style="border-radius:10px;"/>
						
						<br />
						<br /> 填 写 密 码： <input type="text" name="password"style="border-radius:10px;"/><br />
						
						<br /> 确 认 密 码： <input type="text" name="confirm_password"style="border-radius:10px;"/><br />
						
						<br /> 喜欢的城市： <input type="text" name="city"style="border-radius:10px;"/><br />
						<br />
						<br />
						
						<div class="container">
		<div class="row">
			<div class="col-md-12" >
				<ul class="nav nav-tabs" role="tablist">
					
					
					<li role="presentation" class="active" style="font-size:20px"><a
						href="">基本信息录入</a></li>
				</ul>
			</div>
		</div>
	</div>
	                    <br /> 员工编号： <input type="text" name="employee_ID"style="border-radius:10px;"/><br />
	                    <br /> 真实姓名： <input type="text" name="employee_name"style="border-radius:10px;"/><br />
	                    <br /> 联系电话： <input type="text" name="employee_TEL"style="border-radius:10px;"/><br />
	                    <br /> 电子邮件： <input type="text" name="employee_EML"style="border-radius:10px;"/><br />
						<br />
						<!-- 验证码 开始 -->
						<strong>验证码:</strong>&nbsp;&nbsp;
						<input type="text" required height="60" display: inline
							name="codevalidate" style="border-radius:10px;">

						<!-- ValidateCodeServlet -->
						<img id="ValidateCodeServlet" src="ValidateCodeServlet" width="145" height="60"
							style="border-radius:10px;" onclick="this.src=this.src+'?'">
						<!-- 验证码 结束 -->
						<br /> <button type="submit" class="btn btn-primary"value="注册" style="font-size:30px;width:400px;height:50px;color:#f5f5f5;">注册</button>
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
