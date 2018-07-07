<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="./css/index.css">
	<meta charset="utf-8">
	<title>综合性实验</title>
  </head>
  
	<body>
		<div class="wrapping clearfix">
			<div class="topTitle">
				<span>综合性实验</span>
			</div>
			<div class="mainLeft">
				<img src="./image/me.jpg" alt="myPhoto">
				<div>
					<p>姓名：张嘉怡</p>
					<p>学号：201527010523</p>
				</div>
			</div>
			<div class="mainRight">
				<button type="button" class="btn btn-default btn-block" onclick="window.location = './jsp/hibrenate.jsp'">实验三：hibrenate</button>
				<button type="button" class="btn btn-default btn-block">实验四：工厂模式</button>
				<button type="button" class="btn btn-default btn-block">实验五：单工厂模式</button>
				<button type="button" class="btn btn-default btn-block">实验六：Spring基本使用</button>
				<button type="button" class="btn btn-default btn-block">实验七：组合模式</button>
				<button type="button" class="btn btn-default btn-block">实验八：适配器模式</button>
			</div>
		</div>
	</body>
</html>
