<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'meetingroomupdate.jsp' starting page</title>
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
        <li class="active"><a href="javascript:history.go(-1);">会议室管理</a></li>
    </ul>
</header>
<section>
    <form id="form1" name="form1" method="post" action="meetingroom.jsp">
        <dl>
            <dt>修改会议室信息</dt>
            <dd><input type="text" id="meetingroomID" name="meetingroomID"
                       placeholder="请修改会议室编号!" required autofocus
                       value="${MeetingRoom.roomCode}"
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="meetingroomName" name="meetingroomName"
                       placeholder="请修改会议室名!" required autofocus
                       value="${MeetingRoom.roomName}"
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="meetingroomrl" name="meetingroomrl"
                       placeholder="请修改会议室容量!" required autofocus
                       value="${MeetingRoom.caoacity}"
                        class="form-control input-sm"/></dd>
        
             <dd>
                <select id="posit" name="posit"class="form-control input-sm">
                    <option value="${MeetingRoom.status}">${MeetingRoom.status}</option>
                    <option value="使用中">使用中</option>
                    <option value="未使用">未使用</option>
                    <option value="停用">停用</option>              
                </select>
            </dd>
            <dd><input type="text" id="meetingroomdesc" name="meetingroomdesc"
                       placeholder="请修改会议室描述!" required autofocus
                       value="${MeetingRoom.description}"
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
