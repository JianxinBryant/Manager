QWSWSSSZ<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'employee.jsp' starting page</title>
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
		<li class="active"><a href="javascript:void(0);">员工信息管理</a></li>
	</ul>
	</header>
	<section> <article>
	<form id="form1" name="form1" method="post" action="SerByUServlet?pageIndex=1"
		class="form-inline form-group form-align">
		<select name="select">
			<option value=1>按员工用户名查询</option>
			<option value=2>按员工姓名查询</option>
			<option value=3>按员工状态查询</option>
		</select> <input type="input" id="suserName" name="suserName"
			placeholder="请输入用户名!" class="form-control input-sm input-size" /> <input
			type="submit" value="查 询" class="btn btn-warning" />
	</form>
	</article>
	<form id="form2" name="form2" method="post" action="">
		<table class="table table-bordered table-hover">
			<tr>
				<th><input type="checkbox" id="idAll"
					onclick="checkedOrUnchecked(this)" /></th>
				<th>员工姓名</th>
				<th>用户名</th>
				<th>电话号码</th>
				<th>电子邮箱</th>
				<th>状态</th>
				<th>部门</th>
			</tr>
			<tr>
				<td><input type="checkbox" name="ids" value="" /></td>
				<td>测试：1</td>
				<td>测试：Tom</td>
				<td>测试：12345644334</td>
				<td>测试：dfg@163.com</td>
				<td>测试：待审核</td>
				<td>测试：项目部</td>
			</tr>

			<c:forEach var="employee" items="${requestScope.emdList}">
				<tr>
					<td><input type="checkbox" name="ids"
						id="${employee.employeeID}" value="${employee.employeeID}" /></td>
					<td>${employee.employeeName}</td>
					<td>${employee.userName}</td>
					<td>${employee.phone}</td>
					<td>${employee.email}</td>
					<td>${employee.status}</td>
					<td>${employee.department}</td>
				</tr>
			</c:forEach>

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
					onclick="employeeadd()" />
				<script language="javascript">
					function employeeadd() {
						//获取选中对象
						var form = document.getElementById("form2");
						//设置提交的路径
						form.action = "";
						//提交表单
						form.submit();
						location.href = "selecDpServlet";
					}
				</script>
				<input type="button" value="修 改" class="btn btn-success btn-sm"
					onclick="employeeupdate()">
				<script language="javascript">
					function employeeupdate() {
						//获得选中的数量
						var count = getSelectedCount();
						//判断是否可以提交表单
						if (count != 1) {
							alert("请选中一条要修改的记录!");
							return;
						}
						//获取选中对象
						var form = document.getElementById("form2");
						//设置提交的路径
						form.action = "OneEmployeeServlet?id=" + getSelected();
						//提交表
						form.submit();
					}
				</script>
				<input type="button" value="删 除" class="btn btn-danger btn-sm"
					onclick="employeedel()" />
				<script language="javascript">
					function employeedel() {
						//获得选中的数量
						var count = getSelectedCount();
						//判断是否选中了数据行
						if (count == 0) {
							alert("请选中要删除的记录!");
							return;
						}
						//弹出选择对话框
						if (confirm("您是否要删除选中的记录？")) {
							//获取选中对象
							var form = document.getElementById("form2");
							//设置提交的路径
							form.action = "DelEmployeeServlet?id="
									+ getSelected();
							//提交表单
							form.submit();
						}
					}
				</script>
			</p>
		</div>
	</form>
	</section>

</body>
</html>
