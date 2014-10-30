package com.softeem.train.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.softeem.train.dao1.BuyProductDAO;
import com.softeem.train.db.util.DBManager;
import com.softeem.train.dto.AdminDTO;
import com.softeem.train.dto.BuyProduct;

public class BuyProductDAOimpl implements BuyProductDAO {

	public boolean addProduct(BuyProduct bpd) {
		boolean flag=false;
		Connection conn = null;
		PreparedStatement ps= null;
		
		try {
		conn=DBManager.getConn();
		String sql="insert into BUYPRODUCT(serialNumber,productName,price) values(?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,bpd.getSerialNumber());
			ps.setString(2,bpd.getProductName());
			ps.setString(3,bpd.getPrice());
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return flag;
	}

	public List<BuyProduct> allbuyProduct() {
		List<BuyProduct> list=new ArrayList<BuyProduct>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
		conn=DBManager.getConn();
		String sql="select * from BUYPRODUCT";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				BuyProduct bpd=new BuyProduct();
				bpd.setSerialNumber(rs.getString("serialNumber"));
				bpd.setProductName(rs.getString("productName"));
				bpd.setPrice(rs.getString("price"));
				list.add(bpd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
