<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>品红公司</title>
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

</head>

<script type="text/javascript">

function openChat(){

	window.open("chat/index.jsp","","left=250   top=200   width=500   height=400");
}
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
<body onload="dateDemo()">

<table width="799" border="0" align="center" cellpadding="0"
	cellspacing="0">
	<tr>
		<td height="3" background="image/d.jpg"></td>
	</tr>
</table>
<table width="799" border="0" align="center" cellpadding="0"
	cellspacing="0">
	<tr>
		<td><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
			codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0"
			width="799" height="161" title="pinhong">
			<param name="movie" value="image/2.swf" />
			<param name="quality" value="high" />
			<embed src="image/2.swf" quality="high"
				pluginspage="http://www.macromedia.com/go/getflashplayer"
				type="application/x-shockwave-flash" width="799" height="161"></embed>
		</object></td>
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
		<td><img src="image/d_r3_c1.jpg" width="60" height="40" /><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><a
			href="index.jsp"><img src="image/d_r3_c5.jpg" width="64"
			height="40" border="0" /></a><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><a href="ShowProductList?currentpage=0"><img
			src="image/d_r3_c7.jpg" name="image1" width="94" height="40"
			border="0" id="image1" /></a><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><a href="NewsInfo?currentpage=0"><img
			src="image/d_r3_c8.jpg" width="93" height="40" border="0" /></a><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><a
			href="#" onclick="openChat()"><img src="image/d_r3_c9.jpg" width="95"
			height="40" border="0" /></a><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><a href="MessageBoard?currentpage=0" target="_blank"><img
			src="image/d_r3_c10.jpg" width="93" height="40" border="0" /></a><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><a href="login.jsp"><img src="image/d_r3_c13.jpg"
			width="85" height="40" border="0" /></a><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><img src="image/top_red.jpg" width="20"
			height="40" border="0" /><img src="image/d_r3_c25.jpg"
			width="36" height="40" /></td>
	</tr>
</table>
<table width="799" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="3" background="image/d.jpg"></td>
  </tr>
</table>
<table width="799" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="352"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td background="image/d02.jpg"><img src="image/d_r7_c1.jpg" width="101" height="35" /></td>
            <td align="right" background="image/d02.jpg"><img src="image/d_r7_c14.jpg" width="94" height="35" /></td>
          </tr>

         <tr>
            <td height="26" colspan="2"> &nbsp;<a href="DetailNews?newsID=14" class="dong06">索尼W55降价送卡&nbsp;&nbsp;&nbsp;<font color="#ff0000">[2012-08-10]</font></a></td>
          </tr>
          <tr>
            <td colspan="2"><img src="image/d03.jpg" width="352" height="1" /></td>
          </tr> 
          <tr>
            <td height="26" colspan="2"> &nbsp;<a href="DetailNews?newsID=9" class="dong06">理光R5不到二千&nbsp;&nbsp;&nbsp;<font color="#ff0000">[2012-08-11]</font></a></td>
          </tr>
          <tr>
            <td colspan="2"><img src="image/d03.jpg" width="352" height="1" /></td>
          </tr>
 <tr>
            <td height="26" colspan="2"> &nbsp;<a href="DetailNews?newsID=8" class="dong06">MP4关注度排行TOP10&nbsp;&nbsp;&nbsp;<font color="#ff0000">[2012-08-12]</font></a></td>
          </tr>
          <tr>
            <td colspan="2"><img src="image/d03.jpg" width="352" height="1" /></td>
          </tr>


		  
		  
          <tr>
            <td height="26" colspan="2"> &nbsp;<a href="DetailNews?newsID=7" class="dong06">单反与镜头组合&nbsp;&nbsp;&nbsp;<font color="#ff0000">[2012-08-12]</font></a></td>
          </tr>
          <tr>
            <td colspan="2"><img src="image/d03.jpg" width="352" height="1" /></td>
          </tr>


		  
		  
          <tr>
            <td height="26" colspan="2"> &nbsp;<a href="DetailNews?newsID=6" class="dong06">暑期各品牌最好卖的相机&nbsp;&nbsp;&nbsp;<font color="#ff0000">[2012-08-13]</font></a></td>
          </tr>
          <tr>
            <td colspan="2"><img src="image/d03.jpg" width="352" height="1" /></td>
          </tr>


		  
		  
          <tr>
            <td height="26" colspan="2"> &nbsp;<a href="DetailNews?newsID=15" class="dong06">暑期期间降价最猛八款数码相机&nbsp;&nbsp;&nbsp;<font color="#ff0000">[2012-08-14]</font></a></td>
          </tr>
          <tr>
            <td colspan="2"><img src="image/d03.jpg" width="352" height="1" /></td>
          </tr>


		  
		  
          <tr>
            <td height="26" colspan="2"> &nbsp;<a href="DetailNews?newsID=4" class="dong06">三星女性翻盖E428行货仅1180&nbsp;&nbsp;&nbsp;<font color="#ff0000">[2012-08-15]</font></a></td>
          </tr>
          <tr>
            <td colspan="2"><img src="image/d03.jpg" width="352" height="1" /></td>
          </tr>
           <tr>
            <td colspan="2" align="right"><a href="NewsInfo?currentpage=0"><img src="image/d_r11_c15.jpg" width="51" height="33" border="0" /></a></td>
          </tr>
          
        </table></td>
        <td align="right" valign="top"><table width="268" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td><a href="DetailProduct?productID=6"><img src="image/d_r11_5_r1_c1.jpg" width="268" height="63" border="0" /></a></td>
          </tr>
          <tr>
            <td><a href="DetailProduct?productID=4"><img src="image/d_r11_5_r3_c1.jpg" width="268" height="59" border="0" /></a></td>
          </tr>
          <tr>
            <td><a href="DetailProduct?productID=7"><img src="image/d_r11_5_r4_c1.jpg" width="268" height="61" border="0" /></a></td>
          </tr>
          <tr>
            <td><a href="DetailProduct?productID=1"><img src="image/d_r11_5_r5_c1.jpg" width="268" height="64" border="0" /></a></td>
          </tr>
        </table></td>
      </tr>
    </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td background="image/d_r11_8.jpg"><img src="image/d_r13_c1.jpg" width="160" height="27" /></td>
          <td align="right" background="image/d_r11_8.jpg"><a href="ShowProductList?currentpage=0"><img src="image/d_r13_c21.jpg" width="66" height="27" border="0" /></a></td>
        </tr>
      </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="25%" align="center"><a href="DetailProduct?productID=1"><img src="image/d_r11_10_r1_c1.jpg" width="143" height="112" border="0" /></a></td>
          <td width="25%" align="center"><a href="DetailProduct?productID=2"><img src="image/d_r11_10_r1_c8.jpg" width="142" height="112" border="0" /></a></td>
          <td width="25%" align="center"><a href="DetailProduct?productID=3"><img src="image/d_r11_10_r1_c16.jpg" width="141" height="112" border="0" /></a></td>
          <td width="25%" align="center"><a href="DetailProduct?productID=4"><img src="image/d_r11_10_r1_c22.jpg" width="142" height="112" border="0"/></a></td>
        </tr>
		 <tr>
          <td width="25%" align="center"><a href="DetailProduct?productID=5"><img src="image/d_r11_10_r1_c2.jpg" width="143" height="112" border="0" /></a></td>
          <td width="25%" align="center"><a href="DetailProduct?productID=6"><img src="image/d_r11_10_r1_c81.jpg" width="142" height="112" border="0" /></a></td>
          <td width="25%" align="center"><a href="DetailProduct?productID=7"><img src="image/d_r11_10_r1_c116.jpg" width="141" height="112" border="0" /></a></td>
          <td width="25%" align="center"><a href="DetailProduct?productID=8"><img src="image/d_r11_10_r1_c221.jpg" width="142" height="112" border="0"/></a></td>
        </tr>
    </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="25%" background="image/d_r11_11_r1_c15.jpg"><img src="image/d_r11_11_r1_c1.jpg" width="185" height="27" /></td>
          <td width="25%" background="image/d_r11_11_r1_c15.jpg">&nbsp;</td>
          <td width="25%" background="image/d_r11_11_r1_c15.jpg"><img src="image/d_r11_11_r1_c21.jpg" width="160" height="27" /></td>
          <td width="25%" align="right" background="image/d_r11_11_r1_c15.jpg"><a href="#"><img src="image/d_r11_11_r1_c30.jpg" width="63" height="27" border="0" /></a></td>
        </tr>
        <tr>
          <td width="50%" colspan="2" bgcolor="#FCFCFC"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="28" height="29"><img src="image/d_r11_12_r1_c1.jpg" width="28" height="32" /></td>
              <td width="100" align="center" class="d06" style="font-weight: bold">&nbsp;业务专线：</td>
              <td class="d06" style="font-weight: bold">010-88888888</td>
            </tr>
            <tr>
              <td width="28" height="29"><img src="image/d_r11_12_r1_c1.jpg" width="28" height="32" /></td>
              <td width="100" align="center" class="d06">&nbsp;<span style="font-weight: bold">售后服务：</span></td>
              <td class="d06" style="font-weight: bold">010-66666666</td>
            </tr>
            <tr>
              <td width="28" height="29"><img src="image/d_r11_12_r1_c1.jpg" width="28" height="32" /></td>
              <td width="100" align="center" class="bold">&nbsp;<span class="d06" style="font-weight: bold">传&nbsp;&nbsp;&nbsp;&nbsp;真：</span></td>
              <td class="d06" style="font-weight: bold">010-88888888</td>
            </tr>
          </table></td>
          <td width="50%" colspan="3" bgcolor="#FCFCFC"><table width="287" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
              <td width="97" height="47" align="center"><img src="image/f1.gif" width="90" height="33" /></td>
              <td width="97" height="47" align="center"><img src="image/f2.gif" width="88" height="33" /></td>
              <td width="97" height="47" align="center"><img src="image/f3.gif" width="90" height="33" /></td>
            </tr>
            <tr>
              <td width="97" height="47" align="center"><img src="image/d_r11_13_r6_c13.jpg" width="90" height="33" /></td>
              <td width="97" height="47" align="center"><img src="image/d_r11_13_r1_c1.jpg" width="90" height="33" /></td>
              <td width="97" height="47" align="center"><img src="image/d_r11_13_r1_c7.jpg" width="88" height="33" /></td>
            </tr>
          </table></td>
        </tr>
      </table></td>
    <td width="175" valign="top" bgcolor="#FCFCFC"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td valign="top"><a href="cgal.asp"><img src="image/d_r11_6.jpg" width="175" height="42" border="0" /></a></td>
      </tr>
      <tr>
        <td height="590">
  <!-- 指向链接图片url -->
<div id=demo style=overflow:hidden;height:600;width:180;background:#214984;color:#ffffff>
<div id=demo1>
<!-- 定义图片 -->

         <img src="image/d_r11_10_r1_c1.jpg" width="100%" height="107" border="0" align="middle"/>
             
             <img src="image/d_r11_10_r1_c8.jpg" width="100%" height="107" border="0" align="middle"/>
             
             <img src="image/d_r11_10_r1_c16.jpg" width="100%" height="107" border="0" align="middle"/>
             
             <img src="image/d_r11_10_r1_c22.jpg" width="100%" height="107" border="0" align="middle"/>
             
             <img src="image/d_r11_10_r1_c2.jpg" width="100%" height="107" border="0" align="middle"/>
             
             <img src="image/d_r11_10_r1_c81.jpg" width="100%" height="107" border="0" align="middle"/>
             
             <img src="image/d_r11_10_r1_c116.jpg" width="100%" height="107" border="0" align="middle"/>
             
             <img src="image/d_r11_10_r1_c221.jpg" width="100%" height="107" border="0" align="middle"/>
</div>
<div id=demo2></div>
       
      </div>   
         
         <script>
var speed=30;
demo2.innerHTML=demo1.innerHTML;
demo.scrollTop=demo.scrollHeight;
function Marquee(){
if(demo1.offsetTop-demo.scrollTop>=0)
demo.scrollTop+=demo2.offsetHeight;
else{
demo.scrollTop--;
}
}
var MyMar=setInterval(Marquee,speed);
demo.onmouseover=function() {clearInterval(MyMar)}
demo.onmouseout=function() {MyMar=setInterval(Marquee,speed);}
</script>

</td>
      </tr>
    </table></td>
  </tr>
</table>

<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="800" height="29" align="center" background="image/d_r11_15.jpg">
   <img src="image/QQonline.gif">(小Q报时):
<span id="showdate" width="20%" background="image/1.jpg"></span>
    </td>
  </tr>
</table>
</body>
</html>
