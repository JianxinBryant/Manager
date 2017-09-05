<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'meeting.jsp' starting page</title>
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
					
					<li role="presentation" class="active" style="font-size:20px"><a
		href="meeting.jsp">发布会议</a></li>
					<li role="presentation" style="font-size:20px"><a href="search.jsp">查看会议</a></li>
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
								
					<form action="AddMeetingServlet" method="post" style="width: 1023px; height: 309px">
						会议编号：<input type="text" name="MeetingID" id="MeetingID"/>
					    会议名称：<select id="MeetingName" name="MeetingName"class="" style="width:100px;">
                            <option value="0">例会</option>
                            <option value="1">年会</option>
                            <option value="2">动员大会</option>
                            <option value="3">迎新</option>              
                          </select> 
                                                          会议室ID：<input type="text" name="RoomID" id="RoomID"/>
                      <br>
                      <br>
                      			预订者ID：<input type="text" name="ReservationistID" id="ReservationistID"/>
                                                          
                                                          开会时间：<input type="time" name="StartTime" id="StartTime" value="13:57：7"/>结束时间<input type="time" name="EndTime" id="EndTime" value="13:57：7"/>
                     <br>
                     <br>
                     			预定时间：<input type="date" name="ReservationTime" id="NumberofParticipants" value="2017/2/24"/>
                                                          参与人数：<input type="text" name="NumberofParticipants" id="NumberofParticipants"/><span >（人数不能超过50人）</span>
                     <br>
                     <br>
                                                         
                                                         会议描述：<input type="text" name="Description" id="Description" style="height: 74px; width: 343px"/>
					 <br>
                     <br>
                     			会议状态：<select type="text" name="Status" id="Status" class="" style="width:100px;">
                     					<option value="会议前">会议前</option>
                     					<option value="会议中">会议中</option>
                     					<option value="会议后">会议后</option>
                     					<option value="待定">待定</option>
                     					</select>
					 <div align="center"><input type="submit" value="提交" class="btn btn-primary btn-sm" style="width: 78px; "/></div>
					</form>
				
				<br />
				<br />
				<br />
				<br />
			</div>
		</div>
	</div>

  </body>
</html>
