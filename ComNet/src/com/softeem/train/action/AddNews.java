package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.NewsDAOimpl;
import com.softeem.train.dao1.NewsDAO;
import com.softeem.train.dto.NewsDTO;

public class AddNews extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date dt=new Date();
		request.setCharacterEncoding("utf-8");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String writerDate=sdf.format(dt);
		NewsDTO nt=new NewsDTO();
		nt.setTitle(title);
		nt.setContent(content);
		nt.setWriterDate(writerDate);
		NewsDAO nd=new NewsDAOimpl();
		boolean flag=nd.addNews(nt);
		if(flag){
			request.setAttribute("succmsg","<script language='javascript'>alert('添加成功!')</script>");
		    request.getRequestDispatcher("admin/addNews.jsp").forward(request, response);
		}
		else{
			request.setAttribute("errormsg","<script type='text/javascript'>alert('添加失败！')</script>");
			request.getRequestDispatcher("admin/addNews.jsp").forward(request, response);
		}
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

}
