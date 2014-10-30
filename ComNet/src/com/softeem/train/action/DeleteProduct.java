package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.ProductDAOimpl;
import com.softeem.train.dao1.ProductDAO;

public class DeleteProduct extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productID=request.getParameter("productID");
		ProductDAO pd=new ProductDAOimpl();
		boolean flag=pd.deleteProduct(Integer.parseInt(productID));
		if(flag){
			request.setAttribute("succmsg", "<script type='text/javascript'>alert('删除成功！')</script>");
			request.getRequestDispatcher("ManageProduct?currentpage=0").forward(request, response);
		}
		else{
			request.setAttribute("errormsg", "<script type='text/javascript'>alert('未成功删除！')</script>");
			request.getRequestDispatcher("ManageProduct?currentpage=0").forward(request, response);
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

}
