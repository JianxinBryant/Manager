<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'employeeadd.jsp' starting page</title>
      <link rel="stylesheet" href="bootstrap.min.css"/>
    <link rel="stylesheet" href="edit.css"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
 <body>
<header>
    <ul class="nav nav-tabs">
        <!--javascript:void(0)让超链接失效-->
        <li class="active"><a href="javascript:history.go(-1);">员工信息管理</a></li>
    </ul>
</header>
<section>
    <form id="form1" name="form1" method="post" action="employee.jsp">
        <dl>
            <dt>添加员工信息</dt>
            
            <dd><input type="text" id="employeeName" name="employeeName"
                       placeholder="请输入员工名!" required autofocus
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="UserName" name="UserName"
                       placeholder="请输入用户名!" required autofocus
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="empphone" name="empphone"
                       placeholder="请输入员工电话号码!" required autofocus
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="empemail" name="empemail"
                       placeholder="请输入员工电子邮箱!" required autofocus
                        class="form-control input-sm"/></dd>
             <dd>
                <select id="employeeStatus" name="employeeStatus"class="form-control input-sm">
                    <option value="0">请选择员工状态</option>
                    <option value="1">待审核</option>
                    <option value="2">已批准</option>
                    <option value="3">已关闭</option>              
                </select>
            </dd>           
             <dd><input type="text" id="empdepart" name="empdepart"
                       placeholder="请输入员工所属部门!" required autofocus
                        class="form-control input-sm"/></dd>
            <dd><input type="password" id="password" name="password"
                       placeholder="请输入密码!" required autofocus
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="mibao" name="mibao"
                       placeholder="请输入密保!" required autofocus
                        class="form-control input-sm"/></dd>
                        
            <dd class="btn-container">
                <input type="submit" value="确 定" class="btn btn-primary btn-sm"/>
                <input type="reset" value="重 置" class="btn btn-danger btn-sm"/>
            </dd>
        </dl>
    </form>
</section>
</body>
</html>
