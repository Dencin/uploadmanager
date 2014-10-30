package com.softeem.train.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.softeem.train.dao.impl.ProductDAOimpl;
import com.softeem.train.dao1.ProductDAO;
import com.softeem.train.dto.ProductDTO;

public class DealUpdate extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
		DiskFileItemFactory factory=new DiskFileItemFactory();
		factory.setSizeThreshold(2*5*1024);
		factory.setRepository(new File("d:/file"));
		 ServletFileUpload sfu=new ServletFileUpload(factory);
		 
		 ProductDTO pd=new ProductDTO();
			List<FileItem> list=sfu.parseRequest(request);
			String path=this.getServletContext().getRealPath("/image");
                for(FileItem fileitem:list){
//				String info=fileitem.getString();
//				String filename1=fileitem.getName();
//				System.out.println(filename1+"--");
//				System.out.println(info+"**");
                	//System.out.println("进来了");
				if(fileitem.isFormField()){
					
//					System.out.println("------"+fileitem.getFieldName());
//					System.out.println("******"+fileitem.getString());
//					String filename1=fileitem.getFieldName();
//					String content=fileitem.getString();
					if(fileitem.getFieldName().equals("serialNumber")){
						String serialNumber=fileitem.getString();
						//System.out.println("-----");
						pd.setSerialNumber(serialNumber);
					}
//					
					if(fileitem.getFieldName().equals("name")){
						String name=fileitem.getString();
						//System.out.println("****");
						pd.setName(name);
						
					}
//					
					if(fileitem.getFieldName().equals("brand")){
						String brand=fileitem.getString();
						pd.setBrand(brand);
					}
					
					if(fileitem.getFieldName().equals("model")){
						String model=fileitem.getString();
						pd.setModel(model);
					}
					
					if(fileitem.getFieldName().equals("price")){
						String price=fileitem.getString();
						pd.setPrice(price);
					}
					
					if(fileitem.getFieldName().equals("description")){
						String description=fileitem.getString();
						pd.setDescription(description);
					}
				}else{
					String picture=fileitem.getName();
					System.out.println(picture);
					long size=fileitem.getSize();
					if(picture==null||"".equals(picture) && size==0){
						continue;
					}
					File file1=new File(path);
					if(!file1.exists()){
						file1.mkdirs();
					}
					pd.setPicture(picture);
					//上传
					fileitem.write(new File(path,picture));
				}
				
				
				
				
			}
//                System.out.println("#####"+pd.getPrice());
//                System.out.println("*****"+pd.getName());
//                System.out.println("&&&&&"+pd.getProductID());
//                String productID=request.getParameter("productId");
//                System.out.print(productID);
//                pd.setProductID(Integer.parseInt(productID));
				ProductDAO pa=new ProductDAOimpl();
				boolean flag=pa.updateProduct(pd);
				System.out.println(flag);
				if(flag){
					request.setAttribute("succmsg","<script language='javascript'>alert('修改成功!')</script>");
				    request.getRequestDispatcher("ManageProduct?currentpage=0").forward(request, response);
				}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	

	}

}
