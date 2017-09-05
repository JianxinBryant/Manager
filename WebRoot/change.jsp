<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>change password</title>
    <script src="jquery-3.1.1.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap.min.css"/>
    <link rel="stylesheet" href="edit.css"/>
    
    <style>
        

        header {
            position: fixed; /* 写成固定的 防止随滚动条滚动*/
            
          
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
    <article class="btn-close" onclick="location.href='index1.jsp'">注 销</article>
   </header>
	<div class="container">
		<div class="row">
			<div class="col-md-12" >
				<ul class="nav nav-tabs" role="tablist">
					<br />
					<br />
					<br />
					<br />
					<li role="presentation" style="color:#C00;font-size:40px">Personal center&nbsp;&nbsp;&nbsp;&nbsp;</li>
					<li role="presentation"style="font-size:20px"><a href="index3.jsp">首页</a></li>
					<li role="presentation" style="font-size:20px"><a href="ShowAllMServlet">所有会议</a></li>
					<li role="presentation" style="font-size:20px"><a href="ShowOwnMServlet">我的会议</a></li>
					<li role="presentation" class="active" style="font-size:20px"><a>修改密码</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-lg-12">
               <section>
               <form id="form1" name="form1" method="post" action="ChangePasswordServlet">
                <dl>
            <dt>修改密码</dt>
                <dd>
                <p>请输入新的密码：</p>
                <input type="password" id="employeepassword2" name="employeepassword2"
           
                       class="form-control input-sm" value=""/>
            </dd>
            <dd>
                <p>请确认修改的密码：</p>
                <input type="password" id="employeepassword3" name="employeepassword3"
           
                       class="form-control input-sm" value=""/>
            </dd>
             <dd>
                <p>请输入您的密保答案：（最喜欢的城市）</p>
                <input type="text" id="MiBaoDaan" name="MiBaoDaan"
           
                       class="form-control input-sm" value=""/>
            </dd>
            <dd class="btn-container">
                <input type="submit" value="确 定" class="btn btn-primary btn-sm"/>
                <input type="reset" value="重 置" class="btn btn-danger btn-sm" onclick="clear()"/>
            </dd>
        </dl>
    </form>
</section>
			</div>
		</div>
	</div>

<script type="text/javascript">
function clear(){
	var pass1 = document.getElementById("employeepassword2");
	var pass2 = document.getElementById("employeepassword3");
	pass1.setAttribute(value, "");
	pass2.setAttribute(value, "");
}
</script>
</body>
</html>