package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.NewsDAOimpl;
import com.softeem.train.dao1.NewsDAO;
import com.softeem.train.dto.NewsDTO;

public class DetailNews extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newsID1=request.getParameter("newsID");
		int newsID=Integer.parseInt(newsID1);
		
		NewsDAO nd=new NewsDAOimpl();
		NewsDTO nt=nd.newsByID(newsID);
		
		request.setAttribute("news", nt);
		request.getRequestDispatcher("detailNews.jsp").forward(request, response);
		
		
		
//		System.out.println("hshshshsh");
//		if("11".equals(newsID)){
//			response.sendRedirect("detailNews.jsp");
//		}
//		else if("10".equals(newsID)){
//			response.sendRedirect("detailNews1.jsp");
//		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    doGet(request,response);
	}

}
