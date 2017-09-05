<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'departadd.jsp' starting page</title>
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
        <li class="active"><a href="javascript:history.go(-1);">部门管理</a></li>
    </ul>
</header>
<section>
    <form id="form1" name="form1" method="post" action="AddDepartServlet">
        <dl>
            <dt>添加部门信息</dt>
            <dd>
            <p>添加部门编号：</p>
            <input type="text" id="userId" name="userId" readonly="readonly"
                       placeholder="自动生成部门编号!" required autofocus
                       class="form-control input-sm"/></dd>
            <dd>
                <p>添加部门名称：</p>
                <input type="text" id="userName" name="userName"
                       placeholder="请输入部门名称" required class="form-control input-sm"/>
            </dd>
            <dd class="btn-container">
                <input type="submit" value="确 定" class="btn btn-primary btn-sm"/>
                <input type="reset" value="重 置" class="btn btn-danger btn-sm"/>
            </dd>
        </dl>
    </form>
</section>
  </body>
</html>
