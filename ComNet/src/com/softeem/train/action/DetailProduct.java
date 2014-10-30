package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.ProductDAOimpl;
import com.softeem.train.dao1.ProductDAO;
import com.softeem.train.dto.ProductDTO;

public class DetailProduct extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productID=request.getParameter("productID");
		ProductDAO pd=new ProductDAOimpl();
		ProductDTO pt=pd.findProductById(Integer.parseInt(productID));
		//System.out.println("-------"+pt.getProductID());
		
//		HttpSession s=request.getSession();
//		s.setAttribute("productID", pt.getProductID());
		
       request.setAttribute("pt",pt);
       request.getRequestDispatcher("detailProduct.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
