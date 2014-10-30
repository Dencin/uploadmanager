package com.softeem.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.train.dao.impl.BuyProductDAOimpl;
import com.softeem.train.dao.impl.ProductDAOimpl;
import com.softeem.train.dao1.BuyProductDAO;
import com.softeem.train.dao1.ProductDAO;
import com.softeem.train.dto.BuyProduct;
import com.softeem.train.dto.ProductDTO;

public class BuyAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productID1=request.getParameter("productID");
		int productID=Integer.parseInt(productID1);
		ProductDAO pd=new ProductDAOimpl();
		ProductDTO pt=pd.findProductById(productID);
		//System.out.println("-------"+pt.getProductID());
		
//		HttpSession s=request.getSession();
//		s.setAttribute("productID", pt.getProductID());
		String serialNumber=pt.getSerialNumber();
		String productName=pt.getName();
		String price=pt.getPrice();
		
		BuyProduct bp=new BuyProduct();
		bp.setSerialNumber(serialNumber);
		bp.setProductName(productName);
		bp.setPrice(price);
		
		BuyProductDAO bpd=new BuyProductDAOimpl();
		boolean flag=bpd.addProduct(bp);
		if(flag){
			request.setAttribute("succmsg","<script language='javascript'>alert('¹ºÂò³É¹¦!')</script>");
		    request.getRequestDispatcher("showBuyproduct").forward(request, response);
			
		}
		
		System.out.println(pt.getName());
//       request.setAttribute("pt",pt);
//       request.getRequestDispatcher("Buy").forward(request, response);
		
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

}
