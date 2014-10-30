<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.softeem.train.dto.NewsDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>留言本</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<meta name="description" content="留言本">
		<link href="img/1/jd100.css" rel="stylesheet" type="text/css">
	</head>
	<script type="text/javascript">

    function pagedown(currentpage){

    window.location.href="MessageBoard?currentpage="+currentpage;
     }

function pageup(currentpage){
window.location.href="MessageBoard1?currentpage="+currentpage;
}

function stop(){
if(${currentpage}==1){
document.getElementById("b2").disabled=true;
}

else if(${currentpage}==(${countpage})){
document.getElementById("b3").disabled=true;
}
}
</script>
	<body background=img/1/bookbg.gif leftmargin='0' topmargin='3'
		marginwidth='0' marginheight='0' onload="stop()">
		<div align='center'>
			<IMG src=img/1/welcome.jpg>
		</div>
		<div align='center'>
			<table width='750' border='0' cellspacing='1' cellpadding='4'
				align='center'>
				<tr>
				<td><label>${ succmsg } </label></td>
				</tr>
				<tr>
				<td><label>${ errorccmsg } </label></td>
				</tr>
				
				<tr>
					<td height='20' colspan='2' align='right' class='unnamed2'>
						<marquee onMouseOut=start(); onMouseOver=stop(); scrollamount=3>
							<b><font color=#000099>欢迎您使用&nbsp;留言本&nbsp;</font> </b>
						</marquee>
					</td>
				</tr>

			</table>
			<div align='center' style=''>
				<div align='left'>
					<table width='%' height='20' border='0' cellpadding='0'
						cellspacing='0'>
						<tr>
							<td width='11' background='img/1/titlemu_1.gif'></td>
							<td width='*' background='img/1/titlemu_2.gif'>
								<div align='center'>
									<a href='newMessage.jsp' class=jdmenu><b>新留言</b> </a>
								</div>
							</td>
							<td width='12' background='img/1/titlemu_3.gif'></td>
						</tr>
					</table>
				</div>
			</div>
			<form name='form' method='post' action='index.asp'
				onSubmit='submitonce(this)'>
				<TABLE width='750' border=0 align='center' cellPadding=0
					cellSpacing=0 borderColor=#111111 style='BORDER-COLLAPSE: collapse'>
					<TBODY>
						<TR>
							<TD width='2%'>
								<IMG src='img/1/T_left.gif' border=0>
							</TD>
							<TD width='96%' background='img/1/Tt_bg.gif'></TD>
							<TD width='2%'>
								<IMG src='img/1/T_right.gif' border=0>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
				<TABLE width='750' height=51 border=1 align=center cellPadding=3
					cellSpacing=0 class='jd_tab'
					style='border-collapse: collapse; word-wrap: break-word;'>
					<TBODY>
						<TR class=jd_titlemu>
							<TD width='5%' class='jd_tab'>
								<div align='center'>
									回复
								</div>
							</TD>
							<TD width='50%' class='jd_tab'>
								<div align='center'>
									标题
								</div>
							</TD>
							<TD width='20%' class='jd_tab'>
								<div align='center'>
									作者
								</div>
							</TD>
							<TD width='25%' class='jd_tab'>
								<div align='center'>
									时间
								</div>
							</TD>
						</TR>
						
						 <c:forEach items="${list}" var="md">
						 
						<TR class=unnamed1>
							<TD width='6%' height='25' align=middle valign='top'
								class='jd_tab'>
								1
							</TD>
							<TD width='53%' height='25' align=left valign='top'
								class='jd_tab'>
								<a href='RevertMessage?messageID=${md.messageID }'> <img
										src='img/1/jd-to.gif' border='0'>&nbsp;${md.title}  </a>
							</TD>
							<TD width='20%' height='25' align=middle valign='top'
								class='jd_tab'>
								<font color=#666666> ${md.writer} </font>
							</TD>
							<TD width='14%' height='25' align=left valign='top'
								class='jd_tab'>
								<font color=#666666>${md.writeDate}</font>
							</TD>
						</TR>
						 </c:forEach>
						
						

						

						
					</TBODY>
				</TABLE>
				<TABLE width='750' border=0 align='center' cellPadding=0
					cellSpacing=0 style='BORDER-COLLAPSE: collapse'>
					<TBODY>
						<TR>
							<TD>
								<IMG src='img/1/T_bottomleft.gif' border=0>
							</TD>
							<TD width='100%' background='img/1/T_bottombg.gif'></TD>
							<TD>
								<IMG src='img/1/T_bottomright.gif' border=0>
							</TD>
						</TR>
					</TBODY>
				</TABLE>
				<TABLE width='10' border=0 align='center' cellPadding=0
					cellSpacing=0>
					<TR>
						<TD height=5></TD>
					</TR>
					
				</TABLE>
				<table>
				
								<tr valign="bottom" align="right">
									<td colspan="3" width="100%">
										&nbsp;&nbsp;&nbsp;&nbsp;
										<br>
										<br>
							总共【${countpage} 】页 &nbsp;&nbsp;${currentpage} /${countpage }&nbsp;&nbsp;
							<input type="button" name="b1" id="b1" value="首页" onclick="pagedown(0)"> 
							<input type="button" name="b2" id="b2" value="上一页" onclick="pageup(${ currentpage })">
							<input type="button" name="b3" id="b3" value="下一页" onclick="pagedown(${ currentpage })">
		                    <input type="button" name="b4" id="b4" value="末页" onclick="pagedown(${ countpage }-1)">
									</td>
								</tr>
				</table>
			</form>
		</div>

	</body>
</html>