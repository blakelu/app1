<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<!--    <link href="css/bootstrap-combined.min.css" rel="stylesheet"> -->
 	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="css/bootstrap.css" rel="stylesheet">

    <link href="css/mypage.css" rel="stylesheet">

    <script type="text/javascript" src="js/jquery-1.11.3.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>


<title>Insert title here</title>
</head>

<body>
	<!-- 顶部导航条 -->
	<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
	<div class="container">
		<a href="index.jsp"> <img src="img/logo3.png" class="logo" /></a>
		<ul id="hometabs" class="nav navbar-nav">
			<li class="active"><a class="biaoti" href="">主页</a></li>
			<li><a class="biaoti" href="">管理员入口</a></li>
			<li><a class="biaoti" href="">Hello</a></li>
		</ul>
		<form class="navbar-form navbar-left" role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
		<ul class="nav navbar-nav navbar-right">

			<li class="dropdown"><a href="#" class="dropdown-toggle "
				data-toggle="dropdown" role="button" aria-haspopup="true"
				aria-expanded="false">Dropdown <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="regist.jsp">adminstor regist</a></li>
					<li><a href="#">Another action</a></li>
					<li><a href="#">Something else here</a></li>
					<li role="separator" class="divider"></li>
					<li><a href="#">Separated link</a></li>
				</ul></li>
		</ul>
		<p class="navbar-text navbar-right biaoti">
			<a class="biaoti" href="login.jsp" class="navbar-link">Signed in</a>
			as a visitor
		</p>

	</div>
	</nav>
	<div style="padding: 50px 0px 0px 0px;"></div>



	<div class="row">

		<div class="carousel slide" id="carousel-147415">
			<ol class="carousel-indicators">
				<li data-slide-to="0" data-target="#carousel-147415"></li>
				<li data-slide-to="1" data-target="#carousel-147415"></li>
				<li data-slide-to="2" data-target="#carousel-147415"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item">
					<img alt="" src="img/1.jpg" />
					<div class="carousel-caption">
						<h4>棒球</h4>
						<p>棒球运动是一种以棒打球为主要特点，集体性、对抗性很强的球类运动项目，在美国、日本尤为盛行。</p>
					</div>
				</div>
				<div class="item active left">
					<img alt="" src="img/2.jpg" />
					<div class="carousel-caption">
						<h4>冲浪</h4>
						<p>
							冲浪是以海浪为动力，利用自身的高超技巧和平衡能力，搏击海浪的一项运动。运动员站立在冲浪板上，或利用腹板、跪板、充气的橡皮垫、划艇、皮艇等驾驭海浪的一项水上运动。
						</p>
					</div>
				</div>
				<div class="item next left">
					<img alt="" src="img/3.jpg" />
					<div class="carousel-caption">
						<h4>自行车</h4>
						<p>
							以自行车为工具比赛骑行速度的体育运动。1896年第一届奥林匹克运动会上被列为正式比赛项目。环法赛为最著名的世界自行车锦标赛。</p>
					</div>
				</div>
			</div>
			<a data-slide="prev" href="#carousel-147415"
				class="left carousel-control">‹</a> <a data-slide="next"
				href="#carousel-147415" class="right carousel-control">›</a>
		</div>
	</div>





	<div class="container">
		<div class="alert alert-warning alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<strong>Warning!</strong> Better check yourself, you're not looking
			too good.
		</div>
		<div class="row">
			<!-- 左标签拉栏 -->
			<div class="span2" style="width: 150px">
				<ul class="nav nav-list">
					<li class="nav-header">列表标题</li>
					<li class="active"><a href="#">首页</a></li>
					<li><a href="#">库</a></li>
					<li><a href="#">应用</a></li>
					<li class="nav-header">功能列表</li>
					<li><a href="#">资料</a></li>
					<li><a href="#">设置</a></li>
					<li class="divider"></li>
					<li><a href="#">帮助</a></li>
				</ul>
			</div>

			<div class="span10">
				<ul class="nav nav-tabs" id="mytab">
					<li class="active"><a href="#">首页</a></li>
					<li><a href="#">资料</a></li>
					<li class="disabled"><a href="#">信息</a></li>
					<li class="dropdown pull-right"><a href="#"
						data-toggle="dropdown" class="dropdown-toggle">下拉<strong
							class="caret"></strong></a>
						<ul class="dropdown-menu">
							<li><a href="#">操作</a></li>
							<li><a href="#">设置栏目</a></li>
							<li><a href="#">更多设置</a></li>
							<li class="divider"></li>
							<li><a href="#">分割线</a></li>
						</ul></li>
				</ul>

				<div>数据加载中~~</div>
			</div>


		</div>
	</div>



	<p>Loading ...</p>
	如果还没有注册，单击此处
	<a href="regist.jsp">注册</a> 如果还没有登入，单击此处
	<a href="login.jsp">登录</a>
	<p>Loading ...</p>
	如果还没有注册，单击此处
	<a href="regist.jsp">注册</a> 如果还没有登入，单击此处
	<a href="login.jsp">登录</a>
	<p>Loading ...</p>
	如果还没有注册，单击此处
	<a href="regist.jsp">注册</a> 如果还没有登入，单击此处
	<a href="login.jsp">登录</a>
	<p>Loading ...</p>
	如果还没有注册，单击此处
	<a href="regist.jsp">注册</a> 如果还没有登入，单击此处
	<a href="login.jsp">登录</a>

</body>
<script>
 	$("#hometabs a").click(function(e){
		e.preventDefault();
		$(this).tab("show");
	});
	
	$("#mytab a" ).click(function(e){
		e.preventDefault();
		$(this).tab("show");
	});

</script>
</html>
