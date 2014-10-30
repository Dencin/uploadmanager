package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.MessageDAOimpl;
import com.softeem.train.dao1.MessageDAO;
import com.softeem.train.dto.MessageDTO;

public class MessageBoard extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String currentpage=request.getParameter("currentpage");
		MessageDAO md=new MessageDAOimpl();
		List<MessageDTO> list=md.allMessages(Integer.parseInt(currentpage));
		
		int countpage=md.countpage();
		request.setAttribute("countpage", countpage);
		
		int cp=Integer.parseInt(currentpage)+1;
		request.setAttribute("currentpage", cp);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("messageBoard.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

}
