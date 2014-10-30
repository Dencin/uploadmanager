package com.softeem.train.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.softeem.train.dao1.MessageDAO;
import com.softeem.train.db.util.DBManager;
import com.softeem.train.dto.MessageDTO;
import com.softeem.train.dto.NewsDTO;

public class MessageDAOimpl implements MessageDAO {

	public List<MessageDTO> allMessages(int currentpage) {
		List<MessageDTO> list=new ArrayList<MessageDTO>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select top 5 * from MESSAGE where messageID not in(select top "+(currentpage*5)+" messageID from MESSAGE order by messageID ) order by messageID";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				MessageDTO md = new MessageDTO();
				// 将数据风封装到md对象中
				md.setMessageID(rs.getInt("messageID"));
				md.setTitle(rs.getString("title"));
				md.setContent(rs.getString("content"));
				md.setWriter(rs.getString("writer"));
				md.setWriteDate(rs.getString("writeDate"));
				md.setCount(rs.getInt("count"));
				
				// list在存放数据的时候，存放的是引用地址
				list.add(md);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean addMessage(MessageDTO mt) {
		boolean flag=false;
		Connection conn = null;
		PreparedStatement ps= null;
		
		try {
		conn=DBManager.getConn();
		String sql="insert into MESSAGE(title,content,writer,writeDate) values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,mt.getTitle());
			ps.setString(2,mt.getContent());
			ps.setString(3,mt.getWriter());
			ps.setString(4,mt.getWriteDate());
			flag=!ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return flag;
	}

	public int countpage() {

		int countpage = 0;
		// 相关操作
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select count(*) from MESSAGE";
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

	public List<MessageDTO> allMessages1(int currentpage) {
		List<MessageDTO> list=new ArrayList<MessageDTO>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select top 5 * from MESSAGE where messageID in(select top "+(currentpage*5)+" messageID from MESSAGE order by messageID ) order by messageID";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				MessageDTO md = new MessageDTO();
				// 将数据风封装到md对象中
				md.setMessageID(rs.getInt("messageID"));
				md.setTitle(rs.getString("title"));
				md.setContent(rs.getString("content"));
				md.setWriter(rs.getString("writer"));
				md.setWriteDate(rs.getString("writeDate"));
				md.setCount(rs.getInt("count"));
				
				// list在存放数据的时候，存放的是引用地址
				list.add(md);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public MessageDTO findInfoById(int messageID) {
		MessageDTO mt=new MessageDTO();
		Connection conn = null;
		PreparedStatement ps= null;
		ResultSet rs=null;
		try {
		
		conn=DBManager.getConn();
		String sql="select * from MESSAGE where messageID=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,messageID);
			rs=ps.executeQuery();
			while(rs.next()){
				mt.setMessageID(messageID);
				mt.setTitle(rs.getString("title"));
				mt.setContent(rs.getString("content"));
				mt.setWriter(rs.getString("writer"));
				mt.setWriteDate(rs.getString("writeDate"));
				mt.setCount(rs.getInt("count"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mt;
	}

}
