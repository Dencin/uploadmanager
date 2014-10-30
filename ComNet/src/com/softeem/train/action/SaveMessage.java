package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.MessageDAOimpl;
import com.softeem.train.dao.impl.NewsDAOimpl;
import com.softeem.train.dao1.MessageDAO;
import com.softeem.train.dao1.NewsDAO;
import com.softeem.train.dto.MessageDTO;
import com.softeem.train.dto.NewsDTO;

public class SaveMessage extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);

	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date dt=new Date();
		request.setCharacterEncoding("utf-8");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String writeDate=sdf.format(dt);
		String writer=request.getParameter("writer");
		MessageDTO mt=new MessageDTO();
		mt.setTitle(title);
		mt.setContent(content);
		mt.setWriteDate(writeDate);
		mt.setWriter(writer);
		MessageDAO md=new MessageDAOimpl();
		boolean flag=md.addMessage(mt);
		if(flag){
			request.setAttribute("succmsg","<script language='javascript'>alert('添加成功!')</script>");
		    request.getRequestDispatcher("MessageBoard?currentpage=0").forward(request, response);
		}
		else{
			request.setAttribute("errormsg","<script type='text/javascript'>alert('添加失败！')</script>");
			request.getRequestDispatcher("MessageBoard?currentpage=0").forward(request, response);
		}
		
		
	

	}

}
