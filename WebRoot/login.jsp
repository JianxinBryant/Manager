<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>用户登录|会议管理系统</title>
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
					<li role="presentation" class="active" style="font-size:20px"><a>登录</a></li>
					<li role="presentation" style="font-size:20px"><a
						href="seleDpServlet">注册</a></li>
					<li role="presentation" style="font-size:20px"><a
						href="lose_password.jsp">忘记密码</a></li>

				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-12" style="background-image:url(11.jpg)">
				<br /> <br /> <br /> <br /> <br />
				<div class="caption"
					style="text-align:lift;color:#c0c0c0;font-size:40px;height:390px;">
                    <div class="row">
                      <div class="col-xs-6 col-md-3"> </div>
                      <div class="col-xs-6 col-md-7">
                      <span>${requestScope.successMsg}</span>
                          <form action="LoginServlet" method="post">
						  账  号：&nbsp;<input type="text" name="UserName" id="UserName" style="border-radius:10px;" /></div>
                      <div class="col-xs-6 col-md-2"> </div>
                    </div>
					
						
                       
                        
                         <div class="row">
                      <div class="col-xs-6 col-md-3"> </div>
                      <div class="col-xs-6 col-md-7">
                          密   码： <input type="password" name="Password" id="Password"
							style="border-radius:10px;" /></div>
                      <div class="col-xs-6 col-md-2"> </div>
                    </div>
                        
                         <br /> 
							
                             <div class="row">
                      <div class="col-xs-6 col-md-3"> </div>
                      <div class="col-xs-6 col-md-9">
                         <!-- 验证码 开始 -->
						验证码:
						<input type="text" required height="60" display: inline
							name="codevalidate" style="border-radius:10px;">
						<!-- ValidateCodeServlet -->
						<img id="codevalidate" src="ValidateCodeServlet" width="145" height="60"
							style="border-radius:10px;" onClick="this.src=this.src+'?'">
						<!-- 验证码 结束 --></div>
						</div>
                    </div> 
						
						
                        <div class="row">
                      <div class="col-xs-6 col-md-4"> </div>
                      <div class="col-xs-6 col-md-4">
                         <button  type="submit" class="btn btn-primary" value="登录"
					style="font-size:30px;width:400px;height:50px;color:#f5f5f5;">登录</button></div>
                      <div class="col-xs-6 col-md-4"> </div>
                    </div>
				
				<br /> <span style="color:#c00"> ${requestScope.info}</span>

				</form>
			</div>

			<br /> <br />
		</div>
	</div>
	</div>

</body>
</html>
