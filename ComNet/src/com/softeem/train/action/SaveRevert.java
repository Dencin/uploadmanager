package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.RevertDAOimpl;
import com.softeem.train.dao1.RevertDAO;
import com.softeem.train.dto.RevertDTO;


public class SaveRevert extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Date dt=new Date();
		request.setCharacterEncoding("utf-8");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		String writer=request.getParameter("writer");
		String content=request.getParameter("content");
		String writeDate=sdf.format(dt);
		
		int messageID=(Integer)request.getSession().getAttribute("messageID");
		//int messageID=Integer.parseInt(messageID1);
		//System.out.println(messageID);
		
		RevertDTO rt=new RevertDTO();
		rt.setWriter(writer);
		rt.setContent(content);
		rt.setMessageID(messageID);
		rt.setWriteDate(writeDate);
		
		RevertDAO rd=new RevertDAOimpl();
		boolean flag=rd.revert(rt);
		
		if(flag){
			request.setAttribute("succmsg","<script language='javascript'>alert('»Ø¸´³É¹¦!')</script>");
		    request.getRequestDispatcher("MessageBoard?currentpage=0").forward(request, response);
		}
		
		
		

	}

}
