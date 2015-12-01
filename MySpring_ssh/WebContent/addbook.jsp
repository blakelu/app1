<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">

<link href="css/mypage.css" rel="stylesheet">

<script type="text/javascript" src="js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<title>添加图书</title>
</head>
<body>
<button type="button" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
</button>
	<!-- 添加图书表单 -->
	<s:form action="book_add" namespace="/" method="post" theme="simple">
		图书名称<s:textfield name="name"/><br/>
		图书价格<s:textfield name="price"/><br/>
		<s:submit value = "添加书籍"/>
	</s:form>
	<div class="container">
		<div class="row">
			<div class="span2" style="width: 150px">
				<ul class="nav nav-list">
					<li class="nav-header">列表标题</li>
					<li class="active"><a href="#">首页</a></li>
					<li><a href="#">图书管理</a></li>
					<li><a href="#">添加书籍</a></li>
					<li><a href="#">会员管理</a></li>
					<li class="nav-header">功能列表</li>
					<li><a href="#">主页公告</a></li>
					<li><a href="#">借书统计</a></li>
					<li class="divider"></li>
					<li><a href="#">帮助</a></li>
				</ul>
			</div>
			
			
			
			<div class="span10">
				<h3>添加图书</h3>
				<s:form class="form-horizontal" action="book_add" namespace="/" method="post" theme="simple" enctype="multipart/form-data">
					<fieldset>
						<div id="legend" class="">
							<legend class=""></legend>
						</div>
						<div class="control-group">
							<div class="controls">
							<label class="control-label" for="input01">书名</label>
								<input type="text" placeholder="java讲义--疯狂讲学"
									class="input-xlarge" name="name">
								<p class="help-block">大标题--小标题</p>
							</div>
						</div>
						<div class="control-group">

							<!-- Text input-->
							<label class="control-label" for="input01">价格</label>
							<div class="controls">
								<input type="text" placeholder="单位(元)" class="input-xlarge" name="price">
								<p class="help-block">请输入整数</p>
							</div>
						</div>

						<div class="control-group">

							<!-- Text input-->
							<label class="control-label" for="input01">ISBN</label>
							<div class="controls">
								<input type="text" placeholder="图书统一编号" class="input-xlarge" name="ISBN">
								<p class="help-block">Supporting help text</p>
							</div>
						</div>

						<div class="control-group">

							<!-- Text input-->
							<label class="control-label" for="input01">作者</label>
							<div class="controls">
								<input type="text" placeholder="多个作者用、分隔" class="input-xlarge"  name="author">
								<p class="help-block">如：李白、杜甫</p>
							</div>
						</div>

						<div class="control-group">

							<!-- Appended input-->
							<label class="control-label">出版社</label>
							<div class="controls">
								<div class="input-append">
									<input class="span2" placeholder="ps:科技大学" type="text" name="press">
									<span class="add-on">出版社</span>
								</div>
								<p class="help-block"></p>
							</div>

						</div>
						<div class="control-group">

							<!-- Text input-->
							<label class="control-label" for="input01">出版时间</label>
							<div class="controls">
								<input type="text" placeholder="2015-8-9" class="input-xlarge" name="publishDate">
								<p class="help-block"></p>
							</div>
						</div>

						<div class="control-group">

							<!-- Select Basic -->
							<label class="control-label">类型</label>
							<div class="controls">
								<select class="input-xlarge" name="kind">
									<option>工业技术</option>
									<option>科学技术</option>
									<option>养生文化</option>
									<option>语言类</option>
								</select>
							</div>

						</div>
						<div class="control-group">

							<!-- Textarea -->
							<label class="control-label">简要描述</label>
							<div class="controls">
								<div class="textarea">
									<textarea type="" class="" name="info"> </textarea>
								</div>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">封面图片</label>

							<!-- File Upload -->
							<div class="controls">
							<s:file class="input-file" id="myFile" name="myFile"  onchange="setImageView(this)"></s:file>
								<!-- <input class="input-file" id="fileInput" name="fileInput" type="file"> -->
								<img src ="<%=request.getContextPath()%>/uploadImages/${book.src}"/>
								<img width="100px" height="100px" id="imgView" src="<%=request.getContextPath()%>/uploadImages/default.jpg" />
							
							</div>
						</div>
						<div class="control-group">

							<!-- Text input-->
							<label class="control-label" for="input01">库存</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge">
								<p class="help-block">请填写整数</p>
							</div>
						</div>
						<div class="control-group">
							<div class="controls">
								<button class="btn btn-success">确定</button>
								<button class="btn btn-success">重置</button>
							</div>
						</div>
					</fieldset>
				</s:form>

			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
function setImageView(obj) {
	var imagePath;
	if (obj) {
		//ie  
		if (window.navigator.userAgent.indexOf("MSIE") >= 1) {
			obj.select();
			imagePath = document.selection.createRange().text;
			console.log("1");
			console.log(imagePath);
		}
		//firefox  
		else if (window.navigator.userAgent.indexOf("Firefox") >= 1) {
			if (obj.files) {
				console.log(obj.files.item(0).name);
				imagePath = obj.files.item(0).getAsDataURL();
				console.log("2");
				console.log(imagePath);
			}else{
				imagePath = obj.value;
				console.log("3");
				console.log(imagePath);		
			}
		}else{
			console.log("4");
		}
		
	}
	
	var $imgView = $("#imgView");
	$imgView.attr("src", imagePath);
}

	
</script>
</html>