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
    
    <title>My JSP 'meeting.jsp' starting page</title>
    <script src="jquery-3.1.1.js"></script>
    <link rel="stylesheet" href="bootstrap.css">
    
     <link rel="stylesheet" href="bootstrap.min.css"/>
    <link rel="stylesheet" href="listcss.css"/>
    
    <script src="listjs.js"></script>
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
					<li role="presentation" style="font-size:20px"><a href="search.jsp">查看会议</a></li>
					<li role="presentation" class="active" style="font-size:20px"><a href="DeleteShowThreeServlet">撤销会议</a></li>
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
	<br />
				<br />
				<br />
				<br />
        <form action="" method="post" name="form2" id="form2">
        <table class="table table-bordered table-hover">
        	<tr>
        		<th>是否选择</th>
                <th>会议编号</th>
                <th>会议名称</th>
                <th>会议室地址</th>
            </tr>
        	<c:forEach var="meetingList" items="${requestScope.MeetingList}">
            <tr>
                <td><input type="checkbox" id="${meetingList.meetingID}" name="ids" value="${meetingList.meetingID}"/></td>
                <td>${meetingList.meetingID}</td>
                <td>${meetingList.meetingName}</td>
                <td>${meetingList.roomID}</td>
                
            </tr>
            </c:forEach>
   
        </table>
        <br>
        <br>
        <div align="center">
        <input type="button" value="删除" class="btn btn-primary btn-sm" style="width: 78px; "
        onclick="meetingdel()"/>
        </form>
        <script language="javascript">
               function meetingdel() {
    				//获得选中的数量
    				var count = getSelectedCount();
    				//判断是否选中了数据行
    				if (count == 0) {
       					 alert("请选中要删除的记录!");
        			return;
    				}
   					 //弹出选择对话框
   				 if (confirm("您是否要删除选中的记录？"+getSelected())) {
       			 //获取选中对象
        			var form = document.getElementById("form2");
        		//设置提交的路径
        			form.action = "DeleteMeetingServlet?id="+getSelected();
        			
        		//提交表单
        			form.submit();
        			
   				 }
			}
			
		
			</script>
         </div>
  </body>
</html>
