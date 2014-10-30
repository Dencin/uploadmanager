<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>

	<head>
	 <base href="<%=basePath%>">
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>管理员-添加</title>
		<link rel="stylesheet" type="text/css" href="css/style_admin.css">
		
	</head>
	
	
	<script type="text/javascript">
	var xmlreq;
	function createreq(){
	//创建对象之前需要先判断浏览器内核，
	//然后确定创建哪种类型的对象 
	if(window.ActiveXObject){
	//微软内核 
	xmlreq=new ActiveXObject("Microsoft.XMLHTTP")
	}
	else if(window.XMLHttpRequest){
    //火狐
	xmlreq=new XMLHttpRequest()
	}
	else{
	alert("暂不支持 ")
	}
	
	}
	
	
	function valiname(){
	var userName=document.getElementById("userName").value;
	 if(userName.length==0){
        alert("用户名不能为空")
        }
        else{

	//现在进行验证
	//因为准备用ajax 所以先准备一个XMLHttpRequest对象
	//调用createreq方法创建对象
	createreq();
	//准备信息
	//打开一个连接,准备发送请求信息
	var url="ValiNameAction?userName="+userName;
	xmlreq.open("post",url,true) 
	//确定每个状态需要做的处理
	//ajax处理的时候一共有五种状态
	//0:未初始化 1：数据未读取 2:数据交互 3：请求完成 4：获取响应 
	//执行到4 表示结束  
	//callback是处理方法的方法名,这里的方法调用比较特殊不需要括号 
	xmlreq.onreadystatechange=callback;
	//发送请求
	xmlreq.send(null);
	
	}
	}
	function callback(){
	//alert("回调函数：callback")
	if(xmlreq.readyState==4){
	var text=xmlreq.responseTEXT;
	alert(text);
	if(text=="available"){
	//我们需要将信息显示到页面 
	document.getElementById("lb").innerHTML="<font color='blue'>*用户名可用</font>"
	}
	else{

	document.getElementById("lb").innerHTML="<font color='red'>*用户名已存在</font>"
	}
	}
	}
	function valips(){
		 var p1=document.getElementById("password").value
		 if(p1.length==0){
		  ///alert("密码不能为空!");
		}
		}
		
		function valips1(){
        var p1=document.getElementById("password").value
        var p2=document.getElementById("password1").value
        //alert(p1+" "+p2);

        //在javascript中，比较用"=="不能用equals,因为这里面压根就没这方法
        if(p1!=p2){
        alert("两次密码输入不一致，请重新输入！")
        }
        
        }
        
        
        
	</script>
	
	

	<body>
		<form name="form1" action="AddManager" method="post">
			<table cellspacing="1" cellpadding="4" width="100%"
				class="tableborder" id="table3">

				<tr>
				<td colspan="2" align="center"><font color="red">
						<label>${ succmsg }</label></font>
					</td>
				</tr>
				
				<input type="hidden" name="action" value="save" />
				<tr>
				<td><label id="msg">${ errormsg }</label></td>
				</tr>
				<tr>
					<td colspan="12" class="header">
						管理员-添加
					</td>
				</tr>
				<tr>
					<td class="altbg1">
						管理员名称：
					</td>
					<td class="altbg2" colspan="11">
						<input type="text" name="userName" size="34" onblur="valiname()"><label id="lb"></label>
					</td>
				</tr>
				<tr>
					<td class="altbg1">
						密&nbsp; 码：
					</td>
					<td class="altbg2" colspan="11">
						<input type="password" name="password" size="34" onblur="valips()"><font color="red" size=2>*数字或字母，6—16位</font>
					</td>
				</tr>
				<tr>
					<td class="altbg1">
						确认密码：
					</td>
					<td class="altbg2" colspan="11">
						<input name="confirmpassword" size="34" type="password" onblur="valips1()">
						<font color="red" size=2>*请确保两次输入密码一致</font>
					</td>
					
				</tr>


				<tr>
					<td class="altbg1">
					</td>
					<td class="altbg2" colspan="11">
						<input type="submit" value="提交" name="B1"
							onClick="return fun_check_form();">
						&nbsp;
						<input type="reset" value="重置" name="B2">
					</td>
				</tr>

			</table>
		</form>
	</body>

</html>