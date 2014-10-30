package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.AdminDAOimpl;
import com.softeem.train.dao.impl.BuyProductDAOimpl;
import com.softeem.train.dao1.AdminDAO;
import com.softeem.train.dao1.BuyProductDAO;
import com.softeem.train.dto.AdminDTO;
import com.softeem.train.dto.BuyProduct;

public class showBuyproduct extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	     BuyProductDAO pd=new BuyProductDAOimpl();
		List<BuyProduct> list=pd.allbuyProduct();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("buy.jsp").forward(request, response);

	

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
doGet(request,response);
	}

}
