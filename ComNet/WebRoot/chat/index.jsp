<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<base href="<%=basePath%>">
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<link href="css/right.css" rel="stylesheet" type="text/css" />
</head>
<body>

<form action="ValiLogin" method="post" name="form1">
<table width="399" border="0" align="center" cellpadding="0"
	cellspacing="0" bordercolor="#EBEBEB">
	<tr>
	<td><label>${succmsg }</label></td>
	</tr>
	
	<tr>
	<td><label>${errormsg }</label></td>
	</tr>
	
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr align="left">
		<td height="35" colspan="2" bgcolor="#EAF0FB" class="p16">
		<div align="center"><span class="d6"><strong>会 员
		登 录 </strong></span></div>
		</td>
	</tr>

	<tr>
		<td width="141" height="45" align="center" bgcolor="#EBEBEB"
			class="d5">您的帐号：</td>
		<td width="258" align="left" bgcolor="#EBEBEB"><input
			name="userName" type="text" /></td>
	</tr>
	<tr>

	</tr>
	<tr>
		<td height="45" align="center" bgcolor="#EBEBEB" class="d5">
		您的密码：</td>
		<td align="left" bordercolor="#EBEBEB" bgcolor="#EBEBEB"><input
			name="password" type="password" size="21" /></td>
	</tr>
	<tr>

	</tr>
	
	<tr bgcolor="#EBEBEB">
					<td align="center">
						验证码:
					</td>
					<td>
						<input name="txtValidate" type="text" class="input" size="6"
							maxlength="6">
							<img src="/ComNet/vcode.jsp">
						<span id="divValidate" style="display: none"><font
							color="#FF0000">验证码不能为空!</font>
						</span>
					</td>
				</tr>
	
	
	<tr align="left">
		<td height="35" colspan="2" align="right" bgcolor="#EAF0FB"
			class="p16">
		<div align="right"><span class="d6"><strong><a
			href="chat/register.jsp" class="dong02">我要注册</a>&nbsp;</strong></span></div>
		</td>
	</tr>
	<tr>
		<td height="60" colspan="2" valign="bottom">
		<div align="center"><input name="submit" type="submit"
			class="d6" value="登  录" /> &nbsp;&nbsp;&nbsp;&nbsp; <input
			name="reset" type="reset" class="d6" value="重  置" /></div>
		</td>
	</tr>
	<tr>

	</tr>
</table>
</form>

</body>

</html>
