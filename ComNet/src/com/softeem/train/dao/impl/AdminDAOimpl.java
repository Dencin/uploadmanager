package com.softeem.train.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.softeem.train.dao1.AdminDAO;
import com.softeem.train.db.util.DBManager;
import com.softeem.train.dto.AdminDTO;

public class AdminDAOimpl implements AdminDAO {

	public boolean valiLogin(AdminDTO admin) {
		boolean flag=false;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
		conn=DBManager.getConn();
		String sql="select count(*) from USERS where userName=? and password=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, admin.getUserName());
			ps.setString(2, admin.getPassword());
			rs=ps.executeQuery();
			int a=0;
			while(rs.next()){
				a=rs.getInt(1);
			}
			if(a>0){
			flag=true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean addAdmin(AdminDTO at) {
	
		boolean flag=false;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
		conn=DBManager.getConn();
		String sql="insert into USERS(userName,password,status) values(?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, at.getUserName());
			ps.setString(2,at.getPassword());
			ps.setInt(3,at.getStatus());
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public List<AdminDTO> allAdmin() {
		List<AdminDTO> list=new ArrayList<AdminDTO>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
		conn=DBManager.getConn();
		String sql="select * from USERS";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				AdminDTO at=new AdminDTO();
				at.setUserID(rs.getInt("userID"));
				at.setUserName(rs.getString("userName"));
				at.setPassword(rs.getString("password"));
				at.setStatus(rs.getInt("status"));
				list.add(at);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean deleteById(int userID) {
     boolean flag=false;
     Connection conn=null;
		PreparedStatement ps=null;
	    
		try {
		conn=DBManager.getConn();
		String sql="delete from USERS where userID=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,userID);
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean valiReg(String userName) {
		boolean flag=false;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
		conn=DBManager.getConn();
		String sql="select count(*) from USERS where userName=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,userName);
			rs=ps.executeQuery();
			int a=0;
			while(rs.next()){
				a=rs.getInt(1);
			}
			if(a>0){
			flag=true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
