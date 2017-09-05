<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Employee interface</title>
    <script src="js/jquery-3.1.1.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css">
    <style>
        

        header {
            position: fixed; /* 写成固定的 防止随滚动条滚动*/
            width: 100%; /*宽度100%*/
            min-width: 800px;
            height: 100px; /*高度100像素*/
          
            top: 0px; /*距上距离*/
            left: 0px; /*距左距离*/
            z-index: 10; /*一层一层（0-9999）越大越在上*/
            /*opacity: 0.6; !* 测试透明度 *!*/
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
           
            border-top-left-radius: 5px;
            border-top-right-radius: 5px;
        }
    </style>
    
  </head>

<body>
<header>
    
    <span>欢迎${sessionScope.UserName}访问该页面</span>
    <article class="btn-close" onclick="location.href='index1.jsp'">注 销</article>
</header>
	<div class="container">
		<div class="row">
			<div class="col-md-12" ">
				<ul class="nav nav-tabs" role="tablist">
					<br />
					<br />
					<br />
					<br />
					<li role="presentation" style="color:#C00;font-size:40px">Personal center&nbsp;&nbsp;&nbsp;&nbsp;</li>
					<li role="presentation" class="active" style="font-size:20px"><a>首页</a></li>
					<li role="presentation" style="font-size:20px"><a href="ShowAllMServlet">所有会议</a></li>
					<li role="presentation" style="font-size:20px"><a href="ShowOwnMServlet">我的会议</a></li>
					<li role="presentation" style="font-size:20px"><a href="change.jsp">修改密码</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container" style="background-color:#FFC">
		<div class="row">
			<div class="col-lg-12">
				<br />
				<br />
				<br />
				 <div class="jumbotron" style="background-color:#FFC">
				 
                   <h1 align="center"><font>欢迎进入员工个人中心</font></h1>
               </div>
			</div>
		</div>
	</div>


</body>
</html>
