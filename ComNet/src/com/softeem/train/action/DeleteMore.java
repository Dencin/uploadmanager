package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.AdminDAOimpl;
import com.softeem.train.dao1.AdminDAO;

public class DeleteMore extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] check=request.getParameterValues("item");
		AdminDAO ad=new AdminDAOimpl();
		for(int i=0;i<check.length;i++){
			System.out.println(i+":"+check[i]);
			int userID=Integer.parseInt(check[i]);
			ad.deleteById(userID);
		}
		request.setAttribute("succmsg", "<script language='javascript'>alert('É¾³ý³É¹¦£¡')</script>");
        request.getRequestDispatcher("showUserList").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

}
