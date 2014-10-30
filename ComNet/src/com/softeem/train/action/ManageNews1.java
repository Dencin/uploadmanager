package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.NewsDAOimpl;
import com.softeem.train.dao1.NewsDAO;
import com.softeem.train.dto.NewsDTO;

public class ManageNews1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("**doget**");
		String currentpage=request.getParameter("currentpage");
		NewsDAO nd=new NewsDAOimpl();
		List<NewsDTO> list=nd.allNews1(Integer.parseInt(currentpage));
		
		int countpage=nd.countpage();
		request.setAttribute("countpage", countpage);
		
		int cp=Integer.parseInt(currentpage)-1;
		request.setAttribute("currentpage", cp);
		
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("admin/manageNews.jsp").forward(request, response);
        //System.out.println(cp);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

}
