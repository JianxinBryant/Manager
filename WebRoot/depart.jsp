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
    
    <title>My JSP 'depart.jsp' starting page</title>
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
        <li class="active"><a href="javascript:void(0);">部门管理</a></li>
    </ul>
</header>
<section>
    <article>
        <form id="form1" name="form1" method="post" action="SerDepServlet?pageIndex=1"
              class="form-inline form-group form-align">
             
            <input type="input" id="deptName" name="deptName"
                   placeholder="请输入部门名!" class="form-control input-sm input-size"/>
            <input type="submit" value="查 询" class="btn btn-warning"/>
        </form>
    </article>
    <form id="form2" name="form2" method="post" action="">
        <table class="table table-bordered table-hover">
            <tr>
                <th><input type="checkbox" id="idAll" onclick="checkedOrUnchecked(this)"/></th>
               
                 <th>部门编号</th>
                <th>部门名</th>
                
            </tr>
            
            <c:forEach var="Depart" items="${requestScope.Deplist}">
				<tr>
					<td><input type="checkbox" name="ids" id="${Depart.departmentID}" value="${Depart.departmentID}" /></td>
					<td>${Depart.departmentID}</td>
					<td>${Depart.departmentName}</td>
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
                   onclick="departadd()"/>
                    <script language="javascript">
                   function departadd() {
    					location.href = "departadd.jsp";
					}
					</script>  
            <input type="button" value="修 改" class="btn btn-success btn-sm"
                   onclick="departupdate()"/>
                   <script language="javascript">
                function departupdate() {
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
    				form.action = "departupdate.jsp?id="+getSelected();
   					 //提交表
    				form.submit();
				}
                </script>  
            <input type="button" value="删 除" class="btn btn-danger btn-sm"
                   onclick="departdelete()"/>
                   <script language="javascript">
               function departdelete() {
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
        			form.action = "DeldepartServlet?id="+getSelected();
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
