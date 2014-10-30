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
				request.setAttribute("errormsg","<script language='javascript'>alert('��֤����������!')</script>");
				request.getRequestDispatcher("chat/index.jsp").forward(request, response);
				
			}
			else if(txtValidate.length()==0){
				request.setAttribute("errormsg","<script language='javascript'>alert('��֤�벻��Ϊ��!')</script>");
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
				//����½ʧ�ܵ�ʱ�򣬸�����Ӧ����ʾ
				//�ض���--�ͻ�����ת����url�������������� req��resp�����
//				req.setAttribute("errormsg", "�û��������������");
				 
				//��������ת
				request.setAttribute("errormsg","<script language='javascript'>alert('�û������������!')</script>");
				request.getRequestDispatcher("chat/index.jsp").forward(request, response);
			}
			
		}
		}
		else{
			request.setAttribute("errormsg","<script language='javascript'>alert('�û��������벻��Ϊ��!')</script>");
			//�����response��ת������ת��Ŷ�����ǵ��������任�ˣ�
//			����ǰ�����õ����ݣ�Ҳ��������--��Ϊ�ض���
//			resp.sendRedirect("login.jsp");
			//�ٴ���ת
			//ͨ�����ַ�ʽ�����ǽ�request��response����ͨ��forwardһ���͹�ȥ
			request.getRequestDispatcher("chat/index.jsp").forward(request, response);
		}

	}

}
