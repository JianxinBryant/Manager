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
    
    <title>My JSP 'employeeupdate.jsp' starting page</title>
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
    <form id="form1" name="form1" method="post" action="UpdateEmployeeServlet?id=${emp.employeeID}">
        <dl>
            <dt>修改员工信息</dt>
            <dd><input type="text" id="employeeName" name="employeeName"
                       placeholder="请修改员工姓名!" required autofocus
                       value="${emp.employeeName}"
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="employeeTel" name="employeeTel"
                       placeholder="请修改员工电话!" required autofocus
                       value="${emp.phone}"
                        class="form-control input-sm"/></dd>
            <dd><input type="text" id="employeeEmail" name="employeeEmail"
                       placeholder="请修改员工邮箱!" required autofocus
                       value="${emp.email}"
                        class="form-control input-sm"/></dd>
            <dd>
                <select id="employeeStatus" name="employeeStatus"class="form-control input-sm">
                    <option value="${emp.status}">${emp.status}</option>
                    <option value="待审核">待审核</option>
                    <option value="已批准">已批准</option>
                    <option value="已关闭">已关闭</option>  
                    <option value="管理员">管理员</option>             
                </select>
            </dd>
            <dd><!--  input type="text" id="empdepart" name="empdepart"
                       placeholder="请修改员工所属部门!" required autofocus
                       value="${emp.department}"
                        class="form-control input-sm"/-->
                        
                     <select id="Department" name="Department" class="form-control input-sm">
                		<c:forEach var="Dep" items="${requestScope.Deplist}">
                			<option value="${Dep.departmentID}">${Dep.departmentName}</option>
                		</c:forEach>     
                	</select></dd>
           
            
            <dd class="btn-container">
                <input type="submit" value="确 定" class="btn btn-primary btn-sm"/>
                <input type="reset" value="重 置" class="btn btn-danger btn-sm"/>
            </dd>
        </dl>
    </form>
</section>
  </body>
</html>
