<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.softeem.train.dto.NewsDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>



	<script type="text/javascript">


function openChat(){
	window.open("chat/index.jsp","","left=250   top=200   width=500   height=400");
}

function pagedown(currentpage){
window.location.href="NewsInfo?currentpage="+currentpage;
}

 function pageup(currentpage){
window.location.href="NewsInfo1?currentpage="+currentpage;
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
	<table width="799" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="3" background="image/d.jpg"></td>
		</tr>
	</table>
	<table width="799" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td>
				<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
					codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0"
					width="799" height="161" title="pinhong">
					<param name="movie" value="image/2.swf" />
					<param name="quality" value="high" />
					<embed src="image/2.swf" quality="high"
						pluginspage="http://www.macromedia.com/go/getflashplayer"
						type="application/x-shockwave-flash" width="799" height="161"></embed>
				</object>
			</td>
		</tr>
	</table>
	<table width="799" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="3" background="image/d.jpg"></td>
		</tr>
	</table>
	<table width="799" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td>
				<img src="image/d_r3_c1.jpg" width="60" height="40" />
				<img src="image/top_red.jpg" width="20" height="40" border="0" />
				<img src="image/top_red.jpg" width="20" height="40" border="0" />
				
				<a href="index.jsp"><img src="image/d_r3_c5.jpg" width="64"
						height="40" border="0" /></a><img src="image/top_red.jpg" width="20" height="40" border="0" />
				<a href="ShowProductList?currentpage=0"><img src="image/d_r3_c7.jpg"
						name="image1" width="94" height="40" border="0" id="image1" /></a><img src="image/top_red.jpg" width="20" height="40" border="0" />
				<a href="NewsInfo?currentpage=0"><img src="image/d_r3_c8.jpg"width="93" height="40" border="0" />
				</a><img src="image/top_red.jpg" width="20" height="40" border="0" />
				<a href="#" onclick="openChat()"><img src="image/d_r3_c9.jpg"
						width="95" height="40" border="0" />
				</a><img src="image/top_red.jpg" width="20" height="40" border="0" />
				<a href="MessageBoard?currentpage=0" target="_blank"><img
						src="image/d_r3_c10.jpg" width="93" height="40" border="0" />
				</a><img src="image/top_red.jpg" width="20" height="40" border="0" />
				<a href="login.jsp"><img src="image/d_r3_c13.jpg" width="85"
						height="40" border="0" />
				</a><img src="image/top_red.jpg" width="20" height="40" border="0" />
				<img src="image/top_red.jpg" width="20" height="40" border="0" />
				<img src="image/d_r3_c25.jpg" width="36" height="40" />
			</td>
		</tr>
	</table>

	<link href="css/right.css" rel="stylesheet" type="text/css" />

	<BODY leftMargin=0 topMargin=0 marginheight="0" marginwidth="0" onload="stop()" >
		<TABLE height=28 cellSpacing=3 cellPadding=0 width=776 align=center
			background=zjej/btmunu.gif border=0>
			<TBODY>
				<TR vAlign=bottom>
					<TD>
						&nbsp;&nbsp;
						<A class=nav href="index.htm">首页</A><FONT class=nav> &gt; </FONT><A
							class=nav href="showNewsList.htm">站内新闻</A>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width=776 align=center border=0>
			<TBODY>
				<TR>
					<TD vAlign=top width=195 background="zzjz/ny3.gif" bgColor=#ffffff
						height=186>
						<link href="image/css.css" rel="stylesheet" type="text/css" />
						<table width="193" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center" valign="middle">
									<a href="NewsInfo?currentpage=0"><img src="image/cg1_r1_c2.jpg"
											width="175" height="25" border="0" />
									</a>
								</td>
							</tr>
							<tr>
								<td align="center" valign="middle">
									<a href="ShowProductList?currentpage=0"><img
											src="image/cg1_r2_c2.jpg" width="175" height="25" border="0" />
									</a>
								</td>
							</tr>
							<tr>
								<td align="center" valign="middle">
									<a href="after.jsp"><img src="image/cg1_r4_c2.jpg"
											width="175" height="25" border="0" />
									</a>
								</td>
							</tr>
							<tr>
								<td align="center" valign="middle">
									<a href="about.jsp"><img src="image/cg1_r6_c2.jpg"
											width="175" height="25" border="0" />
									</a>
								</td>
							</tr>
							<tr height="1">
								<td align="center" valign="middle">
									&nbsp;
								</td>
							</tr>
							<tr>
								<td>
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td colspan="2">
												<img src="image/cg1_r10_c1.jpg" width="188" height="28" />
											</td>
										</tr>
										<tr>
											<td width="33">
												<img src="image/cg5_1.jpg" width="21" height="28" />
											</td>
											<td width="158" class="d06">
												业务专线:010-88888888
											</td>
										</tr>
										<tr>
											<td width="33" colspan="2">
												<img src="image/tiao.jpg" />
											</td>
										</tr>
										<tr>
											<td width="33">
												<img src="image/cg5_1.jpg" width="21" height="28" />
											</td>
											<td width="158" class="d06">
												售后服务:010-66666666
											</td>
										</tr>
										<tr>
											<td width="33" colspan="2">
												<img src="image/tiao.jpg" />
											</td>
										</tr>
										<tr>
											<td width="33">
												<img src="image/cg5_1.jpg" width="21" height="28" />
											</td>
											<td width="158" class="d06">
												传&nbsp;&nbsp;&nbsp;&nbsp;真:010-12345678
											</td>
										</tr>
										<tr>
											<td width="33" colspan="2">
												<img src="image/tiao.jpg" />
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</TD>
					<TD vAlign=top width=3 bgColor=#e8e8e8></TD>
					<TD vAlign=top bgColor=#ffffff height=300>
						<table cellspacing="0" cellpadding="4" width="100%" align="center"
							border="0">
							<tbody>
								<th colspan="3" align="center">
									&nbsp;&nbsp;&nbsp;新闻列表
								</th>
								
								<tr>
				<td align="center">
					新闻编号
				</td>
				
				<td align="center">
					新闻标题
				</td>
				
				<td align="center">
					报道时间
				</td>
				
			</tr>

              <c:forEach items="${list}" var="nd">
              
              <tr>
				<td align="center">
					${ nd.newsID } 
				</td>
				
				<td align="center">
					<a href="DetailNews?newsID=${ nd.newsID }">${ nd.title }</a>

				</td>
				
				<td align="center">
					${ nd.writerDate }
				</td>
				
				</tr>
              
              </c:forEach>
              
  
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

							</tbody>

						</table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>


		<link href="image/css.css" rel="stylesheet" type="text/css" />
		<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
		<table width="800" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="800" height="29" align="center"
					background="image/d_r11_15.jpg"></td>
			</tr>
		</table>






	</BODY>
</HTML>


