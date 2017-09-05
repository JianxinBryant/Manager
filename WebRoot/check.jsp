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
    
    <title>My JSP 'check.jsp' starting page</title>
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
    <header>
    <ul class="nav nav-tabs">
        <!--javascript:void(0)让超链接失效-->
        <li class="active"><a href="javascript:void(0);">员工审核管理</a></li>
    </ul>
</header>
<section>
    <article>
        <form id="form1" name="form1" method="post" action=""
              class="form-inline form-group form-align">
                         
            <input type="submit" value="查询待审核的员工" class="btn btn-warning"/>
        </form>
    </article>
    <form id="form2" name="form2" method="post" action="">
        <table class="table table-bordered table-hover">
            <tr>
                <th><input type="checkbox" id="idAll" onclick="checkedOrUnchecked(this)"/></th>
                <th>员工姓名</th>
                <th>用户名</th>
                <th>电话号码</th>
                <th>电子邮箱</th>
                <th>状态</th>
                <th>部门</th>
            </tr>
            <tr>
                <td><input type="checkbox" name="ids" value=""/></td>
                <td>1</td>
                <td>Tom</td>
                <td>12345644334</td>
                <td>dfg@163.com</td>
                <td>待审核</td>
                <td>项目部</td>
            </tr>
            <c:forEach var="employee" items="${requestScope.cheEmpList}">
				<tr>
					<td><input type="checkbox" name="ids" id="${employee.employeeID}" value="${employee.employeeID}" /></td>
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
            <input type="button" value="同意" class="btn btn-primary btn-sm"
                    onclick="employeesuccess()"/>
                    <script language="javascript">
                    function employeesuccess() {
   					 var count = getSelectedCount();
   					 //判断是否可以提交表单
    					if (count != 1) {
        					alert("请选中要同意的记录!");
        				return;
    					}
    				//获取选中对象
    				var form = document.getElementById("form2");
    				//设置提交的路径
    				form.action = "TEmpServlet?Tid="+getSelected();
   					 //提交表
    				form.submit();
				}
				</script>  
            <input type="button" value="拒绝" class="btn btn-success btn-sm"
                    onclick="employeeunsucc()">
                  <script language="javascript">
                function employeeunsucc() {
                    //获得选中的数量
   					 var count = getSelectedCount();
   					 //判断是否可以提交表单
    					if (count != 1) {
        					alert("请选中一条要拒绝的记录!");
        				return;
    					}
    				//获取选中对象
    				var form = document.getElementById("form2");
    				//设置提交的路径
    				form.action = "REmpServlet?Fid="+getSelected();
   					 //提交表
    				form.submit();
				}
                </script>   
           
        </p>
        </div>
    </form>
</section>

  </body>
</html>
