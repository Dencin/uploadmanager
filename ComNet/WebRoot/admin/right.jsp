<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%String userName=(String)request.getSession().getAttribute("userName"); 

%>
<html>

<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>管理首页-汇总统计</title>
</head>

<body bgcolor="#D6E0EF">
<table>
<tr>
 <td align="center"><font color="green size=3">欢迎<font color="red"><%=userName %></font>登录管理员界面</font></td>
</tr>
</table>
<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center 
            background="image/99.jpg" border=0>
           
              <TBODY>
              <tr>
				<td colspan="2" align="center"><font color="red">
						<label>${ succmsg }</label></font>
					</td>
				</tr>
				
				
				<tr>
				<td><label id="msg">${ errormsg }</label></td>
				</tr>
              <TR>
                <TD width="40%">&nbsp;</TD>
                <TD width="100%">
                  <MARQUEE id=info onmouseover=info.stop() 
                  onmouseout=info.start() scrollAmount=2 direction=up 
                  width="40%" 
                  height=500>
                   <P align="center"><font color="red">管理员注意事项</font></P>
                  <P align="center"><font color="green">窗前明月光</font></P>
                  <P align="center"><font color="green">疑是地上霜</font></P> 
                  <P align="center"><font color="green">举头望明月</font></P>
                  <P align="center"><font color="green">低头思故乡</font></P>
                  </MARQUEE></TD></TR></TBODY></TABLE>
</body>

</html>
