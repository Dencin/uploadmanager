package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.AdminDAOimpl;
import com.softeem.train.dao1.AdminDAO;

public class ValiNameAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uname=request.getParameter("userName");
		
		AdminDAO ad=new AdminDAOimpl();
		boolean bl=ad.valiReg(uname);
		
		PrintWriter out=response.getWriter();
		if(bl){
			//System.out.println("�û�������");
			out.print("unavailable");
		}else{
			//System.out.println("����");
			out.print("available");
		}
		//out��ˢ�� ������Ҫ�ֶ�ˢ��
		out.flush();
		out.close();

	}

}
