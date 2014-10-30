<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.softeem.train.dto.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  	String admin=(String)request.getSession().getAttribute("userName");
  	System.out.println(admin);
%>



<html>
  <head>   
    <title>sendMessage</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">  
	<link href="image/css.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		function checkSend(){		
			if(document.send.msg.value==""){
				alert("不能发送空信息。");
				return false;
			}else{
				document.send.message.value=document.send.msg.value;
				document.send.msg.value="";
				return true;
			}
			 
		}
	</script>
  </head>
  
  <body>
  <form action="dosendMessage.jsp" method="post" name="send" onSubmit="return checkSend()" target="message">
  <input type="hidden" name="message" value="" />
  <p align="center">
  	请输入发送信息：
   	<input type="text" name="msg" size="30" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   	<input type="submit" value="发送" />
   	<input type="hidden" name="admin" id="admin" value="<%=admin %>">
   	</p>
   	</form>
  </body>
</html>

