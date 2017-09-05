<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet type="text/css" href="css/register.css">
  </head>
  
  <body>
<div class="background">
<div class="container">
	<form class="form-horizontal" role="form" method="post" action="RegisterServlet" id="demoForm">
    	<fieldset><legend class="h2 title" style="border-bottom:2px solid #FFCC00">基本信息</legend>
        	<div class="form-group" >
        		<label class="col-md-1">用户名</label>
        		<input type='text' id="UserName" name="UserName" class="form-control col-md-11" placeholder='用户名长度3-12位'/>${requestScope.zx}<p id = searchResult></p>
        	</div>
        	<div class="form-group">
        		<label class="col-md-1">密码</label>
        		<input type='password' id="Password" name="Password" class="form-control col-md-11" placeholder='密码长度6-16位'/>
        	</div>
        	<div class="form-group">
        		<label class="col-md-1">确认密码</label>
        		<input type='password' id="confirm-password" name="confirm-password" class="form-control col-md-11" placeholder='请再次确认密码'/>
        	</div>
        	<div class="form-group">
        		<label class="col-md-1">部门</label>
        		
        		<select id="Department" name="Department" class="form-control input-sm">
                	<c:forEach var="Dep" items="${requestScope.Deplist}">
                		<option value="${Dep.departmentID}">${Dep.departmentName}</option>
                	</c:forEach>     
                </select>
        	</div>
        </fieldset>
        <fieldset><legend class="h2 title" style="border-bottom:2px solid #FFCC00">个人资料</legend>
        	<div class="form-group">
        		<label class="col-md-1">真实姓名</label>
        		<input type='text' id="EmployeeName" name="EmployeeName" class="form-control col-md-11" placeholder='请输入真实姓名'/>
        	</div>
        	<div class="form-group">
        		<label class="col-md-1">手机号码</label>
        		<input type='text' id="Phone" name="Phone" class="form-control col-md-11" placeholder='请输入手机号码'/>
        	</div>
        	<div class="form-group">
        		<label class="col-md-1">邮箱</label>
        		<input type='text' id="Email" name="Email" class="form-control col-md-11" placeholder='请输入你的邮箱'/>
        	</div>
        	<div class="form-group">
        		<label class="col-md-1">最喜欢城市</label>
        		<input type='text' id="MiBaoDaan" name="MiBaoDaan" class="form-control col-md-11" placeholder='请输入你的密保答案'/>
        	</div>
        	<input type="submit" class="btn btn-default registerButton" value='注册'/><br><span class="errorMsg">${requestScope.errorMsg}</span>
        </fieldset>
    </form>
</div>
</div>
<script src="js/jquery-1.8.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/register.css"></script>
<script src="js/jquery.validate-1.13.1.js"></script>
<script>
var validator1;
    $(document).ready(function () {
        validator1 = $("#demoForm").validate({
        	debug: false,
            rules: {
                UserName: {
                    required: true,
                    minlength: 3,
                    maxlength: 12
                },
                Password: {
                    required: true,
                    minlength: 6,
                    maxlength: 16
                },
                "confirm-password": {
                    equalTo: "#Password"
                },
				Email: {
					email:true
				},
				EmployeeName: {
					required: true	
				},
				Phone: {
					required: true,	
					minlength: 11,
                    maxlength: 11
				},
				MiBaoDaan: {
					required: true,
					minlength: 1,
					maxlength: 10
				}
            },
            messages: {
                UserName: {
                    required: ' 请输入用户名',
                    minlength: ' 用户名不能小于3个字符',
                    maxlength: ' 用户名不能超过12个字符',
                    remote: ' 用户名不存在'
                },
                Password: {
                    required: ' 请输入密码',
                    minlength: ' 密码不能小于6个字符',
                    maxlength: ' 密码不能超过16个字符'
                },
                "confirm-password": {
                    equalTo: ' 两次输入密码不一致'
                },
				Email: {
					required: ' 请输入email',
					email:' 邮箱格式不正确'
				},
				EmployeeName: {
					required: ' 请输入真实姓名'
				},
				Phone: {
					required: ' 请输入手机号码',	
					minlength: ' 手机号码必须为11位',
                    maxlength: ' 手机号码必须为11位'
				},
				MiBaoDaan: {
					required: ' 请输入密保答案',
					minlength: '密保答案不能小于1个字符',
					maxlength: '密保答案不能大于10个字符'
				}
            },

            highlight: function(element, errorClass, validClass) {
                $(element).addClass(errorClass).removeClass(validClass);
                $(element).fadeOut().fadeIn();
            },
            unhighlight: function(element, errorClass, validClass) {
                $(element).removeClass(errorClass).addClass(validClass);
            },
            
			success: function(label){
				label.text('').addClass('valid');
			}
			
        });
        $("#UserName").blur(function(){ 
		$.ajax({ 
		
		    type: "GET", 	
			url: "http://localhost:8080/Manager/RegisterServlet?UserName=" + $("#UserName").val(),
			dataType: "text",
			success: function(data) {
				if (data=="success") { 
					$("#searchResult").html("抱歉！该用户名已被注册！");
				} else if(data=="fail") {
					$("#searchResult").html("恭喜！该用户名未被注册！");
				}  
			},
			error: function(jqXHR){     
			   alert("发生错误：" + jqXHR.status);  
			},     
		});
	});
        
});
</script>
</body>
</html>

