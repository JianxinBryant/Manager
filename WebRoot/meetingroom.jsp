<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'meetingroom.jsp' starting page</title>
<link rel="stylesheet" href="bootstrap.min.css" />
<link rel="stylesheet" href="listcss.css" />

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
	<header>
	<ul class="nav nav-tabs">
		<!--javascript:void(0)让超链接失效-->
		<li class="active"><a href="javascript:void(0);">会议室管理</a></li>
	</ul>
	</header>
	<section> <article>
	<form id="form1" name="form1" method="post" action=""
		class="form-inline form-group form-align"></form>
	</article>
	<form id="form2" name="form2" method="post" action="">
		<table class="table table-borderd table-hover">
			<tr>
			
				<th>会议室编号</th>
				<th>会议室名称</th>
				<th>容量</th>
				<th>状态</th>
				<th>描述</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<tr>

				<c:forEach items="${requestScope.list}" var="list">
					<tr>
						<td>${list.roomCode}</td>
						<td>${list.roomName}</td>
						<td>${list.caoacity}</td>
						<td>${list.status}</td>
						<td>${list.description}</td>
						<td><a href="OneMRServlet?id=${list.roomID}" class="btn btn-warning btn-sm">修改</a></td>
						<td><a href="DeleteMRServlet?id=${list.roomID}" class="btn btn-danger btn-sm">删除</a></td>
					</tr>
				</c:forEach>
			</tr>

		</table>
		<div class="row">
			<div class="col-md-2"></div>
			
			<!-- 分页开始 -->
			<ul class="col-md-5 pagination pagination-lg">

				<li><a href="${servletName}?pageIndex=1">首页</a></li>
				<li><a href="${servletName}?pageIndex=1">&laquo;</a></li>

				<c:forEach begin="1" end="${Paging.pageCount}" step="1" var="each">
					<li><a href="${servletName}?pageIndex=${each}">${each}</a>
					</li>
				</c:forEach>

				<li><a href="${servletName}?pageIndex=${Paging.pageIndex+1}">&raquo;</a></li>
				<li><a href="${servletName}?pageIndex=${Paging.pageCount}">末页</a></li>
			</ul>
			<!-- 分页结束-->
			
		<p class="btn-container col-md-3">
			<input type="button" value="添 加" class="btn btn-primary btn-sm"
				onclick="meetingroomadd()" />
			<script language="javascript">
				function meetingroomadd() {
					location.href = "meetingroomadd.jsp";
				}
			</script>
			
		</p>
		</div>
	</form>
	</section>
</body>
</html>
