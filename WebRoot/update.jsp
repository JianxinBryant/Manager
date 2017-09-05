<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'search.jsp' starting page</title>
    <script src="jquery-3.1.1.js"></script>
    <link rel="stylesheet" href="bootstrap.css">
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
    <div class="container">
		<div class="row">
			<div class="col-md-12" >
				<ul class="nav nav-tabs" role="tablist">
					<br />
					<br />
					<br />
					<br />
					
					<li role="presentation"  style="font-size:20px"><a
		href="meeting.jsp">发布会议</a></li>
					<li role="presentation"  style="font-size:20px"><a href="search.jsp">查看会议</a></li>
					<li role="presentation" style="font-size:20px"><a href="DeleteShowThreeServlet">撤销会议</a></li>
					<!-- <li role="presentation" style="font-size:20px"><a href="UpdateShowAllMServlet">修改會議</a></li> -->
				</ul>
			</div>
		</div>
	</div>

	<div class="container" style="background-color:#FFC">
		<div class="row">
			<div class="col-lg-12">
				<br /> <br />
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<br />
				<br />
				<br />
				<br />
				<br />
                    
            
            
                      
					  <form action="UpdateMeetingServlet" method="post" style="width: 1023px; height: 396px">
				      
				               会议ID：<input type="text" name="MeetingID" value="${requestScope.MeetingID}" />
					    会议名称：<input type="text" name="MeetingName" value="${requestScope.MeetingName}" />
                                                           会议室ID：<input type="text" name="RoomID" value="${requestScope.RoomID}" />
                      <br>
                      <br>
                      			预定者ID：<input type="text" name="ReservationistID" value="${requestScope.ReservationistID}" />
                      			参与人数：<input type="text" name="NumberofParticipants" value="${requestScope.NumberofParticipants}" /><span >（人数不能超过50人）</span>
                                
                                                         
                                                         
                                                         
                     <br>
                     <br>
                                     开会时间：<input type="text" name="StartTime" value="${requestScope.StartTime}" />
                                                          结束时间：<input type="text" name="EndTime" value="${requestScope.EndTime}" />                      
                     <br>
                     <br>
                                 预定时间：<input type="text" name="ReservationTime" value="${requestScope.ReservationTime}"/>
                                                          取消时间：<input type="text" name="CanceledTime" value="${requestScope.CanceledTime}"/>                         
                                                         会议描述：<input type="textarea" name="Description" value="${requestScope.Description}" style="height: 74px; width: 343px"/>
					 <br>
                     <br>
					 		      会议状态：<input type="text" name="Status" value="${requestScope.Status}" />
					 		      <input type="submit" value="確認修改" class="btn btn-warning"/>
					
					</form>
				<br />
				<br />
				<br />
				<br />
			</div>
		</div>
	</div>
<script type="text/javascript">

</script>
  </body>
</html>