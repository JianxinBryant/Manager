<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<style>
        body {
            font-family: "微软雅黑"; /*设置字体*/
            font-size: 12px; /*设置字体大小*/
            margin: 0px; /*边距*/
        }

        header {
            position: fixed; /* 写成固定的 防止随滚动条滚动*/
            width: 100%; /*宽度100%*/
            min-width: 800px;
            height: 100px; /*高度100像素*/
            background-color: cornflowerblue; /*背景颜色*/
            top: 0px; /*距上距离*/
            left: 0px; /*距左距离*/
            z-index: 10; /*一层一层（0-9999）越大越在上*/
            /*opacity: 0.6; !* 测试透明度 *!*/
        }

        #pageBody {
            position: fixed; /*固定*/
            /*距离上右下左0px*/
            top: 0px;
            right: 0px;
            bottom: 0px;
            left: 0px;
        }

        #pageBody aside {
            float: left; /*放在左边*/
            width: 20%; /*宽度20%*/
            min-width: 200px;
            height: 100%; /*高度100%*/
            background-color: lightblue; /*背景颜色*/
            overflow: auto; /*超出之后加滚动条*/
            padding-top: 100px; /* 填充100像素*/
            box-sizing: border-box; /*不会超出，在内部扣除*/
        }

        #pageBody aside ul {
            margin: 5px auto;
            padding: 0px;
            width: 160px;
            border-radius: 5px;
            background-color: #ffffff;
        }

        #pageBody aside ul li {
            list-style-type: none;
            height: 30px;
            padding-bottom: 1px;
        }

        #pageBody aside ul li a {
            float: left;
            width: 100%;
            height: 100%;
            text-align: center;
            line-height: 30px;
            color: black;
            text-decoration: none;
        }

        #pageBody aside ul li a:hover {
            background-color: lightgray;
            color: #FFF;
        }

        #pageBody aside ul li a[class=active]:hover {
            background-color: cornflowerblue;
            color: #000;
        }

        #pageBody section {
            float: right; /*放在右边*/
            width: 80%; /*宽度80*/
            height: 100%; /*高度100%*/
            background-color: rgba(186, 230, 244, 0.76); /*背景颜色*/
            overflow: auto; /*超出之后加滚动条*/
            padding-top: 100px; /*填充100像素*/
            box-sizing: border-box; /*超出之后在内部扣除，从而不会超出*/
            overflow: hidden;
        }

        footer {
            position: fixed; /*固定*/
            width: 100%; /*宽度100%*/
            height: 15px; /*高度15像素*/
            bottom: 0px; /*距底边0像素*/
            left: 0px; /*距左边0像素*/
            z-index: 10; /*层*/
            background-color: cornflowerblue; /*背景颜色*/
        }

        .log {
            position: absolute;
            width: 64px;
            height: 64px;
            top: 16px;
            left: 80px;
            
        }

        .header-title {
            position: absolute;
            width: 200px;
            top: 40px;
            left: 150px;
            font-size: 16px;
            color: white;
        }

        .btn-close {
            position: absolute;
            width: 64px;
            height: 64px;
            top: 16px;
            right: 60px;
            text-align: center;
            color: #ff7567;
            line-height: 20px;
            font-size: 13px;
            background-image: url("close.png");
            cursor: pointer;
            border-radius: 5px;
        }

        .btn-close:hover {
            /*background-color: #acccc6;*/
            color: #66814d;
            /*box-shadow: #000 0px 0px 1px;*/
            top: 17px;
            right: 59px;
        }

        .active {
            background-color: cornflowerblue;
            border-top-left-radius: 5px;
            border-top-right-radius: 5px;
        }
    </style>
    <!--JS脚本-->
    <script src="listjs.js"></script>
  </head>
  
  <body>
<header>
    <article class="log"></article>
    <article class="header-title">管理员管理系统</article>
    <article class="btn-close" onclick="location.href='index1.jsp'">注 销</article>
</header>
<section id="pageBody">
    <aside>
        <!--无序列表，用于制作导航菜单-->
        <ul>
            <li name="001"><a href="DepartServlet?pageIndex=1" target="mainFrame">部门信息管理</a></li>
            <li name="001"><a href="meeting.jsp" target="mainFrame">会议信息管理</a></li>
            <li name="001"><a href="EmployeeServlet?pageIndex=1" target="mainFrame">员工信息管理</a></li>
            <li name="001"><a href="CheckEmpServlet?pageIndex=1" target="mainFrame">员工信息审核</a></li>
            <li name="001"><a href="SelectMRServlet?pageIndex=1" target="mainFrame">会议室管理</a></li>
        </ul>
    </aside>
    <section>
        <iframe src="main.jsp" id="mainFrame" name="mainFrame" width="100%" height="100%"
                frameborder="no"/>
    </section>
</section>
<footer>底部</footer>
</body>
</html>
