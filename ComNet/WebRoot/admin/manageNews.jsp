<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
	<base href="<%=basePath%>">
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>管理人员-管理</title>
		<link rel="stylesheet" type="text/css" href="css/style_admin.css">
</head>
<script type="text/javascript">
function stop(){
if(${currentpage}==1){
document.getElementById("b2").disabled=true;
}

else if(${currentpage}==(${countpage})){
document.getElementById("b3").disabled=true;
}
}


function pagedown(currentpage){

window.location.href="ManageNews?currentpage="+currentpage;
}

function pageup(currentpage){
window.location.href="ManageNews1?currentpage="+currentpage;
}

function godelete(ID){
if(confirm("确定删除该条信息")){
window.location.href="DeleteNews?newsID="+ID;
}
else{
window.location("manageNews.jsp")
}
}
</script>
<body onload="stop()">
		<table cellspacing="1" cellpadding="4" width="100%"
			class="tableborder" id="table3"  >
			<form name="form1" action="showUserList.htm" method="post">
			<tr>
			<td><label>${ succmsg }</label></td>
			<tr>
			<tr>
				<td colspan="15" class="header">
					新闻管理
				</td>
			</tr>
			<tr>
				<td align="center" class="altbg1">
					<b>新闻标题</b>
				</td>
				<td align="center" class="altbg1">
					<b>新闻发布时间</b>
				</td>
				<td align="center" class="altbg1">
					<b>删除</b>
				</td>
			</tr>
			<c:forEach items="${list}" var="news">
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					${news.title} 
				</td>
				<td class="altbg2" rowspan="2" align="center">
					${news.writerDate} 
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<input type="button" name="b1" id="b1" value="删除" onclick="godelete(${news.newsID} )">
				</td>
			</tr>
			<tr>

			</tr>
			</c:forEach>
			
			<tr>

			</tr>
			<tr><td class="altbg2" colspan="7" rowspan="2" align="right">
				总共【${countpage}】页 &nbsp;&nbsp;${currentpage}/${countpage} &nbsp;&nbsp; 
				<input type="button" name="b1" id="b1" value="首页" onclick="pagedown(0)">
				
				<input type="button" name="b2" id="b2" value="上一页" onclick="pageup(${ currentpage })">
				<input type="button" name="b3" id="b3" value="下一页" onclick="pagedown(${ currentpage })">
				
				<input type="button" name="b4" id="b4" value="末页" onclick="pagedown(${ countpage }-1)">
			</tr>
			</table>
</body>
</html>