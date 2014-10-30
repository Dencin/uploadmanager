package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.NewsDAOimpl;
import com.softeem.train.dao1.NewsDAO;

public class DeleteNews extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newsID1=request.getParameter("newsID");
		int newsID=Integer.parseInt(newsID1);
		NewsDAO nd=new NewsDAOimpl();
		boolean flag=nd.deleteByID(newsID);
		if(flag){
			request.setAttribute("succmsg", "<script type='text/javascript'>alert('É¾³ý³É¹¦')(</script>");
			request.getRequestDispatcher("ManageNews").forward(request, response);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

}
