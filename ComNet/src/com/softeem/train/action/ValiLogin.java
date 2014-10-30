package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.softeem.train.dao.impl.AdminDAOimpl;
import com.softeem.train.dao1.AdminDAO;
import com.softeem.train.dto.AdminDTO;

public class ValiLogin extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		if(userName.length()!=0&&password.length()!=0){
			AdminDAO ad=new AdminDAOimpl();
			
			AdminDTO admin=new AdminDTO();
			admin.setUserName(userName);
			admin.setPassword(password);
			
			String vcode=(String)request.getSession().getAttribute("vcode");
			String txtValidate=request.getParameter("txtValidate");
			if(!vcode.equals(txtValidate)){
				request.setAttribute("errormsg","<script language='javascript'>alert('验证码输入有误!')</script>");
				request.getRequestDispatcher("chat/index.jsp").forward(request, response);
				
			}
			else if(txtValidate.length()==0){
				request.setAttribute("errormsg","<script language='javascript'>alert('验证码不能为空!')</script>");
				request.getRequestDispatcher("chat/index.jsp").forward(request, response);
				
			}
			else{
			
			boolean flag=ad.valiLogin(admin);
			if(flag){
				HttpSession s=request.getSession();
				s.setAttribute("userName", userName);
				request.getRequestDispatcher("chat/main.jsp").forward(request, response);
				
			}
			else{
				//当登陆失败的时候，给予相应的提示
				//重定向--客户端跳转，在url栏重新做了请求 req和resp被清空
//				req.setAttribute("errormsg", "用户名或者密码错误！");
				 
				//服务器跳转
				request.setAttribute("errormsg","<script language='javascript'>alert('用户名或密码错误!')</script>");
				request.getRequestDispatcher("chat/index.jsp").forward(request, response);
			}
			
		}
		}
		else{
			request.setAttribute("errormsg","<script language='javascript'>alert('用户名或密码不能为空!')</script>");
			//如果用response跳转，当跳转后哦，我们的请求对象变换了，
//			所以前面设置的数据，也就消亡了--称为重定向
//			resp.sendRedirect("login.jsp");
			//再次跳转
			//通过这种方式，我们将request和response对象通过forward一起发送过去
			request.getRequestDispatcher("chat/index.jsp").forward(request, response);
		}

	}

}
