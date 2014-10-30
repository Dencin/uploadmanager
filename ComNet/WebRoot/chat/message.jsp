<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*" errorPage="" %>

<HTML><HEAD><TITLE>message</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<META http-equiv=pragma content=no-cache>
<META http-equiv=cache-control content=no-cache>
<META http-equiv=refresh content=3><LINK href="style/css.css" type=text/css 
rel=stylesheet>
<META content="MSHTML 6.00.5730.13" name=GENERATOR></HEAD>
<BODY onload=scroll(0,9999)>
<TABLE cellSpacing=0 cellPadding=0 width="100%" align=left border=0>
  <TBODY>
  <%

 List<String> lists=(List)application.getAttribute("MESSAGE");
  if(lists==null)return;
  for(String me:lists){

  %>
     <img src="../image/iboy.gif" border=0>
   <%=me %><br> <br>
  <%} %>
  
  </TBODY></TABLE></BODY></HTML>

