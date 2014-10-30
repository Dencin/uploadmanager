package com.softeem.train.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.softeem.train.dao1.ProductDAO;
import com.softeem.train.db.util.DBManager;
import com.softeem.train.dto.NewsDTO;
import com.softeem.train.dto.ProductDTO;

public class ProductDAOimpl implements ProductDAO {

	public boolean addProduct(ProductDTO pd) {
		boolean flag=false;
		Connection conn = null;
		PreparedStatement ps= null;
		try {
		conn=DBManager.getConn();
		String sql="insert into PRODUCT(serialNumber,name,brand,model,price,picture,description) values(?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,pd.getSerialNumber());
			ps.setString(2,pd.getName());
			ps.setString(3,pd.getBrand());
			ps.setString(4,pd.getModel());
			ps.setString(5,pd.getPrice());
			ps.setString(6,pd.getPicture());
			ps.setString(7,pd.getDescription());
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return flag;
	}

	public List<ProductDTO> allProducts(int currentpage) {
		//System.out.println("*********");
		List<ProductDTO> list=new ArrayList<ProductDTO>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select top 5 * from PRODUCT where productID not in(select top "+(currentpage*5)+" productID from PRODUCT order by productID ) order by productID";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ProductDTO pd = new ProductDTO();
				// 将数据风封装到emp对象中
				pd.setProductID(rs.getInt("productID"));
				pd.setSerialNumber(rs.getString("serialNumber"));
				pd.setName(rs.getString("name"));
				pd.setBrand(rs.getString("brand"));
				pd.setModel(rs.getString("model"));
				pd.setPrice(rs.getString("price"));
				pd.setPicture(rs.getString("picture"));
				pd.setDescription(rs.getString("description"));
				// list在存放数据的时候，存放的是引用地址
				list.add(pd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int countpage() {

		int countpage = 0;
		// 相关操作
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select count(*) from PRODUCT";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				countpage = rs.getInt(1);
			}
			//
			if (countpage % 5 != 0) {
				countpage = countpage / 5 + 1;
			} else {
				countpage = countpage / 5;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return countpage;
	
		
		
	}

	public List<ProductDTO> allProducts1(int currentpage) {
		//System.out.println("*********");
		List<ProductDTO> list=new ArrayList<ProductDTO>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select top 5 * from PRODUCT where productID in(select top "+(currentpage*5)+" productID from PRODUCT order by productID ) order by productID";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ProductDTO pd = new ProductDTO();
				// 将数据风封装到emp对象中
				pd.setProductID(rs.getInt("productID"));
				pd.setSerialNumber(rs.getString("serialNumber"));
				pd.setName(rs.getString("name"));
				pd.setBrand(rs.getString("brand"));
				pd.setModel(rs.getString("model"));
				pd.setPrice(rs.getString("price"));
				pd.setPicture(rs.getString("picture"));
				pd.setDescription(rs.getString("description"));
				// list在存放数据的时候，存放的是引用地址
				list.add(pd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	
	}

	public ProductDTO findProductById(int productID) {
		ProductDTO pt=new ProductDTO();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
		conn=DBManager.getConn();
		String sql="select * from PRODUCT where productID=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, productID);
			rs=ps.executeQuery();
			while(rs.next()){
				pt.setProductID(productID);
				pt.setSerialNumber(rs.getString("serialNumber"));
				pt.setName(rs.getString("name"));
				pt.setBrand(rs.getString("brand"));
				pt.setModel(rs.getString("model"));
				pt.setPrice(rs.getString("price"));
				pt.setPicture(rs.getString("picture"));
				pt.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//System.out.println("*****"+pt.getProductID());
		return pt;
	}

	public boolean updateProduct(ProductDTO pd) {
		boolean flag=false;
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
		conn=DBManager.getConn();
		String sql="update PRODUCT set name=?,brand=?,model=?,price=?,picture=?,description=? where serialNumber=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, pd.getName());
			ps.setString(2, pd.getBrand());
			ps.setString(3, pd.getModel());
			ps.setString(4, pd.getPrice());
			ps.setString(5, pd.getPicture());
			ps.setString(6, pd.getDescription());
			ps.setString(7, pd.getSerialNumber());
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		return flag;
	}

	public boolean deleteProduct(int productID) {
	     boolean flag=false;
	     Connection conn=null;
			PreparedStatement ps=null;
		    
			try {
			conn=DBManager.getConn();
			String sql="delete from PRODUCT where productID=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(1,productID);
				flag=!ps.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return flag;
		}

}
