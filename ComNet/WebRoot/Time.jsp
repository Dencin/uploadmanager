<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<script>

function dateDemo()
{
	  //获得系统当前时间
	  var date = new Date();
	  //获得年份
	  var year = date.getYear();
	  //获得月份
	  var month = date.getMonth();
	  //获得日期
	  var days = date.getDate();
	  //获得星期
	  var day = date.getDay();
	  //获得小时
	  var hours = date.getHours();
	  //获得分钟
	  var mulis = date.getMinutes();
	  //获得秒
	  var second = date.getSeconds();
	  
	  //alert(year+"年"+(month+1)+"月"+days+"日 "+hours+"时"+mulis+"分"+second+"秒");
	  document.getElementById("showdate").innerHTML=year+"年"+(month+1)+"月"+days+"日 "+hours+"时"+mulis+"分"+second+"秒";
	  //让指定的方法隔一定的时间执行一次
	  //定时器
	  setTimeout(dateDemo,1000);//第隔一种调用自己一个次(方法名不要加括号)
	  
	 }

</script>
</head>

<body onload="dateDemo()">
<span id="showdate"></span>
</body>
</html>



    
