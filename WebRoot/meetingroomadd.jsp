<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- 添加标签，用于写if语句 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <base href="<%=basePath%>">
    
    <title>添加会议室|会议管理系统</title>
    <link rel="stylesheet" href="bootstrap.min.css"/>
    <link rel="stylesheet" href="edit.css"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
<header>
    <ul class="nav nav-tabs">
        <!--javascript:void(0)让超链接失效-->
        <li class="active"><a href="javascript:history.go(-1);">会议室管理</a></li>
    </ul>
</header>
<section>
   
     <form action="MRAddServlet" method="post">
        <dl>
            <dt>添加会议室信息</dt>
            <dd><input onkeyup="this.value=this.value.replace(/\D/g,'')" 
            id="meetingroomID" name="meetingroomID"
                       onafterpaste="this.value=this.value.replace(/\D/g,'')"
                       placeholder="请输入会议室编号!(数字)" required autofocus
                        class="form-control input-sm" /></dd>
           
            <dd><input type="text" id="meetingroomName" name="meetingroomName"
                       placeholder="请输入会议室名!" required autofocus
                        class="form-control input-sm"/></dd>
                        
            <dd><input onkeyup="this.value=this.value.replace(/\D/g,'')" 
            id="meetingroomrl" name="meetingroomrl"
            onafterpaste="this.value=this.value.replace(/\D/g,'')"
                       placeholder="请输入会议室容量!(数字)" required autofocus
                        class="form-control input-sm"/></dd>
       
            
            
            <dd><input type="text" id="meetingroomdesc" name="meetingroomdesc"
                       placeholder="请输入会议室描述!" required autofocus
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
