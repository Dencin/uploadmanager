package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.softeem.train.dao.impl.MessageDAOimpl;
import com.softeem.train.dao.impl.RevertDAOimpl;
import com.softeem.train.dao1.MessageDAO;
import com.softeem.train.dao1.RevertDAO;
import com.softeem.train.dto.MessageDTO;
import com.softeem.train.dto.RevertDTO;

public class RevertMessage extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String messageID=request.getParameter("messageID");
		MessageDAO md=new MessageDAOimpl();
		MessageDTO mt=md.findInfoById(Integer.parseInt(messageID));
		
		RevertDAO rd=new RevertDAOimpl();
		RevertDTO rt=rd.findInfoById(Integer.parseInt(messageID));
		
		request.setAttribute("mt", mt);
		request.setAttribute("rt", rt);
		HttpSession s=request.getSession();
		s.setAttribute("messageID", Integer.parseInt(messageID));
		request.getRequestDispatcher("revertMessage.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
