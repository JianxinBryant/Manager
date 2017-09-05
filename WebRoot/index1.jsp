<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
    <base href="<%=basePath%>">
    
    <title>首页|会议管理系统</title>
    <script src="js/jquery-3.1.1.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css">
	 <link rel="shortcut icon" href="favicon.ico">  
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href='http://fonts.googleapis.com/css?family=Lato:300,400,300italic,400italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'> 
    
    <link rel="stylesheet" href="css/bootstrap.min.css">   
   
    <link rel="stylesheet" href="css/font-awesome.css">
    
    
    <link rel="stylesheet" href="css/github-calendar.css"/>
    
    <link rel="stylesheet" href="css/github-activity.css">
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/octicons/2.0.2/octicons.min.css">
    
    <!-- Theme CSS -->  
    <link id="theme-style" rel="stylesheet" href="css/styles.css">
   
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>	
    <script src="js/bootstrap.js"></script>
	

  </head>

  <body>
	<div class="container">
		<div class="row">
			<div class="col-md-12" style="background-image:url(1.jpg)">
				<ul class="nav nav-tabs" role="tablist">
					<br />
					<br />
					<br />
					<br />
					<li role="presentation" style="color:#C00;font-size:40px">Conference Management&nbsp;&nbsp;&nbsp;&nbsp;</li>
					<li role="presentation"class="active" ><a href="login.jsp"style="font-size:40px;color:#0000cd; position: relative; left:500px;">登录</a></li>
					
				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-12" style="background-image:url(11.jpg)">
				<div class="container sections-wrapper">
        <div class="row">
            <div class="primary col-md-8 col-sm-12 col-xs-12">
                <section class="about section">
                    <div class="section-inner">
                        <h2 class="heading">About Product</h2>
                        <div class="content">
                            <p>会议室是组织的公共资源，会议室及其附属的设备构成召开会议的基础环境。提高会议效率有两个决定性因素：“参会人”和“会议环境”，“参会人”是核心因素，“会议环境”则是基础因素。会议室没有管理，会造成会议室被争抢、重要会议被非重要会议挤占、会议室信息不能及时发布、会议室设备开会时不满足会议要求、会议室设备没有提前调试以及设备因没有及时检修造成 故障、会中设备出现故障且没有应急预案等等问题。这些问题往往频繁发生，使人们平时习以为常，用时抱怨连连。如果任由问题发生、日积月累，则会产生严重影响，轻则：会影响会议效率，打断会议安排；重则：会影响员工情绪，冲击组织文化</p>
                         <p>工欲善其事，必先利其器。ThinkWin CR会议室管理系统的目标是解决以下问题：</p><br />
                           <p>会议管理：将会议信息录入系统进行管理，方便查询，及时发布；</p><br />
                             <p>会议预约：预约会议时，清晰找到会议室及设备信息；</p><br />
                               <p>信息发布：让人们方便及时了解会议及会议室信息；</p><br />
                                 <p>设备管理：通过会前、会后检查和检修管理，保证设备正常；</p><br />
                                   <p>服务管理：对会议服务进行管理，保证会议的顺畅进行。</p><br />
                        </div><!--//content-->
                    </div><!--//section-inner-->                 
                </section><!--//section-->
    
               <section class="latest section">
                    <div class="section-inner">
                        <h2 class="heading">开发人员介绍</h2>
                        <div class="content">    
                           <div class="item row">
                                
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a  target="_blank">所属小组：第八组</a></h3>
                                    <p>组长：刘翠芳</p>
                                    <p>技术组长：赵星宇</p>
                                    <p>组员：朱彤，裴丹，张宇，朱文晨，张舰心</p>
             
                                </div><!--//desc-->                          
                            </div><!--//item-->
                            
                            <div class="item row">
                                <a class="col-md-4 col-sm-4 col-xs-12" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-web-development-agencies-devstudio/" target="_blank">
                                <img class="img-responsive project-image" src="lcf.jpg" alt="project name" />
                                </a>
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-web-development-agencies-devstudio/" target="_blank">组长 - 刘翠芳</a></h3>
                                    <p>负责管理员界面设计</p>
                                    
                                </div><!--//desc-->                          
                            </div><!--//item-->
                            <div class="item row">
                                <a class="col-md-4 col-sm-4 col-xs-12" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-startups-tempo/" target="_blank">
                                <img class="img-responsive project-image" src="zxy.jpg" alt="project name" />
                                </a>
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a  target="_blank">技术组长 - 赵星宇</a></h3>
                                    <p>负责数据库的构建</p>
                                    
                                </div><!--//desc-->                          
                            </div><!--//item-->  
                            <div class="item row">
                                <a class="col-md-4 col-sm-4 col-xs-12" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-startups-tempo/" target="_blank">
                                <img class="img-responsive project-image" src="zt.jpg" alt="project name" />
                                </a>
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a s target="_blank">组员 - 朱彤</a></h3>
                                    <p>负责管理员界面</p>
     
                                </div><!--//desc-->                          
                            </div><!--//item--> 
                                                       
                            <div class="item row">
                                <a class="col-md-4 col-sm-4 col-xs-12" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-mobile-apps-delta/" target="_blank">
                                <img class="img-responsive project-image" src="pd.jpg" alt="project name" />
                                </a>
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a target="_blank">组员  - 裴丹</a></h3>
                                    <p> 负责管理员界面</p>
                                    
                                </div><!--//desc-->                          
                            </div><!--//item-->
                            
                            <div class="item row">
                                <a class="col-md-4 col-sm-4 col-xs-12" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-startups-tempo/" target="_blank">
                                <img class="img-responsive project-image" src="zy.jpg" alt="project name" />
                                </a>
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a  target="_blank">组员 - 张宇</a></h3>
                                    <p>负责首页和登录界面</p>
                                    
                                </div><!--//desc-->                          
                            </div><!--//item-->  
                            
                            <div class="item row">
                                <a class="col-md-4 col-sm-4 col-xs-12"  target="_blank">
                                <img class="img-responsive project-image" src="zwc.jpg" alt="project name" />
                                </a>
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a  target="_blank">组员  - 朱文晨</a></h3>
                                    <p>负责员工界面</p>
                                   
                                </div><!--//desc-->                          
                            </div><!--//item-->  
                            
                            <div class="item row">
                                <a class="col-md-4 col-sm-4 col-xs-12"  target="_blank">
                                <img class="img-responsive project-image" src="zjx.jpg" alt="project name" />
                                </a>
                                <div class="desc col-md-8 col-sm-8 col-xs-12">
                                    <h3 class="title"><a  target="_blank">组员 - 张舰心</a></h3>
                                    <p>负责功能的实现</p>
                                    
                                </div><!--//desc-->                          
                            </div><!--//item-->  
                            
                        </div><!--//content-->  
                    </div><!--//section-inner-->                 
                </section><!--//section-->
                
                <section class="projects section">
                    <div class="section-inner">
                        <h2 class="heading">Other Projects</h2>
                        <div class="content">
                            <div class="item">
                                <h3 class="title"><a href="#">Project Title Cras Lacus</a></h3>
                                <p class="summary">Provide a brief description of your project. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatu.</p>
                                <p><a class="more-link" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-mobile-apps-delta/" target="_blank"><i class="fa fa-external-link"></i> Find out more</a></p>
                            </div><!--//item-->
                            <div class="item">
                                <h3 class="title"><a href="#">Project Title Cras eget lacus</a> <span class="label label-theme">Open Source</span></h3>
                                <p class="summary">Provide a brief description of your project. Maecenas ornare ultricies risus, in fermentum augue consectetur in. Vestibulum vitae mauris iaculis, sollicitudin velit in, molestie nulla. </p>
                                <p><a class="more-link" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-mobile-apps-delta/" target="_blank"><i class="fa fa-external-link"></i> View on GitHub</a></p>
                            </div><!--//item-->
                            <div class="item">
                                <h3 class="title"><a href="#">Project Title Maecenas Ornare</a> <span class="label label-theme">Open Source</span></h3>
                                <p class="summary">Provide a brief description of your project. Lorem ipsum dolor sit amet, consectetur adipiscing elit. In vel purus enim. Etiam tortor felis, fermentum ac ultrices sed.</p>
                                <p><a class="more-link" href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-mobile-apps-delta/" target="_blank"><i class="fa fa-external-link"></i> View on GitHub</a></p>
                            </div><!--//item-->
                            
                            <a class="btn btn-cta-secondary" href="#">More on CoderWall <i class="fa fa-chevron-right"></i></a>
                            
                        </div><!--//content-->  
                    </div><!--//section-inner-->                 
                </section><!--//section-->
                
               
                
            </div><!--//primary-->
            <div class="secondary col-md-4 col-sm-12 col-xs-12">
                 <aside class="info aside section">
                    <div class="section-inner">
                        <h2 class="heading sr-only">Basic Information</h2>
                        <div class="content">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-map-marker"></i><span class="sr-only">Location:</span>重庆交通大学 语音楼 </li>
                                <li><i class="fa fa-envelope-o"></i><span class="sr-only">Email:</span><a >@eight.com</a></li>
                                <li><i class="fa fa-link"></i><span class="sr-only">Website:</span><a >http://www.huiyiguanli.com</a></li>
                            </ul>
                        </div><!--//content-->  
                    </div><!--//section-inner-->                 
                </aside><!--//aside-->
                
                <aside class="skills aside section">
                    <div class="section-inner">
                        <h2 class="heading">Skills</h2>
                        <div class="content">
                            <p class="intro">
                                Intro about your skills goes here. Keep the list lean and only show your primary skillset. You can always provide a link to your Linkedin or Coderwall profile so people can get more info there.</p>
                            
                            <div class="skillset">
                               
                                <div class="item">
                                    <h3 class="level-title">Python &amp; Django<span class="level-label" data-toggle="tooltip" data-placement="left" data-animation="true" title="You can use the tooltip to add more info...">Expert</span></h3>
                                    <div class="level-bar">
                                        <div class="level-bar-inner" data-level="96%">
                                        </div>                                      
                                    </div><!--//level-bar-->                                 
                                </div><!--//item-->
                                
                                <div class="item">
                                    <h3 class="level-title">Javascript &amp; jQuery<span class="level-label">Expert</span></h3>
                                    <div class="level-bar">
                                        <div class="level-bar-inner" data-level="96%">
                                        </div>                                      
                                    </div><!--//level-bar-->                                 
                                </div><!--//item-->
                                
                                <div class="item">
                                    <h3 class="level-title">HTML5, CSS3, SASS &amp; LESS<span class="level-label">Expert</span></h3>
                                    <div class="level-bar">
                                        <div class="level-bar-inner" data-level="96%">
                                        </div>                                      
                                    </div><!--//level-bar-->                                 
                                </div><!--//item-->
                                
                                <div class="item">
                                    <h3 class="level-title">Ruby on Rails<span class="level-label">Pro</span></h3>
                                    <div class="level-bar">
                                        <div class="level-bar-inner" data-level="85%">
                                        </div>                                      
                                    </div><!--//level-bar-->                                 
                                </div><!--//item-->
                                
                                <p><a class="more-link" href="#"><i class="fa fa-external-link"></i> More on Coderwall</a></p> 
                            </div>              
                        </div><!--//content-->  
                    </div><!--//section-inner-->                 
                </aside><!--//section-->
                
                <aside class="testimonials aside section">
                    <div class="section-inner">
                        <h2 class="heading">Testimonials</h2>
                        <div class="content">
                            <div class="item">
                                <blockquote class="quote">                                  
                                    <p><i class="fa fa-quote-left"></i>James is an excellent software engineer and he is passionate about what he does. You can totally count on him to deliver your projects!</p>
                                </blockquote>                
                                <p class="source"><span class="name">Tim Adams</span><br /><span class="title">Curabitur commodo</span></p>                                                             
                            </div><!--//item-->
                            
                            <p><a class="more-link" href="#"><i class="fa fa-external-link"></i> More on Linkedin</a></p> 
                            
                        </div><!--//content-->
                    </div><!--//section-inner-->
                </aside><!--//section-->
                
                <aside class="education aside section">
                    <div class="section-inner">
                        <h2 class="heading">Education</h2>
                        <div class="content">
                            <div class="item">                      
                                <h3 class="title"><i class="fa fa-graduation-cap"></i> MSc Psychology and Computer Science</h3>
                                <h4 class="university">University College London <span class="year">(2011-2012)</span></h4>
                            </div><!--//item-->
                            <div class="item">
                                <h3 class="title"><i class="fa fa-graduation-cap"></i> BSc Computer Science</h3>
                                <h4 class="university">University of Bristol <span class="year">(2008-2011)</span></h4>
                            </div><!--//item-->
                        </div><!--//content-->
                    </div><!--//section-inner-->
                </aside><!--//section-->
                            
                <aside class="languages aside section">
                    <div class="section-inner">
                        <h2 class="heading">Languages</h2>
                        <div class="content">
                            <ul class="list-unstyled">
                                <li class="item">
                                    <span class="title"><strong>English:</strong></span>
                                    <span class="level">Native Speaker <br class="visible-xs"/><i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> </span>
                                </li><!--//item-->
                                <li class="item">
                                    <span class="title"><strong>Spanish:</strong></span>
                                    <span class="level">Professional Proficiency <br class="visible-sm visible-xs"/><i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star-half"></i></span>
                                </li><!--//item-->
                            </ul>
                        </div><!--//content-->
                    </div><!--//section-inner-->
                </aside><!--//section-->
                
                <aside class="blog aside section">
                    <div class="section-inner">
                        <h2 class="heading">Latest Blog Posts</h2>
                        <p>You can use Sascha Depold's <a href="https://github.com/sdepold/jquery-rss" target="_blank">jQuery RSS plugin</a> to pull in your blog post feeds.</p>
                        <div id="rss-feeds" class="content">

                        </div><!--//content-->
                    </div><!--//section-inner-->
                </aside><!--//section-->
                
                <aside class="list music aside section">
                    <div class="section-inner">
                        <h2 class="heading">Favourite coding music</h2>
                        <div class="content">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-headphones"></i> <a href="#">Etiam hendrerit urna nunc</a></li>
                                <li><i class="fa fa-headphones"></i> <a href="#">Ut sollicitudin in mauris non auctor</a></li>
                                <li><i class="fa fa-headphones"></i> <a href="#">Etiam hendrerit urna nunc</a></li>
                                <li><i class="fa fa-headphones"></i> <a href="#">Duis et felis bibendum</a></li>
                            </ul>
                        </div><!--//content-->
                    </div><!--//section-inner-->
                </aside><!--//section-->
                
                <aside class="list conferences aside section">
                    <div class="section-inner">
                        <h2 class="heading">Conferences</h2>
                        <div class="content">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-calendar"></i> <a href="https://developer.apple.com/wwdc/" target="_blank">WWDC 2014</a> (San Francisco)</li>
                                <li><i class="fa fa-calendar"></i> <a href="http://hive.aigaseattle.org/">Hive</a> (Seattle)</li>
                            </ul>
                        </div><!--//content-->
                    </div><!--//section-inner-->
                </aside><!--//section-->
                
                <aside class="credits aside section">
                    <div class="section-inner">
                        <h2 class="heading">Credits</h2>
                        <div class="content">
                            <ul class="list-unstyled">
                                <li><a href="http://getbootstrap.com/" target="_blank"><i class="fa fa-external-link"></i> Bootstrap</a></li>
                                <li><a href="http://fortawesome.github.io/Font-Awesome/" target="_blank"><i class="fa fa-external-link"></i> FontAwesome</a></li>
                                <li><a href="http://jquery.com/" target="_blank"><i class="fa fa-external-link"></i> jQuery</a></li>
                                <li><a href="https://github.com/IonicaBizau/github-calendar" target="_blank"><i class="fa fa-external-link"></i> GitHub Calendar Plugin</a></li>
                                
                                <li><a href="http://caseyscarborough.com/projects/github-activity/" target="_blank"><i class="fa fa-external-link"></i> GitHub Activity Stream</a></li>
                                
                                <li><a href="https://github.com/sdepold/jquery-rss" target="_blank"><i class="fa fa-external-link"></i> jQuery RSS</a></li>
                                
                                <li>Profile image: <a href="https://www.flickr.com/photos/dotbenjamin/2577394151" target="_blank">Ben Smith</a></li>
                                <li>iPad and iPhone mocks: <a href="https://dribbble.com/perlerar" target="_blank">Regy Perlera</a></li>
                                
                            </ul>
                            
                            <hr/>
                            
                             <p>This responsive portfolio template is handcrafted by UX designer <a href="https://www.linkedin.com/in/xiaoying" target="_blank">Xiaoying Riley</a> at <a href="http://themes.3rdwavemedia.com/" target="_blank">3rd Wave Media</a> for developers and is <strong>FREE</strong> under the <a class="dotted-link" href="http://creativecommons.org/licenses/by/3.0/" target="_blank">Creative Commons Attribution 3.0 License</a></p>
                             <p>We will improve or add new features to this template based on users' feedback so follow us on twitter to get notified when a new version is out!</p>
                            <a class="btn btn-cta-secondary btn-follow" href="https://twitter.com/3rdwave_themes" target="_blank"><i class="fa fa-twitter"></i> Follow us</a>
                            <a class="btn btn-cta-primary btn-download" href="http://themes.3rdwavemedia.com/website-templates/free-responsive-website-template-for-developers/" target="_blank"><i class="fa fa-download"></i> I want to download</a>
                        </div><!--//content-->
                    </div><!--//section-inner-->
                </aside><!--//section-->
              
            </div><!--//secondary-->    
        </div><!--//row-->
    </div><!--//masonry-->
    
    <!-- ******FOOTER****** --> 
    <footer class="footer">
        <div class="container text-center">
                <!--/* This template is released under the Creative Commons Attribution 3.0 License. Please keep the attribution link below when using for your own project. Thank you for your support. :) If you'd like to use the template without the attribution, you can check out other license options via our website: themes.3rdwavemedia.com */-->
                <small class="copyright">Designed with <i class="fa fa-heart"></i> by <a href="http://themes.3rdwavemedia.com" target="_blank">Xiaoying Riley</a> for developers</small>
        </div><!--//container-->
    </footer><!--//footer-->
			</div>
		</div>
	</div>

</body>
</html>
