<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.softeem.train.dto.AdminDTO;"%>
<%AdminDTO admin=(AdminDTO)request.getAttribute("admin"); %>
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
function godelete(ID){
if(confirm("确定删除该条信息?"))
{
window.location.href="DeleteUser?userID="+ID
}
else
{window.location.href="showUserList"}
}



</script>

<body>
		<table width="100%" height="100%" cellpadding="4" cellspacing="1"
			class="tableborder" id="table3">
			
		    <td width="42%"><form name="form1" action="DeleteMore" method="post">
			<tr>
			<td><label>${ succmsg } </label></td>
			</tr>
			
			<tr bgcolor=#698CC3>
				<td colspan="4" class="header" align="center">
					<font color="green" size=3>用户管理</font>
				</td>
			</tr>
			<tr>
			  <td align="center" class="altbg1">请选择
		        <input type="checkbox" name="checkboxall" onclick="checkedall()"></td>
				<td width="34%" align="center" class="altbg1">
					<b>用户名</b>				</td>
				<td width="5%" align="center" class="altbg1">
					<b>身份代码</b>				</td>
				<td width="4%" align="center" class="altbg1">
					<b>
				  <INPUT onClick="return window.confirm('确定删除选中的信息?')"
							type="submit" value="选定删除"> </b>
			  </td>
			</tr>
			
			<c:forEach items="${list}" var="admin">
			<tr>
			<td align="center" class="altbg2">
			<input name="item" type="checkbox" id="item" value=${ admin.userID }>
			</td>
			<td class="altbg2" align="center">${admin.userName}
			</td>
			
			<td class="altbg2" align="center">${admin.status}</td>
			
			<td class="altbg2"  align="center">
			<input type="button" name="b1" id="b1" value="删除" onclick="godelete(${admin.userID})">
					<!--<a href="DeleteUser?userID=${ admin.userID }">删除</a>-->
				</td>
			</tr>
			
			</c:forEach>
			
			
			
			
</table>
</body>
</html>