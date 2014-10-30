package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.AdminDAOimpl;
import com.softeem.train.dao1.AdminDAO;
import com.softeem.train.dto.AdminDTO;

public class AddManager extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String password1=request.getParameter("confirmpassword");
		AdminDAO ad=new AdminDAOimpl();
		AdminDTO at=new AdminDTO();
		
		boolean bl=ad.valiReg(userName);
		if(bl){
			request.setAttribute("errormsg","<script language='javascript'>alert('�û����Ѵ���!')</script>");
		    request.getRequestDispatcher("admin/addManager.jsp").forward(request, response);
		}
		else if(userName.length()==0||password.length()==0){
			request.setAttribute("errormsg","<script language='javascript'>alert('�û��������벻��Ϊ��!')</script>");
		    request.getRequestDispatcher("admin/addManager.jsp").forward(request, response);
		}
		else if(!password.equals(password1)){
			request.setAttribute("errormsg","<script language='javascript'>alert('�����������벻һ�£�����������!')</script>");
		    request.getRequestDispatcher("admin/addManager.jsp").forward(request, response);
		}
		else{
		at.setUserName(userName);
		at.setPassword(password);
		at.setStatus(0);
		
		
		boolean flag=ad.addAdmin(at);
		if(flag){
			request.setAttribute("succmsg","<script language='javascript'>alert('��ӳɹ�!')</script>");
		    request.getRequestDispatcher("admin/addManager.jsp").forward(request, response);
			//response.sendRedirect("admin/addManager.jsp");
		}
		else{
			request.setAttribute("errormsg","<script type='text/javascript'>alert('���ʧ�ܣ�')</script>");
			request.getRequestDispatcher("admin/addManager.jsp").forward(request, response);
		}
		}

	}

}
