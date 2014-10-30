package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.AdminDAOimpl;
import com.softeem.train.dao1.AdminDAO;

public class DeleteUser extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userID1=request.getParameter("userID");
		int userID=Integer.parseInt(userID1);
		AdminDAO ad=new AdminDAOimpl();
		boolean flag=ad.deleteById(userID);
		if(flag){
			request.setAttribute("succmsg", "<script type='text/javascript'>alert('É¾³ý³É¹¦£¡')</script>");
			request.getRequestDispatcher("showUserList").forward(request, response);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
