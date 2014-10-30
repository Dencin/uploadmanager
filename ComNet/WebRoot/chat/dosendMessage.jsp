<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.softeem.train.dto.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dosendMessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
	request.setCharacterEncoding("utf-8");
	SimpleDateFormat former=new SimpleDateFormat("hh:mm:ss");
	String time=former.format(new Date());
	String content=request.getParameter("message");
	List<String> list =new ArrayList<String>();
	if(application.getAttribute("MESSAGE")!=null){
	list=(List)application.getAttribute("MESSAGE");
	}
	
	//String admin=(String)session.getAttribute("userName");	
	
	String admin=request.getParameter("admin");	
	list.add(admin+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+time+"<br>"+content+"&nbsp;");
	application.setAttribute("MESSAGE",list);
	response.sendRedirect("message.jsp");
 %>
  </body>
</html>
